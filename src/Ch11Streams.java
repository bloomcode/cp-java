import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Chapter 11 - Lambdas and streams. */
public class Ch11Streams {

    // ==== EX 11.1 | Functional interfaces | Core
    // PROMPT: Write `static int fold(int[] a, int start, IntBinaryOperator op)` and call it with lambdas for sum, product and max.
    // EXAMPLE: `fold(new int[]{2, 3, 4}, 0, (x, y) -> x + y)` -> `9`; with `Math::max` and start `Integer.MIN_VALUE` -> `4`
    // BIGO: O(N). Primitive interfaces like `IntBinaryOperator` avoid boxing that `BinaryOperator<Integer>` would add.
    static int fold(int[] a, int start, IntBinaryOperator op) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.2 | Composing functions | Core
    // PROMPT: Write `static Function<Integer, Integer> pipeline()` that adds 1 then doubles with `andThen`, and `static Predicate<String> shortAndLower()` combining two predicates with `and`.
    // EXAMPLE: `pipeline().apply(4)` -> `10`; `shortAndLower().test("abc")` -> `true`, `"ABC"` -> `false`
    // BIGO: O(1) per call.
    static Function<Integer, Integer> pipeline() {
        throw new UnsupportedOperationException();
    }

    static Predicate<String> shortAndLower() {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.3 | IntStream basics | Core
    // PROMPT: Write `static long sumOfSquares(int n)` with `IntStream.rangeClosed(1, n).asLongStream()` and `static int[] evensBelow(int n)` with `filter`.
    // EXAMPLE: `sumOfSquares(10)` -> `385`; `evensBelow(9)` -> `[0, 2, 4, 6, 8]`
    // BIGO: O(N). Convert to `long` before squaring or summing so nothing overflows.
    static long sumOfSquares(int n) {
        throw new UnsupportedOperationException();
    }

    static int[] evensBelow(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.4 | map, filter, collect | Core
    // PROMPT: Write `static List<String> shout(List<String> words)` keeping words longer than 3 characters, uppercased, sorted, with `.toList()`.
    // EXAMPLE: `["tea", "coffee", "milk", "go"]` -> `["COFFEE", "MILK"]`
    // BIGO: O(N log N).
    static List<String> shout(List<String> words) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.5 | groupingBy and counting | Core
    // PROMPT: Write `static Map<Integer, Long> lengthHistogram(List<String> words)` with `Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting())`.
    // EXAMPLE: `["a", "bb", "cc", "ddd"]` -> `{1=1, 2=2, 3=1}`
    // BIGO: O(N log K) for K distinct lengths.
    static Map<Integer, Long> lengthHistogram(List<String> words) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.6 | joining and boxed | Core
    // PROMPT: Write `static String joinInts(int[] a)` producing space-separated values with `Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" "))`.
    // EXAMPLE: `joinInts(new int[]{1, 2, 3})` -> `"1 2 3"`
    // BIGO: O(N).
    static String joinInts(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.7 | toMap with a merge function | Core
    // PROMPT: Write `static Map<Character, String> longestByInitial(List<String> words)` with `Collectors.toMap(key, value, merge, TreeMap::new)`, keeping the longer word on collision (the first one on ties).
    // EXAMPLE: `["ant", "apple", "bee", "bison"]` -> `{a=apple, b=bison}`
    // BIGO: O(N log K). `toMap` without a merge function throws `IllegalStateException` on duplicate keys.
    static Map<Character, String> longestByInitial(List<String> words) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 11.8 | When not to stream | Core
    // PROMPT: Write `static long loopSum(int[] a)` with a plain loop and `static long streamSum(int[] a)` with `Arrays.stream(a).asLongStream().sum()`, and `static BiFunction<Integer, Integer, Integer> boxedAdd()`. Explain why hot inner loops in contests should use plain loops over primitives.
    // EXAMPLE: both sums of `{1, 2, 3}` -> `6`; `boxedAdd().apply(2, 3)` -> `5`
    // BIGO: Both O(N); streams add setup cost per call and boxed lambdas allocate, which matters inside loops run 10^7 times.
    static long loopSum(int[] a) {
        throw new UnsupportedOperationException();
    }

    static long streamSum(int[] a) {
        throw new UnsupportedOperationException();
    }

    static BiFunction<Integer, Integer, Integer> boxedAdd() {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
