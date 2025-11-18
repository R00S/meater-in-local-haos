package cm.aptoide.p092pt.download.view;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Download.kt */
@Metadata(m32266d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0013HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0016HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020 HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\nHÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003Jë\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001J\u0013\u0010V\u001a\u00020\u00132\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\nHÖ\u0001J\t\u0010Y\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#¨\u0006Z"}, m32267d2 = {"Lcm/aptoide/pt/download/view/Download;", HttpUrl.FRAGMENT_ENCODE_SET, "appId", HttpUrl.FRAGMENT_ENCODE_SET, "appName", HttpUrl.FRAGMENT_ENCODE_SET, "packageName", "md5", RoomInstalled.VERSION_NAME, RoomInstalled.VERSION_CODE, HttpUrl.FRAGMENT_ENCODE_SET, RoomInstalled.ICON, "path", "pathAlt", "size", "obb", "Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "storeName", "hasAdvertising", HttpUrl.FRAGMENT_ENCODE_SET, "hasBilling", "malware", "Lcm/aptoide/pt/dataprovider/model/v7/Malware;", "splits", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/Split;", "requiredSplits", DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY, "downloadModel", "Lcm/aptoide/pt/download/view/DownloadStatusModel;", "appCategory", "campaign", "Lcm/aptoide/pt/app/mmpcampaigns/Campaign;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcm/aptoide/pt/dataprovider/model/v7/Obb;Ljava/lang/String;ZZLcm/aptoide/pt/dataprovider/model/v7/Malware;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcm/aptoide/pt/download/view/DownloadStatusModel;Ljava/lang/String;Lcm/aptoide/pt/app/mmpcampaigns/Campaign;)V", "getAppCategory", "()Ljava/lang/String;", "getAppId", "()J", "getAppName", "getCampaign", "()Lcm/aptoide/pt/app/mmpcampaigns/Campaign;", "getDownloadModel", "()Lcm/aptoide/pt/download/view/DownloadStatusModel;", "getHasAdvertising", "()Z", "getHasBilling", "getIcon", "getMalware", "()Lcm/aptoide/pt/dataprovider/model/v7/Malware;", "getMd5", "getObb", "()Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "getOemId", "getPackageName", "getPath", "getPathAlt", "getRequiredSplits", "()Ljava/util/List;", "getSize", "getSplits", "getStoreName", "getVersionCode", "()I", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Download {
    private final String appCategory;
    private final long appId;
    private final String appName;
    private final Campaign campaign;
    private final DownloadStatusModel downloadModel;
    private final boolean hasAdvertising;
    private final boolean hasBilling;
    private final String icon;
    private final Malware malware;
    private final String md5;
    private final Obb obb;
    private final String oemId;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final int versionCode;
    private final String versionName;

    public Download(long j2, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, long j3, Obb obb, String str8, boolean z, boolean z2, Malware malware, List<Split> list, List<String> list2, String str9, DownloadStatusModel downloadStatusModel, String str10, Campaign campaign) {
        C9801m.m32346f(str, "appName");
        C9801m.m32346f(str2, "packageName");
        C9801m.m32346f(str3, "md5");
        C9801m.m32346f(str4, RoomInstalled.VERSION_NAME);
        C9801m.m32346f(str5, RoomInstalled.ICON);
        C9801m.m32346f(str6, "path");
        C9801m.m32346f(str7, "pathAlt");
        C9801m.m32346f(str8, "storeName");
        C9801m.m32346f(malware, "malware");
        C9801m.m32346f(list, "splits");
        C9801m.m32346f(list2, "requiredSplits");
        C9801m.m32346f(str9, DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY);
        C9801m.m32346f(str10, "appCategory");
        C9801m.m32346f(campaign, "campaign");
        this.appId = j2;
        this.appName = str;
        this.packageName = str2;
        this.md5 = str3;
        this.versionName = str4;
        this.versionCode = i2;
        this.icon = str5;
        this.path = str6;
        this.pathAlt = str7;
        this.size = j3;
        this.obb = obb;
        this.storeName = str8;
        this.hasAdvertising = z;
        this.hasBilling = z2;
        this.malware = malware;
        this.splits = list;
        this.requiredSplits = list2;
        this.oemId = str9;
        this.downloadModel = downloadStatusModel;
        this.appCategory = str10;
        this.campaign = campaign;
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    /* renamed from: component10, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component11, reason: from getter */
    public final Obb getObb() {
        return this.obb;
    }

    /* renamed from: component12, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasAdvertising() {
        return this.hasAdvertising;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getHasBilling() {
        return this.hasBilling;
    }

    /* renamed from: component15, reason: from getter */
    public final Malware getMalware() {
        return this.malware;
    }

    public final List<Split> component16() {
        return this.splits;
    }

    public final List<String> component17() {
        return this.requiredSplits;
    }

    /* renamed from: component18, reason: from getter */
    public final String getOemId() {
        return this.oemId;
    }

    /* renamed from: component19, reason: from getter */
    public final DownloadStatusModel getDownloadModel() {
        return this.downloadModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAppCategory() {
        return this.appCategory;
    }

    /* renamed from: component21, reason: from getter */
    public final Campaign getCampaign() {
        return this.campaign;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* renamed from: component5, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPathAlt() {
        return this.pathAlt;
    }

    public final Download copy(long appId, String appName, String packageName, String md5, String versionName, int versionCode, String icon, String path, String pathAlt, long size, Obb obb, String storeName, boolean hasAdvertising, boolean hasBilling, Malware malware, List<Split> splits, List<String> requiredSplits, String oemId, DownloadStatusModel downloadModel, String appCategory, Campaign campaign) {
        C9801m.m32346f(appName, "appName");
        C9801m.m32346f(packageName, "packageName");
        C9801m.m32346f(md5, "md5");
        C9801m.m32346f(versionName, RoomInstalled.VERSION_NAME);
        C9801m.m32346f(icon, RoomInstalled.ICON);
        C9801m.m32346f(path, "path");
        C9801m.m32346f(pathAlt, "pathAlt");
        C9801m.m32346f(storeName, "storeName");
        C9801m.m32346f(malware, "malware");
        C9801m.m32346f(splits, "splits");
        C9801m.m32346f(requiredSplits, "requiredSplits");
        C9801m.m32346f(oemId, DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY);
        C9801m.m32346f(appCategory, "appCategory");
        C9801m.m32346f(campaign, "campaign");
        return new Download(appId, appName, packageName, md5, versionName, versionCode, icon, path, pathAlt, size, obb, storeName, hasAdvertising, hasBilling, malware, splits, requiredSplits, oemId, downloadModel, appCategory, campaign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Download)) {
            return false;
        }
        Download download = (Download) other;
        return this.appId == download.appId && C9801m.m32341a(this.appName, download.appName) && C9801m.m32341a(this.packageName, download.packageName) && C9801m.m32341a(this.md5, download.md5) && C9801m.m32341a(this.versionName, download.versionName) && this.versionCode == download.versionCode && C9801m.m32341a(this.icon, download.icon) && C9801m.m32341a(this.path, download.path) && C9801m.m32341a(this.pathAlt, download.pathAlt) && this.size == download.size && C9801m.m32341a(this.obb, download.obb) && C9801m.m32341a(this.storeName, download.storeName) && this.hasAdvertising == download.hasAdvertising && this.hasBilling == download.hasBilling && C9801m.m32341a(this.malware, download.malware) && C9801m.m32341a(this.splits, download.splits) && C9801m.m32341a(this.requiredSplits, download.requiredSplits) && C9801m.m32341a(this.oemId, download.oemId) && C9801m.m32341a(this.downloadModel, download.downloadModel) && C9801m.m32341a(this.appCategory, download.appCategory) && C9801m.m32341a(this.campaign, download.campaign);
    }

    public final String getAppCategory() {
        return this.appCategory;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final Campaign getCampaign() {
        return this.campaign;
    }

    public final DownloadStatusModel getDownloadModel() {
        return this.downloadModel;
    }

    public final boolean getHasAdvertising() {
        return this.hasAdvertising;
    }

    public final boolean getHasBilling() {
        return this.hasBilling;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Malware getMalware() {
        return this.malware;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Obb getObb() {
        return this.obb;
    }

    public final String getOemId() {
        return this.oemId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPathAlt() {
        return this.pathAlt;
    }

    public final List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public final long getSize() {
        return this.size;
    }

    public final List<Split> getSplits() {
        return this.splits;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM6829a = ((((((((((((((((((C1152a.m6829a(this.appId) * 31) + this.appName.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.md5.hashCode()) * 31) + this.versionName.hashCode()) * 31) + this.versionCode) * 31) + this.icon.hashCode()) * 31) + this.path.hashCode()) * 31) + this.pathAlt.hashCode()) * 31) + C1152a.m6829a(this.size)) * 31;
        Obb obb = this.obb;
        int iHashCode = (((iM6829a + (obb == null ? 0 : obb.hashCode())) * 31) + this.storeName.hashCode()) * 31;
        boolean z = this.hasAdvertising;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode + i2) * 31;
        boolean z2 = this.hasBilling;
        int iHashCode2 = (((((((((i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.malware.hashCode()) * 31) + this.splits.hashCode()) * 31) + this.requiredSplits.hashCode()) * 31) + this.oemId.hashCode()) * 31;
        DownloadStatusModel downloadStatusModel = this.downloadModel;
        return ((((iHashCode2 + (downloadStatusModel != null ? downloadStatusModel.hashCode() : 0)) * 31) + this.appCategory.hashCode()) * 31) + this.campaign.hashCode();
    }

    public String toString() {
        return "Download(appId=" + this.appId + ", appName=" + this.appName + ", packageName=" + this.packageName + ", md5=" + this.md5 + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", icon=" + this.icon + ", path=" + this.path + ", pathAlt=" + this.pathAlt + ", size=" + this.size + ", obb=" + this.obb + ", storeName=" + this.storeName + ", hasAdvertising=" + this.hasAdvertising + ", hasBilling=" + this.hasBilling + ", malware=" + this.malware + ", splits=" + this.splits + ", requiredSplits=" + this.requiredSplits + ", oemId=" + this.oemId + ", downloadModel=" + this.downloadModel + ", appCategory=" + this.appCategory + ", campaign=" + this.campaign + ')';
    }
}
