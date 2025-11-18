package com.google.protobuf;

import com.google.protobuf.C2964y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2951k extends AbstractC2943c<Double> implements C2964y.b, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2951k f39301E = new C2951k(new double[0], 0, false);

    /* renamed from: C, reason: collision with root package name */
    private double[] f39302C;

    /* renamed from: D, reason: collision with root package name */
    private int f39303D;

    C2951k() {
        this(new double[10], 0, true);
    }

    private void j(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f39303D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        double[] dArr = this.f39302C;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f39302C, i10, dArr2, i10 + 1, this.f39303D - i10);
            this.f39302C = dArr2;
        }
        this.f39302C[i10] = d10;
        this.f39303D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f39303D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f39303D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(B(i10, d10.doubleValue()));
    }

    public double B(int i10, double d10) {
        c();
        r(i10);
        double[] dArr = this.f39302C;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        C2964y.a(collection);
        if (!(collection instanceof C2951k)) {
            return super.addAll(collection);
        }
        C2951k c2951k = (C2951k) collection;
        int i10 = c2951k.f39303D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39303D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f39302C;
        if (i12 > dArr.length) {
            this.f39302C = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2951k.f39302C, 0, this.f39302C, this.f39303D, c2951k.f39303D);
        this.f39303D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2951k)) {
            return super.equals(obj);
        }
        C2951k c2951k = (C2951k) obj;
        if (this.f39303D != c2951k.f39303D) {
            return false;
        }
        double[] dArr = c2951k.f39302C;
        for (int i10 = 0; i10 < this.f39303D; i10++) {
            if (Double.doubleToLongBits(this.f39302C[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        j(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        i(d10.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f39303D; i10++) {
            iF = (iF * 31) + C2964y.f(Double.doubleToLongBits(this.f39302C[i10]));
        }
        return iF;
    }

    public void i(double d10) {
        c();
        int i10 = this.f39303D;
        double[] dArr = this.f39302C;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f39302C = dArr2;
        }
        double[] dArr3 = this.f39302C;
        int i11 = this.f39303D;
        this.f39303D = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f39302C[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f39302C;
        System.arraycopy(dArr, i11, dArr, i10, this.f39303D - i11);
        this.f39303D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39303D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(w(i10));
    }

    public double w(int i10) {
        r(i10);
        return this.f39302C[i10];
    }

    @Override // com.google.protobuf.C2964y.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2964y.b k(int i10) {
        if (i10 >= this.f39303D) {
            return new C2951k(Arrays.copyOf(this.f39302C, i10), this.f39303D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        c();
        r(i10);
        double[] dArr = this.f39302C;
        double d10 = dArr[i10];
        if (i10 < this.f39303D - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f39303D--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    private C2951k(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f39302C = dArr;
        this.f39303D = i10;
    }
}
