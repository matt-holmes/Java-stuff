package designpatterns.templatemethod;

import java.util.*;
import java.util.Map.Entry;

public class DomesticClient extends InvoiceBuilder{

    public void applySurcharge() {
        double clientTotal = getTotal();
        clientTotal += 25.0;
        setTotal(clientTotal);
    }

    public void applyDiscounts() {
        for (String key : getItems().keySet()) {
            if(key == "customer_support" && getItems().get(key) > 1000.0) {
                setTotal(getTotal() * .10);
            }
        }
    }
}
