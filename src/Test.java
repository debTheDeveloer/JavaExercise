import java.util.ArrayList;

public class Test {
    ArrayList<String> al;

    public ArrayList<String> getAl() {
        return al;
    }

    public void setAl(ArrayList<String> al) {
        this.al = al;
    }

    public void printStuff(){
        System.out.println("A");
    }

    public void add(){
        int x = 0b000000000000000001111;
        System.out.println(x);
    }

    public static void main(String[] args){
        Test t= new Test();
        t.add();

    }






}
