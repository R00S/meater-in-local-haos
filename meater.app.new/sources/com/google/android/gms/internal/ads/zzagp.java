package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzard
/* loaded from: classes2.dex */
public final class zzagp extends zzafs {

    /* renamed from: f */
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener f22011f;

    public zzagp(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.f22011f = onCustomTemplateAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    /* renamed from: M4 */
    public final void mo16520M4(zzafe zzafeVar) {
        this.f22011f.onCustomTemplateAdLoaded(zzafh.m16512a(zzafeVar));
    }
}
