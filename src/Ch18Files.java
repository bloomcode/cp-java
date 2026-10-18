import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/** Chapter 18: Files and Streams. */
public class Ch18Files {
    // ==== EX 18.1 | Sum the numbers in a file | Core
    // PROMPT: Write `static long sumFile(Path path) throws IOException` that returns the sum of the integers in a text file, one per line, skipping blank lines. Read it with a `BufferedReader` from `Files.newBufferedReader(path)` in a try-with-resources, one `readLine()` at a time.
    // EXAMPLE: a file holding `3\n\n-1\n10\n` -> `12`
    // BIGO: O(size of the file) time, O(1) extra space when read line by line.
    static long sumFile(Path path) throws IOException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 18.2 | Most common words in a file | Core
    // PROMPT: A word is a run of letters, compared in lower case. Write `static List<Map.Entry<String, Integer>> topWords(Path path, int k) throws IOException` that returns the `k` most common words in a file with their counts, most frequent first and ties in alphabetical order. Count in a `HashMap` while reading lines, then sort the entries.
    // EXAMPLE: `The cat and the hat.\nThe end, and THE start!\n`, `2` -> `[the=4, and=2]`
    // BIGO: O(size + W log W) for W distinct words: one pass to count, one sort.
    static List<Map.Entry<String, Integer>> topWords(Path path, int k) throws IOException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 18.3 | Write a report | Core
    // PROMPT: Write `static int writeReport(Path path, Map<String, Integer> scores) throws IOException` that writes one line `name,score` per entry, highest score first and ties by name, replacing any existing file, and returns how many lines it wrote. Write through a `BufferedWriter` from `Files.newBufferedWriter(path)`.
    // EXAMPLE: `{ana=7, bo=9, cy=7}` -> writes `bo,9\nana,7\ncy,7\n` and returns `3`
    // BIGO: O(N log N) for the sort, O(N) to write.
    static int writeReport(Path path, Map<String, Integer> scores) throws IOException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 18.4 | Stream a large file | Practice
    // PROMPT: Write `static int longestLine(Path path) throws IOException` that returns the length of the longest line in a file (not counting the newline), holding only one line in memory at a time: read with a `BufferedReader` (or `Files.lines` in a try-with-resources), never `Files.readAllLines`.
    // EXAMPLE: a file with lines `ab`, `abcd`, `` -> `4`
    // BIGO: O(size) time and O(longest line) memory: only one line is ever held, however big the file is.
    static int longestLine(Path path) throws IOException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 18.5 | Copy matching lines to another file | Practice
    // PROMPT: Write `static int copyMatching(Path source, Path target, String needle) throws IOException` that writes every line of `source` containing `needle` to `target`, each followed by a newline, and returns how many it wrote. Open a reader and a writer in one try-with-resources and stream from one to the other.
    // EXAMPLE: lines `error: disk`, `ok`, `error: net` with needle `error` -> writes the two error lines, returns `2`
    // BIGO: O(size of the input) time, O(longest line) memory: both files are streamed.
    static int copyMatching(Path source, Path target, String needle) throws IOException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 18.6 | Averages from a CSV file | Practice
    // PROMPT: A CSV file has the header `team,points` and one row per game (no quoted fields). Write `static Map<String, Double> averageByTeam(Path path) throws IOException` that returns a `TreeMap` from team to its average points. Skip the header line, split each row on the comma, and keep a total and a count per team.
    // EXAMPLE: rows `red,10`, `blue,4`, `red,7` -> `{blue=4.0, red=8.5}`
    // BIGO: O(size of the file) time, O(T) space for T teams: keep a running total and count per team.
    static Map<String, Double> averageByTeam(Path path) throws IOException {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
