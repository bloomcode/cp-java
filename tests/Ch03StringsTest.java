/** Chapter 3 tests, one class per exercise. */
class Ex3_1Test {
    public static void run() {
        Check.eq(Ch03Strings.reverse("java"), "avaj");
        Check.eq(Ch03Strings.reverse(""), "");
    }
}

class Ex3_2Test {
    public static void run() {
        Check.yes(Ch03Strings.sameText(new String("hi"), "hi"));
        Check.no(Ch03Strings.sameText("hi", "ho"));
    }
}

class Ex3_3Test {
    public static void run() {
        int[] lc = Ch03Strings.letterCounts("banana");
        Check.eq(lc.length, 26);
        Check.eq(new int[]{lc[0], lc[1], lc[13], lc[25]}, new int[]{3, 1, 2, 0});
    }
}

class Ex3_4Test {
    public static void run() {
        Check.eq(Ch03Strings.caesar("xyz abc", 3), "abc def");
        Check.eq(Ch03Strings.caesar("abc", -1), "zab");
    }
}

class Ex3_5Test {
    public static void run() {
        Check.yes(Ch03Strings.isPalindrome("A man, a plan, a canal: Panama"));
        Check.no(Ch03Strings.isPalindrome("race a car"));
    }
}

class Ex3_6Test {
    public static void run() {
        Check.eq(Ch03Strings.reverseWords("  the sky   is blue "), "blue is sky the");
    }
}

class Ex3_7Test {
    public static void run() {
        Check.eq(Ch03Strings.numbersCsv(5), "1,2,3,4,5");
    }
}

class Ex3_8Test {
    public static void run() {
        Check.yes(Ch03Strings.isAnagram("listen", "silent"));
        Check.no(Ch03Strings.isAnagram("rat", "car"));
    }
}

class Ex3_9Test {
    public static void run() {
        Check.eq(Ch03Strings.rle("aaabccdddd"), "a3b1c2d4");
    }
}
