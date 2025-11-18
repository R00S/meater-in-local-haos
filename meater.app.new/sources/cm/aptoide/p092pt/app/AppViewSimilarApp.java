package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.view.app.Application;

/* loaded from: classes.dex */
public class AppViewSimilarApp {

    /* renamed from: ad */
    private ApplicationAd f7568ad;
    private Application app;

    public AppViewSimilarApp(Application application, ApplicationAd applicationAd) {
        this.app = application;
        this.f7568ad = applicationAd;
    }

    public ApplicationAd getAd() {
        return this.f7568ad;
    }

    public Application getApp() {
        return this.app;
    }

    public int getNetworkAdType() {
        ApplicationAd applicationAd = this.f7568ad;
        if (applicationAd == null) {
            return 0;
        }
        return applicationAd.getNetwork().ordinal();
    }

    public boolean isAd() {
        return this.app == null && this.f7568ad != null;
    }
}
