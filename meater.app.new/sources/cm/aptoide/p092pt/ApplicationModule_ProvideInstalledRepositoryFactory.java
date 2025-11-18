package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomInstalledPersistence;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.utils.FileUtils;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideInstalledRepositoryFactory implements Provider {
    private final Provider<FileUtils> fileUtilsProvider;
    private final ApplicationModule module;
    private final Provider<RoomInstalledPersistence> roomInstalledPersistenceProvider;

    public ApplicationModule_ProvideInstalledRepositoryFactory(ApplicationModule applicationModule, Provider<RoomInstalledPersistence> provider, Provider<FileUtils> provider2) {
        this.module = applicationModule;
        this.roomInstalledPersistenceProvider = provider;
        this.fileUtilsProvider = provider2;
    }

    public static ApplicationModule_ProvideInstalledRepositoryFactory create(ApplicationModule applicationModule, Provider<RoomInstalledPersistence> provider, Provider<FileUtils> provider2) {
        return new ApplicationModule_ProvideInstalledRepositoryFactory(applicationModule, provider, provider2);
    }

    public static AptoideInstalledAppsRepository provideInstalledRepository(ApplicationModule applicationModule, RoomInstalledPersistence roomInstalledPersistence, FileUtils fileUtils) {
        return (AptoideInstalledAppsRepository) C9055b.m29112c(applicationModule.provideInstalledRepository(roomInstalledPersistence, fileUtils));
    }

    @Override // javax.inject.Provider
    public AptoideInstalledAppsRepository get() {
        return provideInstalledRepository(this.module, this.roomInstalledPersistenceProvider.get(), this.fileUtilsProvider.get());
    }
}
