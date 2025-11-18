package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class G extends E implements RandomAccess, InterfaceC2687q0, U0 {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean[] f34487E;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f34488C;

    /* renamed from: D, reason: collision with root package name */
    private int f34489D;

    static {
        boolean[] zArr = new boolean[0];
        f34487E = zArr;
        new G(zArr, 0, false);
    }

    G() {
        this(f34487E, 0, true);
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34489D;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f34489D) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2687q0
    public final /* bridge */ /* synthetic */ InterfaceC2687q0 C(int i10) {
        if (i10 >= this.f34489D) {
            return new G(i10 == 0 ? f34487E : Arrays.copyOf(this.f34488C, i10), this.f34489D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34489D)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f34488C;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[i(length)];
            System.arraycopy(this.f34488C, 0, zArr2, 0, i10);
            System.arraycopy(this.f34488C, i10, zArr2, i12, this.f34489D - i10);
            this.f34488C = zArr2;
        }
        this.f34488C[i10] = zBooleanValue;
        this.f34489D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = C2689r0.f34653b;
        collection.getClass();
        if (!(collection instanceof G)) {
            return super.addAll(collection);
        }
        G g10 = (G) collection;
        int i10 = g10.f34489D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34489D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f34488C;
        if (i12 > zArr.length) {
            this.f34488C = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(g10.f34488C, 0, this.f34488C, this.f34489D, g10.f34489D);
        this.f34489D = i12;
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
        if (!(obj instanceof G)) {
            return super.equals(obj);
        }
        G g10 = (G) obj;
        if (this.f34489D != g10.f34489D) {
            return false;
        }
        boolean[] zArr = g10.f34488C;
        for (int i10 = 0; i10 < this.f34489D; i10++) {
            if (this.f34488C[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(boolean z10) {
        c();
        int i10 = this.f34489D;
        int length = this.f34488C.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[i(length)];
            System.arraycopy(this.f34488C, 0, zArr, 0, this.f34489D);
            this.f34488C = zArr;
        }
        boolean[] zArr2 = this.f34488C;
        int i11 = this.f34489D;
        this.f34489D = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        r(i10);
        return Boolean.valueOf(this.f34488C[i10]);
    }

    public final boolean h(int i10) {
        r(i10);
        return this.f34488C[i10];
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f34489D; i10++) {
            iA = (iA * 31) + C2689r0.a(this.f34488C[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f34489D;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34488C[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        r(i10);
        boolean[] zArr = this.f34488C;
        boolean z10 = zArr[i10];
        if (i10 < this.f34489D - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f34489D--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f34488C;
        System.arraycopy(zArr, i11, zArr, i10, this.f34489D - i11);
        this.f34489D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        r(i10);
        boolean[] zArr = this.f34488C;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34489D;
    }

    private G(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f34488C = zArr;
        this.f34489D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
