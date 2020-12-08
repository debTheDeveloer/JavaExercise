package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmaple {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(15);
        hs.add(13);
        hs.add(17);
        hs.add(19);
        hs.add(11);

        System.out.println(hs);

        Iterator<Integer> iterator = hs.iterator();
        while ((iterator.hasNext())){
            int next=iterator.next();
            System.out.println(next);
            if(next==19)
                iterator.remove();
        }
        System.out.println("New Hashset is: "+hs);
    }
}
