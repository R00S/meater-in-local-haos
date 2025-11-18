package cm.aptoide.p092pt.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Build;
import java.util.concurrent.Callable;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class AndroidAccountProvider {
    private final String accountType;
    private final AccountManager androidAccountManager;
    private final AbstractC11243h scheduler;

    public AndroidAccountProvider(AccountManager accountManager, String str, AbstractC11243h abstractC11243h) {
        this.androidAccountManager = accountManager;
        this.accountType = str;
        this.scheduler = abstractC11243h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAndroidAccount$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6856a() throws Exception {
        Account[] accountsByType = this.androidAccountManager.getAccountsByType(this.accountType);
        return accountsByType.length == 0 ? Single.m39911h(new IllegalStateException("No account found.")) : Single.m39913m(accountsByType[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeAndroidAccount$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6857b(Account account) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.androidAccountManager.removeAccountExplicitly(account);
        } else {
            this.androidAccountManager.removeAccount(account, null, null);
        }
    }

    public Single<Account> createAndroidAccount(String str) {
        Account account = new Account(str, this.accountType);
        try {
            this.androidAccountManager.addAccountExplicitly(account, null, null);
            return Single.m39913m(account);
        } catch (SecurityException e2) {
            return Single.m39911h(e2);
        }
    }

    public Single<Account> getAndroidAccount() {
        return Single.m39910c(new Callable() { // from class: cm.aptoide.pt.account.i0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7255f.m6856a();
            }
        }).m39924p(this.scheduler);
    }

    public C11231b removeAndroidAccount() {
        return getAndroidAccount().m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7253f.m6857b((Account) obj);
            }
        }).m39934z().m39958A();
    }
}
