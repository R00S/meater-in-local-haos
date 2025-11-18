package cm.aptoide.p092pt;

import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.app.AdsManager;
import cm.aptoide.p092pt.database.RoomStoredMinimalAdPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAdsManagerFactory implements Provider {
    private final Provider<AdsRepository> adsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<RoomStoredMinimalAdPersistence> roomStoredMinimalAdPersistenceProvider;

    public ApplicationModule_ProvidesAdsManagerFactory(ApplicationModule applicationModule, Provider<AdsRepository> provider, Provider<RoomStoredMinimalAdPersistence> provider2) {
        this.module = applicationModule;
        this.adsRepositoryProvider = provider;
        this.roomStoredMinimalAdPersistenceProvider = provider2;
    }

    public static ApplicationModule_ProvidesAdsManagerFactory create(ApplicationModule applicationModule, Provider<AdsRepository> provider, Provider<RoomStoredMinimalAdPersistence> provider2) {
        return new ApplicationModule_ProvidesAdsManagerFactory(applicationModule, provider, provider2);
    }

    public static AdsManager providesAdsManager(ApplicationModule applicationModule, AdsRepository adsRepository, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        return (AdsManager) C9055b.m29112c(applicationModule.providesAdsManager(adsRepository, roomStoredMinimalAdPersistence));
    }

    @Override // javax.inject.Provider
    public AdsManager get() {
        return providesAdsManager(this.module, this.adsRepositoryProvider.get(), this.roomStoredMinimalAdPersistenceProvider.get());
    }
}
