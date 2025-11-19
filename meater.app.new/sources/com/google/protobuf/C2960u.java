package com.google.protobuf;

import com.google.protobuf.C2964y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2960u extends AbstractC2943c<Float> implements C2964y.f, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2960u f39465E = new C2960u(new float[0], 0, false);

    /* renamed from: C, reason: collision with root package name */
    private float[] f39466C;

    /* renamed from: D, reason: collision with root package name */
    private int f39467D;

    C2960u() {
        this(new float[10], 0, true);
    }

    private void j(int i10, float f10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f39467D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        float[] fArr = this.f39466C;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f39466C, i10, fArr2, i10 + 1, this.f39467D - i10);
            this.f39466C = fArr2;
        }
        this.f39466C[i10] = f10;
        this.f39467D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f39467D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f39467D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(B(i10, f10.floatValue()));
    }

    public float B(int i10, float f10) {
        c();
        r(i10);
        float[] fArr = this.f39466C;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        c();
        C2964y.a(collection);
        if (!(collection instanceof C2960u)) {
            return super.addAll(collection);
        }
        C2960u c2960u = (C2960u) collection;
        int i10 = c2960u.f39467D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f39467D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f39466C;
        if (i12 > fArr.length) {
            this.f39466C = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2960u.f39466C, 0, this.f39466C, this.f39467D, c2960u.f39467D);
        this.f39467D = i12;
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
        if (!(obj instanceof C2960u)) {
            return super.equals(obj);
        }
        C2960u c2960u = (C2960u) obj;
        if (this.f39467D != c2960u.f39467D) {
            return false;
        }
        float[] fArr = c2960u.f39466C;
        for (int i10 = 0; i10 < this.f39467D; i10++) {
            if (Float.floatToIntBits(this.f39466C[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        j(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        i(f10.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f39467D; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f39466C[i10]);
        }
        return iFloatToIntBits;
    }

    public void i(float f10) {
        c();
        int i10 = this.f39467D;
        float[] fArr = this.f39466C;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f39466C = fArr2;
        }
        float[] fArr3 = this.f39466C;
        int i11 = this.f39467D;
        this.f39467D = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f39466C[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f39466C;
        System.arraycopy(fArr, i11, fArr, i10, this.f39467D - i11);
        this.f39467D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39467D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(w(i10));
    }

    public float w(int i10) {
        r(i10);
        return this.f39466C[i10];
    }

    @Override // com.google.protobuf.C2964y.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2964y.f k2(int i10) {
        if (i10 >= this.f39467D) {
            return new C2960u(Arrays.copyOf(this.f39466C, i10), this.f39467D, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        c();
        r(i10);
        float[] fArr = this.f39466C;
        float f10 = fArr[i10];
        if (i10 < this.f39467D - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f39467D--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    private C2960u(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f39466C = fArr;
        this.f39467D = i10;
    }
}
