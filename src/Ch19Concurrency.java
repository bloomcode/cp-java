import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

/** Chapter 19: Concurrency. */
public class Ch19Concurrency {
    // ==== EX 19.1 | Start workers and wait for all | Core
    // PROMPT: Write `static long[] parallelSquares(int[] nums) throws InterruptedException` that starts one `Thread` per number, each storing its number's square in its own slot of the result array, then `join`s every thread before returning.
    // EXAMPLE: `[1, 2, 3]` -> `[1, 4, 9]`
    // BIGO: O(N) work spread over N threads; each writes only its own slot, so no lock is needed.
    static long[] parallelSquares(int[] nums) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 19.2 | A producer and a consumer | Core
    // PROMPT: Write `static long pipelineTotal(int[] nums) throws InterruptedException` (values are non-negative) with two threads joined by a `LinkedBlockingQueue<Integer>`: a producer `put`s each number and then `-1` to say it is finished, while a consumer `take`s items until it sees `-1`, adding them up. Return the total after joining both.
    // EXAMPLE: `[4, 5, 6]` -> `15`
    // BIGO: O(N): every value passes through the queue once; the queue does the locking and the waiting.
    static long pipelineTotal(int[] nums) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 19.3 | A pool with a fixed number of workers | Practice
    // PROMPT: Write `static <T, R> List<R> poolMap(Function<T, R> fn, List<T> items, int workers) throws Exception` that applies `fn` to every item on an `ExecutorService` from `Executors.newFixedThreadPool(workers)` and returns the results in input order: submit every task, then `get` the futures in order, and always `shutdown` the pool.
    // EXAMPLE: `x -> x * 10, [1, 2, 3], 2` -> `[10, 20, 30]`
    // BIGO: About ceil(N / W) rounds of work for W workers; the results keep the input order however the work finishes.
    static <T, R> List<R> poolMap(java.util.function.Function<T, R> fn, List<T> items, int workers) throws Exception {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 19.4 | A counter protected by a lock | Core
    // PROMPT: Write `static int lockedCount(int threads, int increments) throws InterruptedException` that starts `threads` threads, each adding 1 to a shared counter `increments` times, and returns the final count. Guard every update with one `ReentrantLock` (`lock()`, then `unlock()` in a `finally`), because `count++` is a read, an add and a write that two threads can interleave.
    // EXAMPLE: `4, 1000` -> `4000`
    // BIGO: O(T * K) increments; the lock makes each read-modify-write happen as one step, so none is lost.
    static int lockedCount(int threads, int increments) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 19.5 | Stop waiting after a timeout | Practice
    // PROMPT: Write `static <T> Optional<T> resultWithin(Callable<T> task, long millis) throws Exception` that runs `task` on a worker thread and returns its result if it finishes within `millis`, or `Optional.empty()` otherwise, without waiting for a slow task to end: `submit` it to an `ExecutorService`, call `get(millis, TimeUnit.MILLISECONDS)`, catch `TimeoutException`, and always `shutdownNow`.
    // EXAMPLE: `() -> 42, 1000` -> `Optional[42]`; a task that sleeps 300 ms with `50` -> `Optional.empty`
    // BIGO: Waits at most the timeout, however long the task takes.
    static <T> Optional<T> resultWithin(Callable<T> task, long millis) throws Exception {
        throw new UnsupportedOperationException();
    }
    // ==== END

    // ==== EX 19.6 | Split a sum across workers | Practice
    // PROMPT: Write `static long parallelSum(int[] nums, int workers) throws InterruptedException` that cuts `nums` into `workers` contiguous chunks of near-equal size, sums each chunk on its own `Thread` into its own slot of a `long[] partial`, joins them, and adds the partial sums.
    // EXAMPLE: `[1..100], 4` -> `5050`
    // BIGO: O(N / W) per worker for W workers, then O(W) to combine; each worker owns one slot of the partial results.
    // NOTE: In CPython, threads take turns running Python code (the GIL), so this shows the pattern rather than a speed-up; use processes for CPU-heavy work.
    static long parallelSum(int[] nums, int workers) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
    // ==== END
}
