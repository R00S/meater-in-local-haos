package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallRepository;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAptoideInstallManagerFactory implements Provider {
    private final Provider<AptoideInstallRepository> aptoideInstallRepositoryProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideInstallManagerFactory(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AptoideInstallRepository> provider2) {
        this.module = applicationModule;
        this.aptoideInstalledAppsRepositoryProvider = provider;
        this.aptoideInstallRepositoryProvider = provider2;
    }

    public static ApplicationModule_ProvidesAptoideInstallManagerFactory create(ApplicationModule applicationModule, Provider<AptoideInstalledAppsRepository> provider, Provider<AptoideInstallRepository> provider2) {
        return new ApplicationModule_ProvidesAptoideInstallManagerFactory(applicationModule, provider, provider2);
    }

    public static AptoideInstallManager providesAptoideInstallManager(ApplicationModule applicationModule, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AptoideInstallRepository aptoideInstallRepository) {
        return (AptoideInstallManager) C9055b.m29112c(applicationModule.providesAptoideInstallManager(aptoideInstalledAppsRepository, aptoideInstallRepository));
    }

    @Override // javax.inject.Provider
    public AptoideInstallManager get() {
        return providesAptoideInstallManager(this.module, this.aptoideInstalledAppsRepositoryProvider.get(), this.aptoideInstallRepositoryProvider.get());
    }
}
