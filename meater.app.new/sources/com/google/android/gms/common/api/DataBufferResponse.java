package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @Override // com.google.android.gms.common.api.Releasable
    /* renamed from: c */
    public void mo13849c() {
        ((AbstractDataBuffer) m13906f()).mo13849c();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public T get(int i2) {
        return (T) ((AbstractDataBuffer) m13906f()).get(i2);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return ((AbstractDataBuffer) m13906f()).getCount();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return ((AbstractDataBuffer) m13906f()).iterator();
    }
}
