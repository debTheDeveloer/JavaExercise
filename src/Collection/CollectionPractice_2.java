package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeMap;

public class CollectionPractice_2 {
    public static void main(String[] args){
        HashMap<Integer, Integer> hm = new HashMap<>();
        IdentityHashMap im = new IdentityHashMap();

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        hm.put(i1,100);
        hm.put(i2,101);
        System.out.println(hm);

        im.put(i1,100);
        im.put(i2,101);
        System.out.println(im);

        //Default Sorting order accept Hetragenous object.
        TreeMap tm = new TreeMap();
        tm.put("Arka",100);
//        tm.put(101,"DJ"); //We will get ClassCastException.class
        System.out.println("Printing TreeMap of Default natural Sorting Order");
        System.out.println(tm);

        //Customized Sorting order accept Hetragenous object.
        TreeMap tm2 = new TreeMap( new MyComparator());
        tm2.put("Arka1",100);
        tm2.put(1011,"DJ");
        System.out.println("Printing TreeMap of Custimized natural Sorting Order");
        System.out.println(tm2);
    }
}
