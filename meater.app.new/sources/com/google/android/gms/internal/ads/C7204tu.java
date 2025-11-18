package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.tu */
/* loaded from: classes2.dex */
final class C7204tu extends AbstractC7388yt<Double> implements zzdoj<Double>, InterfaceC6688fw, RandomAccess {

    /* renamed from: g */
    private static final C7204tu f20584g;

    /* renamed from: h */
    private double[] f20585h;

    /* renamed from: i */
    private int f20586i;

    static {
        C7204tu c7204tu = new C7204tu(new double[0], 0);
        f20584g = c7204tu;
        c7204tu.mo16108x0();
    }

    C7204tu() {
        this(new double[10], 0);
    }

    /* renamed from: g */
    private final void m15908g(int i2, double d2) {
        int i3;
        m16106c();
        if (i2 < 0 || i2 > (i3 = this.f20586i)) {
            throw new IndexOutOfBoundsException(m15910i(i2));
        }
        double[] dArr = this.f20585h;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f20585h, i2, dArr2, i2 + 1, this.f20586i - i2);
            this.f20585h = dArr2;
        }
        this.f20585h[i2] = d2;
        this.f20586i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: h */
    private final void m15909h(int i2) {
        if (i2 < 0 || i2 >= this.f20586i) {
            throw new IndexOutOfBoundsException(m15910i(i2));
        }
    }

    /* renamed from: i */
    private final String m15910i(int i2) {
        int i3 = this.f20586i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: N */
    public final /* synthetic */ zzdoj<Double> mo14989N(int i2) {
        if (i2 >= this.f20586i) {
            return new C7204tu(Arrays.copyOf(this.f20585h, i2), this.f20586i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m15908g(i2, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m16106c();
        zzdod.m19740a(collection);
        if (!(collection instanceof C7204tu)) {
            return super.addAll(collection);
        }
        C7204tu c7204tu = (C7204tu) collection;
        int i2 = c7204tu.f20586i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f20586i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f20585h;
        if (i4 > dArr.length) {
            this.f20585h = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(c7204tu.f20585h, 0, this.f20585h, this.f20586i, c7204tu.f20586i);
        this.f20586i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7204tu)) {
            return super.equals(obj);
        }
        C7204tu c7204tu = (C7204tu) obj;
        if (this.f20586i != c7204tu.f20586i) {
            return false;
        }
        double[] dArr = c7204tu.f20585h;
        for (int i2 = 0; i2 < this.f20586i; i2++) {
            if (Double.doubleToLongBits(this.f20585h[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m15911f(double d2) {
        m15908g(this.f20586i, d2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m15909h(i2);
        return Double.valueOf(this.f20585h[i2]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM19748i = 1;
        for (int i2 = 0; i2 < this.f20586i; i2++) {
            iM19748i = (iM19748i * 31) + zzdod.m19748i(Double.doubleToLongBits(this.f20585h[i2]));
        }
        return iM19748i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m16106c();
        for (int i2 = 0; i2 < this.f20586i; i2++) {
            if (obj.equals(Double.valueOf(this.f20585h[i2]))) {
                double[] dArr = this.f20585h;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f20586i - i2) - 1);
                this.f20586i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        m16106c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f20585h;
        System.arraycopy(dArr, i3, dArr, i2, this.f20586i - i3);
        this.f20586i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m16106c();
        m15909h(i2);
        double[] dArr = this.f20585h;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20586i;
    }

    private C7204tu(double[] dArr, int i2) {
        this.f20585h = dArr;
        this.f20586i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m16106c();
        m15909h(i2);
        double[] dArr = this.f20585h;
        double d2 = dArr[i2];
        if (i2 < this.f20586i - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f20586i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }
}
