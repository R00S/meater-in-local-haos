package cm.aptoide.p092pt;

import cm.aptoide.p092pt.sync.SyncScheduler;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideSyncSchedulerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<SyncStorage> syncStorageProvider;

    public ApplicationModule_ProvideSyncSchedulerFactory(ApplicationModule applicationModule, Provider<SyncStorage> provider) {
        this.module = applicationModule;
        this.syncStorageProvider = provider;
    }

    public static ApplicationModule_ProvideSyncSchedulerFactory create(ApplicationModule applicationModule, Provider<SyncStorage> provider) {
        return new ApplicationModule_ProvideSyncSchedulerFactory(applicationModule, provider);
    }

    public static SyncScheduler provideSyncScheduler(ApplicationModule applicationModule, SyncStorage syncStorage) {
        return (SyncScheduler) C9055b.m29112c(applicationModule.provideSyncScheduler(syncStorage));
    }

    @Override // javax.inject.Provider
    public SyncScheduler get() {
        return provideSyncScheduler(this.module, this.syncStorageProvider.get());
    }
}
