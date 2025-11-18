package cm.aptoide.p092pt;

import com.facebook.p157o0.C5813a0;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAppEventsLoggerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAppEventsLoggerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAppEventsLoggerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAppEventsLoggerFactory(applicationModule);
    }

    public static C5813a0 provideAppEventsLogger(ApplicationModule applicationModule) {
        return (C5813a0) C9055b.m29112c(applicationModule.provideAppEventsLogger());
    }

    @Override // javax.inject.Provider
    public C5813a0 get() {
        return provideAppEventsLogger(this.module);
    }
}
