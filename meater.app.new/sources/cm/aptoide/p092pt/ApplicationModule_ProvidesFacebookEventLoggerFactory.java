package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.EventLogger;
import com.facebook.p157o0.C5813a0;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFacebookEventLoggerFactory implements Provider {
    private final Provider<C5813a0> facebookProvider;
    private final Provider<AnalyticsLogger> loggerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFacebookEventLoggerFactory(ApplicationModule applicationModule, Provider<C5813a0> provider, Provider<AnalyticsLogger> provider2) {
        this.module = applicationModule;
        this.facebookProvider = provider;
        this.loggerProvider = provider2;
    }

    public static ApplicationModule_ProvidesFacebookEventLoggerFactory create(ApplicationModule applicationModule, Provider<C5813a0> provider, Provider<AnalyticsLogger> provider2) {
        return new ApplicationModule_ProvidesFacebookEventLoggerFactory(applicationModule, provider, provider2);
    }

    public static EventLogger providesFacebookEventLogger(ApplicationModule applicationModule, C5813a0 c5813a0, AnalyticsLogger analyticsLogger) {
        return (EventLogger) C9055b.m29112c(applicationModule.providesFacebookEventLogger(c5813a0, analyticsLogger));
    }

    @Override // javax.inject.Provider
    public EventLogger get() {
        return providesFacebookEventLogger(this.module, this.facebookProvider.get(), this.loggerProvider.get());
    }
}
