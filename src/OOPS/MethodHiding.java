package OOPS;

public class MethodHiding {

    public static void m1(){
        System.out.println("Parent method");
    }
}

class Child extends MethodHiding{
    public static void m1(){
        System.out.println("Child method");
    }

    public static void main(String args[]){
        Child c = new Child();
        c.m1();
        MethodHiding method = new Child();
        method.m1();
        MethodHiding method2 = new MethodHiding();
        method2.m1();
    }
}
