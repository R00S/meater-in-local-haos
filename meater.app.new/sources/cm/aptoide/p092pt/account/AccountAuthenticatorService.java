package cm.aptoide.p092pt.account;

import android.accounts.AccountManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.account.view.LoginActivity;
import cm.aptoide.p092pt.crashreports.CrashReport;

/* loaded from: classes.dex */
public class AccountAuthenticatorService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new AccountAuthenticator(this, ((AptoideApplication) getApplicationContext()).getAccountManager(), CrashReport.getInstance(), AccountManager.get(getApplicationContext()), new Intent(getApplicationContext(), (Class<?>) LoginActivity.class)).getIBinder();
    }
}
