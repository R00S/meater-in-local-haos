package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomEventMapper;
import cm.aptoide.p092pt.database.RoomEventPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomEventPersistenceFactory implements Provider {
    private final Provider<AptoideDatabase> aptoideDatabaseProvider;
    private final ApplicationModule module;
    private final Provider<RoomEventMapper> roomEventMapperProvider;

    public ApplicationModule_ProvidesRoomEventPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomEventMapper> provider2) {
        this.module = applicationModule;
        this.aptoideDatabaseProvider = provider;
        this.roomEventMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesRoomEventPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomEventMapper> provider2) {
        return new ApplicationModule_ProvidesRoomEventPersistenceFactory(applicationModule, provider, provider2);
    }

    public static RoomEventPersistence providesRoomEventPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, RoomEventMapper roomEventMapper) {
        return (RoomEventPersistence) C9055b.m29112c(applicationModule.providesRoomEventPersistence(aptoideDatabase, roomEventMapper));
    }

    @Override // javax.inject.Provider
    public RoomEventPersistence get() {
        return providesRoomEventPersistence(this.module, this.aptoideDatabaseProvider.get(), this.roomEventMapperProvider.get());
    }
}
