package com.pekey.framework.strategy_method;

public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2*8";
        ICalculator cal = new Multiply();
        int result = cal.caclulate(exp);
        System.out.println(result);
    }
}