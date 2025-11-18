package cm.aptoide.p092pt;

import java.util.Collection;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFirebaseEventsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFirebaseEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesFirebaseEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesFirebaseEventsFactory(applicationModule);
    }

    public static Collection<String> providesFirebaseEvents(ApplicationModule applicationModule) {
        return (Collection) C9055b.m29112c(applicationModule.providesFirebaseEvents());
    }

    @Override // javax.inject.Provider
    public Collection<String> get() {
        return providesFirebaseEvents(this.module);
    }
}
