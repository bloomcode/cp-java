import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** Chapter 18 tests, one class per exercise. */

class Ex18_1Test {
    public static void run() {
        try {
            Path tmp = Files.createTempDirectory("cp18");
            Path numbers = Files.writeString(tmp.resolve("n.txt"), "3\n\n-1\n10\n");
            Path empty = Files.writeString(tmp.resolve("empty.txt"), "");
            Check.eq(Ch18Files.sumFile(numbers), 12L);
            Check.eq(Ch18Files.sumFile(empty), 0L);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

class Ex18_2Test {
    public static void run() {
        try {
            Path tmp = Files.createTempDirectory("cp18");
            Path words = Files.writeString(tmp.resolve("w.txt"), "The cat and the hat.\nThe end, and THE start!\n");
            Check.eq(Ch18Files.topWords(words, 2), List.of(Map.entry("the", 4), Map.entry("and", 2)));
            Check.eq(Ch18Files.topWords(words, 4), List.of(Map.entry("the", 4), Map.entry("and", 2), Map.entry("cat", 1), Map.entry("end", 1)));
            Check.eq(Ch18Files.topWords(words, 99).size(), 6);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

class Ex18_3Test {
    public static void run() {
        try {
            Path tmp = Files.createTempDirectory("cp18");
            Path path = Files.writeString(tmp.resolve("report.csv"), "old contents\n");
            Check.eq(Ch18Files.writeReport(path, Map.of("ana", 7, "bo", 9, "cy", 7)), 3);
            Check.eq(Files.readString(path), "bo,9\nana,7\ncy,7\n");
            Check.eq(Ch18Files.writeReport(path, Map.of()), 0);
            Check.eq(Files.readString(path), "");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

class Ex18_4Test {
    public static void run() {
        try {
            Path tmp = Files.createTempDirectory("cp18");
            Path small = Files.writeString(tmp.resolve("a.txt"), "ab\nabcd\n\n");
            Path big = tmp.resolve("big.txt");
            try (BufferedWriter out = Files.newBufferedWriter(big)) {
                for (int i = 0; i < 100_000; i++) out.write("x".repeat(i % 97) + "\n");
                out.write("y".repeat(500));
            }
            Check.eq(Ch18Files.longestLine(small), 4);
            Check.eq(Ch18Files.longestLine(big), 500);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

class Ex18_5Test {
    public static void run() {
        try {
            Path tmp = Files.createTempDirectory("cp18");
            Path log = Files.writeString(tmp.resolve("log.txt"), "error: disk\nok\nerror: net");
            Check.eq(Ch18Files.copyMatching(log, tmp.resolve("out.txt"), "error"), 2);
            Check.eq(Files.readAllLines(tmp.resolve("out.txt")), List.of("error: disk", "error: net"));
            Check.eq(Ch18Files.copyMatching(log, tmp.resolve("none.txt"), "panic"), 0);
            Check.eq(Files.readString(tmp.resolve("none.txt")), "");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

class Ex18_6Test {
    public static void run() {
        try {
            Path tmp = Files.createTempDirectory("cp18");
            Path games = Files.writeString(tmp.resolve("games.csv"), "team,points\nred,10\nblue,4\nred,7\n");
            Path none = Files.writeString(tmp.resolve("none.csv"), "team,points\n");
            Check.eq(Ch18Files.averageByTeam(games), Map.of("red", 8.5, "blue", 4.0));
            Check.eq(Ch18Files.averageByTeam(none), Map.of());
            Check.eq(new ArrayList<>(Ch18Files.averageByTeam(games).keySet()), List.of("blue", "red"));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
