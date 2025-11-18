package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.promotions.ClaimPromotionDialogPresenter;
import cm.aptoide.p092pt.promotions.ClaimPromotionsManager;
import cm.aptoide.p092pt.promotions.ClaimPromotionsNavigator;
import cm.aptoide.p092pt.promotions.PromotionsAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesClaimPromotionDialogPresenterFactory implements Provider {
    private final Provider<ClaimPromotionsManager> claimPromotionsManagerProvider;
    private final FragmentModule module;
    private final Provider<ClaimPromotionsNavigator> navigatorProvider;
    private final Provider<PromotionsAnalytics> promotionsAnalyticsProvider;

    public FragmentModule_ProvidesClaimPromotionDialogPresenterFactory(FragmentModule fragmentModule, Provider<ClaimPromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<ClaimPromotionsNavigator> provider3) {
        this.module = fragmentModule;
        this.claimPromotionsManagerProvider = provider;
        this.promotionsAnalyticsProvider = provider2;
        this.navigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesClaimPromotionDialogPresenterFactory create(FragmentModule fragmentModule, Provider<ClaimPromotionsManager> provider, Provider<PromotionsAnalytics> provider2, Provider<ClaimPromotionsNavigator> provider3) {
        return new FragmentModule_ProvidesClaimPromotionDialogPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static ClaimPromotionDialogPresenter providesClaimPromotionDialogPresenter(FragmentModule fragmentModule, ClaimPromotionsManager claimPromotionsManager, PromotionsAnalytics promotionsAnalytics, ClaimPromotionsNavigator claimPromotionsNavigator) {
        return (ClaimPromotionDialogPresenter) C9055b.m29112c(fragmentModule.providesClaimPromotionDialogPresenter(claimPromotionsManager, promotionsAnalytics, claimPromotionsNavigator));
    }

    @Override // javax.inject.Provider
    public ClaimPromotionDialogPresenter get() {
        return providesClaimPromotionDialogPresenter(this.module, this.claimPromotionsManagerProvider.get(), this.promotionsAnalyticsProvider.get(), this.navigatorProvider.get());
    }
}
