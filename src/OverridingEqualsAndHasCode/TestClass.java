package OverridingEqualsAndHasCode;

public class TestClass {

    public static void main(String[] args){
        Pojo p1 = new Pojo(10,20);
        Pojo p2 = new Pojo(10,20);
        System.out.println("Euqals method result: "+p1.equals(p2));
        System.out.println("Hashcode method result: "+(p1.hashCode()==p2.hashCode()));

    }
}
