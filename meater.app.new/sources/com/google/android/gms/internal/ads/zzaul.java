package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

@zzard
/* loaded from: classes2.dex */
public final class zzaul extends zzauc {

    /* renamed from: f */
    private final RewardedAdLoadCallback f22522f;

    public zzaul(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.f22522f = rewardedAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    /* renamed from: R4 */
    public final void mo16950R4(int i2) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f22522f;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    /* renamed from: n1 */
    public final void mo16951n1() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f22522f;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }
}
