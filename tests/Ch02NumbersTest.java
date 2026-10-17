/** Chapter 2 tests, one class per exercise. */
class Ex2_1Test {
    public static void run() {
        Check.eq(Ch02Numbers.wrapped(), Integer.MIN_VALUE);
        Check.eq(Ch02Numbers.product(100000, 100000), 10_000_000_000L);
        Check.eq(100000 * 100000, 1410065408); // what int arithmetic gives
    }
}

class Ex2_2Test {
    public static void run() {
        Check.yes(Ch02Numbers.productFits(3_000_000_000L, 3));
        Check.no(Ch02Numbers.productFits(4_000_000_000L, 4_000_000_000L));
    }
}

class Ex2_3Test {
    public static void run() {
        Check.eq(Ch02Numbers.truncDivMod(-7, 2), new long[]{-3, -1});
        Check.eq(Ch02Numbers.floorDivMod(-7, 2), new long[]{-4, 1});
    }
}

class Ex2_4Test {
    public static void run() {
        Check.eq(Ch02Numbers.ceilDiv(7, 2), 4L);
        Check.eq(Ch02Numbers.ceilDiv(-7, 2), -3L);
        Check.eq(Ch02Numbers.ceilDiv(6, 3), 2L);
    }
}

class Ex2_5Test {
    public static void run() {
        Check.eq(Ch02Numbers.modPow(2, 10, Ch02Numbers.MOD), 1024L);
        Check.eq(Ch02Numbers.modPow(2, 100, Ch02Numbers.MOD), 976371285L);
        Check.eq(123456L * Ch02Numbers.modInv(123456) % Ch02Numbers.MOD, 1L);
    }
}

class Ex2_6Test {
    public static void run() {
        Check.eq(Ch02Numbers.factorialDigits(20), 19);
        Check.eq(Ch02Numbers.factorialDigits(100), 158);
    }
}

class Ex2_7Test {
    public static void run() {
        Check.yes(Ch02Numbers.close(0.1 + 0.2, 0.3, 1e-9));
        Check.no(Ch02Numbers.close(0.1, 0.2, 1e-9));
        Check.no(0.1 + 0.2 == 0.3);
    }
}

class Ex2_8Test {
    public static void run() {
        Check.eq(Ch02Numbers.isqrt(99), 9L);
        Check.eq(Ch02Numbers.isqrt(100), 10L);
        Check.eq(Ch02Numbers.isqrt(999_999_999_999_999_999L), 999_999_999L);
        Check.eq(Ch02Numbers.isqrt(Long.MAX_VALUE), 3037000499L);
    }
}

class Ex2_9Test {
    public static void run() {
        Check.eq(Ch02Numbers.digitSum(9045), 18);
        Check.eq(Ch02Numbers.reverseDigits(-1200), -21L);
    }
}
