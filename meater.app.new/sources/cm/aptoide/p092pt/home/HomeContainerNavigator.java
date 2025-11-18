package cm.aptoide.p092pt.home;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.savedstate.InterfaceC0674c;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.MoreBundleFragment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class HomeContainerNavigator {
    private String appsTag;
    private FragmentNavigator childFragmentNavigator;
    private String gamesTag;
    private String homeTag;

    public HomeContainerNavigator(FragmentNavigator fragmentNavigator) {
        this.childFragmentNavigator = fragmentNavigator;
    }

    public void loadAppsHomeContent() {
        MoreBundleFragment moreBundleFragment = new MoreBundleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", this.childFragmentNavigator.getFragment().getString(C1146R.string.home_chip_apps));
        bundle.putString("action", "https://ws75-cache.aptoide.com/api/7.20240701/getStoreWidgets/store_id=15/context=apps/widget=apps_list%3A0%261%3Apdownloads7d");
        bundle.putBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, false);
        moreBundleFragment.setArguments(bundle);
        Fragment fragment = this.childFragmentNavigator.getFragment(this.appsTag);
        if (fragment != null) {
            this.childFragmentNavigator.navigateToWithoutBackSave(fragment, true);
        } else {
            this.appsTag = this.childFragmentNavigator.navigateTo(moreBundleFragment, true);
        }
    }

    public void loadGamesHomeContent() {
        MoreBundleFragment moreBundleFragment = new MoreBundleFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", this.childFragmentNavigator.getFragment().getString(C1146R.string.home_chip_games));
        bundle.putString("action", "https://ws75-cache.aptoide.com/api/7.20240701/getStoreWidgets/store_id=15/context=games/widget=apps_list%3A0%262%3Adownloads7d");
        bundle.putBoolean(StoreTabGridRecyclerFragment.BundleCons.TOOLBAR, false);
        moreBundleFragment.setArguments(bundle);
        Fragment fragment = this.childFragmentNavigator.getFragment(this.gamesTag);
        if (fragment != null) {
            this.childFragmentNavigator.navigateToWithoutBackSave(fragment, true);
        } else {
            this.gamesTag = this.childFragmentNavigator.navigateTo(moreBundleFragment, true);
        }
    }

    public void loadMainHomeContent() {
        Fragment fragment = this.childFragmentNavigator.getFragment(this.homeTag);
        if (fragment != null) {
            this.childFragmentNavigator.navigateToWithoutBackSave(fragment, true);
        } else {
            this.homeTag = this.childFragmentNavigator.navigateTo(new HomeFragment(), true);
        }
    }

    public C11234e<Boolean> navigateHome() {
        InterfaceC0674c fragment = this.childFragmentNavigator.getFragment();
        if (fragment instanceof ScrollableView) {
            ScrollableView scrollableView = (ScrollableView) fragment;
            if (scrollableView.isAtTop() && (fragment instanceof MoreBundleFragment)) {
                return C11234e.m40025S(Boolean.TRUE);
            }
            scrollableView.scrollToTop();
        }
        return C11234e.m40025S(Boolean.FALSE);
    }
}
