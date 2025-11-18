package cm.aptoide.p092pt.home.bundles.ads;

import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AdMapper {
    public SearchAdNavigationResult mapAdToSearchAd(AdClick adClick) {
        if (adClick == null) {
            return new SearchAdNavigationResult(HttpUrl.FRAGMENT_ENCODE_SET, new SearchAdResult());
        }
        AptoideNativeAd aptoideNativeAd = (AptoideNativeAd) adClick.getAd();
        return new SearchAdNavigationResult(adClick.getTag(), new SearchAdResult(aptoideNativeAd.getAdId().longValue(), aptoideNativeAd.getIconUrl(), aptoideNativeAd.getDownloads(), aptoideNativeAd.getStars().intValue(), aptoideNativeAd.getModified().longValue(), aptoideNativeAd.getPackageName(), aptoideNativeAd.getCpcUrl(), aptoideNativeAd.getCpdUrl(), aptoideNativeAd.getCpiUrl(), aptoideNativeAd.getClickUrl(), aptoideNativeAd.getAdTitle(), aptoideNativeAd.getAppId(), aptoideNativeAd.getNetworkId().longValue(), false, null));
    }
}
