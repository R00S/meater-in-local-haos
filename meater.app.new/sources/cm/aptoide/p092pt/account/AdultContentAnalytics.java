package cm.aptoide.p092pt.account;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import java.util.HashMap;

/* loaded from: classes.dex */
public class AdultContentAnalytics {
    public static final String ADULT_CONTENT = "Adult Content";
    public static final String LOCK = "true";
    public static final String UNLOCK = "false";
    private AnalyticsManager analyticsManager;
    private NavigationTracker navigationTracker;

    public AdultContentAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void lock() {
        HashMap map = new HashMap();
        map.put("Action", "true");
        this.analyticsManager.logEvent(map, ADULT_CONTENT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void unlock() {
        HashMap map = new HashMap();
        map.put("Action", UNLOCK);
        this.analyticsManager.logEvent(map, ADULT_CONTENT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
