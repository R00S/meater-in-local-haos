package cm.aptoide.p092pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.home.Home;
import cm.aptoide.p092pt.home.HomeAnalytics;
import cm.aptoide.p092pt.home.HomeNavigator;
import cm.aptoide.p092pt.home.HomePresenter;
import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesHomePresenterFactory implements Provider {
    private final Provider<AdMapper> adMapperProvider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<HomeAnalytics> homeAnalyticsProvider;
    private final Provider<HomeNavigator> homeNavigatorProvider;
    private final Provider<Home> homeProvider;
    private final FragmentModule module;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public FragmentModule_ProvidesHomePresenterFactory(FragmentModule fragmentModule, Provider<Home> provider, Provider<HomeNavigator> provider2, Provider<AdMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<HomeAnalytics> provider5, Provider<UserFeedbackAnalytics> provider6) {
        this.module = fragmentModule;
        this.homeProvider = provider;
        this.homeNavigatorProvider = provider2;
        this.adMapperProvider = provider3;
        this.aptoideAccountManagerProvider = provider4;
        this.homeAnalyticsProvider = provider5;
        this.userFeedbackAnalyticsProvider = provider6;
    }

    public static FragmentModule_ProvidesHomePresenterFactory create(FragmentModule fragmentModule, Provider<Home> provider, Provider<HomeNavigator> provider2, Provider<AdMapper> provider3, Provider<AptoideAccountManager> provider4, Provider<HomeAnalytics> provider5, Provider<UserFeedbackAnalytics> provider6) {
        return new FragmentModule_ProvidesHomePresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static HomePresenter providesHomePresenter(FragmentModule fragmentModule, Home home, HomeNavigator homeNavigator, AdMapper adMapper, AptoideAccountManager aptoideAccountManager, HomeAnalytics homeAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        return (HomePresenter) C9055b.m29112c(fragmentModule.providesHomePresenter(home, homeNavigator, adMapper, aptoideAccountManager, homeAnalytics, userFeedbackAnalytics));
    }

    @Override // javax.inject.Provider
    public HomePresenter get() {
        return providesHomePresenter(this.module, this.homeProvider.get(), this.homeNavigatorProvider.get(), this.adMapperProvider.get(), this.aptoideAccountManagerProvider.get(), this.homeAnalyticsProvider.get(), this.userFeedbackAnalyticsProvider.get());
    }
}
