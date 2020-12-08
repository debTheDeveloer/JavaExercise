package String;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.stream.Stream;

public class String1 {

    public static void main(String[] args){
        String s = "Arka"; //SCP
        String s1 = s+" Ghatak"; //Heap
//        String s4 = "Arka Ghatak"; //SCP
        System.out.println(s==s1); //false
        final String s2 = "Arka"; //Same SCP 0f s
        String s3 = s2+" Ghatak"; //SCP?? //It is a constantD:\WorkSpace\RestfulWebService
        String s5 = "Arka Ghatak";
        System.out.println(s1==s3); //false
        System.out.println(s3==s5); //true
//        System.out.println(s3==s4);
        domore();


        String s6 = new String("hello");
        String s7 = s6.toUpperCase();
        String s8 = s6.toLowerCase();
        System.out.println(s6==s7);
        System.out.println(s6==s8);

        final StringBuffer sb = new StringBuffer("Arka");
        sb.append(" Ghatak");//WE can make change on final variable but we can not make re assignnment on this.
        System.out.println(sb);
        final StringBuffer sb1 = new StringBuffer("Arka");
//        sb1= sb1.append(" Ghatak");// not valid as it is final.We can not perform reassignment on final variable.


        Boolean b = Boolean.parseBoolean("TrUe");
        System.out.println(b); //True

        Integer i = Integer.valueOf(10);
        String st= i.toString(10);
        String st1 = Integer.toString(i);



    }

    private static void domore() {
    }
}
