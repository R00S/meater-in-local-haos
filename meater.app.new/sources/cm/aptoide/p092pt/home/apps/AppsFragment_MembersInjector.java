package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class AppsFragment_MembersInjector implements InterfaceC9053a<AppsFragment> {
    private final Provider<AppsPresenter> appsPresenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public AppsFragment_MembersInjector(Provider<AppsPresenter> provider, Provider<ThemeManager> provider2) {
        this.appsPresenterProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static InterfaceC9053a<AppsFragment> create(Provider<AppsPresenter> provider, Provider<ThemeManager> provider2) {
        return new AppsFragment_MembersInjector(provider, provider2);
    }

    public static void injectAppsPresenter(AppsFragment appsFragment, AppsPresenter appsPresenter) {
        appsFragment.appsPresenter = appsPresenter;
    }

    public static void injectThemeManager(AppsFragment appsFragment, ThemeManager themeManager) {
        appsFragment.themeManager = themeManager;
    }

    public void injectMembers(AppsFragment appsFragment) {
        injectAppsPresenter(appsFragment, this.appsPresenterProvider.get());
        injectThemeManager(appsFragment, this.themeManagerProvider.get());
    }
}
