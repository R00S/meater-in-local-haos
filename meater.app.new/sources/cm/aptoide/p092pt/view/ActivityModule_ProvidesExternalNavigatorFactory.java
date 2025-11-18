package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.navigator.ExternalNavigator;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesExternalNavigatorFactory implements Provider {
    private final ActivityModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvidesExternalNavigatorFactory(ActivityModule activityModule, Provider<ThemeManager> provider) {
        this.module = activityModule;
        this.themeManagerProvider = provider;
    }

    public static ActivityModule_ProvidesExternalNavigatorFactory create(ActivityModule activityModule, Provider<ThemeManager> provider) {
        return new ActivityModule_ProvidesExternalNavigatorFactory(activityModule, provider);
    }

    public static ExternalNavigator providesExternalNavigator(ActivityModule activityModule, ThemeManager themeManager) {
        return (ExternalNavigator) C9055b.m29112c(activityModule.providesExternalNavigator(themeManager));
    }

    @Override // javax.inject.Provider
    public ExternalNavigator get() {
        return providesExternalNavigator(this.module, this.themeManagerProvider.get());
    }
}
