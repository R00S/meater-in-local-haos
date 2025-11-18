package cm.aptoide.p092pt;

import cm.aptoide.p092pt.crashreports.CrashReport;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesCrashReportsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesCrashReportsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesCrashReportsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesCrashReportsFactory(applicationModule);
    }

    public static CrashReport providesCrashReports(ApplicationModule applicationModule) {
        return (CrashReport) C9055b.m29112c(applicationModule.providesCrashReports());
    }

    @Override // javax.inject.Provider
    public CrashReport get() {
        return providesCrashReports(this.module);
    }
}
