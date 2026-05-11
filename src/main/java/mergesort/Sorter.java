package mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        int mid = arrayToSort.size()/2;
        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArray, executorService);
        Sorter rightSorter = new Sorter(rightArray, executorService);

//        The future class will make sure that the thread is only used when the leftSorter and rightSorter
//        return the sorted arrays for merging. This helps us use the threads in parallel.(i.e if there is an unused
//        thread its utilised.)
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

        List<Integer> sortedArray = new ArrayList<>();
//        At this point this thread has to wait for the data in leftSortedArrayFuture and rightSortedArrayFuture.

//        We start waiting for the result of the sorted array here.
        List<Integer> leftSortedData = leftSortedArrayFuture.get();
        List<Integer> rightSortedData = rightSortedArrayFuture.get();

//        Merging the data.
        int i = 0, j = 0;

        while(i<leftSortedData.size() && j<rightSortedData.size()){
            if(leftSortedData.get(i) <= rightSortedData.get(j)){
                sortedArray.add(leftSortedData.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedData.get(j));
                j++;
            }
        }

        while(i<leftSortedData.size()){
            sortedArray.add(leftSortedData.get(i));
            i++;
        }

        while(j<rightSortedData.size()){
            sortedArray.add(rightSortedData.get(j));
            j++;
        }

        return sortedArray;
    }
}

//MergeSort:-
//-----------
//If array length <= 1: return array
//calculate mid and divide the array in half
//sort the left array
//sort the right array
//merge left and right
