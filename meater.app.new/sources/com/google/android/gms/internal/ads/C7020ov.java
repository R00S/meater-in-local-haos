package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.ov */
/* loaded from: classes2.dex */
final class C7020ov extends AbstractC7388yt<Long> implements zzdoj<Long>, InterfaceC6688fw, RandomAccess {

    /* renamed from: g */
    private static final C7020ov f20214g;

    /* renamed from: h */
    private long[] f20215h;

    /* renamed from: i */
    private int f20216i;

    static {
        C7020ov c7020ov = new C7020ov(new long[0], 0);
        f20214g = c7020ov;
        c7020ov.mo16108x0();
    }

    C7020ov() {
        this(new long[10], 0);
    }

    /* renamed from: g */
    private final void m15689g(int i2) {
        if (i2 < 0 || i2 >= this.f20216i) {
            throw new IndexOutOfBoundsException(m15690h(i2));
        }
    }

    /* renamed from: h */
    private final String m15690h(int i2) {
        int i3 = this.f20216i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: n */
    private final void m15691n(int i2, long j2) {
        int i3;
        m16106c();
        if (i2 < 0 || i2 > (i3 = this.f20216i)) {
            throw new IndexOutOfBoundsException(m15690h(i2));
        }
        long[] jArr = this.f20215h;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f20215h, i2, jArr2, i2 + 1, this.f20216i - i2);
            this.f20215h = jArr2;
        }
        this.f20215h[i2] = j2;
        this.f20216i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: N */
    public final /* synthetic */ zzdoj<Long> mo14989N(int i2) {
        if (i2 >= this.f20216i) {
            return new C7020ov(Arrays.copyOf(this.f20215h, i2), this.f20216i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m15691n(i2, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m16106c();
        zzdod.m19740a(collection);
        if (!(collection instanceof C7020ov)) {
            return super.addAll(collection);
        }
        C7020ov c7020ov = (C7020ov) collection;
        int i2 = c7020ov.f20216i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f20216i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f20215h;
        if (i4 > jArr.length) {
            this.f20215h = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(c7020ov.f20215h, 0, this.f20215h, this.f20216i, c7020ov.f20216i);
        this.f20216i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7020ov)) {
            return super.equals(obj);
        }
        C7020ov c7020ov = (C7020ov) obj;
        if (this.f20216i != c7020ov.f20216i) {
            return false;
        }
        long[] jArr = c7020ov.f20215h;
        for (int i2 = 0; i2 < this.f20216i; i2++) {
            if (this.f20215h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final long m15692f(int i2) {
        m15689g(i2);
        return this.f20215h[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(m15692f(i2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM19748i = 1;
        for (int i2 = 0; i2 < this.f20216i; i2++) {
            iM19748i = (iM19748i * 31) + zzdod.m19748i(this.f20215h[i2]);
        }
        return iM19748i;
    }

    /* renamed from: i */
    public final void m15693i(long j2) {
        m15691n(this.f20216i, j2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m16106c();
        for (int i2 = 0; i2 < this.f20216i; i2++) {
            if (obj.equals(Long.valueOf(this.f20215h[i2]))) {
                long[] jArr = this.f20215h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f20216i - i2) - 1);
                this.f20216i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        m16106c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f20215h;
        System.arraycopy(jArr, i3, jArr, i2, this.f20216i - i3);
        this.f20216i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m16106c();
        m15689g(i2);
        long[] jArr = this.f20215h;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20216i;
    }

    private C7020ov(long[] jArr, int i2) {
        this.f20215h = jArr;
        this.f20216i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m16106c();
        m15689g(i2);
        long[] jArr = this.f20215h;
        long j2 = jArr[i2];
        if (i2 < this.f20216i - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f20216i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }
}
