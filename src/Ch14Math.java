import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/** Chapter 14 - Math and number theory. */
public class Ch14Math {

    // ==== EX 14.1 | gcd and lcm without overflow | Core
    // PROMPT: Write `static long gcd(long a, long b)` with Euclid's algorithm and `static long lcm(long a, long b)` that divides before multiplying.
    // EXAMPLE: `gcd(84, 36)` -> `12`; `lcm(4, 6)` -> `12`; `lcm(1_000_000_000, 999_999_999)` -> `999999999000000000`
    // BIGO: O(log min(a, b)). `a / gcd * b` keeps the intermediate value small.
    static long gcd(long a, long b) {
        throw new UnsupportedOperationException();
    }

    static long lcm(long a, long b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 14.2 | Sieve of Eratosthenes | Core
    // PROMPT: Write `static boolean[] sieve(int n)` where `composite[i]` is false exactly for primes, plus `static List<Integer> primesUpTo(int n)`.
    // EXAMPLE: `primesUpTo(30)` -> `[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]`
    // BIGO: O(N log log N). Start crossing out at `(long) i * i` to avoid int overflow near the top.
    static boolean[] sieve(int n) {
        throw new UnsupportedOperationException();
    }

    static List<Integer> primesUpTo(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 14.3 | Prime factorization | Core
    // PROMPT: Write `static List<long[]> factorize(long n)` returning `{prime, exponent}` pairs by trial division up to sqrt(n).
    // EXAMPLE: `factorize(360)` -> `[[2, 3], [3, 2], [5, 1]]`
    // BIGO: O(sqrt N). Loop with `p <= n / p` instead of `p * p <= n` to stay inside long.
    static List<long[]> factorize(long n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 14.4 | Safe modular multiplication | Practice
    // PROMPT: For a modulus near 10^18, `a * b % m` overflows long. Write `static long mulMod(long a, long b, long m)` with `Math.multiplyHigh` or `BigInteger`, and `static long powMod(long b, long e, long m)` on top of it.
    // EXAMPLE: `mulMod(999_999_999_999_999_989L, 2, 1_000_000_000_000_000_000L)` -> `999999999999999978`
    // BIGO: O(1) per multiply via BigInteger here; O(log e) multiplies for powMod. For m below about 3 * 10^9 plain `a * b % m` is safe.
    static long mulMod(long a, long b, long m) {
        throw new UnsupportedOperationException();
    }

    static long powMod(long b, long e, long m) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 14.5 | nCr modulo a prime | Core
    // PROMPT: Write `static class Binom` that precomputes factorials and inverse factorials mod 1_000_000_007 up to n, with `long nCr(int n, int r)`.
    // EXAMPLE: `new Binom(10).nCr(10, 3)` -> `120`; `new Binom(100000).nCr(100000, 50000)` -> `149033233`
    // BIGO: O(N) precompute, O(1) per query.
    static class Binom {
        static final long MOD = 1_000_000_007L;
        final long[] fact, inv;

        Binom(int n) {
            throw new UnsupportedOperationException();
        }

        private static long pow(long b, long e) {
            throw new UnsupportedOperationException();
        }

        long nCr(int n, int r) {
            throw new UnsupportedOperationException();
        }
    }
    // ==== END

    // ==== EX 14.6 | Extended Euclid | Practice
    // PROMPT: Write `static long[] extGcd(long a, long b)` returning `{g, x, y}` with a*x + b*y = g, and use it for `static long modInverse(long a, long m)` when m is not prime.
    // EXAMPLE: `extGcd(240, 46)` -> g `2` with 240*x + 46*y = 2; `modInverse(3, 10)` -> `7`
    // BIGO: O(log min(a, b)).
    static long[] extGcd(long a, long b) {
        throw new UnsupportedOperationException();
    }

    static long modInverse(long a, long m) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 14.7 | Divisors in sqrt time | Core
    // PROMPT: Write `static List<Long> divisors(long n)` returning all divisors in ascending order by pairing d with n / d.
    // EXAMPLE: `divisors(36)` -> `[1, 2, 3, 4, 6, 9, 12, 18, 36]`
    // BIGO: O(sqrt N).
    static List<Long> divisors(long n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 14.8 | BigInteger when long is not enough | Core
    // PROMPT: Write `static String fibBig(int n)` returning the nth Fibonacci number with `BigInteger` and `static boolean probablyPrime(String n)` with `isProbablePrime(30)`.
    // EXAMPLE: `fibBig(100)` -> `"354224848179261915075"`; `probablyPrime("1000000000000000003")` -> `true`
    // BIGO: O(N) additions of growing numbers. BigInteger is immutable: every operation returns a new object.
    static String fibBig(int n) {
        throw new UnsupportedOperationException();
    }

    static boolean probablyPrime(String n) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
