package structural.bridge.abstraction;

import structural.bridge.implementor.SortImplementor;

import java.util.Date;

public class SortTimer extends Sorter {

    public SortTimer(SortImplementor sortImplementor) {
        super(sortImplementor);
    }

    @Override
    public void sort(int[] arr) {
        System.out.println("Start: " + new Date());

        System.out.println("Sorting...");
        long start = System.nanoTime();
        sortImplementor.sort(arr);
        long end = System.nanoTime();

        System.out.println("End: " + new Date());

        System.out.println("Time: " + (end - start) / 1000000f + " ms");
    }

}