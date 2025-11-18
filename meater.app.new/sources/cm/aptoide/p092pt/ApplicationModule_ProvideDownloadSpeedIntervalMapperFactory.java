package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.DownloadSpeedIntervalMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDownloadSpeedIntervalMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideDownloadSpeedIntervalMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideDownloadSpeedIntervalMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideDownloadSpeedIntervalMapperFactory(applicationModule);
    }

    public static DownloadSpeedIntervalMapper provideDownloadSpeedIntervalMapper(ApplicationModule applicationModule) {
        return (DownloadSpeedIntervalMapper) C9055b.m29112c(applicationModule.provideDownloadSpeedIntervalMapper());
    }

    @Override // javax.inject.Provider
    public DownloadSpeedIntervalMapper get() {
        return provideDownloadSpeedIntervalMapper(this.module);
    }
}
