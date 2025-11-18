package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.w2 */
/* loaded from: classes2.dex */
final class C7608w2 extends AbstractC7523i1<Long> implements zzfm, InterfaceC7549m3, RandomAccess {

    /* renamed from: g */
    private static final C7608w2 f27917g;

    /* renamed from: h */
    private long[] f27918h;

    /* renamed from: i */
    private int f27919i;

    static {
        C7608w2 c7608w2 = new C7608w2(new long[0], 0);
        f27917g = c7608w2;
        c7608w2.mo21144I();
    }

    C7608w2() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    public static C7608w2 m21436f() {
        return f27917g;
    }

    /* renamed from: g */
    private final void m21437g(int i2) {
        if (i2 < 0 || i2 >= this.f27919i) {
            throw new IndexOutOfBoundsException(m21438h(i2));
        }
    }

    /* renamed from: h */
    private final String m21438h(int i2) {
        int i3 = this.f27919i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzfm
    /* renamed from: G0 */
    public final void mo21439G0(long j2) {
        m21146c();
        int i2 = this.f27919i;
        long[] jArr = this.f27918h;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f27918h = jArr2;
        }
        long[] jArr3 = this.f27918h;
        int i3 = this.f27919i;
        this.f27919i = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        m21146c();
        if (i2 < 0 || i2 > (i3 = this.f27919i)) {
            throw new IndexOutOfBoundsException(m21438h(i2));
        }
        long[] jArr = this.f27918h;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f27918h, i2, jArr2, i2 + 1, this.f27919i - i2);
            this.f27918h = jArr2;
        }
        this.f27918h[i2] = jLongValue;
        this.f27919i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m21146c();
        zzff.m22289d(collection);
        if (!(collection instanceof C7608w2)) {
            return super.addAll(collection);
        }
        C7608w2 c7608w2 = (C7608w2) collection;
        int i2 = c7608w2.f27919i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f27919i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f27918h;
        if (i4 > jArr.length) {
            this.f27918h = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(c7608w2.f27918h, 0, this.f27918h, this.f27919i, c7608w2.f27919i);
        this.f27919i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfm
    /* renamed from: e */
    public final long mo21440e(int i2) {
        m21437g(i2);
        return this.f27918h[i2];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7608w2)) {
            return super.equals(obj);
        }
        C7608w2 c7608w2 = (C7608w2) obj;
        if (this.f27919i != c7608w2.f27919i) {
            return false;
        }
        long[] jArr = c7608w2.f27918h;
        for (int i2 = 0; i2 < this.f27919i; i2++) {
            if (this.f27918h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(mo21440e(i2));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM22287b = 1;
        for (int i2 = 0; i2 < this.f27919i; i2++) {
            iM22287b = (iM22287b * 31) + zzff.m22287b(this.f27918h[i2]);
        }
        return iM22287b;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final zzfm mo20982d(int i2) {
        if (i2 >= this.f27919i) {
            return new C7608w2(Arrays.copyOf(this.f27918h, i2), this.f27919i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m21146c();
        for (int i2 = 0; i2 < this.f27919i; i2++) {
            if (obj.equals(Long.valueOf(this.f27918h[i2]))) {
                long[] jArr = this.f27918h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f27919i - i2) - 1);
                this.f27919i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        m21146c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f27918h;
        System.arraycopy(jArr, i3, jArr, i2, this.f27919i - i3);
        this.f27919i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m21146c();
        m21437g(i2);
        long[] jArr = this.f27918h;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27919i;
    }

    private C7608w2(long[] jArr, int i2) {
        this.f27918h = jArr;
        this.f27919i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m21146c();
        m21437g(i2);
        long[] jArr = this.f27918h;
        long j2 = jArr[i2];
        if (i2 < this.f27919i - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f27919i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        mo21439G0(((Long) obj).longValue());
        return true;
    }
}
