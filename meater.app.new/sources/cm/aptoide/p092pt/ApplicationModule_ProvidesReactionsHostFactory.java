package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReactionsHostFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesReactionsHostFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesReactionsHostFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesReactionsHostFactory(applicationModule);
    }

    public static String providesReactionsHost(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.providesReactionsHost());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesReactionsHost(this.module);
    }
}
