package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomExperimentMapper;
import cm.aptoide.p092pt.database.RoomExperimentPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomExperimentPersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> databaseProvider;
    private final Provider<RoomExperimentMapper> mapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomExperimentPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomExperimentMapper> provider2) {
        this.module = applicationModule;
        this.databaseProvider = provider;
        this.mapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesRoomExperimentPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomExperimentMapper> provider2) {
        return new ApplicationModule_ProvidesRoomExperimentPersistenceFactory(applicationModule, provider, provider2);
    }

    public static RoomExperimentPersistence providesRoomExperimentPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, RoomExperimentMapper roomExperimentMapper) {
        return (RoomExperimentPersistence) C9055b.m29112c(applicationModule.providesRoomExperimentPersistence(aptoideDatabase, roomExperimentMapper));
    }

    @Override // javax.inject.Provider
    public RoomExperimentPersistence get() {
        return providesRoomExperimentPersistence(this.module, this.databaseProvider.get(), this.mapperProvider.get());
    }
}
