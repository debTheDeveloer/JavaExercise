package DesignPattern.FactoryPattern;

public class Test {
    public static void main(String[] args){
      Algorithm al =  AlgoFactory.createAlgorithm(0);
      al.solve();
    }
}
