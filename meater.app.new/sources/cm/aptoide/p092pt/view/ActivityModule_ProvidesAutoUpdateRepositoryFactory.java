package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.autoupdate.AutoUpdateRepository;
import cm.aptoide.p092pt.autoupdate.AutoUpdateService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesAutoUpdateRepositoryFactory implements Provider {
    private final Provider<AutoUpdateService> autoUpdateServiceProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesAutoUpdateRepositoryFactory(ActivityModule activityModule, Provider<AutoUpdateService> provider) {
        this.module = activityModule;
        this.autoUpdateServiceProvider = provider;
    }

    public static ActivityModule_ProvidesAutoUpdateRepositoryFactory create(ActivityModule activityModule, Provider<AutoUpdateService> provider) {
        return new ActivityModule_ProvidesAutoUpdateRepositoryFactory(activityModule, provider);
    }

    public static AutoUpdateRepository providesAutoUpdateRepository(ActivityModule activityModule, AutoUpdateService autoUpdateService) {
        return (AutoUpdateRepository) C9055b.m29112c(activityModule.providesAutoUpdateRepository(autoUpdateService));
    }

    @Override // javax.inject.Provider
    public AutoUpdateRepository get() {
        return providesAutoUpdateRepository(this.module, this.autoUpdateServiceProvider.get());
    }
}
