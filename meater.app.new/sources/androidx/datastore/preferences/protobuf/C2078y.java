package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2079z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2078y extends AbstractC2057c<Integer> implements C2079z.g, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2078y f25181E;

    /* renamed from: C, reason: collision with root package name */
    private int[] f25182C;

    /* renamed from: D, reason: collision with root package name */
    private int f25183D;

    static {
        C2078y c2078y = new C2078y(new int[0], 0);
        f25181E = c2078y;
        c2078y.n();
    }

    C2078y() {
        this(new int[10], 0);
    }

    private void i(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f25183D)) {
            throw new IndexOutOfBoundsException(v(i10));
        }
        int[] iArr = this.f25182C;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f25182C, i10, iArr2, i10 + 1, this.f25183D - i10);
            this.f25182C = iArr2;
        }
        this.f25182C[i10] = i11;
        this.f25183D++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f25183D) {
            throw new IndexOutOfBoundsException(v(i10));
        }
    }

    private String v(int i10) {
        return "Index:" + i10 + ", Size:" + this.f25183D;
    }

    public void X(int i10) {
        c();
        int i11 = this.f25183D;
        int[] iArr = this.f25182C;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f25182C = iArr2;
        }
        int[] iArr3 = this.f25182C;
        int i12 = this.f25183D;
        this.f25183D = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        C2079z.a(collection);
        if (!(collection instanceof C2078y)) {
            return super.addAll(collection);
        }
        C2078y c2078y = (C2078y) collection;
        int i10 = c2078y.f25183D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25183D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f25182C;
        if (i12 > iArr.length) {
            this.f25182C = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2078y.f25182C, 0, this.f25182C, this.f25183D, c2078y.f25183D);
        this.f25183D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2078y)) {
            return super.equals(obj);
        }
        C2078y c2078y = (C2078y) obj;
        if (this.f25183D != c2078y.f25183D) {
            return false;
        }
        int[] iArr = c2078y.f25182C;
        for (int i10 = 0; i10 < this.f25183D; i10++) {
            if (this.f25182C[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        i(i10, num.intValue());
    }

    public int getInt(int i10) {
        j(i10);
        return this.f25182C[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        X(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f25183D; i11++) {
            i10 = (i10 * 31) + this.f25182C[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f25182C;
        System.arraycopy(iArr, i11, iArr, i10, this.f25183D - i11);
        this.f25183D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f25183D;
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C2079z.g k(int i10) {
        if (i10 >= this.f25183D) {
            return new C2078y(Arrays.copyOf(this.f25182C, i10), this.f25183D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        c();
        j(i10);
        int[] iArr = this.f25182C;
        int i11 = iArr[i10];
        if (i10 < this.f25183D - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f25183D--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(z(i10, num.intValue()));
    }

    public int z(int i10, int i11) {
        c();
        j(i10);
        int[] iArr = this.f25182C;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private C2078y(int[] iArr, int i10) {
        this.f25182C = iArr;
        this.f25183D = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f25183D; i10++) {
            if (obj.equals(Integer.valueOf(this.f25182C[i10]))) {
                int[] iArr = this.f25182C;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f25183D - i10) - 1);
                this.f25183D--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
