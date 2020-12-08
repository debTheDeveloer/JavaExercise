package Generics;

public class CustomizedGenerics<T> {
    T object;

    public CustomizedGenerics(T object) {
        this.object = object;
    }

    public void show(){
        System.out.println(object.getClass().getName());
    }

    public T getObject(){
        return object;
    }
    public  void print(T t)
    {
        System.out.println(object);
    }

    public <T> void genericsMethod(T t){ //Method level T and class level T are different.
        System.out.println(t);
    }
}
