import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * Chapter 1 - Fast input and output.
 * Judges pipe text through standard input. Every exercise takes the input as a String
 * and returns the output as a String so it can be tested; 1.8 wires it to real stdin.
 */
public class Ch01FastIO {

    // ==== EX 1.1 | Parse a line of integers | Core
    // PROMPT: Write `static int[] readInts(String line)` using a `StringTokenizer`. Then explain why it beats `line.split(" ")` on a line of 200,000 numbers.
    // EXAMPLE: `readInts("3 -4 10")` -> `[3, -4, 10]`
    // BIGO: O(L) for a line of L characters. `split` compiles a regular expression and builds an array of Strings first.
    static int[] readInts(String line) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 1.2 | A FastReader class | Core
    // PROMPT: Write `static class FastReader` wrapping a `BufferedReader` and a `StringTokenizer`, with `next()`, `nextInt()`, `nextLong()` and `nextDouble()` that pull the next token from any line. Give it constructors taking a `Reader` and `System.in`.
    // EXAMPLE: `new FastReader(new StringReader("3\n10 20\n30")).nextInt()` -> `3`, then `10`, `20`, `30`
    // BIGO: O(1) amortized per token. `Scanner` does the same job several times slower because it parses with regular expressions.
    // NOTE: Tokens ignore line breaks, which protects you from judges that wrap input unexpectedly.
    static class FastReader {
        private final BufferedReader br;
        private StringTokenizer st;

        FastReader(Reader r) { throw new UnsupportedOperationException(); }

        FastReader() { this(new InputStreamReader(System.in)); throw new UnsupportedOperationException(); }

        String next() {
            throw new UnsupportedOperationException();
        }

        int nextInt() { throw new UnsupportedOperationException(); }

        long nextLong() { throw new UnsupportedOperationException(); }

        double nextDouble() { throw new UnsupportedOperationException(); }
    }
    // ==== END

    // ==== EX 1.3 | N, then N numbers | Core
    // PROMPT: Write `static int[] readArray(String data)`: the first token is N, followed by N integers on any number of lines. Use your `FastReader`.
    // EXAMPLE: `readArray("4\n5 1 9 2")` -> `[5, 1, 9, 2]`
    // BIGO: O(N).
    static int[] readArray(String data) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 1.4 | Read a character grid | Core
    // PROMPT: Write `static char[][] readGrid(String data)`: first `R C`, then R lines of `#` and `.`. Return the grid as `char[R][C]` using `toCharArray`.
    // EXAMPLE: `readGrid("2 3\n#.#\n..#")` -> `[[#, ., #], [., ., #]]`
    // BIGO: O(R * C).
    static char[][] readGrid(String data) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 1.5 | T test cases into one StringBuilder | Core
    // PROMPT: Write `static String sumCases(String data)`: first T, then T lines of `a b` (each up to 10^18 in size). Append each `a + b` to a `StringBuilder` with a newline and return it trimmed of the final newline.
    // EXAMPLE: `sumCases("2\n1 2\n1000000000000 1")` -> `"3\n1000000000001"`
    // BIGO: O(T). Printing inside the loop with `System.out.println` flushes constantly and is the most common reason correct Java solutions time out.
    static String sumCases(String data) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 1.6 | Format numbers exactly | Core
    // PROMPT: Write `static String fmt(double x)` with exactly 6 decimals and `static String fmtRow(String name, int score)` with the name left-aligned in 10 characters and the score right-aligned in 5. Pass `Locale.US` so a judge in any locale prints a dot.
    // EXAMPLE: `fmt(2.0 / 3)` -> `"0.666667"`; `fmtRow("ann", 42)` -> `"ann          42"`
    // BIGO: O(1).
    // NOTE: Without a locale, `String.format("%.2f", 1.5)` prints `1,50` on machines set to many European locales.
    static String fmt(double x) {
        throw new UnsupportedOperationException();
    }

    static String fmtRow(String name, int score) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 1.7 | One line of output | Core
    // PROMPT: Write `static String joinLine(int[] values)` returning the values separated by single spaces, using a `StringBuilder` (no trailing space).
    // EXAMPLE: `joinLine(new int[]{3, 1, 2})` -> `"3 1 2"`
    // BIGO: O(N).
    static String joinLine(int[] values) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 1.8 | The contest template | Core
    // PROMPT: Write `static void solve(FastReader in, PrintWriter out)` for "print the maximum of N numbers", a `main` that builds them on `System.in` and `System.out` and calls `out.flush()`, and a `static String run(String input)` helper for testing. Keep this as your template.
    // EXAMPLE: `run("5\n3 9 -1 4 7")` -> `"9"`
    // BIGO: O(N). `PrintWriter` buffers output; forgetting `flush()` prints nothing at all.
    static void solve(FastReader in, PrintWriter out) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    static String run(String input) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
