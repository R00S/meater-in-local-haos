package cm.aptoide.p092pt.app;

import cm.aptoide.analytics.AnalyticsManager;
import java.util.Map;

/* loaded from: classes.dex */
public class CampaignAnalytics {
    private final AnalyticsManager analyticsManager;
    private final Map<String, CampaignEvent> cache;

    public static class CampaignEvent {
        private String packageName;
        private String url;
        private int vercode;

        public CampaignEvent(String str, String str2, int i2) {
            this.url = str;
            this.packageName = str2;
            this.vercode = i2;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getUrl() {
            return this.url;
        }

        public int getVercode() {
            return this.vercode;
        }
    }

    public CampaignAnalytics(Map<String, CampaignEvent> map, AnalyticsManager analyticsManager) {
        this.cache = map;
        this.analyticsManager = analyticsManager;
    }

    public void convertCampaignEvent(String str, int i2) {
        String str2 = str + String.valueOf(i2);
        if (this.cache.containsKey(str2)) {
            this.analyticsManager.logEvent(this.cache.get(str2).getUrl());
        }
    }

    public void sendCampaignConversionEvent(String str, String str2, int i2) {
        CampaignEvent campaignEvent = new CampaignEvent(str, str2, i2);
        this.cache.put(str2 + String.valueOf(i2), campaignEvent);
    }
}
