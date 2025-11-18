package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.internal.C5666a0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5682i0;
import com.facebook.internal.C5686k0;
import com.facebook.internal.C5692n0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5697q;
import com.facebook.internal.C5698q0;
import com.facebook.internal.C5699r;
import com.facebook.internal.p148t0.C5714j;
import com.facebook.p157o0.C5813a0;
import com.facebook.p157o0.C5817c0;
import com.facebook.p157o0.p165q0.C5901f;
import com.facebook.p157o0.p165q0.C5903h;
import com.facebook.p157o0.p167s0.C5925c;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10775u;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C10546u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookSdk.kt */
/* renamed from: com.facebook.a0 */
/* loaded from: classes.dex */
public final class C5641a0 {

    /* renamed from: d */
    private static Executor f14202d;

    /* renamed from: e */
    private static volatile String f14203e;

    /* renamed from: f */
    private static volatile String f14204f;

    /* renamed from: g */
    private static volatile String f14205g;

    /* renamed from: h */
    private static volatile Boolean f14206h;

    /* renamed from: j */
    private static volatile boolean f14208j;

    /* renamed from: k */
    private static boolean f14209k;

    /* renamed from: l */
    private static C5682i0<File> f14210l;

    /* renamed from: m */
    private static Context f14211m;

    /* renamed from: p */
    private static String f14214p;

    /* renamed from: q */
    public static boolean f14215q;

    /* renamed from: r */
    public static boolean f14216r;

    /* renamed from: s */
    public static boolean f14217s;

    /* renamed from: t */
    private static final AtomicBoolean f14218t;

    /* renamed from: u */
    private static volatile String f14219u;

    /* renamed from: v */
    private static volatile String f14220v;

    /* renamed from: w */
    private static a f14221w;

    /* renamed from: x */
    private static boolean f14222x;

    /* renamed from: a */
    public static final C5641a0 f14199a = new C5641a0();

    /* renamed from: b */
    private static final String f14200b = C5641a0.class.getCanonicalName();

    /* renamed from: c */
    private static final HashSet<EnumC5659g0> f14201c = C10822w0.m38918e(EnumC5659g0.DEVELOPER_ERRORS);

    /* renamed from: i */
    private static AtomicLong f14207i = new AtomicLong(65536);

    /* renamed from: n */
    private static int f14212n = 64206;

    /* renamed from: o */
    private static final ReentrantLock f14213o = new ReentrantLock();

