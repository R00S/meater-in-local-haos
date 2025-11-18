package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAptoideDataBaseFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<RoomMigrationProvider> roomMigrationProvider;

    public ApplicationModule_ProvidesAptoideDataBaseFactory(ApplicationModule applicationModule, Provider<RoomMigrationProvider> provider) {
        this.module = applicationModule;
        this.roomMigrationProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideDataBaseFactory create(ApplicationModule applicationModule, Provider<RoomMigrationProvider> provider) {
        return new ApplicationModule_ProvidesAptoideDataBaseFactory(applicationModule, provider);
    }

    public static AptoideDatabase providesAptoideDataBase(ApplicationModule applicationModule, RoomMigrationProvider roomMigrationProvider) {
        return (AptoideDatabase) C9055b.m29112c(applicationModule.providesAptoideDataBase(roomMigrationProvider));
    }

    @Override // javax.inject.Provider
    public AptoideDatabase get() {
        return providesAptoideDataBase(this.module, this.roomMigrationProvider.get());
    }
}
