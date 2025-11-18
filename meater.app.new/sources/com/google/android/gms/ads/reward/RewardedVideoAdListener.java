package com.google.android.gms.ads.reward;

/* loaded from: classes2.dex */
public interface RewardedVideoAdListener {
    void onRewarded(RewardItem rewardItem);

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdFailedToLoad(int i2);

    void onRewardedVideoAdLeftApplication();

    void onRewardedVideoAdLoaded();

    void onRewardedVideoAdOpened();

    void onRewardedVideoCompleted();

    void onRewardedVideoStarted();
}
