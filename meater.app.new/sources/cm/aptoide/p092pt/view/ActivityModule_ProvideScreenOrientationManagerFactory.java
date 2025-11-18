package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideScreenOrientationManagerFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideScreenOrientationManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideScreenOrientationManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideScreenOrientationManagerFactory(activityModule);
    }

    public static ScreenOrientationManager provideScreenOrientationManager(ActivityModule activityModule) {
        return (ScreenOrientationManager) C9055b.m29112c(activityModule.provideScreenOrientationManager());
    }

    @Override // javax.inject.Provider
    public ScreenOrientationManager get() {
        return provideScreenOrientationManager(this.module);
    }
}
