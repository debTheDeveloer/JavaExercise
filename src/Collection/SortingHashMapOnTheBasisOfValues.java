package Collection;

import java.util.*;

public class SortingHashMapOnTheBasisOfValues {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Arka");
        hm.put(2,"Debajyoti");
        hm.put(4,"Rahul");
        hm.put(7,"Rudra");
        hm.put(3,"Noel");
        hm.put(8,"Richie");
        hm.put(6,"Pablo");
        hm.put(12,"Totan");

        Set set = hm.entrySet(); //Getting all the Entry set of the map.
       List<Map.Entry<Integer,String>> list = new ArrayList(set); //Converting that set into list for applyinh lambda during sorting

        System.out.println(list);

        list.sort((Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) -> o1.getValue().compareTo(o2.getValue()));

        System.out.println(list);

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(); //Putting that sorted list<Entry> into
                                                                            // linkedhasmap to maintain insertion order.
        for (Map.Entry<Integer,String> o:list) {
                linkedHashMap.put(o.getKey(),o.getValue());
        }

        System.out.println(linkedHashMap);



    }
}
