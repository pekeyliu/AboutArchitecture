package com.pekey.framework.iterator_method;

public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
