package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFirebaseNotificationAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideFirebaseNotificationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvideFirebaseNotificationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvideFirebaseNotificationAnalyticsFactory(applicationModule, provider);
    }

    public static FirebaseNotificationAnalytics provideFirebaseNotificationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        return (FirebaseNotificationAnalytics) C9055b.m29112c(applicationModule.provideFirebaseNotificationAnalytics(analyticsManager));
    }

    @Override // javax.inject.Provider
    public FirebaseNotificationAnalytics get() {
        return provideFirebaseNotificationAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
