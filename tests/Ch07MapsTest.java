import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/** Chapter 7 tests, one class per exercise. */
class Ex7_1Test {
    public static void run() {
        Check.eq(Ch07Maps.wordCounts("To be or not to be"), Map.of("to", 2, "be", 2, "or", 1, "not", 1));
    }
}

class Ex7_2Test {
    public static void run() {
        Check.eq(Ch07Maps.groupByFirst(List.of("apple", "bat", "avocado")).toString(), "{a=[apple, avocado], b=[bat]}");
    }
}

class Ex7_3Test {
    public static void run() {
        Check.eq(Ch07Maps.mostFrequent(Map.of("b", 2, "a", 2, "c", 1)), "a");
    }
}

class Ex7_4Test {
    public static void run() {
        Set<Integer> sa = new HashSet<>(Set.of(1, 2, 3, 4)), sb = Set.of(3, 4, 5);
        Check.eq(Ch07Maps.common(sa, sb), Set.of(3, 4));
        Check.eq(Ch07Maps.onlyIn(sa, sb), Set.of(1, 2));
        Check.eq(sa, Set.of(1, 2, 3, 4));
    }
}

class Ex7_5Test {
    public static void run() {
        List<Ch07Maps.Point> pts = List.of(new Ch07Maps.Point(1, 2), new Ch07Maps.Point(0, 0), new Ch07Maps.Point(1, 2),
                new Ch07Maps.Point(0, 0), new Ch07Maps.Point(3, 3));
        Check.eq(Ch07Maps.busiest(pts).toString(), "Point[x=0, y=0]");
    }
}

class Ex7_6Test {
    public static void run() {
        TreeMap<Integer, String> h = new TreeMap<>(Map.of(1, "a", 5, "b", 9, "c"));
        Check.eq(Ch07Maps.valueAt(h, 6), "b");
        Check.eq(Ch07Maps.valueAt(h, 9), "c");
        Check.eq(Ch07Maps.valueAt(h, 0), null);
    }
}

class Ex7_7Test {
    public static void run() {
        Ch07Maps.LRU<Integer, String> lru = new Ch07Maps.LRU<>(2);
        lru.put(1, "a");
        lru.put(2, "b");
        lru.get(1);
        lru.put(3, "c");
        Check.eq(lru.keySet().toString(), "[1, 3]");
    }
}

class Ex7_8Test {
    public static void run() {
        Check.eq(Ch07Maps.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Check.eq(Ch07Maps.twoSum(new int[]{1, 2}, 9), null);
    }
}

class Ex7_9Test {
    public static void run() {
        Check.eq(Ch07Maps.distinctInWindows(new int[]{1, 2, 1, 3, 4, 2, 3}, 4), new int[]{3, 4, 4, 3});
    }
}
