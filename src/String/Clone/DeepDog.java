package String.Clone;

public class DeepDog implements Cloneable {

    int i;
    Cat c;

    public DeepDog(int i, Cat c) {
        this.i = i;
        this.c = c;
    }

    public Object clone() {
        Cat c1 = new Cat(c.j);
        DeepDog d1 = new DeepDog(i,c1);
        return d1;
    }

}
