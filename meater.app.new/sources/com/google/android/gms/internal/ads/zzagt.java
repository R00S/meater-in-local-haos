package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes2.dex */
public final class zzagt extends zzage {

    /* renamed from: f */
    private final UnifiedNativeAd.UnconfirmedClickListener f22014f;

    public zzagt(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f22014f = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void onUnconfirmedClickCancelled() {
        this.f22014f.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void onUnconfirmedClickReceived(String str) {
        this.f22014f.onUnconfirmedClickReceived(str);
    }
}
