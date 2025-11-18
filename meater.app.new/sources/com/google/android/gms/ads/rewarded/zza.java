package com.google.android.gms.ads.rewarded;

import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class zza implements RewardItem {
    zza() {
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
