package cm.aptoide.p092pt;

import cm.aptoide.p092pt.notification.UpdatesNotificationManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdatesNotificationManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdatesNotificationManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesUpdatesNotificationManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesUpdatesNotificationManagerFactory(applicationModule);
    }

    public static UpdatesNotificationManager providesUpdatesNotificationManager(ApplicationModule applicationModule) {
        return (UpdatesNotificationManager) C9055b.m29112c(applicationModule.providesUpdatesNotificationManager());
    }

    @Override // javax.inject.Provider
    public UpdatesNotificationManager get() {
        return providesUpdatesNotificationManager(this.module);
    }
}
