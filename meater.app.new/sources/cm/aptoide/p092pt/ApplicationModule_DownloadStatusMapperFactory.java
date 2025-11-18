package cm.aptoide.p092pt;

import cm.aptoide.p092pt.downloadmanager.DownloadStatusMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_DownloadStatusMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_DownloadStatusMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_DownloadStatusMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_DownloadStatusMapperFactory(applicationModule);
    }

    public static DownloadStatusMapper downloadStatusMapper(ApplicationModule applicationModule) {
        return (DownloadStatusMapper) C9055b.m29112c(applicationModule.downloadStatusMapper());
    }

    @Override // javax.inject.Provider
    public DownloadStatusMapper get() {
        return downloadStatusMapper(this.module);
    }
}
