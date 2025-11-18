package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomExperimentMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomExperimentMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomExperimentMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRoomExperimentMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRoomExperimentMapperFactory(applicationModule);
    }

    public static RoomExperimentMapper providesRoomExperimentMapper(ApplicationModule applicationModule) {
        return (RoomExperimentMapper) C9055b.m29112c(applicationModule.providesRoomExperimentMapper());
    }

    @Override // javax.inject.Provider
    public RoomExperimentMapper get() {
        return providesRoomExperimentMapper(this.module);
    }
}
