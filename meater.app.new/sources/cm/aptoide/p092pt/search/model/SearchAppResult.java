package cm.aptoide.p092pt.search.model;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.download.view.Download;
import cm.aptoide.p092pt.download.view.DownloadStatusModel;
import cm.aptoide.p092pt.search.model.SearchItem;
import cm.aptoide.p092pt.view.app.AppScreenshot;
import java.util.List;

/* loaded from: classes.dex */
public class SearchAppResult implements SearchItem {
    private String appCategory;
    private float averageRating;
    private Campaign campaign;
    private String developerName;
    private Download download;
    private boolean hasOtherVersions;
    private boolean isHighlightedResult;
    private boolean isInCatappult;
    private long modifiedDate;
    private int rank;
    private List<AppScreenshot> screenshots;
    private Long storeId;
    private String storeTheme;
    private long totalDownloads;

    public SearchAppResult() {
    }

    public String getAppCategory() {
        return this.appCategory;
    }

    public long getAppId() {
        return this.download.getAppId();
    }

    public String getAppName() {
        return this.download.getAppName();
    }

    public float getAverageRating() {
        return this.averageRating;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }

    public String getDeveloperName() {
        return this.developerName;
    }

    public Download getDownload() {
        return this.download;
    }

    public DownloadStatusModel getDownloadModel() {
        return this.download.getDownloadModel();
    }

    public String getIcon() {
        return this.download.getIcon();
    }

    @Override // cm.aptoide.p092pt.search.model.SearchItem
    public long getId() {
        return SearchItem.Type.APP.ordinal() + this.download.getAppId();
    }

    public Malware getMalware() {
        return this.download.getMalware();
    }

    public String getMd5() {
        return this.download.getMd5();
    }

    public long getModifiedDate() {
        return this.modifiedDate;
    }

    public Obb getObb() {
        return this.download.getObb();
    }

    public String getOemId() {
        return this.download.getOemId();
    }

    public String getPackageName() {
        return this.download.getPackageName();
    }

    public String getPath() {
        return this.download.getPath();
    }

    public String getPathAlt() {
        return this.download.getPathAlt();
    }

    public int getRank() {
        return this.rank;
    }

    public List<String> getRequiredSplits() {
        return this.download.getRequiredSplits();
    }

    public List<AppScreenshot> getScreenshots() {
        return this.screenshots;
    }

    public long getSize() {
        return this.download.getSize();
    }

    public List<Split> getSplits() {
        return this.download.getSplits();
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.download.getStoreName();
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public long getTotalDownloads() {
        return this.totalDownloads;
    }

    @Override // cm.aptoide.p092pt.search.model.SearchItem
    public SearchItem.Type getType() {
        return SearchItem.Type.APP;
    }

    public int getVersionCode() {
        return this.download.getVersionCode();
    }

    public String getVersionName() {
        return this.download.getVersionName();
    }

    public boolean hasAdvertising() {
        return this.download.getHasAdvertising();
    }

    public boolean hasBilling() {
        return this.download.getHasBilling();
    }

    public boolean hasOtherVersions() {
        return this.hasOtherVersions;
    }

    public boolean isAppcApp() {
        return hasBilling() || hasAdvertising();
    }

    public boolean isHighlightedResult() {
        return this.isHighlightedResult;
    }

    public boolean isInCatappult() {
        return this.isInCatappult;
    }

    public SearchAppResult(int i2, String str, String str2, Long l, String str3, long j2, float f2, long j3, String str4, String str5, String str6, long j4, int i3, String str7, String str8, String str9, Malware malware, long j5, boolean z, boolean z2, boolean z3, String str10, boolean z4, Obb obb, List<String> list, List<Split> list2, DownloadStatusModel downloadStatusModel, List<AppScreenshot> list3, boolean z5, String str11, Campaign campaign, String str12) {
        this.rank = i2;
        this.developerName = str12;
        this.storeTheme = str3;
        this.modifiedDate = j2;
        this.averageRating = f2;
        this.totalDownloads = j3;
        this.hasOtherVersions = z;
        this.storeId = l;
        this.isHighlightedResult = z4;
        this.screenshots = list3;
        this.isInCatappult = z5;
        this.appCategory = str11;
        this.campaign = campaign;
        this.download = new Download(j4, str4, str5, str6, str7, i3, str, str8, str9, j5, obb, str2, z3, z2, malware, list2, list, str10, downloadStatusModel, str11, campaign);
    }

    public SearchAppResult(SearchAppResult searchAppResult, DownloadStatusModel downloadStatusModel, List<AppScreenshot> list, boolean z, String str, Campaign campaign) {
        this(searchAppResult.getRank(), searchAppResult.getIcon(), searchAppResult.getStoreName(), searchAppResult.getStoreId(), searchAppResult.getStoreTheme(), searchAppResult.getModifiedDate(), searchAppResult.getAverageRating(), searchAppResult.getTotalDownloads(), searchAppResult.getAppName(), searchAppResult.getPackageName(), searchAppResult.getMd5(), searchAppResult.getAppId(), searchAppResult.getVersionCode(), searchAppResult.getVersionName(), searchAppResult.getPath(), searchAppResult.getPathAlt(), searchAppResult.getMalware(), searchAppResult.getSize(), searchAppResult.hasOtherVersions(), searchAppResult.hasBilling(), searchAppResult.hasAdvertising(), searchAppResult.getOemId(), searchAppResult.isHighlightedResult(), searchAppResult.getObb(), searchAppResult.getRequiredSplits(), searchAppResult.getSplits(), downloadStatusModel, list, z, str, campaign, searchAppResult.developerName);
    }
}
