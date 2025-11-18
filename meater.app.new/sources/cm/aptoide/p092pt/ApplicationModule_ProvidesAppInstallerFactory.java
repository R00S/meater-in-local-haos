package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import cm.aptoide.p092pt.packageinstaller.AppInstaller;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppInstallerFactory implements Provider {
    private final Provider<AppInstallerStatusReceiver> appInstallerStatusReceiverProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppInstallerFactory(ApplicationModule applicationModule, Provider<AppInstallerStatusReceiver> provider) {
        this.module = applicationModule;
        this.appInstallerStatusReceiverProvider = provider;
    }

    public static ApplicationModule_ProvidesAppInstallerFactory create(ApplicationModule applicationModule, Provider<AppInstallerStatusReceiver> provider) {
        return new ApplicationModule_ProvidesAppInstallerFactory(applicationModule, provider);
    }

    public static AppInstaller providesAppInstaller(ApplicationModule applicationModule, AppInstallerStatusReceiver appInstallerStatusReceiver) {
        return (AppInstaller) C9055b.m29112c(applicationModule.providesAppInstaller(appInstallerStatusReceiver));
    }

    @Override // javax.inject.Provider
    public AppInstaller get() {
        return providesAppInstaller(this.module, this.appInstallerStatusReceiverProvider.get());
    }
}
