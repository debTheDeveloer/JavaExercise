package OOPS;

public abstract class AbstractClass {
    int i;
    String s;

    public AbstractClass(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public abstract String m1();
}

class Test{
    public static void main(String[] args) {
        AbstractClass a = new AbstractClass(10, "Arka") {
            @Override
            public String m1() {
                return "hello";
            }
        };
        a.m1();
    }
}
