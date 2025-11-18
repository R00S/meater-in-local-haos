package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomInstallationMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomInstallationMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomInstallationMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRoomInstallationMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRoomInstallationMapperFactory(applicationModule);
    }

    public static RoomInstallationMapper providesRoomInstallationMapper(ApplicationModule applicationModule) {
        return (RoomInstallationMapper) C9055b.m29112c(applicationModule.providesRoomInstallationMapper());
    }

    @Override // javax.inject.Provider
    public RoomInstallationMapper get() {
        return providesRoomInstallationMapper(this.module);
    }
}
