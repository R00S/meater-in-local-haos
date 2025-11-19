package com.google.protobuf;

import com.google.protobuf.C2964y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: IntArrayList.java */
/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2963x extends AbstractC2943c<Integer> implements C2964y.g, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2963x f39487E = new C2963x(new int[0], 0, false);

    /* renamed from: C, reason: collision with root package name */
    private int[] f39488C;

    /* renamed from: D, reason: collision with root package name */
    private int f39489D;

    C2963x() {
        this(new int[10], 0, true);
    }

    private void i(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f39489D)) {
            throw new IndexOutOfBoundsException(w(i10));
        }
        int[] iArr = this.f39488C;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f39488C, i10, iArr2, i10 + 1, this.f39489D - i10);
            this.f39488C = iArr2;
        }
        this.f39488C[i10] = i11;
        this.f39489D++;
        ((AbstractList) this).modCount++;
    }

    public static C2963x j() {
        return f39487E;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f39489D) {
            throw new IndexOutOfBoundsException(w(i10));
        }
    }

    private String w(int i10) {
        return "Index:" + i10 + ", Size:" + this.f39489D;
    }

    @Override // com.google.protobuf.C2964y.g
    public void X(int i10) {
        c();
        int i11 = this.f39489D;
        int[] iArr = this.f39488C;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f39488C = iArr2;
        }
        int[] iArr3 = this.f39488C;
        int i12 = this.f39489D;
        this.f39489D = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        C2964y.a(collection);
        if (!(collection instanceof C2963x)) {
            return super.addAll(collection);
        }
        C2963x c2963x = (C2963x) collection;
        int i10 = c2963x.f39489D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39489D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f39488C;
        if (i12 > iArr.length) {
            this.f39488C = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2963x.f39488C, 0, this.f39488C, this.f39489D, c2963x.f39489D);
        this.f39489D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2963x)) {
            return super.equals(obj);
        }
        C2963x c2963x = (C2963x) obj;
        if (this.f39489D != c2963x.f39489D) {
            return false;
        }
        int[] iArr = c2963x.f39488C;
        for (int i10 = 0; i10 < this.f39489D; i10++) {
            if (this.f39488C[i10] != iArr[i10]) {
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

    @Override // com.google.protobuf.C2964y.g
    public int getInt(int i10) {
        r(i10);
        return this.f39488C[i10];
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        X(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f39489D; i11++) {
            i10 = (i10 * 31) + this.f39488C[i11];
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
            if (this.f39488C[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f39488C;
        System.arraycopy(iArr, i11, iArr, i10, this.f39489D - i11);
        this.f39489D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39489D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        c();
        r(i10);
        int[] iArr = this.f39488C;
        int i11 = iArr[i10];
        if (i10 < this.f39489D - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f39489D--;
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
        r(i10);
        int[] iArr = this.f39488C;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    private C2963x(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f39488C = iArr;
        this.f39489D = i10;
    }

    @Override // com.google.protobuf.C2964y.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2964y.i<Integer> k2(int i10) {
        if (i10 >= this.f39489D) {
            return new C2963x(Arrays.copyOf(this.f39488C, i10), this.f39489D, true);
        }
        throw new IllegalArgumentException();
    }
}
