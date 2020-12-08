package Collection;

import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>((i1,i2)->i2.compareTo(i1));
        tm.put(1,"Arka");
        tm.put(3,"Noel");
        tm.put(7,"Pablo");
        tm.put(6,"Richie");

        System.out.println(tm);

        TreeMap<Integer,String> tm2 = new TreeMap<>(tm);

        System.out.println(tm2); // same as sorted tm.
    }
}
