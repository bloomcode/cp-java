import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/** Chapter 14 tests, one class per exercise. */
class Ex14_1Test {
    public static void run() {
        Check.eq(Ch14Math.gcd(84, 36), 12L);
        Check.eq(Ch14Math.lcm(4, 6), 12L);
        Check.eq(Ch14Math.lcm(1_000_000_000, 999_999_999), 999999999000000000L);
    }
}

class Ex14_2Test {
    public static void run() {
        Check.eq(Ch14Math.primesUpTo(30), List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        Check.eq(Ch14Math.primesUpTo(1_000_000).size(), 78498);
    }
}

class Ex14_3Test {
    public static void run() {
        Check.eq(Ch14Math.factorize(360).stream().map(Arrays::toString).toList(), List.of("[2, 3]", "[3, 2]", "[5, 1]"));
        Check.eq(Ch14Math.factorize(1_000_000_007L * 2).size(), 2);
    }
}

class Ex14_4Test {
    public static void run() {
        Check.eq(Ch14Math.mulMod(999_999_999_999_999_989L, 2, 1_000_000_000_000_000_000L), 999999999999999978L);
        long m = 1_000_000_000_000_000_003L;
        Check.eq(Ch14Math.powMod(3, 200, m), BigInteger.valueOf(3).modPow(BigInteger.valueOf(200), BigInteger.valueOf(m)).longValue());
    }
}

class Ex14_5Test {
    public static void run() {
        Check.eq(new Ch14Math.Binom(10).nCr(10, 3), 120L);
        Check.eq(new Ch14Math.Binom(100000).nCr(100000, 50000), 149033233L);
        Check.eq(new Ch14Math.Binom(5).nCr(3, 5), 0L);
    }
}

class Ex14_6Test {
    public static void run() {
        long[] e = Ch14Math.extGcd(240, 46);
        Check.eq(e[0], 2L);
        Check.eq(240 * e[1] + 46 * e[2], 2L);
        Check.eq(Ch14Math.modInverse(3, 10), 7L);
        Check.throwsEx(ArithmeticException.class, () -> Ch14Math.modInverse(4, 10));
    }
}

class Ex14_7Test {
    public static void run() {
        Check.eq(Ch14Math.divisors(36), List.of(1L, 2L, 3L, 4L, 6L, 9L, 12L, 18L, 36L));
    }
}

class Ex14_8Test {
    public static void run() {
        Check.eq(Ch14Math.fibBig(100), "354224848179261915075");
        Check.yes(Ch14Math.probablyPrime("1000000000000000003"));
        Check.no(Ch14Math.probablyPrime("1000000000000000001"));
    }
}
