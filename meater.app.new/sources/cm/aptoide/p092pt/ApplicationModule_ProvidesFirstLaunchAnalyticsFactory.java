package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import com.google.android.gms.safetynet.SafetyNetClient;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFirstLaunchAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<GmsStatusValueProvider> gmsStatusValueProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;
    private final Provider<SafetyNetClient> safetyNetClientProvider;

    public ApplicationModule_ProvidesFirstLaunchAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<AnalyticsLogger> provider2, Provider<SafetyNetClient> provider3, Provider<GmsStatusValueProvider> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.loggerProvider = provider2;
        this.safetyNetClientProvider = provider3;
        this.gmsStatusValueProvider = provider4;
    }

    public static ApplicationModule_ProvidesFirstLaunchAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<AnalyticsLogger> provider2, Provider<SafetyNetClient> provider3, Provider<GmsStatusValueProvider> provider4) {
        return new ApplicationModule_ProvidesFirstLaunchAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static FirstLaunchAnalytics providesFirstLaunchAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, AnalyticsLogger analyticsLogger, SafetyNetClient safetyNetClient, GmsStatusValueProvider gmsStatusValueProvider) {
        return (FirstLaunchAnalytics) C9055b.m29112c(applicationModule.providesFirstLaunchAnalytics(analyticsManager, analyticsLogger, safetyNetClient, gmsStatusValueProvider));
    }

    @Override // javax.inject.Provider
    public FirstLaunchAnalytics get() {
        return providesFirstLaunchAnalytics(this.module, this.analyticsManagerProvider.get(), this.loggerProvider.get(), this.safetyNetClientProvider.get(), this.gmsStatusValueProvider.get());
    }
}
