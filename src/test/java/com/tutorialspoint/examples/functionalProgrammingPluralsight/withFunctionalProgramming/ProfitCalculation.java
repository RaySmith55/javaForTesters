package com.tutorialspoint.examples.functionalProgrammingPluralsight.withFunctionalProgramming;

import com.tutorialspoint.examples.functionalProgrammingPluralsight.withoutFunctionalProgramming.QuantityOfInterest;

public class ProfitCalculation implements QuantityOfInterest {
    private final Sales sales;
    private final IncrementalCosts incrementalCosts;
    private final FixedCosts fixedCosts;

    public ProfitCalculation(Sales s, IncrementalCosts ic, FixedCosts fc) {
        this.sales = s;
        this.incrementalCosts = ic;
        this.fixedCosts = fc;
    }

    public String getName() {
        return "Profit!!!";
    }

    public double valueAt(int time) {
        return sales.valueAt(time) -
                (incrementalCosts.valueAt(time) +
                fixedCosts.valueAt(time));
    }
}
