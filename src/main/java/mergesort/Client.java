package mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(
                10,8,5,19,3,1,2
        );

        ExecutorService es = Executors.newCachedThreadPool();
//        Create an object of the task.

        Sorter sorter = new Sorter(arrayToSort,es);

        Future<List<Integer>> sortedData = es.submit(sorter);

        List<Integer> sortedList = sortedData.get();

        for(Integer ele:sortedList){
            System.out.println(ele);
        }

        es.shutdown();
    }
}
