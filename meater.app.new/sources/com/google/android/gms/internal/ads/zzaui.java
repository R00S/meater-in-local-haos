package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

@zzard
/* loaded from: classes2.dex */
public final class zzaui extends zzatx {

    /* renamed from: f */
    private final RewardedAdCallback f22521f;

    public zzaui(RewardedAdCallback rewardedAdCallback) {
        this.f22521f = rewardedAdCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: S1 */
    public final void mo16945S1() {
        RewardedAdCallback rewardedAdCallback = this.f22521f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: o1 */
    public final void mo16946o1() {
        RewardedAdCallback rewardedAdCallback = this.f22521f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: p6 */
    public final void mo16947p6(int i2) {
        RewardedAdCallback rewardedAdCallback = this.f22521f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    /* renamed from: v0 */
    public final void mo16948v0(zzatq zzatqVar) {
        RewardedAdCallback rewardedAdCallback = this.f22521f;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauh(zzatqVar));
        }
    }
}
