package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.app.view.MoreBundleManager;
import cm.aptoide.p092pt.app.view.MoreBundlePresenter;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.home.ChipManager;
import cm.aptoide.p092pt.home.HomeAnalytics;
import cm.aptoide.p092pt.home.HomeNavigator;
import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesGetStoreWidgetsPresenterFactory implements Provider {
    private final Provider<AdMapper> adMapperProvider;
    private final Provider<BundleEvent> bundleEventProvider;
    private final Provider<ChipManager> chipManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<HomeAnalytics> homeAnalyticsProvider;
    private final Provider<HomeNavigator> homeNavigatorProvider;
    private final FragmentModule module;
    private final Provider<MoreBundleManager> moreBundleManagerProvider;

    public FragmentModule_ProvidesGetStoreWidgetsPresenterFactory(FragmentModule fragmentModule, Provider<MoreBundleManager> provider, Provider<CrashReport> provider2, Provider<HomeNavigator> provider3, Provider<AdMapper> provider4, Provider<BundleEvent> provider5, Provider<HomeAnalytics> provider6, Provider<ChipManager> provider7) {
        this.module = fragmentModule;
        this.moreBundleManagerProvider = provider;
        this.crashReportProvider = provider2;
        this.homeNavigatorProvider = provider3;
        this.adMapperProvider = provider4;
        this.bundleEventProvider = provider5;
        this.homeAnalyticsProvider = provider6;
        this.chipManagerProvider = provider7;
    }

    public static FragmentModule_ProvidesGetStoreWidgetsPresenterFactory create(FragmentModule fragmentModule, Provider<MoreBundleManager> provider, Provider<CrashReport> provider2, Provider<HomeNavigator> provider3, Provider<AdMapper> provider4, Provider<BundleEvent> provider5, Provider<HomeAnalytics> provider6, Provider<ChipManager> provider7) {
        return new FragmentModule_ProvidesGetStoreWidgetsPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MoreBundlePresenter providesGetStoreWidgetsPresenter(FragmentModule fragmentModule, MoreBundleManager moreBundleManager, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, BundleEvent bundleEvent, HomeAnalytics homeAnalytics, ChipManager chipManager) {
        return (MoreBundlePresenter) C9055b.m29112c(fragmentModule.providesGetStoreWidgetsPresenter(moreBundleManager, crashReport, homeNavigator, adMapper, bundleEvent, homeAnalytics, chipManager));
    }

    @Override // javax.inject.Provider
    public MoreBundlePresenter get() {
        return providesGetStoreWidgetsPresenter(this.module, this.moreBundleManagerProvider.get(), this.crashReportProvider.get(), this.homeNavigatorProvider.get(), this.adMapperProvider.get(), this.bundleEventProvider.get(), this.homeAnalyticsProvider.get(), this.chipManagerProvider.get());
    }
}
