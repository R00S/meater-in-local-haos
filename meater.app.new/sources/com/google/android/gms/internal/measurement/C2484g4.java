package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2484g4 extends AbstractC2492h4 {

    /* renamed from: E, reason: collision with root package name */
    protected final byte[] f34121E;

    C2484g4(byte[] bArr) {
        super();
        bArr.getClass();
        this.f34121E = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    protected final int A(int i10, int i11, int i12) {
        return I4.a(i10, this.f34121E, E(), i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2492h4
    final boolean D(Y3 y32, int i10, int i11) {
        if (i11 > y32.z()) {
            throw new IllegalArgumentException("Length too large: " + i11 + z());
        }
        if (i11 > y32.z()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + y32.z());
        }
        if (!(y32 instanceof C2484g4)) {
            return y32.j(0, i11).equals(j(0, i11));
        }
        C2484g4 c2484g4 = (C2484g4) y32;
        byte[] bArr = this.f34121E;
        byte[] bArr2 = c2484g4.f34121E;
        int iE = E() + i11;
        int iE2 = E();
        int iE3 = c2484g4.E();
        while (iE2 < iE) {
            if (bArr[iE2] != bArr2[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    protected int E() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public byte c(int i10) {
        return this.f34121E[i10];
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y3) || z() != ((Y3) obj).z()) {
            return false;
        }
        if (z() == 0) {
            return true;
        }
        if (!(obj instanceof C2484g4)) {
            return obj.equals(this);
        }
        C2484g4 c2484g4 = (C2484g4) obj;
        int iF = f();
        int iF2 = c2484g4.f();
        if (iF == 0 || iF2 == 0 || iF == iF2) {
            return D(c2484g4, 0, z());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Y3 j(int i10, int i11) {
        int i12 = Y3.i(0, i11, z());
        return i12 == 0 ? Y3.f33948C : new C2459d4(this.f34121E, E(), i12);
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    final void x(V3 v32) {
        v32.a(this.f34121E, E(), z());
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    byte y(int i10) {
        return this.f34121E[i10];
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public int z() {
        return this.f34121E.length;
    }
}
