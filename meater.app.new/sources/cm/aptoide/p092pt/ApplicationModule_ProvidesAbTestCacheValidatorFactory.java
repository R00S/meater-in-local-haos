package cm.aptoide.p092pt;

import cm.aptoide.p092pt.abtesting.AbTestCacheValidator;
import cm.aptoide.p092pt.abtesting.ExperimentModel;
import java.util.HashMap;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAbTestCacheValidatorFactory implements Provider {
    private final Provider<HashMap<String, ExperimentModel>> localCacheProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAbTestCacheValidatorFactory(ApplicationModule applicationModule, Provider<HashMap<String, ExperimentModel>> provider) {
        this.module = applicationModule;
        this.localCacheProvider = provider;
    }

    public static ApplicationModule_ProvidesAbTestCacheValidatorFactory create(ApplicationModule applicationModule, Provider<HashMap<String, ExperimentModel>> provider) {
        return new ApplicationModule_ProvidesAbTestCacheValidatorFactory(applicationModule, provider);
    }

    public static AbTestCacheValidator providesAbTestCacheValidator(ApplicationModule applicationModule, HashMap<String, ExperimentModel> map) {
        return (AbTestCacheValidator) C9055b.m29112c(applicationModule.providesAbTestCacheValidator(map));
    }

    @Override // javax.inject.Provider
    public AbTestCacheValidator get() {
        return providesAbTestCacheValidator(this.module, this.localCacheProvider.get());
    }
}
