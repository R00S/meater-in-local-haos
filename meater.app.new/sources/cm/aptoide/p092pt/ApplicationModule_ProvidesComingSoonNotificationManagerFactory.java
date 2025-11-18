package cm.aptoide.p092pt;

import cm.aptoide.p092pt.home.AppComingSoonRegistrationManager;
import cm.aptoide.p092pt.notification.ComingSoonNotificationManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesComingSoonNotificationManagerFactory implements Provider {
    private final Provider<AppComingSoonRegistrationManager> appComingSoonRegistrationManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesComingSoonNotificationManagerFactory(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationManager> provider) {
        this.module = applicationModule;
        this.appComingSoonRegistrationManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesComingSoonNotificationManagerFactory create(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationManager> provider) {
        return new ApplicationModule_ProvidesComingSoonNotificationManagerFactory(applicationModule, provider);
    }

    public static ComingSoonNotificationManager providesComingSoonNotificationManager(ApplicationModule applicationModule, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        return (ComingSoonNotificationManager) C9055b.m29112c(applicationModule.providesComingSoonNotificationManager(appComingSoonRegistrationManager));
    }

    @Override // javax.inject.Provider
    public ComingSoonNotificationManager get() {
        return providesComingSoonNotificationManager(this.module, this.appComingSoonRegistrationManagerProvider.get());
    }
}
