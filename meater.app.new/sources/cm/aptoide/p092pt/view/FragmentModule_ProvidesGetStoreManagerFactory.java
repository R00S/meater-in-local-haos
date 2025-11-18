package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.app.view.MoreBundleManager;
import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesGetStoreManagerFactory implements Provider {
    private final Provider<BundlesRepository> bundlesRepositoryProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesGetStoreManagerFactory(FragmentModule fragmentModule, Provider<BundlesRepository> provider) {
        this.module = fragmentModule;
        this.bundlesRepositoryProvider = provider;
    }

    public static FragmentModule_ProvidesGetStoreManagerFactory create(FragmentModule fragmentModule, Provider<BundlesRepository> provider) {
        return new FragmentModule_ProvidesGetStoreManagerFactory(fragmentModule, provider);
    }

    public static MoreBundleManager providesGetStoreManager(FragmentModule fragmentModule, BundlesRepository bundlesRepository) {
        return (MoreBundleManager) C9055b.m29112c(fragmentModule.providesGetStoreManager(bundlesRepository));
    }

    @Override // javax.inject.Provider
    public MoreBundleManager get() {
        return providesGetStoreManager(this.module, this.bundlesRepositoryProvider.get());
    }
}
