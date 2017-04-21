package designpatterns.templatemethod;

import java.util.*;
import java.util.Map.Entry;

abstract public class InvoiceBuilder {

    private double total;

    private Map<String, Double> items;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    //Template method
    public void calcTotal(HashMap<String, Double> items) {
        total = 0.0;
        this.items = items;
        calcTotalServices();
        applySurcharge();
        applyDiscounts();
    }

    //method will be the same for its subclass
    public void calcTotalServices() {
        for (String key : items.keySet()) {
            total += items.get(key);
        }
    }

    //methods will be implemented by its subclass
    public abstract void applyDiscounts();

    public abstract void applySurcharge();
}
