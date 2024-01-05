package javaRefresher.threads.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort= Arrays.asList(8,4,6,1,4,9,3,2);

        ExecutorService executorService=Executors.newCachedThreadPool();
        // more smarter than newFixedThreadpool is thread is available
        // reuse it else create a new
        MergeSorter mergeSorter=new MergeSorter(listToSort,executorService);

        Future<List<Integer>> result=executorService.submit(mergeSorter);
        System.out.println(result.get());
        executorService.shutdown();
    }
}
