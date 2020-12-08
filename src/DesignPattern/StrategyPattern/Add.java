package DesignPattern.StrategyPattern;

public class Add implements Strategy {
    public void operation(int a, int b){
        System.out.println(a+b);
    }
}
