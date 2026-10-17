import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Chapter 15 - Writing fast Java. */
public class Ch15FastJava {

    // ==== EX 15.1 | StreamTokenizer for numeric input | Core
    // PROMPT: Write `static long sumAll(Reader r)` that reads N then N numbers with `StreamTokenizer` (`nextToken()` then `(long) st.nval`).
    // EXAMPLE: `sumAll(new StringReader("3\n10 20 30"))` -> `60`
    // BIGO: O(input). Fastest standard reader, but `nval` is a double: exact only up to 2^53, so read huge longs as words.
    static long sumAll(Reader r) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 15.2 | One StringBuilder, one print | Core
    // PROMPT: Write `static String squaresOutput(int n)` producing lines `i i*i` for 1..n in one `StringBuilder` with `append` chains, never `+=` on a String inside a loop.
    // EXAMPLE: `squaresOutput(3)` -> `"1 1\n2 4\n3 9\n"`
    // BIGO: O(output). `s += x` in a loop copies the whole string each time: O(N^2).
    static String squaresOutput(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 15.3 | PrintWriter and the forgotten flush | Core
    // PROMPT: Write `static String answerQueries(int[] qs)` that prints `2 * q` for each query through a `PrintWriter` wrapped around a `StringWriter`, flushing at the end.
    // EXAMPLE: `answerQueries(new int[]{1, 5})` -> `"2\n10\n"`
    // BIGO: O(output). A `PrintWriter(System.out)` that is never flushed prints nothing: the most common Java wrong answer that is not about the algorithm.
    static String answerQueries(int[] qs) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 15.4 | Primitive arrays over boxed collections | Core
    // PROMPT: Write `static int[] countsArray(int[] a, int maxValue)` using `int[]` buckets, and compare with a `HashMap<Integer, Integer>` version on 10^6 values.
    // EXAMPLE: `countsArray(new int[]{2, 0, 2, 3}, 3)` -> `[1, 0, 2, 1]`
    // BIGO: Both O(N), but every `Integer` is a separate object of about 16 bytes; an `int[]` cell is 4 bytes with no pointer chasing.
    static int[] countsArray(int[] a, int maxValue) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 15.5 | Flatten a 2D array | Core
    // PROMPT: Write `static long sumFlat(int[] flat, int rows, int cols)` that sums row by row over a 1D array indexed `r * cols + c`, and explain why traversal order matters for `int[][]`.
    // EXAMPLE: rows 2, cols 3, flat `{1, 2, 3, 4, 5, 6}` -> `21`
    // BIGO: O(R * C). Row-major order walks memory sequentially; column-first order on `int[][]` jumps between row arrays and misses the cache.
    static long sumFlat(int[] flat, int rows, int cols) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 15.6 | An int list without boxing | Practice
    // PROMPT: Write `static class IntList` with a growable `int[]` (doubling), `add`, `get`, `size` and `toArray`.
    // EXAMPLE: add 1..5 -> `size()` `5`, `get(4)` `5`
    // BIGO: O(1) amortized add. Useful for adjacency lists with 10^6 edges.
    static class IntList {
        private int[] data = new int[4];
        private int size;

        void add(int x) {
            throw new UnsupportedOperationException();
        }

        int get(int i) {
            throw new UnsupportedOperationException();
        }

        int size() { throw new UnsupportedOperationException(); }

        int[] toArray() { throw new UnsupportedOperationException(); }
    }
    // ==== END

    // ==== EX 15.7 | Graphs in arrays: forward-star | Stretch
    // PROMPT: Write `static int[][] csr(int n, int[][] edges)` building directed adjacency as `{start, to}`: `start` has n + 1 offsets and the neighbours of u are `to[start[u] .. start[u + 1] - 1]`.
    // EXAMPLE: n 3, edges `{{0, 1}, {0, 2}, {2, 1}}` -> start `[0, 2, 2, 3]`, to `[1, 2, 1]`
    // BIGO: O(N + E) with two arrays and no per-node objects.
    static int[][] csr(int n, int[][] edges) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 15.8 | The operations budget | Core
    // PROMPT: Write `static String verdict(long n, String complexity)` estimating operations for "n", "nlogn", "n2" or "n3" and returning "fast" (<= 10^8), "tight" (<= 10^9) or "too slow".
    // EXAMPLE: `verdict(200_000, "nlogn")` -> `"fast"`; `verdict(20_000, "n2")` -> `"tight"`; `verdict(100_000, "n2")` -> `"too slow"`
    // BIGO: O(1). Java does roughly 10^8 to 10^9 simple operations a second, so budget about 10^8 per second of time limit.
    static String verdict(long n, String complexity) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
