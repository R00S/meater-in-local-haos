package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.gv */
/* loaded from: classes2.dex */
final class C6724gv extends AbstractC7388yt<Integer> implements zzdoh, InterfaceC6688fw, RandomAccess {

    /* renamed from: g */
    private static final C6724gv f18992g;

    /* renamed from: h */
    private int[] f18993h;

    /* renamed from: i */
    private int f18994i;

    static {
        C6724gv c6724gv = new C6724gv(new int[0], 0);
        f18992g = c6724gv;
        c6724gv.mo16108x0();
    }

    C6724gv() {
        this(new int[10], 0);
    }

    /* renamed from: g */
    private final void m15169g(int i2, int i3) {
        int i4;
        m16106c();
        if (i2 < 0 || i2 > (i4 = this.f18994i)) {
            throw new IndexOutOfBoundsException(m15172n(i2));
        }
        int[] iArr = this.f18993h;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f18993h, i2, iArr2, i2 + 1, this.f18994i - i2);
            this.f18993h = iArr2;
        }
        this.f18993h[i2] = i3;
        this.f18994i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: h */
    public static C6724gv m15170h() {
        return f18992g;
    }

    /* renamed from: i */
    private final void m15171i(int i2) {
        if (i2 < 0 || i2 >= this.f18994i) {
            throw new IndexOutOfBoundsException(m15172n(i2));
        }
    }

    /* renamed from: n */
    private final String m15172n(int i2) {
        int i3 = this.f18994i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final zzdoh mo14989N(int i2) {
        if (i2 >= this.f18994i) {
            return new C6724gv(Arrays.copyOf(this.f18993h, i2), this.f18994i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzdoh
    /* renamed from: Z0 */
    public final void mo15174Z0(int i2) {
        m15169g(this.f18994i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m15169g(i2, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m16106c();
        zzdod.m19740a(collection);
        if (!(collection instanceof C6724gv)) {
            return super.addAll(collection);
        }
        C6724gv c6724gv = (C6724gv) collection;
        int i2 = c6724gv.f18994i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f18994i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f18993h;
        if (i4 > iArr.length) {
            this.f18993h = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(c6724gv.f18993h, 0, this.f18993h, this.f18994i, c6724gv.f18994i);
        this.f18994i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6724gv)) {
            return super.equals(obj);
        }
        C6724gv c6724gv = (C6724gv) obj;
        if (this.f18994i != c6724gv.f18994i) {
            return false;
        }
        int[] iArr = c6724gv.f18993h;
        for (int i2 = 0; i2 < this.f18994i; i2++) {
            if (this.f18993h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m15175f(int i2) {
        m15171i(i2);
        return this.f18993h[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(m15175f(i2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f18994i; i3++) {
            i2 = (i2 * 31) + this.f18993h[i3];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m16106c();
        for (int i2 = 0; i2 < this.f18994i; i2++) {
            if (obj.equals(Integer.valueOf(this.f18993h[i2]))) {
                int[] iArr = this.f18993h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f18994i - i2) - 1);
                this.f18994i--;
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
        int[] iArr = this.f18993h;
        System.arraycopy(iArr, i3, iArr, i2, this.f18994i - i3);
        this.f18994i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m16106c();
        m15171i(i2);
        int[] iArr = this.f18993h;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18994i;
    }

    private C6724gv(int[] iArr, int i2) {
        this.f18993h = iArr;
        this.f18994i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m16106c();
        m15171i(i2);
        int[] iArr = this.f18993h;
        int i3 = iArr[i2];
        if (i2 < this.f18994i - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f18994i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }
}
