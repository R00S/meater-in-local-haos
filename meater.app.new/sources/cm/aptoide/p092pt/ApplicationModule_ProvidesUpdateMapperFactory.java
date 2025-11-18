package cm.aptoide.p092pt;

import cm.aptoide.p092pt.updates.UpdateMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdateMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdateMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesUpdateMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesUpdateMapperFactory(applicationModule);
    }

    public static UpdateMapper providesUpdateMapper(ApplicationModule applicationModule) {
        return (UpdateMapper) C9055b.m29112c(applicationModule.providesUpdateMapper());
    }

    @Override // javax.inject.Provider
    public UpdateMapper get() {
        return providesUpdateMapper(this.module);
    }
}
