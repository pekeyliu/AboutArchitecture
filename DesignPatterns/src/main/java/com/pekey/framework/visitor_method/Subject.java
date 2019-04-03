package com.pekey.framework.visitor_method;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
