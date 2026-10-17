import java.math.BigInteger;

/** Chapter 2 - Primitive types, overflow and division. */
public class Ch02Numbers {

    // ==== EX 2.1 | int overflows silently | Core
    // PROMPT: Write `static int wrapped()` returning `Integer.MAX_VALUE + 1`, and `static long product(int a, int b)` that multiplies two ints without overflowing.
    // EXAMPLE: `wrapped()` -> `-2147483648`; `product(100000, 100000)` -> `10000000000` (the int product would be `1410065408`)
    // BIGO: O(1).
    // NOTE: Cast before multiplying: `(long) a * b`. Writing `(long) (a * b)` casts the already-wrapped result.
    static int wrapped() {
        throw new UnsupportedOperationException();
    }

    static long product(int a, int b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.2 | Detect overflow with exact arithmetic | Core
    // PROMPT: Write `static boolean productFits(long a, long b)` using `Math.multiplyExact`, which throws `ArithmeticException` on overflow.
    // EXAMPLE: `productFits(3_000_000_000L, 3)` -> `true`; `productFits(4_000_000_000L, 4_000_000_000L)` -> `false`
    // BIGO: O(1).
    static boolean productFits(long a, long b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.3 | Division and remainder with negatives | Core
    // PROMPT: Write `static long[] truncDivMod(long a, long b)` returning `{a / b, a % b}` and `static long[] floorDivMod(long a, long b)` using `Math.floorDiv` and `Math.floorMod`. Predict both for a = -7, b = 2.
    // EXAMPLE: `truncDivMod(-7, 2)` -> `[-3, -1]`; `floorDivMod(-7, 2)` -> `[-4, 1]`
    // BIGO: O(1).
    // NOTE: Java's `%` takes the sign of the dividend, so `x % m` can be negative. Use `Math.floorMod(x, m)` whenever you need an index or a residue.
    static long[] truncDivMod(long a, long b) {
        throw new UnsupportedOperationException();
    }

    static long[] floorDivMod(long a, long b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.4 | Ceiling division | Core
    // PROMPT: Write `static long ceilDiv(long a, long b)` for any signs with `-Math.floorDiv(-a, b)`, and compare with `Math.ceilDiv` (Java 18+).
    // EXAMPLE: `ceilDiv(7, 2)` -> `4`; `ceilDiv(-7, 2)` -> `-3`; `ceilDiv(6, 3)` -> `2`
    // BIGO: O(1). Avoid `(int) Math.ceil(a / (double) b)`: doubles lose precision above 2^53.
    static long ceilDiv(long a, long b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.5 | Modular power and inverse | Core
    // PROMPT: With `MOD = 1_000_000_007`, write `static long modPow(long base, long exp, long mod)` by repeated squaring and `static long modInv(long a)` with Fermat's little theorem.
    // EXAMPLE: `modPow(2, 10, MOD)` -> `1024`; `modPow(2, 100, MOD)` -> `976371285`; `123456 * modInv(123456) % MOD` -> `1`
    // BIGO: O(log exp). Every intermediate product is below MOD^2 < 2^63, so `long` never overflows.
    static final long MOD = 1_000_000_007L;

    static long modPow(long base, long exp, long mod) {
        throw new UnsupportedOperationException();
    }

    static long modInv(long a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.6 | BigInteger when long is not enough | Core
    // PROMPT: Write `static int factorialDigits(int n)` that computes n! with `BigInteger` and returns its number of digits.
    // EXAMPLE: `factorialDigits(20)` -> `19` (still fits in a long); `factorialDigits(100)` -> `158`
    // BIGO: Grows with the size of the number; fine for n in the thousands, but much slower than long arithmetic.
    static int factorialDigits(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.7 | Comparing doubles | Core
    // PROMPT: Write `static boolean close(double a, double b, double eps)` and show that `0.1 + 0.2 == 0.3` is false.
    // EXAMPLE: `close(0.1 + 0.2, 0.3, 1e-9)` -> `true`
    // BIGO: O(1).
    static boolean close(double a, double b, double eps) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.8 | An exact integer square root | Core
    // PROMPT: Write `static long isqrt(long n)` that starts from `(long) Math.sqrt(n)` and corrects it up or down, because the double can be off by one for large n.
    // EXAMPLE: `isqrt(99)` -> `9`; `isqrt(999_999_999_999_999_999L)` -> `999999999`
    // BIGO: O(1).
    // NOTE: Compare with division (`r > n / r`) rather than `r * r > n`: near `Long.MAX_VALUE` the square itself overflows and the loop never ends.
    static long isqrt(long n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 2.9 | Digits of a long | Core
    // PROMPT: Write `static int digitSum(long n)` and `static long reverseDigits(long n)` with `% 10` and `/ 10`, keeping the sign for the reverse.
    // EXAMPLE: `digitSum(9045)` -> `18`; `reverseDigits(-1200)` -> `-21`
    // BIGO: O(D) for D digits.
    static int digitSum(long n) {
        throw new UnsupportedOperationException();
    }

    static long reverseDigits(long n) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
