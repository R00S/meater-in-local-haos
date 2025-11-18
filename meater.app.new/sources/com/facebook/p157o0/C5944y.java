package com.facebook.p157o0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import cm.aptoide.p092pt.account.AccountAnalytics;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.EnumC5659g0;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5684j0;
import com.facebook.p157o0.C5813a0;
import com.facebook.p157o0.p159l0.C5845f;
import com.facebook.p157o0.p159l0.C5847h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import p024c.p076q.p077a.C0997a;

/* compiled from: AppEventQueue.kt */
/* renamed from: com.facebook.o0.y */
/* loaded from: classes.dex */
public final class C5944y {

    /* renamed from: f */
    private static ScheduledFuture<?> f15549f;

    /* renamed from: a */
    public static final C5944y f15544a = new C5944y();

    /* renamed from: b */
    private static final String f15545b = C5944y.class.getName();

    /* renamed from: c */
    private static final int f15546c = 100;

    /* renamed from: d */
    private static volatile C5942w f15547d = new C5942w();

    /* renamed from: e */
    private static final ScheduledExecutorService f15548e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g */
    private static final Runnable f15550g = new Runnable() { // from class: com.facebook.o0.d
        @Override // java.lang.Runnable
        public final void run() {
            C5944y.m12861i();
        }
    };

    private C5944y() {
    }

