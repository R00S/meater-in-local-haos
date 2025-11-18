package cm.aptoide.p092pt.view;

import android.os.Bundle;
import cm.aptoide.p092pt.view.BackButton;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class BackButtonActivity extends ThemedActivityView implements BackButton {
    private Set<BackButton.ClickHandler> clickHandlers;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Iterator<BackButton.ClickHandler> it = this.clickHandlers.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().handle()) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        super.onBackPressed();
    }

    @Override // cm.aptoide.p092pt.view.ThemedActivityView, cm.aptoide.p092pt.analytics.view.AnalyticsActivity, cm.aptoide.p092pt.permission.PermissionProviderActivity, cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.clickHandlers = new HashSet();
    }

    @Override // cm.aptoide.p092pt.view.BackButton
    public void registerClickHandler(BackButton.ClickHandler clickHandler) {
        this.clickHandlers.add(clickHandler);
    }

    @Override // cm.aptoide.p092pt.view.BackButton
    public void unregisterClickHandler(BackButton.ClickHandler clickHandler) {
        this.clickHandlers.remove(clickHandler);
    }
}
