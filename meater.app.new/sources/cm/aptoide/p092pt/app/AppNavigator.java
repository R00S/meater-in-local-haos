package cm.aptoide.p092pt.app;

import android.os.Bundle;
import android.text.TextUtils;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import org.parceler.C11187d;

/* loaded from: classes.dex */
public class AppNavigator {
    private final FragmentNavigator fragmentNavigator;

    public AppNavigator(FragmentNavigator fragmentNavigator) {
        this.fragmentNavigator = fragmentNavigator;
    }

    public void navigateWithAd(SearchAdResult searchAdResult, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C11187d.m39875c(searchAdResult));
        if (str != null) {
            bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str);
        }
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAdAndStoreTheme(SearchAdResult searchAdResult, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C11187d.m39875c(searchAdResult));
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAdAndTag(SearchAdResult searchAdResult, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), searchAdResult.getAppId());
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), searchAdResult.getPackageName());
        bundle.putParcelable(AppViewFragment.BundleKeys.MINIMAL_AD.name(), C11187d.m39875c(searchAdResult));
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAppId(long j2, String str, AppViewFragment.OpenType openType, String str2) {
        navigateWithAppId(j2, str, openType, str2, null);
    }

    public void navigateWithDownloadUrlAndReward(long j2, String str, String str2, String str3, float f2) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putFloat(AppViewFragment.BundleKeys.APPC.name(), f2);
        bundle.putString(AppViewFragment.BundleKeys.DOWNLOAD_CONVERSION_URL.name(), str3);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithMd5(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.MD5.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithPackageAndStoreNames(String str, String str2, AppViewFragment.OpenType openType) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        }
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithPackageName(String str, AppViewFragment.OpenType openType) {
        navigateWithPackageAndStoreNames(str, null, openType);
    }

    public void navigateWithStore(long j2, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithStoreAndTag(long j2, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithUname(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.UNAME.name(), str);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigatewithEditorsPosition(long j2, String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str4);
        bundle.putString(AppViewFragment.BundleKeys.EDITORS_CHOICE_POSITION.name(), str5);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putString(AppViewFragment.BundleKeys.STORE_NAME.name(), str3);
        bundle.putString(AppViewFragment.BundleKeys.STORE_THEME.name(), str2);
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithAppId(long j2, String str, AppViewFragment.OpenType openType, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.ORIGIN_TAG.name(), str2);
        bundle.putLong(AppViewFragment.BundleKeys.APP_ID.name(), j2);
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        if (openType == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP && str3 != null) {
            bundle.putString(AppViewFragment.BundleKeys.OEM_ID.name(), str3);
        }
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }

    public void navigateWithPackageName(String str, AppViewFragment.OpenType openType, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(AppViewFragment.BundleKeys.PACKAGE_NAME.name(), str);
        bundle.putSerializable(AppViewFragment.BundleKeys.SHOULD_INSTALL.name(), openType);
        if (openType == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP && str2 != null) {
            bundle.putString(AppViewFragment.BundleKeys.OEM_ID.name(), str2);
        }
        AppViewFragment appViewFragment = new AppViewFragment();
        appViewFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(appViewFragment, true);
    }
}
