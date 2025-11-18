package cm.aptoide.p092pt;

import cm.aptoide.p092pt.aab.SplitsMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSplitsMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSplitsMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSplitsMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSplitsMapperFactory(applicationModule);
    }

    public static SplitsMapper providesSplitsMapper(ApplicationModule applicationModule) {
        return (SplitsMapper) C9055b.m29112c(applicationModule.providesSplitsMapper());
    }

    @Override // javax.inject.Provider
    public SplitsMapper get() {
        return providesSplitsMapper(this.module);
    }
}
