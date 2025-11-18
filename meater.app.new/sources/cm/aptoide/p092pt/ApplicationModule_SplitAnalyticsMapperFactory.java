package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_SplitAnalyticsMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_SplitAnalyticsMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_SplitAnalyticsMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_SplitAnalyticsMapperFactory(applicationModule);
    }

    public static SplitAnalyticsMapper splitAnalyticsMapper(ApplicationModule applicationModule) {
        return (SplitAnalyticsMapper) C9055b.m29112c(applicationModule.splitAnalyticsMapper());
    }

    @Override // javax.inject.Provider
    public SplitAnalyticsMapper get() {
        return splitAnalyticsMapper(this.module);
    }
}
