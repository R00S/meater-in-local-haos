package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.AbstractC9375c4;
import io.sentry.C9436f5;
import io.sentry.C9489j1;
import io.sentry.C9506l4;
import io.sentry.C9513m4;
import io.sentry.C9517n1;
import io.sentry.C9657v0;
import io.sentry.C9692z4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9590t0;
import io.sentry.android.core.C9346t0;
import io.sentry.android.core.internal.util.C9316m;
import io.sentry.cache.C9395s;
import io.sentry.cache.C9396t;
import io.sentry.hints.InterfaceC9452b;
import io.sentry.hints.InterfaceC9454d;
import io.sentry.protocol.C9539a;
import io.sentry.protocol.C9540a0;
import io.sentry.protocol.C9543c;
import io.sentry.protocol.C9545d;
import io.sentry.protocol.C9546e;
import io.sentry.protocol.C9550i;
import io.sentry.protocol.C9552k;
import io.sentry.protocol.C9553l;
import io.sentry.protocol.C9556o;
import io.sentry.protocol.C9563v;
import io.sentry.protocol.C9564w;
import io.sentry.protocol.C9565x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9642m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AnrV2EventProcessor.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.p0 */
/* loaded from: classes2.dex */
public final class C9338p0 implements InterfaceC9590t0 {

    /* renamed from: f */
    private final Context f36086f;

    /* renamed from: g */
    private final SentryAndroidOptions f36087g;

    /* renamed from: h */
    private final C9344s0 f36088h;

    /* renamed from: i */
    private final C9513m4 f36089i;

    public C9338p0(Context context, SentryAndroidOptions sentryAndroidOptions, C9344s0 c9344s0) {
        this.f36086f = context;
        this.f36087g = sentryAndroidOptions;
        this.f36088h = c9344s0;
        this.f36089i = new C9513m4(new C9692z4(sentryAndroidOptions));
    }

