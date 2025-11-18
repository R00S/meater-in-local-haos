package cm.aptoide.p092pt;

import java.util.Collection;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRakamEventsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRakamEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRakamEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRakamEventsFactory(applicationModule);
    }

    public static Collection<String> providesRakamEvents(ApplicationModule applicationModule) {
        return (Collection) C9055b.m29112c(applicationModule.providesRakamEvents());
    }

    @Override // javax.inject.Provider
    public Collection<String> get() {
        return providesRakamEvents(this.module);
    }
}
