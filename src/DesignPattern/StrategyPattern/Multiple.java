package DesignPattern.StrategyPattern;

public class Multiple implements Strategy {
    @Override
    public void operation(int a, int b) {
        System.out.println(a*b);
    }
}
