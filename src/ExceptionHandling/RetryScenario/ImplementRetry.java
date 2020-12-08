package ExceptionHandling.RetryScenario;

public class ImplementRetry {

    int count=0;
    public  void calingClass(){
        try {
            count++;
            System.out.println("Url calling is happening for "+count+ "time");
            callUrl();
        }catch (Exception e){
            if(count<3)
                calingClass();
            else
                throw new CustomizedException("Unable to process");
        }
    }

    private void callUrl() throws Exception {
        throw new Exception();
    }
}
