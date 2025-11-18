package cm.aptoide.p092pt.view;

import android.os.Bundle;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Inject;

/* loaded from: classes.dex */
public abstract class ThemedActivityView extends ActivityView {

    @Inject
    public ThemeManager themeManager;

    @Override // cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        this.themeManager.resetToBaseTheme();
    }
}
