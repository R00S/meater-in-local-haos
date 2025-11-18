package com.google.android.gms.common.data;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {

    /* renamed from: f */
    protected final DataHolder f17640f;

    @Override // com.google.android.gms.common.api.Releasable
    /* renamed from: c */
    public void mo13849c() {
        DataHolder dataHolder = this.f17640f;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public abstract T get(int i2);

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        DataHolder dataHolder = this.f17640f;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }
}
