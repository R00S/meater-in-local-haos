package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class Y extends E implements RandomAccess, InterfaceC2687q0, U0 {

    /* renamed from: E, reason: collision with root package name */
    private static final double[] f34543E;

    /* renamed from: C, reason: collision with root package name */
    private double[] f34544C;

    /* renamed from: D, reason: collision with root package name */
    private int f34545D;

    static {
        double[] dArr = new double[0];
        f34543E = dArr;
        new Y(dArr, 0, false);
    }

    Y() {
        this(f34543E, 0, true);
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34545D;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f34545D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2687q0
    public final /* bridge */ /* synthetic */ InterfaceC2687q0 C(int i10) {
        if (i10 >= this.f34545D) {
            return new Y(i10 == 0 ? f34543E : Arrays.copyOf(this.f34544C, i10), this.f34545D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34545D)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f34544C;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[i(length)];
            System.arraycopy(this.f34544C, 0, dArr2, 0, i10);
            System.arraycopy(this.f34544C, i10, dArr2, i12, this.f34545D - i10);
            this.f34544C = dArr2;
        }
        this.f34544C[i10] = dDoubleValue;
        this.f34545D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = C2689r0.f34653b;
        collection.getClass();
        if (!(collection instanceof Y)) {
            return super.addAll(collection);
        }
        Y y10 = (Y) collection;
        int i10 = y10.f34545D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34545D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f34544C;
        if (i12 > dArr.length) {
            this.f34544C = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(y10.f34544C, 0, this.f34544C, this.f34545D, y10.f34545D);
        this.f34545D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y10 = (Y) obj;
        if (this.f34545D != y10.f34545D) {
            return false;
        }
        double[] dArr = y10.f34544C;
        for (int i10 = 0; i10 < this.f34545D; i10++) {
            if (Double.doubleToLongBits(this.f34544C[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final double f(int i10) {
        r(i10);
        return this.f34544C[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        r(i10);
        return Double.valueOf(this.f34544C[i10]);
    }

    public final void h(double d10) {
        c();
        int i10 = this.f34545D;
        int length = this.f34544C.length;
        if (i10 == length) {
            double[] dArr = new double[i(length)];
            System.arraycopy(this.f34544C, 0, dArr, 0, this.f34545D);
            this.f34544C = dArr;
        }
        double[] dArr2 = this.f34544C;
        int i11 = this.f34545D;
        this.f34545D = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f34545D; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f34544C[i11]);
            byte[] bArr = C2689r0.f34653b;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f34545D;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34544C[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        r(i10);
        double[] dArr = this.f34544C;
        double d10 = dArr[i10];
        if (i10 < this.f34545D - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f34545D--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f34544C;
        System.arraycopy(dArr, i11, dArr, i10, this.f34545D - i11);
        this.f34545D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        r(i10);
        double[] dArr = this.f34544C;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34545D;
    }

    private Y(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f34544C = dArr;
        this.f34545D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
