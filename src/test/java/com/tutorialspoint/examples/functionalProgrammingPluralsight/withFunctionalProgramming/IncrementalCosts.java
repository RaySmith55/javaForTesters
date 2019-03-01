package com.tutorialspoint.examples.functionalProgrammingPluralsight.withFunctionalProgramming;

import com.tutorialspoint.examples.functionalProgrammingPluralsight.withoutFunctionalProgramming.QuantityOfInterest;

public class IncrementalCosts implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public IncrementalCosts(FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    public String getName() {
        return "Incremental Costs";
    }

    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
