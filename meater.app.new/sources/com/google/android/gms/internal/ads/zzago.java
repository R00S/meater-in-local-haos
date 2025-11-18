package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzard
/* loaded from: classes2.dex */
public final class zzago extends zzafp {

    /* renamed from: f */
    private final NativeCustomTemplateAd.OnCustomClickListener f22010f;

    public zzago(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.f22010f = onCustomClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafo
    /* renamed from: F0 */
    public final void mo16518F0(zzafe zzafeVar, String str) {
        this.f22010f.onCustomClick(zzafh.m16512a(zzafeVar), str);
    }
}
