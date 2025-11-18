package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import java.util.List;

/* loaded from: classes.dex */
public class PromotionViewApp {
    private final String alternativePath;
    private final String appIcon;
    private final long appId;
    private final float appcValue;
    private final List<String> bdsFlags;
    private final String description;
    private DownloadModel downloadModel;
    private final String downloadPath;
    private String fiatSymbol;
    private double fiatValue;
    private final boolean hasAppc;
    private boolean isClaimed;
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

    public PromotionViewApp(DownloadModel downloadModel, String str, String str2, long j2, String str3, String str4, String str5, boolean z, String str6, long j3, float f2, int i2, String str7, int i3, String str8, Obb obb, float f3, String str9, boolean z2, List<Split> list, List<String> list2, String str10, String str11, double d2, String str12, List<String> list3) {
        this.downloadModel = downloadModel;
        this.name = str;
        this.packageName = str2;
        this.appId = j2;
        this.downloadPath = str3;
        this.alternativePath = str4;
        this.appIcon = str5;
        this.isClaimed = z;
        this.description = str6;
        this.size = j3;
        this.rating = f2;
        this.numberOfDownloads = i2;
        this.md5 = str7;
        this.versionCode = i3;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.md5;
        String str2 = ((PromotionViewApp) obj).md5;
        return str == null ? str2 == null : str.equals(str2);
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

    public DownloadModel getDownloadModel() {
        return this.downloadModel;
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

    public boolean hasSplits() {
        List<Split> list = this.splits;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public int hashCode() {
        DownloadModel downloadModel = this.downloadModel;
        int iHashCode = (downloadModel != null ? downloadModel.hashCode() : 0) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.packageName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.appId;
        int i2 = (iHashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.downloadPath;
        int iHashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.alternativePath;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.appIcon;
        int iHashCode6 = (((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.isClaimed ? 1 : 0)) * 31;
        String str6 = this.description;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        long j3 = this.size;
        int i3 = (iHashCode7 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f2 = this.rating;
        int iFloatToIntBits = (((i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.numberOfDownloads) * 31;
        String str7 = this.md5;
        int iHashCode8 = (((iFloatToIntBits + (str7 != null ? str7.hashCode() : 0)) * 31) + this.versionCode) * 31;
        String str8 = this.versionName;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Obb obb = this.obb;
        return iHashCode9 + (obb != null ? obb.hashCode() : 0);
    }

    public boolean isClaimed() {
        return this.isClaimed;
    }

    public void setClaimed() {
        this.isClaimed = true;
    }

    public void setDownloadModel(DownloadModel downloadModel) {
        this.downloadModel = downloadModel;
    }
}
