package InterfacePractice;

public interface InterfacePractice_1 {
    public  void m1();
    public default void defaultMethod(){
        System.out.println("Printng default method nside nterface");
    }
}
