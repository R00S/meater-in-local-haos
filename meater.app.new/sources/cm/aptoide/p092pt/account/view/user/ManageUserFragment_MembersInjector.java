package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.account.view.ImagePickerPresenter;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ManageUserFragment_MembersInjector implements InterfaceC9053a<ManageUserFragment> {
    private final Provider<ImagePickerPresenter> imagePickerPresenterProvider;
    private final Provider<ManageUserPresenter> manageUserPresenterProvider;
    private final Provider<NewsletterManager> newsletterManagerProvider;
    private final Provider<ScreenOrientationManager> orientationManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ManageUserFragment_MembersInjector(Provider<ImagePickerPresenter> provider, Provider<ManageUserPresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<NewsletterManager> provider4, Provider<ThemeManager> provider5) {
        this.imagePickerPresenterProvider = provider;
        this.manageUserPresenterProvider = provider2;
        this.orientationManagerProvider = provider3;
        this.newsletterManagerProvider = provider4;
        this.themeManagerProvider = provider5;
    }

    public static InterfaceC9053a<ManageUserFragment> create(Provider<ImagePickerPresenter> provider, Provider<ManageUserPresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<NewsletterManager> provider4, Provider<ThemeManager> provider5) {
        return new ManageUserFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectImagePickerPresenter(ManageUserFragment manageUserFragment, ImagePickerPresenter imagePickerPresenter) {
        manageUserFragment.imagePickerPresenter = imagePickerPresenter;
    }

    public static void injectManageUserPresenter(ManageUserFragment manageUserFragment, ManageUserPresenter manageUserPresenter) {
        manageUserFragment.manageUserPresenter = manageUserPresenter;
    }

    public static void injectNewsletterManager(ManageUserFragment manageUserFragment, NewsletterManager newsletterManager) {
        manageUserFragment.newsletterManager = newsletterManager;
    }

    public static void injectOrientationManager(ManageUserFragment manageUserFragment, ScreenOrientationManager screenOrientationManager) {
        manageUserFragment.orientationManager = screenOrientationManager;
    }

    public static void injectThemeManager(ManageUserFragment manageUserFragment, ThemeManager themeManager) {
        manageUserFragment.themeManager = themeManager;
    }

    public void injectMembers(ManageUserFragment manageUserFragment) {
        injectImagePickerPresenter(manageUserFragment, this.imagePickerPresenterProvider.get());
        injectManageUserPresenter(manageUserFragment, this.manageUserPresenterProvider.get());
        injectOrientationManager(manageUserFragment, this.orientationManagerProvider.get());
        injectNewsletterManager(manageUserFragment, this.newsletterManagerProvider.get());
        injectThemeManager(manageUserFragment, this.themeManagerProvider.get());
    }
}
