package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.C6325R;
import com.google.android.gms.common.C6349R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import p024c.p041e.C0873g;

/* loaded from: classes2.dex */
public final class ConnectionErrorMessages {

    /* renamed from: a */
    private static final C0873g<String, String> f17722a = new C0873g<>();

    private ConnectionErrorMessages() {
    }

    /* renamed from: a */
    public static String m14306a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.m14674a(context).m14670d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m14307b(Context context) {
        return context.getResources().getString(C6325R.string.f17123g);
    }

    /* renamed from: c */
    public static String m14308c(Context context, int i2) {
        Resources resources = context.getResources();
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(C6325R.string.f17117a) : resources.getString(C6325R.string.f17126j) : resources.getString(C6325R.string.f17120d);
    }

    /* renamed from: d */
    public static String m14309d(Context context, int i2) {
        Resources resources = context.getResources();
        String strM14306a = m14306a(context);
        if (i2 == 1) {
            return resources.getString(C6325R.string.f17121e, strM14306a);
        }
        if (i2 == 2) {
            return DeviceProperties.m14625e(context) ? resources.getString(C6325R.string.f17130n) : resources.getString(C6325R.string.f17127k, strM14306a);
        }
        if (i2 == 3) {
            return resources.getString(C6325R.string.f17118b, strM14306a);
        }
        if (i2 == 5) {
            return m14314i(context, "common_google_play_services_invalid_account_text", strM14306a);
        }
        if (i2 == 7) {
            return m14314i(context, "common_google_play_services_network_error_text", strM14306a);
        }
        if (i2 == 9) {
            return resources.getString(C6325R.string.f17125i, strM14306a);
        }
        if (i2 == 20) {
            return m14314i(context, "common_google_play_services_restricted_profile_text", strM14306a);
        }
        switch (i2) {
            case 16:
                return m14314i(context, "common_google_play_services_api_unavailable_text", strM14306a);
            case 17:
                return m14314i(context, "common_google_play_services_sign_in_failed_text", strM14306a);
            case 18:
                return resources.getString(C6325R.string.f17129m, strM14306a);
            default:
                return resources.getString(C6349R.string.f17225a, strM14306a);
        }
    }

    /* renamed from: e */
    public static String m14310e(Context context, int i2) {
        return i2 == 6 ? m14314i(context, "common_google_play_services_resolution_required_text", m14306a(context)) : m14309d(context, i2);
    }

    /* renamed from: f */
    public static String m14311f(Context context, int i2) {
        String strM14313h = i2 == 6 ? m14313h(context, "common_google_play_services_resolution_required_title") : m14312g(context, i2);
        return strM14313h == null ? context.getResources().getString(C6325R.string.f17124h) : strM14313h;
    }

    /* renamed from: g */
    public static String m14312g(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(C6325R.string.f17122f);
            case 2:
                return resources.getString(C6325R.string.f17128l);
            case 3:
                return resources.getString(C6325R.string.f17119c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m14313h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m14313h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m14313h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m14313h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m14313h(Context context, String str) {
        C0873g<String, String> c0873g = f17722a;
        synchronized (c0873g) {
            String str2 = c0873g.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String strValueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                c0873g.put(str, string);
                return string;
            }
            String strValueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    /* renamed from: i */
    private static String m14314i(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strM14313h = m14313h(context, str);
        if (strM14313h == null) {
            strM14313h = resources.getString(C6349R.string.f17225a);
        }
        return String.format(resources.getConfiguration().locale, strM14313h, str2);
    }
}
