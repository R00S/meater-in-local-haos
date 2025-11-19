package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2079z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2075v extends AbstractC2057c<Float> implements C2079z.f, RandomAccess, Z {

    /* renamed from: E, reason: collision with root package name */
    private static final C2075v f25159E;

    /* renamed from: C, reason: collision with root package name */
    private float[] f25160C;

    /* renamed from: D, reason: collision with root package name */
    private int f25161D;

    static {
        C2075v c2075v = new C2075v(new float[0], 0);
        f25159E = c2075v;
        c2075v.n();
    }

    C2075v() {
        this(new float[10], 0);
    }

    private void j(int i10, float f10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f25161D)) {
            throw new IndexOutOfBoundsException(x(i10));
        }
        float[] fArr = this.f25160C;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f25160C, i10, fArr2, i10 + 1, this.f25161D - i10);
            this.f25160C = fArr2;
        }
        this.f25160C[i10] = f10;
        this.f25161D++;
        ((AbstractList) this).modCount++;
    }

    private void r(int i10) {
        if (i10 < 0 || i10 >= this.f25161D) {
            throw new IndexOutOfBoundsException(x(i10));
        }
    }

    private String x(int i10) {
        return "Index:" + i10 + ", Size:" + this.f25161D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(B(i10, f10.floatValue()));
    }

    public float B(int i10, float f10) {
        c();
        r(i10);
        float[] fArr = this.f25160C;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        c();
        C2079z.a(collection);
        if (!(collection instanceof C2075v)) {
            return super.addAll(collection);
        }
        C2075v c2075v = (C2075v) collection;
        int i10 = c2075v.f25161D;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25161D;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f25160C;
        if (i12 > fArr.length) {
            this.f25160C = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2075v.f25160C, 0, this.f25160C, this.f25161D, c2075v.f25161D);
        this.f25161D = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2075v)) {
            return super.equals(obj);
        }
        C2075v c2075v = (C2075v) obj;
        if (this.f25161D != c2075v.f25161D) {
            return false;
        }
        float[] fArr = c2075v.f25160C;
        for (int i10 = 0; i10 < this.f25161D; i10++) {
            if (Float.floatToIntBits(this.f25160C[i10]) != Float.floatToIntBits(fArr[i10])) {
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

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        i(f10.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f25161D; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f25160C[i10]);
        }
        return iFloatToIntBits;
    }

    public void i(float f10) {
        c();
        int i10 = this.f25161D;
        float[] fArr = this.f25160C;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f25160C = fArr2;
        }
        float[] fArr3 = this.f25160C;
        int i11 = this.f25161D;
        this.f25161D = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f25160C;
        System.arraycopy(fArr, i11, fArr, i10, this.f25161D - i11);
        this.f25161D -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f25161D;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(w(i10));
    }

    public float w(int i10) {
        r(i10);
        return this.f25160C[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C2079z.f k(int i10) {
        if (i10 >= this.f25161D) {
            return new C2075v(Arrays.copyOf(this.f25160C, i10), this.f25161D);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        c();
        r(i10);
        float[] fArr = this.f25160C;
        float f10 = fArr[i10];
        if (i10 < this.f25161D - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f25161D--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    private C2075v(float[] fArr, int i10) {
        this.f25160C = fArr;
        this.f25161D = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f25161D; i10++) {
            if (obj.equals(Float.valueOf(this.f25160C[i10]))) {
                float[] fArr = this.f25160C;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f25161D - i10) - 1);
                this.f25161D--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
