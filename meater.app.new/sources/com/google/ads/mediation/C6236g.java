package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* renamed from: com.google.ads.mediation.g */
/* loaded from: classes2.dex */
final class C6236g extends AdMetadataListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f16576a;

    C6236g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f16576a = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        if (this.f16576a.zzmh == null || this.f16576a.zzmi == null) {
            return;
        }
        this.f16576a.zzmi.zzb(this.f16576a.zzmh.getAdMetadata());
    }
}
