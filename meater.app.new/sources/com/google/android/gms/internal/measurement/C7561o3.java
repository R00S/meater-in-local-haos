package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.o3 */
/* loaded from: classes2.dex */
final class C7561o3<E> extends AbstractC7523i1<E> implements RandomAccess {

    /* renamed from: g */
    private static final C7561o3<Object> f27864g;

    /* renamed from: h */
    private E[] f27865h;

    /* renamed from: i */
    private int f27866i;

    static {
        C7561o3<Object> c7561o3 = new C7561o3<>(new Object[0], 0);
        f27864g = c7561o3;
        c7561o3.mo21144I();
    }

    private C7561o3(E[] eArr, int i2) {
        this.f27865h = eArr;
        this.f27866i = i2;
    }

    /* renamed from: f */
    private final void m21266f(int i2) {
        if (i2 < 0 || i2 >= this.f27866i) {
            throw new IndexOutOfBoundsException(m21267g(i2));
        }
    }

    /* renamed from: g */
    private final String m21267g(int i2) {
        int i3 = this.f27866i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: h */
    public static <E> C7561o3<E> m21268h() {
        return (C7561o3<E>) f27864g;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        m21146c();
        int i2 = this.f27866i;
        E[] eArr = this.f27865h;
        if (i2 == eArr.length) {
            this.f27865h = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f27865h;
        int i3 = this.f27866i;
        this.f27866i = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: d */
    public final /* synthetic */ zzfl mo20982d(int i2) {
        if (i2 >= this.f27866i) {
            return new C7561o3(Arrays.copyOf(this.f27865h, i2), this.f27866i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        m21266f(i2);
        return this.f27865h[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        m21146c();
        m21266f(i2);
        E[] eArr = this.f27865h;
        E e2 = eArr[i2];
        if (i2 < this.f27866i - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f27866i--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        m21146c();
        m21266f(i2);
        E[] eArr = this.f27865h;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27866i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        m21146c();
        if (i2 >= 0 && i2 <= (i3 = this.f27866i)) {
            E[] eArr = this.f27865h;
            if (i3 < eArr.length) {
                System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
            } else {
                E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i2);
                System.arraycopy(this.f27865h, i2, eArr2, i2 + 1, this.f27866i - i2);
                this.f27865h = eArr2;
            }
            this.f27865h[i2] = e2;
            this.f27866i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m21267g(i2));
    }
}
