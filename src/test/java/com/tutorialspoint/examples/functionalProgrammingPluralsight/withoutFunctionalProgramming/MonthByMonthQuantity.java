package com.tutorialspoint.examples.functionalProgrammingPluralsight.withoutFunctionalProgramming;

public class MonthByMonthQuantity implements QuantityOfInterest {

    private final double[] values;

    protected MonthByMonthQuantity(final double[] values) {
        this.values = values;
    }

    @Override
    public double valueAt(final int time) {
        return values[time - 1];
    }

    @Override
    public String getName() {
        return "Month By Month Quantity";
    }
}