    /* compiled from: FacebookSdk.kt */
    /* renamed from: com.facebook.a0$a */
    public interface a {
        /* renamed from: a */
        GraphRequest mo11308a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5631b interfaceC5631b);
    }

    /* compiled from: FacebookSdk.kt */
    /* renamed from: com.facebook.a0$b */
    public interface b {
        /* renamed from: a */
        void m11309a();
    }

    static {
        C5692n0 c5692n0 = C5692n0.f14464a;
        f14214p = C5692n0.m11510a();
        f14218t = new AtomicBoolean(false);
        f14219u = "instagram.com";
        f14220v = "facebook.com";
        f14221w = new a() { // from class: com.facebook.n
            @Override // com.facebook.C5641a0.a
            /* renamed from: a */
            public final GraphRequest mo11308a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5631b interfaceC5631b) {
                return C5641a0.m11301t(accessToken, str, jSONObject, interfaceC5631b);
            }
        };
    }

    private C5641a0() {
    }

    /* renamed from: I */
    public static final void m11269I(Context context) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            C9801m.m32345e(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f14203e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    C9801m.m32345e(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (C10546u.m37511E(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        C9801m.m32345e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        f14203e = strSubstring;
                    } else {
                        f14203e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f14204f == null) {
                f14204f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f14205g == null) {
                f14205g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f14212n == 64206) {
                f14212n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f14206h == null) {
                f14206h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: J */
    private final void m11270J(Context context, String str) {
        try {
            C5697q c5697qM11628e = C5697q.f14488a.m11628e(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String strM32354n = C9801m.m32354n(str, "ping");
            long j2 = sharedPreferences.getLong(strM32354n, 0L);
            try {
                C5903h c5903h = C5903h.f15371a;
                JSONObject jSONObjectM12631a = C5903h.m12631a(C5903h.a.MOBILE_INSTALL_EVENT, c5697qM11628e, C5813a0.f14908a.m12169c(context), m11298q(context), context);
                StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
                String str2 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
                GraphRequest graphRequestMo11308a = f14221w.mo11308a(null, str2, jSONObjectM12631a, null);
                if (j2 == 0 && graphRequestMo11308a.m11179j().m11338b() == null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(strM32354n, System.currentTimeMillis());
                    editorEdit.apply();
                }
            } catch (JSONException e2) {
                throw new FacebookException("An error occurred while publishing install.", e2);
            }
        } catch (Exception e3) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0("Facebook-publish", e3);
        }
    }

    /* renamed from: K */
    public static final void m11271K(Context context, final String str) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(str, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        m11292k().execute(new Runnable() { // from class: com.facebook.k
            @Override // java.lang.Runnable
            public final void run() {
                C5641a0.m11272L(applicationContext, str);
            }
        });
        C5666a0 c5666a0 = C5666a0.f14313a;
        if (C5666a0.m11378g(C5666a0.b.OnDeviceEventProcessing)) {
            C5925c c5925c = C5925c.f15458a;
            if (C5925c.m12741b()) {
                C5925c.m12746g(str, "com.facebook.sdk.attributionTracking");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m11272L(Context context, String str) {
        C9801m.m32346f(context, "$applicationContext");
        C9801m.m32346f(str, "$applicationId");
        f14199a.m11270J(context, str);
    }

    /* renamed from: M */
    public static final synchronized void m11273M(Context context) {
        C9801m.m32346f(context, "applicationContext");
        m11274N(context, null);
    }

    /* renamed from: N */
    public static final synchronized void m11274N(Context context, final b bVar) {
        C9801m.m32346f(context, "applicationContext");
        AtomicBoolean atomicBoolean = f14218t;
        if (atomicBoolean.get()) {
            if (bVar != null) {
                bVar.m11309a();
            }
            return;
        }
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11637e(context, false);
        C5698q0.m11638f(context, false);
        Context applicationContext = context.getApplicationContext();
        C9801m.m32345e(applicationContext, "applicationContext.applicationContext");
        f14211m = applicationContext;
        C5813a0.f14908a.m12169c(context);
        Context context2 = f14211m;
        if (context2 == null) {
            C9801m.m32363w("applicationContext");
            throw null;
        }
        m11269I(context2);
        String str = f14203e;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f14205g;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (m11287f()) {
            m11282a();
        }
        Context context3 = f14211m;
        if (context3 == null) {
            C9801m.m32363w("applicationContext");
            throw null;
        }
        if (context3 instanceof Application) {
            C5810n0 c5810n0 = C5810n0.f14891a;
            if (C5810n0.m12140c()) {
                C5901f c5901f = C5901f.f15358a;
                Context context4 = f14211m;
                if (context4 == null) {
                    C9801m.m32363w("applicationContext");
                    throw null;
                }
                C5901f.m12622x((Application) context4, f14203e);
            }
        }
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5672d0.m11421g();
        C5686k0 c5686k0 = C5686k0.f14437a;
        C5686k0.m11482x();
        C5699r.a aVar = C5699r.f14502a;
        Context context5 = f14211m;
        if (context5 == null) {
            C9801m.m32363w("applicationContext");
            throw null;
        }
        aVar.m11650a(context5);
        f14210l = new C5682i0<>(new Callable() { // from class: com.facebook.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5641a0.m11275O();
            }
        });
        C5666a0 c5666a0 = C5666a0.f14313a;
        C5666a0.m11372a(C5666a0.b.Instrument, new C5666a0.a() { // from class: com.facebook.f
            @Override // com.facebook.internal.C5666a0.a
            /* renamed from: a */
            public final void mo11347a(boolean z) {
                C5641a0.m11276P(z);
            }
        });
        C5666a0.m11372a(C5666a0.b.AppEvents, new C5666a0.a() { // from class: com.facebook.j
            @Override // com.facebook.internal.C5666a0.a
            /* renamed from: a */
            public final void mo11347a(boolean z) {
                C5641a0.m11277Q(z);
            }
        });
        C5666a0.m11372a(C5666a0.b.ChromeCustomTabsPrefetching, new C5666a0.a() { // from class: com.facebook.l
            @Override // com.facebook.internal.C5666a0.a
            /* renamed from: a */
            public final void mo11347a(boolean z) {
                C5641a0.m11278R(z);
            }
        });
        C5666a0.m11372a(C5666a0.b.IgnoreAppSwitchToLoggedOut, new C5666a0.a() { // from class: com.facebook.g
            @Override // com.facebook.internal.C5666a0.a
            /* renamed from: a */
            public final void mo11347a(boolean z) {
                C5641a0.m11279S(z);
            }
        });
        C5666a0.m11372a(C5666a0.b.BypassAppSwitch, new C5666a0.a() { // from class: com.facebook.h
            @Override // com.facebook.internal.C5666a0.a
            /* renamed from: a */
            public final void mo11347a(boolean z) {
                C5641a0.m11280T(z);
            }
        });
        m11292k().execute(new FutureTask(new Callable() { // from class: com.facebook.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5641a0.m11281U(bVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final File m11275O() {
        Context context = f14211m;
        if (context != null) {
            return context.getCacheDir();
        }
        C9801m.m32363w("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m11276P(boolean z) {
        if (z) {
            C5714j c5714j = C5714j.f14589a;
            C5714j.m11738d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m11277Q(boolean z) {
        if (z) {
            C5817c0 c5817c0 = C5817c0.f14926a;
            C5817c0.m12216a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m11278R(boolean z) {
        if (z) {
            f14215q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m11279S(boolean z) {
        if (z) {
            f14216r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m11280T(boolean z) {
        if (z) {
            f14217s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final Void m11281U(b bVar) {
        C5955v.f15573a.m12923e().m12915j();
        C5663i0.f14305a.m11370a().m11368d();
        if (AccessToken.f14054f.m11107g()) {
            Profile.C5639b c5639b = Profile.f14188f;
            if (c5639b.m11257b() == null) {
                c5639b.m11256a();
            }
        }
        if (bVar != null) {
            bVar.m11309a();
        }
        C5813a0.a aVar = C5813a0.f14908a;
        aVar.m12172f(m11284c(), f14203e);
        C5810n0 c5810n0 = C5810n0.f14891a;
        C5810n0.m12148k();
        Context applicationContext = m11284c().getApplicationContext();
        C9801m.m32345e(applicationContext, "getApplicationContext().applicationContext");
        aVar.m12173g(applicationContext).m12164b();
        return null;
    }

    /* renamed from: a */
    public static final void m11282a() {
        f14222x = true;
    }

    /* renamed from: b */
    public static final boolean m11283b() {
        C5810n0 c5810n0 = C5810n0.f14891a;
        return C5810n0.m12138a();
    }

    /* renamed from: c */
    public static final Context m11284c() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        Context context = f14211m;
        if (context != null) {
            return context;
        }
        C9801m.m32363w("applicationContext");
        throw null;
    }

    /* renamed from: d */
    public static final String m11285d() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        String str = f14203e;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    /* renamed from: e */
    public static final String m11286e() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        return f14204f;
    }

    /* renamed from: f */
    public static final boolean m11287f() {
        C5810n0 c5810n0 = C5810n0.f14891a;
        return C5810n0.m12139b();
    }

    /* renamed from: g */
    public static final boolean m11288g() {
        C5810n0 c5810n0 = C5810n0.f14891a;
        return C5810n0.m12140c();
    }

    /* renamed from: h */
    public static final int m11289h() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        return f14212n;
    }

    /* renamed from: i */
    public static final String m11290i() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        String str = f14205g;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* renamed from: j */
    public static final boolean m11291j() {
        C5810n0 c5810n0 = C5810n0.f14891a;
        return C5810n0.m12141d();
    }

    /* renamed from: k */
    public static final Executor m11292k() {
        ReentrantLock reentrantLock = f14213o;
        reentrantLock.lock();
        try {
            if (f14202d == null) {
                f14202d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            C10775u c10775u = C10775u.f41439a;
            reentrantLock.unlock();
            Executor executor = f14202d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: l */
    public static final String m11293l() {
        return f14220v;
    }

    /* renamed from: m */
    public static final String m11294m() {
        return "fb.gg";
    }

    /* renamed from: n */
    public static final String m11295n() {
        C5696p0 c5696p0 = C5696p0.f14478a;
        String str = f14200b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f14214p}, 1));
        C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
        C5696p0.m11575j0(str, str2);
        return f14214p;
    }

    /* renamed from: o */
    public static final String m11296o() {
        AccessToken accessTokenM11105e = AccessToken.f14054f.m11105e();
        String strM11089h = accessTokenM11105e != null ? accessTokenM11105e.m11089h() : null;
        C5696p0 c5696p0 = C5696p0.f14478a;
        return C5696p0.m11528C(strM11089h);
    }

    /* renamed from: p */
    public static final String m11297p() {
        return f14219u;
    }

    /* renamed from: q */
    public static final boolean m11298q(Context context) {
        C9801m.m32346f(context, "context");
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: r */
    public static final long m11299r() {
        C5698q0 c5698q0 = C5698q0.f14500a;
        C5698q0.m11644l();
        return f14207i.get();
    }

    /* renamed from: s */
    public static final String m11300s() {
        return "16.2.0";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final GraphRequest m11301t(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC5631b interfaceC5631b) {
        return GraphRequest.f14159a.m11222A(accessToken, str, jSONObject, interfaceC5631b);
    }

    /* renamed from: u */
    public static final boolean m11302u() {
        return f14208j;
    }

    /* renamed from: v */
    public static final synchronized boolean m11303v() {
        return f14222x;
    }

    /* renamed from: w */
    public static final boolean m11304w() {
        return f14218t.get();
    }

    /* renamed from: x */
    public static final boolean m11305x() {
        return f14209k;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m11306y(com.facebook.EnumC5659g0 r2) {
        /*
            java.lang.String r0 = "behavior"
            kotlin.jvm.internal.C9801m.m32346f(r2, r0)
            java.util.HashSet<com.facebook.g0> r0 = com.facebook.C5641a0.f14201c
            monitor-enter(r0)
            boolean r1 = m11302u()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L16
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            monitor-exit(r0)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C5641a0.m11306y(com.facebook.g0):boolean");
    }
}
