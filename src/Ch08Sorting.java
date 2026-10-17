import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** Chapter 8 - Sorting and comparators. */
public class Ch08Sorting {

    // ==== EX 8.1 | comparing and thenComparing | Core
    // PROMPT: Declare `record Player(String name, int score)` and write `static List<Player> leaderboard(List<Player> ps)`: highest score first, ties alphabetical, with `Comparator.comparingInt(...).reversed().thenComparing(...)`.
    // EXAMPLE: `[bo 80, al 95, cy 80]` -> `[al 95, bo 80, cy 80]`
    // BIGO: O(N log N).
    // NOTE: `.reversed()` reverses everything built so far, so put it right after the key it should apply to.
    record Player(String name, int score) {}

    static List<Player> leaderboard(List<Player> ps) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 8.2 | Sort intervals by start, then end | Core
    // PROMPT: Write `static void sortIntervals(int[][] iv)` with `Arrays.sort(iv, (a, b) -> ...)` using `Integer.compare`.
    // EXAMPLE: `{{3, 5}, {1, 4}, {1, 2}}` -> `[[1, 2], [1, 4], [3, 5]]`
    // BIGO: O(N log N); object arrays use TimSort.
    static void sortIntervals(int[][] iv) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 8.3 | The subtraction comparator bug | Core
    // PROMPT: Write `static int badCompare(int a, int b)` returning `a - b` and `static int goodCompare(int a, int b)` with `Integer.compare`. Find inputs where `badCompare` gets the sign wrong.
    // EXAMPLE: `badCompare(Integer.MIN_VALUE, 1)` -> positive (wrong); `goodCompare(Integer.MIN_VALUE, 1)` -> negative
    // BIGO: O(1).
    static int badCompare(int a, int b) {
        throw new UnsupportedOperationException();
    }

    static int goodCompare(int a, int b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 8.4 | Implement Comparable | Core
    // PROMPT: Write `static class Task implements Comparable<Task>` with `priority` and `name`, ordered by priority then name, so `Collections.sort` and `PriorityQueue` need no comparator.
    // EXAMPLE: sorting `[(2, b), (1, z), (2, a)]` -> names `[z, a, b]`
    // BIGO: O(1) per comparison.
    static class Task implements Comparable<Task> {
        final int priority;
        final String name;

        Task(int priority, String name) {
            throw new UnsupportedOperationException();
        }

        @Override
        public int compareTo(Task o) {
            throw new UnsupportedOperationException();
        }
    }
    // ==== END

    // ==== EX 8.5 | Descending order for primitives | Core
    // PROMPT: `Arrays.sort(int[])` has no comparator overload. Write `static void sortDesc(int[] a)` that sorts ascending and reverses in place, and `static Integer[] sortDescBoxed(Integer[] a)` with `Collections.reverseOrder()`.
    // EXAMPLE: `{3, 1, 2}` -> `[3, 2, 1]` both ways
    // BIGO: O(N log N); the primitive version avoids boxing.
    static void sortDesc(int[] a) {
        throw new UnsupportedOperationException();
    }

    static Integer[] sortDescBoxed(Integer[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 8.6 | Stable sorting | Core
    // PROMPT: Declare `record Person(String name, String dept, int age)` and write `static List<Person> byDeptThenAge(List<Person> ps)` by sorting by age, then stably by dept. `List.sort` is guaranteed stable.
    // EXAMPLE: `[(a, ops, 40), (b, dev, 30), (c, ops, 25)]` -> names `[b, c, a]`
    // BIGO: O(N log N).
    record Person(String name, String dept, int age) {}

    static List<Person> byDeptThenAge(List<Person> ps) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 8.7 | Largest number from concatenation | Practice
    // PROMPT: Write `static String largestNumber(int[] nums)`: sort the numbers as strings with the comparator `(x, y) -> (y + x).compareTo(x + y)`.
    // EXAMPLE: `{3, 30, 34, 5, 9}` -> `"9534330"`; `{0, 0}` -> `"0"`
    // BIGO: O(N log N) comparisons.
    static String largestNumber(int[] nums) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 8.8 | Argsort | Core
    // PROMPT: Write `static Integer[] argsort(int[] a)` returning indices sorted by their values, by sorting an `Integer[]` of indices with `Comparator.comparingInt(i -> a[i])`.
    // EXAMPLE: `argsort(new int[]{30, 10, 20})` -> `[1, 2, 0]`
    // BIGO: O(N log N).
    static Integer[] argsort(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
