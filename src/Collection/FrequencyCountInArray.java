package Collection;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class FrequencyCountInArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,4,5,6,2,5,7,9,7,6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        LinkedHashMap<Integer,Integer> linkdhasMap = new LinkedHashMap<>();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            System.out.println("Get Method..."+linkdhasMap.get(array[i]));
            linkdhasMap.put(array[i],linkdhasMap.containsKey(array[i])?linkdhasMap.get(array[i])+1:1);
        }
        System.out.println(linkdhasMap);
    }
}
