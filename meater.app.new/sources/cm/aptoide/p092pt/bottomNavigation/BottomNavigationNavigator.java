package cm.aptoide.p092pt.bottomNavigation;

import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.editorialList.EditorialListFragment;
import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.home.apps.AppsFragment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.analytics.SearchSource;
import cm.aptoide.p092pt.search.view.SearchResultFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresFragment;
import cm.aptoide.p092pt.themes.ThemeManager;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BottomNavigationNavigator {
    private static final String EVENT_ACTION = "https://ws75-cache.aptoide.com/api/7.20240701/getStoreWidgets/store_id=15/context=stores";
    private final BottomNavigationAnalytics bottomNavigationAnalytics;
    private ArrayList<Integer> bottomNavigationItems = new ArrayList<>();
    private final FragmentNavigator fragmentNavigator;
    private final SearchAnalytics searchAnalytics;
    private final ThemeManager themeManager;

    public BottomNavigationNavigator(FragmentNavigator fragmentNavigator, BottomNavigationAnalytics bottomNavigationAnalytics, SearchAnalytics searchAnalytics, ThemeManager themeManager) {
        this.bottomNavigationAnalytics = bottomNavigationAnalytics;
        this.searchAnalytics = searchAnalytics;
        this.fragmentNavigator = fragmentNavigator;
        this.themeManager = themeManager;
    }

    private Event getStoreEvent() {
        Event event = new Event();
        event.setAction(EVENT_ACTION);
        event.setData(null);
        event.setName(Event.Name.myStores);
        event.setType(Event.Type.CLIENT);
        return event;
    }

    private void navigateBackToBottomNavigationItem(int i2) {
        Fragment appsFragment = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : new AppsFragment() : MyStoresFragment.newInstance(getStoreEvent(), HttpUrl.FRAGMENT_ENCODE_SET, "stores", StoreContext.home) : SearchResultFragment.newInstance(true) : new EditorialListFragment() : new HomeContainerFragment();
        if (appsFragment != null) {
            this.fragmentNavigator.navigateToCleaningBackStack(appsFragment, true);
        }
    }

    private void navigateToSelectedFragment(int i2, Fragment fragment) {
        Fragment fragment2 = this.fragmentNavigator.getFragment();
        if (fragment2 == null || fragment2.getClass() != fragment.getClass()) {
            if (this.bottomNavigationItems.size() <= 0 || this.bottomNavigationItems.get(0).intValue() != i2) {
                this.fragmentNavigator.cleanBackStack();
                this.fragmentNavigator.navigateToWithoutBackSave(fragment, true);
            } else {
                this.fragmentNavigator.cleanBackStack();
            }
            updateBottomNavigationItemsList(i2);
            Collections.rotate(this.bottomNavigationItems, 1);
        }
    }

    private void updateBottomNavigationItemsList(int i2) {
        int iIndexOf = this.bottomNavigationItems.indexOf(Integer.valueOf(i2));
        if (iIndexOf != -1) {
            this.bottomNavigationItems.remove(iIndexOf);
        }
        this.bottomNavigationItems.add(Integer.valueOf(i2));
    }

    public boolean canNavigateBack() {
        return this.bottomNavigationItems.size() > 1;
    }

    public ArrayList<Integer> getBottomNavigationItems() {
        return this.bottomNavigationItems;
    }

    public void navigateBack() {
        int iIntValue = this.bottomNavigationItems.get(1).intValue();
        this.bottomNavigationItems.remove(0);
        navigateBackToBottomNavigationItem(iIntValue);
    }

    public void navigateToApps() {
        navigateToSelectedFragment(4, new AppsFragment());
    }

    public void navigateToBottomNavigationItem(int i2) {
        if (i2 == 0) {
            this.bottomNavigationAnalytics.sendNavigateToHomeClickEvent();
            navigateToHome();
            return;
        }
        if (i2 == 1) {
            this.bottomNavigationAnalytics.sendNavigateToCurationClickEvent();
            navigateToCuration();
            return;
        }
        if (i2 == 2) {
            this.bottomNavigationAnalytics.sendNavigateToSearchClickEvent();
            this.searchAnalytics.searchStart(SearchSource.BOTTOM_NAVIGATION, true);
            navigateToSearch(SearchResultFragment.newInstance(true));
        } else if (i2 == 3) {
            this.bottomNavigationAnalytics.sendNavigateToStoresClickEvent();
            navigateToStore();
        } else {
            if (i2 != 4) {
                return;
            }
            this.bottomNavigationAnalytics.sendNavigateToAppsClickEvent();
            navigateToApps();
        }
    }

    public void navigateToCuration() {
        navigateToSelectedFragment(1, new EditorialListFragment());
    }

    public void navigateToHome() {
        navigateToSelectedFragment(0, new HomeContainerFragment());
    }

    public void navigateToSearch(SearchResultFragment searchResultFragment) {
        navigateToSelectedFragment(2, searchResultFragment);
    }

    public void navigateToStore() {
        navigateToSelectedFragment(3, MyStoresFragment.newInstance(getStoreEvent(), this.themeManager.getBaseTheme().getThemeName(), "stores", StoreContext.home));
    }

    public void setBottomNavigationItems(ArrayList<Integer> arrayList) {
        this.bottomNavigationItems = arrayList;
    }
}
