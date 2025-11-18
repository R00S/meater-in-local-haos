package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesThemeManagerFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvidesThemeManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidesThemeManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidesThemeManagerFactory(activityModule);
    }

    public static ThemeManager providesThemeManager(ActivityModule activityModule) {
        return (ThemeManager) C9055b.m29112c(activityModule.providesThemeManager());
    }

    @Override // javax.inject.Provider
    public ThemeManager get() {
        return providesThemeManager(this.module);
    }
}
