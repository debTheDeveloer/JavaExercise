package ExceptionHandling;

public class TryCatchExecution {

    public static void main(String[] args){
        System.out.println("1");
        try {
            System.out.println("Inside Try block");
            exceptionTryBlock();
        }catch (ArithmeticException ae){
            System.out.println("2");
//            System.out.println(10/0);
        }finally {
            System.out.println("Inside finally block");
//            System.out.println(10/0);
        }
        System.out.println("Out of try catch block");
    }

    private static void exceptionTryBlock() {
        System.out.println(10/0);
    }
}
