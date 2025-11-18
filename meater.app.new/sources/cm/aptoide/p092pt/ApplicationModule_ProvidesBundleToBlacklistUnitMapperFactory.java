package cm.aptoide.p092pt;

import cm.aptoide.p092pt.blacklist.BlacklistUnitMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesBundleToBlacklistUnitMapperFactory(applicationModule);
    }

    public static BlacklistUnitMapper providesBundleToBlacklistUnitMapper(ApplicationModule applicationModule) {
        return (BlacklistUnitMapper) C9055b.m29112c(applicationModule.providesBundleToBlacklistUnitMapper());
    }

    @Override // javax.inject.Provider
    public BlacklistUnitMapper get() {
        return providesBundleToBlacklistUnitMapper(this.module);
    }
}
