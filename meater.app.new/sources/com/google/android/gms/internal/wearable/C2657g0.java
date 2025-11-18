package com.google.android.gms.internal.wearable;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2657g0 extends E implements RandomAccess, InterfaceC2681o0, U0 {

    /* renamed from: E, reason: collision with root package name */
    private static final float[] f34623E;

    /* renamed from: F, reason: collision with root package name */
    private static final C2657g0 f34624F;

    /* renamed from: C, reason: collision with root package name */
    private float[] f34625C;

    /* renamed from: D, reason: collision with root package name */
    private int f34626D;

    static {
        float[] fArr = new float[0];
        f34623E = fArr;
        f34624F = new C2657g0(fArr, 0, false);
    }

    C2657g0() {
        this(f34623E, 0, true);
    }

    public static C2657g0 h() {
        return f34624F;
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f34626D;
    }

    private final void v(int i10) {
        if (i10 < 0 || i10 >= this.f34626D) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f34626D)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f34625C;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[j(length)];
            System.arraycopy(this.f34625C, 0, fArr2, 0, i10);
            System.arraycopy(this.f34625C, i10, fArr2, i12, this.f34626D - i10);
            this.f34625C = fArr2;
        }
        this.f34625C[i10] = fFloatValue;
        this.f34626D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = C2689r0.f34653b;
        collection.getClass();
        if (!(collection instanceof C2657g0)) {
            return super.addAll(collection);
        }
        C2657g0 c2657g0 = (C2657g0) collection;
        int i10 = c2657g0.f34626D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f34626D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f34625C;
        if (i12 > fArr.length) {
            this.f34625C = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2657g0.f34625C, 0, this.f34625C, this.f34626D, c2657g0.f34626D);
        this.f34626D = i12;
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
        if (!(obj instanceof C2657g0)) {
            return super.equals(obj);
        }
        C2657g0 c2657g0 = (C2657g0) obj;
        if (this.f34626D != c2657g0.f34626D) {
            return false;
        }
        float[] fArr = c2657g0.f34625C;
        for (int i10 = 0; i10 < this.f34626D; i10++) {
            if (Float.floatToIntBits(this.f34625C[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final float f(int i10) {
        v(i10);
        return this.f34625C[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        v(i10);
        return Float.valueOf(this.f34625C[i10]);
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f34626D; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f34625C[i10]);
        }
        return iFloatToIntBits;
    }

    public final void i(float f10) {
        c();
        int i10 = this.f34626D;
        int length = this.f34625C.length;
        if (i10 == length) {
            float[] fArr = new float[j(length)];
            System.arraycopy(this.f34625C, 0, fArr, 0, this.f34626D);
            this.f34625C = fArr;
        }
        float[] fArr2 = this.f34625C;
        int i11 = this.f34626D;
        this.f34626D = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f34626D;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f34625C[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC2687q0
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2681o0 C(int i10) {
        if (i10 >= this.f34626D) {
            return new C2657g0(i10 == 0 ? f34623E : Arrays.copyOf(this.f34625C, i10), this.f34626D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.wearable.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        c();
        v(i10);
        float[] fArr = this.f34625C;
        float f10 = fArr[i10];
        if (i10 < this.f34626D - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f34626D--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f34625C;
        System.arraycopy(fArr, i11, fArr, i10, this.f34626D - i11);
        this.f34626D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        v(i10);
        float[] fArr = this.f34625C;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34626D;
    }

    private C2657g0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f34625C = fArr;
        this.f34626D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
