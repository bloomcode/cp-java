import java.util.Arrays;
import java.util.Random;

/** Chapter 5 - Arrays. */
public class Ch05Arrays {

    // ==== EX 5.1 | Defaults and Arrays.fill | Core
    // PROMPT: Write `static int[][] makeGrid(int r, int c, int fill)` using `new int[r][c]` and `Arrays.fill` on each row. Note what a fresh `int[]`, `boolean[]` and `String[]` contain.
    // EXAMPLE: `makeGrid(2, 3, 7)` -> `[[7, 7, 7], [7, 7, 7]]`
    // BIGO: O(R * C).
    // NOTE: New arrays are zero-filled: 0, false, '\u0000', and null for object arrays. Unlike Python, every row of `new int[r][c]` is a separate array.
    static int[][] makeGrid(int r, int c, int fill) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.2 | Copies: clone is shallow for 2D | Core
    // PROMPT: Write `static int[][] deepCopy(int[][] g)` copying every row with `clone()`. Show that `g.clone()` alone shares the rows.
    // EXAMPLE: after `int[][] s = g.clone(); s[0][0] = 9;` -> `g[0][0]` is also `9`; with `deepCopy` it is not
    // BIGO: O(R * C).
    static int[][] deepCopy(int[][] g) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.3 | Comparing and printing arrays | Core
    // PROMPT: Write `static boolean sameContents(int[][] a, int[][] b)` with `Arrays.deepEquals`, and explain why `a.equals(b)` and `Arrays.equals` on 2D arrays compare references.
    // EXAMPLE: two separately built `{{1, 2}, {3}}` arrays -> `sameContents` `true`, `a.equals(b)` `false`
    // BIGO: O(total elements). `Arrays.toString` and `Arrays.deepToString` are the matching printers.
    static boolean sameContents(int[][] a, int[][] b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.4 | Prefix sums in long | Core
    // PROMPT: Write `static long[] prefixSums(int[] a)` (length N + 1, p[0] = 0) and `static long rangeSum(long[] p, int l, int r)` for the inclusive range. Use `long` because sums of ints overflow.
    // EXAMPLE: `prefixSums(new int[]{3, 1, 4, 1, 5})` -> `[0, 3, 4, 8, 9, 14]`; `rangeSum(p, 1, 3)` -> `6`
    // BIGO: O(N) build, O(1) per query.
    static long[] prefixSums(int[] a) {
        throw new UnsupportedOperationException();
    }

    static long rangeSum(long[] p, int l, int r) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.5 | Rotate with copyOfRange | Core
    // PROMPT: Write `static int[] rotateRight(int[] a, int k)` returning a new array, using `System.arraycopy` or `Arrays.copyOfRange`. k may exceed the length.
    // EXAMPLE: `rotateRight(new int[]{1, 2, 3, 4, 5}, 2)` -> `[4, 5, 1, 2, 3]`
    // BIGO: O(N).
    static int[] rotateRight(int[] a, int k) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.6 | Transpose | Core
    // PROMPT: Write `static int[][] transpose(int[][] m)`.
    // EXAMPLE: `transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})` -> `[[1, 4], [2, 5], [3, 6]]`
    // BIGO: O(R * C).
    static int[][] transpose(int[][] m) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.7 | Sorting primitives safely | Core
    // PROMPT: `Arrays.sort(int[])` is a dual-pivot quicksort with an O(N^2) worst case that contest hackers target. Write `static void safeSort(int[] a)` that shuffles with your own `Random` before sorting.
    // EXAMPLE: `int[] a = {5, 3, 9, 1}; safeSort(a);` -> `[1, 3, 5, 9]`
    // BIGO: O(N log N) expected after the shuffle. Sorting `Integer[]` or a `List` uses TimSort, which is O(N log N) worst case but slower because of boxing.
    static void safeSort(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.8 | Upper bound by binary search | Core
    // PROMPT: `Arrays.binarySearch` returns any matching index (or a negative insertion point), not the first or last. Write `static int upperBound(int[] sorted, int x)` returning how many values are <= x.
    // EXAMPLE: `upperBound(new int[]{1, 3, 3, 5, 8}, 3)` -> `3`; `upperBound(..., 0)` -> `0`; `upperBound(..., 9)` -> `5`
    // BIGO: O(log N).
    static int upperBound(int[] sorted, int x) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 5.9 | Spiral order | Stretch
    // PROMPT: Write `static int[] spiral(int[][] m)` returning values in clockwise spiral order from the top-left.
    // EXAMPLE: `spiral(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})` -> `[1, 2, 3, 6, 9, 8, 7, 4, 5]`
    // BIGO: O(R * C).
    static int[] spiral(int[][] m) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
