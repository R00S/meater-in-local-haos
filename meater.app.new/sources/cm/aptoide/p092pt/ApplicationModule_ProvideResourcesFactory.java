package cm.aptoide.p092pt;

import android.content.res.Resources;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideResourcesFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideResourcesFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideResourcesFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideResourcesFactory(applicationModule);
    }

    public static Resources provideResources(ApplicationModule applicationModule) {
        return (Resources) C9055b.m29112c(applicationModule.provideResources());
    }

    @Override // javax.inject.Provider
    public Resources get() {
        return provideResources(this.module);
    }
}
