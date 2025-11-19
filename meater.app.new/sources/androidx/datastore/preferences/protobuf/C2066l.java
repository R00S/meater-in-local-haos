package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2079z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2066l extends AbstractC2057c<Double> implements C2079z.b, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2066l f24995E;

    /* renamed from: C, reason: collision with root package name */
    private double[] f24996C;

    /* renamed from: D, reason: collision with root package name */
    private int f24997D;

    static {
        C2066l c2066l = new C2066l(new double[0], 0);
        f24995E = c2066l;
        c2066l.n();
    }

    C2066l() {
        this(new double[10], 0);
    }

    private void j(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f24997D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        double[] dArr = this.f24996C;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f24996C, i10, dArr2, i10 + 1, this.f24997D - i10);
            this.f24996C = dArr2;
        }
        this.f24996C[i10] = d10;
        this.f24997D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f24997D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24997D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(B(i10, d10.doubleValue()));
    }

    public double B(int i10, double d10) {
        c();
        r(i10);
        double[] dArr = this.f24996C;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        C2079z.a(collection);
        if (!(collection instanceof C2066l)) {
            return super.addAll(collection);
        }
        C2066l c2066l = (C2066l) collection;
        int i10 = c2066l.f24997D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24997D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f24996C;
        if (i12 > dArr.length) {
            this.f24996C = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2066l.f24996C, 0, this.f24996C, this.f24997D, c2066l.f24997D);
        this.f24997D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2066l)) {
            return super.equals(obj);
        }
        C2066l c2066l = (C2066l) obj;
        if (this.f24997D != c2066l.f24997D) {
            return false;
        }
        double[] dArr = c2066l.f24996C;
        for (int i10 = 0; i10 < this.f24997D; i10++) {
            if (Double.doubleToLongBits(this.f24996C[i10]) != Double.doubleToLongBits(dArr[i10])) {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        i(d10.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f24997D; i10++) {
            iF = (iF * 31) + C2079z.f(Double.doubleToLongBits(this.f24996C[i10]));
        }
        return iF;
    }

    public void i(double d10) {
        c();
        int i10 = this.f24997D;
        double[] dArr = this.f24996C;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f24996C = dArr2;
        }
        double[] dArr3 = this.f24996C;
        int i11 = this.f24997D;
        this.f24997D = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f24996C;
        System.arraycopy(dArr, i11, dArr, i10, this.f24997D - i11);
        this.f24997D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24997D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(w(i10));
    }

    public double w(int i10) {
        r(i10);
        return this.f24996C[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2079z.b k(int i10) {
        if (i10 >= this.f24997D) {
            return new C2066l(Arrays.copyOf(this.f24996C, i10), this.f24997D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        c();
        r(i10);
        double[] dArr = this.f24996C;
        double d10 = dArr[i10];
        if (i10 < this.f24997D - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f24997D--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    private C2066l(double[] dArr, int i10) {
        this.f24996C = dArr;
        this.f24997D = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f24997D; i10++) {
            if (obj.equals(Double.valueOf(this.f24996C[i10]))) {
                double[] dArr = this.f24996C;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f24997D - i10) - 1);
                this.f24997D--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
