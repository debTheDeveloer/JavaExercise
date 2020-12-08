package Collection;

import java.util.*;

public class CollectionPracice1 {

    public static void main(String args[]){
        HashSet h = new HashSet();
        h.add(10);
        h.add(null);
        h.add("Arka");
        h.add(null);

        System.out.println("printing HashSet");
        System.out.println(h);

        LinkedHashSet lh = new LinkedHashSet();
        lh.add(101);
        lh.add(null);
        lh.add("Arka Ghatak");
        lh.add(null);

        System.out.println("printing LinkedHashSet");
        System.out.println(lh);

        TreeSet ts = new TreeSet();
        ts.add(1011);
       // ts.add(null);
       // ts.add("Debajyoti Ghatak"); //Hetreogenous object
       // ts.add(null);

        System.out.println("printing TreeSet");
        System.out.println(ts);

        ArrayList al = new ArrayList();
        al.add("Sai");
        al.add(0,"Arka");
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.indexOf("Arka"));

        LinkedList l = new LinkedList();
        l.add("Arka");
        l.add("Deajyoti");
        l.add("Sai");
        l.add("Anup");

        ListIterator li = l.listIterator(l.size());
        System.out.println("Printing LinkedHashSet");
        while(li.hasPrevious())
            System.out.println(li.previous());

    }
}
