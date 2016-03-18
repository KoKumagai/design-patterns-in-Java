package structural.bridge;

import structural.bridge.abstraction.SortTimer;
import structural.bridge.abstraction.Sorter;
import structural.bridge.implementor.BubbleSort;
import structural.bridge.implementor.InsertionSort;

import java.util.Random;

public class Client {

    public static final int NUMBER_OF_ELEMENTS = 1000000;

    public static void main(String[] args) {
        int[] arr = new int[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }

        Sorter bubbleSort = new SortTimer(new BubbleSort());
        Sorter insertionSort = new SortTimer(new InsertionSort());

        bubbleSort.sort(arr);
        // Start: Thu Mar 17 23:50:46 EDT 2016
        // Sorting...
        // End: Fri Mar 18 00:22:09 EDT 2016
        // Time: 1883023.5 ms

        insertionSort.sort(arr);
        // Start: Fri Mar 18 00:22:09 EDT 2016
        // Sorting...
        // End: Fri Mar 18 00:22:09 EDT 2016
        // Time: 7.804109 ms
    }

}