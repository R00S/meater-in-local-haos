package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* renamed from: com.google.ads.mediation.f */
/* loaded from: classes2.dex */
final class C6235f implements RewardedVideoAdListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f16575a;

    C6235f(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f16575a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewarded(RewardItem rewardItem) {
        this.f16575a.zzmi.onRewarded(this.f16575a, rewardItem);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdClosed() {
        this.f16575a.zzmi.onAdClosed(this.f16575a);
        AbstractAdViewAdapter.zza(this.f16575a, (InterstitialAd) null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdFailedToLoad(int i2) {
        this.f16575a.zzmi.onAdFailedToLoad(this.f16575a, i2);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLeftApplication() {
        this.f16575a.zzmi.onAdLeftApplication(this.f16575a);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdLoaded() {
        this.f16575a.zzmi.onAdLoaded(this.f16575a);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoAdOpened() {
        this.f16575a.zzmi.onAdOpened(this.f16575a);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f16575a.zzmi.onVideoCompleted(this.f16575a);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public final void onRewardedVideoStarted() {
        this.f16575a.zzmi.onVideoStarted(this.f16575a);
    }
}
