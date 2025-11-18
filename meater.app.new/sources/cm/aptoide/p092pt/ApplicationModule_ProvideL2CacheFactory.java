package cm.aptoide.p092pt;

import cm.aptoide.p092pt.dataprovider.cache.L2Cache;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideL2CacheFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideL2CacheFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideL2CacheFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideL2CacheFactory(applicationModule);
    }

    public static L2Cache provideL2Cache(ApplicationModule applicationModule) {
        return (L2Cache) C9055b.m29112c(applicationModule.provideL2Cache());
    }

    @Override // javax.inject.Provider
    public L2Cache get() {
        return provideL2Cache(this.module);
    }
}
