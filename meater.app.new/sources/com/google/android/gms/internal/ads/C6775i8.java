package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.i8 */
/* loaded from: classes2.dex */
final class C6775i8 implements zzgq {

    /* renamed from: a */
    private WeakReference<zzgq> f19296a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f19297b;

    private C6775i8(zzbdk zzbdkVar) {
        this.f19297b = zzbdkVar;
        this.f19296a = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: a */
    public final void mo14749a(MediaCodec.CryptoException cryptoException) {
        this.f19297b.m17496f("CryptoError", cryptoException.getMessage());
        zzgq zzgqVar = this.f19296a.get();
        if (zzgqVar != null) {
            zzgqVar.mo14749a(cryptoException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: c */
    public final void mo14750c(String str, long j2, long j3) {
        zzgq zzgqVar = this.f19296a.get();
        if (zzgqVar != null) {
            zzgqVar.mo14750c(str, j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: d */
    public final void mo14751d(zzgv zzgvVar) {
        this.f19297b.m17496f("DecoderInitializationError", zzgvVar.getMessage());
        zzgq zzgqVar = this.f19296a.get();
        if (zzgqVar != null) {
            zzgqVar.mo14751d(zzgvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    /* renamed from: f */
    public final void mo14752f(zzhu zzhuVar) {
        this.f19297b.m17496f("AudioTrackInitializationError", zzhuVar.getMessage());
        zzgq zzgqVar = this.f19296a.get();
        if (zzgqVar != null) {
            zzgqVar.mo14752f(zzhuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    /* renamed from: h */
    public final void mo14753h(zzhv zzhvVar) {
        this.f19297b.m17496f("AudioTrackWriteError", zzhvVar.getMessage());
        zzgq zzgqVar = this.f19296a.get();
        if (zzgqVar != null) {
            zzgqVar.mo14753h(zzhvVar);
        }
    }

    /* renamed from: i */
    public final void m15335i(zzgq zzgqVar) {
        this.f19296a = new WeakReference<>(zzgqVar);
    }
}
