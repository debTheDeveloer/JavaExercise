package DesignPattern.TemplatePattern;

public class BubbleSort extends Sort {
    @Override
    public void initiialize() {
        System.out.println("Initialization is done for Bubble Sort method");
    }

    @Override
    public void sort() {
        System.out.println("Sorting done using Bubble Sort mechanism");
    }
}
