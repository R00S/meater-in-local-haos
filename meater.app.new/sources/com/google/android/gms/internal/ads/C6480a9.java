package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.a9 */
/* loaded from: classes2.dex */
final class C6480a9 implements zzgq {

    /* renamed from: a */
    private final /* synthetic */ zzbdq f18096a;

    C6480a9(zzbdq zzbdqVar) {
        this.f18096a = zzbdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: a */
    public final void mo14749a(MediaCodec.CryptoException cryptoException) {
        this.f18096a.m17514L("CryptoError", cryptoException.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: c */
    public final void mo14750c(String str, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: d */
    public final void mo14751d(zzgv zzgvVar) {
        this.f18096a.m17514L("DecoderInitializationError", zzgvVar.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    /* renamed from: f */
    public final void mo14752f(zzhu zzhuVar) {
        this.f18096a.m17514L("AudioTrackInitializationError", zzhuVar.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    /* renamed from: h */
    public final void mo14753h(zzhv zzhvVar) {
        this.f18096a.m17514L("AudioTrackWriteError", zzhvVar.getMessage());
    }
}
