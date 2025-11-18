package cm.aptoide.p092pt;

import cm.aptoide.p092pt.ads.MoPubAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesMoPubAnalyticsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMoPubAnalyticsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMoPubAnalyticsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMoPubAnalyticsFactory(applicationModule);
    }

    public static MoPubAnalytics providesMoPubAnalytics(ApplicationModule applicationModule) {
        return (MoPubAnalytics) C9055b.m29112c(applicationModule.providesMoPubAnalytics());
    }

    @Override // javax.inject.Provider
    public MoPubAnalytics get() {
        return providesMoPubAnalytics(this.module);
    }
}
