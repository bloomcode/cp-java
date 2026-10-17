import java.util.ArrayList;
import java.util.List;

/** Chapter 13 - Bit manipulation. */
public class Ch13Bits {

    // ==== EX 13.1 | Test, set, clear, toggle | Core
    // PROMPT: Write `static boolean isSet(int x, int i)`, `static int set(int x, int i)`, `static int clear(int x, int i)` and `static int toggle(int x, int i)`.
    // EXAMPLE: x = 0b1010: `isSet(x, 1)` -> `true`; `set(x, 0)` -> `11`; `clear(x, 3)` -> `2`; `toggle(x, 2)` -> `14`
    // BIGO: O(1).
    static boolean isSet(int x, int i) { throw new UnsupportedOperationException(); }

    static int set(int x, int i) { throw new UnsupportedOperationException(); }

    static int clear(int x, int i) { throw new UnsupportedOperationException(); }

    static int toggle(int x, int i) { throw new UnsupportedOperationException(); }
    // ==== END

    // ==== EX 13.2 | The 1 << 40 trap | Core
    // PROMPT: Write `static long bitAt(int i)` returning 2^i for i in 0..62. Explain why `1 << 40` gives 256: an int shift uses only the low 5 bits of the count.
    // EXAMPLE: `bitAt(40)` -> `1099511627776`; `(1 << 40)` -> `256`
    // BIGO: O(1). Write `1L << i` whenever i can reach 31.
    static long bitAt(int i) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 13.3 | Signed >> versus unsigned >>> | Core
    // PROMPT: Write `static int midpoint(int lo, int hi)` that cannot overflow, using `(lo + hi) >>> 1` for non-negative bounds, and show what `-16 >> 2` and `-16 >>> 28` give.
    // EXAMPLE: `midpoint(2_000_000_000, 2_100_000_000)` -> `2050000000`; `-16 >> 2` -> `-4`; `-16 >>> 28` -> `15`
    // BIGO: O(1). `>>` copies the sign bit; `>>>` fills with zeros.
    static int midpoint(int lo, int hi) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 13.4 | Built-in bit counts | Core
    // PROMPT: Write `static int[] bitFacts(long x)` returning `{Long.bitCount, Long.numberOfTrailingZeros, highest set bit index}` for x > 0.
    // EXAMPLE: `bitFacts(40)` -> `[2, 3, 5]`
    // BIGO: O(1); these compile to single CPU instructions.
    static int[] bitFacts(long x) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 13.5 | Power of two and lowest set bit | Core
    // PROMPT: Write `static boolean isPowerOfTwo(long x)` with `x & (x - 1)` and `static long lowestBit(long x)` with `x & -x`.
    // EXAMPLE: `isPowerOfTwo(64)` -> `true`; `isPowerOfTwo(0)` -> `false`; `lowestBit(40)` -> `8`
    // BIGO: O(1). `x & -x` drives Fenwick trees.
    static boolean isPowerOfTwo(long x) {
        throw new UnsupportedOperationException();
    }

    static long lowestBit(long x) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 13.6 | Subsets as bitmasks | Core
    // PROMPT: Write `static List<List<Integer>> subsetsByMask(int[] a)` looping `mask` from 0 to `(1 << n) - 1`.
    // EXAMPLE: `subsetsByMask(new int[]{1, 2})` -> `[[], [1], [2], [1, 2]]`
    // BIGO: O(N * 2^N); fine up to n ~ 20.
    static List<List<Integer>> subsetsByMask(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 13.7 | XOR tricks | Core
    // PROMPT: Write `static int loneValue(int[] a)` where every value appears twice except one, and `static int missing(int[] a)` for 0..n with one value missing.
    // EXAMPLE: `loneValue(new int[]{4, 1, 2, 1, 2})` -> `4`; `missing(new int[]{3, 0, 1})` -> `2`
    // BIGO: O(N) time, O(1) space.
    static int loneValue(int[] a) {
        throw new UnsupportedOperationException();
    }

    static int missing(int[] a) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 13.8 | Iterate the submasks of a mask | Stretch
    // PROMPT: Write `static List<Integer> submasks(int mask)` listing every submask from largest to 0 with `s = (s - 1) & mask`.
    // EXAMPLE: `submasks(0b101)` -> `[5, 4, 1, 0]`
    // BIGO: O(2^popcount). Summed over all masks of n bits this is O(3^n).
    static List<Integer> submasks(int mask) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
