package cm.aptoide.p092pt;

import android.accounts.AccountManager;
import cm.aptoide.p092pt.account.AndroidAccountProvider;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAndroidAccountProviderFactory implements Provider {
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<String> accountTypeProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideAndroidAccountProviderFactory(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<String> provider2) {
        this.module = applicationModule;
        this.accountManagerProvider = provider;
        this.accountTypeProvider = provider2;
    }

    public static ApplicationModule_ProvideAndroidAccountProviderFactory create(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<String> provider2) {
        return new ApplicationModule_ProvideAndroidAccountProviderFactory(applicationModule, provider, provider2);
    }

    public static AndroidAccountProvider provideAndroidAccountProvider(ApplicationModule applicationModule, AccountManager accountManager, String str) {
        return (AndroidAccountProvider) C9055b.m29112c(applicationModule.provideAndroidAccountProvider(accountManager, str));
    }

    @Override // javax.inject.Provider
    public AndroidAccountProvider get() {
        return provideAndroidAccountProvider(this.module, this.accountManagerProvider.get(), this.accountTypeProvider.get());
    }
}
