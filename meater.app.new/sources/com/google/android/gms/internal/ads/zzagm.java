package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

@zzard
/* loaded from: classes2.dex */
public final class zzagm extends zzafj {

    /* renamed from: f */
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener f22008f;

    public zzagm(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.f22008f = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    /* renamed from: D3 */
    public final void mo16514D3(zzaew zzaewVar) {
        this.f22008f.onAppInstallAdLoaded(new zzaez(zzaewVar));
    }
}
