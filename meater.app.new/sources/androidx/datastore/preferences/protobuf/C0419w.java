package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.w */
/* loaded from: classes.dex */
final class C0419w extends AbstractC0362c<Float> implements C0357a0.f, RandomAccess, InterfaceC0426z0 {

    /* renamed from: g */
    private static final C0419w f3011g;

    /* renamed from: h */
    private float[] f3012h;

    /* renamed from: i */
    private int f3013i;

    static {
        C0419w c0419w = new C0419w(new float[0], 0);
        f3011g = c0419w;
        c0419w.mo2569B();
    }

    C0419w() {
        this(new float[10], 0);
    }

    /* renamed from: i */
    private void m3313i(int i2, float f2) {
        int i3;
        m2583c();
        if (i2 < 0 || i2 > (i3 = this.f3013i)) {
            throw new IndexOutOfBoundsException(m3315r(i2));
        }
        float[] fArr = this.f3012h;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f3012h, i2, fArr2, i2 + 1, this.f3013i - i2);
            this.f3012h = fArr2;
        }
        this.f3012h[i2] = f2;
        this.f3013i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: n */
    private void m3314n(int i2) {
        if (i2 < 0 || i2 >= this.f3013i) {
            throw new IndexOutOfBoundsException(m3315r(i2));
        }
    }

    /* renamed from: r */
    private String m3315r(int i2) {
        return "Index:" + i2 + ", Size:" + this.f3013i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m2583c();
        C0357a0.m2556a(collection);
        if (!(collection instanceof C0419w)) {
            return super.addAll(collection);
        }
        C0419w c0419w = (C0419w) collection;
        int i2 = c0419w.f3013i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3013i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f3012h;
        if (i4 > fArr.length) {
            this.f3012h = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(c0419w.f3012h, 0, this.f3012h, this.f3013i, c0419w.f3013i);
        this.f3013i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0419w)) {
            return super.equals(obj);
        }
        C0419w c0419w = (C0419w) obj;
        if (this.f3013i != c0419w.f3013i) {
            return false;
        }
        float[] fArr = c0419w.f3012h;
        for (int i2 = 0; i2 < this.f3013i; i2++) {
            if (Float.floatToIntBits(this.f3012h[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i2, Float f2) {
        m3313i(i2, f2.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f2) {
        m3318h(f2.floatValue());
        return true;
    }

    /* renamed from: h */
    public void m3318h(float f2) {
        m2583c();
        int i2 = this.f3013i;
        float[] fArr = this.f3012h;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f3012h = fArr2;
        }
        float[] fArr3 = this.f3012h;
        int i3 = this.f3013i;
        this.f3013i = i3 + 1;
        fArr3[i3] = f2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f3013i; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f3012h[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float get(int i2) {
        return Float.valueOf(m3320q(i2));
    }

    /* renamed from: q */
    public float m3320q(int i2) {
        m3314n(i2);
        return this.f3012h[i2];
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        m2583c();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f3012h;
        System.arraycopy(fArr, i3, fArr, i2, this.f3013i - i3);
        this.f3013i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C0357a0.f mo2570J(int i2) {
        if (i2 >= this.f3013i) {
            return new C0419w(Arrays.copyOf(this.f3012h, i2), this.f3013i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3013i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float remove(int i2) {
        m2583c();
        m3314n(i2);
        float[] fArr = this.f3012h;
        float f2 = fArr[i2];
        if (i2 < this.f3013i - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f3013i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Float set(int i2, Float f2) {
        return Float.valueOf(m3324v(i2, f2.floatValue()));
    }

    /* renamed from: v */
    public float m3324v(int i2, float f2) {
        m2583c();
        m3314n(i2);
        float[] fArr = this.f3012h;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }

    private C0419w(float[] fArr, int i2) {
        this.f3012h = fArr;
        this.f3013i = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m2583c();
        for (int i2 = 0; i2 < this.f3013i; i2++) {
            if (obj.equals(Float.valueOf(this.f3012h[i2]))) {
                float[] fArr = this.f3012h;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f3013i - i2) - 1);
                this.f3013i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
