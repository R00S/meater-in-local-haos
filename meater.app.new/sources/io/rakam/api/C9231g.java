package io.rakam.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.location.Location;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import java.lang.Thread;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RakamClient.java */
/* renamed from: io.rakam.api.g */
/* loaded from: classes.dex */
public class C9231g {

    /* renamed from: a */
    public static final MediaType f35655a = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: b */
    private static final C9232h f35656b = C9232h.m29964d();

    /* renamed from: A */
    private long f35657A;

    /* renamed from: B */
    private long f35658B;

    /* renamed from: C */
    private boolean f35659C;

    /* renamed from: D */
    private int f35660D;

    /* renamed from: E */
    private boolean f35661E;

    /* renamed from: F */
    private boolean f35662F;

    /* renamed from: G */
    private boolean f35663G;

    /* renamed from: H */
    private JSONObject f35664H;

    /* renamed from: I */
    private boolean f35665I;

    /* renamed from: J */
    private AtomicBoolean f35666J;

    /* renamed from: K */
    AtomicBoolean f35667K;

    /* renamed from: L */
    Throwable f35668L;

    /* renamed from: M */
    private String f35669M;

    /* renamed from: N */
    HandlerThreadC9235k f35670N;

    /* renamed from: O */
    HandlerThreadC9235k f35671O;

    /* renamed from: c */
    protected Context f35672c;

    /* renamed from: d */
    protected OkHttpClient f35673d;

    /* renamed from: e */
    protected C9226b f35674e;

    /* renamed from: f */
    protected String f35675f;

    /* renamed from: g */
    protected String f35676g;

    /* renamed from: h */
    protected String f35677h;

    /* renamed from: i */
    protected String f35678i;

    /* renamed from: j */
    private boolean f35679j;

    /* renamed from: k */
    private boolean f35680k;

    /* renamed from: l */
    protected boolean f35681l;

    /* renamed from: m */
    private boolean f35682m;

    /* renamed from: n */
    private boolean f35683n;

    /* renamed from: o */
    C9233i f35684o;

    /* renamed from: p */
    protected String f35685p;

    /* renamed from: q */
    long f35686q;

    /* renamed from: r */
    long f35687r;

    /* renamed from: s */
    long f35688s;

    /* renamed from: t */
    long f35689t;

    /* renamed from: u */
    long f35690u;

    /* renamed from: v */
    private C9228d f35691v;

    /* renamed from: w */
    private int f35692w;

    /* renamed from: x */
    private int f35693x;

    /* renamed from: y */
    private int f35694y;

    /* renamed from: z */
    private long f35695z;

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9231g f35696f;

        /* renamed from: g */
        final /* synthetic */ boolean f35697g;

        /* renamed from: h */
        final /* synthetic */ String f35698h;

