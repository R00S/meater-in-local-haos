package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5697q;
import com.facebook.p157o0.C5825g0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserSettingsManager.kt */
/* renamed from: com.facebook.n0 */
/* loaded from: classes.dex */
public final class C5810n0 {

    /* renamed from: a */
    public static final C5810n0 f14891a = new C5810n0();

    /* renamed from: b */
    private static final String f14892b = C5810n0.class.getName();

    /* renamed from: c */
    private static final AtomicBoolean f14893c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final AtomicBoolean f14894d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final a f14895e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f */
    private static final a f14896f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g */
    private static final a f14897g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h */
    private static final a f14898h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i */
    private static final a f14899i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j */
    private static SharedPreferences f14900j;

    /* compiled from: UserSettingsManager.kt */
    /* renamed from: com.facebook.n0$a */
    private static final class a {

        /* renamed from: a */
        private boolean f14901a;

        /* renamed from: b */
        private String f14902b;

        /* renamed from: c */
        private Boolean f14903c;

        /* renamed from: d */
        private long f14904d;

        public a(boolean z, String str) {
            C9801m.m32346f(str, RoomNotification.KEY);
            this.f14901a = z;
            this.f14902b = str;
        }

        /* renamed from: a */
        public final boolean m12154a() {
            return this.f14901a;
        }

        /* renamed from: b */
        public final String m12155b() {
            return this.f14902b;
        }

        /* renamed from: c */
        public final long m12156c() {
            return this.f14904d;
        }

        /* renamed from: d */
        public final Boolean m12157d() {
            return this.f14903c;
        }

        /* renamed from: e */
        public final boolean m12158e() {
            Boolean bool = this.f14903c;
            return bool == null ? this.f14901a : bool.booleanValue();
        }

        /* renamed from: f */
        public final void m12159f(long j2) {
            this.f14904d = j2;
        }

        /* renamed from: g */
        public final void m12160g(Boolean bool) {
            this.f14903c = bool;
        }
    }

    private C5810n0() {
    }

    /* renamed from: a */
    public static final boolean m12138a() throws JSONException, PackageManager.NameNotFoundException {
        f14891a.m12144g();
        return f14897g.m12158e();
    }

    /* renamed from: b */
    public static final boolean m12139b() throws JSONException, PackageManager.NameNotFoundException {
        f14891a.m12144g();
        return f14895e.m12158e();
    }

    /* renamed from: c */
    public static final boolean m12140c() throws JSONException, PackageManager.NameNotFoundException {
        f14891a.m12144g();
        return f14896f.m12158e();
    }

    /* renamed from: d */
    public static final boolean m12141d() throws JSONException, PackageManager.NameNotFoundException {
        f14891a.m12144g();
        return f14898h.m12158e();
    }

    /* renamed from: e */
    private final void m12142e() {
        a aVar = f14898h;
        m12151n(aVar);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (aVar.m12157d() == null || jCurrentTimeMillis - aVar.m12156c() >= 604800000) {
            aVar.m12160g(null);
            aVar.m12159f(0L);
            if (f14894d.compareAndSet(false, true)) {
                C5641a0 c5641a0 = C5641a0.f14199a;
                C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.t
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        C5810n0.m12143f(jCurrentTimeMillis);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12143f(long j2) throws JSONException {
        if (f14897g.m12158e()) {
            C5672d0 c5672d0 = C5672d0.f14392a;
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5670c0 c5670c0M11428o = C5672d0.m11428o(C5641a0.m11285d(), false);
            if (c5670c0M11428o != null && c5670c0M11428o.m11398b()) {
                C5697q c5697qM11628e = C5697q.f14488a.m11628e(C5641a0.m11284c());
                String strM11618h = (c5697qM11628e == null || c5697qM11628e.m11618h() == null) ? null : c5697qM11628e.m11618h();
                if (strM11618h != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strM11618h);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest graphRequestM11236x = GraphRequest.f14159a.m11236x(null, "app", null);
                    graphRequestM11236x.m11177H(bundle);
                    JSONObject jSONObjectM11339c = graphRequestM11236x.m11179j().m11339c();
                    if (jSONObjectM11339c != null) {
                        a aVar = f14898h;
                        aVar.m12160g(Boolean.valueOf(jSONObjectM11339c.optBoolean("auto_event_setup_enabled", false)));
                        aVar.m12159f(j2);
                        f14891a.m12153p(aVar);
                    }
                }
            }
        }
        f14894d.set(false);
    }

    /* renamed from: g */
    private final void m12144g() throws JSONException, PackageManager.NameNotFoundException {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11304w() && f14893c.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = C5641a0.m11284c().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            C9801m.m32345e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f14900j = sharedPreferences;
            m12145h(f14896f, f14897g, f14895e);
            m12142e();
            m12150m();
            m12149l();
        }
    }

    /* renamed from: h */
    private final void m12145h(a... aVarArr) throws JSONException, PackageManager.NameNotFoundException {
        int length = aVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            a aVar = aVarArr[i2];
            i2++;
            if (aVar == f14898h) {
                m12142e();
            } else if (aVar.m12157d() == null) {
                m12151n(aVar);
                if (aVar.m12157d() == null) {
                    m12147j(aVar);
                }
            } else {
                m12153p(aVar);
            }
        }
    }

