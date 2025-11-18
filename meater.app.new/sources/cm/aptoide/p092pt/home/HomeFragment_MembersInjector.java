package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class HomeFragment_MembersInjector implements InterfaceC9053a<HomeFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<HomePresenter> presenterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public HomeFragment_MembersInjector(Provider<HomePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        this.presenterProvider = provider;
        this.marketNameProvider = provider2;
        this.captionBackgroundPainterProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static InterfaceC9053a<HomeFragment> create(Provider<HomePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        return new HomeFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectCaptionBackgroundPainter(HomeFragment homeFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        homeFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    @Named
    public static void injectMarketName(HomeFragment homeFragment, String str) {
        homeFragment.marketName = str;
    }

    public static void injectPresenter(HomeFragment homeFragment, HomePresenter homePresenter) {
        homeFragment.presenter = homePresenter;
    }

    public static void injectThemeManager(HomeFragment homeFragment, ThemeManager themeManager) {
        homeFragment.themeManager = themeManager;
    }

    public void injectMembers(HomeFragment homeFragment) {
        injectPresenter(homeFragment, this.presenterProvider.get());
        injectMarketName(homeFragment, this.marketNameProvider.get());
        injectCaptionBackgroundPainter(homeFragment, this.captionBackgroundPainterProvider.get());
        injectThemeManager(homeFragment, this.themeManagerProvider.get());
    }
}
