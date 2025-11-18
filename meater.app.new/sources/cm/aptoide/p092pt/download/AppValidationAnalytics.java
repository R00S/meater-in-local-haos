package cm.aptoide.p092pt.download;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import java.util.HashMap;

/* loaded from: classes.dex */
public class AppValidationAnalytics {
    public static final String INVALID_DOWNLOAD_PATH_EVENT = "Invalid_Download_Path";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;
    private final String PACKAGE_NAME = "Package_Name";
    private final String FILE_TYPE = "File_Type";
    private final String FILE_TYPE_APK = "apk";
    private final String FILE_TYPE_OBB = "obb";
    private final String FILE_TYPE_LEVEL = "File_Type_Level";
    private final String FILE_TYPE_LEVEL_DOWNLOAD_MAIN = "main_download";
    private final String FILE_TYPE_LEVEL_ALTERNATIVE = "alternative_download";
    private final String FILE_TYPE_LEVEL_OBB_MAIN = "main_obb";
    private final String FILE_TYPE_LEVEL_OBB_PATCH = "patch_obb";

    public AppValidationAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private HashMap<String, Object> createInvalidPathMap(String str, String str2, String str3) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Package_Name", str);
        map.put("File_Type", str2);
        map.put("File_Type_Level", str3);
        return map;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private void sendInvalidDownloadPathEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createInvalidPathMap(str, str2, str3), INVALID_DOWNLOAD_PATH_EVENT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendInvalidDownloadAlternativePath(String str) {
        sendInvalidDownloadPathEvent(str, "apk", "alternative_download");
    }

    public void sendInvalidDownloadMainPath(String str) {
        sendInvalidDownloadPathEvent(str, "apk", "main_download");
    }

    public void sendInvalidDownloadObbMainPath(String str) {
        sendInvalidDownloadPathEvent(str, "obb", "main_obb");
    }

    public void sendInvalidDownloadObbPatchPath(String str) {
        sendInvalidDownloadPathEvent(str, "obb", "patch_obb");
    }
}
