package cm.aptoide.p092pt;

import cm.aptoide.p092pt.install.PackageRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesPackageRepositoryFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPackageRepositoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesPackageRepositoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesPackageRepositoryFactory(applicationModule);
    }

    public static PackageRepository providesPackageRepository(ApplicationModule applicationModule) {
        return (PackageRepository) C9055b.m29112c(applicationModule.providesPackageRepository());
    }

    @Override // javax.inject.Provider
    public PackageRepository get() {
        return providesPackageRepository(this.module);
    }
}
