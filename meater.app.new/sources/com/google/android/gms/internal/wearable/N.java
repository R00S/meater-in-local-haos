package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
class N extends M {

    /* renamed from: D, reason: collision with root package name */
    protected final byte[] f34500D;

    N(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f34500D = bArr;
    }

    @Override // com.google.android.gms.internal.wearable.P
    public byte c(int i10) {
        return this.f34500D[i10];
    }

    @Override // com.google.android.gms.internal.wearable.P
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P) || h() != ((P) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof N)) {
            return obj.equals(this);
        }
        N n10 = (N) obj;
        int iW = w();
        int iW2 = n10.w();
        if (iW != 0 && iW2 != 0 && iW != iW2) {
            return false;
        }
        int iH = h();
        if (iH > n10.h()) {
            throw new IllegalArgumentException("Length too large: " + iH + h());
        }
        if (iH > n10.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iH + ", " + n10.h());
        }
        byte[] bArr = this.f34500D;
        byte[] bArr2 = n10.f34500D;
        n10.y();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iH) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.wearable.P
    byte f(int i10) {
        return this.f34500D[i10];
    }

    @Override // com.google.android.gms.internal.wearable.P
    public int h() {
        return this.f34500D.length;
    }

    @Override // com.google.android.gms.internal.wearable.P
    protected final int i(int i10, int i11, int i12) {
        return C2689r0.b(i10, this.f34500D, 0, i12);
    }

    @Override // com.google.android.gms.internal.wearable.P
    public final P j(int i10, int i11) {
        int iV = P.v(0, i11, h());
        return iV == 0 ? P.f34503C : new K(this.f34500D, 0, iV);
    }

    @Override // com.google.android.gms.internal.wearable.P
    final void r(H h10) {
        ((U) h10).C(this.f34500D, 0, h());
    }

    protected int y() {
        return 0;
    }
}
