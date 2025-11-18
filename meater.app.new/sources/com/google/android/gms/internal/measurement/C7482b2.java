package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* loaded from: classes2.dex */
final class C7482b2 extends AbstractC7523i1<Double> implements zzfl<Double>, InterfaceC7549m3, RandomAccess {

    /* renamed from: g */
    private static final C7482b2 f27694g;

    /* renamed from: h */
    private double[] f27695h;

    /* renamed from: i */
    private int f27696i;

    static {
        C7482b2 c7482b2 = new C7482b2(new double[0], 0);
        f27694g = c7482b2;
        c7482b2.mo21144I();
    }

    C7482b2() {
        this(new double[10], 0);
    }

    /* renamed from: g */
    private final void m20980g(int i2) {
        if (i2 < 0 || i2 >= this.f27696i) {
            throw new IndexOutOfBoundsException(m20981h(i2));
        }
    }

    /* renamed from: h */
    private final String m20981h(int i2) {
        int i3 = this.f27696i;
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
        double dDoubleValue = ((Double) obj).doubleValue();
        m21146c();
        if (i2 < 0 || i2 > (i3 = this.f27696i)) {
            throw new IndexOutOfBoundsException(m20981h(i2));
        }
        double[] dArr = this.f27695h;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f27695h, i2, dArr2, i2 + 1, this.f27696i - i2);
            this.f27695h = dArr2;
        }
        this.f27695h[i2] = dDoubleValue;
        this.f27696i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m21146c();
        zzff.m22289d(collection);
        if (!(collection instanceof C7482b2)) {
            return super.addAll(collection);
        }
        C7482b2 c7482b2 = (C7482b2) collection;
        int i2 = c7482b2.f27696i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f27696i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f27695h;
        if (i4 > dArr.length) {
            this.f27695h = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(c7482b2.f27695h, 0, this.f27695h, this.f27696i, c7482b2.f27696i);
        this.f27696i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: d */
    public final /* synthetic */ zzfl<Double> mo20982d(int i2) {
        if (i2 >= this.f27696i) {
            return new C7482b2(Arrays.copyOf(this.f27695h, i2), this.f27696i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7482b2)) {
            return super.equals(obj);
        }
        C7482b2 c7482b2 = (C7482b2) obj;
        if (this.f27696i != c7482b2.f27696i) {
            return false;
        }
        double[] dArr = c7482b2.f27695h;
        for (int i2 = 0; i2 < this.f27696i; i2++) {
            if (Double.doubleToLongBits(this.f27695h[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m20983f(double d2) {
        m21146c();
        int i2 = this.f27696i;
        double[] dArr = this.f27695h;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f27695h = dArr2;
        }
        double[] dArr3 = this.f27695h;
        int i3 = this.f27696i;
        this.f27696i = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m20980g(i2);
        return Double.valueOf(this.f27695h[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM22287b = 1;
        for (int i2 = 0; i2 < this.f27696i; i2++) {
            iM22287b = (iM22287b * 31) + zzff.m22287b(Double.doubleToLongBits(this.f27695h[i2]));
        }
        return iM22287b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m21146c();
        for (int i2 = 0; i2 < this.f27696i; i2++) {
            if (obj.equals(Double.valueOf(this.f27695h[i2]))) {
                double[] dArr = this.f27695h;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f27696i - i2) - 1);
                this.f27696i--;
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
        double[] dArr = this.f27695h;
        System.arraycopy(dArr, i3, dArr, i2, this.f27696i - i3);
        this.f27696i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m21146c();
        m20980g(i2);
        double[] dArr = this.f27695h;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27696i;
    }

    private C7482b2(double[] dArr, int i2) {
        this.f27695h = dArr;
        this.f27696i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m21146c();
        m20980g(i2);
        double[] dArr = this.f27695h;
        double d2 = dArr[i2];
        if (i2 < this.f27696i - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f27696i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m20983f(((Double) obj).doubleValue());
        return true;
    }
}
