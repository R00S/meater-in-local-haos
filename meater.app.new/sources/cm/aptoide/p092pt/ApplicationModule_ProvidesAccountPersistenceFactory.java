package cm.aptoide.p092pt;

import android.accounts.AccountManager;
import cm.aptoide.accountmanager.AccountFactory;
import cm.aptoide.accountmanager.AccountPersistence;
import cm.aptoide.p092pt.account.AndroidAccountProvider;
import cm.aptoide.p092pt.account.DatabaseStoreDataPersist;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesAccountPersistenceFactory implements Provider {
    private final Provider<AccountFactory> accountFactoryProvider;
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<AndroidAccountProvider> androidAccountProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<DatabaseStoreDataPersist> databaseStoreDataPersistProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAccountPersistenceFactory(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<DatabaseStoreDataPersist> provider2, Provider<AccountFactory> provider3, Provider<AndroidAccountProvider> provider4, Provider<AuthenticationPersistence> provider5) {
        this.module = applicationModule;
        this.accountManagerProvider = provider;
        this.databaseStoreDataPersistProvider = provider2;
        this.accountFactoryProvider = provider3;
        this.androidAccountProvider = provider4;
        this.authenticationPersistenceProvider = provider5;
    }

    public static ApplicationModule_ProvidesAccountPersistenceFactory create(ApplicationModule applicationModule, Provider<AccountManager> provider, Provider<DatabaseStoreDataPersist> provider2, Provider<AccountFactory> provider3, Provider<AndroidAccountProvider> provider4, Provider<AuthenticationPersistence> provider5) {
        return new ApplicationModule_ProvidesAccountPersistenceFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AccountPersistence providesAccountPersistence(ApplicationModule applicationModule, AccountManager accountManager, DatabaseStoreDataPersist databaseStoreDataPersist, AccountFactory accountFactory, AndroidAccountProvider androidAccountProvider, AuthenticationPersistence authenticationPersistence) {
        return (AccountPersistence) C9055b.m29112c(applicationModule.providesAccountPersistence(accountManager, databaseStoreDataPersist, accountFactory, androidAccountProvider, authenticationPersistence));
    }

    @Override // javax.inject.Provider
    public AccountPersistence get() {
        return providesAccountPersistence(this.module, this.accountManagerProvider.get(), this.databaseStoreDataPersistProvider.get(), this.accountFactoryProvider.get(), this.androidAccountProvider.get(), this.authenticationPersistenceProvider.get());
    }
}
