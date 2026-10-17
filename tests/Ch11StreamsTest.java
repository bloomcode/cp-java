import java.util.List;

/** Chapter 11 tests, one class per exercise. */
class Ex11_1Test {
    public static void run() {
        Check.eq(Ch11Streams.fold(new int[]{2, 3, 4}, 0, (a, b) -> a + b), 9);
        Check.eq(Ch11Streams.fold(new int[]{2, 3, 4}, 1, (a, b) -> a * b), 24);
        Check.eq(Ch11Streams.fold(new int[]{2, 3, 4}, Integer.MIN_VALUE, Math::max), 4);
    }
}

class Ex11_2Test {
    public static void run() {
        Check.eq(Ch11Streams.pipeline().apply(4), 10);
        Check.yes(Ch11Streams.shortAndLower().test("abc"));
        Check.no(Ch11Streams.shortAndLower().test("ABC"));
        Check.no(Ch11Streams.shortAndLower().test("toolong"));
    }
}

class Ex11_3Test {
    public static void run() {
        Check.eq(Ch11Streams.sumOfSquares(10), 385L);
        Check.eq(Ch11Streams.sumOfSquares(100000), 333338333350000L);
        Check.eq(Ch11Streams.evensBelow(9), new int[]{0, 2, 4, 6, 8});
    }
}

class Ex11_4Test {
    public static void run() {
        Check.eq(Ch11Streams.shout(List.of("tea", "coffee", "milk", "go")), List.of("COFFEE", "MILK"));
    }
}

class Ex11_5Test {
    public static void run() {
        Check.eq(Ch11Streams.lengthHistogram(List.of("a", "bb", "cc", "ddd")).toString(), "{1=1, 2=2, 3=1}");
    }
}

class Ex11_6Test {
    public static void run() {
        Check.eq(Ch11Streams.joinInts(new int[]{1, 2, 3}), "1 2 3");
    }
}

class Ex11_7Test {
    public static void run() {
        Check.eq(Ch11Streams.longestByInitial(List.of("ant", "apple", "bee", "bison")).toString(), "{a=apple, b=bison}");
    }
}

class Ex11_8Test {
    public static void run() {
        Check.eq(Ch11Streams.loopSum(new int[]{1, 2, 3}), 6L);
        Check.eq(Ch11Streams.streamSum(new int[]{1, 2, 3}), 6L);
        Check.eq(Ch11Streams.boxedAdd().apply(2, 3), 5);
    }
}
