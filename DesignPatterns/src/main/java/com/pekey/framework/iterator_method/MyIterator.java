package com.pekey.framework.iterator_method;

public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = 0;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = collection.get(pos++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (pos == collection.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}
