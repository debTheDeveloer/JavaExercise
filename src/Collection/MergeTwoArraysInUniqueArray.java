package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeTwoArraysInUniqueArray {
    private static int[] mergeTwoArray(int[] array1, int[] array2){
        int[] array3 = new int[array1.length+array2.length];
        int i=0,j=0,k=0;
        for (int element:array1) {
            array3[i]=element;
            i++;
        }
        j=i;
        for (int element:array2) {
            array3[j]=element;
            j++;
        }

        Set<Integer> hashSet = new HashSet<>();
        for (int element:array3) {
            hashSet.add(element);
        }

        int[] uniqueArray = new int[hashSet.size()];
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            uniqueArray[k]=iterator.next();
            k++;
        }
        Arrays.sort(uniqueArray);
        return uniqueArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeTwoArray(new int[]{1,2,3,4,5,7},new int[]{2,5,7,9,11,12,13})));
    }
}
