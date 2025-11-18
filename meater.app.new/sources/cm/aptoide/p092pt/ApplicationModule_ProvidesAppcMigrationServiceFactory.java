package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.migration.AppcMigrationPersistence;
import cm.aptoide.p092pt.app.migration.AppcMigrationRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppcMigrationServiceFactory implements Provider {
    private final Provider<AppcMigrationPersistence> appcMigrationPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppcMigrationServiceFactory(ApplicationModule applicationModule, Provider<AppcMigrationPersistence> provider) {
        this.module = applicationModule;
        this.appcMigrationPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesAppcMigrationServiceFactory create(ApplicationModule applicationModule, Provider<AppcMigrationPersistence> provider) {
        return new ApplicationModule_ProvidesAppcMigrationServiceFactory(applicationModule, provider);
    }

    public static AppcMigrationRepository providesAppcMigrationService(ApplicationModule applicationModule, AppcMigrationPersistence appcMigrationPersistence) {
        return (AppcMigrationRepository) C9055b.m29112c(applicationModule.providesAppcMigrationService(appcMigrationPersistence));
    }

    @Override // javax.inject.Provider
    public AppcMigrationRepository get() {
        return providesAppcMigrationService(this.module, this.appcMigrationPersistenceProvider.get());
    }
}