        a(C9231g c9231g, boolean z, String str) {
            this.f35696f = c9231g;
            this.f35697g = z;
            this.f35698h = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (C9234j.m29988d(this.f35696f.f35675f)) {
                return;
            }
            if (this.f35697g && C9231g.this.f35662F) {
                C9231g.this.m29900S("_session_end");
            }
            C9231g c9231g = this.f35696f;
            String str = this.f35698h;
            c9231g.f35677h = str;
            C9231g.this.f35674e.m29818Y(TimeLineFollowFragment.BundleKeys.USER_ID, str);
            if (this.f35697g) {
                long jM29961u = C9231g.this.m29961u();
                C9231g.this.m29903b0(jM29961u);
                C9231g.this.m29939N(jM29961u);
                if (C9231g.this.f35662F) {
                    C9231g.this.m29900S("_session_start");
                }
            }
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9231g f35700f;

        /* renamed from: g */
        final /* synthetic */ String f35701g;

        b(C9231g c9231g, String str) {
            this.f35700f = c9231g;
            this.f35701g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C9234j.m29988d(this.f35700f.f35675f)) {
                return;
            }
            C9231g c9231g = this.f35700f;
            String str = this.f35701g;
            c9231g.f35678i = str;
            C9231g.this.m29899Q(str);
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$c */
    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9231g.this.f35666J.set(false);
            C9231g.this.m29957l0();
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$d */
    /* loaded from: classes2.dex */
    class d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f35704f;

        /* renamed from: g */
        final /* synthetic */ long f35705g;

        /* renamed from: h */
        final /* synthetic */ long f35706h;

        d(String str, long j2, long j3) {
            this.f35704f = str;
            this.f35705g = j2;
            this.f35706h = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9231g c9231g = C9231g.this;
            c9231g.m29937I(c9231g.f35673d, this.f35704f, this.f35705g, this.f35706h);
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$e */
    /* loaded from: classes2.dex */
    class e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f35708f;

        /* renamed from: g */
        final /* synthetic */ long f35709g;

        /* compiled from: RakamClient.java */
        /* renamed from: io.rakam.api.g$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C9231g c9231g = C9231g.this;
                c9231g.m29958m0(c9231g.f35659C);
            }
        }

        e(long j2, long j3) {
            this.f35708f = j2;
            this.f35709g = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j2 = this.f35708f;
            if (j2 >= 0) {
                C9231g.this.f35674e.m29827m0(j2);
            }
            long j3 = this.f35709g;
            if (j3 >= 0) {
                C9231g.this.f35674e.m29829q0(j3);
            }
            C9231g.this.f35667K.set(false);
            if (C9231g.this.f35674e.m29812J() > C9231g.this.f35692w) {
                C9231g.this.f35670N.m29992a(new a());
                return;
            }
            C9231g.this.f35659C = false;
            C9231g c9231g = C9231g.this;
            c9231g.f35660D = c9231g.f35693x;
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$f */
    /* loaded from: classes2.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9231g.this.f35667K.set(false);
            C9231g.this.m29958m0(true);
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$g */
    /* loaded from: classes2.dex */
    class g implements Thread.UncaughtExceptionHandler {
        g() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C9231g.f35656b.m29967c("RakamClient", "Unknown exception thrown from log thread.", th);
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$h */
    /* loaded from: classes2.dex */
    class h implements Thread.UncaughtExceptionHandler {
        h() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C9231g.f35656b.m29967c("RakamClient", "Unknown exception thrown from HTTP thread.", th);
        }
    }

    /* compiled from: RakamClient.java */
    /* renamed from: io.rakam.api.g$i */
    /* loaded from: classes2.dex */
    class i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f35715f;

        /* renamed from: g */
        final /* synthetic */ boolean f35716g;

        /* renamed from: h */
        final /* synthetic */ String f35717h;

        /* renamed from: i */
        final /* synthetic */ String f35718i;

        /* renamed from: j */
        final /* synthetic */ C9231g f35719j;

        /* compiled from: RakamClient.java */
        /* renamed from: io.rakam.api.g$i$a */
        class a implements InterfaceC9227c {
            a() {
            }

            @Override // io.rakam.api.InterfaceC9227c
            /* renamed from: a */
            public void mo29834a(SQLiteDatabase sQLiteDatabase) throws StackOverflowError, SQLiteException {
                i iVar = i.this;
                C9231g.this.f35674e.m29819Z(sQLiteDatabase, AccountAnalytics.STORE, "device_id", iVar.f35719j.f35678i);
                i iVar2 = i.this;
                C9231g.this.f35674e.m29819Z(sQLiteDatabase, AccountAnalytics.STORE, TimeLineFollowFragment.BundleKeys.USER_ID, iVar2.f35719j.f35677h);
                i iVar3 = i.this;
                C9231g.this.f35674e.m29819Z(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(iVar3.f35719j.f35682m ? 1L : 0L));
                i iVar4 = i.this;
                C9231g.this.f35674e.m29819Z(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(iVar4.f35719j.f35686q));
                i iVar5 = i.this;
                C9231g.this.f35674e.m29819Z(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(iVar5.f35719j.f35689t));
            }
        }

        i(Context context, boolean z, String str, String str2, C9231g c9231g) {
            this.f35715f = context;
            this.f35716g = z;
            this.f35717h = str;
            this.f35718i = str2;
            this.f35719j = c9231g;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9231g c9231g = C9231g.this;
            if (c9231g.f35681l) {
                return;
            }
            try {
                if (c9231g.f35676g.equals("$default_instance")) {
                    C9231g.m29920o0(this.f35715f);
                    C9231g.m29924q0(this.f35715f);
                }
                C9231g.this.f35673d = new OkHttpClient();
                C9231g.this.f35691v = new C9228d(this.f35715f);
                C9231g c9231g2 = C9231g.this;
                c9231g2.f35678i = c9231g2.m29893C();
                if (this.f35716g) {
                    C9229e c9229eM29884e = C9229e.m29884e();
                    C9231g c9231g3 = C9231g.this;
                    c9229eM29884e.m29885c(c9231g3.f35673d, this.f35717h, c9231g3.f35678i);
                }
                C9231g.this.f35691v.m29853s();
                String str = this.f35718i;
                if (str != null) {
                    this.f35719j.f35677h = str;
                    C9231g.this.f35674e.m29818Y(TimeLineFollowFragment.BundleKeys.USER_ID, str);
                } else {
                    this.f35719j.f35677h = C9231g.this.f35674e.m29813K(TimeLineFollowFragment.BundleKeys.USER_ID);
                }
                Long lM29809B = C9231g.this.f35674e.m29809B("opt_out");
                C9231g.this.f35682m = lM29809B != null && lM29809B.longValue() == 1;
                C9231g c9231g4 = C9231g.this;
                c9231g4.f35690u = c9231g4.m29929w("previous_session_id", -1L);
                C9231g c9231g5 = C9231g.this;
                long j2 = c9231g5.f35690u;
                if (j2 >= 0) {
                    c9231g5.f35686q = j2;
                }
                c9231g5.f35687r = c9231g5.m29929w("last_event_id", -1L);
                C9231g c9231g6 = C9231g.this;
                c9231g6.f35688s = c9231g6.m29929w("last_identify_id", -1L);
                C9231g c9231g7 = C9231g.this;
                c9231g7.f35689t = c9231g7.m29929w("last_event_time", -1L);
                C9231g.this.f35674e.m29831x0(new a());
                C9231g c9231g8 = C9231g.this;
                c9231g8.f35681l = true;
                String strM29813K = c9231g8.f35674e.m29813K("super_properties");
                if (strM29813K != null) {
                    try {
                        C9231g.this.f35664H = new JSONObject(strM29813K);
                    } catch (JSONException unused) {
                        C9231g.this.f35674e.m29818Y("super_properties", null);
                    }
                }
            } catch (CursorWindowAllocationException e2) {
                C9231g.f35656b.m29966b("RakamClient", String.format("Failed to initialize Rakam SDK due to: %s", e2.getMessage()));
                C9229e.m29884e().m29888g("Failed to initialize Rakam SDK", e2);
                this.f35719j.f35675f = null;
            }
        }
    }

    public C9231g() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public String m29893C() {
        Set<String> setM29928v = m29928v();
        String strM29813K = this.f35674e.m29813K("device_id");
        String strM29987c = C9234j.m29987c(this.f35672c, this.f35676g, "device_id");
        if (!C9234j.m29988d(strM29813K) && !setM29928v.contains(strM29813K)) {
            if (!strM29813K.equals(strM29987c)) {
                m29899Q(strM29813K);
            }
            return strM29813K;
        }
        if (!C9234j.m29988d(strM29987c) && !setM29928v.contains(strM29987c)) {
            m29899Q(strM29987c);
            return strM29987c;
        }
        if (!this.f35679j && this.f35680k && !this.f35691v.m29851q()) {
            String strM29838c = this.f35691v.m29838c();
            if (!C9234j.m29988d(strM29838c) && !setM29928v.contains(strM29838c)) {
                m29899Q(strM29838c);
                return strM29838c;
            }
        }
        String str = C9228d.m29836b() + "R";
        m29899Q(str);
        return str;
    }

    /* renamed from: D */
    private boolean m29894D(long j2) {
        return j2 - this.f35689t < (this.f35661E ? this.f35657A : this.f35658B);
    }

    /* renamed from: K */
    private static void m29895K(SharedPreferences sharedPreferences, String str, boolean z, C9226b c9226b, String str2) {
        if (c9226b.m29809B(str2) != null) {
            return;
        }
        c9226b.m29817W(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1L : 0L));
        sharedPreferences.edit().remove(str).apply();
    }

