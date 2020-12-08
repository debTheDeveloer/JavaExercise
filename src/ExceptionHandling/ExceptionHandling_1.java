package ExceptionHandling;

public class ExceptionHandling_1 {

    public void firstExceptionHandling() {
        int i = 8;
        int j = 0;
//        System.out.println("Division Result is: " + i / j); //If we dont use try catch block, flow will get stop here.
        //By using try catch block flow will go on beyond the catch block.
        try {
            System.out.println("Division Result is: " + i / j);
        } catch (ArithmeticException ae) {
            System.out.println("Can't be divided by 0" + ae);
        }
        System.out.println("Just afetr catch block");
        printSomething();

    }

    private void printSomething() {
        System.out.println("I am runing even after exception happens");
    }
}
