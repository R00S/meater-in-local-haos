package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AccountPersistence;
import cm.aptoide.accountmanager.AccountService;
import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.account.LoginPreferences;
import cm.aptoide.p092pt.account.view.store.StoreManager;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAptoideAccountManagerFactory implements Provider {
    private final Provider<AccountPersistence> accountPersistenceProvider;
    private final Provider<AccountService> accountServiceProvider;
    private final Provider<AdultContent> adultContentProvider;
    private final Provider<List<String>> facebookPermissionsProvider;
    private final Provider<GoogleApiClient> googleApiClientProvider;
    private final Provider<LoginPreferences> loginPreferencesProvider;
    private final ApplicationModule module;
    private final Provider<StoreManager> storeManagerProvider;

    public ApplicationModule_ProvideAptoideAccountManagerFactory(ApplicationModule applicationModule, Provider<AdultContent> provider, Provider<GoogleApiClient> provider2, Provider<StoreManager> provider3, Provider<AccountService> provider4, Provider<LoginPreferences> provider5, Provider<AccountPersistence> provider6, Provider<List<String>> provider7) {
        this.module = applicationModule;
        this.adultContentProvider = provider;
        this.googleApiClientProvider = provider2;
        this.storeManagerProvider = provider3;
        this.accountServiceProvider = provider4;
        this.loginPreferencesProvider = provider5;
        this.accountPersistenceProvider = provider6;
        this.facebookPermissionsProvider = provider7;
    }

    public static ApplicationModule_ProvideAptoideAccountManagerFactory create(ApplicationModule applicationModule, Provider<AdultContent> provider, Provider<GoogleApiClient> provider2, Provider<StoreManager> provider3, Provider<AccountService> provider4, Provider<LoginPreferences> provider5, Provider<AccountPersistence> provider6, Provider<List<String>> provider7) {
        return new ApplicationModule_ProvideAptoideAccountManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AptoideAccountManager provideAptoideAccountManager(ApplicationModule applicationModule, AdultContent adultContent, GoogleApiClient googleApiClient, StoreManager storeManager, AccountService accountService, LoginPreferences loginPreferences, AccountPersistence accountPersistence, List<String> list) {
        return (AptoideAccountManager) C9055b.m29112c(applicationModule.provideAptoideAccountManager(adultContent, googleApiClient, storeManager, accountService, loginPreferences, accountPersistence, list));
    }

    @Override // javax.inject.Provider
    public AptoideAccountManager get() {
        return provideAptoideAccountManager(this.module, this.adultContentProvider.get(), this.googleApiClientProvider.get(), this.storeManagerProvider.get(), this.accountServiceProvider.get(), this.loginPreferencesProvider.get(), this.accountPersistenceProvider.get(), this.facebookPermissionsProvider.get());
    }
}
