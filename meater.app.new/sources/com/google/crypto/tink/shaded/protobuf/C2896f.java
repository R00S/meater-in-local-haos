package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C2915z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: BooleanArrayList.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2896f extends AbstractC2893c<Boolean> implements C2915z.a, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2896f f37798E;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f37799C;

    /* renamed from: D, reason: collision with root package name */
    private int f37800D;

    static {
        C2896f c2896f = new C2896f(new boolean[0], 0);
        f37798E = c2896f;
        c2896f.n();
    }

    C2896f() {
        this(new boolean[10], 0);
    }

    private void i(int i10, boolean z10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f37800D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        boolean[] zArr = this.f37799C;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f37799C, i10, zArr2, i10 + 1, this.f37800D - i10);
            this.f37799C = zArr2;
        }
        this.f37799C[i10] = z10;
        this.f37800D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f37800D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37800D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(B(i10, bool.booleanValue()));
    }

    public boolean B(int i10, boolean z10) {
        c();
        r(i10);
        boolean[] zArr = this.f37799C;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        C2915z.a(collection);
        if (!(collection instanceof C2896f)) {
            return super.addAll(collection);
        }
        C2896f c2896f = (C2896f) collection;
        int i10 = c2896f.f37800D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37800D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f37799C;
        if (i12 > zArr.length) {
            this.f37799C = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2896f.f37799C, 0, this.f37799C, this.f37800D, c2896f.f37800D);
        this.f37800D = i12;
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
        if (!(obj instanceof C2896f)) {
            return super.equals(obj);
        }
        C2896f c2896f = (C2896f) obj;
        if (this.f37800D != c2896f.f37800D) {
            return false;
        }
        boolean[] zArr = c2896f.f37799C;
        for (int i10 = 0; i10 < this.f37800D; i10++) {
            if (this.f37799C[i10] != zArr[i10]) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        j(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f37800D; i10++) {
            iC = (iC * 31) + C2915z.c(this.f37799C[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f37799C[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public void j(boolean z10) {
        c();
        int i10 = this.f37800D;
        boolean[] zArr = this.f37799C;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f37799C = zArr2;
        }
        boolean[] zArr3 = this.f37799C;
        int i11 = this.f37800D;
        this.f37800D = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f37799C;
        System.arraycopy(zArr, i11, zArr, i10, this.f37800D - i11);
        this.f37800D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37800D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(w(i10));
    }

    public boolean w(int i10) {
        r(i10);
        return this.f37799C[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2915z.a k(int i10) {
        if (i10 >= this.f37800D) {
            return new C2896f(Arrays.copyOf(this.f37799C, i10), this.f37800D);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        c();
        r(i10);
        boolean[] zArr = this.f37799C;
        boolean z10 = zArr[i10];
        if (i10 < this.f37800D - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f37800D--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    private C2896f(boolean[] zArr, int i10) {
        this.f37799C = zArr;
        this.f37800D = i10;
    }
}
