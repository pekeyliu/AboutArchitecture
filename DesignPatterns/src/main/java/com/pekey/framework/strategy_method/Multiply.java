package com.pekey.framework.strategy_method;

public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int caclulate(String exp) {
        int arrayInt[] = split(exp,"\\*");
        return arrayInt[0]*arrayInt[1];
    }
}
