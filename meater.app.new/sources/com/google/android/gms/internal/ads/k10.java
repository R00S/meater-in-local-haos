package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes2.dex */
final class k10 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f19514a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f19515b;

    private k10(MediaCodec.CryptoInfo cryptoInfo) {
        this.f19514a = cryptoInfo;
        this.f19515b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m15388a(int i2, int i3) {
        this.f19515b.set(i2, i3);
        this.f19514a.setPattern(this.f19515b);
    }
}
