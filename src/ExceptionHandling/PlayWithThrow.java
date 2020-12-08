package ExceptionHandling;

public class PlayWithThrow extends Throwable { //if we dont extends Throwable or RuntimeException we cant throw the obj of
//                                                    PlayWithThrow
    public static void main(String[] args) throws PlayWithThrow {
        throw new PlayWithThrow();
//        System.out.println("This line is not reachable");
    }

}


