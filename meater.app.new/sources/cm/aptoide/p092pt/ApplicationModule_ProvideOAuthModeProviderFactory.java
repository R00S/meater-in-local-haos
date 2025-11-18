package cm.aptoide.p092pt;

import cm.aptoide.p092pt.account.OAuthModeProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideOAuthModeProviderFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideOAuthModeProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideOAuthModeProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideOAuthModeProviderFactory(applicationModule);
    }

    public static OAuthModeProvider provideOAuthModeProvider(ApplicationModule applicationModule) {
        return (OAuthModeProvider) C9055b.m29112c(applicationModule.provideOAuthModeProvider());
    }

    @Override // javax.inject.Provider
    public OAuthModeProvider get() {
        return provideOAuthModeProvider(this.module);
    }
}
