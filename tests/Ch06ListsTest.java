import java.util.ArrayList;
import java.util.List;

/** Chapter 6 tests, one class per exercise. */
class Ex6_1Test {
    public static void run() {
        Integer x = 1000, y = 1000;
        Check.yes(Ch06Lists.boxedEquals(x, y));
        Check.no(Ch06Lists.boxedEquals(x, 999));
    }
}

class Ex6_2Test {
    public static void run() {
        List<Integer> l = new ArrayList<>(List.of(10, 20, 30));
        Ch06Lists.removeValue(l, 20);
        Check.eq(l, List.of(10, 30));
    }
}

class Ex6_3Test {
    public static void run() {
        List<Integer> neg = new ArrayList<>(List.of(3, -1, 4, -5));
        Ch06Lists.dropNegatives(neg);
        Check.eq(neg, List.of(3, 4));
    }
}

class Ex6_4Test {
    public static void run() {
        Check.eq(Ch06Lists.withExtra(List.of(1, 2), 3), List.of(1, 2, 3));
    }
}

class Ex6_5Test {
    public static void run() {
        Check.eq(Ch06Lists.summary(List.of(4, 9, 1, 9)), new int[]{9, 1, 2});
        Check.eq(Ch06Lists.reversedCopy(List.of(1, 2, 3)), List.of(3, 2, 1));
    }
}

class Ex6_6Test {
    public static void run() {
        Check.eq(Ch06Lists.uniqueInOrder(List.of(3, 1, 3, 2, 1)), List.of(3, 1, 2));
    }
}

class Ex6_7Test {
    public static void run() {
        Check.eq(Ch06Lists.adjacency(3, new int[][]{{0, 1}, {1, 2}}), List.of(List.of(1), List.of(0, 2), List.of(1)));
    }
}

class Ex6_8Test {
    public static void run() {
        Check.eq(Ch06Lists.toIntArray(List.of(1, 2, 3)), new int[]{1, 2, 3});
        Check.eq(Ch06Lists.toList(new int[]{4, 5}), List.of(4, 5));
    }
}
