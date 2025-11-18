package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes2.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: h */
    private T f17674h;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public T next() {
        if (!hasNext()) {
            int i2 = this.f17648g;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Cannot advance the iterator beyond ");
            sb.append(i2);
            throw new NoSuchElementException(sb.toString());
        }
        int i3 = this.f17648g + 1;
        this.f17648g = i3;
        if (i3 == 0) {
            T t = this.f17647f.get(0);
            this.f17674h = t;
            if (!(t instanceof DataBufferRef)) {
                String strValueOf = String.valueOf(this.f17674h.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 44);
                sb2.append("DataBuffer reference of type ");
                sb2.append(strValueOf);
                sb2.append(" is not movable");
                throw new IllegalStateException(sb2.toString());
            }
        } else {
            ((DataBufferRef) this.f17674h).m14260a(i3);
        }
        return this.f17674h;
    }
}
