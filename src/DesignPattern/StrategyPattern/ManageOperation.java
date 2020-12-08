package DesignPattern.StrategyPattern;

public class ManageOperation {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void opearation(int a, int b){
        strategy.operation(a,b);
    }
}
