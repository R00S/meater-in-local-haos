package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.promotions.PromotionsAnalytics;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.PromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionsPresenter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesPromotionsPresenterFactory implements Provider {
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<PromotionsAnalytics> promotionsAnalyticsProvider;
    private final Provider<PromotionsManager> promotionsManagerProvider;
    private final Provider<PromotionsNavigator> promotionsNavigatorProvider;
    private final Provider<String> promotionsTypeProvider;

    public FragmentModule_ProvidesPromotionsPresenterFactory(FragmentModule fragmentModule, Provider<PromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<PromotionsNavigator> provider3, Provider<String> provider4, Provider<MoPubAdsManager> provider5) {
        this.module = fragmentModule;
        this.promotionsManagerProvider = provider;
        this.promotionsAnalyticsProvider = provider2;
        this.promotionsNavigatorProvider = provider3;
        this.promotionsTypeProvider = provider4;
        this.moPubAdsManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesPromotionsPresenterFactory create(FragmentModule fragmentModule, Provider<PromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<PromotionsNavigator> provider3, Provider<String> provider4, Provider<MoPubAdsManager> provider5) {
        return new FragmentModule_ProvidesPromotionsPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static PromotionsPresenter providesPromotionsPresenter(FragmentModule fragmentModule, PromotionsManager promotionsManager, PromotionsAnalytics promotionsAnalytics, PromotionsNavigator promotionsNavigator, String str, MoPubAdsManager moPubAdsManager) {
        return (PromotionsPresenter) C9055b.m29112c(fragmentModule.providesPromotionsPresenter(promotionsManager, promotionsAnalytics, promotionsNavigator, str, moPubAdsManager));
    }

    @Override // javax.inject.Provider
    public PromotionsPresenter get() {
        return providesPromotionsPresenter(this.module, this.promotionsManagerProvider.get(), this.promotionsAnalyticsProvider.get(), this.promotionsNavigatorProvider.get(), this.promotionsTypeProvider.get(), this.moPubAdsManagerProvider.get());
    }
}
