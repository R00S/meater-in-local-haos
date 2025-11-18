package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* loaded from: classes2.dex */
final class C7554n2 extends AbstractC7523i1<Integer> implements zzfj, InterfaceC7549m3, RandomAccess {

    /* renamed from: g */
    private static final C7554n2 f27847g;

    /* renamed from: h */
    private int[] f27848h;

    /* renamed from: i */
    private int f27849i;

    static {
        C7554n2 c7554n2 = new C7554n2(new int[0], 0);
        f27847g = c7554n2;
        c7554n2.mo21144I();
    }

    C7554n2() {
        this(new int[10], 0);
    }

    /* renamed from: g */
    public static C7554n2 m21239g() {
        return f27847g;
    }

    /* renamed from: i */
    private final void m21240i(int i2) {
        if (i2 < 0 || i2 >= this.f27849i) {
            throw new IndexOutOfBoundsException(m21241n(i2));
        }
    }

    /* renamed from: n */
    private final String m21241n(int i2) {
        int i3 = this.f27849i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        m21146c();
        if (i2 < 0 || i2 > (i3 = this.f27849i)) {
            throw new IndexOutOfBoundsException(m21241n(i2));
        }
        int[] iArr = this.f27848h;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f27848h, i2, iArr2, i2 + 1, this.f27849i - i2);
            this.f27848h = iArr2;
        }
        this.f27848h[i2] = iIntValue;
        this.f27849i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m21146c();
        zzff.m22289d(collection);
        if (!(collection instanceof C7554n2)) {
            return super.addAll(collection);
        }
        C7554n2 c7554n2 = (C7554n2) collection;
        int i2 = c7554n2.f27849i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f27849i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f27848h;
        if (i4 > iArr.length) {
            this.f27848h = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(c7554n2.f27848h, 0, this.f27848h, this.f27849i, c7554n2.f27849i);
        this.f27849i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zzfj mo20982d(int i2) {
        if (i2 >= this.f27849i) {
            return new C7554n2(Arrays.copyOf(this.f27848h, i2), this.f27849i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7554n2)) {
            return super.equals(obj);
        }
        C7554n2 c7554n2 = (C7554n2) obj;
        if (this.f27849i != c7554n2.f27849i) {
            return false;
        }
        int[] iArr = c7554n2.f27848h;
        for (int i2 = 0; i2 < this.f27849i; i2++) {
            if (this.f27848h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m21243f(int i2) {
        m21240i(i2);
        return this.f27848h[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(m21243f(i2));
    }

    /* renamed from: h */
    public final void m21244h(int i2) {
        m21146c();
        int i3 = this.f27849i;
        int[] iArr = this.f27848h;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f27848h = iArr2;
        }
        int[] iArr3 = this.f27848h;
        int i4 = this.f27849i;
        this.f27849i = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f27849i; i3++) {
            i2 = (i2 * 31) + this.f27848h[i3];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m21146c();
        for (int i2 = 0; i2 < this.f27849i; i2++) {
            if (obj.equals(Integer.valueOf(this.f27848h[i2]))) {
                int[] iArr = this.f27848h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f27849i - i2) - 1);
                this.f27849i--;
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
        int[] iArr = this.f27848h;
        System.arraycopy(iArr, i3, iArr, i2, this.f27849i - i3);
        this.f27849i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m21146c();
        m21240i(i2);
        int[] iArr = this.f27848h;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27849i;
    }

    private C7554n2(int[] iArr, int i2) {
        this.f27848h = iArr;
        this.f27849i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m21146c();
        m21240i(i2);
        int[] iArr = this.f27848h;
        int i3 = iArr[i2];
        if (i2 < this.f27849i - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f27849i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m21244h(((Integer) obj).intValue());
        return true;
    }
}
