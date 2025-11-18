package cm.aptoide.p092pt;

import cm.aptoide.p092pt.aab.DynamicSplitsMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDynamicSplitsMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDynamicSplitsMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDynamicSplitsMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDynamicSplitsMapperFactory(applicationModule);
    }

    public static DynamicSplitsMapper providesDynamicSplitsMapper(ApplicationModule applicationModule) {
        return (DynamicSplitsMapper) C9055b.m29112c(applicationModule.providesDynamicSplitsMapper());
    }

    @Override // javax.inject.Provider
    public DynamicSplitsMapper get() {
        return providesDynamicSplitsMapper(this.module);
    }
}
