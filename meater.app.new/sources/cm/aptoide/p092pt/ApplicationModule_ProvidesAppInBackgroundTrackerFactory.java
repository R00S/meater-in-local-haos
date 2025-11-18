package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppInBackgroundTrackerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppInBackgroundTrackerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAppInBackgroundTrackerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAppInBackgroundTrackerFactory(applicationModule);
    }

    public static AppInBackgroundTracker providesAppInBackgroundTracker(ApplicationModule applicationModule) {
        return (AppInBackgroundTracker) C9055b.m29112c(applicationModule.providesAppInBackgroundTracker());
    }

    @Override // javax.inject.Provider
    public AppInBackgroundTracker get() {
        return providesAppInBackgroundTracker(this.module);
    }
}
