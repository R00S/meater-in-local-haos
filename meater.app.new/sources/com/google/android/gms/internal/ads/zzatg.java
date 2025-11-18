package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

@zzard
/* loaded from: classes2.dex */
public final class zzatg extends zzatc {

    /* renamed from: f */
    private RewardedVideoAdListener f22506f;

    public zzatg(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f22506f = rewardedVideoAdListener;
    }

    /* renamed from: i7 */
    public final RewardedVideoAdListener m16938i7() {
        return this.f22506f;
    }

    /* renamed from: j7 */
    public final void m16939j7(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f22506f = rewardedVideoAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    /* renamed from: l1 */
    public final void mo16935l1(zzasr zzasrVar) {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewarded(new zzate(zzasrVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdClosed() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdFailedToLoad(int i2) {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdFailedToLoad(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdLeftApplication() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdLoaded() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdOpened() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoCompleted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoStarted() {
        RewardedVideoAdListener rewardedVideoAdListener = this.f22506f;
        if (rewardedVideoAdListener != null) {
            rewardedVideoAdListener.onRewardedVideoStarted();
        }
    }
}
