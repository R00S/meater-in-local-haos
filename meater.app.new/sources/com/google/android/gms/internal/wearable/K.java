package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class K extends N {

    /* renamed from: E, reason: collision with root package name */
    private final int f34497E;

    K(byte[] bArr, int i10, int i11) {
        super(bArr);
        P.v(0, i11, bArr.length);
        this.f34497E = i11;
    }

    @Override // com.google.android.gms.internal.wearable.N, com.google.android.gms.internal.wearable.P
    public final byte c(int i10) {
        int i11 = this.f34497E;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f34500D[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.wearable.N, com.google.android.gms.internal.wearable.P
    final byte f(int i10) {
        return this.f34500D[i10];
    }

    @Override // com.google.android.gms.internal.wearable.N, com.google.android.gms.internal.wearable.P
    public final int h() {
        return this.f34497E;
    }

    @Override // com.google.android.gms.internal.wearable.N
    protected final int y() {
        return 0;
    }
}
