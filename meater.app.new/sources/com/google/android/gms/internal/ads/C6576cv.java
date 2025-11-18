package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.cv */
/* loaded from: classes2.dex */
final class C6576cv extends AbstractC7388yt<Float> implements zzdoj<Float>, InterfaceC6688fw, RandomAccess {

    /* renamed from: g */
    private static final C6576cv f18471g;

    /* renamed from: h */
    private float[] f18472h;

    /* renamed from: i */
    private int f18473i;

    static {
        C6576cv c6576cv = new C6576cv(new float[0], 0);
        f18471g = c6576cv;
        c6576cv.mo16108x0();
    }

    C6576cv() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final void m14991f(int i2, float f2) {
        int i3;
        m16106c();
        if (i2 < 0 || i2 > (i3 = this.f18473i)) {
            throw new IndexOutOfBoundsException(m14993h(i2));
        }
        float[] fArr = this.f18472h;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f18472h, i2, fArr2, i2 + 1, this.f18473i - i2);
            this.f18472h = fArr2;
        }
        this.f18472h[i2] = f2;
        this.f18473i++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: g */
    private final void m14992g(int i2) {
        if (i2 < 0 || i2 >= this.f18473i) {
            throw new IndexOutOfBoundsException(m14993h(i2));
        }
    }

    /* renamed from: h */
    private final String m14993h(int i2) {
        int i3 = this.f18473i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: N */
    public final /* synthetic */ zzdoj<Float> mo14989N(int i2) {
        if (i2 >= this.f18473i) {
            return new C6576cv(Arrays.copyOf(this.f18472h, i2), this.f18473i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        m14991f(i2, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m16106c();
        zzdod.m19740a(collection);
        if (!(collection instanceof C6576cv)) {
            return super.addAll(collection);
        }
        C6576cv c6576cv = (C6576cv) collection;
        int i2 = c6576cv.f18473i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f18473i;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f18472h;
        if (i4 > fArr.length) {
            this.f18472h = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(c6576cv.f18472h, 0, this.f18472h, this.f18473i, c6576cv.f18473i);
        this.f18473i = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6576cv)) {
            return super.equals(obj);
        }
        C6576cv c6576cv = (C6576cv) obj;
        if (this.f18473i != c6576cv.f18473i) {
            return false;
        }
        float[] fArr = c6576cv.f18472h;
        for (int i2 = 0; i2 < this.f18473i; i2++) {
            if (Float.floatToIntBits(this.f18472h[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m14992g(i2);
        return Float.valueOf(this.f18472h[i2]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f18473i; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f18472h[i2]);
        }
        return iFloatToIntBits;
    }

    /* renamed from: i */
    public final void m14994i(float f2) {
        m14991f(this.f18473i, f2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7388yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m16106c();
        for (int i2 = 0; i2 < this.f18473i; i2++) {
            if (obj.equals(Float.valueOf(this.f18472h[i2]))) {
                float[] fArr = this.f18472h;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f18473i - i2) - 1);
                this.f18473i--;
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
        float[] fArr = this.f18472h;
        System.arraycopy(fArr, i3, fArr, i2, this.f18473i - i3);
        this.f18473i -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m16106c();
        m14992g(i2);
        float[] fArr = this.f18472h;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18473i;
    }

    private C6576cv(float[] fArr, int i2) {
        this.f18472h = fArr;
        this.f18473i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        m16106c();
        m14992g(i2);
        float[] fArr = this.f18472h;
        float f2 = fArr[i2];
        if (i2 < this.f18473i - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f18473i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }
}
