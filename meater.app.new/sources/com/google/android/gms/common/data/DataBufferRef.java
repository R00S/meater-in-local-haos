package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferRef {

    /* renamed from: a */
    @KeepForSdk
    protected final DataHolder f17650a;

    /* renamed from: b */
    @KeepForSdk
    protected int f17651b;

    /* renamed from: c */
    private int f17652c;

    /* renamed from: a */
    protected final void m14260a(int i2) {
        Preconditions.m14375n(i2 >= 0 && i2 < this.f17650a.getCount());
        this.f17651b = i2;
        this.f17652c = this.f17650a.m14265e0(i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DataBufferRef) {
            DataBufferRef dataBufferRef = (DataBufferRef) obj;
            if (Objects.m14355a(Integer.valueOf(dataBufferRef.f17651b), Integer.valueOf(this.f17651b)) && Objects.m14355a(Integer.valueOf(dataBufferRef.f17652c), Integer.valueOf(this.f17652c)) && dataBufferRef.f17650a == this.f17650a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.m14356b(Integer.valueOf(this.f17651b), Integer.valueOf(this.f17652c), this.f17650a);
    }
}
