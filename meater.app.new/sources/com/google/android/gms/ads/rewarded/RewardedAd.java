package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaug;

/* loaded from: classes2.dex */
public final class RewardedAd {
    private final zzaug zzgnu;

    public RewardedAd(Context context, String str) {
        Preconditions.m14373l(context, "context cannot be null");
        Preconditions.m14373l(str, "adUnitID cannot be null");
        this.zzgnu = new zzaug(context, str);
    }

    public final Bundle getAdMetadata() {
        return this.zzgnu.m16953a();
    }

    public final String getMediationAdapterClassName() {
        return this.zzgnu.m16954b();
    }

    public final RewardItem getRewardItem() {
        return this.zzgnu.m16955c();
    }

    public final boolean isLoaded() {
        return this.zzgnu.m16956d();
    }

    public final void loadAd(AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzgnu.m16961i(adRequest.zzde(), rewardedAdLoadCallback);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzgnu.m16957e(onAdMetadataChangedListener);
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.zzgnu.m16958f(serverSideVerificationOptions);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        this.zzgnu.m16959g(activity, rewardedAdCallback);
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzgnu.m16961i(publisherAdRequest.zzde(), rewardedAdLoadCallback);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        this.zzgnu.m16960h(activity, rewardedAdCallback, z);
    }
}
