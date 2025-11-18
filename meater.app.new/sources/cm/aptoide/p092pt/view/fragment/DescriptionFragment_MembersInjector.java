package cm.aptoide.p092pt.view.fragment;

import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class DescriptionFragment_MembersInjector implements InterfaceC9053a<DescriptionFragment> {
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public DescriptionFragment_MembersInjector(Provider<ThemeManager> provider, Provider<StoreCredentialsProvider> provider2) {
        this.themeManagerProvider = provider;
        this.storeCredentialsProvider = provider2;
    }

    public static InterfaceC9053a<DescriptionFragment> create(Provider<ThemeManager> provider, Provider<StoreCredentialsProvider> provider2) {
        return new DescriptionFragment_MembersInjector(provider, provider2);
    }

    public static void injectStoreCredentialsProvider(DescriptionFragment descriptionFragment, StoreCredentialsProvider storeCredentialsProvider) {
        descriptionFragment.storeCredentialsProvider = storeCredentialsProvider;
    }

    public static void injectThemeManager(DescriptionFragment descriptionFragment, ThemeManager themeManager) {
        descriptionFragment.themeManager = themeManager;
    }

    public void injectMembers(DescriptionFragment descriptionFragment) {
        injectThemeManager(descriptionFragment, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(descriptionFragment, this.storeCredentialsProvider.get());
    }
}
