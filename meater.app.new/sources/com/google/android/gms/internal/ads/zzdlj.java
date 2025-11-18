package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdlj {

    /* renamed from: a */
    private final byte[] f25647a;

    private zzdlj(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.f25647a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    /* renamed from: b */
    public static zzdlj m19571b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new zzdlj(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] m19572a() {
        byte[] bArr = this.f25647a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
