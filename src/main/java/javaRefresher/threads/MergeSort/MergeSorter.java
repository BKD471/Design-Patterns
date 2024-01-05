package javaRefresher.threads.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    /**
     * @return
     * @throws Exception
     */
    private final List<Integer> listToSort;
    private final ExecutorService executorService;

    MergeSorter(List<Integer> listToSort,ExecutorService executorService){
        this.listToSort=listToSort;
        this.executorService=executorService;
    }
    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Sorted By Thread "+Thread.currentThread().getName());
        int size= listToSort.size();

        if(size<=1) return listToSort;

        List<Integer> firstHalf=new ArrayList<>();
        List<Integer> secondHalf=new ArrayList<>();

        for(int i=0;i<size/2;i++) firstHalf.add(listToSort.get(i));
        for(int i=size/2;i<size;i++) secondHalf.add(listToSort.get(i));

        //sort both these halves in separate threads
        MergeSorter leftMergeSorter=new MergeSorter(firstHalf,executorService);
        MergeSorter rightMergeSorter=new MergeSorter(secondHalf,executorService);

        Future<List<Integer>> sortedLeftHalfFuture=executorService.submit(leftMergeSorter);
        Future<List<Integer>> sortedRightHalfFuture=executorService.submit(rightMergeSorter);

        List<Integer> sortedLeftHalf=sortedLeftHalfFuture.get(); //these are the blocking calls
        List<Integer> sortedRightHalf=sortedRightHalfFuture.get(); //these are the blocking calls

        //Merge left & right sorted half;
        List<Integer> result=new ArrayList<>();

        int i=0,j=0,m=sortedLeftHalf.size(),n=sortedRightHalf.size();

        while(i<m && j<n){
          if(sortedLeftHalf.get(i)<sortedRightHalf.get(j)){
              result.add(sortedLeftHalf.get(i));
              i++;
          }else{
              result.add(sortedRightHalf.get(j));
              j++;
          }
        }

        while(i<m){
            result.add(sortedLeftHalf.get(i));
            i++;
        }

        while (j<n){
            result.add(sortedRightHalf.get(j));
            j++;
        }

        return result;
    }
}
