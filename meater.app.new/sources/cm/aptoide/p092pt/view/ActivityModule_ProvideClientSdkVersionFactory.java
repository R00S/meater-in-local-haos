package cm.aptoide.p092pt.view;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideClientSdkVersionFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvideClientSdkVersionFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideClientSdkVersionFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideClientSdkVersionFactory(activityModule);
    }

    public static int provideClientSdkVersion(ActivityModule activityModule) {
        return activityModule.provideClientSdkVersion();
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(provideClientSdkVersion(this.module));
    }
}
