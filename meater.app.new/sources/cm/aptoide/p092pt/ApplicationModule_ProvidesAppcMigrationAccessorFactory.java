package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.migration.AppcMigrationPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppcMigrationAccessorFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppcMigrationAccessorFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesAppcMigrationAccessorFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesAppcMigrationAccessorFactory(applicationModule, provider);
    }

    public static AppcMigrationPersistence providesAppcMigrationAccessor(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (AppcMigrationPersistence) C9055b.m29112c(applicationModule.providesAppcMigrationAccessor(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public AppcMigrationPersistence get() {
        return providesAppcMigrationAccessor(this.module, this.databaseProvider.get());
    }
}
