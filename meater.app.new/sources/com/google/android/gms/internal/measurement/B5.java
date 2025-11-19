package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class B5<E> extends S3<E> implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final Object[] f33668E;

    /* renamed from: F, reason: collision with root package name */
    private static final B5<Object> f33669F;

    /* renamed from: C, reason: collision with root package name */
    private E[] f33670C;

    /* renamed from: D, reason: collision with root package name */
    private int f33671D;

    static {
        Object[] objArr = new Object[0];
        f33668E = objArr;
        f33669F = new B5<>(objArr, 0, false);
    }

    B5() {
        this(f33668E, 0, true);
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    public static <E> B5<E> i() {
        return (B5<E>) f33669F;
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33671D;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f33671D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f33671D)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        E[] eArr = this.f33670C;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[h(eArr.length)];
            System.arraycopy(this.f33670C, 0, eArr2, 0, i10);
            System.arraycopy(this.f33670C, i10, eArr2, i10 + 1, this.f33671D - i10);
            this.f33670C = eArr2;
        }
        this.f33670C[i10] = e10;
        this.f33671D++;
        ((AbstractList) this).modCount++;
    }

    final void f(int i10) {
        E[] eArr = this.f33670C;
        if (i10 <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.f33670C = (E[]) new Object[Math.max(i10, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i10) {
            length = h(length);
        }
        this.f33670C = (E[]) Arrays.copyOf(this.f33670C, length);
    }

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4 g(int i10) {
        if (i10 >= this.f33671D) {
            return new B5(i10 == 0 ? f33668E : Arrays.copyOf(this.f33670C, i10), this.f33671D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        r(i10);
        return this.f33670C[i10];
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        c();
        r(i10);
        E[] eArr = this.f33670C;
        E e10 = eArr[i10];
        if (i10 < this.f33671D - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f33671D--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        c();
        r(i10);
        E[] eArr = this.f33670C;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33671D;
    }

    private B5(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f33670C = eArr;
        this.f33671D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        c();
        int i10 = this.f33671D;
        E[] eArr = this.f33670C;
        if (i10 == eArr.length) {
            this.f33670C = (E[]) Arrays.copyOf(this.f33670C, h(eArr.length));
        }
        E[] eArr2 = this.f33670C;
        int i11 = this.f33671D;
        this.f33671D = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
