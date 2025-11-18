package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class MoreBundleFragment_MembersInjector implements InterfaceC9053a<MoreBundleFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MoreBundlePresenter> presenterProvider;
    private final Provider<ThemeManager> themeAttributeProvider;

    public MoreBundleFragment_MembersInjector(Provider<MoreBundlePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        this.presenterProvider = provider;
        this.marketNameProvider = provider2;
        this.captionBackgroundPainterProvider = provider3;
        this.themeAttributeProvider = provider4;
    }

    public static InterfaceC9053a<MoreBundleFragment> create(Provider<MoreBundlePresenter> provider, Provider<String> provider2, Provider<CaptionBackgroundPainter> provider3, Provider<ThemeManager> provider4) {
        return new MoreBundleFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectCaptionBackgroundPainter(MoreBundleFragment moreBundleFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        moreBundleFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    @Named
    public static void injectMarketName(MoreBundleFragment moreBundleFragment, String str) {
        moreBundleFragment.marketName = str;
    }

    public static void injectPresenter(MoreBundleFragment moreBundleFragment, MoreBundlePresenter moreBundlePresenter) {
        moreBundleFragment.presenter = moreBundlePresenter;
    }

    public static void injectThemeAttributeProvider(MoreBundleFragment moreBundleFragment, ThemeManager themeManager) {
        moreBundleFragment.themeAttributeProvider = themeManager;
    }

    public void injectMembers(MoreBundleFragment moreBundleFragment) {
        injectPresenter(moreBundleFragment, this.presenterProvider.get());
        injectMarketName(moreBundleFragment, this.marketNameProvider.get());
        injectCaptionBackgroundPainter(moreBundleFragment, this.captionBackgroundPainterProvider.get());
        injectThemeAttributeProvider(moreBundleFragment, this.themeAttributeProvider.get());
    }
}
