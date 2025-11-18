package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C2915z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2914y extends AbstractC2893c<Integer> implements C2915z.g, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2914y f38057E;

    /* renamed from: C, reason: collision with root package name */
    private int[] f38058C;

    /* renamed from: D, reason: collision with root package name */
    private int f38059D;

    static {
        C2914y c2914y = new C2914y(new int[0], 0);
        f38057E = c2914y;
        c2914y.n();
    }

    C2914y() {
        this(new int[10], 0);
    }

    private void i(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f38059D)) {
            throw new IndexOutOfBoundsException(v(i10));
        }
        int[] iArr = this.f38058C;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f38058C, i10, iArr2, i10 + 1, this.f38059D - i10);
            this.f38058C = iArr2;
        }
        this.f38058C[i10] = i11;
        this.f38059D++;
        ((AbstractList) this).modCount++;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f38059D) {
            throw new IndexOutOfBoundsException(v(i10));
        }
    }

    private String v(int i10) {
        return "Index:" + i10 + ", Size:" + this.f38059D;
    }

    public void X(int i10) {
        c();
        int i11 = this.f38059D;
        int[] iArr = this.f38058C;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f38058C = iArr2;
        }
        int[] iArr3 = this.f38058C;
        int i12 = this.f38059D;
        this.f38059D = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        C2915z.a(collection);
        if (!(collection instanceof C2914y)) {
            return super.addAll(collection);
        }
        C2914y c2914y = (C2914y) collection;
        int i10 = c2914y.f38059D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f38059D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f38058C;
        if (i12 > iArr.length) {
            this.f38058C = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2914y.f38058C, 0, this.f38058C, this.f38059D, c2914y.f38059D);
        this.f38059D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2914y)) {
            return super.equals(obj);
        }
        C2914y c2914y = (C2914y) obj;
        if (this.f38059D != c2914y.f38059D) {
            return false;
        }
        int[] iArr = c2914y.f38058C;
        for (int i10 = 0; i10 < this.f38059D; i10++) {
            if (this.f38058C[i10] != iArr[i10]) {
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
        return this.f38058C[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        X(num.intValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f38059D; i11++) {
            i10 = (i10 * 31) + this.f38058C[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f38058C[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
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
        int[] iArr = this.f38058C;
        System.arraycopy(iArr, i11, iArr, i10, this.f38059D - i11);
        this.f38059D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38059D;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.i
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C2915z.g k(int i10) {
        if (i10 >= this.f38059D) {
            return new C2914y(Arrays.copyOf(this.f38058C, i10), this.f38059D);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        c();
        j(i10);
        int[] iArr = this.f38058C;
        int i11 = iArr[i10];
        if (i10 < this.f38059D - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f38059D--;
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
        int[] iArr = this.f38058C;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private C2914y(int[] iArr, int i10) {
        this.f38058C = iArr;
        this.f38059D = i10;
    }
}
