package DesignPattern.TemplatePattern;

public class TestSortMechanism {

    public static void main(String[] args){
        Sort sort = new BubbleSort(); //If we want to change the implemenetation we need to change only here.
        sort.doSortExercise();
    }
}