    /* renamed from: A */
    private void m30355A(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30582J() == null) {
            abstractC9375c4.m30597Y((String) C9395s.m30646v(this.f36087g, "release.json", String.class));
        }
    }

    /* renamed from: B */
    private void m30356B(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30583K() == null) {
            abstractC9375c4.m30598Z((C9553l) C9396t.m30669q(this.f36087g, "request.json", C9553l.class));
        }
    }

    /* renamed from: C */
    private void m30357C(AbstractC9375c4 abstractC9375c4) {
        Map map = (Map) C9396t.m30669q(this.f36087g, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC9375c4.m30586N() == null) {
            abstractC9375c4.m30602d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC9375c4.m30586N().containsKey(entry.getKey())) {
                abstractC9375c4.m30601c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: D */
    private void m30358D(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30584L() == null) {
            abstractC9375c4.m30599a0((C9556o) C9395s.m30646v(this.f36087g, "sdk-version.json", C9556o.class));
        }
    }

    /* renamed from: E */
    private void m30359E(AbstractC9375c4 abstractC9375c4) {
        try {
            C9346t0.a aVarM30424p = C9346t0.m30424p(this.f36086f, this.f36087g.getLogger(), this.f36088h);
            if (aVarM30424p != null) {
                for (Map.Entry<String, String> entry : aVarM30424p.m30426a().entrySet()) {
                    abstractC9375c4.m30601c0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.f36087g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting side loaded info.", th);
        }
    }

    /* renamed from: F */
    private void m30360F(C9506l4 c9506l4) {
        m30374m(c9506l4);
        m30359E(c9506l4);
    }

    /* renamed from: G */
    private void m30361G(C9506l4 c9506l4) {
        C9436f5 c9436f5 = (C9436f5) C9396t.m30669q(this.f36087g, "trace.json", C9436f5.class);
        if (c9506l4.m30575C().m31234e() != null || c9436f5 == null || c9436f5.m30800h() == null || c9436f5.m30803k() == null) {
            return;
        }
        c9506l4.m30575C().m31242n(c9436f5);
    }

    /* renamed from: H */
    private void m30362H(C9506l4 c9506l4) {
        String str = (String) C9396t.m30669q(this.f36087g, "transaction.json", String.class);
        if (c9506l4.m31005t0() == null) {
            c9506l4.m30998E0(str);
        }
    }

    /* renamed from: I */
    private void m30363I(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30589Q() == null) {
            abstractC9375c4.m30603e0((C9540a0) C9396t.m30669q(this.f36087g, "user.json", C9540a0.class));
        }
    }

    /* renamed from: a */
    private void m30364a(C9506l4 c9506l4, Object obj) {
        m30355A(c9506l4);
        m30381t(c9506l4);
        m30380s(c9506l4);
        m30378q(c9506l4);
        m30358D(c9506l4);
        m30375n(c9506l4, obj);
        m30386y(c9506l4);
    }

    /* renamed from: c */
    private void m30365c(C9506l4 c9506l4) {
        m30356B(c9506l4);
        m30363I(c9506l4);
        m30357C(c9506l4);
        m30376o(c9506l4);
        m30383v(c9506l4);
        m30377p(c9506l4);
        m30362H(c9506l4);
        m30384w(c9506l4);
        m30385x(c9506l4);
        m30361G(c9506l4);
    }

    /* renamed from: d */
    private C9564w m30366d(List<C9564w> list) {
        if (list == null) {
            return null;
        }
        for (C9564w c9564w : list) {
            String strM31517m = c9564w.m31517m();
            if (strM31517m != null && strM31517m.equals("main")) {
                return c9564w;
            }
        }
        return null;
    }

    /* renamed from: f */
    private C9540a0 m30367f() {
        C9540a0 c9540a0 = new C9540a0();
        c9540a0.m31219n(m30369h());
        return c9540a0;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    private C9546e m30368g() {
        C9546e c9546e = new C9546e();
        if (this.f36087g.isSendDefaultPii()) {
            c9546e.m31330g0(C9346t0.m30412d(this.f36086f, this.f36088h));
        }
        c9546e.m31326c0(Build.MANUFACTURER);
        c9546e.m31314Q(Build.BRAND);
        c9546e.m31319V(C9346t0.m30414f(this.f36087g.getLogger()));
        c9546e.m31328e0(Build.MODEL);
        c9546e.m31329f0(Build.ID);
        c9546e.m31310M(C9346t0.m30411c(this.f36088h));
        ActivityManager.MemoryInfo memoryInfoM30416h = C9346t0.m30416h(this.f36086f, this.f36087g.getLogger());
        if (memoryInfoM30416h != null) {
            c9546e.m31327d0(m30370i(memoryInfoM30416h));
        }
        c9546e.m31339p0(this.f36088h.m30408f());
        DisplayMetrics displayMetricsM30413e = C9346t0.m30413e(this.f36086f, this.f36087g.getLogger());
        if (displayMetricsM30413e != null) {
            c9546e.m31338o0(Integer.valueOf(displayMetricsM30413e.widthPixels));
            c9546e.m31337n0(Integer.valueOf(displayMetricsM30413e.heightPixels));
            c9546e.m31335l0(Float.valueOf(displayMetricsM30413e.density));
            c9546e.m31336m0(Integer.valueOf(displayMetricsM30413e.densityDpi));
        }
        if (c9546e.m31307J() == null) {
            c9546e.m31322Y(m30369h());
        }
        List<Integer> listM30290c = C9316m.m30288a().m30290c();
        if (!listM30290c.isEmpty()) {
            c9546e.m31334k0(Double.valueOf(((Integer) Collections.max(listM30290c)).doubleValue()));
            c9546e.m31333j0(Integer.valueOf(listM30290c.size()));
        }
        return c9546e;
    }

    /* renamed from: h */
    private String m30369h() {
        try {
            return C9262a1.m30148a(this.f36086f);
        } catch (Throwable th) {
            this.f36087g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    private Long m30370i(ActivityManager.MemoryInfo memoryInfo) {
        return this.f36088h.m30406d() >= 16 ? Long.valueOf(memoryInfo.totalMem) : Long.valueOf(Runtime.getRuntime().totalMemory());
    }

    /* renamed from: j */
    private C9552k m30371j() {
        C9552k c9552k = new C9552k();
        c9552k.m31391j("Android");
        c9552k.m31394m(Build.VERSION.RELEASE);
        c9552k.m31389h(Build.DISPLAY);
        try {
            c9552k.m31390i(C9346t0.m30415g(this.f36087g.getLogger()));
        } catch (Throwable th) {
            this.f36087g.getLogger().mo30213b(EnumC9587s4.ERROR, "Error getting OperatingSystem.", th);
        }
        return c9552k;
    }

    /* renamed from: k */
    private boolean m30372k(Object obj) {
        if (obj instanceof InterfaceC9452b) {
            return "anr_background".equals(((InterfaceC9452b) obj).mo30104f());
        }
        return false;
    }

    /* renamed from: l */
    private void m30373l(AbstractC9375c4 abstractC9375c4) {
        String str;
        C9552k c9552kM31232c = abstractC9375c4.m30575C().m31232c();
        abstractC9375c4.m30575C().m31239k(m30371j());
        if (c9552kM31232c != null) {
            String strM31388g = c9552kM31232c.m31388g();
            if (strM31388g == null || strM31388g.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strM31388g.trim().toLowerCase(Locale.ROOT);
            }
            abstractC9375c4.m30575C().put(str, c9552kM31232c);
        }
    }

    /* renamed from: m */
    private void m30374m(AbstractC9375c4 abstractC9375c4) {
        if (this.f36087g.isSendDefaultPii()) {
            if (abstractC9375c4.m30589Q() == null) {
                C9540a0 c9540a0 = new C9540a0();
                c9540a0.m31220o("{{auto}}");
                abstractC9375c4.m30603e0(c9540a0);
            } else if (abstractC9375c4.m30589Q().m31217l() == null) {
                abstractC9375c4.m30589Q().m31220o("{{auto}}");
            }
        }
        C9540a0 c9540a0M30589Q = abstractC9375c4.m30589Q();
        if (c9540a0M30589Q == null) {
            abstractC9375c4.m30603e0(m30367f());
        } else if (c9540a0M30589Q.m31216k() == null) {
            c9540a0M30589Q.m31219n(m30369h());
        }
    }

    /* renamed from: n */
    private void m30375n(AbstractC9375c4 abstractC9375c4, Object obj) {
        C9539a c9539aM31230a = abstractC9375c4.m30575C().m31230a();
        if (c9539aM31230a == null) {
            c9539aM31230a = new C9539a();
        }
        c9539aM31230a.m31198m(C9346t0.m30410b(this.f36086f, this.f36087g.getLogger()));
        c9539aM31230a.m31201p(Boolean.valueOf(!m30372k(obj)));
        PackageInfo packageInfoM30418j = C9346t0.m30418j(this.f36086f, this.f36087g.getLogger(), this.f36088h);
        if (packageInfoM30418j != null) {
            c9539aM31230a.m31197l(packageInfoM30418j.packageName);
        }
        String strM30582J = abstractC9375c4.m30582J() != null ? abstractC9375c4.m30582J() : (String) C9395s.m30646v(this.f36087g, "release.json", String.class);
        if (strM30582J != null) {
            try {
                String strSubstring = strM30582J.substring(strM30582J.indexOf(64) + 1, strM30582J.indexOf(43));
                String strSubstring2 = strM30582J.substring(strM30582J.indexOf(43) + 1);
                c9539aM31230a.m31200o(strSubstring);
                c9539aM31230a.m31196k(strSubstring2);
            } catch (Throwable unused) {
                this.f36087g.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to parse release from scope cache: %s", strM30582J);
            }
        }
        abstractC9375c4.m30575C().m31235f(c9539aM31230a);
    }

    /* renamed from: o */
    private void m30376o(AbstractC9375c4 abstractC9375c4) {
        List list = (List) C9396t.m30670r(this.f36087g, "breadcrumbs.json", List.class, new C9657v0.a());
        if (list == null) {
            return;
        }
        if (abstractC9375c4.m30574B() == null) {
            abstractC9375c4.m30590R(new ArrayList(list));
        } else {
            abstractC9375c4.m30574B().addAll(list);
        }
    }

    /* renamed from: p */
    private void m30377p(AbstractC9375c4 abstractC9375c4) {
        C9543c c9543c = (C9543c) C9396t.m30669q(this.f36087g, "contexts.json", C9543c.class);
        if (c9543c == null) {
            return;
        }
        C9543c c9543cM30575C = abstractC9375c4.m30575C();
        for (Map.Entry<String, Object> entry : new C9543c(c9543c).entrySet()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof C9436f5)) {
                if (!c9543cM30575C.containsKey(entry.getKey())) {
                    c9543cM30575C.put(entry.getKey(), value);
                }
            }
        }
    }

    /* renamed from: q */
    private void m30378q(AbstractC9375c4 abstractC9375c4) {
        C9545d c9545dM30576D = abstractC9375c4.m30576D();
        if (c9545dM30576D == null) {
            c9545dM30576D = new C9545d();
        }
        if (c9545dM30576D.m31268c() == null) {
            c9545dM30576D.m31269d(new ArrayList());
        }
        List<DebugImage> listM31268c = c9545dM30576D.m31268c();
        if (listM31268c != null) {
            String str = (String) C9395s.m30646v(this.f36087g, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listM31268c.add(debugImage);
            }
            abstractC9375c4.m30591S(c9545dM30576D);
        }
    }

    /* renamed from: r */
    private void m30379r(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30575C().m31231b() == null) {
            abstractC9375c4.m30575C().m31237i(m30368g());
        }
    }

    /* renamed from: s */
    private void m30380s(AbstractC9375c4 abstractC9375c4) {
        String str;
        if (abstractC9375c4.m30577E() == null) {
            abstractC9375c4.m30592T((String) C9395s.m30646v(this.f36087g, "dist.json", String.class));
        }
        if (abstractC9375c4.m30577E() != null || (str = (String) C9395s.m30646v(this.f36087g, "release.json", String.class)) == null) {
            return;
        }
        try {
            abstractC9375c4.m30592T(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f36087g.getLogger().mo30214c(EnumC9587s4.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    /* renamed from: t */
    private void m30381t(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30578F() == null) {
            String environment = (String) C9395s.m30646v(this.f36087g, "environment.json", String.class);
            if (environment == null) {
                environment = this.f36087g.getEnvironment();
            }
            abstractC9375c4.m30593U(environment);
        }
    }

    /* renamed from: u */
    private void m30382u(C9506l4 c9506l4, Object obj) {
        C9550i c9550i = new C9550i();
        if (((InterfaceC9454d) obj).mo30109a()) {
            c9550i.m31372j("AppExitInfo");
        } else {
            c9550i.m31372j("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (m30372k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        C9564w c9564wM30366d = m30366d(c9506l4.m31004s0());
        if (c9564wM30366d == null) {
            c9564wM30366d = new C9564w();
            c9564wM30366d.m31529y(new C9563v());
        }
        c9506l4.m31009x0(this.f36089i.m31067e(c9564wM30366d, c9550i, applicationNotResponding));
    }

    /* renamed from: v */
    private void m30383v(AbstractC9375c4 abstractC9375c4) {
        Map map = (Map) C9396t.m30669q(this.f36087g, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC9375c4.m30580H() == null) {
            abstractC9375c4.m30595W(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC9375c4.m30580H().containsKey(entry.getKey())) {
                abstractC9375c4.m30580H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: w */
    private void m30384w(C9506l4 c9506l4) {
        List<String> list = (List) C9396t.m30669q(this.f36087g, "fingerprint.json", List.class);
        if (c9506l4.m31001p0() == null) {
            c9506l4.m31010y0(list);
        }
    }

    /* renamed from: x */
    private void m30385x(C9506l4 c9506l4) {
        EnumC9587s4 enumC9587s4 = (EnumC9587s4) C9396t.m30669q(this.f36087g, "level.json", EnumC9587s4.class);
        if (c9506l4.m31002q0() == null) {
            c9506l4.m31011z0(enumC9587s4);
        }
    }

    /* renamed from: y */
    private void m30386y(AbstractC9375c4 abstractC9375c4) {
        Map map = (Map) C9395s.m30646v(this.f36087g, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (abstractC9375c4.m30586N() == null) {
            abstractC9375c4.m30602d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!abstractC9375c4.m30586N().containsKey(entry.getKey())) {
                abstractC9375c4.m30601c0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: z */
    private void m30387z(AbstractC9375c4 abstractC9375c4) {
        if (abstractC9375c4.m30581I() == null) {
            abstractC9375c4.m30596X("java");
        }
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        Object objM31780c = C9642m.m31780c(c9517n1);
        if (!(objM31780c instanceof InterfaceC9454d)) {
            this.f36087g.getLogger().mo30214c(EnumC9587s4.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c9506l4;
        }
        m30382u(c9506l4, objM31780c);
        m30387z(c9506l4);
        m30373l(c9506l4);
        m30379r(c9506l4);
        if (!((InterfaceC9454d) objM31780c).mo30109a()) {
            this.f36087g.getLogger().mo30214c(EnumC9587s4.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c9506l4;
        }
        m30365c(c9506l4);
        m30364a(c9506l4, objM31780c);
        m30360F(c9506l4);
        return c9506l4;
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public /* synthetic */ C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        return C9489j1.m30876a(this, c9565x, c9517n1);
    }
}
