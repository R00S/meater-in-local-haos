package w9;

import A9.k;
import B9.o;
import C9.h;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v9.C4925a;
import y9.C5143d;
import z9.C5219a;

/* compiled from: NetworkRequestMetricBuilder.java */
/* loaded from: classes2.dex */
public final class g extends com.google.firebase.perf.application.b implements z9.b {

    /* renamed from: J, reason: collision with root package name */
    private static final C4925a f51997J = C4925a.e();

    /* renamed from: B, reason: collision with root package name */
    private final List<C5219a> f51998B;

    /* renamed from: C, reason: collision with root package name */
    private final GaugeManager f51999C;

    /* renamed from: D, reason: collision with root package name */
    private final k f52000D;

    /* renamed from: E, reason: collision with root package name */
    private final h.b f52001E;

    /* renamed from: F, reason: collision with root package name */
    private final WeakReference<z9.b> f52002F;

    /* renamed from: G, reason: collision with root package name */
    private String f52003G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f52004H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f52005I;

    private g(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static g c(k kVar) {
        return new g(kVar);
    }

    private boolean g() {
        return this.f52001E.O();
    }

    private boolean h() {
        return this.f52001E.Q();
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // z9.b
    public void a(C5219a c5219a) {
        if (c5219a == null) {
            f51997J.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!g() || h()) {
                return;
            }
            this.f51998B.add(c5219a);
        }
    }

    public h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f52002F);
        unregisterForAppState();
        C9.k[] kVarArrB = C5219a.b(d());
        if (kVarArrB != null) {
            this.f52001E.L(Arrays.asList(kVarArrB));
        }
        h hVarE = this.f52001E.e();
        if (!C5143d.c(this.f52003G)) {
            f51997J.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVarE;
        }
        if (this.f52004H) {
            if (this.f52005I) {
                f51997J.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return hVarE;
        }
        this.f52000D.B(hVarE, getAppState());
        this.f52004H = true;
        return hVarE;
    }

    List<C5219a> d() {
        List<C5219a> listUnmodifiableList;
        synchronized (this.f51998B) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5219a c5219a : this.f51998B) {
                    if (c5219a != null) {
                        arrayList.add(c5219a);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listUnmodifiableList;
    }

    public long e() {
        return this.f52001E.N();
    }

    public boolean f() {
        return this.f52001E.P();
    }

    public g j(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = h.d.OPTIONS;
                    break;
                case "GET":
                    dVar = h.d.GET;
                    break;
                case "PUT":
                    dVar = h.d.PUT;
                    break;
                case "HEAD":
                    dVar = h.d.HEAD;
                    break;
                case "POST":
                    dVar = h.d.POST;
                    break;
                case "PATCH":
                    dVar = h.d.PATCH;
                    break;
                case "TRACE":
                    dVar = h.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = h.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f52001E.S(dVar);
        }
        return this;
    }

    public g k(int i10) {
        this.f52001E.T(i10);
        return this;
    }

    public g l() {
        this.f52001E.U(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public g m(long j10) {
        this.f52001E.V(j10);
        return this;
    }

    public g n(long j10) {
        C5219a c5219aPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f52002F);
        this.f52001E.R(j10);
        a(c5219aPerfSession);
        if (c5219aPerfSession.e()) {
            this.f51999C.collectGaugeMetricOnce(c5219aPerfSession.d());
        }
        return this;
    }

    public g o(String str) {
        if (str == null) {
            this.f52001E.M();
            return this;
        }
        if (i(str)) {
            this.f52001E.W(str);
        } else {
            f51997J.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public g p(long j10) {
        this.f52001E.X(j10);
        return this;
    }

    public g q(long j10) {
        this.f52001E.Y(j10);
        return this;
    }

    public g r(long j10) {
        this.f52001E.Z(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f51999C.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public g s(long j10) {
        this.f52001E.b0(j10);
        return this;
    }

    public g t(String str) {
        if (str != null) {
            this.f52001E.c0(o.e(o.d(str), 2000));
        }
        return this;
    }

    public g u(String str) {
        this.f52003G = str;
        return this;
    }

    public g(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f52001E = h.L0();
        this.f52002F = new WeakReference<>(this);
        this.f52000D = kVar;
        this.f51999C = gaugeManager;
        this.f51998B = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
