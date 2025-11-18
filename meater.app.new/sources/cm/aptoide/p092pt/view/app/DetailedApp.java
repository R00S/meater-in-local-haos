package cm.aptoide.p092pt.view.app;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import java.util.List;

/* loaded from: classes.dex */
public class DetailedApp {
    private final String added;
    private String appCategory;
    private final AppDeveloper appDeveloper;
    private final AppFlags appFlags;
    private List<String> bdsFlags;
    private Campaign campaign;
    private final long fileSize;
    private final String graphic;
    private boolean hasAdvertising;
    private boolean hasBilling;
    private final String icon;

    /* renamed from: id */
    private long f11690id;
    private final boolean isBeta;
    private final boolean isGoodApp;
    private final boolean isLatestTrustedVersion;
    private boolean isMature;
    private final Malware malware;
    private final String md5;
    private final AppMedia media;
    private final String modified;
    private final String name;
    private final Obb obb;
    private final String packageName;
    private String path;
    private final String pathAlt;
    private final List<String> requiredSplits;
    private String signature;
    private final long size;
    private final List<Split> splits;
    private final AppStats stats;
    private final Store store;
    private final List<String> tags;
    private final String uniqueName;
    private final List<String> usedFeatures;
    private final List<String> usedPermissions;
    private final int versionCode;
    private final String versionName;

    public DetailedApp(long j2, String str, String str2, long j3, String str3, String str4, String str5, String str6, boolean z, Malware malware, AppFlags appFlags, List<String> list, List<String> list2, List<String> list3, long j4, String str7, String str8, String str9, int i2, String str10, AppDeveloper appDeveloper, Store store, AppMedia appMedia, AppStats appStats, Obb obb, boolean z2, String str11, boolean z3, boolean z4, List<String> list4, boolean z5, String str12, List<Split> list5, List<String> list6, boolean z6, String str13, Campaign campaign) {
        this.f11690id = j2;
        this.name = str;
        this.packageName = str2;
        this.size = j3;
        this.icon = str3;
        this.graphic = str4;
        this.added = str5;
        this.modified = str6;
        this.isGoodApp = z;
        this.malware = malware;
        this.appFlags = appFlags;
        this.tags = list;
        this.usedFeatures = list2;
        this.usedPermissions = list3;
        this.fileSize = j4;
        this.md5 = str7;
        this.path = str8;
        this.pathAlt = str9;
        this.versionCode = i2;
        this.versionName = str10;
        this.appDeveloper = appDeveloper;
        this.store = store;
        this.media = appMedia;
        this.stats = appStats;
        this.obb = obb;
        this.hasBilling = z3;
        this.hasAdvertising = z4;
        this.bdsFlags = list4;
        this.isMature = z5;
        this.splits = list5;
        this.requiredSplits = list6;
        this.signature = str12;
        this.isLatestTrustedVersion = z2;
        this.uniqueName = str11;
        this.isBeta = z6;
        this.appCategory = str13;
        this.campaign = campaign;
    }

    public String getAdded() {
        return this.added;
    }

    public String getAppCategory() {
        return this.appCategory;
    }

    public AppFlags getAppFlags() {
        return this.appFlags;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }

    public AppDeveloper getDeveloper() {
        return this.appDeveloper;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f11690id;
    }

    public Malware getMalware() {
        return this.malware;
    }

    public String getMd5() {
        return this.md5;
    }

    public AppMedia getMedia() {
        return this.media;
    }

    public String getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathAlt() {
        return this.pathAlt;
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

    public AppStats getStats() {
        return this.stats;
    }

    public Store getStore() {
        return this.store;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getUniqueName() {
        return this.uniqueName;
    }

    public List<String> getUsedFeatures() {
        return this.usedFeatures;
    }

    public List<String> getUsedPermissions() {
        return this.usedPermissions;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean hasAdvertising() {
        return this.hasAdvertising;
    }

    public boolean hasBilling() {
        return this.hasBilling;
    }

    public boolean isBeta() {
        return this.isBeta;
    }

    public boolean isGoodApp() {
        return this.isGoodApp;
    }

    public boolean isLatestTrustedVersion() {
        return this.isLatestTrustedVersion;
    }

    public boolean isMature() {
        return this.isMature;
    }

    public void setBdsFlags(List<String> list) {
        this.bdsFlags = list;
    }

    public void setId(long j2) {
        this.f11690id = j2;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
