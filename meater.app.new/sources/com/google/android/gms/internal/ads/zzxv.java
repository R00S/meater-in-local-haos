package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzard
/* loaded from: classes2.dex */
public final class zzxv extends zzza {

    /* renamed from: f */
    private final AdListener f27400f;

    public zzxv(AdListener adListener) {
        this.f27400f = adListener;
    }

    /* renamed from: h7 */
    public final AdListener m20814h7() {
        return this.f27400f;
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClicked() {
        this.f27400f.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClosed() {
        this.f27400f.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdFailedToLoad(int i2) {
        this.f27400f.onAdFailedToLoad(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdImpression() {
        this.f27400f.onAdImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLeftApplication() {
        this.f27400f.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLoaded() {
        this.f27400f.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdOpened() {
        this.f27400f.onAdOpened();
    }
}
