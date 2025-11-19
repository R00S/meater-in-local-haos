package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2703y extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: B, reason: collision with root package name */
    final long[] f34717B;

    /* renamed from: C, reason: collision with root package name */
    final int f34718C;

    /* renamed from: D, reason: collision with root package name */
    final int f34719D;

    C2703y(long[] jArr, int i10, int i11) {
        this.f34717B = jArr;
        this.f34718C = i10;
        this.f34719D = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Long) && C2705z.a(this.f34717B, ((Long) obj).longValue(), this.f34718C, this.f34719D) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2703y)) {
            return super.equals(obj);
        }
        C2703y c2703y = (C2703y) obj;
        int i10 = this.f34719D - this.f34718C;
        if (c2703y.f34719D - c2703y.f34718C != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34717B[this.f34718C + i11] != c2703y.f34717B[c2703y.f34718C + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C2680o.a(i10, this.f34719D - this.f34718C, "index");
        return Long.valueOf(this.f34717B[this.f34718C + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f34718C; i11 < this.f34719D; i11++) {
            long j10 = this.f34717B[i11];
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iA;
        if (!(obj instanceof Long) || (iA = C2705z.a(this.f34717B, ((Long) obj).longValue(), this.f34718C, this.f34719D)) < 0) {
            return -1;
        }
        return iA - this.f34718C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            long[] jArr = this.f34717B;
            long jLongValue = ((Long) obj).longValue();
            int i10 = this.f34718C;
            int i11 = this.f34719D - 1;
            while (true) {
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (jArr[i11] == jLongValue) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                return i11 - this.f34718C;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        Long l10 = (Long) obj;
        C2680o.a(i10, this.f34719D - this.f34718C, "index");
        long[] jArr = this.f34717B;
        int i11 = this.f34718C + i10;
        long j10 = jArr[i11];
        l10.getClass();
        jArr[i11] = l10.longValue();
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34719D - this.f34718C;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        C2680o.b(i10, i11, this.f34719D - this.f34718C);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        long[] jArr = this.f34717B;
        int i12 = this.f34718C;
        return new C2703y(jArr, i12 + i10, i11 + i12);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f34719D - this.f34718C) * 10);
        sb2.append('[');
        sb2.append(this.f34717B[this.f34718C]);
        int i10 = this.f34718C;
        while (true) {
            i10++;
            if (i10 >= this.f34719D) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f34717B[i10]);
        }
    }
}
