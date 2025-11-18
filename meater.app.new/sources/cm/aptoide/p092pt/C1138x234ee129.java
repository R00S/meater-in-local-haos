package cm.aptoide.p092pt;

import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.install.PackageRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAdsApplicationVersionCodeProviderFactory */
/* loaded from: classes.dex */
public final class C1138x234ee129 implements Provider {
    private final ApplicationModule module;
    private final Provider<PackageRepository> packageRepositoryProvider;

    public C1138x234ee129(ApplicationModule applicationModule, Provider<PackageRepository> provider) {
        this.module = applicationModule;
        this.packageRepositoryProvider = provider;
    }

    public static C1138x234ee129 create(ApplicationModule applicationModule, Provider<PackageRepository> provider) {
        return new C1138x234ee129(applicationModule, provider);
    }

    public static AdsApplicationVersionCodeProvider providesAdsApplicationVersionCodeProvider(ApplicationModule applicationModule, PackageRepository packageRepository) {
        return (AdsApplicationVersionCodeProvider) C9055b.m29112c(applicationModule.providesAdsApplicationVersionCodeProvider(packageRepository));
    }

    @Override // javax.inject.Provider
    public AdsApplicationVersionCodeProvider get() {
        return providesAdsApplicationVersionCodeProvider(this.module, this.packageRepositoryProvider.get());
    }
}
