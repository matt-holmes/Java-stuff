package tests;

import static org.junit.Assert.*;
import designpatterns.templatemethod.*;
import java.util.*;
import org.junit.Before;
import org.junit.Test;

public class TemplateMethodTest {

    private HashMap<String, Double> items;

    private HashMap<String, Double> items2;


    @Before
    public void setup() {
        items = new HashMap<String, Double>();
        items.put("tech_support", 5000.0);
        items.put("customer_support", 7500.0);

        items2 = new HashMap<String, Double>();
        items2.put("tech_support", 500.0);
        items2.put("customer_support", 750.0);
    }

    @Test
    public void testCalcTotal() {
        InvoiceBuilder dc = new DomesticClient();
        dc.calcTotal(items);
        assertEquals(1252.5, dc.getTotal(), 0.001);
        dc.calcTotal(items2);
        assertEquals(1275.0, dc.getTotal(), 0.001);

        InvoiceBuilder ic = new IntlClient();
        ic.calcTotal(items);
        assertEquals(1260, ic.getTotal(), 0.001);
        ic.calcTotal(items2);
        assertEquals(1350, ic.getTotal(), 0.001);
    }

}
