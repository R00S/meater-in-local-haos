package cm.aptoide.p092pt;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.analytics.AppSizeAnalyticsStringMapper;
import cm.aptoide.p092pt.install.InstallAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideInstallAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AppSizeAnalyticsStringMapper> appSizeAnalyticsStringMapperProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<TelephonyManager> telephonyManagerProvider;

    public ApplicationModule_ProvideInstallAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4, Provider<AppSizeAnalyticsStringMapper> provider5) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.connectivityManagerProvider = provider3;
        this.telephonyManagerProvider = provider4;
        this.appSizeAnalyticsStringMapperProvider = provider5;
    }

    public static ApplicationModule_ProvideInstallAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4, Provider<AppSizeAnalyticsStringMapper> provider5) {
        return new ApplicationModule_ProvideInstallAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static InstallAnalytics provideInstallAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, AppSizeAnalyticsStringMapper appSizeAnalyticsStringMapper) {
        return (InstallAnalytics) C9055b.m29112c(applicationModule.provideInstallAnalytics(analyticsManager, navigationTracker, connectivityManager, telephonyManager, appSizeAnalyticsStringMapper));
    }

    @Override // javax.inject.Provider
    public InstallAnalytics get() {
        return provideInstallAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.connectivityManagerProvider.get(), this.telephonyManagerProvider.get(), this.appSizeAnalyticsStringMapperProvider.get());
    }
}
