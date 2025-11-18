package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideRootInstallationRetryHandlerFactory implements Provider {
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideRootInstallationRetryHandlerFactory(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
    }

    public static ApplicationModule_ProvideRootInstallationRetryHandlerFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        return new ApplicationModule_ProvideRootInstallationRetryHandlerFactory(applicationModule, provider);
    }

    public static RootInstallationRetryHandler provideRootInstallationRetryHandler(ApplicationModule applicationModule, InstallManager installManager) {
        return (RootInstallationRetryHandler) C9055b.m29112c(applicationModule.provideRootInstallationRetryHandler(installManager));
    }

    @Override // javax.inject.Provider
    public RootInstallationRetryHandler get() {
        return provideRootInstallationRetryHandler(this.module, this.installManagerProvider.get());
    }
}
