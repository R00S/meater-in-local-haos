package cm.aptoide.p092pt.view;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.editorial.EditorialAnalytics;
import cm.aptoide.p092pt.install.InstallAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialAnalyticsFactory implements Provider {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final FragmentModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public FragmentModule_ProvidesEditorialAnalyticsFactory(FragmentModule fragmentModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<InstallAnalytics> provider4, Provider<SplitAnalyticsMapper> provider5) {
        this.module = fragmentModule;
        this.downloadAnalyticsProvider = provider;
        this.analyticsManagerProvider = provider2;
        this.navigationTrackerProvider = provider3;
        this.installAnalyticsProvider = provider4;
        this.splitAnalyticsMapperProvider = provider5;
    }

    public static FragmentModule_ProvidesEditorialAnalyticsFactory create(FragmentModule fragmentModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<InstallAnalytics> provider4, Provider<SplitAnalyticsMapper> provider5) {
        return new FragmentModule_ProvidesEditorialAnalyticsFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static EditorialAnalytics providesEditorialAnalytics(FragmentModule fragmentModule, DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics, SplitAnalyticsMapper splitAnalyticsMapper) {
        return (EditorialAnalytics) C9055b.m29112c(fragmentModule.providesEditorialAnalytics(downloadAnalytics, analyticsManager, navigationTracker, installAnalytics, splitAnalyticsMapper));
    }

    @Override // javax.inject.Provider
    public EditorialAnalytics get() {
        return providesEditorialAnalytics(this.module, this.downloadAnalyticsProvider.get(), this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.installAnalyticsProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
