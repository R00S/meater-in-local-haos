package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i2, Activity activity, int i3) {
        return getErrorDialog(i2, activity, i3, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i2, Context context, int i3) {
        return GooglePlayServicesUtilLight.getErrorPendingIntent(i2, context, i3);
    }

    @VisibleForTesting
    @Deprecated
    public static String getErrorString(int i2) {
        return GooglePlayServicesUtilLight.getErrorString(i2);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i2) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i2);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i2, activity, null, i3, onCancelListener);
    }

    @Deprecated
    public static void showErrorNotification(int i2, Context context) {
        GoogleApiAvailability googleApiAvailabilityM13803q = GoogleApiAvailability.m13803q();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i2) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i2)) {
            googleApiAvailabilityM13803q.m13821x(context);
        } else {
            googleApiAvailabilityM13803q.m13819s(context, i2);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i2)) {
            i2 = 18;
        }
        return GoogleApiAvailability.m13803q().m13816o(activity, i2, i3, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i2) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i2);
    }

    public static boolean showErrorDialogFragment(int i2, Activity activity, Fragment fragment, int i3, DialogInterface.OnCancelListener onCancelListener) {
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i2)) {
            i2 = 18;
        }
        GoogleApiAvailability googleApiAvailabilityM13803q = GoogleApiAvailability.m13803q();
        if (fragment == null) {
            return googleApiAvailabilityM13803q.m13818r(activity, i2, i3, onCancelListener);
        }
        Dialog dialogM13805u = GoogleApiAvailability.m13805u(activity, i2, DialogRedirect.m14322b(fragment, GoogleApiAvailability.m13803q().mo13809d(activity, i2, "d"), i3), onCancelListener);
        if (dialogM13805u == null) {
            return false;
        }
        GoogleApiAvailability.m13806w(activity, dialogM13805u, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3) {
        return showErrorDialogFragment(i2, activity, i3, null);
    }
}
