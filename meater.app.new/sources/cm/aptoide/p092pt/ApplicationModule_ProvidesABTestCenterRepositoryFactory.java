package cm.aptoide.p092pt;

import cm.aptoide.p092pt.abtesting.ABTestCenterRepository;
import cm.aptoide.p092pt.abtesting.ABTestService;
import cm.aptoide.p092pt.abtesting.AbTestCacheValidator;
import cm.aptoide.p092pt.abtesting.ExperimentModel;
import cm.aptoide.p092pt.database.RoomExperimentPersistence;
import java.util.HashMap;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesABTestCenterRepositoryFactory implements Provider {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<AbTestCacheValidator> cacheValidatorProvider;
    private final Provider<HashMap<String, ExperimentModel>> localCacheProvider;
    private final ApplicationModule module;
    private final Provider<RoomExperimentPersistence> persistenceProvider;

    public ApplicationModule_ProvidesABTestCenterRepositoryFactory(ApplicationModule applicationModule, Provider<ABTestService> provider, Provider<RoomExperimentPersistence> provider2, Provider<HashMap<String, ExperimentModel>> provider3, Provider<AbTestCacheValidator> provider4) {
        this.module = applicationModule;
        this.abTestServiceProvider = provider;
        this.persistenceProvider = provider2;
        this.localCacheProvider = provider3;
        this.cacheValidatorProvider = provider4;
    }

    public static ApplicationModule_ProvidesABTestCenterRepositoryFactory create(ApplicationModule applicationModule, Provider<ABTestService> provider, Provider<RoomExperimentPersistence> provider2, Provider<HashMap<String, ExperimentModel>> provider3, Provider<AbTestCacheValidator> provider4) {
        return new ApplicationModule_ProvidesABTestCenterRepositoryFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static ABTestCenterRepository providesABTestCenterRepository(ApplicationModule applicationModule, ABTestService aBTestService, RoomExperimentPersistence roomExperimentPersistence, HashMap<String, ExperimentModel> map, AbTestCacheValidator abTestCacheValidator) {
        return (ABTestCenterRepository) C9055b.m29112c(applicationModule.providesABTestCenterRepository(aBTestService, roomExperimentPersistence, map, abTestCacheValidator));
    }

    @Override // javax.inject.Provider
    public ABTestCenterRepository get() {
        return providesABTestCenterRepository(this.module, this.abTestServiceProvider.get(), this.persistenceProvider.get(), this.localCacheProvider.get(), this.cacheValidatorProvider.get());
    }
}
