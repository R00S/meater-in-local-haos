package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.measurement.internal.C2843t3;
import g7.C3445p;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import n3.AbstractC4060a;
import oa.C4153F;
import s.C4391a;
import v7.C4901c;
import v7.C4919v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2843t3 extends B1 {

    /* renamed from: c, reason: collision with root package name */
    private C2726c4 f35644c;

    /* renamed from: d, reason: collision with root package name */
    private v7.I f35645d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<v7.K> f35646e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35647f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<String> f35648g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f35649h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f35650i;

    /* renamed from: j, reason: collision with root package name */
    private int f35651j;

    /* renamed from: k, reason: collision with root package name */
    private A f35652k;

    /* renamed from: l, reason: collision with root package name */
    private A f35653l;

    /* renamed from: m, reason: collision with root package name */
    private PriorityQueue<C2797m5> f35654m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35655n;

    /* renamed from: o, reason: collision with root package name */
    private C2823q3 f35656o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f35657p;

    /* renamed from: q, reason: collision with root package name */
    private long f35658q;

    /* renamed from: r, reason: collision with root package name */
    final W5 f35659r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f35660s;

    /* renamed from: t, reason: collision with root package name */
    private A f35661t;

    /* renamed from: u, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f35662u;

    /* renamed from: v, reason: collision with root package name */
    private A f35663v;

    /* renamed from: w, reason: collision with root package name */
    private final S5 f35664w;

    protected C2843t3(P2 p22) {
        super(p22);
        this.f35646e = new CopyOnWriteArraySet();
        this.f35649h = new Object();
        this.f35650i = false;
        this.f35651j = 1;
        this.f35660s = true;
        this.f35664w = new V3(this);
        this.f35648g = new AtomicReference<>();
        this.f35656o = C2823q3.f35526c;
        this.f35658q = -1L;
        this.f35657p = new AtomicLong(0L);
        this.f35659r = new W5(p22);
    }

    static /* synthetic */ int E(C2843t3 c2843t3, Throwable th) {
        String message = th.getMessage();
        c2843t3.f35655n = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            c2843t3.f35655n = true;
        }
        return 1;
    }

    public static int G(String str) {
        C3445p.e(str);
        return 25;
    }

    private final void N(Bundle bundle, int i10, long j10) {
        z();
        String strH = C2823q3.h(bundle);
        if (strH != null) {
            k().N().b("Ignoring invalid consent setting", strH);
            k().N().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zL = o().L();
        C2823q3 c2823q3C = C2823q3.c(bundle, i10);
        if (c2823q3C.y()) {
            S(c2823q3C, zL);
        }
        C cB = C.b(bundle, i10);
        if (cB.k()) {
            Q(cB, zL);
        }
        Boolean boolE = C.e(bundle);
        if (boolE != null) {
            String str = i10 == -30 ? "tcf" : "app";
            if (zL) {
                o0(str, "allow_personalized_ads", boolE.toString(), j10);
            } else {
                q0(str, "allow_personalized_ads", boolE.toString(), false, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        n();
        String strA = h().f35609o.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                o0("app", "_npa", null, b().a());
            } else {
                o0("app", "_npa", Long.valueOf("true".equals(strA) ? 1L : 0L), b().a());
            }
        }
        if (!this.f35457a.s() || !this.f35660s) {
            k().G().a("Updating Scion state (FE)");
            v().k0();
        } else {
            k().G().a("Recording app launch after enabling measurement for the first time (FE)");
            H0();
            w().f35313e.a();
            o().E(new H3(this));
        }
    }

    public static /* synthetic */ void U(C2843t3 c2843t3, SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            c2843t3.k().L().a("IABTCF_TCString change picked up in listener.");
            ((A) C3445p.k(c2843t3.f35663v)).b(500L);
        }
    }

    public static /* synthetic */ void V(C2843t3 c2843t3, Bundle bundle) {
        Bundle bundle2;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle(c2843t3.h().f35596A.a());
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    c2843t3.j();
                    if (Q5.i0(obj)) {
                        c2843t3.j();
                        Q5.Z(c2843t3.f35664w, 27, null, null, 0);
                    }
                    c2843t3.k().N().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (Q5.H0(str)) {
                    c2843t3.k().N().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundle2.remove(str);
                } else if (c2843t3.j().m0("param", str, c2843t3.c().s(null, false), obj)) {
                    c2843t3.j().P(bundle2, str, obj);
                }
            }
            c2843t3.j();
            if (Q5.h0(bundle2, c2843t3.c().B())) {
                c2843t3.j();
                Q5.Z(c2843t3.f35664w, 26, null, null, 0);
                c2843t3.k().N().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        c2843t3.h().f35596A.b(bundle2);
        if (!bundle.isEmpty() || c2843t3.c().u(K.f34958Z0)) {
            c2843t3.v().E(bundle2);
        }
    }

    static /* synthetic */ void V0(C2843t3 c2843t3, int i10) {
        if (c2843t3.f35652k == null) {
            c2843t3.f35652k = new F3(c2843t3, c2843t3.f35457a);
        }
        c2843t3.f35652k.b(i10 * 1000);
    }

    public static /* synthetic */ void W(C2843t3 c2843t3, Bundle bundle, long j10) {
        if (TextUtils.isEmpty(c2843t3.q().J())) {
            c2843t3.N(bundle, 0, j10);
        } else {
            c2843t3.k().N().a("Using developer consent only; google app id found");
        }
    }

    static /* synthetic */ void W0(C2843t3 c2843t3, Bundle bundle) {
        c2843t3.n();
        c2843t3.z();
        C3445p.k(bundle);
        String strE = C3445p.e(bundle.getString("name"));
        if (!c2843t3.f35457a.s()) {
            c2843t3.k().L().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c2843t3.v().K(new C2749g(bundle.getString("app_id"), "", new P5(strE, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c2843t3.j().I(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void X(C2843t3 c2843t3, C2823q3 c2823q3, long j10, boolean z10, boolean z11) {
        c2843t3.n();
        c2843t3.z();
        C2823q3 c2823q3N = c2843t3.h().N();
        if (j10 <= c2843t3.f35658q && C2823q3.l(c2823q3N.b(), c2823q3.b())) {
            c2843t3.k().K().b("Dropped out-of-date consent setting, proposed settings", c2823q3);
            return;
        }
        if (!c2843t3.h().B(c2823q3)) {
            c2843t3.k().K().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c2823q3.b()));
            return;
        }
        c2843t3.k().L().b("Setting storage consent(FE)", c2823q3);
        c2843t3.f35658q = j10;
        if (c2843t3.v().o0()) {
            c2843t3.v().t0(z10);
        } else {
            c2843t3.v().b0(z10);
        }
        if (z11) {
            c2843t3.v().U(new AtomicReference<>());
        }
    }

    public static /* synthetic */ void Z(C2843t3 c2843t3, String str) {
        if (c2843t3.q().N(str)) {
            c2843t3.q().L();
        }
    }

    private final void Z0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        o().E(new I3(this, str, str2, j10, Q5.E(bundle), z10, z11, z12, str3));
    }

    public static /* synthetic */ void a0(C2843t3 c2843t3, List list) {
        c2843t3.n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayL = c2843t3.h().L();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2797m5 c2797m5 = (C2797m5) it.next();
                if (!sparseArrayL.contains(c2797m5.f35470D) || sparseArrayL.get(c2797m5.f35470D).longValue() < c2797m5.f35469C) {
                    c2843t3.F0().add(c2797m5);
                }
            }
            c2843t3.N0();
        }
    }

    public static /* synthetic */ void b0(C2843t3 c2843t3, AtomicReference atomicReference) {
        Bundle bundleA = c2843t3.h().f35610p.a();
        C2837s4 c2837s4V = c2843t3.v();
        if (bundleA == null) {
            bundleA = new Bundle();
        }
        c2837s4V.V(atomicReference, bundleA);
    }

    public static /* synthetic */ void c0(C2843t3 c2843t3, AtomicReference atomicReference, C2845t5 c2845t5, String str, int i10, Throwable th, byte[] bArr, Map map) {
        c2843t3.n();
        boolean z10 = (i10 == 200 || i10 == 204 || i10 == 304) && th == null;
        if (z10) {
            c2843t3.k().L().b("[sgtm] Upload succeeded for row_id", Long.valueOf(c2845t5.f35666B));
        } else {
            c2843t3.k().M().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c2845t5.f35666B), Integer.valueOf(i10), th);
        }
        c2843t3.v().J(new C2735e(c2845t5.f35666B, z10 ? v7.Y.SUCCESS.a() : v7.Y.FAILURE.a(), c2845t5.f35671G));
        c2843t3.k().L().c("[sgtm] Updated status for row_id", Long.valueOf(c2845t5.f35666B), z10 ? "SUCCESS" : "FAILURE");
        synchronized (atomicReference) {
            atomicReference.set(Boolean.valueOf(z10));
            atomicReference.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(Boolean bool, boolean z10) {
        n();
        z();
        k().G().b("Setting app measurement enabled (FE)", bool);
        h().w(bool);
        if (z10) {
            h().F(bool);
        }
        if (this.f35457a.t() || !(bool == null || bool.booleanValue())) {
            Q0();
        }
    }

    static /* synthetic */ void g1(C2843t3 c2843t3, Bundle bundle) {
        c2843t3.n();
        c2843t3.z();
        C3445p.k(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C3445p.e(string);
        C3445p.e(string2);
        C3445p.k(bundle.get("value"));
        if (!c2843t3.f35457a.s()) {
            c2843t3.k().L().a("Conditional property not set since app measurement is disabled");
            return;
        }
        P5 p52 = new P5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            J jI = c2843t3.j().I(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c2843t3.v().K(new C2749g(bundle.getString("app_id"), string2, p52, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2843t3.j().I(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), jI, bundle.getLong("time_to_live"), c2843t3.j().I(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void k0(String str, String str2, long j10, Object obj) {
        o().E(new L3(this, str, str2, obj, j10));
    }

    private final boolean t0(final C2845t5 c2845t5) throws MalformedURLException {
        try {
            URL url = new URI(c2845t5.f35668D).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strI = q().I();
            k().L().d("[sgtm] Uploading data from app. row_id, url, uncompressed size", Long.valueOf(c2845t5.f35666B), c2845t5.f35668D, Integer.valueOf(c2845t5.f35667C.length));
            if (!TextUtils.isEmpty(c2845t5.f35672H)) {
                k().L().c("[sgtm] Uploading data from app. row_id", Long.valueOf(c2845t5.f35666B), c2845t5.f35672H);
            }
            HashMap map = new HashMap();
            for (String str : c2845t5.f35669E.keySet()) {
                String string = c2845t5.f35669E.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            C2747f4 c2747f4I = i();
            byte[] bArr = c2845t5.f35667C;
            InterfaceC2740e4 interfaceC2740e4 = new InterfaceC2740e4() { // from class: com.google.android.gms.measurement.internal.y3
                @Override // com.google.android.gms.measurement.internal.InterfaceC2740e4
                public final void a(String str2, int i10, Throwable th, byte[] bArr2, Map map2) {
                    C2843t3.c0(this.f35723a, atomicReference, c2845t5, str2, i10, th, bArr2, map2);
                }
            };
            c2747f4I.q();
            C3445p.k(url);
            C3445p.k(bArr);
            C3445p.k(interfaceC2740e4);
            c2747f4I.o().A(new RunnableC2761h4(c2747f4I, strI, url, bArr, map, interfaceC2740e4));
            try {
                Q5 q5J = j();
                long jA = q5J.b().a();
                long j10 = jA + Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX;
                synchronized (atomicReference) {
                    for (long jA2 = Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX; atomicReference.get() == null && jA2 > 0; jA2 = j10 - q5J.b().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                k().M().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == Boolean.TRUE;
        } catch (MalformedURLException | URISyntaxException e10) {
            k().H().d("[sgtm] Bad upload url for row_id", c2845t5.f35668D, Long.valueOf(c2845t5.f35666B), e10);
            return false;
        }
    }

    public final String A0() {
        return this.f35648g.get();
    }

    public final String B0() {
        C2782k4 c2782k4Q = this.f35457a.M().Q();
        if (c2782k4Q != null) {
            return c2782k4Q.f35428b;
        }
        return null;
    }

    public final String C0() {
        C2782k4 c2782k4Q = this.f35457a.M().Q();
        if (c2782k4Q != null) {
            return c2782k4Q.f35427a;
        }
        return null;
    }

    public final String D0() {
        if (this.f35457a.Q() != null) {
            return this.f35457a.Q();
        }
        try {
            return new C4919v(a(), this.f35457a.T()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f35457a.k().H().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final String E0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) o().w(atomicReference, 15000L, "String test flag value", new K3(this, atomicReference));
    }

    @TargetApi(Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD)
    final PriorityQueue<C2797m5> F0() {
        if (this.f35654m == null) {
            this.f35654m = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.w3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((C2797m5) obj).f35469C);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.v3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f35654m;
    }

    public final void G0() {
        n();
        z();
        C2837s4 c2837s4V = v();
        c2837s4V.n();
        c2837s4V.z();
        if (c2837s4V.p0() && c2837s4V.j().I0() < 242600) {
            return;
        }
        v().e0();
    }

    public final void H0() {
        n();
        z();
        if (this.f35457a.v()) {
            Boolean boolH = c().H("google_analytics_deferred_deep_link_enabled");
            if (boolH != null && boolH.booleanValue()) {
                k().G().a("Deferred Deep Link feature enabled.");
                o().E(new Runnable() { // from class: v7.S
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51526B.L0();
                    }
                });
            }
            v().f0();
            this.f35660s = false;
            String strR = h().R();
            if (TextUtils.isEmpty(strR)) {
                return;
            }
            e().q();
            if (strR.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strR);
            h1("auto", "_ou", bundle);
        }
    }

    public final ArrayList<Bundle> I(String str, String str2) {
        if (o().L()) {
            k().H().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (C2742f.a()) {
            k().H().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f35457a.o().w(atomicReference, Config.MC_BROADCAST_INTERVAL_WIFI, "get conditional user properties", new P3(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return Q5.u0(list);
        }
        k().H().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    final void I0() {
        n();
        A a10 = this.f35653l;
        if (a10 != null) {
            a10.a();
        }
    }

    public final Map<String, Object> J(String str, String str2, boolean z10) {
        if (o().L()) {
            k().H().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C2742f.a()) {
            k().H().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f35457a.o().w(atomicReference, Config.MC_BROADCAST_INTERVAL_WIFI, "get user properties", new T3(this, atomicReference, null, str, str2, z10));
        List<P5> list = (List) atomicReference.get();
        if (list == null) {
            k().H().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        C4391a c4391a = new C4391a(list.size());
        for (P5 p52 : list) {
            Object objF0 = p52.f0();
            if (objF0 != null) {
                c4391a.put(p52.f35129C, objF0);
            }
        }
        return c4391a;
    }

    public final void J0() {
        if (!(a().getApplicationContext() instanceof Application) || this.f35644c == null) {
            return;
        }
        ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f35644c);
    }

    public final void K(long j10) {
        Y0(null);
        o().E(new O3(this, j10));
    }

    final void K0() {
        if (W6.a() && c().u(K.f34942R0)) {
            if (o().L()) {
                k().H().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C2742f.a()) {
                k().H().a("Cannot get trigger URIs from main thread");
                return;
            }
            z();
            k().L().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            o().w(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: v7.M
                @Override // java.lang.Runnable
                public final void run() {
                    C2843t3.b0(this.f51516B, atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                k().H().a("Timed out waiting for get trigger URIs");
            } else {
                o().E(new Runnable() { // from class: v7.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2843t3.a0(this.f51522B, list);
                    }
                });
            }
        }
    }

    public final void L(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            k().K().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            k().K().a("Preview Mode was not enabled.");
            c().O(null);
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        k().K().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
        c().O(queryParameter2);
    }

    public final void L0() {
        n();
        if (h().f35616v.b()) {
            k().G().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = h().f35617w.a();
        h().f35617w.b(1 + jA);
        if (jA >= 5) {
            k().M().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            h().f35616v.a(true);
        } else {
            if (this.f35661t == null) {
                this.f35661t = new M3(this, this.f35457a);
            }
            this.f35661t.b(0L);
        }
    }

    public final void M(Bundle bundle) {
        O(bundle, b().a());
    }

    public final void M0() {
        n();
        k().G().a("Handle tcf update.");
        C2783k5 c2783k5C = C2783k5.c(h().I());
        k().L().b("Tcf preferences read", c2783k5C);
        if (h().C(c2783k5C)) {
            Bundle bundleB = c2783k5C.b();
            k().L().b("Consent generated from Tcf", bundleB);
            if (bundleB != Bundle.EMPTY) {
                N(bundleB, -30, b().a());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c2783k5C.e());
            h1("auto", "_tcf", bundle);
        }
    }

    @TargetApi(Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD)
    final void N0() {
        C2797m5 c2797m5Poll;
        AbstractC4060a abstractC4060aR0;
        n();
        this.f35655n = false;
        if (F0().isEmpty() || this.f35650i || (c2797m5Poll = F0().poll()) == null || (abstractC4060aR0 = j().R0()) == null) {
            return;
        }
        this.f35650i = true;
        k().L().b("Registering trigger URI", c2797m5Poll.f35468B);
        com.google.common.util.concurrent.f<C4153F> fVarC = abstractC4060aR0.c(Uri.parse(c2797m5Poll.f35468B));
        if (fVarC != null) {
            com.google.common.util.concurrent.c.a(fVarC, new C3(this, c2797m5Poll), new D3(this));
        } else {
            this.f35650i = false;
            F0().add(c2797m5Poll);
        }
    }

    public final void O(Bundle bundle, long j10) {
        C3445p.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            k().M().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C3445p.k(bundle2);
        v7.D.a(bundle2, "app_id", String.class, null);
        v7.D.a(bundle2, "origin", String.class, null);
        v7.D.a(bundle2, "name", String.class, null);
        v7.D.a(bundle2, "value", Object.class, null);
        v7.D.a(bundle2, "trigger_event_name", String.class, null);
        v7.D.a(bundle2, "trigger_timeout", Long.class, 0L);
        v7.D.a(bundle2, "timed_out_event_name", String.class, null);
        v7.D.a(bundle2, "timed_out_event_params", Bundle.class, null);
        v7.D.a(bundle2, "triggered_event_name", String.class, null);
        v7.D.a(bundle2, "triggered_event_params", Bundle.class, null);
        v7.D.a(bundle2, "time_to_live", Long.class, 0L);
        v7.D.a(bundle2, "expired_event_name", String.class, null);
        v7.D.a(bundle2, "expired_event_params", Bundle.class, null);
        C3445p.e(bundle2.getString("name"));
        C3445p.e(bundle2.getString("origin"));
        C3445p.k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (j().s0(string) != 0) {
            k().H().b("Invalid conditional user property name", g().g(string));
            return;
        }
        if (j().x(string, obj) != 0) {
            k().H().c("Invalid conditional user property value", g().g(string), obj);
            return;
        }
        Object objB0 = j().B0(string, obj);
        if (objB0 == null) {
            k().H().c("Unable to normalize conditional user property value", g().g(string), obj);
            return;
        }
        v7.D.b(bundle2, objB0);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            k().H().c("Invalid conditional user property timeout", g().g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            k().H().c("Invalid conditional user property time to live", g().g(string), Long.valueOf(j12));
        } else {
            o().E(new N3(this, bundle2));
        }
    }

    public final void O0() {
        n();
        k().G().a("Register tcfPrefChangeListener.");
        if (this.f35662u == null) {
            this.f35663v = new J3(this, this.f35457a);
            this.f35662u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: v7.U
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C2843t3.U(this.f51530a, sharedPreferences, str);
                }
            };
        }
        h().I().registerOnSharedPreferenceChangeListener(this.f35662u);
    }

    public final void P(com.google.android.gms.internal.measurement.U0 u02) {
        o().E(new S3(this, u02));
    }

    final boolean P0() {
        return this.f35655n;
    }

    final void Q(C c10, boolean z10) {
        Y3 y32 = new Y3(this, c10);
        if (!z10) {
            o().E(y32);
        } else {
            n();
            y32.run();
        }
    }

    final void R(C2823q3 c2823q3) {
        n();
        boolean z10 = (c2823q3.x() && c2823q3.w()) || v().n0();
        if (z10 != this.f35457a.t()) {
            this.f35457a.y(z10);
            Boolean boolP = h().P();
            if (!z10 || boolP == null || boolP.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void S(C2823q3 c2823q3, boolean z10) {
        boolean z11;
        C2823q3 c2823q32;
        boolean zS;
        boolean z12;
        z();
        int iB = c2823q3.b();
        if (iB != -10) {
            v7.E eR = c2823q3.r();
            v7.E e10 = v7.E.UNINITIALIZED;
            if (eR == e10 && c2823q3.t() == e10) {
                k().N().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f35649h) {
            try {
                z11 = false;
                if (C2823q3.l(iB, this.f35656o.b())) {
                    zS = c2823q3.s(this.f35656o);
                    if (c2823q3.x() && !this.f35656o.x()) {
                        z11 = true;
                    }
                    C2823q3 c2823q3O = c2823q3.o(this.f35656o);
                    this.f35656o = c2823q3O;
                    c2823q32 = c2823q3O;
                    z12 = z11;
                    z11 = true;
                } else {
                    c2823q32 = c2823q3;
                    zS = false;
                    z12 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            k().K().b("Ignoring lower-priority consent settings, proposed settings", c2823q32);
            return;
        }
        long andIncrement = this.f35657p.getAndIncrement();
        if (zS) {
            Y0(null);
            RunnableC2719b4 runnableC2719b4 = new RunnableC2719b4(this, c2823q32, andIncrement, z12);
            if (!z10) {
                o().H(runnableC2719b4);
                return;
            } else {
                n();
                runnableC2719b4.run();
                return;
            }
        }
        RunnableC2712a4 runnableC2712a4 = new RunnableC2712a4(this, c2823q32, andIncrement, z12);
        if (z10) {
            n();
            runnableC2712a4.run();
        } else if (iB == 30 || iB == -10) {
            o().H(runnableC2712a4);
        } else {
            o().E(runnableC2712a4);
        }
    }

    final void S0(long j10) {
        n();
        z();
        k().G().a("Resetting analytics data (FE)");
        C2727c5 c2727c5W = w();
        c2727c5W.n();
        c2727c5W.f35314f.b();
        q().L();
        boolean zS = this.f35457a.s();
        C2835s2 c2835s2H = h();
        c2835s2H.f35601g.b(j10);
        if (!TextUtils.isEmpty(c2835s2H.h().f35618x.a())) {
            c2835s2H.f35618x.b(null);
        }
        c2835s2H.f35612r.b(0L);
        c2835s2H.f35613s.b(0L);
        if (!c2835s2H.c().Z()) {
            c2835s2H.H(!zS);
        }
        c2835s2H.f35619y.b(null);
        c2835s2H.f35620z.b(0L);
        c2835s2H.f35596A.b(null);
        v().i0();
        w().f35313e.a();
        this.f35660s = !zS;
    }

    public final void T0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        o().E(new Runnable() { // from class: v7.O
            @Override // java.lang.Runnable
            public final void run() {
                C2843t3.V(this.f51520B, bundle2);
            }
        });
    }

    public final void U0(final Bundle bundle, final long j10) {
        o().H(new Runnable() { // from class: v7.T
            @Override // java.lang.Runnable
            public final void run() {
                C2843t3.W(this.f51527B, bundle, j10);
            }
        });
    }

    final void Y0(String str) {
        this.f35648g.set(str);
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a1(String str, String str2, Bundle bundle) {
        n0(str, str2, bundle, true, true, b().a());
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    public final void b1(v7.K k10) {
        z();
        C3445p.k(k10);
        if (this.f35646e.remove(k10)) {
            return;
        }
        k().M().a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    public final void c1(boolean z10) {
        if (a().getApplicationContext() instanceof Application) {
            Application application = (Application) a().getApplicationContext();
            if (this.f35644c == null) {
                this.f35644c = new C2726c4(this);
            }
            if (z10) {
                application.unregisterActivityLifecycleCallbacks(this.f35644c);
                application.registerActivityLifecycleCallbacks(this.f35644c);
                k().L().a("Registered activity lifecycle callback");
            }
        }
    }

    final void d1(long j10) {
        n();
        if (this.f35653l == null) {
            this.f35653l = new B3(this, this.f35457a);
        }
        this.f35653l.b(j10);
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    public final void e0(Boolean bool) {
        z();
        o().E(new Z3(this, bool));
    }

    public final void e1(Bundle bundle, long j10) {
        N(bundle, -20, j10);
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    final void g0(Runnable runnable) {
        if (c().u(K.f34932M0)) {
            z();
            if (o().L()) {
                k().H().a("Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (o().K()) {
                k().H().a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            if (C2742f.a()) {
                k().H().a("Cannot retrieve and upload batches from main thread");
                return;
            }
            k().L().a("[sgtm] Started client-side batch upload work.");
            boolean z10 = false;
            int size = 0;
            int i10 = 0;
            while (!z10) {
                k().L().a("[sgtm] Getting upload batches from service (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                o().w(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: v7.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51524B.v().Y(atomicReference, k0.f0(X.SGTM_CLIENT));
                    }
                });
                C2859v5 c2859v5 = (C2859v5) atomicReference.get();
                if (c2859v5 != null && !c2859v5.f35693B.isEmpty()) {
                    k().L().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(c2859v5.f35693B.size()));
                    size += c2859v5.f35693B.size();
                    Iterator<C2845t5> it = c2859v5.f35693B.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!t0(it.next())) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                } else {
                    break;
                }
            }
            k().L().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
            runnable.run();
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    public final void h0(final String str, long j10) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f35457a.k().M().a("User ID must be non-empty or null");
        } else {
            o().E(new Runnable() { // from class: v7.N
                @Override // java.lang.Runnable
                public final void run() {
                    C2843t3.Z(this.f51518B, str);
                }
            });
            q0(null, "_id", str, true, j10);
        }
    }

    final void h1(String str, String str2, Bundle bundle) {
        n();
        i0(str, str2, b().a(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    final void i0(String str, String str2, long j10, Bundle bundle) {
        n();
        j0(str, str2, j10, bundle, true, this.f35645d == null || Q5.H0(str2), true, null);
    }

    public final void i1(boolean z10) {
        z();
        o().E(new E3(this, z10));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    protected final void j0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str4;
        ArrayList arrayList;
        long j11;
        int i10;
        Object obj;
        int length;
        C3445p.e(str);
        C3445p.k(bundle);
        n();
        z();
        if (!this.f35457a.s()) {
            k().G().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listK = q().K();
        if (listK != null && !listK.contains(str2)) {
            k().G().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f35647f) {
            this.f35647f = true;
            try {
                try {
                    (!this.f35457a.w() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, a());
                } catch (Exception e10) {
                    k().M().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                k().K().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            o0("auto", "_lgclid", bundle.getString("gclid"), b().a());
        }
        if (z10 && Q5.K0(str2)) {
            j().O(bundle, h().f35596A.a());
        }
        if (!z12 && !"_iap".equals(str2)) {
            Q5 q5P = this.f35457a.P();
            int i11 = 2;
            if (q5P.D0("event", str2)) {
                if (!q5P.q0("event", v7.H.f51510a, v7.H.f51511b, str2)) {
                    i11 = 13;
                } else if (q5P.k0("event", 40, str2)) {
                    i11 = 0;
                }
            }
            if (i11 != 0) {
                k().I().b("Invalid public event name. Event will not be logged (FE)", g().c(str2));
                this.f35457a.P();
                String strK = Q5.K(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f35457a.P();
                Q5.Z(this.f35664w, i11, "_ev", strK, length);
                return;
            }
        }
        C2782k4 c2782k4E = u().E(false);
        if (c2782k4E != null && !bundle.containsKey("_sc")) {
            c2782k4E.f35430d = true;
        }
        Q5.Y(c2782k4E, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str);
        boolean zH0 = Q5.H0(str2);
        if (z10 && this.f35645d != null && !zH0 && !zEquals) {
            k().G().c("Passing event to registered event handler (FE)", g().c(str2), g().a(bundle));
            C3445p.k(this.f35645d);
            this.f35645d.a(str, str2, bundle, j10);
            return;
        }
        if (this.f35457a.v()) {
            int iW = j().w(str2);
            if (iW != 0) {
                k().I().b("Invalid event name. Event will not be logged (FE)", g().c(str2));
                j();
                String strK2 = Q5.K(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f35457a.P();
                Q5.a0(this.f35664w, str3, iW, "_ev", strK2, length);
                return;
            }
            String str5 = "_o";
            Bundle bundleG = j().G(str3, str2, bundle, com.google.android.gms.common.util.f.b("_o", "_sn", "_sc", "_si"), z12);
            C3445p.k(bundleG);
            if (u().E(false) != null && "_ae".equals(str2)) {
                C2776j5 c2776j5 = w().f35314f;
                long jC = c2776j5.f35419d.b().c();
                long j12 = jC - c2776j5.f35417b;
                c2776j5.f35417b = jC;
                if (j12 > 0) {
                    j().N(bundleG, j12);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                Q5 q5J = j();
                String string = bundleG.getString("_ffr");
                if (com.google.android.gms.common.util.p.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, q5J.h().f35618x.a())) {
                    q5J.k().G().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                q5J.h().f35618x.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = j().h().f35618x.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleG.putString("_ffr", strA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleG);
            boolean zH = c().u(K.f34952W0) ? w().H() : h().f35615u.b();
            if (h().f35612r.a() > 0 && h().z(j10) && zH) {
                k().L().a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j11 = 0;
                str4 = "_ae";
                o0("auto", "_sid", null, b().a());
                o0("auto", "_sno", null, b().a());
                o0("auto", "_se", null, b().a());
                h().f35613s.b(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j11 = 0;
            }
            if (bundleG.getLong("extend_session", j11) == 1) {
                k().L().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i10 = 1;
                this.f35457a.O().f35313e.b(j10, true);
            } else {
                i10 = 1;
            }
            ArrayList arrayList3 = new ArrayList(bundleG.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayList3.get(i12);
                i12 += i10;
                String str6 = (String) obj2;
                if (str6 != null) {
                    j();
                    Bundle[] bundleArrY0 = Q5.y0(bundleG.get(str6));
                    if (bundleArrY0 != null) {
                        bundleG.putParcelableArray(str6, bundleArrY0);
                    }
                }
                i10 = 1;
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                ArrayList arrayList4 = arrayList;
                Bundle bundleF = (Bundle) arrayList4.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleF.putString(str5, str);
                if (z11) {
                    obj = null;
                    bundleF = j().F(bundleF, null);
                } else {
                    obj = null;
                }
                Bundle bundle2 = bundleF;
                String str8 = str5;
                v().L(new J(str7, new F(bundle2), str, j10), str3);
                if (!zEquals) {
                    Iterator<v7.K> it = this.f35646e.iterator();
                    while (it.hasNext()) {
                        it.next().a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                arrayList = arrayList4;
                str5 = str8;
            }
            if (u().E(false) == null || !str4.equals(str2)) {
                return;
            }
            w().G(true, true, b().c());
        }
    }

    public final void j1(long j10) {
        o().E(new G3(this, j10));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final void l0(String str, String str2, Bundle bundle) {
        long jA = b().a();
        C3445p.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        o().E(new Q3(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final void m0(String str, String str2, Bundle bundle, String str3) {
        m();
        Z0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final void n0(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            u().F(bundle2, j10);
        } else {
            Z0(str3, str2, j10, bundle2, z11, !z11 || this.f35645d == null || Q5.H0(str2), z10, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void o0(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            g7.C3445p.e(r10)
            g7.C3445p.e(r11)
            r9.n()
            r9.z()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L6e
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L51
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L51
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r2 = 1
            if (r11 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.s2 r0 = r9.h()
            com.google.android.gms.measurement.internal.y2 r0 = r0.f35609o
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r12 = "true"
        L4b:
            r0.b(r12)
            r12 = r11
        L4f:
            r11 = r1
            goto L5f
        L51:
            if (r12 != 0) goto L5f
            com.google.android.gms.measurement.internal.s2 r11 = r9.h()
            com.google.android.gms.measurement.internal.y2 r11 = r11.f35609o
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L4f
        L5f:
            com.google.android.gms.measurement.internal.h2 r0 = r9.k()
            com.google.android.gms.measurement.internal.i2 r0 = r0.L()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L6e:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.P2 r11 = r9.f35457a
            boolean r11 = r11.s()
            if (r11 != 0) goto L86
            com.google.android.gms.measurement.internal.h2 r10 = r9.k()
            com.google.android.gms.measurement.internal.i2 r10 = r10.L()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L86:
            com.google.android.gms.measurement.internal.P2 r11 = r9.f35457a
            boolean r11 = r11.v()
            if (r11 != 0) goto L8f
            return
        L8f:
            com.google.android.gms.measurement.internal.P5 r11 = new com.google.android.gms.measurement.internal.P5
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.s4 r10 = r9.v()
            r10.S(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2843t3.o0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2707a p() {
        return super.p();
    }

    public final void p0(String str, String str2, Object obj, boolean z10) {
        q0(str, str2, obj, z10, b().a());
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2717b2 q() {
        return super.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0(java.lang.String r7, java.lang.String r8, java.lang.Object r9, boolean r10, long r11) {
        /*
            r6 = this;
            if (r7 != 0) goto L4
            java.lang.String r7 = "app"
        L4:
            r1 = r7
            r7 = 0
            r0 = 24
            if (r10 == 0) goto L13
            com.google.android.gms.measurement.internal.Q5 r10 = r6.j()
            int r10 = r10.s0(r8)
            goto L35
        L13:
            com.google.android.gms.measurement.internal.Q5 r10 = r6.j()
            java.lang.String r2 = "user property"
            boolean r3 = r10.D0(r2, r8)
            r4 = 6
            if (r3 != 0) goto L22
        L20:
            r10 = r4
            goto L35
        L22:
            java.lang.String[] r3 = v7.J.f51514a
            boolean r3 = r10.p0(r2, r3, r8)
            if (r3 != 0) goto L2d
            r10 = 15
            goto L35
        L2d:
            boolean r10 = r10.k0(r2, r0, r8)
            if (r10 != 0) goto L34
            goto L20
        L34:
            r10 = r7
        L35:
            java.lang.String r2 = "_ev"
            r3 = 1
            if (r10 == 0) goto L52
            r6.j()
            java.lang.String r9 = com.google.android.gms.measurement.internal.Q5.K(r8, r0, r3)
            if (r8 == 0) goto L47
            int r7 = r8.length()
        L47:
            com.google.android.gms.measurement.internal.P2 r8 = r6.f35457a
            r8.P()
            com.google.android.gms.measurement.internal.S5 r8 = r6.f35664w
            com.google.android.gms.measurement.internal.Q5.Z(r8, r10, r2, r9, r7)
            return
        L52:
            if (r9 == 0) goto L91
            com.google.android.gms.measurement.internal.Q5 r10 = r6.j()
            int r10 = r10.x(r8, r9)
            if (r10 == 0) goto L80
            r6.j()
            java.lang.String r8 = com.google.android.gms.measurement.internal.Q5.K(r8, r0, r3)
            boolean r11 = r9 instanceof java.lang.String
            if (r11 != 0) goto L6d
            boolean r11 = r9 instanceof java.lang.CharSequence
            if (r11 == 0) goto L75
        L6d:
            java.lang.String r7 = java.lang.String.valueOf(r9)
            int r7 = r7.length()
        L75:
            com.google.android.gms.measurement.internal.P2 r9 = r6.f35457a
            r9.P()
            com.google.android.gms.measurement.internal.S5 r9 = r6.f35664w
            com.google.android.gms.measurement.internal.Q5.Z(r9, r10, r2, r8, r7)
            return
        L80:
            com.google.android.gms.measurement.internal.Q5 r7 = r6.j()
            java.lang.Object r5 = r7.B0(r8, r9)
            if (r5 == 0) goto L90
            r0 = r6
            r2 = r8
            r3 = r11
            r0.k0(r1, r2, r3, r5)
        L90:
            return
        L91:
            r5 = 0
            r0 = r6
            r2 = r8
            r3 = r11
            r0.k0(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2843t3.q0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2731d2 r() {
        return super.r();
    }

    public final void r0(v7.I i10) {
        v7.I i11;
        n();
        z();
        if (i10 != null && i10 != (i11 = this.f35645d)) {
            C3445p.o(i11 == null, "EventInterceptor already set.");
        }
        this.f35645d = i10;
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2843t3 s() {
        return super.s();
    }

    public final void s0(v7.K k10) {
        z();
        C3445p.k(k10);
        if (this.f35646e.add(k10)) {
            return;
        }
        k().M().a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2768i4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2796m4 u() {
        return super.u();
    }

    public final C4901c u0() {
        n();
        return v().c0();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2837s4 v() {
        return super.v();
    }

    public final v7.V v0() {
        return this.f35644c;
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2727c5 w() {
        return super.w();
    }

    public final Boolean w0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) o().w(atomicReference, 15000L, "boolean test flag value", new RunnableC2885z3(this, atomicReference));
    }

    public final Double x0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) o().w(atomicReference, 15000L, "double test flag value", new W3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.B1
    protected final boolean y() {
        return false;
    }

    public final Integer y0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) o().w(atomicReference, 15000L, "int test flag value", new X3(this, atomicReference));
    }

    public final Long z0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) o().w(atomicReference, 15000L, "long test flag value", new U3(this, atomicReference));
    }
}
