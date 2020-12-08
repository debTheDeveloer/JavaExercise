package ExceptionHandling;

public class ThrowChekcedException {

    public static void main(String args[]){
        try {
            throw new InterruptedException();
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
