package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.DownloadStateParser;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDownloadStateParserFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDownloadStateParserFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDownloadStateParserFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDownloadStateParserFactory(applicationModule);
    }

    public static DownloadStateParser providesDownloadStateParser(ApplicationModule applicationModule) {
        return (DownloadStateParser) C9055b.m29112c(applicationModule.providesDownloadStateParser());
    }

    @Override // javax.inject.Provider
    public DownloadStateParser get() {
        return providesDownloadStateParser(this.module);
    }
}
