package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class C0 extends E implements RandomAccess, InterfaceC2684p0, U0 {

    /* renamed from: E, reason: collision with root package name */
    private static final long[] f34477E;

    /* renamed from: F, reason: collision with root package name */
    private static final C0 f34478F;

    /* renamed from: C, reason: collision with root package name */
    private long[] f34479C;

    /* renamed from: D, reason: collision with root package name */
    private int f34480D;

    static {
        long[] jArr = new long[0];
        f34477E = jArr;
        f34478F = new C0(jArr, 0, false);
    }

    C0() {
        this(f34477E, 0, true);
    }

    public static C0 h() {
        return f34478F;
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34480D;
    }

    private final void v(int i10) {
        if (i10 < 0 || i10 >= this.f34480D) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34480D)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f34479C;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[j(length)];
            System.arraycopy(this.f34479C, 0, jArr2, 0, i10);
            System.arraycopy(this.f34479C, i10, jArr2, i12, this.f34480D - i10);
            this.f34479C = jArr2;
        }
        this.f34479C[i10] = jLongValue;
        this.f34480D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = C2689r0.f34653b;
        collection.getClass();
        if (!(collection instanceof C0)) {
            return super.addAll(collection);
        }
        C0 c02 = (C0) collection;
        int i10 = c02.f34480D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34480D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f34479C;
        if (i12 > jArr.length) {
            this.f34479C = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c02.f34479C, 0, this.f34479C, this.f34480D, c02.f34480D);
        this.f34480D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return super.equals(obj);
        }
        C0 c02 = (C0) obj;
        if (this.f34480D != c02.f34480D) {
            return false;
        }
        long[] jArr = c02.f34479C;
        for (int i10 = 0; i10 < this.f34480D; i10++) {
            if (this.f34479C[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final long f(int i10) {
        v(i10);
        return this.f34479C[i10];
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2687q0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2684p0 C(int i10) {
        if (i10 >= this.f34480D) {
            return new C0(i10 == 0 ? f34477E : Arrays.copyOf(this.f34479C, i10), this.f34480D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        v(i10);
        return Long.valueOf(this.f34479C[i10]);
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f34480D; i11++) {
            long j10 = this.f34479C[i11];
            byte[] bArr = C2689r0.f34653b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public final void i(long j10) {
        c();
        int i10 = this.f34480D;
        int length = this.f34479C.length;
        if (i10 == length) {
            long[] jArr = new long[j(length)];
            System.arraycopy(this.f34479C, 0, jArr, 0, this.f34480D);
            this.f34479C = jArr;
        }
        long[] jArr2 = this.f34479C;
        int i11 = this.f34480D;
        this.f34480D = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f34480D;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34479C[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        v(i10);
        long[] jArr = this.f34479C;
        long j10 = jArr[i10];
        if (i10 < this.f34480D - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f34480D--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f34479C;
        System.arraycopy(jArr, i11, jArr, i10, this.f34480D - i11);
        this.f34480D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        v(i10);
        long[] jArr = this.f34479C;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34480D;
    }

    private C0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f34479C = jArr;
        this.f34480D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
