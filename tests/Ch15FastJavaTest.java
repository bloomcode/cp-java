import java.io.StringReader;

/** Chapter 15 tests, one class per exercise. */
class Ex15_1Test {
    public static void run() {
        Check.eq(Ch15FastJava.sumAll(new StringReader("3\n10 20 30")), 60L);
    }
}

class Ex15_2Test {
    public static void run() {
        Check.eq(Ch15FastJava.squaresOutput(3), "1 1\n2 4\n3 9\n");
    }
}

class Ex15_3Test {
    public static void run() {
        Check.eq(Ch15FastJava.answerQueries(new int[]{1, 5}), "2\n10\n");
    }
}

class Ex15_4Test {
    public static void run() {
        Check.eq(Ch15FastJava.countsArray(new int[]{2, 0, 2, 3}, 3), new int[]{1, 0, 2, 1});
    }
}

class Ex15_5Test {
    public static void run() {
        Check.eq(Ch15FastJava.sumFlat(new int[]{1, 2, 3, 4, 5, 6}, 2, 3), 21L);
    }
}

class Ex15_6Test {
    public static void run() {
        Ch15FastJava.IntList il = new Ch15FastJava.IntList();
        for (int i = 1; i <= 5; i++) il.add(i);
        Check.eq(il.size(), 5);
        Check.eq(il.get(4), 5);
        Check.eq(il.toArray(), new int[]{1, 2, 3, 4, 5});
        Check.throwsEx(IndexOutOfBoundsException.class, () -> il.get(5));
    }
}

class Ex15_7Test {
    public static void run() {
        int[][] csr = Ch15FastJava.csr(3, new int[][]{{0, 1}, {0, 2}, {2, 1}});
        Check.eq(csr[0], new int[]{0, 2, 2, 3});
        Check.eq(csr[1], new int[]{1, 2, 1});
    }
}

class Ex15_8Test {
    public static void run() {
        Check.eq(Ch15FastJava.verdict(200_000, "nlogn"), "fast");
        Check.eq(Ch15FastJava.verdict(20_000, "n2"), "tight");
        Check.eq(Ch15FastJava.verdict(100_000, "n2"), "too slow");
    }
}
