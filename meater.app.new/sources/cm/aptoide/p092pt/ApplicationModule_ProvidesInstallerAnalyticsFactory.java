package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallerAnalytics;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesInstallerAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesInstallerAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<InstallAnalytics> provider2, Provider<SharedPreferences> provider3, Provider<RootAvailabilityManager> provider4, Provider<NavigationTracker> provider5) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.installAnalyticsProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.rootAvailabilityManagerProvider = provider4;
        this.navigationTrackerProvider = provider5;
    }

    public static ApplicationModule_ProvidesInstallerAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<InstallAnalytics> provider2, Provider<SharedPreferences> provider3, Provider<RootAvailabilityManager> provider4, Provider<NavigationTracker> provider5) {
        return new ApplicationModule_ProvidesInstallerAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static InstallerAnalytics providesInstallerAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, InstallAnalytics installAnalytics, SharedPreferences sharedPreferences, RootAvailabilityManager rootAvailabilityManager, NavigationTracker navigationTracker) {
        return (InstallerAnalytics) C9055b.m29112c(applicationModule.providesInstallerAnalytics(analyticsManager, installAnalytics, sharedPreferences, rootAvailabilityManager, navigationTracker));
    }

    @Override // javax.inject.Provider
    public InstallerAnalytics get() {
        return providesInstallerAnalytics(this.module, this.analyticsManagerProvider.get(), this.installAnalyticsProvider.get(), this.sharedPreferencesProvider.get(), this.rootAvailabilityManagerProvider.get(), this.navigationTrackerProvider.get());
    }
}
