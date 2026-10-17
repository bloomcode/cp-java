import java.util.List;

/** Chapter 13 tests, one class per exercise. */
class Ex13_1Test {
    public static void run() {
        int b = 0b1010;
        Check.yes(Ch13Bits.isSet(b, 1));
        Check.no(Ch13Bits.isSet(b, 0));
        Check.eq(new int[]{Ch13Bits.set(b, 0), Ch13Bits.clear(b, 3), Ch13Bits.toggle(b, 2)}, new int[]{11, 2, 14});
    }
}

class Ex13_2Test {
    public static void run() {
        Check.eq(Ch13Bits.bitAt(40), 1099511627776L);
        int forty = 40;
        Check.eq(1 << forty, 256); // the trap: int shifts wrap at 32
    }
}

class Ex13_3Test {
    public static void run() {
        Check.eq(Ch13Bits.midpoint(2_000_000_000, 2_100_000_000), 2050000000);
        Check.eq(-16 >> 2, -4);
        Check.eq(-16 >>> 28, 15);
    }
}

class Ex13_4Test {
    public static void run() {
        Check.eq(Ch13Bits.bitFacts(40), new int[]{2, 3, 5});
    }
}

class Ex13_5Test {
    public static void run() {
        Check.yes(Ch13Bits.isPowerOfTwo(64));
        Check.no(Ch13Bits.isPowerOfTwo(0));
        Check.no(Ch13Bits.isPowerOfTwo(12));
        Check.eq(Ch13Bits.lowestBit(40), 8L);
    }
}

class Ex13_6Test {
    public static void run() {
        Check.eq(Ch13Bits.subsetsByMask(new int[]{1, 2}), List.of(List.of(), List.of(1), List.of(2), List.of(1, 2)));
    }
}

class Ex13_7Test {
    public static void run() {
        Check.eq(Ch13Bits.loneValue(new int[]{4, 1, 2, 1, 2}), 4);
        Check.eq(Ch13Bits.missing(new int[]{3, 0, 1}), 2);
    }
}

class Ex13_8Test {
    public static void run() {
        Check.eq(Ch13Bits.submasks(0b101), List.of(5, 4, 1, 0));
    }
}
