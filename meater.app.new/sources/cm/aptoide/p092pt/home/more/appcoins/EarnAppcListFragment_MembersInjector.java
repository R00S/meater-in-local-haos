package cm.aptoide.p092pt.home.more.appcoins;

import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class EarnAppcListFragment_MembersInjector implements InterfaceC9053a<EarnAppcListFragment> {
    private final Provider<EarnAppcListPresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public EarnAppcListFragment_MembersInjector(Provider<EarnAppcListPresenter> provider, Provider<ThemeManager> provider2) {
        this.presenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static InterfaceC9053a<EarnAppcListFragment> create(Provider<EarnAppcListPresenter> provider, Provider<ThemeManager> provider2) {
        return new EarnAppcListFragment_MembersInjector(provider, provider2);
    }

    public static void injectPresenter(EarnAppcListFragment earnAppcListFragment, EarnAppcListPresenter earnAppcListPresenter) {
        earnAppcListFragment.presenter = earnAppcListPresenter;
    }

    public static void injectThemeManager(EarnAppcListFragment earnAppcListFragment, ThemeManager themeManager) {
        earnAppcListFragment.themeManager = themeManager;
    }

    public void injectMembers(EarnAppcListFragment earnAppcListFragment) {
        injectPresenter(earnAppcListFragment, this.presenterProvider.get());
        injectThemeManager(earnAppcListFragment, this.themeManagerProvider.get());
    }
}
