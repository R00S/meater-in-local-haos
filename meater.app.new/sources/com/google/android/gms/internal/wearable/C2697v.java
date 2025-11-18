package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2697v extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: B, reason: collision with root package name */
    final float[] f34683B;

    /* renamed from: C, reason: collision with root package name */
    final int f34684C;

    /* renamed from: D, reason: collision with root package name */
    final int f34685D;

    C2697v(float[] fArr, int i10, int i11) {
        this.f34683B = fArr;
        this.f34684C = i10;
        this.f34685D = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Float) && C2699w.a(this.f34683B, ((Float) obj).floatValue(), this.f34684C, this.f34685D) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2697v)) {
            return super.equals(obj);
        }
        C2697v c2697v = (C2697v) obj;
        int i10 = this.f34685D - this.f34684C;
        if (c2697v.f34685D - c2697v.f34684C != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34683B[this.f34684C + i11] != c2697v.f34683B[c2697v.f34684C + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C2680o.a(i10, this.f34685D - this.f34684C, "index");
        return Float.valueOf(this.f34683B[this.f34684C + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f34684C; i10 < this.f34685D; i10++) {
            iHashCode = (iHashCode * 31) + Float.valueOf(this.f34683B[i10]).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iA;
        if (!(obj instanceof Float) || (iA = C2699w.a(this.f34683B, ((Float) obj).floatValue(), this.f34684C, this.f34685D)) < 0) {
            return -1;
        }
        return iA - this.f34684C;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.f34683B;
            float fFloatValue = ((Float) obj).floatValue();
            int i10 = this.f34684C;
            int i11 = this.f34685D - 1;
            while (true) {
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (fArr[i11] == fFloatValue) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                return i11 - this.f34684C;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        Float f10 = (Float) obj;
        C2680o.a(i10, this.f34685D - this.f34684C, "index");
        float[] fArr = this.f34683B;
        int i11 = this.f34684C + i10;
        float f11 = fArr[i11];
        f10.getClass();
        fArr[i11] = f10.floatValue();
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34685D - this.f34684C;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        C2680o.b(i10, i11, this.f34685D - this.f34684C);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        float[] fArr = this.f34683B;
        int i12 = this.f34684C;
        return new C2697v(fArr, i12 + i10, i11 + i12);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f34685D - this.f34684C) * 12);
        sb2.append('[');
        sb2.append(this.f34683B[this.f34684C]);
        int i10 = this.f34684C;
        while (true) {
            i10++;
            if (i10 >= this.f34685D) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f34683B[i10]);
        }
    }
}
