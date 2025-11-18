package cm.aptoide.p092pt.updates;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.app.AppViewAnalytics;
import cm.aptoide.p092pt.install.InstallAnalytics;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class UpdatesAnalytics {
    private static final String APPLICATION_NAME = "Application Name";
    private static final String CONTEXT = "context";
    public static final String OPEN_APP_VIEW = "Open App View";
    private static final String TYPE = "type";
    public static final String UPDATE_EVENT = "Updates";
    private final AnalyticsManager analyticsManager;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;

    public UpdatesAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
        this.installAnalytics = installAnalytics;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public void sendUpdateAllClickEvent() {
        String viewName = this.navigationTracker.getViewName(true);
        HashMap map = new HashMap();
        map.put("type", "update all");
        map.put(CONTEXT, viewName);
        this.analyticsManager.logEvent(map, AppViewAnalytics.CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void sendUpdateClickedEvent(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, boolean z4, long j2) {
        String viewName = this.navigationTracker.getViewName(true);
        HashMap map = new HashMap();
        map.put("type", "UPDATE");
        map.put(APPLICATION_NAME, str);
        map.put(CONTEXT, viewName);
        this.installAnalytics.clickOnInstallEvent(str, str5, z, z2, z3, str2, str3, str4, false, z4, str4.equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, Long.valueOf(j2));
        this.analyticsManager.logEvent(map, AppViewAnalytics.CLICK_INSTALL, AnalyticsManager.Action.CLICK, viewName);
    }

    public void updates(String str) {
        this.analyticsManager.logEvent(createMapData("action", str), UPDATE_EVENT, AnalyticsManager.Action.AUTO, this.navigationTracker.getViewName(true));
    }
}
