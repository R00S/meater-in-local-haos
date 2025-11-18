package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* loaded from: classes.dex */
final class c0<E> extends AbstractC2057c<E> implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final c0<Object> f24903E;

    /* renamed from: C, reason: collision with root package name */
    private E[] f24904C;

    /* renamed from: D, reason: collision with root package name */
    private int f24905D;

    static {
        c0<Object> c0Var = new c0<>(new Object[0], 0);
        f24903E = c0Var;
        c0Var.n();
    }

    private c0(E[] eArr, int i10) {
        this.f24904C = eArr;
        this.f24905D = i10;
    }

    private static <E> E[] f(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> c0<E> h() {
        return (c0<E>) f24903E;
    }

    private void i(int i10) {
        if (i10 < 0 || i10 >= this.f24905D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24905D;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        int i10 = this.f24905D;
        E[] eArr = this.f24904C;
        if (i10 == eArr.length) {
            this.f24904C = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f24904C;
        int i11 = this.f24905D;
        this.f24905D = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        i(i10);
        return this.f24904C[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public c0<E> k(int i10) {
        if (i10 >= this.f24905D) {
            return new c0<>(Arrays.copyOf(this.f24904C, i10), this.f24905D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        c();
        i(i10);
        E[] eArr = this.f24904C;
        E e10 = eArr[i10];
        if (i10 < this.f24905D - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f24905D--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c();
        i(i10);
        E[] eArr = this.f24904C;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24905D;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f24905D)) {
            E[] eArr = this.f24904C;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) f(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f24904C, 0, eArr2, 0, i10);
                System.arraycopy(this.f24904C, i10, eArr2, i10 + 1, this.f24905D - i10);
                this.f24904C = eArr2;
            }
            this.f24904C[i10] = e10;
            this.f24905D++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i10));
    }
}
