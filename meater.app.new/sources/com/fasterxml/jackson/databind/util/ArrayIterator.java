package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class ArrayIterator<T> implements Iterator<T>, Iterable<T> {

    /* renamed from: _a */
    private final T[] f15614_a;
    private int _index = 0;

    public ArrayIterator(T[] tArr) {
        this.f15614_a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this._index < this.f15614_a.length;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        int i2 = this._index;
        T[] tArr = this.f15614_a;
        if (i2 >= tArr.length) {
            throw new NoSuchElementException();
        }
        this._index = i2 + 1;
        return tArr[i2];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
