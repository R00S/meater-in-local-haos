package cm.aptoide.p092pt.account.view.store;

import cm.aptoide.p092pt.account.view.ImagePickerPresenter;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class ManageStoreFragment_MembersInjector implements InterfaceC9053a<ManageStoreFragment> {
    private final Provider<ImagePickerPresenter> imagePickerPresenterProvider;
    private final Provider<ManageStorePresenter> manageStorePresenterProvider;
    private final Provider<ScreenOrientationManager> orientationManagerProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ManageStoreFragment_MembersInjector(Provider<ImagePickerPresenter> provider, Provider<ManageStorePresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<ThemeManager> provider4) {
        this.imagePickerPresenterProvider = provider;
        this.manageStorePresenterProvider = provider2;
        this.orientationManagerProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static InterfaceC9053a<ManageStoreFragment> create(Provider<ImagePickerPresenter> provider, Provider<ManageStorePresenter> provider2, Provider<ScreenOrientationManager> provider3, Provider<ThemeManager> provider4) {
        return new ManageStoreFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectImagePickerPresenter(ManageStoreFragment manageStoreFragment, ImagePickerPresenter imagePickerPresenter) {
        manageStoreFragment.imagePickerPresenter = imagePickerPresenter;
    }

    public static void injectManageStorePresenter(ManageStoreFragment manageStoreFragment, ManageStorePresenter manageStorePresenter) {
        manageStoreFragment.manageStorePresenter = manageStorePresenter;
    }

    public static void injectOrientationManager(ManageStoreFragment manageStoreFragment, ScreenOrientationManager screenOrientationManager) {
        manageStoreFragment.orientationManager = screenOrientationManager;
    }

    public static void injectThemeManager(ManageStoreFragment manageStoreFragment, ThemeManager themeManager) {
        manageStoreFragment.themeManager = themeManager;
    }

    public void injectMembers(ManageStoreFragment manageStoreFragment) {
        injectImagePickerPresenter(manageStoreFragment, this.imagePickerPresenterProvider.get());
        injectManageStorePresenter(manageStoreFragment, this.manageStorePresenterProvider.get());
        injectOrientationManager(manageStoreFragment, this.orientationManagerProvider.get());
        injectThemeManager(manageStoreFragment, this.themeManagerProvider.get());
    }
}
