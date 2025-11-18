package cm.aptoide.p092pt.ads.data;

import android.view.View;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.view.app.Application;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AptoideNativeAd extends Application implements ApplicationAd {
    private Long adId;
    private String clickUrl;
    private String cpcUrl;
    private String cpdUrl;
    private String cpiUrl;
    private String description;
    private Long modified;
    private Long networkId;
    private Payout payout;
    private Integer stars;

    public AptoideNativeAd(MinimalAd minimalAd) {
        super(minimalAd.getName(), minimalAd.getIconPath(), 0.0f, minimalAd.getDownloads(), minimalAd.getPackageName(), minimalAd.getAppId(), HttpUrl.FRAGMENT_ENCODE_SET, minimalAd.getIsHasAppc());
        this.networkId = Long.valueOf(minimalAd.getNetworkId());
        this.clickUrl = minimalAd.getClickUrl();
        this.cpcUrl = minimalAd.getCpcUrl();
        this.cpdUrl = minimalAd.getCpdUrl();
        this.adId = Long.valueOf(minimalAd.getAdId());
        this.cpiUrl = minimalAd.getCpiUrl();
        this.description = minimalAd.getDescription();
        this.stars = Integer.valueOf(minimalAd.getStars());
        this.modified = Long.valueOf(minimalAd.getModified());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptoideNativeAd)) {
            return false;
        }
        AptoideNativeAd aptoideNativeAd = (AptoideNativeAd) obj;
        return aptoideNativeAd.modified.equals(this.modified) && aptoideNativeAd.stars.equals(this.stars) && Integer.valueOf(aptoideNativeAd.getDownloads()).equals(Integer.valueOf(getDownloads())) && aptoideNativeAd.description.equals(this.description) && aptoideNativeAd.getIcon().equals(getIcon()) && aptoideNativeAd.getName().equals(getName()) && aptoideNativeAd.cpiUrl.equals(this.cpiUrl) && aptoideNativeAd.adId.equals(this.adId) && aptoideNativeAd.cpdUrl.equals(this.cpdUrl) && aptoideNativeAd.cpcUrl.equals(this.cpcUrl) && Long.valueOf(aptoideNativeAd.getAppId()).equals(Long.valueOf(getAppId())) && aptoideNativeAd.clickUrl.equals(this.clickUrl) && aptoideNativeAd.networkId.equals(this.networkId) && aptoideNativeAd.getPackageName().equals(getPackageName());
    }

    public Long getAdId() {
        return this.adId;
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public String getAdTitle() {
        return super.getName();
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public Payout getAppcPayout() {
        return this.payout;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCpcUrl() {
        return this.cpcUrl;
    }

    public String getCpdUrl() {
        return this.cpdUrl;
    }

    public String getCpiUrl() {
        return this.cpiUrl;
    }

    public String getDescription() {
        return this.description;
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public String getIconUrl() {
        return super.getIcon();
    }

    public Long getModified() {
        return this.modified;
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public ApplicationAd.Network getNetwork() {
        return ApplicationAd.Network.SERVER;
    }

    public Long getNetworkId() {
        return this.networkId;
    }

    @Override // cm.aptoide.p092pt.view.app.Application, cm.aptoide.p092pt.ads.data.ApplicationAd
    public String getPackageName() {
        return super.getPackageName();
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public Integer getStars() {
        return this.stars;
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public boolean hasAppcPayout() {
        Payout payout;
        return hasAppcBilling() && (payout = this.payout) != null && payout.getFiatAmount() > 0.0d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.cpdUrl.hashCode() * 31) + this.description.hashCode()) * 31) + getPackageName().hashCode()) * 31) + this.clickUrl.hashCode()) * 31) + this.cpcUrl.hashCode()) * 31) + this.cpiUrl.hashCode()) * 31) + getName().hashCode()) * 31) + getIcon().hashCode()) * 31) + Integer.valueOf(getDownloads()).hashCode()) * 31) + this.stars.hashCode()) * 31) + ((int) (this.networkId.longValue() ^ (this.networkId.longValue() >>> 32)))) * 31) + ((int) (getAppId() ^ (getAppId() >>> 32)))) * 31) + ((int) (this.adId.longValue() ^ (this.adId.longValue() >>> 32)))) * 31) + ((int) (this.modified.longValue() ^ (this.modified.longValue() >>> 32)));
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public void registerClickableView(View view) {
    }

    @Override // cm.aptoide.p092pt.ads.data.ApplicationAd
    public void setAdView(View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AptoideNativeAd(GetAdsResponse.C2220Ad c2220Ad) {
        super(c2220Ad.getData().getName(), c2220Ad.getData().getIcon(), 0.0f, c2220Ad.getData().getDownloads(), c2220Ad.getData().getPackageName(), c2220Ad.getData().getId(), HttpUrl.FRAGMENT_ENCODE_SET, (c2220Ad.getInfo().getPayout() == null || c2220Ad.getInfo().getPayout().getFiat() == null || c2220Ad.getInfo().getPayout().getFiat().getAmount() <= 0.0d) ? false : true);
        int id = 0;
        GetAdsResponse.Partner partner = c2220Ad.getPartner();
        String clickUrl = null;
        if (partner != null) {
            id = partner.getInfo().getId();
            clickUrl = partner.getData().getClickUrl();
        }
        this.networkId = Long.valueOf(id);
        this.clickUrl = clickUrl;
        this.cpcUrl = c2220Ad.getInfo().getCpcUrl();
        this.cpdUrl = c2220Ad.getInfo().getCpdUrl();
        this.adId = Long.valueOf(c2220Ad.getInfo().getAdId());
        this.cpiUrl = c2220Ad.getInfo().getCpiUrl();
        this.description = c2220Ad.getData().getDescription();
        this.stars = Integer.valueOf(c2220Ad.getData().getStars());
        this.modified = Long.valueOf(c2220Ad.getData().getModified().getTime());
        GetAdsResponse.Info.Payout payout = c2220Ad.getInfo().getPayout();
        if (payout != null) {
            GetAdsResponse.Info.Fiat fiat = payout.getFiat();
            this.payout = new Payout(payout.getAppc(), fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol());
        }
    }
}
