package cm.aptoide.p092pt.account;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.logger.Logger;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
class AccountAuthenticator extends AbstractAccountAuthenticator {
    private static final String ARG_ACCOUNT_TYPE = "ACCOUNT_TYPE";
    private static final String ARG_AUTH_TYPE = "AUTH_TYPE";
    private static final String ARG_IS_ADDING_NEW_ACCOUNT = "IS_ADDING_ACCOUNT";
    private static final String ARG_OPTIONS_BUNDLE = "BE";
    private static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
    private static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an Aptoide account";
    private static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
    private static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an Aptoide account";
    private static final String INVALID_AUTH_TOKEN_TYPE = "invalid authTokenType";
    private static final String TAG = AccountAuthenticator.class.getSimpleName();
    private final AptoideAccountManager accountManager;
    private final AccountManager androidAccountManager;
    private final CrashReport crashReport;
    private final Intent loginActivityBaseIntent;

    AccountAuthenticator(Context context, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, AccountManager accountManager, Intent intent) {
        super(context);
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport;
        this.androidAccountManager = accountManager;
        this.loginActivityBaseIntent = intent;
    }

    private Intent createAuthActivityIntent(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, Bundle bundle) {
        this.loginActivityBaseIntent.putExtra(ARG_ACCOUNT_TYPE, str);
        this.loginActivityBaseIntent.putExtra(ARG_AUTH_TYPE, str2);
        this.loginActivityBaseIntent.putExtra(ARG_IS_ADDING_NEW_ACCOUNT, true);
        this.loginActivityBaseIntent.putExtra(ARG_OPTIONS_BUNDLE, bundle);
        this.loginActivityBaseIntent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        return this.loginActivityBaseIntent;
    }

    private Bundle createAuthActivityIntentBundle(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String[] strArr, String str2, String str3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", createAuthActivityIntent(accountAuthenticatorResponse, str, str2, bundle));
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAccountRemovalAllowed$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6841a(Throwable th) {
        this.crashReport.log(th);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        Logger.getInstance().m8283v(TAG, "Adding account: type=" + str);
        return createAuthActivityIntentBundle(accountAuthenticatorResponse, str, strArr, str2, null, bundle);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) throws NetworkErrorException {
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        if (accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            this.accountManager.logout().m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.a
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f7226f.m6841a((Throwable) obj);
                }
            }).m39958A().m39964H();
        }
        return accountRemovalAllowed;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        if (!str.equals(AUTHTOKEN_TYPE_FULL_ACCESS)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("errorMessage", INVALID_AUTH_TOKEN_TYPE);
            return bundle2;
        }
        String strPeekAuthToken = this.androidAccountManager.peekAuthToken(account, str);
        Logger logger = Logger.getInstance();
        String str2 = TAG;
        logger.m8283v(str2, "peekAuthToken returned - " + account + " " + strPeekAuthToken);
        Bundle bundle3 = new Bundle();
        bundle3.putString("authAccount", account.name);
        bundle3.putString("accountType", account.type);
        bundle3.putString("authtoken", strPeekAuthToken);
        Logger.getInstance().m8283v(str2, "getAuthToken returning - " + account + " " + strPeekAuthToken);
        return bundle3;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String str) {
        if (AUTHTOKEN_TYPE_FULL_ACCESS.equals(str)) {
            return AUTHTOKEN_TYPE_FULL_ACCESS_LABEL;
        }
        if (AUTHTOKEN_TYPE_READ_ONLY.equals(str)) {
            return AUTHTOKEN_TYPE_READ_ONLY_LABEL;
        }
        return str + " (Label)";
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", false);
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        return null;
    }
}
