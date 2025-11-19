package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C2915z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2902l extends AbstractC2893c<Double> implements C2915z.b, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2902l f37873E;

    /* renamed from: C, reason: collision with root package name */
    private double[] f37874C;

    /* renamed from: D, reason: collision with root package name */
    private int f37875D;

    static {
        C2902l c2902l = new C2902l(new double[0], 0);
        f37873E = c2902l;
        c2902l.n();
    }

    C2902l() {
        this(new double[10], 0);
    }

    private void j(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f37875D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        double[] dArr = this.f37874C;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f37874C, i10, dArr2, i10 + 1, this.f37875D - i10);
            this.f37874C = dArr2;
        }
        this.f37874C[i10] = d10;
        this.f37875D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f37875D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37875D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(B(i10, d10.doubleValue()));
    }

    public double B(int i10, double d10) {
        c();
        r(i10);
        double[] dArr = this.f37874C;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        C2915z.a(collection);
        if (!(collection instanceof C2902l)) {
            return super.addAll(collection);
        }
        C2902l c2902l = (C2902l) collection;
        int i10 = c2902l.f37875D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37875D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f37874C;
        if (i12 > dArr.length) {
            this.f37874C = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2902l.f37874C, 0, this.f37874C, this.f37875D, c2902l.f37875D);
        this.f37875D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2902l)) {
            return super.equals(obj);
        }
        C2902l c2902l = (C2902l) obj;
        if (this.f37875D != c2902l.f37875D) {
            return false;
        }
        double[] dArr = c2902l.f37874C;
        for (int i10 = 0; i10 < this.f37875D; i10++) {
            if (Double.doubleToLongBits(this.f37874C[i10]) != Double.doubleToLongBits(dArr[i10])) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        i(d10.doubleValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f37875D; i10++) {
            iF = (iF * 31) + C2915z.f(Double.doubleToLongBits(this.f37874C[i10]));
        }
        return iF;
    }

    public void i(double d10) {
        c();
        int i10 = this.f37875D;
        double[] dArr = this.f37874C;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f37874C = dArr2;
        }
        double[] dArr3 = this.f37874C;
        int i11 = this.f37875D;
        this.f37875D = i11 + 1;
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
            if (this.f37874C[i10] == dDoubleValue) {
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
        double[] dArr = this.f37874C;
        System.arraycopy(dArr, i11, dArr, i10, this.f37875D - i11);
        this.f37875D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37875D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(w(i10));
    }

    public double w(int i10) {
        r(i10);
        return this.f37874C[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2915z.b k(int i10) {
        if (i10 >= this.f37875D) {
            return new C2902l(Arrays.copyOf(this.f37874C, i10), this.f37875D);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        c();
        r(i10);
        double[] dArr = this.f37874C;
        double d10 = dArr[i10];
        if (i10 < this.f37875D - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f37875D--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    private C2902l(double[] dArr, int i10) {
        this.f37874C = dArr;
        this.f37875D = i10;
    }
}
