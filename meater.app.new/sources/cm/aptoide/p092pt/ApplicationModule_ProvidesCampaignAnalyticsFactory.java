package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.app.CampaignAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesCampaignAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCampaignAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesCampaignAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvidesCampaignAnalyticsFactory(applicationModule, provider);
    }

    public static CampaignAnalytics providesCampaignAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        return (CampaignAnalytics) C9055b.m29112c(applicationModule.providesCampaignAnalytics(analyticsManager));
    }

    @Override // javax.inject.Provider
    public CampaignAnalytics get() {
        return providesCampaignAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
