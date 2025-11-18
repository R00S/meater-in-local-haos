package cm.aptoide.p092pt;

import java.util.Collection;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesIndicativeEventsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesIndicativeEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesIndicativeEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesIndicativeEventsFactory(applicationModule);
    }

    public static Collection<String> providesIndicativeEvents(ApplicationModule applicationModule) {
        return (Collection) C9055b.m29112c(applicationModule.providesIndicativeEvents());
    }

    @Override // javax.inject.Provider
    public Collection<String> get() {
        return providesIndicativeEvents(this.module);
    }
}
