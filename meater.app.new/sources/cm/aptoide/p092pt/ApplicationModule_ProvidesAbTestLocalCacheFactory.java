package cm.aptoide.p092pt;

import cm.aptoide.p092pt.abtesting.ExperimentModel;
import java.util.HashMap;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAbTestLocalCacheFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAbTestLocalCacheFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAbTestLocalCacheFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAbTestLocalCacheFactory(applicationModule);
    }

    public static HashMap<String, ExperimentModel> providesAbTestLocalCache(ApplicationModule applicationModule) {
        return (HashMap) C9055b.m29112c(applicationModule.providesAbTestLocalCache());
    }

    @Override // javax.inject.Provider
    public HashMap<String, ExperimentModel> get() {
        return providesAbTestLocalCache(this.module);
    }
}
