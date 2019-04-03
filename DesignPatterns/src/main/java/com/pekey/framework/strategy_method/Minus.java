package com.pekey.framework.strategy_method;

public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int caclulate(String exp) {
        int array[] = split(exp, "-");
        return array[0] + array[1];
    }
}
