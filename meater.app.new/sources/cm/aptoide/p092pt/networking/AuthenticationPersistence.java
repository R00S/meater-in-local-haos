package cm.aptoide.p092pt.networking;

import android.accounts.Account;
import android.accounts.AccountManager;
import cm.aptoide.p092pt.account.AndroidAccountProvider;
import okhttp3.HttpUrl;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AuthenticationPersistence {
    public static final String ACCOUNT_ACCESS_TOKEN = "access_token";
    public static final String ACCOUNT_REFRESH_TOKEN = "refresh_token";
    public static final String ACCOUNT_TYPE = "aptoide_account_manager_login_mode";
    private final AccountManager androidAccountManager;
    private final AndroidAccountProvider androidAccountProvider;

    public AuthenticationPersistence(AndroidAccountProvider androidAccountProvider, AccountManager accountManager) {
        this.androidAccountProvider = androidAccountProvider;
        this.androidAccountManager = accountManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createAuthentication$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8288a(String str, String str2, String str3, String str4, Account account) {
        this.androidAccountManager.setUserData(account, ACCOUNT_REFRESH_TOKEN, str);
        this.androidAccountManager.setUserData(account, "access_token", str2);
        this.androidAccountManager.setPassword(account, str3);
        this.androidAccountManager.setUserData(account, ACCOUNT_TYPE, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAuthentication$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Authentication m8289b(Account account) {
        return new Authentication(account.name, this.androidAccountManager.getUserData(account, ACCOUNT_REFRESH_TOKEN), this.androidAccountManager.getUserData(account, "access_token"), this.androidAccountManager.getPassword(account), this.androidAccountManager.getUserData(account, ACCOUNT_TYPE));
    }

    static /* synthetic */ Authentication lambda$getAuthentication$1(Throwable th) {
        return new Authentication(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAuthentication$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8290c(String str, Account account) {
        this.androidAccountManager.setUserData(account, "access_token", str);
    }

    public C11231b createAuthentication(String str, final String str2, final String str3, final String str4, final String str5) {
        return this.androidAccountProvider.createAndroidAccount(str).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.networking.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10303f.m8288a(str3, str4, str2, str5, (Account) obj);
            }
        }).m39934z();
    }

    public Single<Authentication> getAuthentication() {
        return this.androidAccountProvider.getAndroidAccount().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10300f.m8289b((Account) obj);
            }
        }).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.networking.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AuthenticationPersistence.lambda$getAuthentication$1((Throwable) obj);
            }
        });
    }

    public C11231b removeAuthentication() {
        return this.androidAccountProvider.removeAndroidAccount();
    }

    public C11231b updateAuthentication(final String str) {
        return this.androidAccountProvider.getAndroidAccount().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.networking.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10301f.m8290c(str, (Account) obj);
            }
        }).m39934z();
    }
}
