package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

@zzard
/* loaded from: classes2.dex */
public final class zzagn extends zzafm {

    /* renamed from: f */
    private final NativeContentAd.OnContentAdLoadedListener f22009f;

    public zzagn(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.f22009f = onContentAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    /* renamed from: t2 */
    public final void mo16516t2(zzafa zzafaVar) {
        this.f22009f.onContentAdLoaded(new zzafd(zzafaVar));
    }
}
