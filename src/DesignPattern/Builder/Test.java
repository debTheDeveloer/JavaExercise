package DesignPattern.Builder;

public class Test {
    public static void main(String[] args){
        Person p =new Person.Builder("Debajyoti","debgahtak888@gmail.com").
                setId(101).
                setAge(28).
                build();
        System.out.println(p);
    }
}
