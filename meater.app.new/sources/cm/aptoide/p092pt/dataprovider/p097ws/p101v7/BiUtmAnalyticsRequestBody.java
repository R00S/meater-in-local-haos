package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

/* loaded from: classes.dex */
public class BiUtmAnalyticsRequestBody extends BaseBody {
    private final Data data;

    public static class App {
        private String packageName;
        private String url;

        protected boolean canEqual(Object obj) {
            return obj instanceof App;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof App)) {
                return false;
            }
            App app = (App) obj;
            if (!app.canEqual(this)) {
                return false;
            }
            String url = getUrl();
            String url2 = app.getUrl();
            if (url != null ? !url.equals(url2) : url2 != null) {
                return false;
            }
            String packageName = getPackageName();
            String packageName2 = app.getPackageName();
            return packageName != null ? packageName.equals(packageName2) : packageName2 == null;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String url = getUrl();
            int iHashCode = url == null ? 43 : url.hashCode();
            String packageName = getPackageName();
            return ((iHashCode + 59) * 59) + (packageName != null ? packageName.hashCode() : 43);
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "BiUtmAnalyticsRequestBody.App(url=" + getUrl() + ", packageName=" + getPackageName() + ")";
        }
    }

    public static class Data {
        private App app;
        private String entryPoint;
        private String siteVersion;
        private String userAgent;
        private UTM utm;

        protected boolean canEqual(Object obj) {
            return obj instanceof Data;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            if (!data.canEqual(this)) {
                return false;
            }
            String entryPoint = getEntryPoint();
            String entryPoint2 = data.getEntryPoint();
            if (entryPoint != null ? !entryPoint.equals(entryPoint2) : entryPoint2 != null) {
                return false;
            }
            String siteVersion = getSiteVersion();
            String siteVersion2 = data.getSiteVersion();
            if (siteVersion != null ? !siteVersion.equals(siteVersion2) : siteVersion2 != null) {
                return false;
            }
            App app = getApp();
            App app2 = data.getApp();
            if (app != null ? !app.equals(app2) : app2 != null) {
                return false;
            }
            UTM utm = getUtm();
            UTM utm2 = data.getUtm();
            if (utm != null ? !utm.equals(utm2) : utm2 != null) {
                return false;
            }
            String userAgent = getUserAgent();
            String userAgent2 = data.getUserAgent();
            return userAgent != null ? userAgent.equals(userAgent2) : userAgent2 == null;
        }

        public App getApp() {
            return this.app;
        }

        public String getEntryPoint() {
            return this.entryPoint;
        }

        public String getSiteVersion() {
            return this.siteVersion;
        }

        public String getUserAgent() {
            return this.userAgent;
        }

        public UTM getUtm() {
            return this.utm;
        }

        public int hashCode() {
            String entryPoint = getEntryPoint();
            int iHashCode = entryPoint == null ? 43 : entryPoint.hashCode();
            String siteVersion = getSiteVersion();
            int iHashCode2 = ((iHashCode + 59) * 59) + (siteVersion == null ? 43 : siteVersion.hashCode());
            App app = getApp();
            int iHashCode3 = (iHashCode2 * 59) + (app == null ? 43 : app.hashCode());
            UTM utm = getUtm();
            int iHashCode4 = (iHashCode3 * 59) + (utm == null ? 43 : utm.hashCode());
            String userAgent = getUserAgent();
            return (iHashCode4 * 59) + (userAgent != null ? userAgent.hashCode() : 43);
        }

        public void setApp(App app) {
            this.app = app;
        }

        public void setEntryPoint(String str) {
            this.entryPoint = str;
        }

        public void setSiteVersion(String str) {
            this.siteVersion = str;
        }

        public void setUserAgent(String str) {
            this.userAgent = str;
        }

        public void setUtm(UTM utm) {
            this.utm = utm;
        }

        public String toString() {
            return "BiUtmAnalyticsRequestBody.Data(entryPoint=" + getEntryPoint() + ", siteVersion=" + getSiteVersion() + ", app=" + getApp() + ", utm=" + getUtm() + ", userAgent=" + getUserAgent() + ")";
        }
    }

    public static class UTM {
        private String campaign;
        private String content;
        private String medium;
        private String source;

        protected boolean canEqual(Object obj) {
            return obj instanceof UTM;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UTM)) {
                return false;
            }
            UTM utm = (UTM) obj;
            if (!utm.canEqual(this)) {
                return false;
            }
            String source = getSource();
            String source2 = utm.getSource();
            if (source != null ? !source.equals(source2) : source2 != null) {
                return false;
            }
            String medium = getMedium();
            String medium2 = utm.getMedium();
            if (medium != null ? !medium.equals(medium2) : medium2 != null) {
                return false;
            }
            String campaign = getCampaign();
            String campaign2 = utm.getCampaign();
            if (campaign != null ? !campaign.equals(campaign2) : campaign2 != null) {
                return false;
            }
            String content = getContent();
            String content2 = utm.getContent();
            return content != null ? content.equals(content2) : content2 == null;
        }

        public String getCampaign() {
            return this.campaign;
        }

        public String getContent() {
            return this.content;
        }

        public String getMedium() {
            return this.medium;
        }

        public String getSource() {
            return this.source;
        }

        public int hashCode() {
            String source = getSource();
            int iHashCode = source == null ? 43 : source.hashCode();
            String medium = getMedium();
            int iHashCode2 = ((iHashCode + 59) * 59) + (medium == null ? 43 : medium.hashCode());
            String campaign = getCampaign();
            int iHashCode3 = (iHashCode2 * 59) + (campaign == null ? 43 : campaign.hashCode());
            String content = getContent();
            return (iHashCode3 * 59) + (content != null ? content.hashCode() : 43);
        }

        public void setCampaign(String str) {
            this.campaign = str;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setMedium(String str) {
            this.medium = str;
        }

        public void setSource(String str) {
            this.source = str;
        }

        public String toString() {
            return "BiUtmAnalyticsRequestBody.UTM(source=" + getSource() + ", medium=" + getMedium() + ", campaign=" + getCampaign() + ", content=" + getContent() + ")";
        }
    }

    public BiUtmAnalyticsRequestBody(Data data) {
        this.data = data;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof BiUtmAnalyticsRequestBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BiUtmAnalyticsRequestBody)) {
            return false;
        }
        BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody = (BiUtmAnalyticsRequestBody) obj;
        if (!biUtmAnalyticsRequestBody.canEqual(this)) {
            return false;
        }
        Data data = getData();
        Data data2 = biUtmAnalyticsRequestBody.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Data getData() {
        return this.data;
    }

    public int hashCode() {
        Data data = getData();
        return 59 + (data == null ? 43 : data.hashCode());
    }

    public String toString() {
        return "BiUtmAnalyticsRequestBody(data=" + getData() + ")";
    }
}
