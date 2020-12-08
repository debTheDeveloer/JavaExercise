package String.Clone;

public class DeepCloning {

    public static void main(String[] args){
        Cat c = new Cat(10);
        DeepDog d1 = new DeepDog(20,c);

        DeepDog d2 = (DeepDog) d1.clone();
        System.out.println(d1.i+"......"+d1.c.j);
        d2.c.j=999;
        d2.i=888;
        System.out.println(d1.i+"......"+d1.c.j);
        System.out.println(d2.i+"......"+d2.c.j);

    }
}
