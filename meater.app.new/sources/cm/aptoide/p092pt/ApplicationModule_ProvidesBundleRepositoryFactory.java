package cm.aptoide.p092pt;

import cm.aptoide.p092pt.home.bundles.BundleDataSource;
import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBundleRepositoryFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<BundleDataSource> remoteBundleDataSourceProvider;

    public ApplicationModule_ProvidesBundleRepositoryFactory(ApplicationModule applicationModule, Provider<BundleDataSource> provider) {
        this.module = applicationModule;
        this.remoteBundleDataSourceProvider = provider;
    }

    public static ApplicationModule_ProvidesBundleRepositoryFactory create(ApplicationModule applicationModule, Provider<BundleDataSource> provider) {
        return new ApplicationModule_ProvidesBundleRepositoryFactory(applicationModule, provider);
    }

    public static BundlesRepository providesBundleRepository(ApplicationModule applicationModule, BundleDataSource bundleDataSource) {
        return (BundlesRepository) C9055b.m29112c(applicationModule.providesBundleRepository(bundleDataSource));
    }

    @Override // javax.inject.Provider
    public BundlesRepository get() {
        return providesBundleRepository(this.module, this.remoteBundleDataSourceProvider.get());
    }
}
