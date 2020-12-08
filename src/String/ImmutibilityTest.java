package String;

public class ImmutibilityTest {
    public static void main(String[] args) {
        String s = "Arka";
        System.out.println(s.hashCode());
        s=s+" Ghatak";
        System.out.println(s.hashCode());
        //Hashcode got changed

        String s2 ="Debajyoti";
        String s3 = s2+" Ghatak";
        System.out.println(s2==s3);
    }
}

