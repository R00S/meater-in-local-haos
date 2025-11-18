package cm.aptoide.p092pt.database.room;

/* loaded from: classes.dex */
public class RoomStoredMinimalAd {
    private Long adId;
    private String cpcUrl;
    private String cpdUrl;
    private String cpiUrl;
    private String packageName;
    private String referrer;
    private Long timestamp = Long.valueOf(System.currentTimeMillis());

    public RoomStoredMinimalAd(String str, String str2, String str3, String str4, String str5, Long l) {
        this.packageName = str;
        this.referrer = str2;
        this.cpcUrl = str3;
        this.cpdUrl = str4;
        this.cpiUrl = str5;
        this.adId = l;
    }

    public Long getAdId() {
        return this.adId;
    }

    public String getCpcUrl() {
        return this.cpcUrl;
    }

    public String getCpdUrl() {
        return this.cpdUrl;
    }

    public String getCpiUrl() {
        return this.cpiUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setCpcUrl(String str) {
        this.cpcUrl = str;
    }

    public void setCpdUrl(String str) {
        this.cpdUrl = str;
    }

    public void setCpiUrl(String str) {
        this.cpiUrl = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setReferrer(String str) {
        this.referrer = str;
    }

    public void setTimestamp(Long l) {
        this.timestamp = l;
    }
}
