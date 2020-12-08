package DesignPattern.StrategyPattern;

public class Test {
    public static void main(String[] args){
        ManageOperation mng = new ManageOperation();
        mng.setStrategy(new Add()); //Whenever we are going to change the implementation we just need to change here.
        mng.opearation(10,20);
    }
}