    /* renamed from: L */
    private static void m29896L(SharedPreferences sharedPreferences, String str, long j2, C9226b c9226b, String str2) {
        if (c9226b.m29809B(str2) != null) {
            return;
        }
        c9226b.m29817W(str2, Long.valueOf(sharedPreferences.getLong(str, j2)));
        sharedPreferences.edit().remove(str).apply();
    }

    /* renamed from: M */
    private static void m29897M(SharedPreferences sharedPreferences, String str, String str2, C9226b c9226b, String str3) {
        if (C9234j.m29988d(c9226b.m29813K(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (C9234j.m29988d(string)) {
                return;
            }
            c9226b.m29818Y(str3, string);
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* renamed from: P */
    private void m29898P(Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        HandlerThreadC9235k handlerThreadC9235k = this.f35670N;
        if (threadCurrentThread != handlerThreadC9235k) {
            handlerThreadC9235k.m29992a(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m29899Q(String str) {
        this.f35674e.m29818Y("device_id", str);
        C9234j.m29990f(this.f35672c, this.f35676g, "device_id", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m29900S(String str) throws JSONException {
        if (m29959s(String.format("sendSessionEvent('%s')", str)) && m29930y()) {
            m29933E(str, null, this.f35689t, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m29903b0(long j2) {
        this.f35686q = j2;
        m29949a0(j2);
    }

    /* renamed from: f0 */
    private void m29908f0(long j2) {
        if (this.f35662F) {
            m29900S("_session_end");
        }
        m29903b0(j2);
        m29939N(j2);
        if (this.f35662F) {
            m29900S("_session_start");
        }
    }

    /* renamed from: i0 */
    static String m29912i0(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    /* renamed from: n0 */
    private void m29918n0(long j2) {
        if (this.f35666J.getAndSet(true)) {
            return;
        }
        this.f35670N.m29993b(new c(), j2);
    }

    /* renamed from: o0 */
    static boolean m29920o0(Context context) {
        return m29922p0(context, null, null);
    }

    /* renamed from: p0 */
    static boolean m29922p0(Context context, String str, String str2) {
        if (str == null) {
            try {
                str = C9225a.class.getPackage().getName();
            } catch (Exception unused) {
                str = "io.rakam.api";
            }
        }
        if (str2 == null) {
            str2 = "io.rakam.api";
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            String str3 = str + "." + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str3, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str4 = str2 + "." + context.getPackageName();
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str4, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                editorEdit.putLong("io.rakam.api.previousSessionId", sharedPreferences.getLong(str + ".previousSessionId", -1L));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                editorEdit.putString("io.rakam.api.deviceId", sharedPreferences.getString(str + ".deviceId", null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                editorEdit.putString("io.rakam.api.userId", sharedPreferences.getString(str + ".userId", null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                editorEdit.putBoolean("io.rakam.api.optOut", sharedPreferences.getBoolean(str + ".optOut", false));
            }
            editorEdit.apply();
            sharedPreferences.edit().clear().apply();
            f35656b.m29968e("RakamClient", "Upgraded shared preferences from " + str3 + " to " + str4);
            return true;
        } catch (Exception e2) {
            f35656b.m29967c("RakamClient", "Error upgrading shared preferences", e2);
            C9229e.m29884e().m29888g("Failed to upgrade shared prefs", e2);
            return false;
        }
    }

    /* renamed from: q0 */
    static boolean m29924q0(Context context) {
        return m29926r0(context, null);
    }

    /* renamed from: r0 */
    static boolean m29926r0(Context context, String str) {
        if (str == null) {
            str = "io.rakam.api";
        }
        C9226b c9226bM29802j = C9226b.m29802j(context);
        String strM29813K = c9226bM29802j.m29813K("device_id");
        Long lM29809B = c9226bM29802j.m29809B("previous_session_id");
        Long lM29809B2 = c9226bM29802j.m29809B("last_event_time");
        if (!C9234j.m29988d(strM29813K) && lM29809B != null && lM29809B2 != null) {
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str + "." + context.getPackageName(), 0);
        m29897M(sharedPreferences, "io.rakam.api.deviceId", null, c9226bM29802j, "device_id");
        m29896L(sharedPreferences, "io.rakam.api.lastEventTime", -1L, c9226bM29802j, "last_event_time");
        m29896L(sharedPreferences, "io.rakam.api.lastEventId", -1L, c9226bM29802j, "last_event_id");
        m29896L(sharedPreferences, "io.rakam.api.lastIdentifyId", -1L, c9226bM29802j, "last_identify_id");
        m29896L(sharedPreferences, "io.rakam.api.previousSessionId", -1L, c9226bM29802j, "previous_session_id");
        m29897M(sharedPreferences, "io.rakam.api.userId", null, c9226bM29802j, TimeLineFollowFragment.BundleKeys.USER_ID);
        m29895K(sharedPreferences, "io.rakam.api.optOut", false, c9226bM29802j, "opt_out");
        return true;
    }

    /* renamed from: t */
    private JSONObject m29927t() throws JSONException {
        return new JSONObject().put("api_key", this.f35675f).put("library", new JSONObject().put("name", "rakam-android").put("version", "2.7.14")).put("upload_time", m29961u());
    }

    /* renamed from: v */
    private Set<String> m29928v() {
        HashSet hashSet = new HashSet();
        hashSet.add(HttpUrl.FRAGMENT_ENCODE_SET);
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public long m29929w(String str, long j2) {
        Long lM29809B = this.f35674e.m29809B(str);
        return lM29809B == null ? j2 : lM29809B.longValue();
    }

    /* renamed from: y */
    private boolean m29930y() {
        return this.f35686q >= 0;
    }

    /* renamed from: A */
    public synchronized C9231g m29931A(Context context, URL url, String str, String str2) {
        return m29932B(context, url, str, str2, null, true);
    }

    /* renamed from: B */
    public synchronized C9231g m29932B(Context context, URL url, String str, String str2, String str3, boolean z) {
        if (context == null) {
            f35656b.m29966b("RakamClient", "Argument context cannot be null in initialize()");
            return this;
        }
        m29942T(url);
        if (TextUtils.isEmpty(str)) {
            f35656b.m29966b("RakamClient", "Argument apiKey cannot be null or blank in initialize()");
            return this;
        }
        Context applicationContext = context.getApplicationContext();
        this.f35672c = applicationContext;
        this.f35675f = str;
        this.f35674e = C9226b.m29803k(applicationContext, this.f35676g);
        if (C9234j.m29988d(str3)) {
            str3 = "Android";
        }
        this.f35685p = str3;
        m29898P(new i(context, z, str, str2, this));
        return this;
    }

    /* renamed from: E */
    protected long m29933E(String str, JSONObject jSONObject, long j2, boolean z) throws JSONException {
        Location locationM29846l;
        f35656b.m29965a("RakamClient", "Logged event to Rakam: " + str);
        if (this.f35682m) {
            return -1L;
        }
        if (!(this.f35662F && (str.equals("_session_start") || str.equals("_session_end"))) && !z) {
            if (this.f35663G) {
                m29939N(j2);
            } else {
                m29953g0(j2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("_id", UUID.randomUUID().toString());
            jSONObject2.put("_local_id", this.f35687r);
            jSONObject2.put("_time", j2);
            jSONObject2.put("_user", m29940O(this.f35677h));
            jSONObject2.put("_device_id", m29940O(this.f35678i));
            jSONObject2.put("_session_id", z ? -1L : this.f35686q);
            if (this.f35684o.m29984m()) {
                jSONObject2.put("_version_name", m29940O(this.f35691v.m29849o()));
            }
            if (this.f35684o.m29981j()) {
                jSONObject2.put("_os_name", m29940O(this.f35691v.m29847m()));
            }
            if (this.f35684o.m29982k()) {
                jSONObject2.put("_os_version", m29940O(this.f35691v.m29848n()));
            }
            if (this.f35684o.m29976d()) {
                jSONObject2.put("_device_brand", m29940O(this.f35691v.m29839d()));
            }
            if (this.f35684o.m29977e()) {
                jSONObject2.put("_device_manufacturer", m29940O(this.f35691v.m29844j()));
            }
            if (this.f35684o.m29978f()) {
                jSONObject2.put("_device_model", m29940O(this.f35691v.m29845k()));
            }
            if (this.f35684o.m29974b()) {
                jSONObject2.put("_carrier", m29940O(this.f35691v.m29840f()));
            }
            if (this.f35684o.m29975c()) {
                jSONObject2.put("_country_code", m29940O(this.f35691v.m29841g()));
            }
            if (this.f35684o.m29979h()) {
                jSONObject2.put("_language", m29940O(this.f35691v.m29843i()));
            }
            if (this.f35684o.m29983l()) {
                jSONObject2.put("_platform", this.f35685p);
            }
            jSONObject2.put("_library_name", "rakam-android");
            jSONObject2.put("_library_version", "2.7.14");
            jSONObject2.put("_ip", true);
            if (this.f35684o.m29980i() && (locationM29846l = this.f35691v.m29846l()) != null) {
                jSONObject2.put("_latitude", locationM29846l.getLatitude());
                jSONObject2.put("_longitude", locationM29846l.getLongitude());
            }
            if (this.f35684o.m29973a() && this.f35691v.m29838c() != null) {
                jSONObject2.put("_android_adid", this.f35691v.m29838c());
            }
            jSONObject2.put("_limit_ad_tracking", this.f35691v.m29851q());
            jSONObject2.put("_gps_enabled", this.f35691v.m29850p());
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObject3 = this.f35664H;
            if (jSONObject3 != null) {
                Iterator<String> itKeys2 = jSONObject3.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (jSONObject == null || !jSONObject.has(next2)) {
                        jSONObject2.put(next2, this.f35664H.get(next2));
                    }
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("properties", m29956k0(jSONObject2));
            jSONObject4.put("collection", m29940O(str));
            return m29941R(str, jSONObject4);
        } catch (JSONException e2) {
            f35656b.m29966b("RakamClient", String.format("JSON Serialization of event type %s failed, skipping: %s", str, e2.toString()));
            C9229e.m29884e().m29888g(String.format("Failed to JSON serialize event type %s", str), e2);
            return -1L;
        }
    }

    /* renamed from: F */
    public void m29934F(String str) throws JSONException {
        m29935G(str, null);
    }

    /* renamed from: G */
    public void m29935G(String str, JSONObject jSONObject) throws JSONException {
        m29936H(str, jSONObject, false);
    }

    /* renamed from: H */
    public void m29936H(String str, JSONObject jSONObject, boolean z) throws JSONException {
        if (m29960s0(str)) {
            m29933E(str, jSONObject, m29961u(), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m29937I(okhttp3.OkHttpClient r15, java.lang.String r16, long r17, long r19) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.C9231g.m29937I(okhttp3.OkHttpClient, java.lang.String, long, long):void");
    }

    /* renamed from: J */
    protected Pair<Pair<Long, Long>, JSONArray> m29938J(List<JSONObject> list, List<JSONObject> list2, long j2) throws JSONException {
        long j3;
        long j4;
        JSONArray jSONArray = new JSONArray();
        long j5 = -1;
        long j6 = -1;
        while (true) {
            if (jSONArray.length() >= j2) {
                break;
            }
            boolean zIsEmpty = list.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            if (zIsEmpty && zIsEmpty2) {
                f35656b.m29970g("RakamClient", String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", Long.valueOf(j2 - jSONArray.length())));
                break;
            }
            if (zIsEmpty2) {
                JSONObject jSONObjectRemove = list.remove(0);
                j3 = jSONObjectRemove.getLong("event_id");
                jSONArray.put(jSONObjectRemove);
            } else {
                if (zIsEmpty) {
                    JSONObject jSONObjectRemove2 = list2.remove(0);
                    j4 = jSONObjectRemove2.getLong("event_id");
                    jSONArray.put(jSONObjectRemove2);
                } else if (!list.get(0).has("event_id") || list.get(0).getLong("event_id") < list2.get(0).getLong("event_id")) {
                    JSONObject jSONObjectRemove3 = list.remove(0);
                    j3 = jSONObjectRemove3.getLong("event_id");
                    jSONArray.put(jSONObjectRemove3);
                } else {
                    JSONObject jSONObjectRemove4 = list2.remove(0);
                    j4 = jSONObjectRemove4.getLong("event_id");
                    jSONArray.put(jSONObjectRemove4);
                }
                j6 = j4;
            }
            j5 = j3;
        }
        return new Pair<>(new Pair(Long.valueOf(j5), Long.valueOf(j6)), jSONArray);
    }

    /* renamed from: N */
    void m29939N(long j2) {
        if (m29930y()) {
            m29946X(j2);
        }
    }

    /* renamed from: O */
    protected Object m29940O(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    /* renamed from: R */
    protected long m29941R(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        if (C9234j.m29988d(string)) {
            f35656b.m29966b("RakamClient", String.format("Detected empty event string for event type %s, skipping", str));
            return -1L;
        }
        if (str.equals("$identify")) {
            long jM29822c = this.f35674e.m29822c(string);
            this.f35688s = jM29822c;
            m29947Y(jM29822c);
        } else {
            long jM29820a = this.f35674e.m29820a(string);
            this.f35687r = jM29820a;
            m29945W(jM29820a);
        }
        int iMin = Math.min(Math.max(1, this.f35694y / 10), 20);
        if (this.f35674e.m29826m() > this.f35694y) {
            C9226b c9226b = this.f35674e;
            c9226b.m29827m0(c9226b.m29810D(iMin));
        }
        if (this.f35674e.m29833z() > this.f35694y) {
            C9226b c9226b2 = this.f35674e;
            c9226b2.m29829q0(c9226b2.m29811I(iMin));
        }
        long jM29812J = this.f35674e.m29812J();
        int i2 = this.f35692w;
        if (jM29812J % i2 != 0 || jM29812J < i2) {
            m29918n0(this.f35695z);
        } else {
            m29957l0();
        }
        return str.equals("$identify") ? this.f35688s : this.f35687r;
    }

    /* renamed from: T */
    public void m29942T(URL url) {
        if (url == null) {
            f35656b.m29966b("RakamClient", "apiUrl can't be null");
            return;
        }
        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        String str = protocol + "://" + host;
        if (url.getPath() != null && !url.getPath().equals("/") && !url.getPath().isEmpty()) {
            throw new IllegalStateException(String.format("Please set root address of the API address. A valid example is %s, %s is not valid.", str, url.toString()));
        }
        if (port > -1) {
            str = str + ":" + port;
        }
        this.f35669M = str;
    }

    /* renamed from: U */
    public C9231g m29943U(String str) {
        Set<String> setM29928v = m29928v();
        if (m29959s("setDeviceId()") && !C9234j.m29988d(str) && !setM29928v.contains(str)) {
            m29898P(new b(this, str));
        }
        return this;
    }

    /* renamed from: V */
    public C9231g m29944V(int i2) {
        this.f35695z = i2;
        return this;
    }

    /* renamed from: W */
    void m29945W(long j2) {
        this.f35687r = j2;
        this.f35674e.m29817W("last_event_id", Long.valueOf(j2));
    }

    /* renamed from: X */
    void m29946X(long j2) {
        this.f35689t = j2;
        this.f35674e.m29817W("last_event_time", Long.valueOf(j2));
    }

    /* renamed from: Y */
    void m29947Y(long j2) {
        this.f35688s = j2;
        this.f35674e.m29817W("last_identify_id", Long.valueOf(j2));
    }

    /* renamed from: Z */
    public C9231g m29948Z(int i2) {
        f35656b.m29969f(i2);
        return this;
    }

    /* renamed from: a0 */
    void m29949a0(long j2) {
        this.f35690u = j2;
        this.f35674e.m29817W("previous_session_id", Long.valueOf(j2));
    }

    /* renamed from: c0 */
    public C9231g m29950c0(JSONObject jSONObject) {
        this.f35664H = jSONObject;
        this.f35674e.m29818Y("super_properties", jSONObject.toString());
        return this;
    }

    /* renamed from: d0 */
    public C9231g m29951d0(String str) {
        return m29952e0(str, false);
    }

    /* renamed from: e0 */
    public C9231g m29952e0(String str, boolean z) {
        if (!m29959s("setUserId()")) {
            return this;
        }
        m29898P(new a(this, z, str));
        return this;
    }

    /* renamed from: g0 */
    public boolean m29953g0(long j2) {
        if (m29930y()) {
            if (m29894D(j2)) {
                m29939N(j2);
                return false;
            }
            m29908f0(j2);
            return true;
        }
        if (!m29894D(j2)) {
            m29908f0(j2);
            return true;
        }
        long j3 = this.f35690u;
        if (j3 == -1) {
            m29908f0(j2);
            return true;
        }
        m29903b0(j3);
        m29939N(j2);
        return false;
    }

    /* renamed from: h0 */
    public C9231g m29954h0(boolean z) {
        this.f35662F = z;
        return this;
    }

    /* renamed from: j0 */
    public JSONArray m29955j0(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i2, m29912i0((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i2, m29956k0((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i2, m29955j0((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    /* renamed from: k0 */
    public JSONObject m29956k0(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            f35656b.m29970g("RakamClient", "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj.getClass().equals(String.class)) {
                    jSONObject.put(next, m29912i0((String) obj));
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(next, m29956k0((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    jSONObject.put(next, m29955j0((JSONArray) obj));
                }
            } catch (JSONException e2) {
                f35656b.m29966b("RakamClient", e2.toString());
            }
        }
        return jSONObject;
    }

    /* renamed from: l0 */
    protected void m29957l0() {
        m29958m0(false);
        C9229e.m29884e().m29886d();
    }

    /* renamed from: m0 */
    protected void m29958m0(boolean z) {
        if (this.f35682m || this.f35683n || this.f35667K.getAndSet(true)) {
            return;
        }
        long jMin = Math.min(z ? this.f35660D : this.f35693x, this.f35674e.m29812J());
        if (jMin <= 0) {
            this.f35667K.set(false);
            return;
        }
        try {
            try {
                Pair<Pair<Long, Long>, JSONArray> pairM29938J = m29938J(this.f35674e.m29830x(this.f35687r, jMin), this.f35674e.m29808A(this.f35688s, jMin), jMin);
                if (((JSONArray) pairM29938J.second).length() == 0) {
                    this.f35667K.set(false);
                    return;
                }
                try {
                    this.f35671O.m29992a(new d(new JSONObject().put("api", m29927t()).put("events", pairM29938J.second).toString(), ((Long) ((Pair) pairM29938J.first).first).longValue(), ((Long) ((Pair) pairM29938J.first).second).longValue()));
                } catch (JSONException e2) {
                    this.f35667K.set(false);
                    f35656b.m29966b("RakamClient", e2.toString());
                }
            } catch (CursorWindowAllocationException e3) {
                this.f35667K.set(false);
                f35656b.m29966b("RakamClient", String.format("Caught Cursor window exception during event upload, deferring upload: %s", e3.getMessage()));
                C9229e.m29884e().m29888g("Failed to update server", e3);
            }
        } catch (JSONException e4) {
            this.f35667K.set(false);
            f35656b.m29966b("RakamClient", e4.toString());
            C9229e.m29884e().m29888g("Failed to update server", e4);
        }
    }

    /* renamed from: s */
    protected synchronized boolean m29959s(String str) {
        if (this.f35672c == null) {
            f35656b.m29966b("RakamClient", "context cannot be null, set context with initialize() before calling " + str);
            return false;
        }
        if (!TextUtils.isEmpty(this.f35675f)) {
            return true;
        }
        f35656b.m29966b("RakamClient", "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
        return false;
    }

    /* renamed from: s0 */
    protected boolean m29960s0(String str) {
        if (!TextUtils.isEmpty(str)) {
            return m29959s("logEvent()");
        }
        f35656b.m29966b("RakamClient", "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }

    /* renamed from: u */
    protected long m29961u() {
        return System.currentTimeMillis();
    }

    /* renamed from: x */
    public JSONObject m29962x() {
        return C9234j.m29985a(this.f35664H);
    }

    /* renamed from: z */
    public C9231g m29963z(Context context, URL url, String str) {
        return m29931A(context, url, str, null);
    }

    public C9231g(String str) {
        this.f35679j = false;
        this.f35680k = false;
        this.f35681l = false;
        this.f35682m = false;
        this.f35683n = false;
        this.f35684o = new C9233i();
        this.f35686q = -1L;
        this.f35687r = -1L;
        this.f35688s = -1L;
        this.f35689t = -1L;
        this.f35690u = -1L;
        this.f35692w = 30;
        this.f35693x = 100;
        this.f35694y = 1000;
        this.f35695z = 30000L;
        this.f35657A = LocalNotificationSyncManager.FIVE_MINUTES;
        this.f35658B = BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS;
        this.f35659C = false;
        this.f35660D = 100;
        this.f35661E = false;
        this.f35662F = false;
        this.f35663G = false;
        this.f35665I = true;
        this.f35666J = new AtomicBoolean(false);
        this.f35667K = new AtomicBoolean(false);
        this.f35670N = new HandlerThreadC9235k("logThread");
        this.f35671O = new HandlerThreadC9235k("httpThread");
        this.f35676g = C9234j.m29989e(str);
        this.f35670N.start();
        this.f35671O.start();
        this.f35670N.setUncaughtExceptionHandler(new g());
        this.f35671O.setUncaughtExceptionHandler(new h());
    }
}
