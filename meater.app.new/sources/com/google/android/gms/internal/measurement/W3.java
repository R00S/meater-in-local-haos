package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class W3 extends S3<Boolean> implements L4<Boolean>, InterfaceC2604v5, RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean[] f33932E;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f33933C;

    /* renamed from: D, reason: collision with root package name */
    private int f33934D;

    static {
        boolean[] zArr = new boolean[0];
        f33932E = zArr;
        new W3(zArr, 0, false);
    }

    W3() {
        this(f33932E, 0, true);
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33934D;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f33934D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f33934D)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        boolean[] zArr = this.f33933C;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[i(zArr.length)];
            System.arraycopy(this.f33933C, 0, zArr2, 0, i10);
            System.arraycopy(this.f33933C, i10, zArr2, i10 + 1, this.f33934D - i10);
            this.f33933C = zArr2;
        }
        this.f33933C[i10] = zBooleanValue;
        this.f33934D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        I4.e(collection);
        if (!(collection instanceof W3)) {
            return super.addAll(collection);
        }
        W3 w32 = (W3) collection;
        int i10 = w32.f33934D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33934D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f33933C;
        if (i12 > zArr.length) {
            this.f33933C = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(w32.f33933C, 0, this.f33933C, this.f33934D, w32.f33934D);
        this.f33934D = i12;
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
        if (!(obj instanceof W3)) {
            return super.equals(obj);
        }
        W3 w32 = (W3) obj;
        if (this.f33934D != w32.f33934D) {
            return false;
        }
        boolean[] zArr = w32.f33933C;
        for (int i10 = 0; i10 < this.f33934D; i10++) {
            if (this.f33933C[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z10) {
        c();
        int i10 = this.f33934D;
        boolean[] zArr = this.f33933C;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[i(zArr.length)];
            System.arraycopy(this.f33933C, 0, zArr2, 0, this.f33934D);
            this.f33933C = zArr2;
        }
        boolean[] zArr3 = this.f33933C;
        int i11 = this.f33934D;
        this.f33934D = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4<Boolean> g(int i10) {
        if (i10 >= this.f33934D) {
            return new W3(i10 == 0 ? f33932E : Arrays.copyOf(this.f33933C, i10), this.f33934D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Boolean.valueOf(h(i10));
    }

    public final boolean h(int i10) {
        r(i10);
        return this.f33933C[i10];
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f33934D; i10++) {
            iC = (iC * 31) + I4.c(this.f33933C[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f33933C[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        r(i10);
        boolean[] zArr = this.f33933C;
        boolean z10 = zArr[i10];
        if (i10 < this.f33934D - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f33934D--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f33933C;
        System.arraycopy(zArr, i11, zArr, i10, this.f33934D - i11);
        this.f33934D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        r(i10);
        boolean[] zArr = this.f33933C;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33934D;
    }

    private W3(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f33933C = zArr;
        this.f33934D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
