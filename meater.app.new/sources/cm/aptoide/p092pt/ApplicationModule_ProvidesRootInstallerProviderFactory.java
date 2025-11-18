package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.InstallerAnalytics;
import cm.aptoide.p092pt.install.RootInstallerProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesRootInstallerProviderFactory implements Provider {
    private final Provider<InstallerAnalytics> installerAnalyticsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRootInstallerProviderFactory(ApplicationModule applicationModule, Provider<InstallerAnalytics> provider) {
        this.module = applicationModule;
        this.installerAnalyticsProvider = provider;
    }

    public static ApplicationModule_ProvidesRootInstallerProviderFactory create(ApplicationModule applicationModule, Provider<InstallerAnalytics> provider) {
        return new ApplicationModule_ProvidesRootInstallerProviderFactory(applicationModule, provider);
    }

    public static RootInstallerProvider providesRootInstallerProvider(ApplicationModule applicationModule, InstallerAnalytics installerAnalytics) {
        return (RootInstallerProvider) C9055b.m29112c(applicationModule.providesRootInstallerProvider(installerAnalytics));
    }

    @Override // javax.inject.Provider
    public RootInstallerProvider get() {
        return providesRootInstallerProvider(this.module, this.installerAnalyticsProvider.get());
    }
}
