package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.PageViewsAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidePageViewsAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidePageViewsAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvidePageViewsAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvidePageViewsAnalyticsFactory(applicationModule, provider);
    }

    public static PageViewsAnalytics providePageViewsAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        return (PageViewsAnalytics) C9055b.m29112c(applicationModule.providePageViewsAnalytics(analyticsManager));
    }

    @Override // javax.inject.Provider
    public PageViewsAnalytics get() {
        return providePageViewsAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
