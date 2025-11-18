package cm.aptoide.p092pt.download;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.analytics.AppSizeAnalyticsStringMapper;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.view.DeepLinkManager;
import io.sentry.C9247a4;
import io.sentry.C9506l4;
import io.sentry.protocol.C9551j;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class DownloadAnalytics implements cm.aptoide.p092pt.downloadmanager.DownloadAnalytics {
    private static final String AAB_AVERAGE_DOWNLOAD_SPEED = "aab_avg_speed";
    private static final String AB_TEST_GROUP = "ab_test_group";
    private static final String ACTION = "action";
    private static final String ADS_BLOCK_BY_OFFER = "ads_block_by_offer";
    private static final String APK_AVERAGE_DOWNLOAD_SPEED = "apk_avg_speed";
    private static final String APP = "app";
    private static final String APPC = "appc";
    private static final String APP_AAB = "app_aab";
    private static final String APP_AAB_INSTALL_TIME = "app_aab_install_time";
    private static final String APP_APPC = "app_appc";
    private static final String APP_BUNDLE = "app_bundle";
    private static final String APP_IN_CATAPPULT = "app_in_catappult";
    private static final String APP_IS_GAME = "app_is_game";
    private static final String APP_MIGRATION = "app_migration";
    private static final String APP_OBB = "app_obb";
    private static final String APP_SIZE_MB = "app_size_mb";
    private static final String APP_VERSION_CODE = "app_version_code";
    private static final String CAMPAIGN_ID = "campaign_id";
    private static final String CONTEXT = "context";
    public static final String DOWNLOAD_COMPLETE_EVENT = "Download Complete";
    public static final String DOWNLOAD_INTERACT = "Download_Interact";
    public static final String EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME = "Editors_Choice_Download_Complete";
    private static final String ERROR = "error";
    private static final String ERROR_HTTP_CODE = "error_http_code";
    private static final String ERROR_MESSAGE = "error_message";
    private static final String ERROR_TYPE = "error_type";
    private static final String ERROR_URL = "error_url";
    private static final String FAIL = "FAIL";
    public static final String GAMES_CATEGORY = "games";
    private static final String IS_APKFY = "apkfy_app_install";
    private static final String MAIN = "MAIN";
    private static final String MESSAGE = "message";
    private static final String MIGRATOR = "migrator";
    private static final String MIRROR = "mirror";
    private static final String MIUI_AAB_FIX = "miui_aab_fix";
    private static final String NETWORK = "network";
    public static final String NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME = "Aptoide_Push_Notification_Download_Complete";
    private static final String OBB = "obb";
    private static final String OBB_AVERAGE_DOWNLOAD_SPEED = "obb_avg_speed";
    private static final String ORIGIN = "origin";
    private static final String PACKAGE = "package";
    private static final String PACKAGENAME = "Package Name";
    private static final String PACKAGE_NAME = "package_name";
    private static final String PATCH = "PATCH";
    private static final String POSITION = "position";
    private static final String PREVIOUS_CONTEXT = "previous_context";
    private static final String PREVIOUS_TAG = "previous_tag";
    public static final String RAKAM_DOWNLOAD_EVENT = "download";
    private static final String RESULT = "result";
    private static final String STATUS = "status";
    private static final String STORE = "store";
    private static final String SUCCESS = "SUCC";
    private static final String TAG = "tag";
    private static final String TELECO = "teleco";
    private static final String TRUSTED_BADGE = "Trusted Badge";
    private static final String TYPE = "type";
    private static final String UPDATE_TO_APPC = "UPDATE TO APPC";
    private static final String URL = "url";
    private final AnalyticsManager analyticsManager;
    private final AppSizeAnalyticsStringMapper appSizeAnalyticsStringMapper;
    private final Map<String, DownloadEvent> cache = new HashMap();
    private final ConnectivityManager connectivityManager;
    private final DownloadSpeedIntervalMapper downloadSpeedIntervalMapper;
    private final NavigationTracker navigationTracker;
    private final TelephonyManager telephonyManager;

    public enum AppContext {
        TIMELINE,
        APPVIEW,
        UPDATE_TAB,
        APPS_FRAGMENT,
        APPS_MIGRATOR_SEE_MORE,
        AUTO_UPDATE,
        DOWNLOADS,
        EDITORIAL,
        PROMOTIONS,
        WALLET_INSTALL_ACTIVITY,
        SEARCH
    }

    public static class DownloadEvent {
        private final AnalyticsManager.Action action;
        private final String context;
        private final Map<String, Object> data;
        private final String eventName;
        private boolean hadProgress = false;

        public DownloadEvent(String str, HashMap<String, Object> map, String str2, AnalyticsManager.Action action) {
            this.data = map;
            this.eventName = str;
            this.action = action;
            this.context = str2;
        }

        public AnalyticsManager.Action getAction() {
            return this.action;
        }

        public String getContext() {
            return this.context;
        }

        public Map<String, Object> getData() {
            return this.data;
        }

        public String getEventName() {
            return this.eventName;
        }

        public boolean isHadProgress() {
            return this.hadProgress;
        }

        public void setHadProgress(boolean z) {
            this.hadProgress = z;
        }
    }

    public DownloadAnalytics(ConnectivityManager connectivityManager, TelephonyManager telephonyManager, NavigationTracker navigationTracker, AnalyticsManager analyticsManager, AppSizeAnalyticsStringMapper appSizeAnalyticsStringMapper, DownloadSpeedIntervalMapper downloadSpeedIntervalMapper) {
        this.appSizeAnalyticsStringMapper = appSizeAnalyticsStringMapper;
        this.downloadSpeedIntervalMapper = downloadSpeedIntervalMapper;
        this.connectivityManager = connectivityManager;
        this.telephonyManager = telephonyManager;
        this.navigationTracker = navigationTracker;
        this.analyticsManager = analyticsManager;
    }

    private HashMap<String, Object> createDownloadCompleteEventMap(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, boolean z, boolean z2, boolean z3, String str3, boolean z4) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(PACKAGENAME, str);
        map.put(CONTEXT, str3);
        map.put(TRUSTED_BADGE, str2);
        map.put(APPC, Boolean.valueOf(z2));
        map.put(APP_BUNDLE, Boolean.valueOf(z3));
        map.put(MIGRATOR, Boolean.valueOf(z));
        map.put(IS_APKFY, Boolean.valueOf(z4));
        if (screenTagHistory != null) {
            map.put("tag", screenTagHistory2.getTag());
            if (screenTagHistory.getFragment() != null) {
                map.put(PREVIOUS_CONTEXT, screenTagHistory.getFragment());
            }
            if (screenTagHistory.getStore() != null) {
                map.put("store", screenTagHistory.getStore());
            }
        }
        return map;
    }

    private HashMap<String, Object> createRakamDownloadEvent(String str, int i2, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, String str5, String str6, String str7, boolean z5, String str8, boolean z6, String str9, long j2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(CONTEXT, str6);
        map.put("action", str2.toLowerCase());
        map.put("package_name", str);
        map.put(APP_VERSION_CODE, Integer.valueOf(i2));
        map.put(PREVIOUS_CONTEXT, str5);
        map.put(APP_MIGRATION, Boolean.valueOf(z));
        map.put(APP_APPC, Boolean.valueOf(z3));
        map.put(APP_AAB, Boolean.valueOf(z2));
        map.put(APP_OBB, Boolean.valueOf(z5));
        map.put(IS_APKFY, Boolean.valueOf(z4));
        map.put(APP_AAB_INSTALL_TIME, str8);
        map.put(APP_IN_CATAPPULT, Boolean.valueOf(z6));
        if (!str9.isEmpty()) {
            map.put(APP_IS_GAME, Boolean.valueOf(str9.equals("games")));
        }
        if (str3 != null) {
            map.put(TRUSTED_BADGE, str3.toLowerCase());
        }
        if (!str7.isEmpty()) {
            map.put("tag", str7);
        }
        map.put("store", str4);
        map.put(APP_SIZE_MB, Long.valueOf(this.appSizeAnalyticsStringMapper.mapAppSizeToMBBucketValue(j2)));
        return map;
    }

    private void editorsChoiceDownloadCompletedEvent(String str, String str2, String str3, String str4, InstallType installType, String str5, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3) {
        if (str4 == null || str4.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        map.put(PACKAGENAME, str3);
        map.put(CONTEXT, str5);
        map.put(PREVIOUS_CONTEXT, str);
        map.put(POSITION, str4);
        map.put("type", installType.name());
        map.put(APPC, Boolean.valueOf(z));
        map.put(APP_BUNDLE, Boolean.valueOf(z2));
        map.put(IS_APKFY, Boolean.valueOf(z3));
        DownloadEvent downloadEvent = new DownloadEvent(EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, map, str5, action);
        this.cache.put(str2 + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME, downloadEvent);
    }

    private String getDownloadSpeedString(long j2) {
        if (j2 < 0) {
            return "n-a";
        }
        Pair<String, String> downloadSpeedInterval = this.downloadSpeedIntervalMapper.getDownloadSpeedInterval(j2);
        return downloadSpeedInterval.m37648c() + " " + downloadSpeedInterval.m37649d();
    }

    private void handleRakamOnCancel(String str, long j2, long j3, long j4) {
        DownloadEvent downloadEvent = this.cache.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "cancel");
            data.put(APK_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j2));
            data.put(OBB_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j3));
            data.put(AAB_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j4));
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str + RAKAM_DOWNLOAD_EVENT);
        }
    }

    private void handleRakamOnError(String str, Throwable th, String str2, String str3, long j2, long j3, long j4) {
        DownloadEvent downloadEvent = this.cache.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "fail");
            data.put(ERROR_TYPE, th.getClass().getSimpleName());
            data.put(ERROR_MESSAGE, th.getMessage());
            data.put(ERROR_URL, str2);
            data.put(ERROR_HTTP_CODE, str3);
            data.put(APK_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j2));
            data.put(OBB_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j3));
            data.put(AAB_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j4));
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
            this.cache.remove(str + RAKAM_DOWNLOAD_EVENT);
            sendSentryError(th, str2, str3);
        }
    }

    private void pushNotificationDownloadEvent(String str, String str2, String str3, InstallType installType, AnalyticsManager.Action action, String str4, boolean z) {
        if (str.equals(DeepLinkManager.DEEPLINK_KEY)) {
            HashMap map = new HashMap();
            map.put(PACKAGENAME, str3);
            map.put("type", installType.name());
            map.put(IS_APKFY, Boolean.valueOf(z));
            DownloadEvent downloadEvent = new DownloadEvent(NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, map, str4, action);
            this.cache.put(str2 + NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME, downloadEvent);
        }
    }

    private void rakamDownloadCompleteEvent(String str, String str2, int i2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, String str6, boolean z6, String str7, long j2) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, createRakamDownloadEvent(str2, i2, str3, z, z2, z3, str4, str5, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : HttpUrl.FRAGMENT_ENCODE_SET, z5, str6, z6, str7, j2), currentViewName, AnalyticsManager.Action.CLICK);
        this.cache.put(str + RAKAM_DOWNLOAD_EVENT, downloadEvent);
    }

    private void sendDownloadEvent(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent == null || !downloadEvent.isHadProgress()) {
            return;
        }
        this.analyticsManager.logEvent(downloadEvent.getData(), downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        this.cache.remove(str);
    }

    private void sendRakamDownloadEvent(String str, long j2, long j3, long j4) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent == null || !downloadEvent.isHadProgress()) {
            return;
        }
        Map<String, Object> data = downloadEvent.getData();
        data.put(STATUS, RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        data.put(APK_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j2));
        data.put(OBB_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j3));
        data.put(AAB_AVERAGE_DOWNLOAD_SPEED, getDownloadSpeedString(j4));
        this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        this.cache.remove(str);
    }

    private void sendSentryError(Throwable th, String str, String str2) {
        C9506l4 c9506l4 = new C9506l4();
        C9551j c9551j = new C9551j();
        c9551j.m31379e("download_fail");
        c9506l4.m30994A0(c9551j);
        c9506l4.m30594V(ERROR_TYPE, th.getClass().getSimpleName());
        c9506l4.m30594V(ERROR_MESSAGE, th.getMessage());
        c9506l4.m30594V(ERROR_URL, str);
        c9506l4.m30594V(ERROR_HTTP_CODE, str2);
        C9247a4.m30033c(c9506l4);
    }

    private void setUpInstallEvent(String str, int i2, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3, String str5, boolean z4, boolean z5, String str6, boolean z6, String str7, long j2) {
        String viewName = this.navigationTracker.getViewName(true);
        rakamDownloadCompleteEvent(str, str2, i2, installType.toString(), z, z3, z2, str3, str5, z4, z5, str6, z6, str7, j2);
        editorsChoiceDownloadCompletedEvent(viewName, str, str2, str4, installType, viewName, action, z2, z3, z4);
        pushNotificationDownloadEvent(viewName, str, str2, installType, action, viewName, z4);
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, action, viewName, z, Boolean.valueOf(z2), z3, z4);
    }

    private void updateDownloadEventWithHasProgress(String str) {
        DownloadEvent downloadEvent = this.cache.get(str);
        if (downloadEvent != null) {
            downloadEvent.setHadProgress(true);
            return;
        }
        Logger.getInstance().m8273d("DownloadAnalytics", "Tried setting progress on an event that was not setup " + str);
    }

    public void downloadCompleteEvent(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, AnalyticsManager.Action action, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        HashMap<String, Object> mapCreateDownloadCompleteEventMap = createDownloadCompleteEventMap(screenTagHistory, screenTagHistory2, str2, str3, z2, z3, z4, str4, z5);
        mapCreateDownloadCompleteEventMap.put(ADS_BLOCK_BY_OFFER, Boolean.valueOf(z));
        DownloadEvent downloadEvent = new DownloadEvent(DOWNLOAD_COMPLETE_EVENT, mapCreateDownloadCompleteEventMap, str4, action);
        this.cache.put(str + DOWNLOAD_COMPLETE_EVENT, downloadEvent);
    }

    public void downloadInteractEvent(String str, String str2) {
        HashMap map = new HashMap();
        map.put("package_name", str);
        map.put("action", str2);
        this.analyticsManager.logEvent(map, DOWNLOAD_INTERACT, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public Origin getOrigin(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? Origin.INSTALL : Origin.DOWNGRADE : Origin.UPDATE : Origin.INSTALL;
    }

    public void installClicked(String str, int i2, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, boolean z5, String str7, long j2) {
        setUpInstallEvent(str, i2, str2, str3, str4, installType, action, false, z, z2, str5, z3, z4, str6, z5, str7, j2);
    }

    public void migrationClicked(String str, int i2, String str2, String str3, String str4, InstallType installType, AnalyticsManager.Action action, boolean z, boolean z2, String str5, boolean z3, boolean z4, String str6, boolean z5, String str7, long j2) {
        setUpInstallEvent(str, i2, str2, str3, str4, installType, action, true, z, z2, str5, z3, z4, str6, z5, str7, j2);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadAnalytics
    public void onDownloadCancel(String str, long j2, long j3, long j4) {
        handleRakamOnCancel(str, j2, j3, j4);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadAnalytics
    public void onDownloadComplete(String str, String str2, int i2, long j2, long j3, long j4) {
        sendDownloadEvent(str + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME);
        sendDownloadEvent(str + DOWNLOAD_COMPLETE_EVENT);
        sendDownloadEvent(str + NOTIFICATION_DOWNLOAD_COMPLETE_EVENT_NAME);
        sendRakamDownloadEvent(str + RAKAM_DOWNLOAD_EVENT, j2, j3, j4);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadAnalytics
    public void onError(String str, int i2, String str2, Throwable th, String str3, String str4, long j2, long j3, long j4) {
        handleRakamOnError(str2, th, str3, str4, j2, j3, j4);
    }

    public void sendAppNotValidError(String str, int i2, InstallType installType, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, Throwable th, boolean z5, String str4, boolean z6, String str5, long j2) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        HashMap<String, Object> mapCreateRakamDownloadEvent = createRakamDownloadEvent(str, i2, installType.toString(), z, z2, z3, str2, str3, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : HttpUrl.FRAGMENT_ENCODE_SET, z5, str4, z6, str5, j2);
        mapCreateRakamDownloadEvent.put(STATUS, "fail");
        mapCreateRakamDownloadEvent.put(ERROR_TYPE, th.getClass().getSimpleName());
        mapCreateRakamDownloadEvent.put(ERROR_MESSAGE, th.getMessage());
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, mapCreateRakamDownloadEvent, currentViewName, AnalyticsManager.Action.CLICK);
        this.analyticsManager.logEvent(mapCreateRakamDownloadEvent, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
    }

    public void sendDownloadAbortEvent(String str, int i2, InstallType installType, boolean z, boolean z2, boolean z3, String str2, String str3, boolean z4, boolean z5, boolean z6, String str4, long j2) {
        String previousViewName = this.navigationTracker.getPreviousViewName();
        String currentViewName = this.navigationTracker.getCurrentViewName();
        HashMap<String, Object> mapCreateRakamDownloadEvent = createRakamDownloadEvent(str, i2, installType.toString(), z, z2, z3, str2, str3, z4, previousViewName, currentViewName, this.navigationTracker.getCurrentScreen() != null ? this.navigationTracker.getCurrentScreen().getTag() : HttpUrl.FRAGMENT_ENCODE_SET, z5, HttpUrl.FRAGMENT_ENCODE_SET, z6, str4, j2);
        mapCreateRakamDownloadEvent.put(STATUS, "abort");
        DownloadEvent downloadEvent = new DownloadEvent(RAKAM_DOWNLOAD_EVENT, mapCreateRakamDownloadEvent, currentViewName, AnalyticsManager.Action.CLICK);
        this.analyticsManager.logEvent(mapCreateRakamDownloadEvent, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
    }

    public void sendNotEnoughSpaceError(String str) {
        DownloadEvent downloadEvent = this.cache.get(str + RAKAM_DOWNLOAD_EVENT);
        if (downloadEvent != null) {
            Map<String, Object> data = downloadEvent.getData();
            data.put(STATUS, "incomplete");
            data.put(ERROR_TYPE, "FileDownloadOutOfSpace");
            this.analyticsManager.logEvent(data, downloadEvent.getEventName(), downloadEvent.getAction(), downloadEvent.getContext());
        }
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadAnalytics
    public void startProgress(RoomDownload roomDownload) {
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + DOWNLOAD_COMPLETE_EVENT);
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + EDITORS_CHOICE_DOWNLOAD_COMPLETE_EVENT_NAME);
        updateDownloadEventWithHasProgress(roomDownload.getMd5() + RAKAM_DOWNLOAD_EVENT);
    }

    public void installClicked(String str, String str2, int i2, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, boolean z4, String str7, boolean z5, String str8, long j2) {
        setUpInstallEvent(str, str2, i2, action, z, z2, z3, str3, str5, str6, z4, str7, z5, str8, j2);
    }

    public void migrationClicked(String str, String str2, int i2, AnalyticsManager.Action action, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, long j2) {
        setUpInstallEvent(str, str2, i2, action, true, true, z, str3, str5, "update_to_appc", z2, str6, z3, str7, j2);
    }

    public void downloadCompleteEvent(ScreenTagHistory screenTagHistory, ScreenTagHistory screenTagHistory2, String str, String str2, String str3, AnalyticsManager.Action action, String str4, boolean z, Boolean bool, boolean z2, boolean z3) {
        DownloadEvent downloadEvent = new DownloadEvent(DOWNLOAD_COMPLETE_EVENT, createDownloadCompleteEventMap(screenTagHistory, screenTagHistory2, str2, str3, z, bool.booleanValue(), z2, str4, z3), str4, action);
        this.cache.put(str + DOWNLOAD_COMPLETE_EVENT, downloadEvent);
    }

    private void setUpInstallEvent(String str, String str2, int i2, AnalyticsManager.Action action, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, boolean z4, String str6, boolean z5, String str7, long j2) {
        String viewName = this.navigationTracker.getViewName(true);
        rakamDownloadCompleteEvent(str, str2, i2, str5, z, z3, z2, str3, str4, false, z4, str6, z5, str7, j2);
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, null, action, viewName, z, Boolean.valueOf(z2), z3, false);
    }

    public void downloadCompleteEvent(String str, String str2, String str3, AnalyticsManager.Action action, boolean z) {
        downloadCompleteEvent(this.navigationTracker.getPreviousScreen(), this.navigationTracker.getCurrentScreen(), str, str2, str3, action, this.navigationTracker.getViewName(true), false, Boolean.FALSE, z, false);
    }
}
