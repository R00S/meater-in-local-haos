package cm.aptoide.p092pt.preferences.managed;

import android.content.SharedPreferences;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ManagerPreferences {
    public static boolean allowRootInstallation(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("allowRoot", false);
    }

    public static boolean getAndResetForceServerRefresh(SharedPreferences sharedPreferences) {
        boolean z = sharedPreferences.getBoolean(ManagedKeys.FORCE_SERVER_REFRESH_FLAG, false);
        if (z) {
            setForceServerRefreshFlag(false, sharedPreferences);
        }
        return z;
    }

    public static boolean getAnimationsEnabledStatus(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ManagedKeys.ANIMATIONS_ENABLED, true);
    }

    public static long getCacheLimit(SharedPreferences sharedPreferences) {
        try {
            return Long.parseLong(sharedPreferences.getString(ManagedKeys.MAX_FILE_CACHE, "300"));
        } catch (Exception unused) {
            return 200L;
        }
    }

    public static boolean getDownloadsWifiOnly(SharedPreferences sharedPreferences) {
        return !sharedPreferences.getBoolean(ManagedKeys.GENERAL_DOWNLOADS_WIFI_ONLY, true);
    }

    public static boolean getHWSpecsFilter(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ManagedKeys.HWSPECS_FILTER, true);
    }

    public static int getLastPushNotificationId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt(ManagedKeys.LAST_PUSH_NOTIFICATION_ID, 0);
    }

    public static int getLastUpdates(SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt(ManagedKeys.LAST_UPDATES_KEY, 0);
    }

    public static String getNotificationType(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("notificationtype", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static String getPreviewDialogPrefVersionCleaned(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(ManagedKeys.DONT_SHOW_CLEANED_VERSION, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static boolean getUpdatesFilterAlphaBetaKey(SharedPreferences sharedPreferences) {
        return !sharedPreferences.getBoolean(ManagedKeys.UPDATES_FILTER_ALPHA_BETA_KEY, false);
    }

    public static boolean getUpdatesSystemAppsKey(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ManagedKeys.UPDATES_SYSTEM_APPS_KEY, false);
    }

    public static boolean isAutoUpdateEnable(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("auto_update", false);
    }

    public static boolean isCheckAutoUpdateEnable(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ManagedKeys.CHECK_AUTO_UPDATE, true);
    }

    public static boolean isDebug(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("debugmode", false);
    }

    public static boolean isUpdateNotificationEnable(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ManagedKeys.PREF_SHOW_UPDATE_NOTIFICATION, true);
    }

    public static boolean needsSqliteDbMigration(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(ManagedKeys.PREF_NEEDS_SQLITE_DB_MIGRATION, true);
    }

    public static void setAllowRootInstallation(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean("allowRoot", z).apply();
    }

    public static void setAutoUpdateEnable(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean("auto_update", z).apply();
    }

    public static void setCacheLimit(int i2, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString(ManagedKeys.MAX_FILE_CACHE, String.valueOf(i2)).apply();
    }

    public static void setForceServerRefreshFlag(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(ManagedKeys.FORCE_SERVER_REFRESH_FLAG, z).apply();
    }

    public static void setHWSpecsFilter(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(ManagedKeys.HWSPECS_FILTER, z).apply();
    }

    public static void setLastPushNotificationId(int i2, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putInt(ManagedKeys.LAST_PUSH_NOTIFICATION_ID, i2).apply();
    }

    public static void setLastUpdates(int i2, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putInt(ManagedKeys.LAST_UPDATES_KEY, i2).apply();
    }

    public static void setNeedsSqliteDbMigration(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(ManagedKeys.PREF_NEEDS_SQLITE_DB_MIGRATION, z).apply();
    }

    public static void setPreviewDialogPrefVersionCleaned(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString(ManagedKeys.DONT_SHOW_CLEANED_VERSION, str).apply();
    }

    public static void setShowPreviewDialog(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(ManagedKeys.DONT_SHOW_ME_AGAIN, z).apply();
    }
}
