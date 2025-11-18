package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: DoubleArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.m */
/* loaded from: classes.dex */
final class C0392m extends AbstractC0362c<Double> implements C0357a0.b, RandomAccess, InterfaceC0426z0 {

    /* renamed from: g */
    private static final C0392m f2822g;

    /* renamed from: h */
    private double[] f2823h;

    /* renamed from: i */
    private int f2824i;

    static {
        C0392m c0392m = new C0392m(new double[0], 0);
        f2822g = c0392m;
        c0392m.mo2569B();
    }

    C0392m() {
        this(new double[10], 0);
    }

    /* renamed from: i */
    private void m3018i(int i2, double d2) {
        int i3;
        m2583c();
        if (i2 < 0 || i2 > (i3 = this.f2824i)) {
            throw new IndexOutOfBoundsException(m3020r(i2));
        }
        double[] dArr = this.f2823h;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f2823h, i2, dArr2, i2 + 1, this.f2824i - i2);
            this.f2823h = dArr2;
        }
        this.f2823h[i2] = d2;
        this.f2824i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: n */
    private void m3019n(int i2) {
        if (i2 < 0 || i2 >= this.f2824i) {
            throw new IndexOutOfBoundsException(m3020r(i2));
        }
    }

    /* renamed from: r */
    private String m3020r(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2824i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m2583c();
        C0357a0.m2556a(collection);
        if (!(collection instanceof C0392m)) {
            return super.addAll(collection);
        }
        C0392m c0392m = (C0392m) collection;
        int i2 = c0392m.f2824i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2824i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f2823h;
        if (i4 > dArr.length) {
            this.f2823h = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(c0392m.f2823h, 0, this.f2823h, this.f2824i, c0392m.f2824i);
        this.f2824i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0392m)) {
            return super.equals(obj);
        }
        C0392m c0392m = (C0392m) obj;
        if (this.f2824i != c0392m.f2824i) {
            return false;
        }
        double[] dArr = c0392m.f2823h;
        for (int i2 = 0; i2 < this.f2824i; i2++) {
            if (Double.doubleToLongBits(this.f2823h[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Double d2) {
        m3018i(i2, d2.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d2) {
        m3023h(d2.doubleValue());
        return true;
    }

    /* renamed from: h */
    public void m3023h(double d2) {
        m2583c();
        int i2 = this.f2824i;
        double[] dArr = this.f2823h;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f2823h = dArr2;
        }
        double[] dArr3 = this.f2823h;
        int i3 = this.f2824i;
        this.f2824i = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2561f = 1;
        for (int i2 = 0; i2 < this.f2824i; i2++) {
            iM2561f = (iM2561f * 31) + C0357a0.m2561f(Double.doubleToLongBits(this.f2823h[i2]));
        }
        return iM2561f;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double get(int i2) {
        return Double.valueOf(m3025q(i2));
    }

    /* renamed from: q */
    public double m3025q(int i2) {
        m3019n(i2);
        return this.f2823h[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        m2583c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f2823h;
        System.arraycopy(dArr, i3, dArr, i2, this.f2824i - i3);
        this.f2824i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0357a0.b mo2570J(int i2) {
        if (i2 >= this.f2824i) {
            return new C0392m(Arrays.copyOf(this.f2823h, i2), this.f2824i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2824i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Double remove(int i2) {
        m2583c();
        m3019n(i2);
        double[] dArr = this.f2823h;
        double d2 = dArr[i2];
        if (i2 < this.f2824i - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f2824i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Double set(int i2, Double d2) {
        return Double.valueOf(m3029v(i2, d2.doubleValue()));
    }

    /* renamed from: v */
    public double m3029v(int i2, double d2) {
        m2583c();
        m3019n(i2);
        double[] dArr = this.f2823h;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }

    private C0392m(double[] dArr, int i2) {
        this.f2823h = dArr;
        this.f2824i = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m2583c();
        for (int i2 = 0; i2 < this.f2824i; i2++) {
            if (obj.equals(Double.valueOf(this.f2823h[i2]))) {
                double[] dArr = this.f2823h;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f2824i - i2) - 1);
                this.f2824i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
