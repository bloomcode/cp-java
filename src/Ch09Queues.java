import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/** Chapter 9 - Deque, PriorityQueue and TreeSet. */
public class Ch09Queues {

    // ==== EX 9.1 | ArrayDeque as a stack | Core
    // PROMPT: Write `static boolean balanced(String s)` for brackets `()[]{}` using an `ArrayDeque<Character>` with `push`, `pop` and `peek`. Avoid the legacy `Stack` class.
    // EXAMPLE: `balanced("{[()]}")` -> `true`; `balanced("([)]")` -> `false`
    // BIGO: O(N). `Stack` is synchronized and extends `Vector`; `ArrayDeque` is the modern choice.
    static boolean balanced(String s) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.2 | ArrayDeque as a queue: BFS on a grid | Core
    // PROMPT: Write `static int shortestPath(String[] grid)` returning the fewest moves from the top-left to the bottom-right cell through '.' cells (4 directions), or -1. Use `offer` and `poll`.
    // EXAMPLE: `{"..#", "#..", "#.."}` -> `4`
    // BIGO: O(R * C). Store cells as `int[]{r, c}` or encode them as `r * cols + c`.
    static int shortestPath(String[] grid) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.3 | Sliding window maximum with a deque | Practice
    // PROMPT: Write `static int[] windowMax(int[] a, int k)` keeping a deque of indices whose values decrease from front to back.
    // EXAMPLE: `windowMax(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)` -> `[3, 3, 5, 5, 6, 7]`
    // BIGO: O(N): each index enters and leaves once.
    static int[] windowMax(int[] a, int k) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.4 | PriorityQueue: min-heap and max-heap | Core
    // PROMPT: Write `static List<Integer> drainAscending(int[] a)` with a default `PriorityQueue<Integer>` (a min-heap) and `static List<Integer> drainDescending(int[] a)` with `Collections.reverseOrder()`.
    // EXAMPLE: `{5, 1, 4}` -> ascending `[1, 4, 5]`, descending `[5, 4, 1]`
    // BIGO: O(N log N). Iterating a `PriorityQueue` with for-each does not give sorted order; only `poll` does.
    static List<Integer> drainAscending(int[] a) {
        throw new UnsupportedOperationException();
    }

    static List<Integer> drainDescending(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.5 | K largest with a size-k heap | Core
    // PROMPT: Write `static List<Integer> kLargest(int[] a, int k)` keeping a min-heap of size k, returned in descending order.
    // EXAMPLE: `kLargest(new int[]{7, 2, 9, 4, 9, 1}, 3)` -> `[9, 9, 7]`
    // BIGO: O(N log k).
    static List<Integer> kLargest(int[] a, int k) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.6 | Heap of arrays: Dijkstra's queue | Core
    // PROMPT: Write `static List<String> processByCost(int[][] jobs)` where each job is `{cost, id}`; poll from a `PriorityQueue<int[]>` ordered by cost then id, returning `"id:cost"` strings.
    // EXAMPLE: `{{5, 1}, {2, 7}, {5, 0}}` -> `["7:2", "0:5", "1:5"]`
    // BIGO: O(N log N). Use `long[]` when costs can pass 2^31 - 1, as path lengths often do.
    static List<String> processByCost(int[][] jobs) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.7 | Running median with two heaps | Practice
    // PROMPT: Write `static double[] runningMedian(int[] a)`: after each value, the median so far. Keep a max-heap for the low half and a min-heap for the high half.
    // EXAMPLE: `runningMedian(new int[]{5, 15, 1, 3})` -> `[5.0, 10.0, 5.0, 4.0]`
    // BIGO: O(N log N).
    static double[] runningMedian(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.8 | TreeSet: nearest neighbour | Core
    // PROMPT: Write `static int[] closestSeen(int[] a)` where `out[i]` is the smallest |a[i] - a[j]| over earlier j (or -1 for i = 0), using `TreeSet.floor` and `ceiling`.
    // EXAMPLE: `closestSeen(new int[]{5, 9, 1, 6})` -> `[-1, 4, 4, 1]`
    // BIGO: O(N log N). `floor`, `ceiling`, `lower`, `higher`, `first`, `last`, `pollFirst` are all O(log N).
    static int[] closestSeen(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 9.9 | A multiset from TreeMap | Practice
    // PROMPT: Java has no multiset. Write `static class MultiSet` over `TreeMap<Integer, Integer>` with `add`, `remove` (one copy), `min`, `max` and `size`.
    // EXAMPLE: add 5, 1, 5; remove 1 -> min `5`, max `5`, size `2`
    // BIGO: O(log N) per operation.
    static class MultiSet {
        private final TreeMap<Integer, Integer> m = new TreeMap<>();
        private int size;

        void add(int x) {
            throw new UnsupportedOperationException();
        }

        boolean remove(int x) {
            throw new UnsupportedOperationException();
        }

        int min() { throw new UnsupportedOperationException(); }

        int max() { throw new UnsupportedOperationException(); }

        int size() { throw new UnsupportedOperationException(); }
    }
    // ==== END
}
