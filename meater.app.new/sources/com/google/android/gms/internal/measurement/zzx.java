package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzha;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
/* loaded from: classes2.dex */
public class zzx {

    /* renamed from: a */
    private static volatile zzx f28396a = null;

    /* renamed from: b */
    private static Boolean f28397b = null;

    /* renamed from: c */
    private static Boolean f28398c = null;

    /* renamed from: d */
    private static boolean f28399d = false;

    /* renamed from: e */
    private static Boolean f28400e = null;

    /* renamed from: f */
    @VisibleForTesting
    private static String f28401f = "use_dynamite_api";

    /* renamed from: g */
    @VisibleForTesting
    private static String f28402g = "allow_remote_dynamite";

    /* renamed from: h */
    private final String f28403h;

    /* renamed from: i */
    protected final Clock f28404i;

    /* renamed from: j */
    private final ExecutorService f28405j;

    /* renamed from: k */
    private final AppMeasurementSdk f28406k;

    /* renamed from: l */
    private List<Pair<zzha, BinderC7634b>> f28407l;

    /* renamed from: m */
    private int f28408m;

    /* renamed from: n */
    private boolean f28409n;

    /* renamed from: o */
    private String f28410o;

    /* renamed from: p */
    private zzm f28411p;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzx$a */
    abstract class AbstractRunnableC7633a implements Runnable {

        /* renamed from: f */
        final long f28412f;

        /* renamed from: g */
        final long f28413g;

        /* renamed from: h */
        private final boolean f28414h;

        AbstractRunnableC7633a(zzx zzxVar) {
            this(true);
        }

        /* renamed from: a */
        abstract void mo20969a() throws RemoteException;

