package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class PromotionsFragment_MembersInjector implements InterfaceC9053a<PromotionsFragment> {
    private final Provider<PromotionsPresenter> promotionsPresenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public PromotionsFragment_MembersInjector(Provider<PromotionsPresenter> provider, Provider<ThemeManager> provider2) {
        this.promotionsPresenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static InterfaceC9053a<PromotionsFragment> create(Provider<PromotionsPresenter> provider, Provider<ThemeManager> provider2) {
        return new PromotionsFragment_MembersInjector(provider, provider2);
    }

    public static void injectPromotionsPresenter(PromotionsFragment promotionsFragment, PromotionsPresenter promotionsPresenter) {
        promotionsFragment.promotionsPresenter = promotionsPresenter;
    }

    public static void injectThemeManager(PromotionsFragment promotionsFragment, ThemeManager themeManager) {
        promotionsFragment.themeManager = themeManager;
    }

    public void injectMembers(PromotionsFragment promotionsFragment) {
        injectPromotionsPresenter(promotionsFragment, this.promotionsPresenterProvider.get());
        injectThemeManager(promotionsFragment, this.themeManagerProvider.get());
    }
}
