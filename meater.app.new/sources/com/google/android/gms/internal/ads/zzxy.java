package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

@zzard
/* loaded from: classes2.dex */
public final class zzxy extends zzzq {

    /* renamed from: f */
    private final AdMetadataListener f27401f;

    public zzxy(AdMetadataListener adMetadataListener) {
        this.f27401f = adMetadataListener;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final void onAdMetadataChanged() {
        AdMetadataListener adMetadataListener = this.f27401f;
        if (adMetadataListener != null) {
            adMetadataListener.onAdMetadataChanged();
        }
    }
}
