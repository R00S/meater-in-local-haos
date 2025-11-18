package cm.aptoide.p092pt;

import android.accounts.AccountManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAccountManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAccountManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAccountManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAccountManagerFactory(applicationModule);
    }

    public static AccountManager provideAccountManager(ApplicationModule applicationModule) {
        return (AccountManager) C9055b.m29112c(applicationModule.provideAccountManager());
    }

    @Override // javax.inject.Provider
    public AccountManager get() {
        return provideAccountManager(this.module);
    }
}
