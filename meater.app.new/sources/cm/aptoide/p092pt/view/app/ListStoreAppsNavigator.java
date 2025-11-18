package cm.aptoide.p092pt.view.app;

import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ListStoreAppsNavigator {
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;

    public ListStoreAppsNavigator(FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        this.fragmentNavigator = fragmentNavigator;
        this.appNavigator = appNavigator;
    }

    public void navigateToAppView(long j2, String str) {
        this.appNavigator.navigateWithAppId(j2, str, AppViewFragment.OpenType.OPEN_ONLY, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
