package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: ProtobufArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.c1 */
/* loaded from: classes.dex */
final class C0364c1<E> extends AbstractC0362c<E> implements RandomAccess {

    /* renamed from: g */
    private static final C0364c1<Object> f2703g;

    /* renamed from: h */
    private E[] f2704h;

    /* renamed from: i */
    private int f2705i;

    static {
        C0364c1<Object> c0364c1 = new C0364c1<>(new Object[0], 0);
        f2703g = c0364c1;
        c0364c1.mo2569B();
    }

    private C0364c1(E[] eArr, int i2) {
        this.f2704h = eArr;
        this.f2705i = i2;
    }

    /* renamed from: f */
    private static <E> E[] m2587f(int i2) {
        return (E[]) new Object[i2];
    }

    /* renamed from: g */
    public static <E> C0364c1<E> m2588g() {
        return (C0364c1<E>) f2703g;
    }

    /* renamed from: h */
    private void m2589h(int i2) {
        if (i2 < 0 || i2 >= this.f2705i) {
            throw new IndexOutOfBoundsException(m2590i(i2));
        }
    }

    /* renamed from: i */
    private String m2590i(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2705i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        m2583c();
        int i2 = this.f2705i;
        E[] eArr = this.f2704h;
        if (i2 == eArr.length) {
            this.f2704h = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2704h;
        int i3 = this.f2705i;
        this.f2705i = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        m2589h(i2);
        return this.f2704h[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0364c1<E> mo2570J(int i2) {
        if (i2 >= this.f2705i) {
            return new C0364c1<>(Arrays.copyOf(this.f2704h, i2), this.f2705i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
        m2583c();
        m2589h(i2);
        E[] eArr = this.f2704h;
        E e2 = eArr[i2];
        if (i2 < this.f2705i - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f2705i--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        m2583c();
        m2589h(i2);
        E[] eArr = this.f2704h;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2705i;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        m2583c();
        if (i2 >= 0 && i2 <= (i3 = this.f2705i)) {
            E[] eArr = this.f2704h;
            if (i3 < eArr.length) {
                System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
            } else {
                E[] eArr2 = (E[]) m2587f(((i3 * 3) / 2) + 1);
                System.arraycopy(this.f2704h, 0, eArr2, 0, i2);
                System.arraycopy(this.f2704h, i2, eArr2, i2 + 1, this.f2705i - i2);
                this.f2704h = eArr2;
            }
            this.f2704h[i2] = e2;
            this.f2705i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m2590i(i2));
    }
}
