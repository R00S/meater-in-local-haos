package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.ads.data.ApplicationAdError;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.view.app.AppsList;

/* loaded from: classes.dex */
public class MinimalAdRequestResult implements ApplicationAdResult {
    private final AppsList.Error error;
    private final MinimalAd minimalAd;

    public MinimalAdRequestResult(MinimalAd minimalAd) {
        this.minimalAd = minimalAd;
        this.error = null;
    }

    @Override // cm.aptoide.p092pt.app.ApplicationAdResult
    public ApplicationAd getAd() {
        MinimalAd minimalAd = this.minimalAd;
        if (minimalAd == null) {
            return null;
        }
        return new AptoideNativeAd(minimalAd);
    }

    @Override // cm.aptoide.p092pt.app.ApplicationAdResult
    public ApplicationAdError getError() {
        AppsList.Error error = this.error;
        if (error == null) {
            return null;
        }
        return new ApplicationAdError(error);
    }

    public MinimalAd getMinimalAd() {
        return this.minimalAd;
    }

    public MinimalAdRequestResult(AppsList.Error error) {
        this.minimalAd = null;
        this.error = error;
    }
}
