package Collection;

import java.util.ArrayList;

public class ArrayListInfy {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList();
        al.add("");
        for (String s :al) {
            System.out.println(s.length());
        }
        al.add(null);
        for (String s:al) {
            System.out.println(s.length());
        }
    }
}
