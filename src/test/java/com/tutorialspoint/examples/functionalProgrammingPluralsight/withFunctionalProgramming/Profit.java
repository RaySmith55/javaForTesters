package com.tutorialspoint.examples.functionalProgrammingPluralsight.withFunctionalProgramming;

public class Profit {

    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] {42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8};

    public static void main(String[] args) {

        final Sales sales = new Sales(
                FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC));

        final FixedCosts fixedCosts = new FixedCosts(
                FunctionOverTime.constant(15.0));

        final IncrementalCosts incrementalCosts = new IncrementalCosts(
                FunctionOverTime.line(5.1, 0.15));

        final ProfitCalculation profitCalculation =
                new ProfitCalculation(
                        sales,
                        incrementalCosts,
                        fixedCosts);

        Double totalProfit = 0.0;
        for(int time = 1; time <= 12; time++) {
            totalProfit += profitCalculation.valueAt(time);
        }

        System.out.println("Total profits for the year: " + totalProfit);
    }
}
