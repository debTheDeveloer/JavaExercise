package String;

public class String_2 {
    String s1 ="Hi";
//    s1+="Debajyoti";// Any type of executable codes can only be performed inside methid. Outside of methods we
// can only declare and  initialize it.
    int i;
//    i=76;
    public static void main(String args[]){
        String s = "Arka";
        System.out.println(s);
        System.out.println(s.hashCode());
        s=s+"Ghatak";
        System.out.println(s);
        System.out.println(s.hashCode());
        s+="Debajyoti";
        System.out.println(s);
    }
}
