package Collection;

import java.util.TreeSet;

public class TreeSetNullCheck {
    public static void main(String args[]){
        TreeSet ts = new TreeSet();
//        ts.add(null);  //From JDk 1.7 we cant add null in treeset.
        System.out.println(ts);
        String s="A";
    }
}
