package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2079z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2060f extends AbstractC2057c<Boolean> implements C2079z.a, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2060f f24920E;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f24921C;

    /* renamed from: D, reason: collision with root package name */
    private int f24922D;

    static {
        C2060f c2060f = new C2060f(new boolean[0], 0);
        f24920E = c2060f;
        c2060f.n();
    }

    C2060f() {
        this(new boolean[10], 0);
    }

    private void i(int i10, boolean z10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f24922D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        boolean[] zArr = this.f24921C;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f24921C, i10, zArr2, i10 + 1, this.f24922D - i10);
            this.f24921C = zArr2;
        }
        this.f24921C[i10] = z10;
        this.f24922D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f24922D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f24922D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(B(i10, bool.booleanValue()));
    }

    public boolean B(int i10, boolean z10) {
        c();
        r(i10);
        boolean[] zArr = this.f24921C;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        C2079z.a(collection);
        if (!(collection instanceof C2060f)) {
            return super.addAll(collection);
        }
        C2060f c2060f = (C2060f) collection;
        int i10 = c2060f.f24922D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24922D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f24921C;
        if (i12 > zArr.length) {
            this.f24921C = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2060f.f24921C, 0, this.f24921C, this.f24922D, c2060f.f24922D);
        this.f24922D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2060f)) {
            return super.equals(obj);
        }
        C2060f c2060f = (C2060f) obj;
        if (this.f24922D != c2060f.f24922D) {
            return false;
        }
        boolean[] zArr = c2060f.f24921C;
        for (int i10 = 0; i10 < this.f24922D; i10++) {
            if (this.f24921C[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        i(i10, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        j(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f24922D; i10++) {
            iC = (iC * 31) + C2079z.c(this.f24921C[i10]);
        }
        return iC;
    }

    public void j(boolean z10) {
        c();
        int i10 = this.f24922D;
        boolean[] zArr = this.f24921C;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f24921C = zArr2;
        }
        boolean[] zArr3 = this.f24921C;
        int i11 = this.f24922D;
        this.f24922D = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f24921C;
        System.arraycopy(zArr, i11, zArr, i10, this.f24922D - i11);
        this.f24922D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24922D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(w(i10));
    }

    public boolean w(int i10) {
        r(i10);
        return this.f24921C[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2079z.a k(int i10) {
        if (i10 >= this.f24922D) {
            return new C2060f(Arrays.copyOf(this.f24921C, i10), this.f24922D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        c();
        r(i10);
        boolean[] zArr = this.f24921C;
        boolean z10 = zArr[i10];
        if (i10 < this.f24922D - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f24922D--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    private C2060f(boolean[] zArr, int i10) {
        this.f24921C = zArr;
        this.f24922D = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f24922D; i10++) {
            if (obj.equals(Boolean.valueOf(this.f24921C[i10]))) {
                boolean[] zArr = this.f24921C;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f24922D - i10) - 1);
                this.f24922D--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
