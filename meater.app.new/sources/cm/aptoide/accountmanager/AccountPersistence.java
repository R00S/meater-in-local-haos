package cm.aptoide.accountmanager;

import p456rx.C11231b;
import p456rx.Single;

/* loaded from: classes.dex */
public interface AccountPersistence {
    Single<Account> getAccount();

    C11231b removeAccount();

    C11231b saveAccount(Account account);
}
