public class FinancialForecast {
    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        double previousValue = calculateFutureValue(amount, rate, years - 1);
        return previousValue + (previousValue * rate);
    }
    public static void main(String[] args) {
        double initialInvestment = 10000;   
        double annualGrowthRate = 0.10;     
        int years = 5;
        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);
        System.out.println("Future value after " + years + " years is: INR " + futureValue);
    }
}

/*
* Notes:
* Recrusion means a function that calls itself.
* In this example, the `calculateFutureValue` function calculates the future value of an investment using recursion.
* It takes the initial amount, annual growth rate, and number of years as parameters.
* The base case is when `years` is 0, returning the initial amount.
* For other cases, it calculates the future value by calling itself with `years - 1` and adding the growth for the current year.
* Time complexity: O(n) since it makes a recursive call for each year.

* Usually to reduce the time complexity of a recursive function, we use memoization or dynamic programming.
* This example does not use memoization, but it can be added to optimize the recursive calls.
* what we do in dp or memoization is to store the results of previous calculations in a data structure (like an array or a map) so that we can reuse them instead of recalculating them.
* this prevents from calling the functions multiple times that has been already be calculated before.
*/
