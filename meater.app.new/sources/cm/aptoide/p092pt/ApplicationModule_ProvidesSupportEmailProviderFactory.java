package cm.aptoide.p092pt;

import cm.aptoide.p092pt.view.settings.SupportEmailProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSupportEmailProviderFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<String> supportEmailProvider;

    public ApplicationModule_ProvidesSupportEmailProviderFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.supportEmailProvider = provider;
    }

    public static ApplicationModule_ProvidesSupportEmailProviderFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvidesSupportEmailProviderFactory(applicationModule, provider);
    }

    public static SupportEmailProvider providesSupportEmailProvider(ApplicationModule applicationModule, String str) {
        return (SupportEmailProvider) C9055b.m29112c(applicationModule.providesSupportEmailProvider(str));
    }

    @Override // javax.inject.Provider
    public SupportEmailProvider get() {
        return providesSupportEmailProvider(this.module, this.supportEmailProvider.get());
    }
}
