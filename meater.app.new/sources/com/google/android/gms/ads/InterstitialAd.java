package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabd;
import com.google.android.gms.internal.ads.zzxr;

/* loaded from: classes2.dex */
public final class InterstitialAd {
    private final zzabd zzaas;

    public InterstitialAd(Context context) {
        this.zzaas = new zzabd(context);
        Preconditions.m14373l(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzaas.m16295a();
    }

    public final Bundle getAdMetadata() {
        return this.zzaas.m16296b();
    }

    public final String getAdUnitId() {
        return this.zzaas.m16297c();
    }

    public final String getMediationAdapterClassName() {
        return this.zzaas.m16299e();
    }

    public final boolean isLoaded() {
        return this.zzaas.m16301g();
    }

    public final boolean isLoading() {
        return this.zzaas.m16302h();
    }

    public final void loadAd(AdRequest adRequest) {
        this.zzaas.m16312r(adRequest.zzde());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAdListener(AdListener adListener) {
        this.zzaas.m16303i(adListener);
        if (adListener != 0 && (adListener instanceof zzxr)) {
            this.zzaas.m16313s((zzxr) adListener);
        } else if (adListener == 0) {
            this.zzaas.m16313s(null);
        }
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        this.zzaas.m16304j(adMetadataListener);
    }

    public final void setAdUnitId(String str) {
        this.zzaas.m16305k(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzaas.m16308n(z);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzaas.m16310p(rewardedVideoAdListener);
    }

    public final void show() {
        this.zzaas.m16311q();
    }

    public final void zzc(boolean z) {
        this.zzaas.m16314t(true);
    }
}
