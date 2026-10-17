import java.util.List;

/** Chapter 4 tests, one class per exercise. */
class Ex4_1Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.fizzbuzz(5), List.of("1", "2", "Fizz", "4", "Buzz"));
        Check.eq(Ch04ControlFlow.fizzbuzz(15).get(14), "FizzBuzz");
    }
}

class Ex4_2Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.findInGrid(new int[][]{{1, 2}, {3, 4}}, 3), new int[]{1, 0});
        Check.eq(Ch04ControlFlow.findInGrid(new int[][]{{1, 2}, {3, 4}}, 9), null);
    }
}

class Ex4_3Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.collatzSteps(6), 8);
        Check.eq(Ch04ControlFlow.collatzSteps(1), 0);
    }
}

class Ex4_4Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.calc('*', 6, 7), 42L);
        Check.eq(Ch04ControlFlow.calc('/', 7, 2), 3L);
        Check.throwsEx(IllegalArgumentException.class, () -> Ch04ControlFlow.calc('%', 1, 2));
    }
}

class Ex4_5Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.clampAll(new int[]{-5, 3, 12}, 0, 10), new int[]{0, 3, 10});
    }
}

class Ex4_6Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.pyramid(3), List.of("  *", " ***", "*****"));
    }
}

class Ex4_7Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.digitCount(0), 1);
        Check.eq(Ch04ControlFlow.digitCount(-12345), 5);
    }
}

class Ex4_8Test {
    public static void run() {
        Check.eq(Ch04ControlFlow.sumUntilNegative(new int[]{4, 0, 3, -1, 10}), 7);
        Check.eq(Ch04ControlFlow.sumUntilNegative(new int[]{}), 0);
    }
}
