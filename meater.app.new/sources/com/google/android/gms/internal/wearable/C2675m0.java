package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2675m0 extends E implements RandomAccess, InterfaceC2687q0, U0 {

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f34648E;

    /* renamed from: C, reason: collision with root package name */
    private int[] f34649C;

    /* renamed from: D, reason: collision with root package name */
    private int f34650D;

    static {
        int[] iArr = new int[0];
        f34648E = iArr;
        new C2675m0(iArr, 0, false);
    }

    C2675m0() {
        this(f34648E, 0, true);
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34650D;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f34650D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2687q0
    public final /* bridge */ /* synthetic */ InterfaceC2687q0 C(int i10) {
        if (i10 >= this.f34650D) {
            return new C2675m0(i10 == 0 ? f34648E : Arrays.copyOf(this.f34649C, i10), this.f34650D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34650D)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f34649C;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f34649C, 0, iArr2, 0, i10);
            System.arraycopy(this.f34649C, i10, iArr2, i12, this.f34650D - i10);
            this.f34649C = iArr2;
        }
        this.f34649C[i10] = iIntValue;
        this.f34650D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = C2689r0.f34653b;
        collection.getClass();
        if (!(collection instanceof C2675m0)) {
            return super.addAll(collection);
        }
        C2675m0 c2675m0 = (C2675m0) collection;
        int i10 = c2675m0.f34650D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34650D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f34649C;
        if (i12 > iArr.length) {
            this.f34649C = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2675m0.f34649C, 0, this.f34649C, this.f34650D, c2675m0.f34650D);
        this.f34650D = i12;
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
        if (!(obj instanceof C2675m0)) {
            return super.equals(obj);
        }
        C2675m0 c2675m0 = (C2675m0) obj;
        if (this.f34650D != c2675m0.f34650D) {
            return false;
        }
        int[] iArr = c2675m0.f34649C;
        for (int i10 = 0; i10 < this.f34650D; i10++) {
            if (this.f34649C[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        r(i10);
        return this.f34649C[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        r(i10);
        return Integer.valueOf(this.f34649C[i10]);
    }

    public final void h(int i10) {
        c();
        int i11 = this.f34650D;
        int length = this.f34649C.length;
        if (i11 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f34649C, 0, iArr, 0, this.f34650D);
            this.f34649C = iArr;
        }
        int[] iArr2 = this.f34649C;
        int i12 = this.f34650D;
        this.f34650D = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f34650D; i11++) {
            i10 = (i10 * 31) + this.f34649C[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f34650D;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34649C[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        r(i10);
        int[] iArr = this.f34649C;
        int i11 = iArr[i10];
        if (i10 < this.f34650D - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f34650D--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f34649C;
        System.arraycopy(iArr, i11, iArr, i10, this.f34650D - i11);
        this.f34650D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        r(i10);
        int[] iArr = this.f34649C;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34650D;
    }

    private C2675m0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f34649C = iArr;
        this.f34650D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
