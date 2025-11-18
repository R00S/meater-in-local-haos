package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReadyToInstallNotificationManagerFactory */
/* loaded from: classes.dex */
public final class C1140xa0c4ceda implements Provider {
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public C1140xa0c4ceda(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
    }

    public static C1140xa0c4ceda create(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        return new C1140xa0c4ceda(applicationModule, provider);
    }

    public static ReadyToInstallNotificationManager providesReadyToInstallNotificationManager(ApplicationModule applicationModule, InstallManager installManager) {
        return (ReadyToInstallNotificationManager) C9055b.m29112c(applicationModule.providesReadyToInstallNotificationManager(installManager));
    }

    @Override // javax.inject.Provider
    public ReadyToInstallNotificationManager get() {
        return providesReadyToInstallNotificationManager(this.module, this.installManagerProvider.get());
    }
}
