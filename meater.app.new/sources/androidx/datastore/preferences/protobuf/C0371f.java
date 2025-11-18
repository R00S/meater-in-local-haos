package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes.dex */
final class C0371f extends AbstractC0362c<Boolean> implements C0357a0.a, RandomAccess, InterfaceC0426z0 {

    /* renamed from: g */
    private static final C0371f f2728g;

    /* renamed from: h */
    private boolean[] f2729h;

    /* renamed from: i */
    private int f2730i;

    static {
        C0371f c0371f = new C0371f(new boolean[0], 0);
        f2728g = c0371f;
        c0371f.mo2569B();
    }

    C0371f() {
        this(new boolean[10], 0);
    }

    /* renamed from: h */
    private void m2680h(int i2, boolean z) {
        int i3;
        m2583c();
        if (i2 < 0 || i2 > (i3 = this.f2730i)) {
            throw new IndexOutOfBoundsException(m2682r(i2));
        }
        boolean[] zArr = this.f2729h;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f2729h, i2, zArr2, i2 + 1, this.f2730i - i2);
            this.f2729h = zArr2;
        }
        this.f2729h[i2] = z;
        this.f2730i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: n */
    private void m2681n(int i2) {
        if (i2 < 0 || i2 >= this.f2730i) {
            throw new IndexOutOfBoundsException(m2682r(i2));
        }
    }

    /* renamed from: r */
    private String m2682r(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2730i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m2583c();
        C0357a0.m2556a(collection);
        if (!(collection instanceof C0371f)) {
            return super.addAll(collection);
        }
        C0371f c0371f = (C0371f) collection;
        int i2 = c0371f.f2730i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2730i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f2729h;
        if (i4 > zArr.length) {
            this.f2729h = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(c0371f.f2729h, 0, this.f2729h, this.f2730i, c0371f.f2730i);
        this.f2730i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0371f)) {
            return super.equals(obj);
        }
        C0371f c0371f = (C0371f) obj;
        if (this.f2730i != c0371f.f2730i) {
            return false;
        }
        boolean[] zArr = c0371f.f2729h;
        for (int i2 = 0; i2 < this.f2730i; i2++) {
            if (this.f2729h[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Boolean bool) {
        m2680h(i2, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m2685i(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM2558c = 1;
        for (int i2 = 0; i2 < this.f2730i; i2++) {
            iM2558c = (iM2558c * 31) + C0357a0.m2558c(this.f2729h[i2]);
        }
        return iM2558c;
    }

    /* renamed from: i */
    public void m2685i(boolean z) {
        m2583c();
        int i2 = this.f2730i;
        boolean[] zArr = this.f2729h;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f2729h = zArr2;
        }
        boolean[] zArr3 = this.f2729h;
        int i3 = this.f2730i;
        this.f2730i = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i2) {
        return Boolean.valueOf(m2687q(i2));
    }

    /* renamed from: q */
    public boolean m2687q(int i2) {
        m2681n(i2);
        return this.f2729h[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        m2583c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f2729h;
        System.arraycopy(zArr, i3, zArr, i2, this.f2730i - i3);
        this.f2730i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0357a0.a mo2570J(int i2) {
        if (i2 >= this.f2730i) {
            return new C0371f(Arrays.copyOf(this.f2729h, i2), this.f2730i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2730i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i2) {
        m2583c();
        m2681n(i2);
        boolean[] zArr = this.f2729h;
        boolean z = zArr[i2];
        if (i2 < this.f2730i - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f2730i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i2, Boolean bool) {
        return Boolean.valueOf(m2691v(i2, bool.booleanValue()));
    }

    /* renamed from: v */
    public boolean m2691v(int i2, boolean z) {
        m2583c();
        m2681n(i2);
        boolean[] zArr = this.f2729h;
        boolean z2 = zArr[i2];
        zArr[i2] = z;
        return z2;
    }

    private C0371f(boolean[] zArr, int i2) {
        this.f2729h = zArr;
        this.f2730i = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m2583c();
        for (int i2 = 0; i2 < this.f2730i; i2++) {
            if (obj.equals(Boolean.valueOf(this.f2729h[i2]))) {
                boolean[] zArr = this.f2729h;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f2730i - i2) - 1);
                this.f2730i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
