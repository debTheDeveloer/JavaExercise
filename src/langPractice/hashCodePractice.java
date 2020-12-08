package langPractice;

public class hashCodePractice {
    int i;

    public hashCodePractice(int i) {
        this.i = i;
    }

    public int hashCode(){
        System.out.println("OverRided hashcode method is called");
        return i;
    }

    public static void main(String[] args){
        hashCodePractice h = new hashCodePractice(10);
        hashCodePractice h2 = new hashCodePractice(100);

        System.out.println(h);
        System.out.println(h2);
    }
}

//O/p-->OverRided hashcode method is called
//langPractice.hashCodePractice@a
//OverRided hashcode method is called
//langPractice.hashCodePractice@64
