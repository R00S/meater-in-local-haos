package cm.aptoide.p092pt.account.view;

import android.content.Intent;
import android.os.Bundle;
import cm.aptoide.p092pt.C1146R;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class LoginActivity extends LoginBottomSheetActivity {
    public static final String ACCOUNT_TYPE = "account_type";
    public static final String AUTH_TYPE = "auth_type";
    public static final String IS_ADDING_NEW_ACCOUNT = "is_adding_new_account";
    private String accountType;
    private String authType;
    private boolean isNewAccount;

    private int getLayoutId() {
        return C1146R.layout.empty_frame;
    }

    private void loadExtras(Intent intent) {
        this.accountType = intent.getStringExtra(ACCOUNT_TYPE);
        this.authType = intent.getStringExtra(AUTH_TYPE);
        this.isNewAccount = intent.getBooleanExtra(IS_ADDING_NEW_ACCOUNT, false);
    }

    @Override // cm.aptoide.p092pt.account.view.LoginBottomSheetActivity, cm.aptoide.p092pt.view.BackButtonActivity, cm.aptoide.p092pt.view.ThemedActivityView, cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutId());
        loadExtras(getIntent());
        if (bundle == null) {
            getFragmentNavigator().navigateToWithoutBackSave(LoginSignUpFragment.newInstance(false, true, false, this.accountType, this.authType, this.isNewAccount, false, false, HttpUrl.FRAGMENT_ENCODE_SET), true);
        }
    }
}
