package structural.bridge;

import structural.bridge.abstraction.SortTimer;
import structural.bridge.abstraction.Sorter;
import structural.bridge.implementor.BubbleSort;
import structural.bridge.implementor.InsertionSort;

import java.util.Random;

public class Client {

    public static final int NUMBER_OF_ELEMENTS = 1000000;

    public static void main(String[] args) {
        int[] forBubble = new int[NUMBER_OF_ELEMENTS];
        int[] forInsertion = new int[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            forBubble[i] = new Random().nextInt();
            forInsertion[i] = new Random().nextInt();
        }

        Sorter bubbleSort = new SortTimer(new BubbleSort());
        Sorter insertionSort = new SortTimer(new InsertionSort());

        bubbleSort.sort(forBubble);
        // Start: Mon Mar 28 23:21:59 EDT 2016
        // Sorting...
        // End: Mon Mar 28 23:52:09 EDT 2016
        // Time: 1809567.4 ms

        insertionSort.sort(forInsertion);
        // Start: Mon Mar 28 23:52:09 EDT 2016
        // Sorting...
        // End: Mon Mar 28 23:58:25 EDT 2016
        // Time: 376502.16 ms
    }

}