package structural.bridge.abstraction;

import structural.bridge.implementor.SortImplementor;

public abstract class Sorter {

    protected SortImplementor sortImplementor;

    protected Sorter(SortImplementor sortImplementor) {
        this.sortImplementor = sortImplementor;
    }

    public abstract void sort(int[] arr);

}