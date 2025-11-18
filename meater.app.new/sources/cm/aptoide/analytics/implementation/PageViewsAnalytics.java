package cm.aptoide.analytics.implementation;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PageViewsAnalytics {
    public static final String PAGE_VIEW_EVENT = "Page_View";
    private final AnalyticsManager analyticsManager;

    public PageViewsAnalytics(AnalyticsManager analyticsManager) {
        this.analyticsManager = analyticsManager;
    }

    private Map<String, Object> createEventMap(String str, String str2) {
        HashMap map = new HashMap();
        map.put("fragment", str);
        map.put(AccountAnalytics.STORE, str2);
        return map;
    }

    public void sendPageViewedEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createEventMap(str, str3), PAGE_VIEW_EVENT, AnalyticsManager.Action.CLICK, str2);
    }
}
