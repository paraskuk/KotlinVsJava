package org.paraskevas;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BillionNumberGeneratorJava {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Instant start = Instant.now();


        System.out.println("Starting generation of one billion numbers in Kotlin...");

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        Future<List<Integer>> future = executor.submit(() -> IntStream.range(0, 1_000_000_000)
                .boxed()
                .collect(Collectors.toList()));

        List<Integer> numbers = future.get();

        System.out.println("Finished generating numbers. Total numbers generated: " + numbers.size());
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Time taken: " + timeElapsed + " milliseconds");
        executor.shutdown();
    }

}
