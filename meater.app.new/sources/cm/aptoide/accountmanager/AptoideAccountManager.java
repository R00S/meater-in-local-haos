package cm.aptoide.accountmanager;

import android.text.TextUtils;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.p092pt.crashreports.CrashReport;
import com.aptoide.authentication.model.CodeAuth;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0955e;
import p241e.p294g.p306b.C8988c;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AptoideAccountManager {
    public static final String APTOIDE_SIGN_UP_TYPE = "APTOIDE";
    private final AccountPersistence accountPersistence;
    private final C8988c<Account> accountRelay;
    private final AccountService accountService;
    private final SignUpAdapterRegistry adapterRegistry;
    private final AdultContent adultContent;
    private final CredentialsValidator credentialsValidator;
    private final StoreManager storeManager;

    public static class Builder {
        private AccountPersistence accountPersistence;
        private C8988c<Account> accountRelay;
        private AccountService accountService;
        private final Map<String, SignUpAdapter> adapters = new HashMap();
        private AdultContent adultContent;
        private CredentialsValidator credentialsValidator;
        private StoreManager storeManager;

        public AptoideAccountManager build() {
            if (this.accountPersistence == null) {
                throw new IllegalArgumentException("AccountDataPersist is mandatory.");
            }
            if (this.accountService == null) {
                throw new IllegalArgumentException("AccountManagerService is mandatory.");
            }
            if (this.storeManager == null) {
                throw new IllegalArgumentException("StoreManager is mandatory.");
            }
            if (this.credentialsValidator == null) {
                this.credentialsValidator = new CredentialsValidator();
            }
            if (this.accountRelay == null) {
                this.accountRelay = C8988c.m28593f1();
            }
            SignUpAdapterRegistry signUpAdapterRegistry = new SignUpAdapterRegistry(this.adapters, this.accountService);
            signUpAdapterRegistry.register(AptoideAccountManager.APTOIDE_SIGN_UP_TYPE, new AptoideSignUpAdapter(this.credentialsValidator));
            return new AptoideAccountManager(this.credentialsValidator, this.accountPersistence, this.accountService, this.accountRelay, signUpAdapterRegistry, this.storeManager, this.adultContent);
        }

        public Builder registerSignUpAdapter(String str, SignUpAdapter signUpAdapter) {
            this.adapters.put(str, signUpAdapter);
            return this;
        }

        public Builder setAccountPersistence(AccountPersistence accountPersistence) {
            this.accountPersistence = accountPersistence;
            return this;
        }

        public Builder setAccountRelay(C8988c<Account> c8988c) {
            this.accountRelay = c8988c;
            return this;
        }

        public Builder setAccountService(AccountService accountService) {
            this.accountService = accountService;
            return this;
        }

        public Builder setAdultService(AdultContent adultContent) {
            this.adultContent = adultContent;
            return this;
        }

        public Builder setCredentialsValidator(CredentialsValidator credentialsValidator) {
            this.credentialsValidator = credentialsValidator;
            return this;
        }

        public Builder setStoreManager(StoreManager storeManager) {
            this.storeManager = storeManager;
            return this;
        }
    }

    private Account createLocalAccount() {
        return new LocalAccount(Store.emptyStore());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$accountStatus$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Account m6765a(Throwable th) {
        return createLocalAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$disable$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6766b(Account account) {
        return this.adultContent.disable(account.isLoggedIn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enable$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6767c(Account account) {
        return this.adultContent.enable(account.isLoggedIn());
    }

    static /* synthetic */ Account lambda$getAccount$1(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$login$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6768d(C0955e c0955e) {
        return lambda$syncAccount$7((Account) c0955e.f6405a).m39975c(Single.m39913m((Boolean) c0955e.f6406b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$logout$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6769e(Account account) {
        return this.accountService.removeAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$logout$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6770f() {
        this.accountRelay.call(createLocalAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveAccount$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6771g(Account account) {
        this.accountRelay.call(account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$syncAccount$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6773i(Account account) {
        return this.accountService.getAccount(account.getEmail());
    }

    static /* synthetic */ void lambda$unsubscribeStore$9() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAccount$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6775k(boolean z, Account account) {
        return this.accountService.updateAccount(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAccount$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6776l(String str, Account account) {
        return this.accountService.updateAccountUsername(str).m39973a(syncAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAccount$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6777m(Account.Access access, Account account) {
        return this.accountService.updateAccount(access.name()).m39973a(syncAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAccount$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6778n(String str, String str2, Account account) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return C11231b.m39951s(new AccountValidationException(6));
        }
        if (TextUtils.isEmpty(str)) {
            return C11231b.m39951s(new AccountValidationException(5));
        }
        AccountService accountService = this.accountService;
        if (TextUtils.isEmpty(str2)) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return accountService.updateAccount(str, str2).m39973a(syncAccount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAccount$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6779o(Account account) {
        return syncAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateTermsAndConditions$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6780p(Account account) {
        return this.accountPersistence.saveAccount(new AptoideAccount(account.getId(), account.getEmail(), account.getNickname(), account.getAvatar(), account.getStore(), account.isAdultContentEnabled(), account.getAccess(), account.isAccessConfirmed(), account.getSubscribedStores(), true, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveAccount, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C11231b m6774j(final Account account) {
        return this.accountPersistence.saveAccount(account).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.accountmanager.s
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7104f.m6771g(account);
            }
        });
    }

    private Single<Account> singleAccountStatus() {
        return accountStatus().m40057E().m40085Z0();
    }

    private C11231b syncAccount() {
        return this.accountPersistence.getAccount().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7095f.m6773i((Account) obj);
            }
        }).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7083f.m6774j((Account) obj);
            }
        });
    }

    public C11234e<Account> accountStatus() {
        return C11234e.m40033a0(this.accountRelay, this.accountPersistence.getAccount().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7098f.m6765a((Throwable) obj);
            }
        }).m39915A());
    }

    public C11231b createOrUpdate(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        return this.storeManager.createOrUpdate(str, str2, str3, z, str4, z2).m39973a(syncAccount());
    }

    public C11231b disable() {
        return accountStatus().m40057E().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7096f.m6766b((Account) obj);
            }
        }).m40083X0();
    }

    public C11231b enable() {
        return accountStatus().m40057E().m40062H(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7084f.m6767c((Account) obj);
            }
        }).m40083X0();
    }

    public C11231b generateEmailCode(String str) {
        return str.isEmpty() ? C11231b.m39951s(new AccountValidationException(1)) : C11231b.m39946e();
    }

    @Deprecated
    public Account getAccount() {
        return singleAccountStatus().m39926r(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AptoideAccountManager.lambda$getAccount$1((Throwable) obj);
                return null;
            }
        }).m39933y().m40633b();
    }

    public C11234e<Boolean> hasMatureContentEnabled() {
        return this.adultContent.enabled();
    }

    @Deprecated
    public boolean isAccountAccessConfirmed() {
        Account account = getAccount();
        return account != null && account.isAccessConfirmed();
    }

    @Deprecated
    public boolean isAccountMature() {
        Account account = getAccount();
        return account != null && account.isAdultContentEnabled();
    }

    public Single<Boolean> isEmailValid(String str) {
        return this.credentialsValidator.isEmailValid(str);
    }

    @Deprecated
    public boolean isLoggedIn() {
        Account account = getAccount();
        return account != null && account.isLoggedIn();
    }

    public boolean isSignUpEnabled(String str) {
        return this.adapterRegistry.isEnabled(str);
    }

    public Single<Boolean> login(AptoideCredentials aptoideCredentials) {
        return this.credentialsValidator.validate(aptoideCredentials).m39975c(this.accountService.getAccount(aptoideCredentials.getEmail(), aptoideCredentials.getCode(), aptoideCredentials.getState(), aptoideCredentials.getAgent())).m39920i(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7093f.m6768d((C0955e) obj);
            }
        });
    }

    public C11231b logout() {
        return this.adapterRegistry.logoutAll().m39973a(singleAccountStatus().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7085f.m6769e((Account) obj);
            }
        }).m39973a(this.accountPersistence.removeAccount()).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.accountmanager.l
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7097f.m6770f();
            }
        }));
    }

    public C11234e<Boolean> pinRequired() {
        return this.adultContent.pinRequired();
    }

    public C11231b removePin(int i2) {
        return this.adultContent.removePin(i2);
    }

    public C11231b requirePin(int i2) {
        return this.adultContent.requirePin(i2);
    }

    public Single<CodeAuth> sendMagicLink(String str) {
        return this.accountService.sendMagicLink(str);
    }

    public <T> C11231b signUp(String str, T t) {
        return this.adapterRegistry.signUp(str, t).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7094f.m6772h((Account) obj);
            }
        });
    }

    public C11231b subscribeStore(String str, String str2, String str3) {
        return this.accountService.subscribeStore(str, str2, str3);
    }

    public void unsubscribeStore(String str, String str2, String str3) {
        this.accountService.unsubscribeStore(str, str2, str3).m39965I(new InterfaceC11252a() { // from class: cm.aptoide.accountmanager.f
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                AptoideAccountManager.lambda$unsubscribeStore$9();
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.accountmanager.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    public C11231b updateAccount(final boolean z) {
        return singleAccountStatus().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7106f.m6775k(z, (Account) obj);
            }
        });
    }

    public C11231b updateTermsAndConditions() {
        return this.accountService.updateTermsAndConditions().m39974b(accountStatus()).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7103f.m6780p((Account) obj);
            }
        }).m40083X0();
    }

    private AptoideAccountManager(CredentialsValidator credentialsValidator, AccountPersistence accountPersistence, AccountService accountService, C8988c<Account> c8988c, SignUpAdapterRegistry signUpAdapterRegistry, StoreManager storeManager, AdultContent adultContent) {
        this.credentialsValidator = credentialsValidator;
        this.accountPersistence = accountPersistence;
        this.accountService = accountService;
        this.accountRelay = c8988c;
        this.adapterRegistry = signUpAdapterRegistry;
        this.storeManager = storeManager;
        this.adultContent = adultContent;
    }

    public C11231b updateAccount(final String str) {
        return TextUtils.isEmpty(str) ? C11231b.m39951s(new AccountValidationException(5)) : singleAccountStatus().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7089f.m6776l(str, (Account) obj);
            }
        });
    }

    public C11231b enable(int i2) {
        return this.adultContent.enable(i2);
    }

    public C11231b updateAccount(final Account.Access access) {
        return singleAccountStatus().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7100f.m6777m(access, (Account) obj);
            }
        });
    }

    public C11231b updateAccount(final String str, final String str2) {
        return singleAccountStatus().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7086f.m6778n(str, str2, (Account) obj);
            }
        });
    }

    @Deprecated
    public C11231b updateAccount() {
        return singleAccountStatus().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.accountmanager.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7102f.m6779o((Account) obj);
            }
        });
    }
}
