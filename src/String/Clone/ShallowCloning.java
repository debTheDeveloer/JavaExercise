package String.Clone;

public class ShallowCloning {
    public static void main(String args[]) throws CloneNotSupportedException {
        Cat c= new Cat(20);
        ShallowDog d1 = new ShallowDog(10,c);
        System.out.println(d1.i+"......"+d1.c.j);

        ShallowDog d2 = (ShallowDog) d1.clone();
        d2.i=888;
        d2.c.j=999;

        System.out.println(d1.i+"......"+d1.c.j);

    }
}
