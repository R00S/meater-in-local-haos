package cm.aptoide.p092pt;

import cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesMapToJsonMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMapToJsonMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMapToJsonMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMapToJsonMapperFactory(applicationModule);
    }

    public static MapToJsonMapper providesMapToJsonMapper(ApplicationModule applicationModule) {
        return (MapToJsonMapper) C9055b.m29112c(applicationModule.providesMapToJsonMapper());
    }

    @Override // javax.inject.Provider
    public MapToJsonMapper get() {
        return providesMapToJsonMapper(this.module);
    }
}
