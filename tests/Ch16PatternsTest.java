/** Chapter 16 tests, one class per exercise. */
class Ex16_1Test {
    public static void run() {
        Check.eq(Ch16Patterns.solveAll("2\n3\n1 2 3\n1\n-5\n"), "6\n-5\n");
    }
}

class Ex16_2Test {
    public static void run() {
        Check.eq(Ch16Patterns.countPairsAtMost(new int[]{1, 5, 3, 2}, 5), 3L);
    }
}

class Ex16_3Test {
    public static void run() {
        Check.eq(Ch16Patterns.minCapacity(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5), 15L);
    }
}

class Ex16_4Test {
    public static void run() {
        Check.eq(Ch16Patterns.applyRanges(5, new int[][]{{1, 3, 2}, {0, 1, 5}}), new long[]{5, 7, 2, 2, 0});
    }
}

class Ex16_5Test {
    public static void run() {
        Check.eq(Ch16Patterns.compress(new int[]{100, -5, 100, 42}), new int[]{2, 0, 2, 1});
    }
}

class Ex16_6Test {
    public static void run() {
        Ch16Patterns.DSU dsu = new Ch16Patterns.DSU(5);
        Check.yes(dsu.union(0, 1));
        Check.yes(dsu.union(3, 4));
        Check.no(dsu.union(1, 0));
        Check.eq(dsu.components, 3);
    }
}

class Ex16_7Test {
    public static void run() {
        Check.eq(Ch16Patterns.dijkstra(4, new int[][]{{0, 1, 4}, {0, 2, 1}, {2, 1, 2}, {1, 3, 5}}, 0), new long[]{0, 3, 1, 8});
        Check.eq(Ch16Patterns.dijkstra(2, new int[][]{}, 0)[1], Long.MAX_VALUE);
    }
}

class Ex16_8Test {
    public static void run() {
        Check.eq(Ch16Patterns.depthsFromRoot(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {3, 4}}), new int[]{0, 1, 1, 2, 3});
        int n = 1_000_000;
        int[][] path = new int[n - 1][];
        for (int i = 0; i < n - 1; i++) path[i] = new int[]{i, i + 1};
        Check.eq(Ch16Patterns.depthsFromRoot(n, path)[n - 1], n - 1);
    }
}

class Ex16_9Test {
    public static void run() {
        Check.eq(Ch16Patterns.minCoins(new int[]{1, 3, 4}, 6), 2L);
        Check.eq(Ch16Patterns.minCoins(new int[]{2}, 3), -1L);
    }
}
