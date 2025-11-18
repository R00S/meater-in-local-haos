package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.AbstractC2610w3;
import com.google.android.gms.internal.measurement.C2456d1;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.measurement.internal.C2823q3;
import g1.C3377a;
import g7.C3445p;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import v7.C4901c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public class P2 implements InterfaceC2809o3 {

    /* renamed from: J, reason: collision with root package name */
    private static volatile P2 f35080J;

    /* renamed from: A, reason: collision with root package name */
    private long f35081A;

    /* renamed from: B, reason: collision with root package name */
    private volatile Boolean f35082B;

    /* renamed from: C, reason: collision with root package name */
    private Boolean f35083C;

    /* renamed from: D, reason: collision with root package name */
    private Boolean f35084D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f35085E;

    /* renamed from: F, reason: collision with root package name */
    private int f35086F;

    /* renamed from: G, reason: collision with root package name */
    private int f35087G;

    /* renamed from: I, reason: collision with root package name */
    final long f35089I;

    /* renamed from: a, reason: collision with root package name */
    private final Context f35090a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35091b;

    /* renamed from: c, reason: collision with root package name */
    private final String f35092c;

    /* renamed from: d, reason: collision with root package name */
    private final String f35093d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35094e;

    /* renamed from: f, reason: collision with root package name */
    private final C2742f f35095f;

    /* renamed from: g, reason: collision with root package name */
    private final C2763i f35096g;

    /* renamed from: h, reason: collision with root package name */
    private final C2835s2 f35097h;

    /* renamed from: i, reason: collision with root package name */
    private final C2759h2 f35098i;

    /* renamed from: j, reason: collision with root package name */
    private final J2 f35099j;

    /* renamed from: k, reason: collision with root package name */
    private final C2727c5 f35100k;

    /* renamed from: l, reason: collision with root package name */
    private final Q5 f35101l;

    /* renamed from: m, reason: collision with root package name */
    private final C2738e2 f35102m;

    /* renamed from: n, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f35103n;

    /* renamed from: o, reason: collision with root package name */
    private final C2796m4 f35104o;

    /* renamed from: p, reason: collision with root package name */
    private final C2843t3 f35105p;

    /* renamed from: q, reason: collision with root package name */
    private final C2707a f35106q;

    /* renamed from: r, reason: collision with root package name */
    private final C2747f4 f35107r;

    /* renamed from: s, reason: collision with root package name */
    private final String f35108s;

    /* renamed from: t, reason: collision with root package name */
    private C2731d2 f35109t;

    /* renamed from: u, reason: collision with root package name */
    private C2837s4 f35110u;

    /* renamed from: v, reason: collision with root package name */
    private E f35111v;

    /* renamed from: w, reason: collision with root package name */
    private C2717b2 f35112w;

    /* renamed from: x, reason: collision with root package name */
    private C2768i4 f35113x;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f35115z;

    /* renamed from: y, reason: collision with root package name */
    private boolean f35114y = false;

    /* renamed from: H, reason: collision with root package name */
    private AtomicInteger f35088H = new AtomicInteger(0);

    private P2(C2836s3 c2836s3) {
        Bundle bundle;
        boolean z10 = false;
        C3445p.k(c2836s3);
        C2742f c2742f = new C2742f(c2836s3.f35621a);
        this.f35095f = c2742f;
        W1.f35194a = c2742f;
        Context context = c2836s3.f35621a;
        this.f35090a = context;
        this.f35091b = c2836s3.f35622b;
        this.f35092c = c2836s3.f35623c;
        this.f35093d = c2836s3.f35624d;
        this.f35094e = c2836s3.f35628h;
        this.f35082B = c2836s3.f35625e;
        this.f35108s = c2836s3.f35630j;
        this.f35085E = true;
        C2456d1 c2456d1 = c2836s3.f35627g;
        if (c2456d1 != null && (bundle = c2456d1.f34070H) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f35083C = (Boolean) obj;
            }
            Object obj2 = c2456d1.f34070H.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f35084D = (Boolean) obj2;
            }
        }
        AbstractC2610w3.l(context);
        com.google.android.gms.common.util.e eVarD = com.google.android.gms.common.util.h.d();
        this.f35103n = eVarD;
        Long l10 = c2836s3.f35629i;
        this.f35089I = l10 != null ? l10.longValue() : eVarD.a();
        this.f35096g = new C2763i(this);
        C2835s2 c2835s2 = new C2835s2(this);
        c2835s2.r();
        this.f35097h = c2835s2;
        C2759h2 c2759h2 = new C2759h2(this);
        c2759h2.r();
        this.f35098i = c2759h2;
        Q5 q52 = new Q5(this);
        q52.r();
        this.f35101l = q52;
        this.f35102m = new C2738e2(new C2850u3(c2836s3, this));
        this.f35106q = new C2707a(this);
        C2796m4 c2796m4 = new C2796m4(this);
        c2796m4.A();
        this.f35104o = c2796m4;
        C2843t3 c2843t3 = new C2843t3(this);
        c2843t3.A();
        this.f35105p = c2843t3;
        C2727c5 c2727c5 = new C2727c5(this);
        c2727c5.A();
        this.f35100k = c2727c5;
        C2747f4 c2747f4 = new C2747f4(this);
        c2747f4.r();
        this.f35107r = c2747f4;
        J2 j22 = new J2(this);
        j22.r();
        this.f35099j = j22;
        C2456d1 c2456d12 = c2836s3.f35627g;
        if (c2456d12 != null && c2456d12.f34065C != 0) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            J().c1(z11);
        } else {
            k().M().a("Application context is not an Application");
        }
        j22.E(new Q2(this, c2836s3));
    }

    public static P2 c(Context context, C2456d1 c2456d1, Long l10) {
        Bundle bundle;
        if (c2456d1 != null && (c2456d1.f34068F == null || c2456d1.f34069G == null)) {
            c2456d1 = new C2456d1(c2456d1.f34064B, c2456d1.f34065C, c2456d1.f34066D, c2456d1.f34067E, null, null, c2456d1.f34070H, null);
        }
        C3445p.k(context);
        C3445p.k(context.getApplicationContext());
        if (f35080J == null) {
            synchronized (P2.class) {
                try {
                    if (f35080J == null) {
                        f35080J = new P2(new C2836s3(context, c2456d1, l10));
                    }
                } finally {
                }
            }
        } else if (c2456d1 != null && (bundle = c2456d1.f34070H) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C3445p.k(f35080J);
            f35080J.m(c2456d1.f34070H.getBoolean("dataCollectionDefaultEnabled"));
        }
        C3445p.k(f35080J);
        return f35080J;
    }

    private static void e(B1 b12) {
        if (b12 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (b12.x()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(b12.getClass()));
    }

    private static void g(Z1 z12) {
        if (z12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    static /* synthetic */ void h(P2 p22, C2836s3 c2836s3) {
        p22.o().n();
        E e10 = new E(p22);
        e10.r();
        p22.f35111v = e10;
        C2717b2 c2717b2 = new C2717b2(p22, c2836s3.f35626f);
        c2717b2.A();
        p22.f35112w = c2717b2;
        C2731d2 c2731d2 = new C2731d2(p22);
        c2731d2.A();
        p22.f35109t = c2731d2;
        C2837s4 c2837s4 = new C2837s4(p22);
        c2837s4.A();
        p22.f35110u = c2837s4;
        p22.f35101l.s();
        p22.f35097h.s();
        p22.f35112w.B();
        C2768i4 c2768i4 = new C2768i4(p22);
        c2768i4.A();
        p22.f35113x = c2768i4;
        c2768i4.B();
        p22.k().K().b("App measurement initialized, version", 114010L);
        p22.k().K().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strH = c2717b2.H();
        if (TextUtils.isEmpty(p22.f35091b)) {
            if (p22.P().F0(strH, p22.f35096g.W())) {
                p22.k().K().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                p22.k().K().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strH);
            }
        }
        p22.k().G().a("Debug-level message logging enabled");
        if (p22.f35086F != p22.f35088H.get()) {
            p22.k().H().c("Not all components initialized", Integer.valueOf(p22.f35086F), Integer.valueOf(p22.f35088H.get()));
        }
        p22.f35114y = true;
    }

    public static /* synthetic */ void i(P2 p22, String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        if ((i10 != 200 && i10 != 204 && i10 != 304) || th != null) {
            p22.k().M().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
            return;
        }
        p22.H().f35616v.a(true);
        if (bArr == null || bArr.length == 0) {
            p22.k().G().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(strOptString)) {
                p22.k().G().a("Deferred Deep Link is empty.");
                return;
            }
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            Q5 q5P = p22.P();
            if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = q5P.a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                p22.k().M().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            }
            if (!TextUtils.isEmpty(strOptString3)) {
                bundle.putString("gbraid", strOptString3);
            }
            if (!TextUtils.isEmpty(strOptString4)) {
                bundle.putString("gad_source", strOptString4);
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            p22.f35105p.h1("auto", "_cmp", bundle);
            Q5 q5P2 = p22.P();
            if (TextUtils.isEmpty(strOptString) || !q5P2.j0(strOptString, dOptDouble)) {
                return;
            }
            q5P2.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            p22.k().H().b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    private static void j(C2795m3 c2795m3) {
        if (c2795m3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void l(AbstractC2816p3 abstractC2816p3) {
        if (abstractC2816p3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC2816p3.t()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC2816p3.getClass()));
    }

    public final C2707a A() {
        g(this.f35106q);
        return this.f35106q;
    }

    public final C2763i B() {
        return this.f35096g;
    }

    public final E C() {
        l(this.f35111v);
        return this.f35111v;
    }

    public final C2717b2 D() {
        e(this.f35112w);
        return this.f35112w;
    }

    public final C2731d2 E() {
        e(this.f35109t);
        return this.f35109t;
    }

    public final C2738e2 F() {
        return this.f35102m;
    }

    public final C2759h2 G() {
        C2759h2 c2759h2 = this.f35098i;
        if (c2759h2 == null || !c2759h2.t()) {
            return null;
        }
        return this.f35098i;
    }

    public final C2835s2 H() {
        j(this.f35097h);
        return this.f35097h;
    }

    final J2 I() {
        return this.f35099j;
    }

    public final C2843t3 J() {
        e(this.f35105p);
        return this.f35105p;
    }

    public final C2747f4 K() {
        l(this.f35107r);
        return this.f35107r;
    }

    public final C2768i4 L() {
        g(this.f35113x);
        return this.f35113x;
    }

    public final C2796m4 M() {
        e(this.f35104o);
        return this.f35104o;
    }

    public final C2837s4 N() {
        e(this.f35110u);
        return this.f35110u;
    }

    public final C2727c5 O() {
        e(this.f35100k);
        return this.f35100k;
    }

    public final Q5 P() {
        j(this.f35101l);
        return this.f35101l;
    }

    public final String Q() {
        return this.f35091b;
    }

    public final String R() {
        return this.f35092c;
    }

    public final String S() {
        return this.f35093d;
    }

    public final String T() {
        return this.f35108s;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final Context a() {
        return this.f35090a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final com.google.android.gms.common.util.e b() {
        return this.f35103n;
    }

    protected final void d(C2456d1 c2456d1) {
        C2823q3 c2823q3F;
        Boolean boolE;
        o().n();
        C2763i c2763i = this.f35096g;
        Y1<Boolean> y12 = K.f34932M0;
        boolean z10 = c2763i.u(y12) && L().E() == A2.a.CLIENT_UPLOAD_ELIGIBLE;
        if ((W6.a() && this.f35096g.u(K.f34942R0) && P().V0()) || z10) {
            Q5 q5P = P();
            q5P.n();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            if (q5P.c().u(y12)) {
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            }
            C3377a.l(q5P.a(), new v7.n0(q5P.f35457a), intentFilter, 2);
            q5P.k().G().a("Registered app receiver");
        }
        if (z10) {
            L().D(K.f35013y.a(null).longValue());
        }
        C2823q3 c2823q3N = H().N();
        int iB = c2823q3N.b();
        v7.E E10 = this.f35096g.E("google_analytics_default_allow_ad_storage", false);
        v7.E E11 = this.f35096g.E("google_analytics_default_allow_analytics_storage", false);
        v7.E e10 = v7.E.UNINITIALIZED;
        if (!(E10 == e10 && E11 == e10) && H().y(-10)) {
            c2823q3F = C2823q3.f(E10, E11, -10);
        } else {
            if (!TextUtils.isEmpty(D().J()) && (iB == 0 || iB == 30 || iB == 10 || iB == 30 || iB == 30 || iB == 40)) {
                J().S(new C2823q3(null, null, -10), false);
            } else if (TextUtils.isEmpty(D().J()) && c2456d1 != null && c2456d1.f34070H != null && H().y(30)) {
                c2823q3F = C2823q3.c(c2456d1.f34070H, 30);
                if (!c2823q3F.y()) {
                }
            }
            c2823q3F = null;
        }
        if (c2823q3F != null) {
            J().S(c2823q3F, true);
            c2823q3N = c2823q3F;
        }
        J().R(c2823q3N);
        int iA = H().M().a();
        v7.E E12 = this.f35096g.E("google_analytics_default_allow_ad_personalization_signals", true);
        if (E12 != e10) {
            k().L().b("Default ad personalization consent from Manifest", E12);
        }
        v7.E E13 = this.f35096g.E("google_analytics_default_allow_ad_user_data", true);
        if (E13 != e10 && C2823q3.l(-10, iA)) {
            J().Q(C.d(E13, -10), true);
        } else if (TextUtils.isEmpty(D().J()) || !(iA == 0 || iA == 30)) {
            if (TextUtils.isEmpty(D().J()) && c2456d1 != null && c2456d1.f34070H != null && C2823q3.l(30, iA)) {
                C cB = C.b(c2456d1.f34070H, 30);
                if (cB.k()) {
                    J().Q(cB, true);
                }
            }
            if (TextUtils.isEmpty(D().J()) && c2456d1 != null && c2456d1.f34070H != null && H().f35609o.a() == null && (boolE = C.e(c2456d1.f34070H)) != null) {
                J().p0(c2456d1.f34068F, "allow_personalized_ads", boolE.toString(), false);
            }
        } else {
            J().Q(new C(null, -10), true);
        }
        Boolean boolH = this.f35096g.H("google_analytics_tcf_data_enabled");
        if (boolH == null ? true : boolH.booleanValue()) {
            k().G().a("TCF client enabled.");
            J().O0();
            J().M0();
        }
        if (H().f35601g.a() == 0) {
            k().L().b("Persisting first open", Long.valueOf(this.f35089I));
            H().f35601g.b(this.f35089I);
        }
        J().f35659r.c();
        if (v()) {
            if (!TextUtils.isEmpty(D().J()) || !TextUtils.isEmpty(D().G())) {
                P();
                if (Q5.n0(D().J(), H().T(), D().G(), H().S())) {
                    k().K().a("Rechecking which service to use due to a GMP App Id change");
                    H().D();
                    E().J();
                    this.f35110u.h0();
                    this.f35110u.g0();
                    H().f35601g.b(this.f35089I);
                    H().f35603i.b(null);
                }
                H().J(D().J());
                H().G(D().G());
            }
            if (!H().N().m(C2823q3.a.ANALYTICS_STORAGE)) {
                H().f35603i.b(null);
            }
            J().Y0(H().f35603i.a());
            if (!P().W0() && !TextUtils.isEmpty(H().f35618x.a())) {
                k().M().a("Remote config removed with active feature rollouts");
                H().f35618x.b(null);
            }
            if (!TextUtils.isEmpty(D().J()) || !TextUtils.isEmpty(D().G())) {
                boolean zS = s();
                if (!H().E() && !this.f35096g.Z()) {
                    H().H(!zS);
                }
                if (zS) {
                    J().H0();
                }
                O().f35313e.a();
                N().U(new AtomicReference<>());
                N().E(H().f35596A.a());
            }
        } else if (s()) {
            if (!P().G0("android.permission.INTERNET")) {
                k().H().a("App is missing INTERNET permission");
            }
            if (!P().G0("android.permission.ACCESS_NETWORK_STATE")) {
                k().H().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!l7.c.a(this.f35090a).f() && !this.f35096g.a0()) {
                if (!Q5.e0(this.f35090a)) {
                    k().H().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!Q5.f0(this.f35090a, false)) {
                    k().H().a("AppMeasurementService not registered/enabled");
                }
            }
            k().H().a("Uploading is not possible. App measurement disabled");
        }
        if (W6.a() && this.f35096g.u(K.f34942R0) && P().V0()) {
            if (K.f35002s0.a(null).intValue() > 0) {
                long jMax = Math.max(500L, ((r12.a(null).intValue() * 1000) + new Random().nextInt(5000)) - this.f35103n.c());
                if (jMax > 500) {
                    k().L().b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
                }
                J().d1(jMax);
            } else {
                final C2843t3 c2843t3J = J();
                Objects.requireNonNull(c2843t3J);
                new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.O2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c2843t3J.K0();
                    }
                }).start();
            }
        }
        H().f35611q.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final C2742f f() {
        return this.f35095f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final C2759h2 k() {
        l(this.f35098i);
        return this.f35098i;
    }

    final void m(boolean z10) {
        this.f35082B = Boolean.valueOf(z10);
    }

    final void n() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final J2 o() {
        l(this.f35099j);
        return this.f35099j;
    }

    final void p() {
        this.f35088H.incrementAndGet();
    }

    final void q() {
        this.f35086F++;
    }

    public final boolean r() {
        return this.f35082B != null && this.f35082B.booleanValue();
    }

    public final boolean s() {
        return z() == 0;
    }

    public final boolean t() {
        o().n();
        return this.f35085E;
    }

    public final boolean u() {
        return TextUtils.isEmpty(this.f35091b);
    }

    protected final boolean v() {
        if (!this.f35114y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        o().n();
        Boolean bool = this.f35115z;
        if (bool == null || this.f35081A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f35103n.c() - this.f35081A) > 1000)) {
            this.f35081A = this.f35103n.c();
            boolean z10 = true;
            Boolean boolValueOf = Boolean.valueOf(P().G0("android.permission.INTERNET") && P().G0("android.permission.ACCESS_NETWORK_STATE") && (l7.c.a(this.f35090a).f() || this.f35096g.a0() || (Q5.e0(this.f35090a) && Q5.f0(this.f35090a, false))));
            this.f35115z = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!P().l0(D().J(), D().G()) && TextUtils.isEmpty(D().G())) {
                    z10 = false;
                }
                this.f35115z = Boolean.valueOf(z10);
            }
        }
        return this.f35115z.booleanValue();
    }

    public final boolean w() {
        return this.f35094e;
    }

    public final boolean x() {
        o().n();
        l(K());
        String strH = D().H();
        if (!this.f35096g.X()) {
            k().L().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair<String, Boolean> pairV = H().v(strH);
        if (((Boolean) pairV.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairV.first)) {
            k().L().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!K().x()) {
            k().M().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        C2837s4 c2837s4N = N();
        c2837s4N.n();
        c2837s4N.z();
        if (!c2837s4N.p0() || c2837s4N.j().I0() >= 234200) {
            C4901c c4901cU0 = J().u0();
            Bundle bundle = c4901cU0 != null ? c4901cU0.f51546B : null;
            if (bundle == null) {
                int i10 = this.f35087G;
                this.f35087G = i10 + 1;
                boolean z10 = i10 < 10;
                k().G().b("Failed to retrieve DMA consent from the service, " + (z10 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f35087G));
                return z10;
            }
            C2823q3 c2823q3C = C2823q3.c(bundle, 100);
            sb2.append("&gcs=");
            sb2.append(c2823q3C.u());
            C cB = C.b(bundle, 100);
            sb2.append("&dma=");
            sb2.append(cB.h() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(cB.i())) {
                sb2.append("&dma_cps=");
                sb2.append(cB.i());
            }
            int i11 = C.e(bundle) == Boolean.TRUE ? 0 : 1;
            sb2.append("&npa=");
            sb2.append(i11);
            k().L().b("Consent query parameters to Bow", sb2);
        }
        Q5 q5P = P();
        D();
        URL urlL = q5P.L(114010L, strH, (String) pairV.first, H().f35617w.a() - 1, sb2.toString());
        if (urlL != null) {
            C2747f4 c2747f4K = K();
            InterfaceC2740e4 interfaceC2740e4 = new InterfaceC2740e4() { // from class: com.google.android.gms.measurement.internal.R2
                @Override // com.google.android.gms.measurement.internal.InterfaceC2740e4
                public final void a(String str, int i12, Throwable th, byte[] bArr, Map map) {
                    P2.i(this.f35152a, str, i12, th, bArr, map);
                }
            };
            c2747f4K.q();
            C3445p.k(urlL);
            C3445p.k(interfaceC2740e4);
            c2747f4K.o().A(new RunnableC2761h4(c2747f4K, strH, urlL, null, null, interfaceC2740e4));
        }
        return false;
    }

    public final void y(boolean z10) {
        o().n();
        this.f35085E = z10;
    }

    public final int z() {
        o().n();
        if (this.f35096g.Z()) {
            return 1;
        }
        Boolean bool = this.f35084D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!t()) {
            return 8;
        }
        Boolean boolQ = H().Q();
        if (boolQ != null) {
            return boolQ.booleanValue() ? 0 : 3;
        }
        Boolean boolH = this.f35096g.H("firebase_analytics_collection_enabled");
        if (boolH != null) {
            return boolH.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f35083C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f35082B == null || this.f35082B.booleanValue()) ? 0 : 7;
    }
}
