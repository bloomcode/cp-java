import java.util.Arrays;

/** Chapter 3 - Strings and StringBuilder. */
public class Ch03Strings {

    // ==== EX 3.1 | Reverse with StringBuilder | Core
    // PROMPT: Write `static String reverse(String s)` with `new StringBuilder(s).reverse()`.
    // EXAMPLE: `reverse("java")` -> `"avaj"`
    // BIGO: O(N).
    static String reverse(String s) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.2 | equals, not == | Core
    // PROMPT: Write `static boolean sameText(String a, String b)` that compares content, and show that `new String("hi") == "hi"` is false.
    // EXAMPLE: `sameText(new String("hi"), "hi")` -> `true`
    // BIGO: O(N).
    // NOTE: `==` compares references. Literals are interned, so `"hi" == "hi"` happens to be true, which hides the bug until input arrives at run time.
    static boolean sameText(String a, String b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.3 | Count letters with int[26] | Core
    // PROMPT: Write `static int[] letterCounts(String s)` for lowercase letters, using `s.charAt(i) - 'a'` as the index.
    // EXAMPLE: `letterCounts("banana")[0]` -> `3` (a); index 1 (b) -> `1`; index 13 (n) -> `2`
    // BIGO: O(N) time, O(1) space. Faster than a `HashMap<Character, Integer>` because there is no boxing.
    static int[] letterCounts(String s) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.4 | Caesar shift with char arithmetic | Core
    // PROMPT: Write `static String caesar(String s, int k)` shifting lowercase letters by k (wrapping) and leaving other characters alone. Cast back with `(char)`.
    // EXAMPLE: `caesar("xyz abc", 3)` -> `"abc def"`
    // BIGO: O(N).
    static String caesar(String s, int k) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.5 | Palindrome with two pointers | Core
    // PROMPT: Write `static boolean isPalindrome(String s)` that ignores case and anything that is not a letter or digit, using `Character.isLetterOrDigit` and two indices.
    // EXAMPLE: `isPalindrome("A man, a plan, a canal: Panama")` -> `true`
    // BIGO: O(N) time, O(1) space.
    static boolean isPalindrome(String s) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.6 | Reverse the word order | Core
    // PROMPT: Write `static String reverseWords(String s)` using `trim()`, `split("\\s+")` and `String.join`.
    // EXAMPLE: `reverseWords("  the sky   is blue ")` -> `"blue is sky the"`
    // BIGO: O(N).
    static String reverseWords(String s) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.7 | StringBuilder instead of += | Core
    // PROMPT: Write `static String numbersCsv(int n)` returning `"1,2,...,n"` with a `StringBuilder`, then explain why `s += i` in a loop is O(N^2).
    // EXAMPLE: `numbersCsv(5)` -> `"1,2,3,4,5"`
    // BIGO: O(N) with StringBuilder. Each `+=` copies the whole string into a new one.
    static String numbersCsv(int n) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.8 | Anagram check | Core
    // PROMPT: Write `static boolean isAnagram(String a, String b)` by sorting each `toCharArray()` and comparing with `Arrays.equals`.
    // EXAMPLE: `isAnagram("listen", "silent")` -> `true`
    // BIGO: O(N log N). Counting with `int[26]` (3.3) brings it to O(N).
    static boolean isAnagram(String a, String b) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 3.9 | Run-length encoding | Practice
    // PROMPT: Write `static String rle(String s)` turning runs of a character into the character and its count.
    // EXAMPLE: `rle("aaabccdddd")` -> `"a3b1c2d4"`
    // BIGO: O(N).
    static String rle(String s) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
