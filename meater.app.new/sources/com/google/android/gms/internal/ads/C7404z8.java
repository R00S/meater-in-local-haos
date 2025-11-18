package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.z8 */
/* loaded from: classes2.dex */
final class C7404z8 implements zzhh {

    /* renamed from: a */
    private final /* synthetic */ zzbdq f21374a;

    C7404z8(zzbdq zzbdqVar) {
        this.f21374a = zzbdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: a */
    public final void mo14749a(MediaCodec.CryptoException cryptoException) {
        this.f21374a.m17514L("CryptoError", cryptoException.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: b */
    public final void mo15393b(int i2, long j2) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dropped frames. Count: ");
        sb.append(i2);
        sb.append(" Elapsed: ");
        sb.append(j2);
        zzbad.m17349e(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: c */
    public final void mo14750c(String str, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: d */
    public final void mo14751d(zzgv zzgvVar) {
        this.f21374a.m17514L("DecoderInitializationError", zzgvVar.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: e */
    public final void mo15394e(int i2, int i3, float f2) {
        this.f21374a.f22883B = i2;
        this.f21374a.f22884C = i3;
        this.f21374a.f22885D = f2;
        zzbdq zzbdqVar = this.f21374a;
        zzbdqVar.m17507A(zzbdqVar.f22883B, this.f21374a.f22884C, this.f21374a.f22885D);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: g */
    public final void mo15395g(Surface surface) {
    }
}
