package cm.aptoide.p092pt.app.mmpcampaigns;

import cm.aptoide.p092pt.download.DownloadAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Campaign.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/app/mmpcampaigns/Campaign;", HttpUrl.FRAGMENT_ENCODE_SET, "impression", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/app/mmpcampaigns/CampaignUrl;", "click", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getClick", "()Ljava/util/List;", "getDownload", "getImpression", "component1", "component2", "component3", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Campaign {
    private final List<CampaignUrl> click;
    private final List<CampaignUrl> download;
    private final List<CampaignUrl> impression;

    public Campaign(List<CampaignUrl> list, List<CampaignUrl> list2, List<CampaignUrl> list3) {
        this.impression = list;
        this.click = list2;
        this.download = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Campaign copy$default(Campaign campaign, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = campaign.impression;
        }
        if ((i2 & 2) != 0) {
            list2 = campaign.click;
        }
        if ((i2 & 4) != 0) {
            list3 = campaign.download;
        }
        return campaign.copy(list, list2, list3);
    }

    public final List<CampaignUrl> component1() {
        return this.impression;
    }

    public final List<CampaignUrl> component2() {
        return this.click;
    }

    public final List<CampaignUrl> component3() {
        return this.download;
    }

    public final Campaign copy(List<CampaignUrl> impression, List<CampaignUrl> click, List<CampaignUrl> download) {
        return new Campaign(impression, click, download);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Campaign)) {
            return false;
        }
        Campaign campaign = (Campaign) other;
        return C9801m.m32341a(this.impression, campaign.impression) && C9801m.m32341a(this.click, campaign.click) && C9801m.m32341a(this.download, campaign.download);
    }

    public final List<CampaignUrl> getClick() {
        return this.click;
    }

    public final List<CampaignUrl> getDownload() {
        return this.download;
    }

    public final List<CampaignUrl> getImpression() {
        return this.impression;
    }

    public int hashCode() {
        List<CampaignUrl> list = this.impression;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CampaignUrl> list2 = this.click;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CampaignUrl> list3 = this.download;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "Campaign(impression=" + this.impression + ", click=" + this.click + ", download=" + this.download + ')';
    }
}
