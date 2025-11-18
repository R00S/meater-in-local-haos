package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.h0 */
/* loaded from: classes.dex */
final class C0378h0 extends AbstractC0362c<Long> implements C0357a0.h, RandomAccess, InterfaceC0426z0 {

    /* renamed from: g */
    private static final C0378h0 f2746g;

    /* renamed from: h */
    private long[] f2747h;

    /* renamed from: i */
    private int f2748i;

    static {
        C0378h0 c0378h0 = new C0378h0(new long[0], 0);
        f2746g = c0378h0;
        c0378h0.mo2569B();
    }

    C0378h0() {
        this(new long[10], 0);
    }

    /* renamed from: h */
    private void m2742h(int i2, long j2) {
        int i3;
        m2583c();
        if (i2 < 0 || i2 > (i3 = this.f2748i)) {
            throw new IndexOutOfBoundsException(m2744r(i2));
        }
        long[] jArr = this.f2747h;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f2747h, i2, jArr2, i2 + 1, this.f2748i - i2);
            this.f2747h = jArr2;
        }
        this.f2747h[i2] = j2;
        this.f2748i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: n */
    private void m2743n(int i2) {
        if (i2 < 0 || i2 >= this.f2748i) {
            throw new IndexOutOfBoundsException(m2744r(i2));
        }
    }

    /* renamed from: r */
    private String m2744r(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2748i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m2583c();
        C0357a0.m2556a(collection);
        if (!(collection instanceof C0378h0)) {
            return super.addAll(collection);
        }
        C0378h0 c0378h0 = (C0378h0) collection;
        int i2 = c0378h0.f2748i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2748i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f2747h;
        if (i4 > jArr.length) {
            this.f2747h = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(c0378h0.f2747h, 0, this.f2747h, this.f2748i, c0378h0.f2748i);
        this.f2748i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0378h0)) {
            return super.equals(obj);
        }
        C0378h0 c0378h0 = (C0378h0) obj;
        if (this.f2748i != c0378h0.f2748i) {
            return false;
        }
        long[] jArr = c0378h0.f2747h;
        for (int i2 = 0; i2 < this.f2748i; i2++) {
            if (this.f2747h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Long l) {
        m2742h(i2, l.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        m2747i(l.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2561f = 1;
        for (int i2 = 0; i2 < this.f2748i; i2++) {
            iM2561f = (iM2561f * 31) + C0357a0.m2561f(this.f2747h[i2]);
        }
        return iM2561f;
    }

    /* renamed from: i */
    public void m2747i(long j2) {
        m2583c();
        int i2 = this.f2748i;
        long[] jArr = this.f2747h;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f2747h = jArr2;
        }
        long[] jArr3 = this.f2747h;
        int i3 = this.f2748i;
        this.f2748i = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long get(int i2) {
        return Long.valueOf(m2749q(i2));
    }

    /* renamed from: q */
    public long m2749q(int i2) {
        m2743n(i2);
        return this.f2747h[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        m2583c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2747h;
        System.arraycopy(jArr, i3, jArr, i2, this.f2748i - i3);
        this.f2748i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0357a0.h mo2570J(int i2) {
        if (i2 >= this.f2748i) {
            return new C0378h0(Arrays.copyOf(this.f2747h, i2), this.f2748i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2748i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Long remove(int i2) {
        m2583c();
        m2743n(i2);
        long[] jArr = this.f2747h;
        long j2 = jArr[i2];
        if (i2 < this.f2748i - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f2748i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Long set(int i2, Long l) {
        return Long.valueOf(m2753v(i2, l.longValue()));
    }

    /* renamed from: v */
    public long m2753v(int i2, long j2) {
        m2583c();
        m2743n(i2);
        long[] jArr = this.f2747h;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    private C0378h0(long[] jArr, int i2) {
        this.f2747h = jArr;
        this.f2748i = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m2583c();
        for (int i2 = 0; i2 < this.f2748i; i2++) {
            if (obj.equals(Long.valueOf(this.f2747h[i2]))) {
                long[] jArr = this.f2747h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f2748i - i2) - 1);
                this.f2748i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
