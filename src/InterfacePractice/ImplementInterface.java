package InterfacePractice;

public class ImplementInterface implements InterfacePractice_1 {
    @Override
    public void m1() {
        System.out.println("Implementing interface method");
    }

    public static void main(String[] args){
        InterfacePractice_1 inf = new ImplementInterface();
        inf.m1();
        inf.defaultMethod();

        //Doing the same using Lambda expression
        InterfacePractice_1 ifLambda = ()-> System.out.println("implementing Using Lambda");
        ifLambda.m1();
    }
}
