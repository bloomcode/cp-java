import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Chapter 12 - Recursion and memoization. */
public class Ch12Recursion {

    // ==== EX 12.1 | Base case and recursive case | Core
    // PROMPT: Write `static long power(long base, int exp)` recursively by halving the exponent.
    // EXAMPLE: `power(3, 13)` -> `1594323`; `power(2, 0)` -> `1`
    // BIGO: O(log exp).
    static long power(long base, int exp) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.2 | Memoize with a long[] table | Core
    // PROMPT: Write `static long fib(int n)` with a `long[]` memo filled with -1, so `fib(90)` returns instantly.
    // EXAMPLE: `fib(10)` -> `55`; `fib(90)` -> `2880067194370816120`
    // BIGO: O(N). Arrays beat `HashMap<Integer, Long>` when the states are small integers: no hashing, no boxing.
    static long fib(int n) {
        throw new UnsupportedOperationException();
    }

    private static long fib(int n, long[] memo) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.3 | Memoize with a HashMap key | Core
    // PROMPT: Write `static long gridPaths(int r, int c)` counting right/down paths in an r x c grid, memoized in a `HashMap<Long, Long>` keyed by `(long) r << 32 | c`.
    // EXAMPLE: `gridPaths(3, 3)` -> `6`; `gridPaths(17, 17)` -> `601080390`
    // BIGO: O(R * C) states. Packing two ints into a long avoids building a key object.
    static long gridPaths(int r, int c) {
        throw new UnsupportedOperationException();
    }

    private static long gridPaths(int r, int c, Map<Long, Long> memo) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.4 | Backtracking: all subsets | Core
    // PROMPT: Write `static List<List<Integer>> subsets(int[] a)` by choosing or skipping each element, adding to and removing from one shared `ArrayList`.
    // EXAMPLE: `subsets(new int[]{1, 2})` -> `[[], [2], [1], [1, 2]]`
    // BIGO: O(N * 2^N). Copy the current list (`new ArrayList<>(cur)`) when you record it.
    static List<List<Integer>> subsets(int[] a) {
        throw new UnsupportedOperationException();
    }

    private static void subsets(int[] a, int i, List<Integer> cur, List<List<Integer>> out) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.5 | Backtracking: permutations | Core
    // PROMPT: Write `static List<String> permutations(String s)` for distinct characters, using a `boolean[] used` and a `StringBuilder`.
    // EXAMPLE: `permutations("abc")` -> `[abc, acb, bac, bca, cab, cba]`
    // BIGO: O(N * N!).
    static List<String> permutations(String s) {
        throw new UnsupportedOperationException();
    }

    private static void perm(String s, boolean[] used, StringBuilder cur, List<String> out) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.6 | Flood fill | Core
    // PROMPT: Write `static int countIslands(char[][] g)` counting 4-connected groups of '#', marking visited cells by overwriting them.
    // EXAMPLE: `{"#.#", "#..", "..#"}` as chars -> `3`
    // BIGO: O(R * C). Recursion depth can reach R * C, which is why 12.7 exists.
    static int countIslands(char[][] g) {
        throw new UnsupportedOperationException();
    }

    private static void sink(char[][] g, int r, int c) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.7 | Deep recursion on a big-stack thread | Practice
    // PROMPT: The default thread stack overflows around 10^4 to 10^5 frames. Write `static long deepSum(int n)` that recursively sums 1..n on a `new Thread(null, task, "main", 1 << 28)` and returns after `join()`.
    // EXAMPLE: `deepSum(1_000_000)` -> `500000500000` with no `StackOverflowError`
    // BIGO: O(N) time and stack. Many contest solutions wrap all of `main` this way; the alternative is an explicit stack.
    static long deepSum(int n) {
        throw new UnsupportedOperationException();
    }

    private static long sumTo(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 12.8 | N-Queens count | Stretch
    // PROMPT: Write `static int nQueens(int n)` counting placements with three `boolean[]` arrays for columns and both diagonals.
    // EXAMPLE: `nQueens(4)` -> `2`; `nQueens(8)` -> `92`
    // BIGO: O(N!) worst case, heavily pruned.
    static int nQueens(int n) {
        throw new UnsupportedOperationException();
    }

    private static int place(int r, int n, boolean[] col, boolean[] d1, boolean[] d2) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
