package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdmh {

    /* renamed from: a */
    private final byte[] f25657a = new byte[256];

    /* renamed from: b */
    private int f25658b;

    /* renamed from: c */
    private int f25659c;

    public zzdmh(byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.f25657a[i2] = (byte) i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.f25657a;
            i3 = (i3 + bArr2[i4] + bArr[i4 % bArr.length]) & 255;
            byte b2 = bArr2[i4];
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b2;
        }
        this.f25658b = 0;
        this.f25659c = 0;
    }

    /* renamed from: a */
    public final void m19583a(byte[] bArr) {
        int i2 = this.f25658b;
        int i3 = this.f25659c;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            i2 = (i2 + 1) & 255;
            byte[] bArr2 = this.f25657a;
            i3 = (i3 + bArr2[i2]) & 255;
            byte b2 = bArr2[i2];
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b2;
            bArr[i4] = (byte) (bArr2[(bArr2[i2] + bArr2[i3]) & 255] ^ bArr[i4]);
        }
        this.f25658b = i2;
        this.f25659c = i3;
    }
}
