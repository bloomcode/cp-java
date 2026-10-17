import java.util.ArrayList;
import java.util.List;

/** Chapter 4 - Control flow. */
public class Ch04ControlFlow {

    // ==== EX 4.1 | FizzBuzz | Core
    // PROMPT: Write `static List<String> fizzbuzz(int n)` for 1..n.
    // EXAMPLE: `fizzbuzz(5)` -> `[1, 2, Fizz, 4, Buzz]`
    // BIGO: O(N).
    static List<String> fizzbuzz(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.2 | Labeled break out of nested loops | Core
    // PROMPT: Write `static int[] findInGrid(int[][] g, int target)` returning `{row, col}` of the first match or `null`, leaving both loops with one `break outer;`.
    // EXAMPLE: `findInGrid(new int[][]{{1, 2}, {3, 4}}, 3)` -> `[1, 0]`
    // BIGO: O(R * C).
    static int[] findInGrid(int[][] g, int target) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.3 | while: Collatz steps | Core
    // PROMPT: Write `static int collatzSteps(long n)`: halve even n, map odd n to 3n + 1, count steps until 1. Use `long`: values can exceed int for some starts.
    // EXAMPLE: `collatzSteps(6)` -> `8`; `collatzSteps(1)` -> `0`
    // BIGO: No proven bound, hence `while`.
    static int collatzSteps(long n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.4 | switch expressions | Core
    // PROMPT: Write `static long calc(char op, long a, long b)` with a switch expression (`case '+' -> a + b;`) and a `default` that throws `IllegalArgumentException`.
    // EXAMPLE: `calc('*', 6, 7)` -> `42`; `calc('/', 7, 2)` -> `3`
    // BIGO: O(1). Arrow-form switch (Java 14+) has no fall-through, so no forgotten `break`.
    static long calc(char op, long a, long b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.5 | Enhanced for and the ternary operator | Core
    // PROMPT: Write `static int[] clampAll(int[] a, int lo, int hi)` returning a new array, using an enhanced `for` and a nested ternary.
    // EXAMPLE: `clampAll(new int[]{-5, 3, 12}, 0, 10)` -> `[0, 3, 10]`
    // BIGO: O(N).
    static int[] clampAll(int[] a, int lo, int hi) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.6 | Patterns with String.repeat | Core
    // PROMPT: Write `static List<String> pyramid(int n)` returning n centred lines of stars, using `" ".repeat(...)` (Java 11+).
    // EXAMPLE: `pyramid(3)` -> `["  *", " ***", "*****"]`
    // BIGO: O(N^2) characters.
    static List<String> pyramid(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.7 | do ... while | Core
    // PROMPT: Write `static int digitCount(long n)` with a `do`/`while` loop so that 0 correctly has one digit.
    // EXAMPLE: `digitCount(0)` -> `1`; `digitCount(-12345)` -> `5`
    // BIGO: O(D).
    static int digitCount(long n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 4.8 | break and continue | Core
    // PROMPT: Write `static int sumUntilNegative(int[] a)`: skip zeros with `continue`, stop at the first negative with `break`.
    // EXAMPLE: `sumUntilNegative(new int[]{4, 0, 3, -1, 10})` -> `7`
    // BIGO: O(N).
    static int sumUntilNegative(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
