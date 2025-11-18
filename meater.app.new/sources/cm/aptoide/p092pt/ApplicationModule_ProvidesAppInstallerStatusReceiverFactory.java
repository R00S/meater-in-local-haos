package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.AppInstallerStatusReceiver;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAppInstallerStatusReceiverFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppInstallerStatusReceiverFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAppInstallerStatusReceiverFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAppInstallerStatusReceiverFactory(applicationModule);
    }

    public static AppInstallerStatusReceiver providesAppInstallerStatusReceiver(ApplicationModule applicationModule) {
        return (AppInstallerStatusReceiver) C9055b.m29112c(applicationModule.providesAppInstallerStatusReceiver());
    }

    @Override // javax.inject.Provider
    public AppInstallerStatusReceiver get() {
        return providesAppInstallerStatusReceiver(this.module);
    }
}
