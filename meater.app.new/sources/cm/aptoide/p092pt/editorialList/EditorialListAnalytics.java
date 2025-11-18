package cm.aptoide.p092pt.editorialList;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.editorial.EditorialAnalytics;
import java.util.HashMap;

/* loaded from: classes.dex */
public class EditorialListAnalytics {
    private static final String ACTION = "action";
    private static final String CARD_ID = "card_id";
    private static final String CURATION_CARD = "curation_card";
    public static final String EDITORIAL_BN_CURATION_CARD_CLICK = "Editorial_BN_Curation_Card_Click";
    public static final String EDITORIAL_BN_CURATION_CARD_IMPRESSION = "Editorial_BN_Curation_Card_Impression";
    static final String IMPRESSION = "impression";
    private static final String POSITION = "position";
    static final String TAP_ON_CARD = "tap on card";
    private static final String WHERE = "where";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public EditorialListAnalytics(NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        this.navigationTracker = navigationTracker;
        this.analyticsManager = analyticsManager;
    }

    public void sendDeleteEvent() {
        HashMap map = new HashMap();
        map.put("action", "delete_reaction");
        map.put(WHERE, CURATION_CARD);
        this.analyticsManager.logEvent(map, EditorialAnalytics.REACTION_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialImpressionEvent(String str, int i2) {
        HashMap map = new HashMap();
        map.put("action", IMPRESSION);
        map.put(CARD_ID, str);
        map.put(POSITION, Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, EDITORIAL_BN_CURATION_CARD_IMPRESSION, AnalyticsManager.Action.IMPRESSION, this.navigationTracker.getViewName(true));
    }

    public void sendEditorialInteractEvent(String str, int i2) {
        HashMap map = new HashMap();
        map.put("action", TAP_ON_CARD);
        map.put(CARD_ID, str);
        map.put(POSITION, Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, EDITORIAL_BN_CURATION_CARD_CLICK, AnalyticsManager.Action.OPEN, this.navigationTracker.getViewName(true));
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
}
