package DesignPattern.TemplatePattern;

public class InsectionSort extends Sort {
    @Override
    public void initiialize() {
        System.out.println("Initialization is done for Insection Sort method");
    }

    @Override
    public void sort() {
        System.out.println("Sorting done using Insection Sort mechanism");
    }
}
