package cm.aptoide.p092pt;

import cm.aptoide.p092pt.home.bundles.ads.AdMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAdMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAdMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAdMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAdMapperFactory(applicationModule);
    }

    public static AdMapper providesAdMapper(ApplicationModule applicationModule) {
        return (AdMapper) C9055b.m29112c(applicationModule.providesAdMapper());
    }

    @Override // javax.inject.Provider
    public AdMapper get() {
        return providesAdMapper(this.module);
    }
}
