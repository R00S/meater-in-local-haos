package cm.aptoide.p092pt.analytics;

import cm.aptoide.analytics.implementation.tracking.Tracking;
import cm.aptoide.analytics.implementation.tracking.UTM;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BiUtmAnalyticsRequestBody;

/* loaded from: classes.dex */
public class UTMTrackingBuilder {
    private final Tracking tracking;
    private final UTM utm;

    public UTMTrackingBuilder(Tracking tracking, UTM utm) {
        this.tracking = tracking;
        this.utm = utm;
    }

    public BiUtmAnalyticsRequestBody.Data getUTMTrackingData() {
        BiUtmAnalyticsRequestBody.Data data = new BiUtmAnalyticsRequestBody.Data();
        data.setEntryPoint(this.utm.getEntryPoint());
        data.setSiteVersion(this.tracking.getSiteVersion());
        data.setUserAgent(this.tracking.getUserAgent());
        BiUtmAnalyticsRequestBody.App app = new BiUtmAnalyticsRequestBody.App();
        app.setPackageName(this.tracking.getPackageName());
        app.setUrl(this.tracking.getUrl());
        data.setApp(app);
        BiUtmAnalyticsRequestBody.UTM utm = new BiUtmAnalyticsRequestBody.UTM();
        utm.setCampaign(this.utm.getUtmCampaign());
        utm.setContent(this.utm.getUtmContent());
        utm.setMedium(this.utm.getUtmMedium());
        utm.setSource(this.utm.getUtmSource());
        data.setUtm(utm);
        return data;
    }
}
