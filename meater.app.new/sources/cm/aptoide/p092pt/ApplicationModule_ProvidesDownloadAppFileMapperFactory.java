package cm.aptoide.p092pt;

import cm.aptoide.p092pt.downloadmanager.DownloadAppFileMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDownloadAppFileMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadAppFileMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDownloadAppFileMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDownloadAppFileMapperFactory(applicationModule);
    }

    public static DownloadAppFileMapper providesDownloadAppFileMapper(ApplicationModule applicationModule) {
        return (DownloadAppFileMapper) C9055b.m29112c(applicationModule.providesDownloadAppFileMapper());
    }

    @Override // javax.inject.Provider
    public DownloadAppFileMapper get() {
        return providesDownloadAppFileMapper(this.module);
    }
}
