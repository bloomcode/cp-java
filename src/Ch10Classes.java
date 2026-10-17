import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Chapter 10 - Classes, records, interfaces and generics. */
public class Ch10Classes {

    // ==== EX 10.1 | A small class with encapsulation | Core
    // PROMPT: Write `static class Counter` with a private `count`, `increment()`, `add(int)` that rejects negatives with `IllegalArgumentException`, and `get()`.
    // EXAMPLE: increment twice, add 5 -> `get()` is `7`; `add(-1)` throws
    // BIGO: O(1).
    static class Counter {
        private int count;

        void increment() { throw new UnsupportedOperationException(); }

        void add(int n) {
            throw new UnsupportedOperationException();
        }

        int get() { throw new UnsupportedOperationException(); }
    }
    // ==== END

    // ==== EX 10.2 | equals and hashCode together | Core
    // PROMPT: Write `static final class Edge` with fields `u`, `v` and `w`, overriding `equals` and `hashCode` (via `Objects.hash`) so equal edges collapse in a `HashSet`.
    // EXAMPLE: `new HashSet<>(List.of(new Edge(1, 2, 5), new Edge(1, 2, 5))).size()` -> `1`
    // BIGO: O(1).
    // NOTE: Override both or neither. An `equals` without a matching `hashCode` silently breaks `HashMap` and `HashSet`.
    static final class Edge {
        final int u, v, w;

        Edge(int u, int v, int w) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean equals(Object o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int hashCode() { throw new UnsupportedOperationException(); }

        @Override
        public String toString() { throw new UnsupportedOperationException(); }
    }
    // ==== END

    // ==== EX 10.3 | Records with validation | Core
    // PROMPT: Write `record Interval(int lo, int hi)` whose compact constructor rejects `lo > hi`, with a `length()` method and a `boolean overlaps(Interval o)`.
    // EXAMPLE: `new Interval(1, 5).overlaps(new Interval(5, 9))` -> `true`; `new Interval(3, 1)` throws
    // BIGO: O(1). Records are final and immutable and get `equals`, `hashCode` and `toString` for free.
    record Interval(int lo, int hi) {
        Interval {
            throw new UnsupportedOperationException();
        }

        int length() { throw new UnsupportedOperationException(); }

        boolean overlaps(Interval o) { throw new UnsupportedOperationException(); }
    }
    // ==== END

    // ==== EX 10.4 | Interfaces and polymorphism | Core
    // PROMPT: Write `interface Shape { double area(); }` and records `Circle(double r)` and `Rect(double w, double h)` implementing it, plus `static double totalArea(List<Shape> shapes)`.
    // EXAMPLE: `[Rect(2, 3), Circle(1)]` -> `6 + pi` ~ `9.1416`
    // BIGO: O(N).
    interface Shape {
        double area();
    }

    record Circle(double r) implements Shape {
        public double area() { throw new UnsupportedOperationException(); }
    }

    record Rect(double w, double h) implements Shape {
        public double area() { throw new UnsupportedOperationException(); }
    }

    static double totalArea(List<Shape> shapes) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 10.5 | Pattern matching with sealed types | Practice
    // PROMPT: Write `sealed interface Expr` with records `Num(long v)`, `Add(Expr l, Expr r)` and `Mul(Expr l, Expr r)`, and `static long eval(Expr e)` using a switch with type patterns (Java 21).
    // EXAMPLE: `eval(new Add(new Num(2), new Mul(new Num(3), new Num(4))))` -> `14`
    // BIGO: O(size of the tree). Because the interface is sealed, the switch needs no `default`.
    sealed interface Expr permits Num, Add, Mul {}

    record Num(long v) implements Expr {}

    record Add(Expr l, Expr r) implements Expr {}

    record Mul(Expr l, Expr r) implements Expr {}

    static long eval(Expr e) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 10.6 | A generic Pair | Core
    // PROMPT: Write `record Pair<A, B>(A first, B second)` and `static <A, B> Pair<B, A> swap(Pair<A, B> p)`.
    // EXAMPLE: `swap(new Pair<>("x", 1))` -> `Pair[first=1, second=x]`
    // BIGO: O(1).
    record Pair<A, B>(A first, B second) {}

    static <A, B> Pair<B, A> swap(Pair<A, B> p) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 10.7 | Bounded generics | Core
    // PROMPT: Write `static <T extends Comparable<T>> T maxOf(List<T> xs)` that works for `Integer`, `String` and your own `Comparable` types.
    // EXAMPLE: `maxOf(List.of(3, 9, 2))` -> `9`; `maxOf(List.of("pear", "apple"))` -> `"pear"`
    // BIGO: O(N).
    static <T extends Comparable<T>> T maxOf(List<T> xs) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 10.8 | A generic growable stack | Practice
    // PROMPT: Write `static class Stack<T>` backed by an `ArrayList<T>`, with `push`, `pop` and `peek` throwing `IllegalStateException` when empty, plus `isEmpty` and `size`.
    // EXAMPLE: push 1, push 2, pop -> `2`; peek -> `1`; size -> `1`
    // BIGO: O(1) amortized per operation.
    static class Stack<T> {
        private final List<T> items = new ArrayList<>();

        void push(T x) { throw new UnsupportedOperationException(); }

        T pop() {
            throw new UnsupportedOperationException();
        }

        T peek() {
            throw new UnsupportedOperationException();
        }

        boolean isEmpty() { throw new UnsupportedOperationException(); }

        int size() { throw new UnsupportedOperationException(); }
    }
    // ==== END
}
