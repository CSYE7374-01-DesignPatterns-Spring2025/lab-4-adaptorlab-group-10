package edu.neu.csye7374;

import java.util.List;

public class CalculatorClassAPI extends Calculatable implements AccumulatableAPI {

    private double sum;
    public CalculatorClassAPI() {
        super();
        this.sum = 0;
    }
    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double itemPrice : prices) {
            sum = super.operation(OPERATION.ADD,
                    sum, itemPrice);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return super.operation(OPERATION.SUB,
                cash, sum);
    }


}
