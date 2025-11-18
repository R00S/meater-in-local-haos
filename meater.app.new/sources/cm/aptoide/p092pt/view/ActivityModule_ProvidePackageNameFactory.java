package cm.aptoide.p092pt.view;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidePackageNameFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvidePackageNameFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidePackageNameFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidePackageNameFactory(activityModule);
    }

    public static String providePackageName(ActivityModule activityModule) {
        return (String) C9055b.m29112c(activityModule.providePackageName());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providePackageName(this.module);
    }
}
