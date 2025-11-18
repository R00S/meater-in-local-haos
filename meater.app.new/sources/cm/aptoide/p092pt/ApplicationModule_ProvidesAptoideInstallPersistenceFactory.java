package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.install.AptoideInstallPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAptoideInstallPersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAptoideInstallPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideInstallPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesAptoideInstallPersistenceFactory(applicationModule, provider);
    }

    public static AptoideInstallPersistence providesAptoideInstallPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (AptoideInstallPersistence) C9055b.m29112c(applicationModule.providesAptoideInstallPersistence(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public AptoideInstallPersistence get() {
        return providesAptoideInstallPersistence(this.module, this.databaseProvider.get());
    }
}
