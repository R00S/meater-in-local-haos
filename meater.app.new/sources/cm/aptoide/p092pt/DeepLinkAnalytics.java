package cm.aptoide.p092pt;

import android.net.Uri;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DeepLinkAnalytics {
    public static final String APPCOINS_WALLET_DEEPLINK = "AppCoins_Wallet_Deeplink";
    public static final String APP_LAUNCH = "Application Launch";
    private static final String DOWNLOADING_UPDATES = "Downloading Updates";
    public static final String FACEBOOK_APP_LAUNCH = "Aptoide Launch";
    private static final String HOSTNAME = "Hostname";
    private static final String LAUNCHER = "Launcher";
    private static final String NEW_REPO = "New Repository";
    private static final String NEW_UPDATES_NOTIFICATION = "New Updates Available";
    private static final String SOURCE = "Source";
    private static final String SOURCE_GROUP_ATTRIBUTE = "source_group";
    private static final String SOURCE_GROUP_OPTION_APP_VIEW = "aptoide app view";
    private static final String SOURCE_GROUP_OPTION_BUNDLES = "aptoide bundle";
    private static final String SOURCE_GROUP_OPTION_HOME = "aptoide homepage";
    private static final String SOURCE_GROUP_OPTION_STORE = "aptoide store";
    private static final String SOURCE_GROUP_OPTION_THANK_YOU = "aptoide thank you page";
    private static final String URI = "Uri";
    private static final String WEBSITE = "Website";
    private AnalyticsManager analyticsManager;
    private HashMap<String, Object> map = new HashMap<>();
    private NavigationTracker navigationTracker;

    public DeepLinkAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> createMap(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private void websiteSourceGroup(String str) {
        HashMap<String, Object> map = this.map;
        if (map == null || map.isEmpty()) {
            return;
        }
        this.map.put(SOURCE_GROUP_ATTRIBUTE, str);
    }

    public void downloadingUpdates() {
        this.analyticsManager.logEvent(createMap("Source", DOWNLOADING_UPDATES), APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void launcher() {
        this.analyticsManager.logEvent(createMap("Source", LAUNCHER), FACEBOOK_APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void newRepo() {
        this.analyticsManager.logEvent(createMap("Source", NEW_REPO), APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void newUpdatesNotification() {
        this.analyticsManager.logEvent(createMap("Source", NEW_UPDATES_NOTIFICATION), APP_LAUNCH, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void sendWalletDeepLinkEvent(String str) {
        this.analyticsManager.logEvent(createMap("Source", str), APPCOINS_WALLET_DEEPLINK, AnalyticsManager.Action.CLICK, "Application");
    }

    public void sendWebsite() {
        HashMap<String, Object> map = this.map;
        if (map != null && !map.isEmpty()) {
            AnalyticsManager analyticsManager = this.analyticsManager;
            HashMap<String, Object> map2 = this.map;
            AnalyticsManager.Action action = AnalyticsManager.Action.AUTO;
            analyticsManager.logEvent(map2, FACEBOOK_APP_LAUNCH, action, getViewName(true));
            this.analyticsManager.logEvent(this.map, APP_LAUNCH, action, getViewName(true));
        }
        this.map = null;
    }

    public void website(String str) {
        HashMap<String, Object> map = new HashMap<>();
        this.map = map;
        map.put("Source", WEBSITE);
        if (str != null) {
            this.map.put(URI, str.substring(0, str.indexOf(":")));
            this.map.put(HOSTNAME, Uri.parse(str).getHost());
        }
    }

    public void websiteFromAppViewWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_APP_VIEW);
    }

    public void websiteFromBundlesWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_BUNDLES);
    }

    public void websiteFromHomeWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_HOME);
    }

    public void websiteFromStoreWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_STORE);
    }

    public void websiteFromThankYouWebPage() {
        websiteSourceGroup(SOURCE_GROUP_OPTION_THANK_YOU);
    }
}
