import java.io.StringReader;

/** Chapter 1 tests, one class per exercise. */
class Ex1_1Test {
    public static void run() {
        Check.eq(Ch01FastIO.readInts("3 -4 10"), new int[]{3, -4, 10});
        Check.eq(Ch01FastIO.readInts("7"), new int[]{7});
    }
}

class Ex1_2Test {
    public static void run() {
        Ch01FastIO.FastReader fr = new Ch01FastIO.FastReader(new StringReader("3\n10 20\n30"));
        Check.eq(fr.nextInt(), 3);
        Check.eq(fr.nextInt(), 10);
        Check.eq(fr.nextLong(), 20L);
        Check.eq(fr.nextInt(), 30);
        Check.eq(fr.next(), null);
    }
}

class Ex1_3Test {
    public static void run() {
        Check.eq(Ch01FastIO.readArray("4\n5 1 9 2"), new int[]{5, 1, 9, 2});
    }
}

class Ex1_4Test {
    public static void run() {
        Check.eq(Ch01FastIO.readGrid("2 3\n#.#\n..#"), new char[][]{{'#', '.', '#'}, {'.', '.', '#'}});
    }
}

class Ex1_5Test {
    public static void run() {
        Check.eq(Ch01FastIO.sumCases("2\n1 2\n1000000000000 1"), "3\n1000000000001");
    }
}

class Ex1_6Test {
    public static void run() {
        Check.eq(Ch01FastIO.fmt(2.0 / 3), "0.666667");
        Check.eq(Ch01FastIO.fmtRow("ann", 42), "ann          42");
    }
}

class Ex1_7Test {
    public static void run() {
        Check.eq(Ch01FastIO.joinLine(new int[]{3, 1, 2}), "3 1 2");
        Check.eq(Ch01FastIO.joinLine(new int[]{}), "");
    }
}

class Ex1_8Test {
    public static void run() {
        Check.eq(Ch01FastIO.run("5\n3 9 -1 4 7"), "9");
    }
}
