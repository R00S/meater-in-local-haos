package cm.aptoide.p092pt.store.view;

import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class PrivateStoreDialog_MembersInjector implements InterfaceC9053a<PrivateStoreDialog> {
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public PrivateStoreDialog_MembersInjector(Provider<ThemeManager> provider, Provider<StoreUtilsProxy> provider2) {
        this.themeManagerProvider = provider;
        this.storeUtilsProxyProvider = provider2;
    }

    public static InterfaceC9053a<PrivateStoreDialog> create(Provider<ThemeManager> provider, Provider<StoreUtilsProxy> provider2) {
        return new PrivateStoreDialog_MembersInjector(provider, provider2);
    }

    public static void injectStoreUtilsProxy(PrivateStoreDialog privateStoreDialog, StoreUtilsProxy storeUtilsProxy) {
        privateStoreDialog.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(PrivateStoreDialog privateStoreDialog) {
        BaseDialogFragment_MembersInjector.injectThemeManager(privateStoreDialog, this.themeManagerProvider.get());
        injectStoreUtilsProxy(privateStoreDialog, this.storeUtilsProxyProvider.get());
    }
}
