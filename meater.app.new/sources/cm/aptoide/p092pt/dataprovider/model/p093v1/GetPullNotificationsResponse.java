package cm.aptoide.p092pt.dataprovider.model.p093v1;

import java.util.List;

/* loaded from: classes.dex */
public class GetPullNotificationsResponse {
    private String abTestingGroup;
    private Attr attr;
    private String body;
    private int campaignId;
    private Long expire;
    private String img;
    private String lang;
    private String title;
    private int type;
    private String url;
    private String urlTrack;
    private String urlTrackNc;
    private List<String> whitelistedPackages;

    public String getAbTestingGroup() {
        return this.abTestingGroup;
    }

    public Attr getAttr() {
        return this.attr;
    }

    public String getBody() {
        return this.body;
    }

    public int getCampaignId() {
        return this.campaignId;
    }

    public Long getExpire() {
        return this.expire;
    }

    public String getImg() {
        return this.img;
    }

    public String getLang() {
        return this.lang;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlTrack() {
        return this.urlTrack;
    }

    public String getUrlTrackNc() {
        return this.urlTrackNc;
    }

    public List<String> getWhitelistedPackages() {
        return this.whitelistedPackages;
    }

    public void setAbTestingGroup(String str) {
        this.abTestingGroup = str;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCampaignId(int i2) {
        this.campaignId = i2;
    }

    public void setExpire(long j2) {
        this.expire = Long.valueOf(j2);
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrlTrack(String str) {
        this.urlTrack = str;
    }

    public void setUrlTrackNc(String str) {
        this.urlTrackNc = str;
    }

    public void setWhitelistedPackages(List<String> list) {
        this.whitelistedPackages = list;
    }
}
