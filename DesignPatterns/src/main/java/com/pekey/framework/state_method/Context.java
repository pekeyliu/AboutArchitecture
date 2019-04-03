package com.pekey.framework.state_method;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void method(){
        if ("state1".equals(state.getValue())){
            state.method1();
        }else if ("state2".equals(state.getValue())){
            state.method2();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
