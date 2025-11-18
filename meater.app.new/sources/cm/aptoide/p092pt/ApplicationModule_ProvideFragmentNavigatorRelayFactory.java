package cm.aptoide.p092pt;

import cm.aptoide.p092pt.navigator.Result;
import java.util.Map;
import javax.inject.Provider;
import p241e.p294g.p306b.C8986a;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFragmentNavigatorRelayFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFragmentNavigatorRelayFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFragmentNavigatorRelayFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFragmentNavigatorRelayFactory(applicationModule);
    }

    public static C8986a<Map<Integer, Result>> provideFragmentNavigatorRelay(ApplicationModule applicationModule) {
        return (C8986a) C9055b.m29112c(applicationModule.provideFragmentNavigatorRelay());
    }

    @Override // javax.inject.Provider
    public C8986a<Map<Integer, Result>> get() {
        return provideFragmentNavigatorRelay(this.module);
    }
}
