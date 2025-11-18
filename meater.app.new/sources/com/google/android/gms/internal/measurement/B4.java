package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class B4 extends S3<Float> implements L4<Float>, InterfaceC2604v5, RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    private static final float[] f33665E;

    /* renamed from: C, reason: collision with root package name */
    private float[] f33666C;

    /* renamed from: D, reason: collision with root package name */
    private int f33667D;

    static {
        float[] fArr = new float[0];
        f33665E = fArr;
        new B4(fArr, 0, false);
    }

    B4() {
        this(f33665E, 0, true);
    }

    private static int j(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33667D;
    }

    private final void v(int i10) {
        if (i10 < 0 || i10 >= this.f33667D) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f33667D)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        float[] fArr = this.f33666C;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[j(fArr.length)];
            System.arraycopy(this.f33666C, 0, fArr2, 0, i10);
            System.arraycopy(this.f33666C, i10, fArr2, i10 + 1, this.f33667D - i10);
            this.f33666C = fArr2;
        }
        this.f33666C[i10] = fFloatValue;
        this.f33667D++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        I4.e(collection);
        if (!(collection instanceof B4)) {
            return super.addAll(collection);
        }
        B4 b42 = (B4) collection;
        int i10 = b42.f33667D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f33667D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f33666C;
        if (i12 > fArr.length) {
            this.f33666C = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(b42.f33666C, 0, this.f33666C, this.f33667D, b42.f33667D);
        this.f33667D = i12;
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
        if (!(obj instanceof B4)) {
            return super.equals(obj);
        }
        B4 b42 = (B4) obj;
        if (this.f33667D != b42.f33667D) {
            return false;
        }
        float[] fArr = b42.f33666C;
        for (int i10 = 0; i10 < this.f33667D; i10++) {
            if (Float.floatToIntBits(this.f33666C[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f10) {
        c();
        int i10 = this.f33667D;
        float[] fArr = this.f33666C;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[j(fArr.length)];
            System.arraycopy(this.f33666C, 0, fArr2, 0, this.f33667D);
            this.f33666C = fArr2;
        }
        float[] fArr3 = this.f33666C;
        int i11 = this.f33667D;
        this.f33667D = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.L4
    public final /* synthetic */ L4<Float> g(int i10) {
        if (i10 >= this.f33667D) {
            return new B4(i10 == 0 ? f33665E : Arrays.copyOf(this.f33666C, i10), this.f33667D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Float.valueOf(h(i10));
    }

    public final float h(int i10) {
        v(i10);
        return this.f33666C[i10];
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f33667D; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f33666C[i10]);
        }
        return iFloatToIntBits;
    }

    final void i(int i10) {
        float[] fArr = this.f33666C;
        if (i10 <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.f33666C = new float[Math.max(i10, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i10) {
            length = j(length);
        }
        this.f33666C = Arrays.copyOf(this.f33666C, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f33666C[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.S3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        c();
        v(i10);
        float[] fArr = this.f33666C;
        float f10 = fArr[i10];
        if (i10 < this.f33667D - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f33667D--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f33666C;
        System.arraycopy(fArr, i11, fArr, i10, this.f33667D - i11);
        this.f33667D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        v(i10);
        float[] fArr = this.f33666C;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33667D;
    }

    private B4(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f33666C = fArr;
        this.f33667D = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Float) obj).floatValue());
        return true;
    }
}
