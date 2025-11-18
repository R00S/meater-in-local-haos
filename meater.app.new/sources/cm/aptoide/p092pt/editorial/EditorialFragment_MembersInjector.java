package cm.aptoide.p092pt.editorial;

import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Named;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class EditorialFragment_MembersInjector implements InterfaceC9053a<EditorialFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<EditorialPresenter> presenterProvider;
    private final Provider<Float> screenHeightProvider;
    private final Provider<Float> screenWidthProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public EditorialFragment_MembersInjector(Provider<EditorialPresenter> provider, Provider<Float> provider2, Provider<Float> provider3, Provider<ThemeManager> provider4, Provider<CaptionBackgroundPainter> provider5) {
        this.presenterProvider = provider;
        this.screenWidthProvider = provider2;
        this.screenHeightProvider = provider3;
        this.themeManagerProvider = provider4;
        this.captionBackgroundPainterProvider = provider5;
    }

    public static InterfaceC9053a<EditorialFragment> create(Provider<EditorialPresenter> provider, Provider<Float> provider2, Provider<Float> provider3, Provider<ThemeManager> provider4, Provider<CaptionBackgroundPainter> provider5) {
        return new EditorialFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectCaptionBackgroundPainter(EditorialFragment editorialFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        editorialFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    public static void injectPresenter(EditorialFragment editorialFragment, EditorialPresenter editorialPresenter) {
        editorialFragment.presenter = editorialPresenter;
    }

    @Named
    public static void injectScreenHeight(EditorialFragment editorialFragment, float f2) {
        editorialFragment.screenHeight = f2;
    }

    @Named
    public static void injectScreenWidth(EditorialFragment editorialFragment, float f2) {
        editorialFragment.screenWidth = f2;
    }

    public static void injectThemeManager(EditorialFragment editorialFragment, ThemeManager themeManager) {
        editorialFragment.themeManager = themeManager;
    }

    public void injectMembers(EditorialFragment editorialFragment) {
        injectPresenter(editorialFragment, this.presenterProvider.get());
        injectScreenWidth(editorialFragment, this.screenWidthProvider.get().floatValue());
        injectScreenHeight(editorialFragment, this.screenHeightProvider.get().floatValue());
        injectThemeManager(editorialFragment, this.themeManagerProvider.get());
        injectCaptionBackgroundPainter(editorialFragment, this.captionBackgroundPainterProvider.get());
    }
}
