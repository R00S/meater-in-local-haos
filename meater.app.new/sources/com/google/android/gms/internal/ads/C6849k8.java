package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.k8 */
/* loaded from: classes2.dex */
final class C6849k8 implements zzhh {

    /* renamed from: a */
    private WeakReference<zzhh> f19524a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f19525b;

    private C6849k8(zzbdk zzbdkVar) {
        this.f19525b = zzbdkVar;
        this.f19524a = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: a */
    public final void mo14749a(MediaCodec.CryptoException cryptoException) {
        this.f19525b.m17496f("CryptoError", cryptoException.getMessage());
        zzhh zzhhVar = this.f19524a.get();
        if (zzhhVar != null) {
            zzhhVar.mo14749a(cryptoException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: b */
    public final void mo15393b(int i2, long j2) {
        zzhh zzhhVar = this.f19524a.get();
        if (zzhhVar != null) {
            zzhhVar.mo15393b(i2, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: c */
    public final void mo14750c(String str, long j2, long j3) {
        zzhh zzhhVar = this.f19524a.get();
        if (zzhhVar != null) {
            zzhhVar.mo14750c(str, j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    /* renamed from: d */
    public final void mo14751d(zzgv zzgvVar) {
        this.f19525b.m17496f("DecoderInitializationError", zzgvVar.getMessage());
        zzhh zzhhVar = this.f19524a.get();
        if (zzhhVar != null) {
            zzhhVar.mo14751d(zzgvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: e */
    public final void mo15394e(int i2, int i3, float f2) {
        zzhh zzhhVar = this.f19524a.get();
        if (zzhhVar != null) {
            zzhhVar.mo15394e(i2, i3, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    /* renamed from: g */
    public final void mo15395g(Surface surface) {
        zzhh zzhhVar = this.f19524a.get();
        if (zzhhVar != null) {
            zzhhVar.mo15395g(surface);
        }
    }

    /* renamed from: i */
    public final void m15396i(zzhh zzhhVar) {
        this.f19524a = new WeakReference<>(zzhhVar);
    }
}
