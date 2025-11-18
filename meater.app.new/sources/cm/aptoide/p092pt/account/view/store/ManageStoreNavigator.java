package cm.aptoide.p092pt.account.view.store;

import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;

/* loaded from: classes.dex */
public class ManageStoreNavigator {
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final FragmentNavigator fragmentNavigator;

    public ManageStoreNavigator(FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        this.fragmentNavigator = fragmentNavigator;
        this.bottomNavigationNavigator = bottomNavigationNavigator;
    }

    public void goToHome() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    public void popViewWithResult(int i2, boolean z) {
        this.fragmentNavigator.popWithResult(new Result(i2, z ? -1 : 0, null));
    }
}
