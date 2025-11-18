package cm.aptoide.p092pt.account;

import android.accounts.AccountManager;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AccountFactory;
import cm.aptoide.accountmanager.AccountPersistence;
import cm.aptoide.accountmanager.Store;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.Authentication;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import java.util.List;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AndroidAccountManagerPersistence implements AccountPersistence {
    public static final String ACCOUNT_ACCESS_CONFIRMED = "access_confirmed";
    public static final String ACCOUNT_ACCESS_LEVEL = "access";
    public static final String ACCOUNT_ADULT_CONTENT_ENABLED = "aptoide_account_manager_mature_switch";
    public static final String ACCOUNT_AVATAR_URL = "useravatar";
    public static final String ACCOUNT_ID = "userId";
    public static final String ACCOUNT_NICKNAME = "username";
    private static final String ACCOUNT_PRIVACY_POLICY = "account_privacy_policy";
    public static final String ACCOUNT_STORE_AVATAR_URL = "storeAvatar";
    private static final String ACCOUNT_STORE_DOWNLOAD_COUNT = "account_store_download_count";
    private static final String ACCOUNT_STORE_ID = "account_store_id";
    public static final String ACCOUNT_STORE_NAME = "userRepo";
    private static final String ACCOUNT_STORE_PASSWORD = "account_store_password";
    private static final String ACCOUNT_STORE_THEME = "account_store_theme";
    private static final String ACCOUNT_STORE_USERNAME = "account_store_username";
    private static final String ACCOUNT_TERMS_AND_CONDITIONS = "account_terms_and_conditions";
    private Account accountCache;
    private final AccountFactory accountFactory;
    private final AccountManager androidAccountManager;
    private final AndroidAccountProvider androidAccountProvider;
    private final AuthenticationPersistence authenticationPersistence;
    private final AbstractC11243h scheduler;
    private final DatabaseStoreDataPersist storePersist;

    public AndroidAccountManagerPersistence(AccountManager accountManager, DatabaseStoreDataPersist databaseStoreDataPersist, AccountFactory accountFactory, AndroidAccountProvider androidAccountProvider, AuthenticationPersistence authenticationPersistence, AbstractC11243h abstractC11243h) {
        this.androidAccountManager = accountManager;
        this.storePersist = databaseStoreDataPersist;
        this.accountFactory = accountFactory;
        this.androidAccountProvider = androidAccountProvider;
        this.authenticationPersistence = authenticationPersistence;
        this.scheduler = abstractC11243h;
    }

    private Store createStore(android.accounts.Account account) {
        return new Store(Long.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_STORE_DOWNLOAD_COUNT)).longValue(), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_AVATAR_URL), Long.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_STORE_ID)).longValue(), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_NAME), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_THEME), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_USERNAME), this.androidAccountManager.getUserData(account, ACCOUNT_STORE_PASSWORD), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccount$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6850a(String str, List list, android.accounts.Account account, boolean z, boolean z2, Authentication authentication) {
        return authentication.isAuthenticated() ? Single.m39913m(this.accountFactory.createAccount(str, list, this.androidAccountManager.getUserData(account, ACCOUNT_ID), account.name, this.androidAccountManager.getUserData(account, "username"), this.androidAccountManager.getUserData(account, ACCOUNT_AVATAR_URL), createStore(account), Boolean.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_ADULT_CONTENT_ENABLED)).booleanValue(), Boolean.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_ACCESS_CONFIRMED)).booleanValue(), z, z2)) : Single.m39911h(new IllegalStateException("Account not authenticated"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccount$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6851b(final String str, final android.accounts.Account account, final boolean z, final boolean z2, final List list) {
        return this.authenticationPersistence.getAuthentication().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7243f.m6850a(str, list, account, z, z2, (Authentication) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccount$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6852c(final android.accounts.Account account) {
        final String userData = this.androidAccountManager.getUserData(account, ACCOUNT_ACCESS_LEVEL);
        final boolean zBooleanValue = this.androidAccountManager.getUserData(account, ACCOUNT_TERMS_AND_CONDITIONS) != null ? Boolean.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_TERMS_AND_CONDITIONS)).booleanValue() : false;
        final boolean zBooleanValue2 = this.androidAccountManager.getUserData(account, ACCOUNT_PRIVACY_POLICY) != null ? Boolean.valueOf(this.androidAccountManager.getUserData(account, ACCOUNT_PRIVACY_POLICY)).booleanValue() : false;
        return this.storePersist.get().m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.c0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7236f.m6851b(userData, account, zBooleanValue2, zBooleanValue, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeAccount$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6853d() {
        this.accountCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveAccount$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6854e(Account account) {
        this.accountCache = account;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveAccount$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6855f(final Account account, android.accounts.Account account2) {
        this.androidAccountManager.setUserData(account2, ACCOUNT_ID, account.getId());
        this.androidAccountManager.setUserData(account2, "username", account.getNickname());
        this.androidAccountManager.setUserData(account2, ACCOUNT_AVATAR_URL, account.getAvatar());
        this.androidAccountManager.setUserData(account2, ACCOUNT_ADULT_CONTENT_ENABLED, String.valueOf(account.isAdultContentEnabled()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_ACCESS_LEVEL, account.getAccess().name());
        this.androidAccountManager.setUserData(account2, ACCOUNT_ACCESS_CONFIRMED, String.valueOf(account.isAccessConfirmed()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_NAME, account.getStore().getName());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_AVATAR_URL, account.getStore().getAvatar());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_DOWNLOAD_COUNT, String.valueOf(account.getStore().getDownloadCount()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_ID, String.valueOf(account.getStore().getId()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_THEME, account.getStore().getTheme());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_USERNAME, account.getStore().getUsername());
        this.androidAccountManager.setUserData(account2, ACCOUNT_STORE_PASSWORD, account.getStore().getPassword());
        this.androidAccountManager.setUserData(account2, ACCOUNT_TERMS_AND_CONDITIONS, String.valueOf(account.acceptedTermsAndConditions()));
        this.androidAccountManager.setUserData(account2, ACCOUNT_PRIVACY_POLICY, String.valueOf(account.acceptedPrivacyPolicy()));
        return this.storePersist.persist(account.getSubscribedStores()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.d0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7233f.m6854e(account);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountPersistence
    public Single<Account> getAccount() {
        Account account = this.accountCache;
        return account != null ? Single.m39913m(account) : this.androidAccountProvider.getAndroidAccount().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7229f.m6852c((android.accounts.Account) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountPersistence
    public C11231b removeAccount() {
        return this.androidAccountProvider.removeAndroidAccount().m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.a0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7227f.m6853d();
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountPersistence
    public C11231b saveAccount(final Account account) {
        return this.androidAccountProvider.getAndroidAccount().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7250f.m6855f(account, (android.accounts.Account) obj);
            }
        }).m39967K(this.scheduler);
    }
}
