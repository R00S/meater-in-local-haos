package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAptoideApplicationAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoideApplicationAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<FirebaseAnalytics> provider2) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.firebaseAnalyticsProvider = provider2;
    }

    public static ApplicationModule_ProvideAptoideApplicationAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<FirebaseAnalytics> provider2) {
        return new ApplicationModule_ProvideAptoideApplicationAnalyticsFactory(applicationModule, provider, provider2);
    }

    public static AptoideApplicationAnalytics provideAptoideApplicationAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, FirebaseAnalytics firebaseAnalytics) {
        return (AptoideApplicationAnalytics) C9055b.m29112c(applicationModule.provideAptoideApplicationAnalytics(analyticsManager, firebaseAnalytics));
    }

    @Override // javax.inject.Provider
    public AptoideApplicationAnalytics get() {
        return provideAptoideApplicationAnalytics(this.module, this.analyticsManagerProvider.get(), this.firebaseAnalyticsProvider.get());
    }
}