    /* renamed from: j */
    private final void m12147j(a aVar) throws PackageManager.NameNotFoundException {
        m12152o();
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            ApplicationInfo applicationInfo = contextM11284c.getPackageManager().getApplicationInfo(contextM11284c.getPackageName(), 128);
            C9801m.m32345e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.containsKey(aVar.m12155b())) {
                return;
            }
            aVar.m12160g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.m12155b(), aVar.m12154a())));
        } catch (PackageManager.NameNotFoundException e2) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0(f14892b, e2);
        }
    }

    /* renamed from: k */
    public static final void m12148k() {
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            ApplicationInfo applicationInfo = contextM11284c.getPackageManager().getApplicationInfo(contextM11284c.getPackageName(), 128);
            C9801m.m32345e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            C5825g0 c5825g0 = new C5825g0(contextM11284c);
            Bundle bundle2 = new Bundle();
            C5696p0 c5696p0 = C5696p0.f14478a;
            if (!C5696p0.m11548S()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f14892b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            c5825g0.m12242d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: l */
    private final void m12149l() throws PackageManager.NameNotFoundException {
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        if (f14893c.get()) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (C5641a0.m11304w()) {
                Context contextM11284c = C5641a0.m11284c();
                int i4 = 0;
                int i5 = ((f14895e.m12158e() ? 1 : 0) << 0) | 0 | ((f14896f.m12158e() ? 1 : 0) << 1) | ((f14897g.m12158e() ? 1 : 0) << 2) | ((f14899i.m12158e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f14900j;
                if (sharedPreferences == null) {
                    C9801m.m32363w("userSettingPref");
                    throw null;
                }
                int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i6 != i5) {
                    SharedPreferences sharedPreferences2 = f14900j;
                    if (sharedPreferences2 == null) {
                        C9801m.m32363w("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i5).apply();
                    try {
                        applicationInfo = contextM11284c.getPackageManager().getApplicationInfo(contextM11284c.getPackageName(), 128);
                        C9801m.m32345e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i2 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i3 = 0;
                        C5825g0 c5825g0 = new C5825g0(contextM11284c);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i4);
                        bundle.putInt("initial", i3);
                        bundle.putInt("previous", i6);
                        bundle.putInt("current", i5);
                        c5825g0.m12240b(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    int i7 = 0;
                    i2 = 0;
                    i3 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        try {
                            i2 |= (applicationInfo.metaData.containsKey(strArr[i7]) ? 1 : 0) << i7;
                            i3 |= (applicationInfo.metaData.getBoolean(strArr[i7], zArr[i7]) ? 1 : 0) << i7;
                            if (i8 > 3) {
                                break;
                            } else {
                                i7 = i8;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i4 = i3;
                            i3 = i4;
                            i4 = i2;
                            C5825g0 c5825g02 = new C5825g0(contextM11284c);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("usage", i4);
                            bundle2.putInt("initial", i3);
                            bundle2.putInt("previous", i6);
                            bundle2.putInt("current", i5);
                            c5825g02.m12240b(bundle2);
                        }
                    }
                    i4 = i2;
                    C5825g0 c5825g022 = new C5825g0(contextM11284c);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i4);
                    bundle22.putInt("initial", i3);
                    bundle22.putInt("previous", i6);
                    bundle22.putInt("current", i5);
                    c5825g022.m12240b(bundle22);
                }
            }
        }
    }

    /* renamed from: m */
    private final void m12150m() throws PackageManager.NameNotFoundException {
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            Context contextM11284c = C5641a0.m11284c();
            ApplicationInfo applicationInfo = contextM11284c.getPackageManager().getApplicationInfo(contextM11284c.getPackageName(), 128);
            C9801m.m32345e(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f14892b, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f14892b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (m12138a()) {
                    return;
                }
                Log.w(f14892b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: n */
    private final void m12151n(a aVar) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        m12152o();
        try {
            SharedPreferences sharedPreferences = f14900j;
            if (sharedPreferences == null) {
                C9801m.m32363w("userSettingPref");
                throw null;
            }
            String string = sharedPreferences.getString(aVar.m12155b(), HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null) {
                str = string;
            }
            if (str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                aVar.m12160g(Boolean.valueOf(jSONObject.getBoolean("value")));
                aVar.m12159f(jSONObject.getLong("last_timestamp"));
            }
        } catch (JSONException e2) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0(f14892b, e2);
        }
    }

    /* renamed from: o */
    private final void m12152o() {
        if (!f14893c.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    /* renamed from: p */
    private final void m12153p(a aVar) throws JSONException {
        m12152o();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", aVar.m12157d());
            jSONObject.put("last_timestamp", aVar.m12156c());
            SharedPreferences sharedPreferences = f14900j;
            if (sharedPreferences == null) {
                C9801m.m32363w("userSettingPref");
                throw null;
            }
            sharedPreferences.edit().putString(aVar.m12155b(), jSONObject.toString()).apply();
            m12149l();
        } catch (Exception e2) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0(f14892b, e2);
        }
    }
}
