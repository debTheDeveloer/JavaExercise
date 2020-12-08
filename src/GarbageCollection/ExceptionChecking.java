package GarbageCollection;

public class ExceptionChecking {

    public static void main(String[] args) {
        ExceptionChecking ex = new ExceptionChecking();
       // ex.finalize();
        ex = null;
        System.gc();
        System.out.println("End of main method");
    }


   /* public void finalize() {
        System.out.println("finalize method called");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Cant divide by 0");
        }
    }*/

    public void finalize(){
        System.out.println("finalize method called");
        System.out.println(10/0);
    }
}

