import java.util.List;

/** Chapter 12 tests, one class per exercise. */
class Ex12_1Test {
    public static void run() {
        Check.eq(Ch12Recursion.power(3, 13), 1594323L);
        Check.eq(Ch12Recursion.power(2, 0), 1L);
    }
}

class Ex12_2Test {
    public static void run() {
        Check.eq(Ch12Recursion.fib(10), 55L);
        Check.eq(Ch12Recursion.fib(90), 2880067194370816120L);
    }
}

class Ex12_3Test {
    public static void run() {
        Check.eq(Ch12Recursion.gridPaths(3, 3), 6L);
        Check.eq(Ch12Recursion.gridPaths(17, 17), 601080390L);
    }
}

class Ex12_4Test {
    public static void run() {
        Check.eq(Ch12Recursion.subsets(new int[]{1, 2}), List.of(List.of(), List.of(2), List.of(1), List.of(1, 2)));
        Check.eq(Ch12Recursion.subsets(new int[]{1, 2, 3}).size(), 8);
    }
}

class Ex12_5Test {
    public static void run() {
        Check.eq(Ch12Recursion.permutations("abc"), List.of("abc", "acb", "bac", "bca", "cab", "cba"));
    }
}

class Ex12_6Test {
    public static void run() {
        char[][] grid = {"#.#".toCharArray(), "#..".toCharArray(), "..#".toCharArray()};
        Check.eq(Ch12Recursion.countIslands(grid), 3);
    }
}

class Ex12_7Test {
    public static void run() {
        Check.eq(Ch12Recursion.deepSum(1_000_000), 500000500000L);
    }
}

class Ex12_8Test {
    public static void run() {
        Check.eq(Ch12Recursion.nQueens(4), 2);
        Check.eq(Ch12Recursion.nQueens(8), 92);
    }
}
