package cm.aptoide.p092pt.ads;

import cm.aptoide.p092pt.database.room.RoomStoredMinimalAd;
import cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface;
import cm.aptoide.p092pt.dataprovider.model.p094v2.GetAdsResponse;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class MinimalAdMapper {
    public MinimalAd map(GetAdsResponse.C2220Ad c2220Ad) {
        String clickUrl;
        int i2;
        String currency;
        String symbol;
        double d2;
        double d3;
        boolean z;
        GetAdsResponse.Partner partner = c2220Ad.getPartner();
        if (partner != null) {
            int id = partner.getInfo().getId();
            clickUrl = partner.getData().getClickUrl();
            i2 = id;
        } else {
            clickUrl = null;
            i2 = 0;
        }
        GetAdsResponse.Info.Payout payout = c2220Ad.getInfo().getPayout();
        if (payout != null) {
            double appc = payout.getAppc();
            double amount = payout.getFiat().getAmount();
            currency = payout.getFiat().getCurrency();
            symbol = payout.getFiat().getSymbol();
            d2 = appc;
            d3 = amount;
            z = true;
        } else {
            currency = HttpUrl.FRAGMENT_ENCODE_SET;
            symbol = currency;
            d2 = -1.0d;
            d3 = -1.0d;
            z = false;
        }
        return new MinimalAd(c2220Ad.getData().getPackageName(), i2, clickUrl, c2220Ad.getInfo().getCpcUrl(), c2220Ad.getInfo().getCpdUrl(), c2220Ad.getData().getId(), c2220Ad.getInfo().getAdId(), c2220Ad.getInfo().getCpiUrl(), c2220Ad.getData().getName(), c2220Ad.getData().getIcon(), c2220Ad.getData().getDescription(), c2220Ad.getData().getDownloads(), c2220Ad.getData().getStars(), c2220Ad.getData().getModified().getTime(), z, d2, d3, currency, symbol);
    }

    public RoomStoredMinimalAd map(SearchAdResult searchAdResult, String str) {
        return new RoomStoredMinimalAd(searchAdResult.getPackageName(), str, searchAdResult.getCpcUrl(), searchAdResult.getClickPerDownloadUrl(), searchAdResult.getClickPerInstallUrl(), Long.valueOf(searchAdResult.getAdId()));
    }

    public MinimalAdInterface map(final RoomStoredMinimalAd roomStoredMinimalAd) {
        return new MinimalAdInterface() { // from class: cm.aptoide.pt.ads.MinimalAdMapper.1
            public String cpdUrl;

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public String getCpcUrl() {
                return roomStoredMinimalAd.getCpcUrl();
            }

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public String getCpdUrl() {
                String str = this.cpdUrl;
                return str == null ? roomStoredMinimalAd.getCpdUrl() : str;
            }

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public String getCpiUrl() {
                return roomStoredMinimalAd.getCpiUrl();
            }

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public void setCpdUrl(String str) {
                this.cpdUrl = str;
            }
        };
    }

    public MinimalAdInterface map(final SearchAdResult searchAdResult) {
        return new MinimalAdInterface() { // from class: cm.aptoide.pt.ads.MinimalAdMapper.2
            public String cpdUrl;

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public String getCpcUrl() {
                return searchAdResult.getCpcUrl();
            }

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public String getCpdUrl() {
                String str = this.cpdUrl;
                return str == null ? searchAdResult.getClickPerDownloadUrl() : str;
            }

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public String getCpiUrl() {
                return searchAdResult.getClickPerInstallUrl();
            }

            @Override // cm.aptoide.p092pt.dataprovider.model.MinimalAdInterface
            public void setCpdUrl(String str) {
                this.cpdUrl = str;
            }
        };
    }
}
