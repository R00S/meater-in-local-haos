package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabd;

/* loaded from: classes2.dex */
public final class PublisherInterstitialAd {
    private final zzabd zzaas;

    public PublisherInterstitialAd(Context context) {
        this.zzaas = new zzabd(context, this);
        Preconditions.m14373l(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzaas.m16295a();
    }

    public final String getAdUnitId() {
        return this.zzaas.m16297c();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzaas.m16298d();
    }

    public final String getMediationAdapterClassName() {
        return this.zzaas.m16299e();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzaas.m16300f();
    }

    public final boolean isLoaded() {
        return this.zzaas.m16301g();
    }

    public final boolean isLoading() {
        return this.zzaas.m16302h();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzaas.m16312r(publisherAdRequest.zzde());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzaas.m16303i(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzaas.m16305k(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzaas.m16306l(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzaas.m16307m(correlator);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzaas.m16308n(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzaas.m16309o(onCustomRenderedAdLoadedListener);
    }

    public final void show() {
        this.zzaas.m16311q();
    }
}
