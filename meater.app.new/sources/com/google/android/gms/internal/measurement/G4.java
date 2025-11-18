package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class G4 extends S3<Integer> implements J4, InterfaceC2604v5, RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f33753E;

    /* renamed from: F, reason: collision with root package name */
    private static final G4 f33754F;

    /* renamed from: C, reason: collision with root package name */
    private int[] f33755C;

    /* renamed from: D, reason: collision with root package name */
    private int f33756D;

    static {
        int[] iArr = new int[0];
        f33753E = iArr;
        f33754F = new G4(iArr, 0, false);
    }

    G4() {
        this(f33753E, 0, true);
    }

    public static G4 h() {
        return f33754F;
    }

    private static int r(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String v(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33756D;
    }

    private final void w(int i10) {
        if (i10 < 0 || i10 >= this.f33756D) {
            throw new IndexOutOfBoundsException(v(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f33756D)) {
            throw new IndexOutOfBoundsException(v(i10));
        }
        int[] iArr = this.f33755C;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[r(iArr.length)];
            System.arraycopy(this.f33755C, 0, iArr2, 0, i10);
            System.arraycopy(this.f33755C, i10, iArr2, i10 + 1, this.f33756D - i10);
            this.f33755C = iArr2;
        }
        this.f33755C[i10] = iIntValue;
        this.f33756D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        I4.e(collection);
        if (!(collection instanceof G4)) {
            return super.addAll(collection);
        }
        G4 g42 = (G4) collection;
        int i10 = g42.f33756D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33756D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f33755C;
        if (i12 > iArr.length) {
            this.f33755C = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(g42.f33755C, 0, this.f33755C, this.f33756D, g42.f33756D);
        this.f33756D = i12;
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
        if (!(obj instanceof G4)) {
            return super.equals(obj);
        }
        G4 g42 = (G4) obj;
        if (this.f33756D != g42.f33756D) {
            return false;
        }
        int[] iArr = g42.f33755C;
        for (int i10 = 0; i10 < this.f33756D; i10++) {
            if (this.f33755C[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        w(i10);
        return this.f33755C[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(f(i10));
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f33756D; i11++) {
            i10 = (i10 * 31) + this.f33755C[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        c();
        int i11 = this.f33756D;
        int[] iArr = this.f33755C;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[r(iArr.length)];
            System.arraycopy(this.f33755C, 0, iArr2, 0, this.f33756D);
            this.f33755C = iArr2;
        }
        int[] iArr3 = this.f33755C;
        int i12 = this.f33756D;
        this.f33756D = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f33755C[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    final void j(int i10) {
        int[] iArr = this.f33755C;
        if (i10 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f33755C = new int[Math.max(i10, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i10) {
            length = r(length);
        }
        this.f33755C = Arrays.copyOf(this.f33755C, length);
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        w(i10);
        int[] iArr = this.f33755C;
        int i11 = iArr[i10];
        if (i10 < this.f33756D - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f33756D--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f33755C;
        System.arraycopy(iArr, i11, iArr, i10, this.f33756D - i11);
        this.f33756D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        w(i10);
        int[] iArr = this.f33755C;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33756D;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final J4 g(int i10) {
        if (i10 >= this.f33756D) {
            return new G4(i10 == 0 ? f33753E : Arrays.copyOf(this.f33755C, i10), this.f33756D, true);
        }
        throw new IllegalArgumentException();
    }

    private G4(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f33755C = iArr;
        this.f33756D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
