package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void demo(){
        List<Double> itemPrices=new ArrayList<>();
        itemPrices.add(200.00);
        itemPrices.add(300.00);
        itemPrices.add(100.00);
        itemPrices.add(400.00);

        System.out.println("All item prices:" + itemPrices);

        CalculatorAdapter calc = new CalculatorAdapter(new Calculatable());
        CalculatorClassAPI calc2 = new CalculatorClassAPI();

        System.out.println("\n=== Legacy Object Design Pattern ===");

        System.out.println("Total price of the items (ADD): " + calc.accumulation(itemPrices));
        System.out.println("Pending balance after payment of 700 (SUB): "+ calc.payment(700.00));

        System.out.println("\n=== Adapter Structural Class Design Pattern ===");

        System.out.println("Total price of the items (ADD): " + calc2.accumulation(itemPrices));
        System.out.println("Pending balance after payment of 700 (SUB): "+ calc2.payment(700.00));
    }
}
