package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class zzmz {

    /* renamed from: a */
    public byte[] f26607a;

    /* renamed from: b */
    private byte[] f26608b;

    /* renamed from: c */
    private int f26609c;

    /* renamed from: d */
    public int[] f26610d;

    /* renamed from: e */
    public int[] f26611e;

    /* renamed from: f */
    private int f26612f;

    /* renamed from: g */
    private int f26613g;

    /* renamed from: h */
    private int f26614h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f26615i;

    /* renamed from: j */
    private final k10 f26616j;

    public zzmz() {
        int i2 = zzsy.f27024a;
        MediaCodec.CryptoInfo cryptoInfo = i2 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f26615i = cryptoInfo;
        this.f26616j = i2 >= 24 ? new k10(cryptoInfo) : null;
    }

    /* renamed from: a */
    public final void m20299a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f26612f = i2;
        this.f26610d = iArr;
        this.f26611e = iArr2;
        this.f26608b = bArr;
        this.f26607a = bArr2;
        this.f26609c = i3;
        this.f26613g = 0;
        this.f26614h = 0;
        int i4 = zzsy.f27024a;
        if (i4 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f26615i;
            cryptoInfo.numSubSamples = i2;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i3;
            if (i4 >= 24) {
                this.f26616j.m15388a(0, 0);
            }
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    public final MediaCodec.CryptoInfo m20300b() {
        return this.f26615i;
    }
}
