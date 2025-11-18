package cm.aptoide.analytics.implementation.tracking;

/* loaded from: classes.dex */
public class UTM {
    private final String entryPoint;
    private final String utmCampaign;
    private final String utmContent;
    private final String utmMedium;
    private final String utmSource;

    public UTM(String str, String str2, String str3, String str4, String str5) {
        this.utmSource = str;
        this.utmMedium = str2;
        this.utmCampaign = str3;
        this.utmContent = str4;
        this.entryPoint = str5;
    }

    public String getEntryPoint() {
        return this.entryPoint;
    }

    public String getUtmCampaign() {
        return this.utmCampaign;
    }

    public String getUtmContent() {
        return this.utmContent;
    }

    public String getUtmMedium() {
        return this.utmMedium;
    }

    public String getUtmSource() {
        return this.utmSource;
    }
}
