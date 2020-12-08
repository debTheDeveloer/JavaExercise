package DesignPattern.TemplatePattern;


//This is a Template Class
public abstract class Sort {

    public abstract void initiialize();
    public abstract void sort();

    public void doSortExercise(){
        initiialize();
        sort();
    }
}
