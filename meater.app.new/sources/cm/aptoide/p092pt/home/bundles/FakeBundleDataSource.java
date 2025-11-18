package cm.aptoide.p092pt.home.bundles;

import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.home.bundles.ads.AdBundle;
import cm.aptoide.p092pt.home.bundles.ads.AdsTagWrapper;
import cm.aptoide.p092pt.home.bundles.base.AppBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.view.app.Application;
import cm.aptoide.p092pt.view.app.FeatureGraphicApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.Single;

/* loaded from: classes.dex */
public class FakeBundleDataSource implements BundleDataSource {
    private C11234e<HomeBundlesModel> getHomeBundles() {
        return C11234e.m40025S(new HomeBundlesModel(getFakeBundles(), false, 0, true));
    }

    public List<HomeBundle> getFakeBundles() {
        ArrayList arrayList = new ArrayList();
        Application application = new Application(BuildConfig.MARKET_NAME, "https://placeimg.com/640/480/any", 0.0f, 1000, "cm.aptoide.pt", 300L, HttpUrl.FRAGMENT_ENCODE_SET, false);
        arrayList.add(application);
        Application application2 = new Application("Facebook", "https://placeimg.com/640/480/any", 4.2f, 1000, "katana.facebook.com", 30L, HttpUrl.FRAGMENT_ENCODE_SET, false);
        arrayList.add(application2);
        arrayList.add(application);
        arrayList.add(application2);
        arrayList.add(application);
        arrayList.add(application2);
        arrayList.add(application);
        arrayList.add(application2);
        ArrayList arrayList2 = new ArrayList();
        FeatureGraphicApplication featureGraphicApplication = new FeatureGraphicApplication(BuildConfig.MARKET_NAME, "https://placeimg.com/640/480/any", 0.0f, 1000, "cm.aptoide.pt", 300L, "https://placeimg.com/640/480/any", HttpUrl.FRAGMENT_ENCODE_SET, false, false);
        arrayList.add(featureGraphicApplication);
        FeatureGraphicApplication featureGraphicApplication2 = new FeatureGraphicApplication("Facebook", "https://placeimg.com/640/480/any", 4.2f, 1000, "katana.facebook.com", 30L, "https://placeimg.com/640/480/any", HttpUrl.FRAGMENT_ENCODE_SET, false, false);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        arrayList2.add(featureGraphicApplication);
        arrayList2.add(featureGraphicApplication2);
        AppBundle appBundle = new AppBundle("As escolhas do filipe", arrayList2, HomeBundle.BundleType.EDITORS, null, HttpUrl.FRAGMENT_ENCODE_SET, "As escolhas do filipe-more");
        HomeBundle.BundleType bundleType = HomeBundle.BundleType.APPS;
        AppBundle appBundle2 = new AppBundle("piores apps locais", arrayList, bundleType, null, HttpUrl.FRAGMENT_ENCODE_SET, "piores apps locais-more");
        AppBundle appBundle3 = new AppBundle("um pouco melhor apps", arrayList, bundleType, null, HttpUrl.FRAGMENT_ENCODE_SET, "um pouco melhor apps-more");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(appBundle);
        arrayList3.add(appBundle2);
        arrayList3.add(appBundle3);
        arrayList3.add(new AdBundle("Highlighted", new AdsTagWrapper(Collections.emptyList(), HttpUrl.FRAGMENT_ENCODE_SET), null, HttpUrl.FRAGMENT_ENCODE_SET));
        new ArrayList().add(new Application("asf wallet", "http://pool.img.aptoide.com/asf-store/ace60f6352f6dd9289843b5b0b2ab3d4_icon.png", 5.0f, 1000000, "asf.wallet.android.com", 36057221L, HttpUrl.FRAGMENT_ENCODE_SET, false));
        return arrayList3;
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public boolean hasMore(Integer num, String str) {
        return true;
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2) {
        return getHomeBundles().m40085Z0();
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public C11234e<HomeBundlesModel> loadFreshHomeBundles(String str) {
        return getHomeBundles();
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i2, String str2, int i3) {
        return getHomeBundles().m40085Z0();
    }

    @Override // cm.aptoide.p092pt.home.bundles.BundleDataSource
    public C11234e<HomeBundlesModel> loadNextHomeBundles(int i2, int i3, String str, boolean z) {
        return loadFreshHomeBundles(str);
    }
}
