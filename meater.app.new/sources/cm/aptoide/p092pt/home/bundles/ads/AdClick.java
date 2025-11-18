package cm.aptoide.p092pt.home.bundles.ads;

import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;

/* loaded from: classes.dex */
public class AdClick {

    /* renamed from: ad */
    private final ApplicationAd f9512ad;
    private final String tag;

    public AdClick(GetAdsResponse.C2220Ad c2220Ad, String str) {
        this.f9512ad = new AptoideNativeAd(c2220Ad);
        this.tag = str;
    }

    public ApplicationAd getAd() {
        return this.f9512ad;
    }

    public String getTag() {
        return this.tag;
    }

    public AdClick(ApplicationAd applicationAd, String str) {
        this.f9512ad = applicationAd;
        this.tag = str;
    }
}
