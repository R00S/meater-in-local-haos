package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzkk {

    /* renamed from: a */
    private int f26422a;

    /* renamed from: b */
    private long[] f26423b;

    public zzkk() {
        this(32);
    }

    /* renamed from: a */
    public final void m20133a(long j2) {
        int i2 = this.f26422a;
        long[] jArr = this.f26423b;
        if (i2 == jArr.length) {
            this.f26423b = Arrays.copyOf(jArr, i2 << 1);
        }
        long[] jArr2 = this.f26423b;
        int i3 = this.f26422a;
        this.f26422a = i3 + 1;
        jArr2[i3] = j2;
    }

    /* renamed from: b */
    public final long m20134b(int i2) {
        if (i2 >= 0 && i2 < this.f26422a) {
            return this.f26423b[i2];
        }
        int i3 = this.f26422a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Invalid size ");
        sb.append(i2);
        sb.append(", size is ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final int m20135c() {
        return this.f26422a;
    }

    private zzkk(int i2) {
        this.f26423b = new long[32];
    }
}
