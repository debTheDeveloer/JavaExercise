package DecalrationAndAccessModifier;

public class LocalVariable {
    int m;
    static int n;
    public static void main(String args[]){
        int i; // For local variable JVM woudnt do initialization. We have to initialize that explicitely. Otherwise it will give
                //compile time error during its usage line.

        //System.out.println(i); //Like here it is giving compilation error.

        int j=0;
        System.out.println(j); //All ok here.
        //m=0;//non static variable we cant use here.
        n=24; //only static variable can be used inside static area.


    }
}
