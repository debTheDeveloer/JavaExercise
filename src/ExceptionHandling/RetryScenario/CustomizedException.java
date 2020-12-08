package ExceptionHandling.RetryScenario;

public class CustomizedException extends RuntimeException {
    public CustomizedException(String unable_to_process) {
        super();
        System.out.println(unable_to_process);
    }
}
