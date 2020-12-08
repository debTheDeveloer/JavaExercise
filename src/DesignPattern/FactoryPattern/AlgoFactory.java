package DesignPattern.FactoryPattern;

public class AlgoFactory {
    public static final int SORTEST_PATH=0;
    public static final int SPANNING_TREE=1;


    //Here we are encapsulating the object creation
    public static Algorithm createAlgorithm(int type){
        switch (type){
            case SORTEST_PATH:
                return new SortestPath();

            case SPANNING_TREE:
                return new SpanningTree();

            default:
                return null;
        }

    }
}
