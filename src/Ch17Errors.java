import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/** Chapter 17: Errors. */
public class Ch17Errors {
    // ==== EX 17.1 | Parse or report an error | Core
    // PROMPT: Write `static int parsePort(String text)` that returns the port number in `text` (spaces around it allowed). Throw `IllegalArgumentException` with the message `not a number: text` when it is not an integer, and `out of range: N` when it is outside 1 to 65535. Catch `NumberFormatException` and throw your own, so the caller sees your message.
    // EXAMPLE: `parsePort(" 8080 ")` -> `8080`; `parsePort("http")` throws `IllegalArgumentException("not a number: http")`
    // BIGO: O(L) for a string of length L.
    static int parsePort(String text) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 17.2 | A custom error type | Core
    // PROMPT: Create `static class InsufficientFundsException extends Exception` (a checked exception) with `final int needed, available` and the message `needed N, available M`. Write `static int withdraw(int balance, int amount) throws InsufficientFundsException` that returns the new balance, or throws when `amount` is more than `balance`. The compiler now makes every caller handle this case.
    // EXAMPLE: `withdraw(100, 30)` -> `70`; `withdraw(20, 50)` throws with `needed == 50`, `available == 20`
    // BIGO: O(1).
    static class InsufficientFundsException extends Exception {
        final int needed, available;

        InsufficientFundsException(int needed, int available) {
            super("needed " + needed + ", available " + available);
            throw new UnsupportedOperationException();
        }
    }

    static int withdraw(int balance, int amount) throws InsufficientFundsException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 17.3 | Wrap an error with context | Practice
    // PROMPT: Create `static class ConfigException extends RuntimeException` with a `(String message, Throwable cause)` constructor. Write `static int numberSetting(Map<String, String> settings, String key)` that parses `settings.get(key)`, but turns a missing key (use a `NoSuchElementException`) or a bad number (the `NumberFormatException`) into `ConfigException("setting key", cause)`, so the message says where and `getCause()` says why.
    // EXAMPLE: `numberSetting(Map.of("port", "80"), "port")` -> `80`; with no `port` -> `ConfigException` whose cause is a `NoSuchElementException`
    // BIGO: O(L) to parse the value.
    static class ConfigException extends RuntimeException {
        ConfigException(String message, Throwable cause) { super(message, cause); throw new UnsupportedOperationException(); }
    }

    static int numberSetting(Map<String, String> settings, String key) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 17.4 | Cleanup that always runs | Core
    // PROMPT: Write `static void runSteps(List<Runnable> steps, List<String> log)` that adds `"start"` to `log`, runs each step, and adds `"done"` however that ends, even when a step throws (the exception still reaches the caller). Use `try` / `finally`.
    // EXAMPLE: two steps that log `a` and `b` -> `log` is `[start, a, b, done]`
    // BIGO: O(S) for S steps.
    static void runSteps(List<Runnable> steps, List<String> log) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 17.5 | Close resources in reverse order | Practice
    // PROMPT: Create `static class Tracked implements AutoCloseable` whose constructor `Tracked(String name, List<String> log)` adds `open name` and whose `close()` adds `close name`. Write `static void useTwo(List<String> log, boolean fail)` that opens `a` then `b` in one try-with-resources, adds `work`, and throws `IllegalStateException` when `fail` is true. Both close, in reverse order, either way.
    // EXAMPLE: `useTwo(log, false)` -> `log` is `[open a, open b, work, close b, close a]`
    // BIGO: O(1).
    static class Tracked implements AutoCloseable {
        private final String name;
        private final List<String> log;

        Tracked(String name, List<String> log) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void close() { throw new UnsupportedOperationException(); }
    }

    static void useTwo(List<String> log, boolean fail) {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 17.6 | Collect every error instead of stopping | Practice
    // PROMPT: Write `static Ages parseAges(List<String> rows)` returning `record Ages(List<Integer> values, List<String> problems)`: parse each row as an age from 0 to 150; keep the good ages in order, and for each bad row a message `row N: not a number: text` or `row N: out of range: A` (rows count from 1, spaces trimmed). A helper throws `IllegalArgumentException` for one row; the loop catches it and carries on.
    // EXAMPLE: `["34", "x", "200", " 7 "]` -> `Ages[values=[34, 7], problems=[row 2: not a number: x, row 3: out of range: 200]]`
    // BIGO: O(total length of the rows).
    record Ages(List<Integer> values, List<String> problems) {}

    static Ages parseAges(List<String> rows) {
        throw new UnsupportedOperationException();
    }

    static int parseAge(String text) {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
