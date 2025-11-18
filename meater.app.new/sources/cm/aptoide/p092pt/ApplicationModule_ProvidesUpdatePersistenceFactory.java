package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.updates.UpdatePersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdatePersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdatePersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesUpdatePersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesUpdatePersistenceFactory(applicationModule, provider);
    }

    public static UpdatePersistence providesUpdatePersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (UpdatePersistence) C9055b.m29112c(applicationModule.providesUpdatePersistence(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public UpdatePersistence get() {
        return providesUpdatePersistence(this.module, this.databaseProvider.get());
    }
}
