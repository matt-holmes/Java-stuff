package designpatterns.templatemethod;

import java.util.*;
import java.util.Map.Entry;

public class IntlClient extends InvoiceBuilder{

    public void applySurcharge() {
        double clientTotal = getTotal();
        clientTotal += 100.0;
        setTotal(clientTotal);
    }

    public void applyDiscounts() {
        for (String key : getItems().keySet()) {
            if(key == "tech_support" && getItems().get(key) > 1000) {
                setTotal(getTotal() * .10);
            }
        }
    }
}
