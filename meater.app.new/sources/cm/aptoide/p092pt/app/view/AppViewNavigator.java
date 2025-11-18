package cm.aptoide.p092pt.app.view;

import android.net.Uri;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.CatappultNavigator;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.app.view.screenshots.ScreenshotsViewerFragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AppViewNavigator {
    private final ActivityNavigator activityNavigator;
    private final AppNavigator appNavigator;
    private final CatappultNavigator catappultNavigator;
    private final FragmentNavigator fragmentNavigator;

    public AppViewNavigator(FragmentNavigator fragmentNavigator, ActivityNavigator activityNavigator, AppNavigator appNavigator, CatappultNavigator catappultNavigator) {
        this.fragmentNavigator = fragmentNavigator;
        this.activityNavigator = activityNavigator;
        this.appNavigator = appNavigator;
        this.catappultNavigator = catappultNavigator;
    }

    static /* synthetic */ OutOfSpaceNavigatorWrapper lambda$outOfSpaceDialogResult$0(Result result) {
        return new OutOfSpaceNavigatorWrapper(result.getResultCode() == -1, result.getData() != null ? result.getData().getPackage() : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void navigateToAd(AptoideNativeAd aptoideNativeAd, String str) {
        this.appNavigator.navigateWithAd(new SearchAdResult(aptoideNativeAd), str);
    }

    public void navigateToAppCoinsInfo() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(), true);
    }

    public void navigateToAppView(long j2, String str, String str2) {
        this.appNavigator.navigateWithAppId(j2, str, AppViewFragment.OpenType.OPEN_ONLY, str2);
    }

    public void navigateToCatappultWebsite() {
        this.catappultNavigator.navigateToCatappultWebsite();
    }

    public void navigateToDescriptionReadMore(String str, String str2, boolean z) {
        this.fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newDescriptionFragment(str, str2, z), true);
    }

    public void navigateToOtherVersions(String str, String str2, String str3) {
        this.fragmentNavigator.navigateTo(OtherVersionsFragment.newInstance(str, str2, str3), true);
    }

    public void navigateToOutOfSpaceDialog(long j2, String str) {
        this.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.INSTANCE.newInstance(j2, str), 1994);
    }

    public void navigateToRateAndReview(long j2, String str, String str2, String str3, String str4) {
        this.fragmentNavigator.navigateTo(RateAndReviewsFragment.newInstance(j2, str, str2, str3, str4), true);
    }

    public void navigateToScreenshots(ArrayList<String> arrayList, int i2) {
        this.fragmentNavigator.navigateTo(ScreenshotsViewerFragment.newInstance(arrayList, i2), true);
    }

    public void navigateToStore(Store store) {
        this.fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(store.getName(), store.getAppearance().getTheme()), true);
    }

    public void navigateToUri(Uri uri) {
        this.activityNavigator.navigateTo(uri);
    }

    public C11234e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        return this.fragmentNavigator.results(1994).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.app.view.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return AppViewNavigator.lambda$outOfSpaceDialogResult$0((Result) obj);
            }
        });
    }
}
