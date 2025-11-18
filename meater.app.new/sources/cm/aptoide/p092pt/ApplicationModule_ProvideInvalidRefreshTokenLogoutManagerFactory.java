package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory implements Provider {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final ApplicationModule module;
    private final Provider<TokenInvalidator> refreshTokenInvalidatorProvider;

    public ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<TokenInvalidator> provider2) {
        this.module = applicationModule;
        this.aptoideAccountManagerProvider = provider;
        this.refreshTokenInvalidatorProvider = provider2;
    }

    public static ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory create(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<TokenInvalidator> provider2) {
        return new ApplicationModule_ProvideInvalidRefreshTokenLogoutManagerFactory(applicationModule, provider, provider2);
    }

    public static InvalidRefreshTokenLogoutManager provideInvalidRefreshTokenLogoutManager(ApplicationModule applicationModule, AptoideAccountManager aptoideAccountManager, TokenInvalidator tokenInvalidator) {
        return (InvalidRefreshTokenLogoutManager) C9055b.m29112c(applicationModule.provideInvalidRefreshTokenLogoutManager(aptoideAccountManager, tokenInvalidator));
    }

    @Override // javax.inject.Provider
    public InvalidRefreshTokenLogoutManager get() {
        return provideInvalidRefreshTokenLogoutManager(this.module, this.aptoideAccountManagerProvider.get(), this.refreshTokenInvalidatorProvider.get());
    }
}
