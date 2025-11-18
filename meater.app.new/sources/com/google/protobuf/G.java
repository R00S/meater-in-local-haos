package com.google.protobuf;

import com.google.protobuf.C2964y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: LongArrayList.java */
/* loaded from: classes2.dex */
final class G extends AbstractC2943c<Long> implements C2964y.h, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final G f39169E = new G(new long[0], 0, false);

    /* renamed from: C, reason: collision with root package name */
    private long[] f39170C;

    /* renamed from: D, reason: collision with root package name */
    private int f39171D;

    G() {
        this(new long[10], 0, true);
    }

    private void i(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f39171D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        long[] jArr = this.f39170C;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f39170C, i10, jArr2, i10 + 1, this.f39171D - i10);
            this.f39170C = jArr2;
        }
        this.f39170C[i10] = j10;
        this.f39171D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f39171D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f39171D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(B(i10, l10.longValue()));
    }

    public long B(int i10, long j10) {
        c();
        r(i10);
        long[] jArr = this.f39170C;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        C2964y.a(collection);
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g10 = (G) collection;
        int i10 = g10.f39171D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39171D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f39170C;
        if (i12 > jArr.length) {
            this.f39170C = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(g10.f39170C, 0, this.f39170C, this.f39171D, g10.f39171D);
        this.f39171D = i12;
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
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g10 = (G) obj;
        if (this.f39171D != g10.f39171D) {
            return false;
        }
        long[] jArr = g10.f39170C;
        for (int i10 = 0; i10 < this.f39171D; i10++) {
            if (this.f39170C[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        i(i10, l10.longValue());
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        j(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f39171D; i10++) {
            iF = (iF * 31) + C2964y.f(this.f39170C[i10]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f39170C[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    public void j(long j10) {
        c();
        int i10 = this.f39171D;
        long[] jArr = this.f39170C;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f39170C = jArr2;
        }
        long[] jArr3 = this.f39170C;
        int i11 = this.f39171D;
        this.f39171D = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f39170C;
        System.arraycopy(jArr, i11, jArr, i10, this.f39171D - i11);
        this.f39171D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39171D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(w(i10));
    }

    public long w(int i10) {
        r(i10);
        return this.f39170C[i10];
    }

    @Override // com.google.protobuf.C2964y.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2964y.h k(int i10) {
        if (i10 >= this.f39171D) {
            return new G(Arrays.copyOf(this.f39170C, i10), this.f39171D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        c();
        r(i10);
        long[] jArr = this.f39170C;
        long j10 = jArr[i10];
        if (i10 < this.f39171D - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f39171D--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    private G(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f39170C = jArr;
        this.f39171D = i10;
    }
}
