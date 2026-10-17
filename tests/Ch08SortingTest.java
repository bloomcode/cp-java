import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Chapter 8 tests, one class per exercise. */
class Ex8_1Test {
    public static void run() {
        List<Ch08Sorting.Player> board = Ch08Sorting.leaderboard(List.of(new Ch08Sorting.Player("bo", 80),
                new Ch08Sorting.Player("al", 95), new Ch08Sorting.Player("cy", 80)));
        Check.eq(board.stream().map(Ch08Sorting.Player::name).toList(), List.of("al", "bo", "cy"));
    }
}

class Ex8_2Test {
    public static void run() {
        int[][] iv = {{3, 5}, {1, 4}, {1, 2}};
        Ch08Sorting.sortIntervals(iv);
        Check.eq(iv, new int[][]{{1, 2}, {1, 4}, {3, 5}});
    }
}

class Ex8_3Test {
    public static void run() {
        Check.yes(Ch08Sorting.badCompare(Integer.MIN_VALUE, 1) > 0); // the overflow bug
        Check.yes(Ch08Sorting.goodCompare(Integer.MIN_VALUE, 1) < 0);
    }
}

class Ex8_4Test {
    public static void run() {
        List<Ch08Sorting.Task> tasks = new ArrayList<>(List.of(new Ch08Sorting.Task(2, "b"), new Ch08Sorting.Task(1, "z"),
                new Ch08Sorting.Task(2, "a")));
        Collections.sort(tasks);
        Check.eq(tasks.stream().map(t -> t.name).toList(), List.of("z", "a", "b"));
    }
}

class Ex8_5Test {
    public static void run() {
        int[] d = {3, 1, 2};
        Ch08Sorting.sortDesc(d);
        Check.eq(d, new int[]{3, 2, 1});
        Check.eq(Ch08Sorting.sortDescBoxed(new Integer[]{3, 1, 2}), new Integer[]{3, 2, 1});
    }
}

class Ex8_6Test {
    public static void run() {
        List<Ch08Sorting.Person> people = Ch08Sorting.byDeptThenAge(List.of(new Ch08Sorting.Person("a", "ops", 40),
                new Ch08Sorting.Person("b", "dev", 30), new Ch08Sorting.Person("c", "ops", 25)));
        Check.eq(people.stream().map(Ch08Sorting.Person::name).toList(), List.of("b", "c", "a"));
    }
}

class Ex8_7Test {
    public static void run() {
        Check.eq(Ch08Sorting.largestNumber(new int[]{3, 30, 34, 5, 9}), "9534330");
        Check.eq(Ch08Sorting.largestNumber(new int[]{0, 0}), "0");
    }
}

class Ex8_8Test {
    public static void run() {
        Check.eq(Ch08Sorting.argsort(new int[]{30, 10, 20}), new Integer[]{1, 2, 0});
    }
}
