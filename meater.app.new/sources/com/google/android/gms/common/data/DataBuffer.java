package com.google.android.gms.common.data;

import com.google.android.gms.common.api.Releasable;

/* loaded from: classes2.dex */
public interface DataBuffer<T> extends Releasable, Iterable<T> {
    T get(int i2);

    int getCount();
}
