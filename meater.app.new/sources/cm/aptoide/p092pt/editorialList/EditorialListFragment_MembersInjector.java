package cm.aptoide.p092pt.editorialList;

import cm.aptoide.p092pt.editorial.CaptionBackgroundPainter;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class EditorialListFragment_MembersInjector implements InterfaceC9053a<EditorialListFragment> {
    private final Provider<CaptionBackgroundPainter> captionBackgroundPainterProvider;
    private final Provider<EditorialListPresenter> presenterProvider;
    private final Provider<ThemeManager> themeAttributeProvider;

    public EditorialListFragment_MembersInjector(Provider<EditorialListPresenter> provider, Provider<CaptionBackgroundPainter> provider2, Provider<ThemeManager> provider3) {
        this.presenterProvider = provider;
        this.captionBackgroundPainterProvider = provider2;
        this.themeAttributeProvider = provider3;
    }

    public static InterfaceC9053a<EditorialListFragment> create(Provider<EditorialListPresenter> provider, Provider<CaptionBackgroundPainter> provider2, Provider<ThemeManager> provider3) {
        return new EditorialListFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectCaptionBackgroundPainter(EditorialListFragment editorialListFragment, CaptionBackgroundPainter captionBackgroundPainter) {
        editorialListFragment.captionBackgroundPainter = captionBackgroundPainter;
    }

    public static void injectPresenter(EditorialListFragment editorialListFragment, EditorialListPresenter editorialListPresenter) {
        editorialListFragment.presenter = editorialListPresenter;
    }

    public static void injectThemeAttributeProvider(EditorialListFragment editorialListFragment, ThemeManager themeManager) {
        editorialListFragment.themeAttributeProvider = themeManager;
    }

    public void injectMembers(EditorialListFragment editorialListFragment) {
        injectPresenter(editorialListFragment, this.presenterProvider.get());
        injectCaptionBackgroundPainter(editorialListFragment, this.captionBackgroundPainterProvider.get());
        injectThemeAttributeProvider(editorialListFragment, this.themeAttributeProvider.get());
    }
}
