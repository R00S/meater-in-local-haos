package cm.aptoide.p092pt.home.bundles.ads;

import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import java.util.List;

/* loaded from: classes.dex */
public class AdsTagWrapper {
    private final List<GetAdsResponse.C2220Ad> ads;
    private final String tag;

    public AdsTagWrapper(List<GetAdsResponse.C2220Ad> list, String str) {
        this.ads = list;
        this.tag = str;
    }

    public List<GetAdsResponse.C2220Ad> getAds() {
        return this.ads;
    }

    public String getTag() {
        return this.tag;
    }
}
