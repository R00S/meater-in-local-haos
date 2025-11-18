package cm.aptoide.p092pt.view;

import android.os.Bundle;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.FlavourActivityModule;
import cm.aptoide.p092pt.presenter.View;
import com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a;

/* loaded from: classes.dex */
public abstract class BaseActivity extends AbstractActivityC8764a {
    private ActivityComponent activityComponent;
    private boolean firstCreated;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityComponent getActivityComponent() {
        if (this.activityComponent == null) {
            AptoideApplication aptoideApplication = (AptoideApplication) getApplication();
            this.activityComponent = aptoideApplication.getApplicationComponent().plus(aptoideApplication.getActivityModule(this, getIntent(), aptoideApplication.getNotificationSyncScheduler(), (View) this, this.firstCreated, "cm.aptoide.pt.provider"), new FlavourActivityModule());
        }
        return this.activityComponent;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.firstCreated = bundle == null;
        getActivityComponent().inject(this);
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onDestroy() {
        this.activityComponent = null;
        super.onDestroy();
    }
}
