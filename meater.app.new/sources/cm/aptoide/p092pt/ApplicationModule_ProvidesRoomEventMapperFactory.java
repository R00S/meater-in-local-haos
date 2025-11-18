package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomEventMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomEventMapperFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<ObjectMapper> objectMapperProvider;

    public ApplicationModule_ProvidesRoomEventMapperFactory(ApplicationModule applicationModule, Provider<ObjectMapper> provider) {
        this.module = applicationModule;
        this.objectMapperProvider = provider;
    }

    public static ApplicationModule_ProvidesRoomEventMapperFactory create(ApplicationModule applicationModule, Provider<ObjectMapper> provider) {
        return new ApplicationModule_ProvidesRoomEventMapperFactory(applicationModule, provider);
    }

    public static RoomEventMapper providesRoomEventMapper(ApplicationModule applicationModule, ObjectMapper objectMapper) {
        return (RoomEventMapper) C9055b.m29112c(applicationModule.providesRoomEventMapper(objectMapper));
    }

    @Override // javax.inject.Provider
    public RoomEventMapper get() {
        return providesRoomEventMapper(this.module, this.objectMapperProvider.get());
    }
}
