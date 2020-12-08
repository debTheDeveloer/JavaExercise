package DesignPattern.NullObject;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> customerNames;

    public Database() {
        this.customerNames = new ArrayList();
        customerNames.add("Arka");
        customerNames.add("Debajyoti");
        customerNames.add("Noel");
        customerNames.add("Ranganath");
        customerNames.add("Rudra");

    }

    public boolean existCustomer(String s) {
        for (String string : customerNames) {
            if (s.equals(string))
                return true;
        }
        return false;
    }
}
