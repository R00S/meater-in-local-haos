package cm.aptoide.p092pt.analytics.view;

import android.os.Bundle;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.permission.PermissionProviderActivity;
import javax.inject.Inject;

/* loaded from: classes.dex */
public abstract class AnalyticsActivity extends PermissionProviderActivity {
    private boolean _resumed = false;

    @Inject
    AnalyticsManager analyticsManager;

    @Inject
    FirstLaunchAnalytics firstLaunchAnalytics;

    public boolean is_resumed() {
        return this._resumed;
    }

    @Override // cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        this.firstLaunchAnalytics.setGmsPresent();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onPause() {
        super.onPause();
        this._resumed = false;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this._resumed = true;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.analyticsManager.startSession();
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.analyticsManager.endSession();
    }
}
