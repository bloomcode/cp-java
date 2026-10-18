import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/** Chapter 17 tests, one class per exercise. */

class Ex17_1Test {
    public static void run() {
        Check.eq(Ch17Errors.parsePort(" 8080 "), 8080);
        Check.eq(Ch17Errors.parsePort("65535"), 65535);
        Check.eq(message(() -> Ch17Errors.parsePort("http")), "not a number: http");
        Check.eq(message(() -> Ch17Errors.parsePort("0")), "out of range: 0");
        Check.eq(message(() -> Ch17Errors.parsePort("70000")), "out of range: 70000");
        Check.throwsEx(IllegalArgumentException.class, () -> Ch17Errors.parsePort(""));
    }

    static String message(Runnable r) {
        try {
            r.run();
        } catch (RuntimeException e) {
            return e.getMessage();
        }
        return null;
    }
}

class Ex17_2Test {
    public static void run() {
        try {
            Check.eq(Ch17Errors.withdraw(100, 30), 70);
            Check.eq(Ch17Errors.withdraw(5, 5), 0);
        } catch (Ch17Errors.InsufficientFundsException e) {
            throw new AssertionError("unexpected " + e);
        }
        try {
            Ch17Errors.withdraw(20, 50);
            throw new AssertionError("expected InsufficientFundsException");
        } catch (Ch17Errors.InsufficientFundsException e) {
            Check.eq(new int[] {e.needed, e.available}, new int[] {50, 20});
            Check.eq(e.getMessage(), "needed 50, available 20");
        }
    }
}

class Ex17_3Test {
    public static void run() {
        Check.eq(Ch17Errors.numberSetting(Map.of("port", "80"), "port"), 80);
        try {
            Ch17Errors.numberSetting(Map.of(), "port");
            throw new AssertionError("expected ConfigException");
        } catch (Ch17Errors.ConfigException e) {
            Check.eq(e.getMessage(), "setting port");
            Check.yes(e.getCause() instanceof NoSuchElementException);
        }
        try {
            Ch17Errors.numberSetting(Map.of("port", "eighty"), "port");
            throw new AssertionError("expected ConfigException");
        } catch (Ch17Errors.ConfigException e) {
            Check.yes(e.getCause() instanceof NumberFormatException);
        }
    }
}

class Ex17_4Test {
    public static void run() {
        List<String> log = new ArrayList<>();
        Ch17Errors.runSteps(List.of(() -> log.add("a"), () -> log.add("b")), log);
        Check.eq(log, List.of("start", "a", "b", "done"));
        List<String> log2 = new ArrayList<>();
        Check.throwsEx(IllegalStateException.class, () -> Ch17Errors.runSteps(List.of(() -> log2.add("a"), () -> {
            throw new IllegalStateException("boom");
        }, () -> log2.add("never")), log2));
        Check.eq(log2, List.of("start", "a", "done"));
    }
}

class Ex17_5Test {
    public static void run() {
        List<String> want = List.of("open a", "open b", "work", "close b", "close a");
        List<String> log = new ArrayList<>();
        Ch17Errors.useTwo(log, false);
        Check.eq(log, want);
        List<String> log2 = new ArrayList<>();
        Check.throwsEx(IllegalStateException.class, () -> Ch17Errors.useTwo(log2, true));
        Check.eq(log2, want);
    }
}

class Ex17_6Test {
    public static void run() {
        Ch17Errors.Ages ages = Ch17Errors.parseAges(List.of("34", "x", "200", " 7 "));
        Check.eq(ages.values(), List.of(34, 7));
        Check.eq(ages.problems(), List.of("row 2: not a number: x", "row 3: out of range: 200"));
        Check.eq(Ch17Errors.parseAges(List.of()), new Ch17Errors.Ages(List.of(), List.of()));
        Check.eq(Ch17Errors.parseAges(List.of("0", "150")).values(), List.of(0, 150));
        Check.eq(Ch17Errors.parseAges(List.of("-1")).problems(), List.of("row 1: out of range: -1"));
    }
}
