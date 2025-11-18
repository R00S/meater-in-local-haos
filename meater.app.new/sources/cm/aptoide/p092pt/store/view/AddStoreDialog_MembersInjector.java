package cm.aptoide.p092pt.store.view;

import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class AddStoreDialog_MembersInjector implements InterfaceC9053a<AddStoreDialog> {
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public AddStoreDialog_MembersInjector(Provider<ThemeManager> provider, Provider<StoreCredentialsProvider> provider2, Provider<StoreUtilsProxy> provider3) {
        this.themeManagerProvider = provider;
        this.storeCredentialsProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
    }

    public static InterfaceC9053a<AddStoreDialog> create(Provider<ThemeManager> provider, Provider<StoreCredentialsProvider> provider2, Provider<StoreUtilsProxy> provider3) {
        return new AddStoreDialog_MembersInjector(provider, provider2, provider3);
    }

    public static void injectStoreCredentialsProvider(AddStoreDialog addStoreDialog, StoreCredentialsProvider storeCredentialsProvider) {
        addStoreDialog.storeCredentialsProvider = storeCredentialsProvider;
    }

    public static void injectStoreUtilsProxy(AddStoreDialog addStoreDialog, StoreUtilsProxy storeUtilsProxy) {
        addStoreDialog.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(AddStoreDialog addStoreDialog) {
        BaseDialogFragment_MembersInjector.injectThemeManager(addStoreDialog, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(addStoreDialog, this.storeCredentialsProvider.get());
        injectStoreUtilsProxy(addStoreDialog, this.storeUtilsProxyProvider.get());
    }
}
