package com.pekey.framework.observer_method;

import com.pekey.framework.observer_method.sbserver.Observer1;
import com.pekey.framework.observer_method.sbserver.Observer2;
import com.pekey.framework.observer_method.subject.MySubject;
import com.pekey.framework.observer_method.subject.Subject;

public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
