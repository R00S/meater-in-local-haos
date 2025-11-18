package cm.aptoide.p092pt;

import android.app.Service;

/* loaded from: classes.dex */
public abstract class BaseService extends Service {
    public ApplicationComponent getApplicationComponent() {
        return ((AptoideApplication) getApplication()).getApplicationComponent();
    }
}
