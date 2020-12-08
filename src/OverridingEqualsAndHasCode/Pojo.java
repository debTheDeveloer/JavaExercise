package OverridingEqualsAndHasCode;

public class Pojo {
    int i;
    int j;

    public Pojo(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Pojo) {
            Pojo p2 = (Pojo) obj;
            if (p2.i == this.i && p2.j == this.j)
                return true;
            else
                return false;
        } else
            return false;

    }

    @Override
    public  int hashCode(){
        return this.i+this.j;
    }
}
