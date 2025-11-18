package cm.aptoide.p092pt.account;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AccountPersistence;
import cm.aptoide.accountmanager.AdultContent;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MatureContentPersistence implements AccountPersistence {
    private final AdultContent adultContent;
    private final AccountPersistence wrappedAccountPersistence;

    public MatureContentPersistence(AccountPersistence accountPersistence, AdultContent adultContent) {
        this.wrappedAccountPersistence = accountPersistence;
        this.adultContent = adultContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccount$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Account m6863a(Account account) {
        return new MatureContentAccount(account, this.adultContent);
    }

    static /* synthetic */ C11231b lambda$saveAccount$0(C11231b c11231b, Throwable th) {
        return c11231b;
    }

    @Override // cm.aptoide.accountmanager.AccountPersistence
    public Single<Account> getAccount() {
        return this.wrappedAccountPersistence.getAccount().m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.v0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7288f.m6863a((Account) obj);
            }
        });
    }

    @Override // cm.aptoide.accountmanager.AccountPersistence
    public C11231b removeAccount() {
        return this.wrappedAccountPersistence.removeAccount().m39973a(this.adultContent.disable(false));
    }

    @Override // cm.aptoide.accountmanager.AccountPersistence
    public C11231b saveAccount(Account account) {
        final C11231b c11231bEnable = account.isAdultContentEnabled() ? this.adultContent.enable(account.isLoggedIn()) : this.adultContent.disable(account.isLoggedIn());
        return this.wrappedAccountPersistence.saveAccount(account).m39973a(c11231bEnable).m39960C(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                C11231b c11231b = c11231bEnable;
                MatureContentPersistence.lambda$saveAccount$0(c11231b, (Throwable) obj);
                return c11231b;
            }
        });
    }
}
