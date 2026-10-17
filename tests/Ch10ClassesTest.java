import java.util.HashSet;
import java.util.List;

/** Chapter 10 tests, one class per exercise. */
class Ex10_1Test {
    public static void run() {
        Ch10Classes.Counter c = new Ch10Classes.Counter();
        c.increment();
        c.increment();
        c.add(5);
        Check.eq(c.get(), 7);
        Check.throwsEx(IllegalArgumentException.class, () -> c.add(-1));
    }
}

class Ex10_2Test {
    public static void run() {
        Check.eq(new HashSet<>(List.of(new Ch10Classes.Edge(1, 2, 5), new Ch10Classes.Edge(1, 2, 5))).size(), 1);
        Check.no(new Ch10Classes.Edge(1, 2, 5).equals(new Ch10Classes.Edge(2, 1, 5)));
    }
}

class Ex10_3Test {
    public static void run() {
        Check.yes(new Ch10Classes.Interval(1, 5).overlaps(new Ch10Classes.Interval(5, 9)));
        Check.no(new Ch10Classes.Interval(1, 4).overlaps(new Ch10Classes.Interval(5, 9)));
        Check.eq(new Ch10Classes.Interval(2, 7).length(), 5);
        Check.throwsEx(IllegalArgumentException.class, () -> new Ch10Classes.Interval(3, 1));
    }
}

class Ex10_4Test {
    public static void run() {
        Check.near(Ch10Classes.totalArea(List.of(new Ch10Classes.Rect(2, 3), new Ch10Classes.Circle(1))), 6 + Math.PI, 1e-9);
        Check.near(Ch10Classes.totalArea(List.of()), 0, 1e-12);
    }
}

class Ex10_5Test {
    public static void run() {
        Check.eq(Ch10Classes.eval(new Ch10Classes.Add(new Ch10Classes.Num(2),
                new Ch10Classes.Mul(new Ch10Classes.Num(3), new Ch10Classes.Num(4)))), 14L);
    }
}

class Ex10_6Test {
    public static void run() {
        Check.eq(Ch10Classes.swap(new Ch10Classes.Pair<>("x", 1)).toString(), "Pair[first=1, second=x]");
    }
}

class Ex10_7Test {
    public static void run() {
        Check.eq(Ch10Classes.maxOf(List.of(3, 9, 2)), 9);
        Check.eq(Ch10Classes.maxOf(List.of("pear", "apple")), "pear");
    }
}

class Ex10_8Test {
    public static void run() {
        Ch10Classes.Stack<Integer> st = new Ch10Classes.Stack<>();
        st.push(1);
        st.push(2);
        Check.eq(st.pop(), 2);
        Check.eq(st.peek(), 1);
        Check.eq(st.size(), 1);
        st.pop();
        Check.yes(st.isEmpty());
        Check.throwsEx(IllegalStateException.class, st::pop);
    }
}
