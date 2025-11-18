package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.view.app.AppDeveloper;
import cm.aptoide.p092pt.view.app.AppFlags;
import cm.aptoide.p092pt.view.app.AppMedia;
import cm.aptoide.p092pt.view.app.AppRating;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class AppModel {
    private static final String BDS_STORE_FLAG = "STORE_BDS";
    private final String appAdded;
    private String appCategory;
    private final AppDeveloper appDeveloper;
    private final AppFlags appFlags;
    private final long appId;
    private final String appName;
    private final double appc;
    private final List<String> bdsFlags;
    private Campaign campaign;
    private final String campaignUrl;
    private final int downloads;
    private final String editorsChoice;
    private final DetailedAppRequestResult.Error error;
    private final long fileSize;
    private final AppRating globalRating;
    private final String graphic;
    private final boolean hasAdvertising;
    private final boolean hasBilling;
    private final String icon;
    private final boolean isBeta;
    private final boolean isGoodApp;
    private final boolean isLatestTrustedVersion;
    private final boolean isMature;
    private final boolean isStoreFollowed;
    private final boolean loading;
    private final Malware malware;
    private final String marketName;
    private final String md5;
    private final AppMedia media;
    private final SearchAdResult minimalAd;
    private final String modified;
    private final Obb obb;
    private final String oemId;
    private final AppViewFragment.OpenType openType;
    private final String originTag;
    private final int packageDownloads;
    private final String packageName;
    private String path;
    private final String pathAlt;
    private final AppRating rating;
    private final List<String> requiredSplits;
    private final String signature;
    private final long size;
    private final List<Split> splits;
    private final Store store;
    private final String storeTheme;
    private final List<String> tags;
    private final String uniqueName;
    private final List<String> usedFeatures;
    private final List<String> usedPermissions;
    private final int versionCode;
    private final String versionName;

    public AppModel(long j2, String str, Store store, String str2, boolean z, Malware malware, AppFlags appFlags, List<String> list, List<String> list2, List<String> list3, long j3, String str3, String str4, String str5, int i2, String str6, String str7, long j4, int i3, AppRating appRating, int i4, AppRating appRating2, AppDeveloper appDeveloper, String str8, String str9, AppMedia appMedia, String str10, String str11, Obb obb, boolean z2, String str12, AppViewFragment.OpenType openType, double d2, SearchAdResult searchAdResult, String str13, String str14, boolean z3, String str15, boolean z4, boolean z5, List<String> list4, String str16, String str17, boolean z6, List<Split> list5, List<String> list6, String str18, boolean z7, String str19, Campaign campaign) {
        this.appId = j2;
        this.appName = str;
        this.store = store;
        this.storeTheme = str2;
        this.isGoodApp = z;
        this.malware = malware;
        this.appFlags = appFlags;
        this.tags = list;
        this.usedFeatures = list2;
        this.usedPermissions = list3;
        this.fileSize = j3;
        this.md5 = str3;
        this.path = str4;
        this.pathAlt = str5;
        this.versionCode = i2;
        this.versionName = str6;
        this.packageName = str7;
        this.size = j4;
        this.downloads = i3;
        this.globalRating = appRating;
        this.packageDownloads = i4;
        this.rating = appRating2;
        this.appDeveloper = appDeveloper;
        this.graphic = str8;
        this.icon = str9;
        this.media = appMedia;
        this.modified = str10;
        this.appAdded = str11;
        this.obb = obb;
        this.isLatestTrustedVersion = z2;
        this.uniqueName = str12;
        this.openType = openType;
        this.appc = d2;
        this.minimalAd = searchAdResult;
        this.editorsChoice = str13;
        this.originTag = str14;
        this.isStoreFollowed = z3;
        this.marketName = str15;
        this.hasBilling = z4;
        this.hasAdvertising = z5;
        this.bdsFlags = list4;
        this.campaignUrl = str16;
        this.signature = str17;
        this.isMature = z6;
        this.splits = list5;
        this.requiredSplits = list6;
        this.loading = false;
        this.error = null;
        this.oemId = str18;
        this.isBeta = z7;
        this.appCategory = str19;
        this.campaign = campaign;
    }

    public String getAppAdded() {
        return this.appAdded;
    }

    public String getAppCategory() {
        return this.appCategory;
    }

    public AppFlags getAppFlags() {
        return this.appFlags;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public double getAppc() {
        return this.appc;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }

    public String getCampaignUrl() {
        return this.campaignUrl;
    }

    public AppDeveloper getDeveloper() {
        return this.appDeveloper;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public String getEditorsChoice() {
        return this.editorsChoice;
    }

    public DetailedAppRequestResult.Error getError() {
        return this.error;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public AppRating getGlobalRating() {
        return this.globalRating;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public Malware getMalware() {
        return this.malware;
    }

    public String getMarketName() {
        return this.marketName;
    }

    public String getMd5() {
        return this.md5;
    }

    public AppMedia getMedia() {
        return this.media;
    }

    public SearchAdResult getMinimalAd() {
        return this.minimalAd;
    }

    public String getModified() {
        return this.modified;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getOemId() {
        return this.oemId;
    }

    public AppViewFragment.OpenType getOpenType() {
        return this.openType;
    }

    public String getOriginTag() {
        return this.originTag;
    }

    public int getPackageDownloads() {
        return this.packageDownloads;
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

    public AppRating getRating() {
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

    public Store getStore() {
        return this.store;
    }

    public String getStoreTheme() {
        return this.storeTheme;
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

    public boolean hasError() {
        return this.error != null;
    }

    public boolean hasSplits() {
        List<Split> list = this.splits;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isAppCoinApp() {
        return this.hasBilling || this.hasAdvertising;
    }

    public boolean isBeta() {
        return this.isBeta;
    }

    public boolean isFromEditorsChoice() {
        return !this.editorsChoice.isEmpty();
    }

    public boolean isGoodApp() {
        return this.isGoodApp;
    }

    public boolean isLatestTrustedVersion() {
        return this.isLatestTrustedVersion;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public boolean isMature() {
        return this.isMature;
    }

    public boolean isStoreFollowed() {
        return this.isStoreFollowed;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public AppModel(boolean z) {
        this.loading = z;
        this.appId = -1L;
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.store = null;
        this.storeTheme = HttpUrl.FRAGMENT_ENCODE_SET;
        this.isGoodApp = false;
        this.malware = null;
        this.appFlags = null;
        this.tags = null;
        this.usedFeatures = null;
        this.usedPermissions = null;
        this.fileSize = -1L;
        this.md5 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.versionCode = -1;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.size = -1L;
        this.downloads = -1;
        this.globalRating = null;
        this.packageDownloads = -1;
        this.rating = null;
        this.appDeveloper = null;
        this.graphic = null;
        this.icon = null;
        this.media = null;
        this.modified = null;
        this.appAdded = null;
        this.obb = null;
        this.isLatestTrustedVersion = false;
        this.uniqueName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.openType = null;
        this.appc = -1.0d;
        this.minimalAd = null;
        this.editorsChoice = HttpUrl.FRAGMENT_ENCODE_SET;
        this.originTag = HttpUrl.FRAGMENT_ENCODE_SET;
        this.marketName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.isStoreFollowed = false;
        this.signature = HttpUrl.FRAGMENT_ENCODE_SET;
        this.error = null;
        this.hasBilling = false;
        this.hasAdvertising = false;
        this.isMature = false;
        this.bdsFlags = null;
        this.campaignUrl = HttpUrl.FRAGMENT_ENCODE_SET;
        this.splits = null;
        this.requiredSplits = null;
        this.oemId = null;
        this.isBeta = false;
        this.appCategory = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = new Campaign(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public AppModel(DetailedAppRequestResult.Error error) {
        this.error = error;
        this.appId = -1L;
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        Store store = new Store();
        this.store = store;
        store.setId(-1L);
        this.storeTheme = HttpUrl.FRAGMENT_ENCODE_SET;
        this.isGoodApp = false;
        this.malware = null;
        this.appFlags = null;
        this.tags = null;
        this.usedFeatures = null;
        this.usedPermissions = null;
        this.fileSize = -1L;
        this.md5 = HttpUrl.FRAGMENT_ENCODE_SET;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.versionCode = -1;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.size = -1L;
        this.downloads = -1;
        this.globalRating = null;
        this.packageDownloads = -1;
        this.rating = null;
        this.appDeveloper = null;
        this.graphic = null;
        this.icon = null;
        this.media = null;
        this.modified = null;
        this.appAdded = null;
        this.obb = null;
        this.isLatestTrustedVersion = false;
        this.uniqueName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.openType = null;
        this.appc = -1.0d;
        this.minimalAd = null;
        this.editorsChoice = HttpUrl.FRAGMENT_ENCODE_SET;
        this.originTag = HttpUrl.FRAGMENT_ENCODE_SET;
        this.marketName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.isStoreFollowed = false;
        this.signature = HttpUrl.FRAGMENT_ENCODE_SET;
        this.loading = false;
        this.hasBilling = false;
        this.hasAdvertising = false;
        this.isMature = false;
        this.bdsFlags = null;
        this.campaignUrl = HttpUrl.FRAGMENT_ENCODE_SET;
        this.splits = null;
        this.requiredSplits = null;
        this.oemId = null;
        this.isBeta = false;
        this.appCategory = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = new Campaign(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }
}
