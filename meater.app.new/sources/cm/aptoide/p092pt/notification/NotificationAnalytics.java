package cm.aptoide.p092pt.notification;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.downloadmanager.Constants;
import cm.aptoide.p092pt.link.AptoideInstall;
import cm.aptoide.p092pt.link.AptoideInstallParser;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class NotificationAnalytics {
    private static final String AB_TESTING_GROUP = "ab_testing_group";
    private static final String CAMPAIGN_ID = "campaign_id";
    public static final String NOTIFICATION_IMPRESSION = "Aptoide_Push_Notification_Impression";
    public static final String NOTIFICATION_PRESSED = "Aptoide_Push_Notification_Click";
    public static final String NOTIFICATION_RECEIVED = "Aptoide_Push_Notification_Received";
    private static final String PACKAGE_NAME = "package_name";
    private static final String TYPE = "type";
    private String abTestingGroup;
    private final AnalyticsManager analyticsManager;
    private AptoideInstall aptoideInstall;
    private final AptoideInstallParser aptoideInstallParser;
    private int campaignId;
    private final NavigationTracker navigationTracker;

    private enum NotificationTypes {
        CAMPAIGN,
        LIKE,
        COMMENT,
        POPULAR,
        NEW_FOLLOWER,
        NEW_SHARE,
        NEW_ACTIVITY,
        OTHER,
        UPDATES
    }

    public NotificationAnalytics(AptoideInstallParser aptoideInstallParser, AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.aptoideInstallParser = aptoideInstallParser;
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> addToMapIfNotNull(Map<String, Object> map, String str, String str2) {
        if (str != null && !str.isEmpty()) {
            map.put(AB_TESTING_GROUP, str);
        }
        if (str2 != null && !str2.isEmpty()) {
            map.put("package_name", getPackageNameFromUrl(str2));
        }
        return map;
    }

    private Map<String, Object> createPushNotificationEventMap(int i2, String str, int i3, String str2) {
        HashMap map = new HashMap();
        map.put(CAMPAIGN_ID, i3 != 0 ? String.valueOf(i3) : null);
        map.put("type", matchNotificationTypeToString(i2).toString().toLowerCase());
        return addToMapIfNotNull(map, str, getPackageNameFromUrl(str2));
    }

    private Map<String, Object> createUpdateNotificationEventsMap() {
        HashMap map = new HashMap();
        map.put("type", NotificationTypes.UPDATES.toString().toLowerCase());
        return map;
    }

    private String getPackageNameFromUrl(String str) {
        for (String str2 : str.split("&")) {
            if (str2.contains(Constants.PACKAGE)) {
                return str2.split("=")[1];
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private boolean isSameApp(String str, long j2) {
        AptoideInstall aptoideInstall = this.aptoideInstall;
        return aptoideInstall != null && (aptoideInstall.getPackageName().equals(str) || this.aptoideInstall.getAppId() == j2);
    }

    private NotificationTypes matchNotificationTypeToString(int i2) {
        switch (i2) {
            case 0:
                return NotificationTypes.CAMPAIGN;
            case 1:
                return NotificationTypes.LIKE;
            case 2:
                return NotificationTypes.COMMENT;
            case 3:
                return NotificationTypes.POPULAR;
            case 4:
                return NotificationTypes.NEW_FOLLOWER;
            case 5:
                return NotificationTypes.NEW_SHARE;
            case 6:
                return NotificationTypes.NEW_ACTIVITY;
            default:
                return NotificationTypes.OTHER;
        }
    }

    public String getAbTestingGroup(String str, long j2) {
        if (!isSameApp(str, j2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = this.abTestingGroup;
        this.abTestingGroup = null;
        return str2;
    }

    public int getCampaignId(String str, long j2) {
        if (!isSameApp(str, j2)) {
            return 0;
        }
        int i2 = this.campaignId;
        this.campaignId = 0;
        return i2;
    }

    public void sendNotificationTouchEvent(String str) {
        this.analyticsManager.logEvent(str);
    }

    public void sendPushNotficationImpressionEvent(int i2, String str, int i3, String str2) {
        this.analyticsManager.logEvent(createPushNotificationEventMap(i2, str, i3, str2), NOTIFICATION_IMPRESSION, AnalyticsManager.Action.IMPRESSION, getViewName(true));
    }

    public void sendPushNotificationPressedEvent(int i2, String str, int i3, String str2) {
        this.analyticsManager.logEvent(createPushNotificationEventMap(i2, str, i3, str2), NOTIFICATION_PRESSED, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendPushNotificationReceivedEvent(int i2, String str, int i3, String str2) {
        this.analyticsManager.logEvent(createPushNotificationEventMap(i2, str, i3, str2), NOTIFICATION_RECEIVED, AnalyticsManager.Action.VIEW, getViewName(true));
    }

    public void sendUpdatesNotificationClickEvent() {
        this.analyticsManager.logEvent(createUpdateNotificationEventsMap(), NOTIFICATION_PRESSED, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendUpdatesNotificationImpressionEvent() {
        this.analyticsManager.logEvent(createUpdateNotificationEventsMap(), NOTIFICATION_IMPRESSION, AnalyticsManager.Action.IMPRESSION, getViewName(true));
    }

    public void sendUpdatesNotificationReceivedEvent() {
        this.analyticsManager.logEvent(createUpdateNotificationEventsMap(), NOTIFICATION_RECEIVED, AnalyticsManager.Action.AUTO, getViewName(true));
    }

    public void sendNotificationTouchEvent(String str, int i2, String str2, int i3, String str3) {
        sendNotificationTouchEvent(str);
        if (i2 == 0) {
            AptoideInstall aptoideInstall = this.aptoideInstallParser.parse(str2);
            if (aptoideInstall.getAppId() > 0 || !(aptoideInstall.getPackageName() == null || aptoideInstall.getPackageName().isEmpty())) {
                this.aptoideInstall = aptoideInstall;
                this.campaignId = i3;
                this.abTestingGroup = str3;
            }
        }
    }
}
