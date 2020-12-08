package String.Clone;

public class ShallowDog implements Cloneable {
    int i;
    Cat c;

    public ShallowDog(int i, Cat c) {
        this.i = i;
        this.c = c;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
