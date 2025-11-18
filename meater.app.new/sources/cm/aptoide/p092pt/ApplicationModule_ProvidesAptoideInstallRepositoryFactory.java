package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallRepository;
import cm.aptoide.p092pt.install.AptoideInstallPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAptoideInstallRepositoryFactory implements Provider {
    private final Provider<AptoideInstallPersistence> aptoideInstallPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideInstallRepositoryFactory(ApplicationModule applicationModule, Provider<AptoideInstallPersistence> provider) {
        this.module = applicationModule;
        this.aptoideInstallPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideInstallRepositoryFactory create(ApplicationModule applicationModule, Provider<AptoideInstallPersistence> provider) {
        return new ApplicationModule_ProvidesAptoideInstallRepositoryFactory(applicationModule, provider);
    }

    public static AptoideInstallRepository providesAptoideInstallRepository(ApplicationModule applicationModule, AptoideInstallPersistence aptoideInstallPersistence) {
        return (AptoideInstallRepository) C9055b.m29112c(applicationModule.providesAptoideInstallRepository(aptoideInstallPersistence));
    }

    @Override // javax.inject.Provider
    public AptoideInstallRepository get() {
        return providesAptoideInstallRepository(this.module, this.aptoideInstallPersistenceProvider.get());
    }
}
