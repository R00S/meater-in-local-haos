package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: f */
    protected final DataBuffer<T> f17647f;

    /* renamed from: g */
    protected int f17648g = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        this.f17647f = (DataBuffer) Preconditions.m14372k(dataBuffer);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17648g < this.f17647f.getCount() - 1;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.f17647f;
            int i2 = this.f17648g + 1;
            this.f17648g = i2;
            return dataBuffer.get(i2);
        }
        int i3 = this.f17648g;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i3);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
