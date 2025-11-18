package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.FilePathProvider;
import cm.aptoide.p092pt.install.InstallAppSizeValidator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesInstallAppSizeValidatorFactory implements Provider {
    private final Provider<FilePathProvider> filePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesInstallAppSizeValidatorFactory(ApplicationModule applicationModule, Provider<FilePathProvider> provider) {
        this.module = applicationModule;
        this.filePathProvider = provider;
    }

    public static ApplicationModule_ProvidesInstallAppSizeValidatorFactory create(ApplicationModule applicationModule, Provider<FilePathProvider> provider) {
        return new ApplicationModule_ProvidesInstallAppSizeValidatorFactory(applicationModule, provider);
    }

    public static InstallAppSizeValidator providesInstallAppSizeValidator(ApplicationModule applicationModule, FilePathProvider filePathProvider) {
        return (InstallAppSizeValidator) C9055b.m29112c(applicationModule.providesInstallAppSizeValidator(filePathProvider));
    }

    @Override // javax.inject.Provider
    public InstallAppSizeValidator get() {
        return providesInstallAppSizeValidator(this.module, this.filePathProvider.get());
    }
}
