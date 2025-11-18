package cm.aptoide.p092pt;

import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.notification.NotificationProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideNotificationProviderFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<RoomNotificationPersistence> notificationPersistenceProvider;

    public ApplicationModule_ProvideNotificationProviderFactory(ApplicationModule applicationModule, Provider<RoomNotificationPersistence> provider) {
        this.module = applicationModule;
        this.notificationPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvideNotificationProviderFactory create(ApplicationModule applicationModule, Provider<RoomNotificationPersistence> provider) {
        return new ApplicationModule_ProvideNotificationProviderFactory(applicationModule, provider);
    }

    public static NotificationProvider provideNotificationProvider(ApplicationModule applicationModule, RoomNotificationPersistence roomNotificationPersistence) {
        return (NotificationProvider) C9055b.m29112c(applicationModule.provideNotificationProvider(roomNotificationPersistence));
    }

    @Override // javax.inject.Provider
    public NotificationProvider get() {
        return provideNotificationProvider(this.module, this.notificationPersistenceProvider.get());
    }
}
