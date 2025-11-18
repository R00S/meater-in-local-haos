package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ClaimPromotionDialogFragment_MembersInjector implements InterfaceC9053a<ClaimPromotionDialogFragment> {
    private final Provider<ClaimPromotionsManager> claimPromotionsManagerProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final Provider<ClaimPromotionsNavigator> navigatorProvider;
    private final Provider<ClaimPromotionDialogPresenter> presenterProvider;
    private final Provider<PromotionsAnalytics> promotionsAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ClaimPromotionDialogFragment_MembersInjector(Provider<ThemeManager> provider, Provider<ClaimPromotionDialogPresenter> provider2, Provider<ClaimPromotionsManager> provider3, Provider<IdsRepository> provider4, Provider<PromotionsAnalytics> provider5, Provider<ClaimPromotionsNavigator> provider6) {
        this.themeManagerProvider = provider;
        this.presenterProvider = provider2;
        this.claimPromotionsManagerProvider = provider3;
        this.idsRepositoryProvider = provider4;
        this.promotionsAnalyticsProvider = provider5;
        this.navigatorProvider = provider6;
    }

    public static InterfaceC9053a<ClaimPromotionDialogFragment> create(Provider<ThemeManager> provider, Provider<ClaimPromotionDialogPresenter> provider2, Provider<ClaimPromotionsManager> provider3, Provider<IdsRepository> provider4, Provider<PromotionsAnalytics> provider5, Provider<ClaimPromotionsNavigator> provider6) {
        return new ClaimPromotionDialogFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectClaimPromotionsManager(ClaimPromotionDialogFragment claimPromotionDialogFragment, ClaimPromotionsManager claimPromotionsManager) {
        claimPromotionDialogFragment.claimPromotionsManager = claimPromotionsManager;
    }

    public static void injectIdsRepository(ClaimPromotionDialogFragment claimPromotionDialogFragment, IdsRepository idsRepository) {
        claimPromotionDialogFragment.idsRepository = idsRepository;
    }

    public static void injectNavigator(ClaimPromotionDialogFragment claimPromotionDialogFragment, ClaimPromotionsNavigator claimPromotionsNavigator) {
        claimPromotionDialogFragment.navigator = claimPromotionsNavigator;
    }

    public static void injectPresenter(ClaimPromotionDialogFragment claimPromotionDialogFragment, ClaimPromotionDialogPresenter claimPromotionDialogPresenter) {
        claimPromotionDialogFragment.presenter = claimPromotionDialogPresenter;
    }

    public static void injectPromotionsAnalytics(ClaimPromotionDialogFragment claimPromotionDialogFragment, PromotionsAnalytics promotionsAnalytics) {
        claimPromotionDialogFragment.promotionsAnalytics = promotionsAnalytics;
    }

    public void injectMembers(ClaimPromotionDialogFragment claimPromotionDialogFragment) {
        BaseDialogFragment_MembersInjector.injectThemeManager(claimPromotionDialogFragment, this.themeManagerProvider.get());
        injectPresenter(claimPromotionDialogFragment, this.presenterProvider.get());
        injectClaimPromotionsManager(claimPromotionDialogFragment, this.claimPromotionsManagerProvider.get());
        injectIdsRepository(claimPromotionDialogFragment, this.idsRepositoryProvider.get());
        injectPromotionsAnalytics(claimPromotionDialogFragment, this.promotionsAnalyticsProvider.get());
        injectNavigator(claimPromotionDialogFragment, this.navigatorProvider.get());
    }
}
