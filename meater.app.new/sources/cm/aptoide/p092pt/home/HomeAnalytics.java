package cm.aptoide.p092pt.home;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.ads.data.ApplicationAd;
import cm.aptoide.p092pt.editorial.EditorialAnalytics;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class HomeAnalytics {
    private static final String ACTION = "action";
    private static final String BUNDLE_TAG = "bundle_tag";
    static final String CHIP_CLICK = "chip";
    static final String CHIP_TAG = "chip_tag";
    private static final String CLICK = "click";
    private static final String CURATION_CARD = "curation_card";
    public static final String CURATION_CARD_CLICK = "Curation_Card_Click";
    public static final String CURATION_CARD_IMPRESSION = "Curation_Card_Impression";
    public static final String HOME_CHIP_INTERACT = "Home_Chip_Interact";
    public static final String HOME_INTERACT = "Home_Interact";

    /* renamed from: ID */
    private static final String f9334ID = "id";
    static final String IMPRESSION = "impression";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PROMOTION_DIALOG = "promotion-dialog";
    private static final String PROMOTION_ICON = "promotion-icon";
    static final String PULL_REFRESH = "pull refresh";
    static final String PUSH_LOAD_MORE = "push load more";
    static final String SCROLL_RIGHT = "scroll right";
    static final String TAP = "tap";
    static final String TAP_ON_APP = "tap on app";
    static final String TAP_ON_CARD = "tap on card";
    static final String TAP_ON_CARD_DISMISS = "tap on card dismiss";
    private static final String TAP_ON_CHIP = "tap on chip";
    static final String TAP_ON_MORE = "tap on more";
    private static final String TYPE = "type";
    public static final String VANILLA_PROMOTIONAL_CARDS = "vanilla_promotional_cards";
    static final String VIEW_CARD = "view card";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public HomeAnalytics(NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        this.navigationTracker = navigationTracker;
        this.analyticsManager = analyticsManager;
    }

    private AnalyticsManager.Action parseAction(HomeEvent.Type type) {
        if (type.equals(HomeEvent.Type.AD)) {
            return AnalyticsManager.Action.OPEN;
        }
        throw new IllegalStateException("TYPE " + type.name() + " NOT VALID");
    }

    private void sendAdInteractEvent(String str, int i2, String str2, int i3, String str3, HomeEvent.Type type, ApplicationAd.Network network) {
        HashMap map = new HashMap();
        map.put("action", str);
        map.put("app_rating", Integer.valueOf(i2));
        map.put("package_name", str2);
        map.put(BUNDLE_TAG, str3);
        map.put("bundle_position", Integer.valueOf(i3));
        map.put("network", network.getName());
        this.analyticsManager.logEvent(map, HOME_INTERACT, parseAction(type), this.navigationTracker.getViewName(true));
    }

    public void convertAppcAdClick(String str) {
        this.analyticsManager.logEvent(str);
    }

    public Map<String, Object> createChipTapInteractMap(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("action", str);
        map.put(BUNDLE_TAG, str2);
        map.put(CHIP_TAG, str3);
        return map;
    }

    public void sendActionItemDismissInteractEvent(String str, int i2) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD_DISMISS);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.DISMISS, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemEditorialImpressionEvent(String str, int i2, String str2) {
        HashMap map = new HashMap();
        map.put("action", VIEW_CARD);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        map.put("card_id", str2);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemImpressionEvent(String str, int i2) {
        HashMap map = new HashMap();
        map.put("action", VIEW_CARD);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemTapOnCardInteractEvent(String str, int i2) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendAdClickEvent(int i2, String str, int i3, String str2, HomeEvent.Type type, ApplicationAd.Network network) {
        sendAdInteractEvent(TAP_ON_APP, i2, str, i3, str2, type, network);
    }

    public void sendChipHomeInteractEvent(String str) {
        HashMap map = new HashMap();
        map.put("action", CHIP_CLICK);
        map.put(BUNDLE_TAG, str);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendChipInteractEvent(String str) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CHIP);
        map.put(CHIP_TAG, str);
        this.analyticsManager.logEvent(map, HOME_CHIP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendChipTapOnApp(String str, String str2, String str3) {
        Map<String, Object> mapCreateChipTapInteractMap = createChipTapInteractMap(TAP_ON_APP, str, str3);
        mapCreateChipTapInteractMap.put("package_name", str2);
        this.analyticsManager.logEvent(mapCreateChipTapInteractMap, HOME_CHIP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendChipTapOnMore(String str, String str2) {
        this.analyticsManager.logEvent(createChipTapInteractMap(TAP_ON_MORE, str, str2), HOME_CHIP_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendDeleteEvent() {
        HashMap map = new HashMap();
        map.put("action", "delete_reaction");
        map.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(map, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialImpressionEvent(String str, int i2, String str2) {
        HashMap map = new HashMap();
        map.put("action", IMPRESSION);
        map.put(BUNDLE_TAG, str);
        map.put("card_id", str2);
        map.put("bundle_position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, CURATION_CARD_IMPRESSION, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialInteractEvent(String str, int i2, String str2) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD);
        map.put(BUNDLE_TAG, str);
        map.put("card_id", str2);
        map.put("bundle_position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, CURATION_CARD_CLICK, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }

    public void sendLoadMoreInteractEvent() {
        HashMap map = new HashMap();
        map.put("action", PUSH_LOAD_MORE);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.ENDLESS_SCROLL, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalAppClickEvent(String str, String str2) {
        HashMap map = new HashMap();
        map.put("action", CLICK);
        map.put("type", str);
        map.put("package_name", str2);
        this.analyticsManager.logEvent(map, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalAppHomeInteractImpressionEvent(String str, int i2) {
        HashMap map = new HashMap();
        map.put("action", VIEW_CARD);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalAppImpressionEvent(String str, String str2) {
        HashMap map = new HashMap();
        map.put("action", IMPRESSION);
        map.put("type", str);
        map.put("package_name", str2);
        this.analyticsManager.logEvent(map, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalArticleClickEvent(String str, String str2) {
        HashMap map = new HashMap();
        map.put("action", CLICK);
        map.put("type", str);
        map.put("id", str2);
        this.analyticsManager.logEvent(map, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionalArticleImpressionEvent(String str, String str2) {
        HashMap map = new HashMap();
        map.put("action", IMPRESSION);
        map.put("type", str);
        map.put("id", str2);
        this.analyticsManager.logEvent(map, VANILLA_PROMOTIONAL_CARDS, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsDialogDismissEvent() {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD_DISMISS);
        map.put(BUNDLE_TAG, PROMOTION_DIALOG);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.DISMISS, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsDialogImpressionEvent() {
        HashMap map = new HashMap();
        map.put("action", IMPRESSION);
        map.put(BUNDLE_TAG, PROMOTION_DIALOG);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsDialogNavigateEvent() {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD);
        map.put(BUNDLE_TAG, PROMOTION_DIALOG);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsIconClickEvent() {
        HashMap map = new HashMap();
        map.put("action", TAP);
        map.put(BUNDLE_TAG, PROMOTION_ICON);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendPromotionsImpressionEvent() {
        HashMap map = new HashMap();
        map.put("action", IMPRESSION);
        map.put(BUNDLE_TAG, PROMOTION_ICON);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendPullRefreshInteractEvent() {
        HashMap map = new HashMap();
        map.put("action", PULL_REFRESH);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.PULL_REFRESH, this.navigationTracker.getViewName(true));
    }

    public void sendReactedEvent() {
        HashMap map = new HashMap();
        map.put("action", "click_to_react");
        map.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(map, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendReactionButtonClickEvent() {
        HashMap map = new HashMap();
        map.put("action", "view_reactions");
        map.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(map, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendScrollRightInteractEvent(int i2, String str, int i3) {
        HashMap map = new HashMap();
        map.put("action", SCROLL_RIGHT);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        map.put("bundle_total_items", Integer.valueOf(i3));
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.SCROLL, this.navigationTracker.getViewName(true));
    }

    public void sendTapOnAppInteractEvent(double d2, String str, int i2, int i3, String str2, int i4) {
        sendTapOnAppInteractEvent(d2, str, i2, i3, str2, i4, null);
    }

    public void sendTapOnMoreInteractEvent(int i2, String str, int i3) {
        sendTapOnMoreInteractEvent(i2, str, i3, null);
    }

    public void sendTapOnAppInteractEvent(double d2, String str, int i2, int i3, String str2, int i4, String str3) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_APP);
        map.put("app_rating", Double.valueOf(d2));
        map.put("package_name", str);
        map.put("app_position", Integer.valueOf(i2));
        map.put(BUNDLE_TAG, str2);
        map.put("bundle_position", Integer.valueOf(i3));
        map.put("bundle_total_items", Integer.valueOf(i4));
        if (str3 != null) {
            map.put(CHIP_TAG, str3);
        }
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendTapOnMoreInteractEvent(int i2, String str, int i3, String str2) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_MORE);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        map.put("bundle_total_items", Integer.valueOf(i3));
        if (str2 != null) {
            map.put(CHIP_TAG, str2);
        }
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendActionItemTapOnCardInteractEvent(String str, int i2, String str2) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD);
        map.put(BUNDLE_TAG, str);
        map.put("bundle_position", Integer.valueOf(i2));
        map.put("card_id", str2);
        this.analyticsManager.logEvent(map, HOME_INTERACT, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
    }
}
