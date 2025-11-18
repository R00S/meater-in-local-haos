package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes2.dex */
final class c0<E> extends AbstractC2893c<E> implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final c0<Object> f37783E;

    /* renamed from: C, reason: collision with root package name */
    private E[] f37784C;

    /* renamed from: D, reason: collision with root package name */
    private int f37785D;

    static {
        c0<Object> c0Var = new c0<>(new Object[0], 0);
        f37783E = c0Var;
        c0Var.n();
    }

    private c0(E[] eArr, int i10) {
        this.f37784C = eArr;
        this.f37785D = i10;
    }

    private static <E> E[] f(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> c0<E> h() {
        return (c0<E>) f37783E;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f37785D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37785D;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        int i10 = this.f37785D;
        E[] eArr = this.f37784C;
        if (i10 == eArr.length) {
            this.f37784C = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f37784C;
        int i11 = this.f37785D;
        this.f37785D = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        i(i10);
        return this.f37784C[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public c0<E> k(int i10) {
        if (i10 >= this.f37785D) {
            return new c0<>(Arrays.copyOf(this.f37784C, i10), this.f37785D);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        c();
        i(i10);
        E[] eArr = this.f37784C;
        E e10 = eArr[i10];
        if (i10 < this.f37785D - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f37785D--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c();
        i(i10);
        E[] eArr = this.f37784C;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37785D;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f37785D)) {
            E[] eArr = this.f37784C;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) f(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f37784C, 0, eArr2, 0, i10);
                System.arraycopy(this.f37784C, i10, eArr2, i10 + 1, this.f37785D - i10);
                this.f37784C = eArr2;
            }
            this.f37784C[i10] = e10;
            this.f37785D++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }
}
