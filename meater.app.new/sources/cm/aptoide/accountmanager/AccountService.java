package cm.aptoide.accountmanager;

import com.aptoide.authentication.model.CodeAuth;
import p024c.p052i.p059j.C0955e;
import p456rx.C11231b;
import p456rx.Single;

/* loaded from: classes.dex */
public interface AccountService {
    Single<Account> createAccount(String str, String str2);

    Single<Account> createAccount(String str, String str2, String str3);

    Single<Account> getAccount(String str);

    Single<C0955e<Account, Boolean>> getAccount(String str, String str2, String str3, String str4);

    C11231b removeAccount();

    Single<CodeAuth> sendMagicLink(String str);

    C11231b subscribeStore(String str, String str2, String str3);

    C11231b unsubscribeStore(String str, String str2, String str3);

    C11231b updateAccount(String str);

    C11231b updateAccount(String str, String str2);

    C11231b updateAccount(boolean z);

    C11231b updateAccountUsername(String str);

    C11231b updateTermsAndConditions();
}
