package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2459d4 extends C2484g4 {

    /* renamed from: F, reason: collision with root package name */
    private final int f34072F;

    /* renamed from: G, reason: collision with root package name */
    private final int f34073G;

    C2459d4(byte[] bArr, int i10, int i11) {
        super(bArr);
        Y3.i(i10, i10 + i11, bArr.length);
        this.f34072F = i10;
        this.f34073G = i11;
    }

    @Override // com.google.android.gms.internal.measurement.C2484g4
    protected final int E() {
        return this.f34072F;
    }

    @Override // com.google.android.gms.internal.measurement.C2484g4, com.google.android.gms.internal.measurement.Y3
    public final byte c(int i10) {
        int iZ = z();
        if (((iZ - (i10 + 1)) | i10) >= 0) {
            return this.f34121E[this.f34072F + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + iZ);
    }

    @Override // com.google.android.gms.internal.measurement.C2484g4, com.google.android.gms.internal.measurement.Y3
    final byte y(int i10) {
        return this.f34121E[this.f34072F + i10];
    }

    @Override // com.google.android.gms.internal.measurement.C2484g4, com.google.android.gms.internal.measurement.Y3
    public final int z() {
        return this.f34073G;
    }
}
