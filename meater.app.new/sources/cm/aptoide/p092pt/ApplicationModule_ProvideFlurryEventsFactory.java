package cm.aptoide.p092pt;

import java.util.Collection;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFlurryEventsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFlurryEventsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFlurryEventsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFlurryEventsFactory(applicationModule);
    }

    public static Collection<String> provideFlurryEvents(ApplicationModule applicationModule) {
        return (Collection) C9055b.m29112c(applicationModule.provideFlurryEvents());
    }

    @Override // javax.inject.Provider
    public Collection<String> get() {
        return provideFlurryEvents(this.module);
    }
}
