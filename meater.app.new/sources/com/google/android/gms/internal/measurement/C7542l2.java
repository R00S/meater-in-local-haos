package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes2.dex */
final class C7542l2 extends AbstractC7523i1<Float> implements zzfl<Float>, InterfaceC7549m3, RandomAccess {

    /* renamed from: g */
    private static final C7542l2 f27823g;

    /* renamed from: h */
    private float[] f27824h;

    /* renamed from: i */
    private int f27825i;

    static {
        C7542l2 c7542l2 = new C7542l2(new float[0], 0);
        f27823g = c7542l2;
        c7542l2.mo21144I();
    }

    C7542l2() {
        this(new float[10], 0);
    }

    /* renamed from: g */
    private final void m21231g(int i2) {
        if (i2 < 0 || i2 >= this.f27825i) {
            throw new IndexOutOfBoundsException(m21232h(i2));
        }
    }

    /* renamed from: h */
    private final String m21232h(int i2) {
        int i3 = this.f27825i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        m21146c();
        if (i2 < 0 || i2 > (i3 = this.f27825i)) {
            throw new IndexOutOfBoundsException(m21232h(i2));
        }
        float[] fArr = this.f27824h;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f27824h, i2, fArr2, i2 + 1, this.f27825i - i2);
            this.f27824h = fArr2;
        }
        this.f27824h[i2] = fFloatValue;
        this.f27825i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m21146c();
        zzff.m22289d(collection);
        if (!(collection instanceof C7542l2)) {
            return super.addAll(collection);
        }
        C7542l2 c7542l2 = (C7542l2) collection;
        int i2 = c7542l2.f27825i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f27825i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f27824h;
        if (i4 > fArr.length) {
            this.f27824h = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(c7542l2.f27824h, 0, this.f27824h, this.f27825i, c7542l2.f27825i);
        this.f27825i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: d */
    public final /* synthetic */ zzfl<Float> mo20982d(int i2) {
        if (i2 >= this.f27825i) {
            return new C7542l2(Arrays.copyOf(this.f27824h, i2), this.f27825i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7542l2)) {
            return super.equals(obj);
        }
        C7542l2 c7542l2 = (C7542l2) obj;
        if (this.f27825i != c7542l2.f27825i) {
            return false;
        }
        float[] fArr = c7542l2.f27824h;
        for (int i2 = 0; i2 < this.f27825i; i2++) {
            if (Float.floatToIntBits(this.f27824h[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m21233f(float f2) {
        m21146c();
        int i2 = this.f27825i;
        float[] fArr = this.f27824h;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f27824h = fArr2;
        }
        float[] fArr3 = this.f27824h;
        int i3 = this.f27825i;
        this.f27825i = i3 + 1;
        fArr3[i3] = f2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m21231g(i2);
        return Float.valueOf(this.f27824h[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f27825i; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f27824h[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m21146c();
        for (int i2 = 0; i2 < this.f27825i; i2++) {
            if (obj.equals(Float.valueOf(this.f27824h[i2]))) {
                float[] fArr = this.f27824h;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f27825i - i2) - 1);
                this.f27825i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        m21146c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f27824h;
        System.arraycopy(fArr, i3, fArr, i2, this.f27825i - i3);
        this.f27825i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m21146c();
        m21231g(i2);
        float[] fArr = this.f27824h;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27825i;
    }

    private C7542l2(float[] fArr, int i2) {
        this.f27824h = fArr;
        this.f27825i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m21146c();
        m21231g(i2);
        float[] fArr = this.f27824h;
        float f2 = fArr[i2];
        if (i2 < this.f27825i - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f27825i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m21233f(((Float) obj).floatValue());
        return true;
    }
}