    /* renamed from: a */
    public static final void m12853a(final C5928t c5928t, final C5941v c5941v) {
        C9801m.m32346f(c5928t, "accessTokenAppId");
        C9801m.m32346f(c5941v, "appEvent");
        f15548e.execute(new Runnable() { // from class: com.facebook.o0.e
            @Override // java.lang.Runnable
            public final void run() {
                C5944y.m12854b(c5928t, c5941v);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12854b(C5928t c5928t, C5941v c5941v) {
        C9801m.m32346f(c5928t, "$accessTokenAppId");
        C9801m.m32346f(c5941v, "$appEvent");
        f15547d.m12846a(c5928t, c5941v);
        if (C5813a0.f14908a.m12170d() != C5813a0.b.EXPLICIT_ONLY && f15547d.m12849d() > f15546c) {
            m12860h(EnumC5819d0.EVENT_THRESHOLD);
        } else if (f15549f == null) {
            f15549f = f15548e.schedule(f15550g, 15L, TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    public static final GraphRequest m12855c(final C5928t c5928t, final C5829i0 c5829i0, boolean z, final C5823f0 c5823f0) throws JSONException {
        C9801m.m32346f(c5928t, "accessTokenAppId");
        C9801m.m32346f(c5829i0, "appEvents");
        C9801m.m32346f(c5823f0, "flushState");
        String strM12760b = c5928t.m12760b();
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5670c0 c5670c0M11428o = C5672d0.m11428o(strM12760b, false);
        GraphRequest.C5632c c5632c = GraphRequest.f14159a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strM12760b}, 1));
        C9801m.m32345e(str, "java.lang.String.format(format, *args)");
        final GraphRequest graphRequestM11222A = c5632c.m11222A(null, str, null, null);
        graphRequestM11222A.m11174E(true);
        Bundle bundleM11186t = graphRequestM11222A.m11186t();
        if (bundleM11186t == null) {
            bundleM11186t = new Bundle();
        }
        bundleM11186t.putString("access_token", c5928t.m12759a());
        String strM12252d = C5825g0.f14949a.m12252d();
        if (strM12252d != null) {
            bundleM11186t.putString("device_token", strM12252d);
        }
        String strM12211i = C5815b0.f14915a.m12211i();
        if (strM12211i != null) {
            bundleM11186t.putString("install_referrer", strM12211i);
        }
        graphRequestM11222A.m11177H(bundleM11186t);
        boolean zM11410n = c5670c0M11428o != null ? c5670c0M11428o.m11410n() : false;
        C5641a0 c5641a0 = C5641a0.f14199a;
        int iM12261e = c5829i0.m12261e(graphRequestM11222A, C5641a0.m11284c(), zM11410n, z);
        if (iM12261e == 0) {
            return null;
        }
        c5823f0.m12237c(c5823f0.m12235a() + iM12261e);
        graphRequestM11222A.m11173D(new GraphRequest.InterfaceC5631b() { // from class: com.facebook.o0.f
            @Override // com.facebook.GraphRequest.InterfaceC5631b
            /* renamed from: b */
            public final void mo11196b(C5653d0 c5653d0) throws JSONException {
                C5944y.m12856d(c5928t, graphRequestM11222A, c5829i0, c5823f0, c5653d0);
            }
        });
        return graphRequestM11222A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12856d(C5928t c5928t, GraphRequest graphRequest, C5829i0 c5829i0, C5823f0 c5823f0, C5653d0 c5653d0) throws JSONException {
        C9801m.m32346f(c5928t, "$accessTokenAppId");
        C9801m.m32346f(graphRequest, "$postRequest");
        C9801m.m32346f(c5829i0, "$appEvents");
        C9801m.m32346f(c5823f0, "$flushState");
        C9801m.m32346f(c5653d0, "response");
        m12863k(c5928t, graphRequest, c5653d0, c5829i0, c5823f0);
    }

    /* renamed from: e */
    public static final List<GraphRequest> m12857e(C5942w c5942w, C5823f0 c5823f0) throws JSONException {
        C9801m.m32346f(c5942w, "appEventCollection");
        C9801m.m32346f(c5823f0, "flushResults");
        C5641a0 c5641a0 = C5641a0.f14199a;
        boolean zM11298q = C5641a0.m11298q(C5641a0.m11284c());
        ArrayList arrayList = new ArrayList();
        for (C5928t c5928t : c5942w.m12850f()) {
            C5829i0 c5829i0M12848c = c5942w.m12848c(c5928t);
            if (c5829i0M12848c == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            GraphRequest graphRequestM12855c = m12855c(c5928t, c5829i0M12848c, zM11298q, c5823f0);
            if (graphRequestM12855c != null) {
                arrayList.add(graphRequestM12855c);
                if (C5845f.f15023a.m12313e()) {
                    C5847h c5847h = C5847h.f15048a;
                    C5847h.m12340l(graphRequestM12855c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final void m12858f(final EnumC5819d0 enumC5819d0) {
        C9801m.m32346f(enumC5819d0, "reason");
        f15548e.execute(new Runnable() { // from class: com.facebook.o0.g
            @Override // java.lang.Runnable
            public final void run() {
                C5944y.m12859g(enumC5819d0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m12859g(EnumC5819d0 enumC5819d0) {
        C9801m.m32346f(enumC5819d0, "$reason");
        m12860h(enumC5819d0);
    }

    /* renamed from: h */
    public static final void m12860h(EnumC5819d0 enumC5819d0) {
        C9801m.m32346f(enumC5819d0, "reason");
        C5943x c5943x = C5943x.f15541a;
        f15547d.m12847b(C5943x.m12851a());
        try {
            C5823f0 c5823f0M12873u = m12873u(enumC5819d0, f15547d);
            if (c5823f0M12873u != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", c5823f0M12873u.m12235a());
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", c5823f0M12873u.m12236b());
                C5641a0 c5641a0 = C5641a0.f14199a;
                C0997a.m6341b(C5641a0.m11284c()).m6344d(intent);
            }
        } catch (Exception e2) {
            Log.w(f15545b, "Caught unexpected exception while flushing app events: ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m12861i() {
        f15549f = null;
        if (C5813a0.f14908a.m12170d() != C5813a0.b.EXPLICIT_ONLY) {
            m12860h(EnumC5819d0.TIMER);
        }
    }

    /* renamed from: j */
    public static final Set<C5928t> m12862j() {
        return f15547d.m12850f();
    }

    /* renamed from: k */
    public static final void m12863k(final C5928t c5928t, GraphRequest graphRequest, C5653d0 c5653d0, final C5829i0 c5829i0, C5823f0 c5823f0) throws JSONException {
        String str;
        String string;
        C9801m.m32346f(c5928t, "accessTokenAppId");
        C9801m.m32346f(graphRequest, "request");
        C9801m.m32346f(c5653d0, "response");
        C9801m.m32346f(c5829i0, "appEvents");
        C9801m.m32346f(c5823f0, "flushState");
        FacebookRequestError facebookRequestErrorM11338b = c5653d0.m11338b();
        EnumC5821e0 enumC5821e0 = EnumC5821e0.SUCCESS;
        if (facebookRequestErrorM11338b == null) {
            str = AccountAnalytics.SUCCESS;
        } else if (facebookRequestErrorM11338b.m11140b() == -1) {
            enumC5821e0 = EnumC5821e0.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{c5653d0.toString(), facebookRequestErrorM11338b.toString()}, 2));
            C9801m.m32345e(str, "java.lang.String.format(format, *args)");
            enumC5821e0 = EnumC5821e0.SERVER_ERROR;
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11306y(EnumC5659g0.APP_EVENTS)) {
            try {
                string = new JSONArray((String) graphRequest.m11188v()).toString(2);
                C9801m.m32345e(string, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
            } catch (JSONException unused) {
                string = "<Can't encode events for debug logging>";
            }
            C5684j0.a aVar = C5684j0.f14429a;
            EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
            String str2 = f15545b;
            C9801m.m32345e(str2, "TAG");
            aVar.m11455c(enumC5659g0, str2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.m11183p()), str, string);
        }
        c5829i0.m12258b(facebookRequestErrorM11338b != null);
        EnumC5821e0 enumC5821e02 = EnumC5821e0.NO_CONNECTIVITY;
        if (enumC5821e0 == enumC5821e02) {
            C5641a0 c5641a02 = C5641a0.f14199a;
            C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C5944y.m12864l(c5928t, c5829i0);
                }
            });
        }
        if (enumC5821e0 == EnumC5821e0.SUCCESS || c5823f0.m12236b() == enumC5821e02) {
            return;
        }
        c5823f0.m12238d(enumC5821e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m12864l(C5928t c5928t, C5829i0 c5829i0) {
        C9801m.m32346f(c5928t, "$accessTokenAppId");
        C9801m.m32346f(c5829i0, "$appEvents");
        C5945z c5945z = C5945z.f15551a;
        C5945z.m12874a(c5928t, c5829i0);
    }

    /* renamed from: s */
    public static final void m12871s() {
        f15548e.execute(new Runnable() { // from class: com.facebook.o0.c
            @Override // java.lang.Runnable
            public final void run() {
                C5944y.m12872t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m12872t() {
        C5945z c5945z = C5945z.f15551a;
        C5945z.m12875b(f15547d);
        f15547d = new C5942w();
    }

    /* renamed from: u */
    public static final C5823f0 m12873u(EnumC5819d0 enumC5819d0, C5942w c5942w) throws JSONException {
        C9801m.m32346f(enumC5819d0, "reason");
        C9801m.m32346f(c5942w, "appEventCollection");
        C5823f0 c5823f0 = new C5823f0();
        List<GraphRequest> listM12857e = m12857e(c5942w, c5823f0);
        if (!(!listM12857e.isEmpty())) {
            return null;
        }
        C5684j0.a aVar = C5684j0.f14429a;
        EnumC5659g0 enumC5659g0 = EnumC5659g0.APP_EVENTS;
        String str = f15545b;
        C9801m.m32345e(str, "TAG");
        aVar.m11455c(enumC5659g0, str, "Flushing %d events due to %s.", Integer.valueOf(c5823f0.m12235a()), enumC5819d0.toString());
        Iterator<GraphRequest> it = listM12857e.iterator();
        while (it.hasNext()) {
            it.next().m11179j();
        }
        return c5823f0;
    }
}
