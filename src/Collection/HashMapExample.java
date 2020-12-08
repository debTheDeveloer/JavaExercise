package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Arka");
        hm.put(2,"Debajyoti");
        hm.put(4,"Rahul");
        hm.put(7,"Rudra");
        hm.put(3,"Noel");
        hm.put(8,"Richie");
        hm.put(6,"Pablo");
        hm.put(12,"Totoan");

        System.out.println(hm);

        Set entrySet = hm.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry m1 = (Map.Entry) iterator.next();
            System.out.println(m1.getKey()+"...."+m1.getValue());
            if(m1.getValue()=="Rudra"){
                m1.setValue("RudraNath");
//                hm.put(13,"Sunando"); //We will get exception as we cant add new elements during traversing.
            }
        }

        System.out.println(hm);

    }
}
