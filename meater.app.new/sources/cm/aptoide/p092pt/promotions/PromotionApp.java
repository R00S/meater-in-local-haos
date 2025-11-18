package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import java.util.List;

/* loaded from: classes.dex */
public class PromotionApp {
    private final String alternativePath;
    private final String appIcon;
    private final long appId;
    private final float appcValue;
    private final List<String> bdsFlags;
    private final String description;
    private final String downloadPath;
    private final String fiatSymbol;
    private final double fiatValue;
    private final boolean hasAppc;
    private final boolean isClaimed;
    private final String md5;
    private final String name;
    private final int numberOfDownloads;
    private final Obb obb;
    private final String packageName;
    private final String rank;
    private final float rating;
    private final List<String> requiredSplits;
    private final String signature;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final int versionCode;
    private final String versionName;

    public PromotionApp(String str, String str2, long j2, String str3, String str4, String str5, String str6, long j3, float f2, int i2, String str7, int i3, boolean z, String str8, Obb obb, float f3, String str9, boolean z2, List<Split> list, List<String> list2, String str10, String str11, double d2, String str12, List<String> list3) {
        this.name = str;
        this.packageName = str2;
        this.appId = j2;
        this.downloadPath = str3;
        this.alternativePath = str4;
        this.appIcon = str5;
        this.description = str6;
        this.size = j3;
        this.rating = f2;
        this.numberOfDownloads = i2;
        this.md5 = str7;
        this.versionCode = i3;
        this.isClaimed = z;
        this.versionName = str8;
        this.obb = obb;
        this.appcValue = f3;
        this.signature = str9;
        this.hasAppc = z2;
        this.splits = list;
        this.requiredSplits = list2;
        this.rank = str10;
        this.storeName = str11;
        this.fiatValue = d2;
        this.fiatSymbol = str12;
        this.bdsFlags = list3;
    }

    public String getAlternativePath() {
        return this.alternativePath;
    }

    public String getAppIcon() {
        return this.appIcon;
    }

    public long getAppId() {
        return this.appId;
    }

    public float getAppcValue() {
        return this.appcValue;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDownloadPath() {
        return this.downloadPath;
    }

    public String getFiatSymbol() {
        return this.fiatSymbol;
    }

    public double getFiatValue() {
        return this.fiatValue;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfDownloads() {
        return this.numberOfDownloads;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getRank() {
        return this.rank;
    }

    public float getRating() {
        return this.rating;
    }

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public String getSignature() {
        return this.signature;
    }

    public long getSize() {
        return this.size;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    public boolean isClaimed() {
        return this.isClaimed;
    }
}
