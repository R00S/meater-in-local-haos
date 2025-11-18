package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzsn {

    /* renamed from: a */
    private int f26993a;

    /* renamed from: b */
    private long[] f26994b;

    public zzsn() {
        this(32);
    }

    /* renamed from: a */
    public final void m20491a(long j2) {
        int i2 = this.f26993a;
        long[] jArr = this.f26994b;
        if (i2 == jArr.length) {
            this.f26994b = Arrays.copyOf(jArr, i2 << 1);
        }
        long[] jArr2 = this.f26994b;
        int i3 = this.f26993a;
        this.f26993a = i3 + 1;
        jArr2[i3] = j2;
    }

    /* renamed from: b */
    public final long m20492b(int i2) {
        if (i2 >= 0 && i2 < this.f26993a) {
            return this.f26994b[i2];
        }
        int i3 = this.f26993a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i2);
        sb.append(", size is ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final int m20493c() {
        return this.f26993a;
    }

    private zzsn(int i2) {
        this.f26994b = new long[32];
    }
}
