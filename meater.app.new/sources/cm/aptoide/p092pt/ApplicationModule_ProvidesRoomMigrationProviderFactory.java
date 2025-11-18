package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRoomMigrationProviderFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomMigrationProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRoomMigrationProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRoomMigrationProviderFactory(applicationModule);
    }

    public static RoomMigrationProvider providesRoomMigrationProvider(ApplicationModule applicationModule) {
        return (RoomMigrationProvider) C9055b.m29112c(applicationModule.providesRoomMigrationProvider());
    }

    @Override // javax.inject.Provider
    public RoomMigrationProvider get() {
        return providesRoomMigrationProvider(this.module);
    }
}
