package DesignPattern.NullObject;

public class RealCustomer extends AbstractCustomer {

    private String cutomerName;

    public RealCustomer(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getCustomer() {
        return cutomerName;
    }
}
