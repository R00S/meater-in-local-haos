package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes.dex */
final class C0425z extends AbstractC0362c<Integer> implements C0357a0.g, RandomAccess, InterfaceC0426z0 {

    /* renamed from: g */
    private static final C0425z f3036g;

    /* renamed from: h */
    private int[] f3037h;

    /* renamed from: i */
    private int f3038i;

    static {
        C0425z c0425z = new C0425z(new int[0], 0);
        f3036g = c0425z;
        c0425z.mo2569B();
    }

    C0425z() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    private void m3365i(int i2, int i3) {
        int i4;
        m2583c();
        if (i2 < 0 || i2 > (i4 = this.f3038i)) {
            throw new IndexOutOfBoundsException(m3367r(i2));
        }
        int[] iArr = this.f3037h;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f3037h, i2, iArr2, i2 + 1, this.f3038i - i2);
            this.f3037h = iArr2;
        }
        this.f3037h[i2] = i3;
        this.f3038i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: n */
    private void m3366n(int i2) {
        if (i2 < 0 || i2 >= this.f3038i) {
            throw new IndexOutOfBoundsException(m3367r(i2));
        }
    }

    /* renamed from: r */
    private String m3367r(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3038i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m2583c();
        C0357a0.m2556a(collection);
        if (!(collection instanceof C0425z)) {
            return super.addAll(collection);
        }
        C0425z c0425z = (C0425z) collection;
        int i2 = c0425z.f3038i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3038i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f3037h;
        if (i4 > iArr.length) {
            this.f3037h = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(c0425z.f3037h, 0, this.f3037h, this.f3038i, c0425z.f3038i);
        this.f3038i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0425z)) {
            return super.equals(obj);
        }
        C0425z c0425z = (C0425z) obj;
        if (this.f3038i != c0425z.f3038i) {
            return false;
        }
        int[] iArr = c0425z.f3037h;
        for (int i2 = 0; i2 < this.f3038i; i2++) {
            if (this.f3037h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Integer num) {
        m3365i(i2, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m3370h(num.intValue());
        return true;
    }

    /* renamed from: h */
    public void m3370h(int i2) {
        m2583c();
        int i3 = this.f3038i;
        int[] iArr = this.f3037h;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f3037h = iArr2;
        }
        int[] iArr3 = this.f3037h;
        int i4 = this.f3038i;
        this.f3038i = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3038i; i3++) {
            i2 = (i2 * 31) + this.f3037h[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer get(int i2) {
        return Integer.valueOf(m3372q(i2));
    }

    /* renamed from: q */
    public int m3372q(int i2) {
        m3366n(i2);
        return this.f3037h[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        m2583c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f3037h;
        System.arraycopy(iArr, i3, iArr, i2, this.f3038i - i3);
        this.f3038i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0357a0.g mo2570J(int i2) {
        if (i2 >= this.f3038i) {
            return new C0425z(Arrays.copyOf(this.f3037h, i2), this.f3038i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3038i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i2) {
        m2583c();
        m3366n(i2);
        int[] iArr = this.f3037h;
        int i3 = iArr[i2];
        if (i2 < this.f3038i - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f3038i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(m3376v(i2, num.intValue()));
    }

    /* renamed from: v */
    public int m3376v(int i2, int i3) {
        m2583c();
        m3366n(i2);
        int[] iArr = this.f3037h;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    private C0425z(int[] iArr, int i2) {
        this.f3037h = iArr;
        this.f3038i = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m2583c();
        for (int i2 = 0; i2 < this.f3038i; i2++) {
            if (obj.equals(Integer.valueOf(this.f3037h[i2]))) {
                int[] iArr = this.f3037h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f3038i - i2) - 1);
                this.f3038i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
