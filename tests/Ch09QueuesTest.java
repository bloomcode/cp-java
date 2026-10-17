import java.util.List;

/** Chapter 9 tests, one class per exercise. */
class Ex9_1Test {
    public static void run() {
        Check.yes(Ch09Queues.balanced("{[()]}"));
        Check.no(Ch09Queues.balanced("([)]"));
        Check.no(Ch09Queues.balanced("(("));
        Check.no(Ch09Queues.balanced(")"));
    }
}

class Ex9_2Test {
    public static void run() {
        Check.eq(Ch09Queues.shortestPath(new String[]{"..#", "#..", "#.."}), 4);
        Check.eq(Ch09Queues.shortestPath(new String[]{".#", "#."}), -1);
    }
}

class Ex9_3Test {
    public static void run() {
        Check.eq(Ch09Queues.windowMax(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), new int[]{3, 3, 5, 5, 6, 7});
    }
}

class Ex9_4Test {
    public static void run() {
        Check.eq(Ch09Queues.drainAscending(new int[]{5, 1, 4}), List.of(1, 4, 5));
        Check.eq(Ch09Queues.drainDescending(new int[]{5, 1, 4}), List.of(5, 4, 1));
    }
}

class Ex9_5Test {
    public static void run() {
        Check.eq(Ch09Queues.kLargest(new int[]{7, 2, 9, 4, 9, 1}, 3), List.of(9, 9, 7));
    }
}

class Ex9_6Test {
    public static void run() {
        Check.eq(Ch09Queues.processByCost(new int[][]{{5, 1}, {2, 7}, {5, 0}}), List.of("7:2", "0:5", "1:5"));
    }
}

class Ex9_7Test {
    public static void run() {
        Check.eq(Ch09Queues.runningMedian(new int[]{5, 15, 1, 3}), new double[]{5.0, 10.0, 5.0, 4.0});
    }
}

class Ex9_8Test {
    public static void run() {
        Check.eq(Ch09Queues.closestSeen(new int[]{5, 9, 1, 6}), new int[]{-1, 4, 4, 1});
    }
}

class Ex9_9Test {
    public static void run() {
        Ch09Queues.MultiSet ms = new Ch09Queues.MultiSet();
        ms.add(5);
        ms.add(1);
        ms.add(5);
        Check.yes(ms.remove(1));
        Check.no(ms.remove(7));
        Check.eq(new int[]{ms.min(), ms.max(), ms.size()}, new int[]{5, 5, 2});
    }
}
