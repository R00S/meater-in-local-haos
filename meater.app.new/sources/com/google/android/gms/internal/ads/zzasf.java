package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzasf {

    /* renamed from: A */
    private int f22463A;

    /* renamed from: B */
    private String f22464B;

    /* renamed from: C */
    private boolean f22465C;

    /* renamed from: a */
    private int f22466a;

    /* renamed from: b */
    private boolean f22467b;

    /* renamed from: c */
    private boolean f22468c;

    /* renamed from: d */
    private int f22469d;

    /* renamed from: e */
    private int f22470e;

    /* renamed from: f */
    private int f22471f;

    /* renamed from: g */
    private String f22472g;

    /* renamed from: h */
    private int f22473h;

    /* renamed from: i */
    private int f22474i;

    /* renamed from: j */
    private int f22475j;

    /* renamed from: k */
    private boolean f22476k;

    /* renamed from: l */
    private int f22477l;

    /* renamed from: m */
    private double f22478m;

    /* renamed from: n */
    private boolean f22479n;

    /* renamed from: o */
    private String f22480o;

    /* renamed from: p */
    private String f22481p;

    /* renamed from: q */
    private boolean f22482q;

    /* renamed from: r */
    private boolean f22483r;

    /* renamed from: s */
    private String f22484s;

    /* renamed from: t */
    private boolean f22485t;

    /* renamed from: u */
    private final boolean f22486u;

    /* renamed from: v */
    private boolean f22487v;

    /* renamed from: w */
    private String f22488w;

    /* renamed from: x */
    private String f22489x;

    /* renamed from: y */
    private float f22490y;

    /* renamed from: z */
    private int f22491z;

    public zzasf(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        m16910c(context);
        m16911d(context);
        m16912e(context);
        Locale locale = Locale.getDefault();
        this.f22482q = m16908a(packageManager, "geo:0,0?q=donuts") != null;
        this.f22483r = m16908a(packageManager, "http://www.google.com") != null;
        this.f22484s = locale.getCountry();
        zzyt.m20844a();
        this.f22485t = zzazt.m17317v();
        this.f22486u = DeviceProperties.m14621a(context);
        this.f22487v = DeviceProperties.m14622b(context);
        this.f22488w = locale.getLanguage();
        this.f22489x = m16909b(context, packageManager);
        this.f22464B = m16913f(context);
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f22490y = displayMetrics.density;
        this.f22491z = displayMetrics.widthPixels;
        this.f22463A = displayMetrics.heightPixels;
    }

    /* renamed from: a */
    private static ResolveInfo m16908a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzk.zzlk().m17052e(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: b */
    private static String m16909b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoM16908a = m16908a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoM16908a == null || (activityInfo = resolveInfoM16908a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e(activityInfo.packageName, 0);
            if (packageInfoM14671e != null) {
                int i2 = packageInfoM14671e.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: c */
    private final void m16910c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f22466a = audioManager.getMode();
                this.f22467b = audioManager.isMusicActive();
                this.f22468c = audioManager.isSpeakerphoneOn();
                this.f22469d = audioManager.getStreamVolume(3);
                this.f22470e = audioManager.getRingerMode();
                this.f22471f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzk.zzlk().m17052e(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f22466a = -2;
        this.f22467b = false;
        this.f22468c = false;
        this.f22469d = 0;
        this.f22470e = 2;
        this.f22471f = 0;
    }

    @TargetApi(16)
    /* renamed from: d */
    private final void m16911d(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f22472g = telephonyManager.getNetworkOperator();
        this.f22474i = telephonyManager.getNetworkType();
        this.f22475j = telephonyManager.getPhoneType();
        this.f22473h = -2;
        this.f22476k = false;
        this.f22477l = -1;
        zzk.zzlg();
        if (zzaxi.m17152f0(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f22473h = activeNetworkInfo.getType();
                this.f22477l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f22473h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f22476k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: e */
    private final void m16912e(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.f22478m = -1.0d;
            this.f22479n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.f22478m = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.f22479n = intExtra == 2 || intExtra == 5;
        }
    }

    /* renamed from: f */
    private static String m16913f(Context context) {
        try {
            PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e("com.android.vending", 128);
            if (packageInfoM14671e != null) {
                int i2 = packageInfoM14671e.versionCode;
                String str = packageInfoM14671e.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: g */
    public final zzase m16914g() {
        return new zzase(this.f22466a, this.f22482q, this.f22483r, this.f22472g, this.f22484s, this.f22485t, this.f22486u, this.f22487v, this.f22467b, this.f22468c, this.f22488w, this.f22489x, this.f22464B, this.f22469d, this.f22473h, this.f22474i, this.f22475j, this.f22470e, this.f22471f, this.f22490y, this.f22491z, this.f22463A, this.f22478m, this.f22479n, this.f22476k, this.f22477l, this.f22480o, this.f22465C, this.f22481p);
    }

    public zzasf(Context context, zzase zzaseVar) {
        m16910c(context);
        m16911d(context);
        m16912e(context);
        this.f22480o = Build.FINGERPRINT;
        this.f22481p = Build.DEVICE;
        this.f22465C = PlatformVersion.m14638b() && zzads.m16458a(context);
        this.f22482q = zzaseVar.f22438b;
        this.f22483r = zzaseVar.f22439c;
        this.f22484s = zzaseVar.f22441e;
        this.f22485t = zzaseVar.f22442f;
        this.f22486u = zzaseVar.f22443g;
        this.f22487v = zzaseVar.f22444h;
        this.f22488w = zzaseVar.f22447k;
        this.f22489x = zzaseVar.f22448l;
        this.f22464B = zzaseVar.f22449m;
        this.f22490y = zzaseVar.f22456t;
        this.f22491z = zzaseVar.f22457u;
        this.f22463A = zzaseVar.f22458v;
    }
}
