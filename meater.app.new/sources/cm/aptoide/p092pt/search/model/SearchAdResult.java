package cm.aptoide.p092pt.search.model;

import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.ads.data.Payout;

/* loaded from: classes.dex */
public class SearchAdResult {
    long adId;
    long appId;
    String appName;
    String clickPerDownloadUrl;
    String clickPerInstallUrl;
    String clickUrl;
    String cpcUrl;
    String icon;
    boolean isAppc;
    long modifiedDate;
    long networkId;
    String packageName;
    Payout payout;
    float starRating;
    long totalDownloads;

    public SearchAdResult() {
    }

    public long getAdId() {
        return this.adId;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getClickPerDownloadUrl() {
        return this.clickPerDownloadUrl;
    }

    public String getClickPerInstallUrl() {
        return this.clickPerInstallUrl;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCpcUrl() {
        return this.cpcUrl;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getModifiedDate() {
        return this.modifiedDate;
    }

    public long getNetworkId() {
        return this.networkId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Payout getPayout() {
        return this.payout;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public long getTotalDownloads() {
        return this.totalDownloads;
    }

    public boolean isAppc() {
        return this.isAppc;
    }

    public SearchAdResult(long j2, String str, long j3, float f2, long j4, String str2, String str3, String str4, String str5, String str6, String str7, long j5, long j6, boolean z, Payout payout) {
        this.adId = j2;
        this.icon = str;
        this.totalDownloads = j3;
        this.starRating = f2;
        this.modifiedDate = j4;
        this.packageName = str2;
        this.cpcUrl = str3;
        this.clickPerDownloadUrl = str4;
        this.clickPerInstallUrl = str5;
        this.clickUrl = str6;
        this.appName = str7;
        this.appId = j5;
        this.networkId = j6;
        this.isAppc = z;
        this.payout = payout;
    }

    public SearchAdResult(MinimalAd minimalAd) {
        this(minimalAd.getAdId(), minimalAd.getIconPath(), minimalAd.getDownloads(), minimalAd.getStars(), minimalAd.getModified(), minimalAd.getPackageName(), minimalAd.getCpcUrl(), minimalAd.getCpdUrl(), minimalAd.getCpiUrl(), minimalAd.getClickUrl(), minimalAd.getName(), minimalAd.getAppId(), minimalAd.getNetworkId(), minimalAd.getIsHasAppc(), new Payout(minimalAd.getAppcAmount(), minimalAd.getCurrencyAmount(), minimalAd.getCurrency(), minimalAd.getCurrencySymbol()));
    }

    public SearchAdResult(AptoideNativeAd aptoideNativeAd) {
        this(aptoideNativeAd.getAdId().longValue(), aptoideNativeAd.getIconUrl(), aptoideNativeAd.getDownloads(), aptoideNativeAd.getStars().intValue(), aptoideNativeAd.getModified().longValue(), aptoideNativeAd.getPackageName(), aptoideNativeAd.getCpcUrl(), aptoideNativeAd.getCpdUrl(), aptoideNativeAd.getCpiUrl(), aptoideNativeAd.getClickUrl(), aptoideNativeAd.getAdTitle(), aptoideNativeAd.getAppId(), aptoideNativeAd.getNetworkId().longValue(), aptoideNativeAd.hasAppcPayout(), aptoideNativeAd.getAppcPayout());
    }
}
