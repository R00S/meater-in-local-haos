package cm.aptoide.p092pt.analytics;

import cm.aptoide.analytics.implementation.navigation.ViewNameFilter;
import cm.aptoide.p092pt.account.view.LoginSignUpCredentialsFragment;
import cm.aptoide.p092pt.store.view.StoreFragment;
import cm.aptoide.p092pt.view.wizard.WizardFragment;

/* loaded from: classes.dex */
public class TrackerFilter implements ViewNameFilter {
    @Override // cm.aptoide.analytics.implementation.navigation.ViewNameFilter
    public boolean filter(String str) {
        return (str.equals(WizardFragment.class.getSimpleName()) || str.equals(LoginSignUpCredentialsFragment.class.getSimpleName()) || str.equals(StoreFragment.class.getSimpleName())) ? false : true;
    }
}
