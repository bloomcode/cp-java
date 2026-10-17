import java.util.Arrays;

/** Chapter 5 tests, one class per exercise. */
class Ex5_1Test {
    public static void run() {
        Check.eq(Ch05Arrays.makeGrid(2, 3, 7), new int[][]{{7, 7, 7}, {7, 7, 7}});
        Check.eq(new boolean[2], new boolean[]{false, false}); // defaults
    }
}

class Ex5_2Test {
    public static void run() {
        int[][] g = {{1, 2}, {3, 4}};
        int[][] shallow = g.clone();
        shallow[0][0] = 9;
        Check.eq(g[0][0], 9); // clone shares the rows
        int[][] deep = Ch05Arrays.deepCopy(g);
        deep[0][0] = 1;
        Check.eq(g[0][0], 9);
        Check.eq(deep, new int[][]{{1, 2}, {3, 4}});
    }
}

class Ex5_3Test {
    public static void run() {
        int[][] a1 = {{1, 2}, {3}}, a2 = {{1, 2}, {3}};
        Check.yes(Ch05Arrays.sameContents(a1, a2));
        Check.no(Ch05Arrays.sameContents(a1, new int[][]{{1, 2}, {4}}));
        Check.no(Arrays.equals(a1, a2));
    }
}

class Ex5_4Test {
    public static void run() {
        long[] p = Ch05Arrays.prefixSums(new int[]{3, 1, 4, 1, 5});
        Check.eq(p, new long[]{0, 3, 4, 8, 9, 14});
        Check.eq(Ch05Arrays.rangeSum(p, 1, 3), 6L);
        Check.eq(Ch05Arrays.prefixSums(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE})[2], 4294967294L);
    }
}

class Ex5_5Test {
    public static void run() {
        Check.eq(Ch05Arrays.rotateRight(new int[]{1, 2, 3, 4, 5}, 2), new int[]{4, 5, 1, 2, 3});
        Check.eq(Ch05Arrays.rotateRight(new int[]{1, 2, 3}, 7), new int[]{3, 1, 2});
    }
}

class Ex5_6Test {
    public static void run() {
        Check.eq(Ch05Arrays.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}), new int[][]{{1, 4}, {2, 5}, {3, 6}});
    }
}

class Ex5_7Test {
    public static void run() {
        int[] s = {5, 3, 9, 1};
        Ch05Arrays.safeSort(s);
        Check.eq(s, new int[]{1, 3, 5, 9});
    }
}

class Ex5_8Test {
    public static void run() {
        int[] sorted = {1, 3, 3, 5, 8};
        Check.eq(new int[]{Ch05Arrays.upperBound(sorted, 3), Ch05Arrays.upperBound(sorted, 0), Ch05Arrays.upperBound(sorted, 9)},
                new int[]{3, 0, 5});
    }
}

class Ex5_9Test {
    public static void run() {
        Check.eq(Ch05Arrays.spiral(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5});
        Check.eq(Ch05Arrays.spiral(new int[][]{{1, 2}, {3, 4}, {5, 6}}), new int[]{1, 2, 4, 6, 5, 3});
        Check.eq(Ch05Arrays.spiral(new int[][]{{1, 2, 3}}), new int[]{1, 2, 3});
    }
}
