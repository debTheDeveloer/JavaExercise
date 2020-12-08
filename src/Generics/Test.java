package Generics;

public class Test {

    public static void main(String[] args){
        CustomizedGenerics<String> cst = new CustomizedGenerics("Arka");
        cst.show();
        System.out.println(cst.getObject());
        cst.print("Debajyoti");
       // cst.print(10.0f); //CE:  If we are not making print class as generics then this method will only accept String class.
        cst.genericsMethod(10.0f); //If we are making this methid generics then this method can acceot any type of object.s
    }
}
