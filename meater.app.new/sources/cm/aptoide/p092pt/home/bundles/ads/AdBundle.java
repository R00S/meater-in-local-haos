package cm.aptoide.p092pt.home.bundles.ads;

import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AdBundle implements HomeBundle {
    private final List<AdClick> ads;
    private final Event event;
    private final String tag;
    private final String title;

    public AdBundle(String str, AdsTagWrapper adsTagWrapper, Event event, String str2) {
        this.title = str;
        if (adsTagWrapper.getAds() != null) {
            this.ads = new ArrayList();
            Iterator<GetAdsResponse.C2220Ad> it = adsTagWrapper.getAds().iterator();
            while (it.hasNext()) {
                this.ads.add(new AdClick(it.next(), str2));
            }
        } else {
            this.ads = null;
        }
        this.event = event;
        this.tag = str2;
    }

    public List<AdClick> getAds() {
        return this.ads;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public List<?> getContent() {
        return this.ads;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public Event getEvent() {
        return this.event;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public String getTag() {
        return this.tag;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public String getTitle() {
        return this.title;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.HomeBundle
    public HomeBundle.BundleType getType() {
        return HomeBundle.BundleType.ADS;
    }
}
