package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomInstallationPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesInstallationAccessorFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesInstallationAccessorFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesInstallationAccessorFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesInstallationAccessorFactory(applicationModule, provider);
    }

    public static RoomInstallationPersistence providesInstallationAccessor(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        return (RoomInstallationPersistence) C9055b.m29112c(applicationModule.providesInstallationAccessor(aptoideDatabase));
    }

    @Override // javax.inject.Provider
    public RoomInstallationPersistence get() {
        return providesInstallationAccessor(this.module, this.databaseProvider.get());
    }
}
