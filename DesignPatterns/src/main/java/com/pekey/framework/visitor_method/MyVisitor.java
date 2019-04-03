package com.pekey.framework.visitor_method;

public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("访问对象：" + subject.getSubject());
    }
}
