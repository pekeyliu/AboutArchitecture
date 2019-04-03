package com.pekey.framework.observer_method.subject;

import com.pekey.framework.observer_method.sbserver.Observer;

import java.util.Enumeration;
import java.util.Vector;

public class AbstractSubject implements Subject {


    private Vector vector = new Vector();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration enumo = vector.elements();
        while(enumo.hasMoreElements()){
            Observer observer = (Observer) enumo.nextElement();
            observer.update();
        }
    }

    @Override
    public void operation() {

    }

}
