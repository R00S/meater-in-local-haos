package cm.aptoide.p092pt;

import java.util.Collection;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFacebookEventsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFacebookEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFacebookEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFacebookEventsFactory(applicationModule);
    }

    public static Collection<String> provideFacebookEvents(ApplicationModule applicationModule) {
        return (Collection) C9055b.m29112c(applicationModule.provideFacebookEvents());
    }

    @Override // javax.inject.Provider
    public Collection<String> get() {
        return provideFacebookEvents(this.module);
    }
}
