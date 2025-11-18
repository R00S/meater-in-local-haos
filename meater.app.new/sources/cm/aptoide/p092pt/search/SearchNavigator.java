package cm.aptoide.p092pt.search;

import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.screenshots.ScreenshotsViewerFragment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.view.SearchResultFragment;
import cm.aptoide.p092pt.view.settings.SettingsFragment;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class SearchNavigator {
    private final AppNavigator appNavigator;
    private final FragmentNavigator navigator;
    private final String storeName;
    private final String storeTheme;

    public SearchNavigator(FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        this(fragmentNavigator, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, appNavigator);
    }

    public void goToAppView(long j2, String str, String str2, String str3) {
        this.appNavigator.navigateWithStore(j2, str, str2, str3);
    }

    public void goToSearchFragment(SearchQueryModel searchQueryModel) {
        this.navigator.navigateTo(SearchResultFragment.newInstance(searchQueryModel), true);
    }

    public void goToSettings() {
        this.navigator.navigateTo(new SettingsFragment(), true);
    }

    public void navigate(SearchQueryModel searchQueryModel) {
        this.navigator.navigateTo(resolveFragment(searchQueryModel), true);
    }

    public void navigateToScreenshots(ArrayList<String> arrayList, int i2) {
        this.navigator.navigateTo(ScreenshotsViewerFragment.newInstance(arrayList, i2), true);
    }

    public SearchResultFragment resolveFragment(SearchQueryModel searchQueryModel) {
        String str = this.storeName;
        return (str == null || str.length() <= 0) ? SearchResultFragment.newInstance(searchQueryModel) : SearchResultFragment.newInstance(searchQueryModel, this.storeName, this.storeTheme);
    }

    public SearchNavigator(FragmentNavigator fragmentNavigator, String str, String str2, AppNavigator appNavigator) {
        this.navigator = fragmentNavigator;
        this.storeName = str;
        this.storeTheme = str2;
        this.appNavigator = appNavigator;
    }

    public void goToAppView(SearchAdResult searchAdResult) {
        this.appNavigator.navigateWithAd(searchAdResult, null);
    }
}
