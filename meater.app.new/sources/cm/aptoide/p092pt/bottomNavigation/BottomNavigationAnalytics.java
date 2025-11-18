package cm.aptoide.p092pt.bottomNavigation;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomNavigationAnalytics {
    public static final String BOTTOM_NAVIGATION_INTERACT = "Bottom_Navigation_Interact";
    private static final String VIEW = "view";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public BottomNavigationAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> createBottomNavData(String str) {
        HashMap map = new HashMap();
        map.put(VIEW, str);
        return map;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void sendNavigateToAppsClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData(DeepLinkIntentReceiver.DeepLinksTargets.APPS), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToCurationClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("curation"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToHomeClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("home"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToSearchClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("search"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendNavigateToStoresClickEvent() {
        this.analyticsManager.logEvent(createBottomNavData("stores"), BOTTOM_NAVIGATION_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
