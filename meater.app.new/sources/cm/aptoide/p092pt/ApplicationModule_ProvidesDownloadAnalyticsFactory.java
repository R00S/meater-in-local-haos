package cm.aptoide.p092pt;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.analytics.AppSizeAnalyticsStringMapper;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadSpeedIntervalMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDownloadAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AppSizeAnalyticsStringMapper> appSizeAnalyticsStringMapperProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final Provider<DownloadSpeedIntervalMapper> downloadSpeedIntervalMapperProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<TelephonyManager> providesSystemServiceProvider;

    public ApplicationModule_ProvidesDownloadAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4, Provider<AppSizeAnalyticsStringMapper> provider5, Provider<DownloadSpeedIntervalMapper> provider6) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.connectivityManagerProvider = provider3;
        this.providesSystemServiceProvider = provider4;
        this.appSizeAnalyticsStringMapperProvider = provider5;
        this.downloadSpeedIntervalMapperProvider = provider6;
    }

    public static ApplicationModule_ProvidesDownloadAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4, Provider<AppSizeAnalyticsStringMapper> provider5, Provider<DownloadSpeedIntervalMapper> provider6) {
        return new ApplicationModule_ProvidesDownloadAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DownloadAnalytics providesDownloadAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, AppSizeAnalyticsStringMapper appSizeAnalyticsStringMapper, DownloadSpeedIntervalMapper downloadSpeedIntervalMapper) {
        return (DownloadAnalytics) C9055b.m29112c(applicationModule.providesDownloadAnalytics(analyticsManager, navigationTracker, connectivityManager, telephonyManager, appSizeAnalyticsStringMapper, downloadSpeedIntervalMapper));
    }

    @Override // javax.inject.Provider
    public DownloadAnalytics get() {
        return providesDownloadAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.connectivityManagerProvider.get(), this.providesSystemServiceProvider.get(), this.appSizeAnalyticsStringMapperProvider.get(), this.downloadSpeedIntervalMapperProvider.get());
    }
}
