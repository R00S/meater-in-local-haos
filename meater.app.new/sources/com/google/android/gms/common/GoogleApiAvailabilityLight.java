package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.common.zzd;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiAvailabilityLight {

    /* renamed from: a */
    @KeepForSdk
    public static final int f17217a = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    private static final GoogleApiAvailabilityLight f17218b = new GoogleApiAvailabilityLight();

    @KeepForSdk
    GoogleApiAvailabilityLight() {
    }

    @KeepForSdk
    /* renamed from: h */
    public static GoogleApiAvailabilityLight m13823h() {
        return f17218b;
    }

    @KeepForSdk
    /* renamed from: a */
    public void m13824a(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public int m13825b(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    /* renamed from: c */
    public Intent m13826c(int i2) {
        return mo13809d(null, i2, null);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: d */
    public Intent mo13809d(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return com.google.android.gms.common.internal.zzt.m14513c("com.google.android.gms");
        }
        if (context != null && DeviceProperties.m14625e(context)) {
            return com.google.android.gms.common.internal.zzt.m14511a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f17217a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(Wrappers.m14674a(context).m14671e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return com.google.android.gms.common.internal.zzt.m14512b("com.google.android.gms", sb.toString());
    }

    @KeepForSdk
    /* renamed from: e */
    public PendingIntent mo13810e(Context context, int i2, int i3) {
        return m13827f(context, i2, i3, null);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: f */
    public PendingIntent m13827f(Context context, int i2, int i3, String str) {
        Intent intentMo13809d = mo13809d(context, i2, str);
        if (intentMo13809d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, intentMo13809d, zzd.f27611a | 134217728);
    }

    @KeepForSdk
    /* renamed from: g */
    public String mo13811g(int i2) {
        return GooglePlayServicesUtilLight.getErrorString(i2);
    }

    @HideFirstParty
    @KeepForSdk
    /* renamed from: i */
    public int mo13812i(Context context) {
        return mo13813j(context, f17217a);
    }

    @KeepForSdk
    /* renamed from: j */
    public int mo13813j(Context context, int i2) {
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i2);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: k */
    public boolean m13828k(Context context, int i2) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i2);
    }

    @KeepForSdk
    /* renamed from: l */
    public boolean m13829l(Context context, String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    /* renamed from: m */
    public boolean mo13814m(int i2) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i2);
    }
}
