package A9;

import C9.c;
import C9.i;
import C9.m;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import j9.InterfaceC3755b;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k9.InterfaceC3810e;
import s9.C4518a;
import v9.C4925a;
import v9.C4926b;

/* compiled from: TransportManager.java */
/* loaded from: classes2.dex */
public class k implements a.b {

    /* renamed from: S, reason: collision with root package name */
    private static final C4925a f1084S = C4925a.e();

    /* renamed from: T, reason: collision with root package name */
    private static final k f1085T = new k();

    /* renamed from: B, reason: collision with root package name */
    private final Map<String, Integer> f1086B;

    /* renamed from: E, reason: collision with root package name */
    private com.google.firebase.f f1089E;

    /* renamed from: F, reason: collision with root package name */
    private s9.e f1090F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC3810e f1091G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC3755b<K6.j> f1092H;

    /* renamed from: I, reason: collision with root package name */
    private b f1093I;

    /* renamed from: K, reason: collision with root package name */
    private Context f1095K;

    /* renamed from: L, reason: collision with root package name */
    private com.google.firebase.perf.config.a f1096L;

    /* renamed from: M, reason: collision with root package name */
    private d f1097M;

    /* renamed from: N, reason: collision with root package name */
    private com.google.firebase.perf.application.a f1098N;

    /* renamed from: O, reason: collision with root package name */
    private c.b f1099O;

    /* renamed from: P, reason: collision with root package name */
    private String f1100P;

    /* renamed from: Q, reason: collision with root package name */
    private String f1101Q;

    /* renamed from: C, reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f1087C = new ConcurrentLinkedQueue<>();

    /* renamed from: D, reason: collision with root package name */
    private final AtomicBoolean f1088D = new AtomicBoolean(false);

    /* renamed from: R, reason: collision with root package name */
    private boolean f1102R = false;

