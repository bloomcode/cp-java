import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/** Chapter 7 - HashMap, HashSet, TreeMap and LinkedHashMap. */
public class Ch07Maps {

    // ==== EX 7.1 | Counting with merge | Core
    // PROMPT: Write `static Map<String, Integer> wordCounts(String text)` (lowercased, split on whitespace) using `map.merge(word, 1, Integer::sum)`.
    // EXAMPLE: `wordCounts("To be or not to be")` -> `{to=2, be=2, or=1, not=1}` (any order)
    // BIGO: O(N) words, O(1) average per update.
    static Map<String, Integer> wordCounts(String text) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.2 | Grouping with computeIfAbsent | Core
    // PROMPT: Write `static Map<Character, List<String>> groupByFirst(List<String> words)` with `computeIfAbsent(key, k -> new ArrayList<>()).add(word)`.
    // EXAMPLE: `["apple", "bat", "avocado"]` -> `{a=[apple, avocado], b=[bat]}`
    // BIGO: O(N).
    static Map<Character, List<String>> groupByFirst(List<String> words) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.3 | Iterate with entrySet | Core
    // PROMPT: Write `static String mostFrequent(Map<String, Integer> counts)` returning the key with the largest count, breaking ties by the alphabetically smaller key. Loop over `entrySet()`.
    // EXAMPLE: `{b=2, a=2, c=1}` -> `"a"`
    // BIGO: O(N).
    static String mostFrequent(Map<String, Integer> counts) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.4 | Set operations without destroying the inputs | Core
    // PROMPT: Write `static Set<Integer> common(Set<Integer> a, Set<Integer> b)` and `static Set<Integer> onlyIn(Set<Integer> a, Set<Integer> b)` with `retainAll` and `removeAll` on copies.
    // EXAMPLE: a = {1, 2, 3, 4}, b = {3, 4, 5} -> common `{3, 4}`, onlyIn(a, b) `{1, 2}`; a is unchanged
    // BIGO: O(N + M).
    // NOTE: `retainAll` and `removeAll` modify the set you call them on, so copy first.
    static Set<Integer> common(Set<Integer> a, Set<Integer> b) {
        throw new UnsupportedOperationException();
    }

    static Set<Integer> onlyIn(Set<Integer> a, Set<Integer> b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.5 | Records as map keys | Core
    // PROMPT: Declare `record Point(int x, int y)` and write `static Point busiest(List<Point> pts)` returning the most frequent point (ties: smallest x, then y). Records generate `equals` and `hashCode`.
    // EXAMPLE: `[(1,2), (0,0), (1,2), (0,0), (3,3)]` -> `Point[x=0, y=0]`
    // BIGO: O(N). Never use an `int[]` as a key: arrays hash by identity.
    record Point(int x, int y) {}

    static Point busiest(List<Point> pts) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.6 | TreeMap floor and ceiling | Core
    // PROMPT: Write `static String valueAt(TreeMap<Integer, String> history, int t)` returning the value of the latest key <= t (or `null`), using `floorEntry`.
    // EXAMPLE: history `{1=a, 5=b, 9=c}` -> `valueAt(h, 6)` is `"b"`, `valueAt(h, 0)` is `null`
    // BIGO: O(log N). TreeMap also gives `ceilingKey`, `higherKey`, `lowerKey`, `firstKey` and `lastKey`.
    static String valueAt(TreeMap<Integer, String> history, int t) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.7 | An LRU cache in ten lines | Practice
    // PROMPT: Write `static class LRU<K, V> extends LinkedHashMap<K, V>` constructed with `accessOrder = true` that overrides `removeEldestEntry` to cap its size.
    // EXAMPLE: capacity 2: put 1, put 2, get 1, put 3 -> key 2 is evicted
    // BIGO: O(1) per get and put.
    static class LRU<K, V> extends LinkedHashMap<K, V> {
        private final int capacity;

        LRU(int capacity) {
            super(16, 0.75f, true);
            throw new UnsupportedOperationException();
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            throw new UnsupportedOperationException();
        }
    }
    // ==== END

    // ==== EX 7.8 | Two sum with a HashMap | Core
    // PROMPT: Write `static int[] twoSum(int[] nums, int target)` returning the indices of two numbers that add to target, or `null`.
    // EXAMPLE: `twoSum(new int[]{2, 7, 11, 15}, 9)` -> `[0, 1]`
    // BIGO: O(N).
    static int[] twoSum(int[] nums, int target) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 7.9 | Distinct values in every window | Practice
    // PROMPT: Write `static int[] distinctInWindows(int[] a, int k)` returning the number of distinct values in each window of k, maintaining a count map as the window slides.
    // EXAMPLE: `distinctInWindows(new int[]{1, 2, 1, 3, 4, 2, 3}, 4)` -> `[3, 4, 4, 3]`
    // BIGO: O(N).
    static int[] distinctInWindows(int[] a, int k) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
