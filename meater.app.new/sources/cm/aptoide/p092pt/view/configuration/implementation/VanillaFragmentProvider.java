package cm.aptoide.p092pt.view.configuration.implementation;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.reviews.LatestReviewsFragment;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.store.view.StoreFragment;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.store.view.p104my.MyStoresFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowersFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowingFragment;
import cm.aptoide.p092pt.view.FragmentProvider;
import cm.aptoide.p092pt.view.fragment.DescriptionFragment;
import cm.aptoide.p092pt.view.settings.SettingsFragment;
import org.parceler.C11187d;

/* loaded from: classes.dex */
public class VanillaFragmentProvider implements FragmentProvider {
    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newAppViewFragment(long j2, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), AppViewFragment.OpenType.OPEN_ONLY);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newDescriptionFragment(String str, String str2, boolean z) {
        return DescriptionFragment.newInstance(str, str2, z);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newLatestReviewsFragment(long j2, StoreContext storeContext) {
        return LatestReviewsFragment.newInstance(j2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newRateAndReviewsFragment(long j2, String str, String str2, String str3, long j3) {
        return RateAndReviewsFragment.newInstance(j2, str, str2, str3, j3);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newSettingsFragment() {
        return SettingsFragment.newInstance();
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newStoreFragment(String str, String str2) {
        return StoreFragment.newInstance(str, str2);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newStoreTabGridRecyclerFragment(Event event, String str, String str2, StoreContext storeContext, boolean z, boolean z2) {
        return StoreTabGridRecyclerFragment.newInstance(event, str, str2, storeContext, z2);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newSubscribedStoresFragment(Event event, String str, String str2, StoreContext storeContext) {
        return MyStoresFragment.newInstance(event, str, str2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newTimeLineFollowersFragment(String str, String str2, StoreContext storeContext) {
        return TimeLineFollowersFragment.newInstanceUsingUser(str, str2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newTimeLineFollowersUsingStoreIdFragment(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowersFragment.newInstanceUsingStore(l, str, str2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newTimeLineFollowersUsingUserIdFragment(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowersFragment.newInstanceUsingUser(l, str, str2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newTimeLineFollowingFragmentUsingStoreId(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowingFragment.newInstanceUsingStoreId(l, str, str2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newTimeLineFollowingFragmentUsingUserId(Long l, String str, String str2, StoreContext storeContext) {
        return TimeLineFollowingFragment.newInstanceUsingUserId(l, str, str2, storeContext);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newStoreFragment(String str, String str2, StoreFragment.OpenType openType) {
        return StoreFragment.newInstance(str, str2, openType);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newStoreTabGridRecyclerFragment(Event event, String str, String str2, String str3, StoreContext storeContext, boolean z, boolean z2) {
        return StoreTabGridRecyclerFragment.newInstance(event, str, str2, str3, storeContext, z2);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newStoreFragment(long j2, String str, StoreFragment.OpenType openType) {
        return StoreFragment.newInstance(j2, str, openType);
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newAppViewFragment(long j2, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newAppViewFragment(long j2, String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putString(AppViewFragment.BundleKeys.EDITORS_CHOICE_POSITION.name(), str5);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newAppViewFragment(SearchAdResult searchAdResult, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C11187d.m39875c(searchAdResult));
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }

    @Override // cm.aptoide.p092pt.view.FragmentProvider
    public Fragment newAppViewFragment(String str, AppViewFragment.OpenType openType) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        }
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), null);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        return appViewFragment;
    }
}
