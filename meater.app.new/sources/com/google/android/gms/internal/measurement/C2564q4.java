package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2564q4 extends S3<Double> implements L4<Double>, InterfaceC2604v5, RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final double[] f34271E;

    /* renamed from: C, reason: collision with root package name */
    private double[] f34272C;

    /* renamed from: D, reason: collision with root package name */
    private int f34273D;

    static {
        double[] dArr = new double[0];
        f34271E = dArr;
        new C2564q4(dArr, 0, false);
    }

    C2564q4() {
        this(f34271E, 0, true);
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34273D;
    }

    private final void v(int i10) {
        if (i10 < 0 || i10 >= this.f34273D) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34273D)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        double[] dArr = this.f34272C;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[j(dArr.length)];
            System.arraycopy(this.f34272C, 0, dArr2, 0, i10);
            System.arraycopy(this.f34272C, i10, dArr2, i10 + 1, this.f34273D - i10);
            this.f34272C = dArr2;
        }
        this.f34272C[i10] = dDoubleValue;
        this.f34273D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        I4.e(collection);
        if (!(collection instanceof C2564q4)) {
            return super.addAll(collection);
        }
        C2564q4 c2564q4 = (C2564q4) collection;
        int i10 = c2564q4.f34273D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34273D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f34272C;
        if (i12 > dArr.length) {
            this.f34272C = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2564q4.f34272C, 0, this.f34272C, this.f34273D, c2564q4.f34273D);
        this.f34273D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2564q4)) {
            return super.equals(obj);
        }
        C2564q4 c2564q4 = (C2564q4) obj;
        if (this.f34273D != c2564q4.f34273D) {
            return false;
        }
        double[] dArr = c2564q4.f34272C;
        for (int i10 = 0; i10 < this.f34273D; i10++) {
            if (Double.doubleToLongBits(this.f34272C[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d10) {
        c();
        int i10 = this.f34273D;
        double[] dArr = this.f34272C;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[j(dArr.length)];
            System.arraycopy(this.f34272C, 0, dArr2, 0, this.f34273D);
            this.f34272C = dArr2;
        }
        double[] dArr3 = this.f34272C;
        int i11 = this.f34273D;
        this.f34273D = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4<Double> g(int i10) {
        if (i10 >= this.f34273D) {
            return new C2564q4(i10 == 0 ? f34271E : Arrays.copyOf(this.f34272C, i10), this.f34273D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Double.valueOf(h(i10));
    }

    public final double h(int i10) {
        v(i10);
        return this.f34272C[i10];
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f34273D; i10++) {
            iB = (iB * 31) + I4.b(Double.doubleToLongBits(this.f34272C[i10]));
        }
        return iB;
    }

    final void i(int i10) {
        double[] dArr = this.f34272C;
        if (i10 <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.f34272C = new double[Math.max(i10, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i10) {
            length = j(length);
        }
        this.f34272C = Arrays.copyOf(this.f34272C, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f34272C[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        v(i10);
        double[] dArr = this.f34272C;
        double d10 = dArr[i10];
        if (i10 < this.f34273D - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f34273D--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f34272C;
        System.arraycopy(dArr, i11, dArr, i10, this.f34273D - i11);
        this.f34273D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        v(i10);
        double[] dArr = this.f34272C;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34273D;
    }

    private C2564q4(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f34272C = dArr;
        this.f34273D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
