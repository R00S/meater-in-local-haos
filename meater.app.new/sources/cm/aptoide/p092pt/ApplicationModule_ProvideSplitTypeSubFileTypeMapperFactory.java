package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.SplitTypeSubFileTypeMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideSplitTypeSubFileTypeMapperFactory(applicationModule);
    }

    public static SplitTypeSubFileTypeMapper provideSplitTypeSubFileTypeMapper(ApplicationModule applicationModule) {
        return (SplitTypeSubFileTypeMapper) C9055b.m29112c(applicationModule.provideSplitTypeSubFileTypeMapper());
    }

    @Override // javax.inject.Provider
    public SplitTypeSubFileTypeMapper get() {
        return provideSplitTypeSubFileTypeMapper(this.module);
    }
}
