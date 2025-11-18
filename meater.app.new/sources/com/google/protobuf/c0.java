package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes2.dex */
final class c0<E> extends AbstractC2943c<E> implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final c0<Object> f39225E = new c0<>(new Object[0], 0, false);

    /* renamed from: C, reason: collision with root package name */
    private E[] f39226C;

    /* renamed from: D, reason: collision with root package name */
    private int f39227D;

    private c0(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f39226C = eArr;
        this.f39227D = i10;
    }

    private static <E> E[] f(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> c0<E> h() {
        return (c0<E>) f39225E;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f39227D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f39227D;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        int i10 = this.f39227D;
        E[] eArr = this.f39226C;
        if (i10 == eArr.length) {
            this.f39226C = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f39226C;
        int i11 = this.f39227D;
        this.f39227D = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        i(i10);
        return this.f39226C[i10];
    }

    @Override // com.google.protobuf.C2964y.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public c0<E> k(int i10) {
        if (i10 >= this.f39227D) {
            return new c0<>(Arrays.copyOf(this.f39226C, i10), this.f39227D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        c();
        i(i10);
        E[] eArr = this.f39226C;
        E e10 = eArr[i10];
        if (i10 < this.f39227D - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f39227D--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c();
        i(i10);
        E[] eArr = this.f39226C;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39227D;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f39227D)) {
            E[] eArr = this.f39226C;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) f(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f39226C, 0, eArr2, 0, i10);
                System.arraycopy(this.f39226C, i10, eArr2, i10 + 1, this.f39227D - i10);
                this.f39226C = eArr2;
            }
            this.f39226C[i10] = e10;
            this.f39227D++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }
}
