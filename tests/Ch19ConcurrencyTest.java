import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/** Chapter 19 tests, one class per exercise. */

class Ex19_1Test {
    public static void run() {
        try {
            Check.eq(Ch19Concurrency.parallelSquares(new int[] {1, 2, 3}), new long[] {1, 4, 9});
            Check.eq(Ch19Concurrency.parallelSquares(new int[0]), new long[0]);
            int[] many = new int[50];
            long[] want = new long[50];
            for (int i = 0; i < 50; i++) {
                many[i] = i;
                want[i] = (long) i * i;
            }
            Check.eq(Ch19Concurrency.parallelSquares(many), want);
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }
}

class Ex19_2Test {
    public static void run() {
        try {
            Check.eq(Ch19Concurrency.pipelineTotal(new int[] {4, 5, 6}), 15L);
            Check.eq(Ch19Concurrency.pipelineTotal(new int[0]), 0L);
            int[] many = new int[10_000];
            for (int i = 0; i < many.length; i++) many[i] = i;
            Check.eq(Ch19Concurrency.pipelineTotal(many), 49_995_000L);
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }
}

class Ex19_3Test {
    public static void run() {
        try {
            Check.eq(Ch19Concurrency.poolMap((Integer x) -> x * 10, List.of(1, 2, 3), 2), List.of(10, 20, 30));
            Check.eq(Ch19Concurrency.poolMap((Integer x) -> x, List.of(), 3), List.of());
            AtomicInteger active = new AtomicInteger(), peak = new AtomicInteger();
            List<Integer> items = new ArrayList<>(), want = new ArrayList<>();
            for (int i = 0; i < 12; i++) {
                items.add(i);
                want.add(-i);
            }
            List<Integer> got = Ch19Concurrency.poolMap((Integer x) -> {
                peak.accumulateAndGet(active.incrementAndGet(), Math::max);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                active.decrementAndGet();
                return -x;
            }, items, 3);
            Check.eq(got, want);
            Check.yes(peak.get() >= 1 && peak.get() <= 3);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}

class Ex19_4Test {
    public static void run() {
        try {
            Check.eq(Ch19Concurrency.lockedCount(4, 1000), 4000);
            Check.eq(Ch19Concurrency.lockedCount(1, 0), 0);
            Check.eq(Ch19Concurrency.lockedCount(8, 25_000), 200_000);
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }
}

class Ex19_5Test {
    public static void run() {
        try {
            Check.eq(Ch19Concurrency.resultWithin(() -> 42, 1000), Optional.of(42));
            long start = System.nanoTime();
            Check.eq(Ch19Concurrency.resultWithin(() -> {
                Thread.sleep(300);
                return 1;
            }, 50), Optional.empty());
            Check.yes(System.nanoTime() - start < 250_000_000L);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}

class Ex19_6Test {
    public static void run() {
        try {
            int[] hundred = new int[100], thousand = new int[1000];
            for (int i = 0; i < 100; i++) hundred[i] = i + 1;
            for (int i = 0; i < 1000; i++) thousand[i] = i;
            Check.eq(Ch19Concurrency.parallelSum(hundred, 4), 5050L);
            Check.eq(Ch19Concurrency.parallelSum(new int[0], 3), 0L);
            Check.eq(Ch19Concurrency.parallelSum(new int[] {5}, 8), 5L);
            Check.eq(Ch19Concurrency.parallelSum(thousand, 7), 499_500L);
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }
}