        /* renamed from: b */
        protected void mo20978b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzx.this.f28409n) {
                mo20978b();
                return;
            }
            try {
                mo20969a();
            } catch (Exception e2) {
                zzx.this.m22583p(e2, false, this.f28414h);
                mo20978b();
            }
        }

        AbstractRunnableC7633a(boolean z) {
            this.f28412f = zzx.this.f28404i.mo14608a();
            this.f28413g = zzx.this.f28404i.mo14609b();
            this.f28414h = z;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzx$b */
    static class BinderC7634b extends zzr {

        /* renamed from: f */
        private final zzha f28416f;

        BinderC7634b(zzha zzhaVar) {
            this.f28416f = zzhaVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzs
        /* renamed from: a */
        public final int mo22561a() {
            return System.identityHashCode(this.f28416f);
        }

        @Override // com.google.android.gms.internal.measurement.zzs
        /* renamed from: q4 */
        public final void mo22562q4(String str, String str2, Bundle bundle, long j2) {
            this.f28416f.mo22696a(str, str2, bundle, j2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzx$c */
    class C7635c implements Application.ActivityLifecycleCallbacks {
        C7635c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzx.this.m22580l(new C7587t(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzx.this.m22580l(new C7617y(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzx.this.m22580l(new C7611x(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzx.this.m22580l(new C7593u(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzk zzkVar = new zzk();
            zzx.this.m22580l(new C7623z(this, activity, zzkVar));
            Bundle bundleM22443E0 = zzkVar.m22443E0(50L);
            if (bundleM22443E0 != null) {
                bundle.putAll(bundleM22443E0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzx.this.m22580l(new C7599v(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzx.this.m22580l(new C7605w(this, activity));
        }
    }

    private zzx(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m22566J(str2, str3)) {
            this.f28403h = "FA";
        } else {
            this.f28403h = str;
        }
        this.f28404i = DefaultClock.m14620c();
        this.f28405j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f28406k = new AppMeasurementSdk(this);
        if (!(!m22570R(context) || m22575Y())) {
            this.f28410o = null;
            this.f28409n = true;
            Log.w(this.f28403h, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (m22566J(str2, str3)) {
            this.f28410o = str2;
        } else {
            this.f28410o = "fa";
            if (str2 != null && str3 != null) {
                Log.v(this.f28403h, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.f28409n = true;
                return;
            } else {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f28403h, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        }
        m22580l(new C7473a(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f28403h, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C7635c());
        }
    }

    /* renamed from: E */
    public static boolean m22563E(Context context) {
        m22573W(context);
        synchronized (zzx.class) {
            if (!f28399d) {
                try {
                    try {
                        String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "measurement.dynamite.enabled", HttpUrl.FRAGMENT_ENCODE_SET);
                        if ("true".equals(str)) {
                            f28400e = Boolean.TRUE;
                        } else if (AdultContentAnalytics.UNLOCK.equals(str)) {
                            f28400e = Boolean.FALSE;
                        } else {
                            f28400e = null;
                        }
                        f28399d = true;
                    } catch (Exception e2) {
                        Log.e("FA", "Unable to call SystemProperties.get()", e2);
                        f28400e = null;
                    }
                } finally {
                    f28399d = true;
                }
            }
        }
        Boolean bool = f28400e;
        if (bool == null) {
            bool = f28397b;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static boolean m22566J(String str, String str2) {
        return (str2 == null || str == null || m22575Y()) ? false : true;
    }

    /* renamed from: R */
    private static boolean m22570R(Context context) {
        try {
            GoogleServices.m14022c(context);
        } catch (IllegalStateException unused) {
        }
        return GoogleServices.m14021b() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static int m22571S(Context context) {
        return DynamiteModule.m14713c(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static int m22572U(Context context) {
        return DynamiteModule.m14712a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static void m22573W(Context context) {
        synchronized (zzx.class) {
            try {
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                Boolean bool = Boolean.FALSE;
                f28397b = bool;
                f28398c = bool;
            }
            if (f28397b == null || f28398c == null) {
                if (m22586w(context, "app_measurement_internal_disable_startup_flags")) {
                    Boolean bool2 = Boolean.FALSE;
                    f28397b = bool2;
                    f28398c = bool2;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f28397b = Boolean.valueOf(sharedPreferences.getBoolean(f28401f, false));
                f28398c = Boolean.valueOf(sharedPreferences.getBoolean(f28402g, false));
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.remove(f28401f);
                editorEdit.remove(f28402g);
                editorEdit.apply();
            }
        }
    }

    /* renamed from: Y */
    private static boolean m22575Y() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static zzx m22577d(Context context) {
        return m22578e(context, null, null, null, null);
    }

    /* renamed from: e */
    public static zzx m22578e(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.m14372k(context);
        if (f28396a == null) {
            synchronized (zzx.class) {
                if (f28396a == null) {
                    f28396a = new zzx(context, str, str2, str3, bundle);
                }
            }
        }
        return f28396a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m22580l(AbstractRunnableC7633a abstractRunnableC7633a) {
        this.f28405j.execute(abstractRunnableC7633a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m22583p(Exception exc, boolean z, boolean z2) {
        this.f28409n |= z;
        if (z) {
            Log.w(this.f28403h, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m22606i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f28403h, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: t */
    private final void m22584t(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m22580l(new C7575r(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: v */
    private final void m22585v(String str, String str2, Object obj, boolean z) {
        m22580l(new C7569q(this, str, str2, obj, z));
    }

    /* renamed from: w */
    private static boolean m22586w(Context context, String str) {
        Bundle bundle;
        Preconditions.m14368g(str);
        try {
            ApplicationInfo applicationInfoM14669c = Wrappers.m14674a(context).m14669c(context.getPackageName(), 128);
            if (applicationInfoM14669c != null && (bundle = applicationInfoM14669c.metaData) != null) {
                return bundle.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: A */
    public final List<Bundle> m22590A(String str, String str2) {
        zzk zzkVar = new zzk();
        m22580l(new C7479b(this, str, str2, zzkVar));
        List<Bundle> list = (List) zzk.m22442P(zzkVar.m22443E0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: B */
    public final void m22591B(String str) {
        m22580l(new C7491d(this, str));
    }

    /* renamed from: C */
    public final void m22592C(String str, String str2, Bundle bundle) {
        m22580l(new C7628z4(this, str, str2, bundle));
    }

    /* renamed from: D */
    public final void m22593D(boolean z) {
        m22580l(new C7563p(this, z));
    }

    /* renamed from: G */
    public final String m22594G() {
        zzk zzkVar = new zzk();
        m22580l(new C7509g(this, zzkVar));
        return zzkVar.m22445k0(500L);
    }

    /* renamed from: I */
    public final void m22595I(String str) {
        m22580l(new C7497e(this, str));
    }

    /* renamed from: L */
    public final int m22596L(String str) {
        zzk zzkVar = new zzk();
        m22580l(new C7551n(this, str, zzkVar));
        Integer num = (Integer) zzk.m22442P(zzkVar.m22443E0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: M */
    public final String m22597M() {
        zzk zzkVar = new zzk();
        m22580l(new C7503f(this, zzkVar));
        return zzkVar.m22445k0(50L);
    }

    /* renamed from: P */
    public final long m22598P() {
        zzk zzkVar = new zzk();
        m22580l(new C7521i(this, zzkVar));
        Long l = (Long) zzk.m22442P(zzkVar.m22443E0(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f28404i.mo14608a()).nextLong();
        int i2 = this.f28408m + 1;
        this.f28408m = i2;
        return jNextLong + i2;
    }

    /* renamed from: Q */
    public final String m22599Q() {
        zzk zzkVar = new zzk();
        m22580l(new C7515h(this, zzkVar));
        return zzkVar.m22445k0(500L);
    }

    /* renamed from: T */
    public final String m22600T() {
        zzk zzkVar = new zzk();
        m22580l(new C7533k(this, zzkVar));
        return zzkVar.m22445k0(500L);
    }

    /* renamed from: V */
    public final String m22601V() {
        return this.f28410o;
    }

    /* renamed from: a */
    public final Bundle m22602a(Bundle bundle, boolean z) {
        zzk zzkVar = new zzk();
        m22580l(new C7539l(this, bundle, zzkVar));
        if (z) {
            return zzkVar.m22443E0(5000L);
        }
        return null;
    }

    /* renamed from: b */
    protected final zzm m22603b(Context context, boolean z) {
        try {
            return zzl.asInterface(DynamiteModule.m14714e(context, z ? DynamiteModule.f18043f : DynamiteModule.f18039b, ModuleDescriptor.MODULE_ID).m14723d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e2) {
            m22583p(e2, true, false);
            return null;
        }
    }

    /* renamed from: f */
    public final AppMeasurementSdk m22604f() {
        return this.f28406k;
    }

    /* renamed from: h */
    public final Map<String, Object> m22605h(String str, String str2, boolean z) {
        zzk zzkVar = new zzk();
        m22580l(new C7527j(this, str, str2, z, zzkVar));
        Bundle bundleM22443E0 = zzkVar.m22443E0(5000L);
        if (bundleM22443E0 == null || bundleM22443E0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleM22443E0.size());
        for (String str3 : bundleM22443E0.keySet()) {
            Object obj = bundleM22443E0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* renamed from: i */
    public final void m22606i(int i2, String str, Object obj, Object obj2, Object obj3) {
        m22580l(new C7545m(this, false, 5, str, obj, null, null));
    }

    /* renamed from: j */
    public final void m22607j(Activity activity, String str, String str2) {
        m22580l(new C7485c(this, activity, str, str2));
    }

    /* renamed from: k */
    public final void m22608k(Bundle bundle) {
        m22580l(new C7581s(this, bundle));
    }

    /* renamed from: o */
    public final void m22609o(zzha zzhaVar) {
        Preconditions.m14372k(zzhaVar);
        m22580l(new C7557o(this, zzhaVar));
    }

    /* renamed from: q */
    public final void m22610q(String str, Bundle bundle) {
        m22584t(null, str, bundle, false, true, null);
    }

    /* renamed from: r */
    public final void m22611r(String str, String str2) {
        m22585v(null, str, str2, false);
    }

    /* renamed from: s */
    public final void m22612s(String str, String str2, Bundle bundle) {
        m22584t(str, str2, bundle, true, true, null);
    }

    /* renamed from: u */
    public final void m22613u(String str, String str2, Object obj) {
        m22585v(str, str2, obj, true);
    }
}