    /* renamed from: J, reason: collision with root package name */
    private ExecutorService f1094J = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f1086B = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private C9.i D(i.b bVar, C9.d dVar) {
        G();
        c.b bVarP = this.f1099O.P(dVar);
        if (bVar.m() || bVar.o()) {
            bVarP = bVarP.clone().M(j());
        }
        return bVar.L(bVarP).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Context contextK = this.f1089E.k();
        this.f1095K = contextK;
        this.f1100P = contextK.getPackageName();
        this.f1096L = com.google.firebase.perf.config.a.g();
        this.f1097M = new d(this.f1095K, new B9.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f1098N = com.google.firebase.perf.application.a.b();
        this.f1093I = new b(this.f1092H, this.f1096L.a());
        h();
    }

    private void F(i.b bVar, C9.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                f1084S.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f1087C.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        C9.i iVarD = D(bVar, dVar);
        if (t(iVarD)) {
            g(iVarD);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G() {
        /*
            r4 = this;
            com.google.firebase.perf.config.a r0 = r4.f1096L
            boolean r0 = r0.K()
            if (r0 == 0) goto L70
            C9.c$b r0 = r4.f1099O
            boolean r0 = r0.L()
            if (r0 == 0) goto L15
            boolean r0 = r4.f1102R
            if (r0 != 0) goto L15
            return
        L15:
            k9.e r0 = r4.f1091G     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            z7.j r0 = r0.c()     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = z7.C5211m.b(r0, r2, r1)     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            goto L5d
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r0 = move-exception
            goto L3d
        L2b:
            r0 = move-exception
            goto L4d
        L2d:
            v9.a r1 = A9.k.f1084S
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is timed out: %s"
            r1.d(r2, r0)
            goto L5c
        L3d:
            v9.a r1 = A9.k.f1084S
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is interrupted: %s"
            r1.d(r2, r0)
            goto L5c
        L4d:
            v9.a r1 = A9.k.f1084S
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unable to retrieve Installation Id: %s"
            r1.d(r2, r0)
        L5c:
            r0 = 0
        L5d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L69
            C9.c$b r1 = r4.f1099O
            r1.O(r0)
            goto L70
        L69:
            v9.a r0 = A9.k.f1084S
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.k.G():void");
    }

    private void H() {
        if (this.f1090F == null && u()) {
            this.f1090F = s9.e.c();
        }
    }

    private void g(C9.i iVar) {
        if (iVar.m()) {
            f1084S.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.n()));
        } else {
            f1084S.g("Logging %s", n(iVar));
        }
        this.f1093I.b(iVar);
    }

    private void h() {
        this.f1098N.k(new WeakReference<>(f1085T));
        c.b bVarO0 = C9.c.o0();
        this.f1099O = bVarO0;
        bVarO0.Q(this.f1089E.n().c()).N(C9.a.h0().L(this.f1100P).M(C4518a.f49526b).N(p(this.f1095K)));
        this.f1088D.set(true);
        while (!this.f1087C.isEmpty()) {
            final c cVarPoll = this.f1087C.poll();
            if (cVarPoll != null) {
                this.f1094J.execute(new Runnable() { // from class: A9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1082B.v(cVarPoll);
                    }
                });
            }
        }
    }

    private String i(m mVar) {
        String strY0 = mVar.y0();
        return strY0.startsWith("_st_") ? C4926b.c(this.f1101Q, this.f1100P, strY0) : C4926b.a(this.f1101Q, this.f1100P, strY0);
    }

    private Map<String, String> j() {
        H();
        s9.e eVar = this.f1090F;
        return eVar != null ? eVar.b() : Collections.emptyMap();
    }

    public static k k() {
        return f1085T;
    }

    private static String l(C9.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.n0()), Integer.valueOf(gVar.k0()), Integer.valueOf(gVar.j0()));
    }

    private static String m(C9.h hVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", hVar.C0(), hVar.F0() ? String.valueOf(hVar.u0()) : "UNKNOWN", new DecimalFormat("#.####").format((hVar.J0() ? hVar.A0() : 0L) / 1000.0d));
    }

    private static String n(C9.j jVar) {
        return jVar.m() ? o(jVar.n()) : jVar.o() ? m(jVar.p()) : jVar.k() ? l(jVar.q()) : "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", mVar.y0(), new DecimalFormat("#.####").format(mVar.v0() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(C9.i iVar) {
        if (iVar.m()) {
            this.f1098N.d(B9.b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (iVar.o()) {
            this.f1098N.d(B9.b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private boolean s(C9.j jVar) {
        Integer num = this.f1086B.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = this.f1086B.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f1086B.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (jVar.m() && iIntValue > 0) {
            this.f1086B.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (jVar.o() && iIntValue2 > 0) {
            this.f1086B.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!jVar.k() || iIntValue3 <= 0) {
            f1084S.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), num, num2, num3);
            return false;
        }
        this.f1086B.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    private boolean t(C9.i iVar) {
        if (!this.f1096L.K()) {
            f1084S.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        }
        if (!iVar.f0().k0()) {
            f1084S.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        }
        if (!x9.e.b(iVar, this.f1095K)) {
            f1084S.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        }
        if (!this.f1097M.h(iVar)) {
            q(iVar);
            f1084S.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        }
        if (!this.f1097M.g(iVar)) {
            return true;
        }
        q(iVar);
        f1084S.g("Rate limited (per device) - %s", n(iVar));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(c cVar) {
        F(cVar.f1051a, cVar.f1052b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(m mVar, C9.d dVar) {
        F(C9.i.h0().O(mVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(C9.h hVar, C9.d dVar) {
        F(C9.i.h0().N(hVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(C9.g gVar, C9.d dVar) {
        F(C9.i.h0().M(gVar), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f1097M.a(this.f1102R);
    }

    public void A(final C9.g gVar, final C9.d dVar) {
        this.f1094J.execute(new Runnable() { // from class: A9.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f1072B.y(gVar, dVar);
            }
        });
    }

    public void B(final C9.h hVar, final C9.d dVar) {
        this.f1094J.execute(new Runnable() { // from class: A9.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f1078B.x(hVar, dVar);
            }
        });
    }

    public void C(final m mVar, final C9.d dVar) {
        this.f1094J.execute(new Runnable() { // from class: A9.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f1075B.w(mVar, dVar);
            }
        });
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(C9.d dVar) {
        this.f1102R = dVar == C9.d.FOREGROUND;
        if (u()) {
            this.f1094J.execute(new Runnable() { // from class: A9.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1071B.z();
                }
            });
        }
    }

    public void r(com.google.firebase.f fVar, InterfaceC3810e interfaceC3810e, InterfaceC3755b<K6.j> interfaceC3755b) {
        this.f1089E = fVar;
        this.f1101Q = fVar.n().e();
        this.f1091G = interfaceC3810e;
        this.f1092H = interfaceC3755b;
        this.f1094J.execute(new Runnable() { // from class: A9.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f1081B.E();
            }
        });
    }

    public boolean u() {
        return this.f1088D.get();
    }
}
