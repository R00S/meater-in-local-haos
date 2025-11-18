package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaExtractor;

/* loaded from: classes2.dex */
public final class zzgb {

    /* renamed from: a */
    public byte[] f26107a;

    /* renamed from: b */
    private byte[] f26108b;

    /* renamed from: c */
    private int f26109c;

    /* renamed from: d */
    public int[] f26110d;

    /* renamed from: e */
    public int[] f26111e;

    /* renamed from: f */
    private int f26112f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f26113g;

    public zzgb() {
        this.f26113g = zzkq.f26428a >= 16 ? new MediaCodec.CryptoInfo() : null;
    }

    /* renamed from: a */
    public final void m19963a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f26112f = i2;
        this.f26110d = iArr;
        this.f26111e = iArr2;
        this.f26108b = bArr;
        this.f26107a = bArr2;
        this.f26109c = 1;
        if (zzkq.f26428a >= 16) {
            this.f26113g.set(i2, iArr, iArr2, bArr, bArr2, 1);
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    public final void m19964b(MediaExtractor mediaExtractor) {
        mediaExtractor.getSampleCryptoInfo(this.f26113g);
        MediaCodec.CryptoInfo cryptoInfo = this.f26113g;
        this.f26112f = cryptoInfo.numSubSamples;
        this.f26110d = cryptoInfo.numBytesOfClearData;
        this.f26111e = cryptoInfo.numBytesOfEncryptedData;
        this.f26108b = cryptoInfo.key;
        this.f26107a = cryptoInfo.iv;
        this.f26109c = cryptoInfo.mode;
    }

    @TargetApi(16)
    /* renamed from: c */
    public final MediaCodec.CryptoInfo m19965c() {
        return this.f26113g;
    }
}
