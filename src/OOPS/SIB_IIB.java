package OOPS;

public class SIB_IIB {
    {
        System.out.println("FIB");//3 //7
    }
    static {
        System.out.println("FSB");//1
    }
    SIB_IIB(){
        System.out.println("constructor");//5 //9
    }
    public static void main(String[] args){
        SIB_IIB s = new SIB_IIB();
        System.out.println("main");//6
        SIB_IIB s2 = new SIB_IIB();
    }
    static {
        System.out.println("SSB");//2
    }
    {
        System.out.println("SIB");//4 //8
    }
}
