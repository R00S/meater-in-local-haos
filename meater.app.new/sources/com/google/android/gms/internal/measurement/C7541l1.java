package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.l1 */
/* loaded from: classes2.dex */
final class C7541l1 extends AbstractC7523i1<Boolean> implements zzfl<Boolean>, InterfaceC7549m3, RandomAccess {

    /* renamed from: g */
    private static final C7541l1 f27820g;

    /* renamed from: h */
    private boolean[] f27821h;

    /* renamed from: i */
    private int f27822i;

    static {
        C7541l1 c7541l1 = new C7541l1(new boolean[0], 0);
        f27820g = c7541l1;
        c7541l1.mo21144I();
    }

    C7541l1() {
        this(new boolean[10], 0);
    }

    /* renamed from: g */
    private final void m21228g(int i2) {
        if (i2 < 0 || i2 >= this.f27822i) {
            throw new IndexOutOfBoundsException(m21229h(i2));
        }
    }

    /* renamed from: h */
    private final String m21229h(int i2) {
        int i3 = this.f27822i;
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m21146c();
        if (i2 < 0 || i2 > (i3 = this.f27822i)) {
            throw new IndexOutOfBoundsException(m21229h(i2));
        }
        boolean[] zArr = this.f27821h;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f27821h, i2, zArr2, i2 + 1, this.f27822i - i2);
            this.f27821h = zArr2;
        }
        this.f27821h[i2] = zBooleanValue;
        this.f27822i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m21146c();
        zzff.m22289d(collection);
        if (!(collection instanceof C7541l1)) {
            return super.addAll(collection);
        }
        C7541l1 c7541l1 = (C7541l1) collection;
        int i2 = c7541l1.f27822i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f27822i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f27821h;
        if (i4 > zArr.length) {
            this.f27821h = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(c7541l1.f27821h, 0, this.f27821h, this.f27822i, c7541l1.f27822i);
        this.f27822i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzfl
    /* renamed from: d */
    public final /* synthetic */ zzfl<Boolean> mo20982d(int i2) {
        if (i2 >= this.f27822i) {
            return new C7541l1(Arrays.copyOf(this.f27821h, i2), this.f27822i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7541l1)) {
            return super.equals(obj);
        }
        C7541l1 c7541l1 = (C7541l1) obj;
        if (this.f27822i != c7541l1.f27822i) {
            return false;
        }
        boolean[] zArr = c7541l1.f27821h;
        for (int i2 = 0; i2 < this.f27822i; i2++) {
            if (this.f27821h[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m21230f(boolean z) {
        m21146c();
        int i2 = this.f27822i;
        boolean[] zArr = this.f27821h;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f27821h = zArr2;
        }
        boolean[] zArr3 = this.f27821h;
        int i3 = this.f27822i;
        this.f27822i = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m21228g(i2);
        return Boolean.valueOf(this.f27821h[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM22288c = 1;
        for (int i2 = 0; i2 < this.f27822i; i2++) {
            iM22288c = (iM22288c * 31) + zzff.m22288c(this.f27821h[i2]);
        }
        return iM22288c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m21146c();
        for (int i2 = 0; i2 < this.f27822i; i2++) {
            if (obj.equals(Boolean.valueOf(this.f27821h[i2]))) {
                boolean[] zArr = this.f27821h;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f27822i - i2) - 1);
                this.f27822i--;
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
        boolean[] zArr = this.f27821h;
        System.arraycopy(zArr, i3, zArr, i2, this.f27822i - i3);
        this.f27822i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m21146c();
        m21228g(i2);
        boolean[] zArr = this.f27821h;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27822i;
    }

    private C7541l1(boolean[] zArr, int i2) {
        this.f27821h = zArr;
        this.f27822i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m21146c();
        m21228g(i2);
        boolean[] zArr = this.f27821h;
        boolean z = zArr[i2];
        if (i2 < this.f27822i - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f27822i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7523i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m21230f(((Boolean) obj).booleanValue());
        return true;
    }
}
