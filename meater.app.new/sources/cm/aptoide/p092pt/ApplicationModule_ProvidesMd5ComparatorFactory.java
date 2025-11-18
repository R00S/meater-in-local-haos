package cm.aptoide.p092pt;

import cm.aptoide.p092pt.download.Md5Comparator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesMd5ComparatorFactory implements Provider {
    private final Provider<String> cachePathProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMd5ComparatorFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.cachePathProvider = provider;
    }

    public static ApplicationModule_ProvidesMd5ComparatorFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvidesMd5ComparatorFactory(applicationModule, provider);
    }

    public static Md5Comparator providesMd5Comparator(ApplicationModule applicationModule, String str) {
        return (Md5Comparator) C9055b.m29112c(applicationModule.providesMd5Comparator(str));
    }

    @Override // javax.inject.Provider
    public Md5Comparator get() {
        return providesMd5Comparator(this.module, this.cachePathProvider.get());
    }
}
