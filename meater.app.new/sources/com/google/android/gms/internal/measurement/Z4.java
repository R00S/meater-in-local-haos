package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class Z4 extends S3<Long> implements M4, InterfaceC2604v5, RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final long[] f34028E;

    /* renamed from: F, reason: collision with root package name */
    private static final Z4 f34029F;

    /* renamed from: C, reason: collision with root package name */
    private long[] f34030C;

    /* renamed from: D, reason: collision with root package name */
    private int f34031D;

    static {
        long[] jArr = new long[0];
        f34028E = jArr;
        f34029F = new Z4(jArr, 0, false);
    }

    Z4() {
        this(f34028E, 0, true);
    }

    public static Z4 h() {
        return f34029F;
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34031D;
    }

    private final void v(int i10) {
        if (i10 < 0 || i10 >= this.f34031D) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34031D)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        long[] jArr = this.f34030C;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[j(jArr.length)];
            System.arraycopy(this.f34030C, 0, jArr2, 0, i10);
            System.arraycopy(this.f34030C, i10, jArr2, i10 + 1, this.f34031D - i10);
            this.f34030C = jArr2;
        }
        this.f34030C[i10] = jLongValue;
        this.f34031D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        I4.e(collection);
        if (!(collection instanceof Z4)) {
            return super.addAll(collection);
        }
        Z4 z42 = (Z4) collection;
        int i10 = z42.f34031D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34031D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f34030C;
        if (i12 > jArr.length) {
            this.f34030C = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(z42.f34030C, 0, this.f34030C, this.f34031D, z42.f34031D);
        this.f34031D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z4)) {
            return super.equals(obj);
        }
        Z4 z42 = (Z4) obj;
        if (this.f34031D != z42.f34031D) {
            return false;
        }
        long[] jArr = z42.f34030C;
        for (int i10 = 0; i10 < this.f34031D; i10++) {
            if (this.f34030C[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j10) {
        c();
        int i10 = this.f34031D;
        long[] jArr = this.f34030C;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[j(jArr.length)];
            System.arraycopy(this.f34030C, 0, jArr2, 0, this.f34031D);
            this.f34030C = jArr2;
        }
        long[] jArr3 = this.f34030C;
        int i11 = this.f34031D;
        this.f34031D = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(s(i10));
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f34031D; i10++) {
            iB = (iB * 31) + I4.b(this.f34030C[i10]);
        }
        return iB;
    }

    final void i(int i10) {
        long[] jArr = this.f34030C;
        if (i10 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f34030C = new long[Math.max(i10, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i10) {
            length = j(length);
        }
        this.f34030C = Arrays.copyOf(this.f34030C, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f34030C[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        v(i10);
        long[] jArr = this.f34030C;
        long j10 = jArr[i10];
        if (i10 < this.f34031D - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f34031D--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f34030C;
        System.arraycopy(jArr, i11, jArr, i10, this.f34031D - i11);
        this.f34031D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.M4
    public final long s(int i10) {
        v(i10);
        return this.f34030C[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        v(i10);
        long[] jArr = this.f34030C;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34031D;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final M4 g(int i10) {
        if (i10 >= this.f34031D) {
            return new Z4(i10 == 0 ? f34028E : Arrays.copyOf(this.f34030C, i10), this.f34031D, true);
        }
        throw new IllegalArgumentException();
    }

    private Z4(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f34030C = jArr;
        this.f34031D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
