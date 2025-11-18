package cm.aptoide.p092pt.account.view;

import android.os.Bundle;
import cm.aptoide.p092pt.account.view.LoginBottomSheet;
import cm.aptoide.p092pt.view.BackButtonActivity;
import p241e.p294g.p306b.C8986a;
import p456rx.C11234e;

/* loaded from: classes.dex */
public abstract class LoginBottomSheetActivity extends BackButtonActivity implements LoginBottomSheet {
    private C8986a<LoginBottomSheet.State> stateSubject;

    @Override // cm.aptoide.p092pt.account.view.LoginBottomSheet
    public void collapse() {
        this.stateSubject.call(LoginBottomSheet.State.COLLAPSED);
    }

    @Override // cm.aptoide.p092pt.account.view.LoginBottomSheet
    public void expand() {
        this.stateSubject.call(LoginBottomSheet.State.EXPANDED);
    }

    @Override // cm.aptoide.p092pt.view.BackButtonActivity, cm.aptoide.p092pt.view.ThemedActivityView, cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.stateSubject = C8986a.m28588f1();
    }

    @Override // cm.aptoide.p092pt.account.view.LoginBottomSheet
    public C11234e<LoginBottomSheet.State> state() {
        return this.stateSubject;
    }
}
