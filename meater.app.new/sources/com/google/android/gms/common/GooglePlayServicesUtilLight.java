package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GooglePlayServicesUtilLight {

    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;

    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;

    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @VisibleForTesting
    static boolean zza = false;
    private static boolean zzb = false;

    @VisibleForTesting
    @KeepForSdk
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @KeepForSdk
    GooglePlayServicesUtilLight() {
    }

    @KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException unused) {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i2) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iMo13813j = GoogleApiAvailabilityLight.m13823h().mo13813j(context, i2);
        if (iMo13813j != 0) {
            Intent intentMo13809d = GoogleApiAvailabilityLight.m13823h().mo13809d(context, iMo13813j, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iMo13813j);
            if (intentMo13809d != null) {
                throw new GooglePlayServicesRepairableException(iMo13813j, "Google Play Services not available", intentMo13809d);
            }
            throw new GooglePlayServicesNotAvailableException(iMo13813j);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getClientVersion(Context context) {
        Preconditions.m14375n(true);
        return ClientLibraryUtils.m14605a(context, context.getPackageName());
    }

    @KeepForSdk
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i2, Context context, int i3) {
        return GoogleApiAvailabilityLight.m13823h().mo13810e(context, i2, i3);
    }

    @VisibleForTesting
    @KeepForSdk
    @Deprecated
    public static String getErrorString(int i2) {
        return ConnectionResult.m13792p0(i2);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i2) {
        return GoogleApiAvailabilityLight.m13823h().mo13809d(null, i2, null);
    }

    @KeepForSdk
    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zza) {
                PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e("com.google.android.gms", 64);
                GoogleSignatureVerifier.m13830a(context);
                if (packageInfoM14671e == null || GoogleSignatureVerifier.m13832e(packageInfoM14671e, false) || !GoogleSignatureVerifier.m13832e(packageInfoM14671e, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            zza = true;
        }
        return zzb || !DeviceProperties.m14623c();
    }

    @HideFirstParty
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i2) {
        return UidVerifier.m14656a(context, i2);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i2) {
        if (i2 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @KeepForSdk
    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        if (!PlatformVersion.m14641e()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        Preconditions.m14372k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @VisibleForTesting
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static boolean isSidewinderDevice(Context context) {
        return DeviceProperties.m14622b(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @KeepForSdk
    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i2, String str) {
        return UidVerifier.m14657b(context, i2, str);
    }

    @TargetApi(21)
    static boolean zza(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (PlatformVersion.m14644h()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }
}
