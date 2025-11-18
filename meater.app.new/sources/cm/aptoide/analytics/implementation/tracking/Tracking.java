package cm.aptoide.analytics.implementation.tracking;

/* loaded from: classes.dex */
public class Tracking {
    private final String browser;
    private final String country;
    private final String packageName;
    private final String siteVersion;
    private final String url;
    private final String userAgent;

    public Tracking(String str, String str2, String str3, String str4, String str5, String str6) {
        this.url = str;
        this.packageName = str2;
        this.country = str3;
        this.browser = str4;
        this.siteVersion = str5;
        this.userAgent = str6;
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSiteVersion() {
        return this.siteVersion;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserAgent() {
        return this.userAgent;
    }
}
