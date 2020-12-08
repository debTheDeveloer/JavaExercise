package DesignPattern.NullObject;

public class Test {

    public static void main(String[] args){
        CustomerFactory cs = new CustomerFactory();
        System.out.println(cs.getCustomer("Arka").getCustomer());
        System.out.println(cs.getCustomer("HEllo").getCustomer());
    }
}
