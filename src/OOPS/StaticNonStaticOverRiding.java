package OOPS;

public class StaticNonStaticOverRiding {

    public  void check(){
        System.out.println("Its a non static method");
    }
}
 class StaticNonStaticOverRidingPractice extends StaticNonStaticOverRiding{

    @Override
//     public static void check(){
    public  void check(){
        System.out.println("OverRided Parent's check method");
    }

    public void check(String s){ // OverLoading
        System.out.println(s);
    }

    public static void main(String[] args){
        StaticNonStaticOverRidingPractice s = new StaticNonStaticOverRidingPractice();
        s.check();
        s.check("Arka");
    }
 }