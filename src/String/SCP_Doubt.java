package String;

public class SCP_Doubt {

    public static void main(String[] args){
        String s1 = new String("ashok"); //heap
        String s2 = s1.toString(); //SCP of s1
        String s3 = s1.toUpperCase();//New obj in heap
        String s4 = s1.toLowerCase();//same SCP of s2
        String s5 = s1.toUpperCase();//new obj in Heap
        String s6 = s3.toLowerCase();//new Obj in heap

        System.out.println(s1==s6);
        System.out.println(s3==s5);
        System.out.println(s2==s4);
    }
}
