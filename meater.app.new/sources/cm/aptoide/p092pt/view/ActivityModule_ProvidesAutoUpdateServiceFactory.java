package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.autoupdate.AutoUpdateService;
import cm.aptoide.p092pt.autoupdate.Service;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesAutoUpdateServiceFactory implements Provider {
    private final Provider<Integer> clientSdkVersionProvider;
    private final ActivityModule module;
    private final Provider<String> packageNameProvider;
    private final Provider<Service> serviceProvider;

    public ActivityModule_ProvidesAutoUpdateServiceFactory(ActivityModule activityModule, Provider<Service> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.module = activityModule;
        this.serviceProvider = provider;
        this.packageNameProvider = provider2;
        this.clientSdkVersionProvider = provider3;
    }

    public static ActivityModule_ProvidesAutoUpdateServiceFactory create(ActivityModule activityModule, Provider<Service> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new ActivityModule_ProvidesAutoUpdateServiceFactory(activityModule, provider, provider2, provider3);
    }

    public static AutoUpdateService providesAutoUpdateService(ActivityModule activityModule, Service service, String str, int i2) {
        return (AutoUpdateService) C9055b.m29112c(activityModule.providesAutoUpdateService(service, str, i2));
    }

    @Override // javax.inject.Provider
    public AutoUpdateService get() {
        return providesAutoUpdateService(this.module, this.serviceProvider.get(), this.packageNameProvider.get(), this.clientSdkVersionProvider.get().intValue());
    }
}
