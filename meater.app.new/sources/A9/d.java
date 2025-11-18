package A9;

import B9.l;
import B9.o;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import v9.C4925a;

/* compiled from: RateLimiter.java */
/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f1053a;

    /* renamed from: b, reason: collision with root package name */
    private final double f1054b;

    /* renamed from: c, reason: collision with root package name */
    private final double f1055c;

    /* renamed from: d, reason: collision with root package name */
    private a f1056d;

    /* renamed from: e, reason: collision with root package name */
    private a f1057e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1058f;

    /* compiled from: RateLimiter.java */
    static class a {

        /* renamed from: k, reason: collision with root package name */
        private static final C4925a f1059k = C4925a.e();

        /* renamed from: l, reason: collision with root package name */
        private static final long f1060l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a, reason: collision with root package name */
        private final B9.a f1061a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1062b;

        /* renamed from: c, reason: collision with root package name */
        private l f1063c;

        /* renamed from: d, reason: collision with root package name */
        private B9.i f1064d;

        /* renamed from: e, reason: collision with root package name */
        private long f1065e;

        /* renamed from: f, reason: collision with root package name */
        private double f1066f;

        /* renamed from: g, reason: collision with root package name */
        private B9.i f1067g;

        /* renamed from: h, reason: collision with root package name */
        private B9.i f1068h;

        /* renamed from: i, reason: collision with root package name */
        private long f1069i;

        /* renamed from: j, reason: collision with root package name */
        private long f1070j;

        a(B9.i iVar, long j10, B9.a aVar, com.google.firebase.perf.config.a aVar2, String str, boolean z10) {
            this.f1061a = aVar;
            this.f1065e = j10;
            this.f1064d = iVar;
            this.f1066f = j10;
            this.f1063c = aVar.a();
            g(aVar2, str, z10);
            this.f1062b = z10;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            long jF = f(aVar, str);
            long jE = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            B9.i iVar = new B9.i(jE, jF, timeUnit);
            this.f1067g = iVar;
            this.f1069i = jE;
            if (z10) {
                f1059k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(jE));
            }
            long jD = d(aVar, str);
            long jC = c(aVar, str);
            B9.i iVar2 = new B9.i(jC, jD, timeUnit);
            this.f1068h = iVar2;
            this.f1070j = jC;
            if (z10) {
                f1059k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(jC));
            }
        }

        synchronized void a(boolean z10) {
            try {
                this.f1064d = z10 ? this.f1067g : this.f1068h;
                this.f1065e = z10 ? this.f1069i : this.f1070j;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean b(C9.i iVar) {
            try {
                l lVarA = this.f1061a.a();
                double d10 = (this.f1063c.d(lVarA) * this.f1064d.a()) / f1060l;
                if (d10 > 0.0d) {
                    this.f1066f = Math.min(this.f1066f + d10, this.f1065e);
                    this.f1063c = lVarA;
                }
                double d11 = this.f1066f;
                if (d11 >= 1.0d) {
                    this.f1066f = d11 - 1.0d;
                    return true;
                }
                if (this.f1062b) {
                    f1059k.j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d(Context context, B9.i iVar, long j10) {
        this(iVar, j10, new B9.a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f1058f = o.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean c(List<C9.k> list) {
        return list.size() > 0 && list.get(0).g0() > 0 && list.get(0).f0(0) == C9.l.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean d() {
        return this.f1055c < this.f1053a.f();
    }

    private boolean e() {
        return this.f1054b < this.f1053a.s();
    }

    private boolean f() {
        return this.f1054b < this.f1053a.G();
    }

    void a(boolean z10) {
        this.f1056d.a(z10);
        this.f1057e.a(z10);
    }

    boolean g(C9.i iVar) {
        if (!j(iVar)) {
            return false;
        }
        if (iVar.o()) {
            return !this.f1057e.b(iVar);
        }
        if (iVar.m()) {
            return !this.f1056d.b(iVar);
        }
        return true;
    }

    boolean h(C9.i iVar) {
        if (iVar.m() && !f() && !c(iVar.n().z0())) {
            return false;
        }
        if (!i(iVar) || d() || c(iVar.n().z0())) {
            return !iVar.o() || e() || c(iVar.p().v0());
        }
        return false;
    }

    protected boolean i(C9.i iVar) {
        return iVar.m() && iVar.n().y0().startsWith("_st_") && iVar.n().o0("Hosting_activity");
    }

    boolean j(C9.i iVar) {
        return (!iVar.m() || (!(iVar.n().y0().equals(B9.c.FOREGROUND_TRACE_NAME.toString()) || iVar.n().y0().equals(B9.c.BACKGROUND_TRACE_NAME.toString())) || iVar.n().r0() <= 0)) && !iVar.k();
    }

    d(B9.i iVar, long j10, B9.a aVar, double d10, double d11, com.google.firebase.perf.config.a aVar2) {
        this.f1056d = null;
        this.f1057e = null;
        boolean z10 = false;
        this.f1058f = false;
        o.a(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f1054b = d10;
        this.f1055c = d11;
        this.f1053a = aVar2;
        this.f1056d = new a(iVar, j10, aVar, aVar2, "Trace", this.f1058f);
        this.f1057e = new a(iVar, j10, aVar, aVar2, "Network", this.f1058f);
    }
}
