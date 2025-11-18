package cm.aptoide.p092pt.store;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class StoreAnalytics {
    private static final String ACTION = "action";
    private static final String FOLLOW_STORE_APPS = "follow_store_apps";
    private static final String FOLLOW_STORE_FOLLOWERS = "follow_store_followers";
    private static final String SOURCE = "source";
    public static final String STORES_INTERACT = "Store_Interact";
    public static final String STORES_OPEN = "Store_Open";
    public static final String STORES_TAB_INTERACT = "Stores_Tab_Interact";
    private static final String STORE_NAME = "store_name";
    private static final String TAB = "tab_name";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public StoreAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> createStoreInteractDataMap(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("action", str);
        map.put(TAB, str2);
        map.put("store_name", str3);
        return map;
    }

    private Map<String, Object> createStoreInteractMap(String str) {
        HashMap map = new HashMap();
        map.put("action", str);
        return map;
    }

    private Map<String, Object> createStoreOpenDataMap(String str, String str2) {
        HashMap map = new HashMap();
        map.put(SOURCE, str);
        map.put("store_name", str2);
        return map;
    }

    private Map<String, Object> createStoreTabInteractDataMap(String str, int i2, int i3) {
        HashMap map = new HashMap();
        map.put("action", str);
        map.put(FOLLOW_STORE_APPS, AptoideUtils.StringU.toString(Integer.valueOf(i2)));
        map.put(FOLLOW_STORE_FOLLOWERS, AptoideUtils.StringU.toString(Integer.valueOf(i3)));
        return map;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    public void sendFollowersStoresInteractEvent() {
        HashMap map = new HashMap();
        map.put("action", "Open Followers");
        this.analyticsManager.logEvent(map, STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendFollowingStoresInteractEvent() {
        HashMap map = new HashMap();
        map.put("action", "Open Following");
        this.analyticsManager.logEvent(map, STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreInteractEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createStoreInteractDataMap(str, str2, str3), STORES_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendStoreOpenEvent(String str, String str2, boolean z) {
        this.analyticsManager.logEvent(createStoreOpenDataMap(str, str2), STORES_OPEN, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendStoreTabInteractEvent(String str, boolean z) {
        this.analyticsManager.logEvent(createStoreInteractMap(str), STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendStoreTabInteractEvent(String str, int i2, int i3) {
        this.analyticsManager.logEvent(createStoreTabInteractDataMap(str, i2, i3), STORES_TAB_INTERACT, AnalyticsManager.Action.CLICK, getViewName(true));
    }
}
