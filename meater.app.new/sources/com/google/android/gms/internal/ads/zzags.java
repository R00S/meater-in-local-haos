package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

@zzard
/* loaded from: classes2.dex */
public final class zzags extends zzafy {

    /* renamed from: f */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f22013f;

    public zzags(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f22013f = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    /* renamed from: u6 */
    public final void mo16524u6(zzagg zzaggVar) {
        this.f22013f.onUnifiedNativeAdLoaded(new zzagj(zzaggVar));
    }
}
