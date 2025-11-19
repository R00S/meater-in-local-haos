package com.google.firebase.perf.config;

import android.content.Context;
import s9.C4518a;
import v9.C4925a;

/* compiled from: ConfigResolver.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final C4925a f38468d = C4925a.e();

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f38469e;

    /* renamed from: a, reason: collision with root package name */
    private final RemoteConfigManager f38470a;

    /* renamed from: b, reason: collision with root package name */
    private B9.f f38471b;

    /* renamed from: c, reason: collision with root package name */
    private x f38472c;

    public a(RemoteConfigManager remoteConfigManager, B9.f fVar, x xVar) {
        this.f38470a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f38471b = fVar == null ? new B9.f() : fVar;
        this.f38472c = xVar == null ? x.e() : xVar;
    }

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(C4518a.f49526b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private B9.g<Boolean> b(v<Boolean> vVar) {
        return this.f38472c.b(vVar.a());
    }

    private B9.g<Double> c(v<Double> vVar) {
        return this.f38472c.c(vVar.a());
    }

    private B9.g<Long> d(v<Long> vVar) {
        return this.f38472c.f(vVar.a());
    }

    private B9.g<String> e(v<String> vVar) {
        return this.f38472c.g(vVar.a());
    }

    public static synchronized a g() {
        try {
            if (f38469e == null) {
                f38469e = new a(null, null, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38469e;
    }

    private boolean k() {
        l lVarE = l.e();
        B9.g<Boolean> gVarB = b(lVarE);
        B9.g<Boolean> gVarU = u(lVarE);
        if (!gVarU.d()) {
            return gVarB.d() ? gVarB.c().booleanValue() : lVarE.d().booleanValue();
        }
        if (this.f38470a.isLastFetchFailed()) {
            return false;
        }
        Boolean boolC = gVarU.c();
        if (gVarB == null || !gVarB.d() || gVarB.c() != boolC) {
            this.f38472c.m(lVarE.a(), boolC.booleanValue());
        }
        return boolC.booleanValue();
    }

    private boolean l() {
        k kVarE = k.e();
        B9.g<String> gVarE = e(kVarE);
        B9.g<String> gVarX = x(kVarE);
        if (!gVarX.d()) {
            return gVarE.d() ? I(gVarE.c()) : I(kVarE.d());
        }
        String strC = gVarX.c();
        if (gVarE == null || !gVarE.d() || !gVarE.c().equals(strC)) {
            this.f38472c.l(kVarE.a(), strC);
        }
        return I(strC);
    }

    private B9.g<Boolean> n(v<Boolean> vVar) {
        return this.f38471b.b(vVar.b());
    }

    private B9.g<Double> o(v<Double> vVar) {
        return this.f38471b.c(vVar.b());
    }

    private B9.g<Long> p(v<Long> vVar) {
        return this.f38471b.e(vVar.b());
    }

    private B9.g<Boolean> u(v<Boolean> vVar) {
        return this.f38470a.getBoolean(vVar.c());
    }

    private B9.g<Double> v(v<Double> vVar) {
        return this.f38470a.getDouble(vVar.c());
    }

    private B9.g<Long> w(v<Long> vVar) {
        return this.f38470a.getLong(vVar.c());
    }

    private B9.g<String> x(v<String> vVar) {
        return this.f38470a.getString(vVar.c());
    }

    public long A() {
        o oVarE = o.e();
        B9.g<Long> gVarP = p(oVarE);
        if (gVarP.d() && M(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        B9.g<Long> gVarW = w(oVarE);
        if (gVarW.d() && M(gVarW.c().longValue())) {
            this.f38472c.k(oVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(oVarE);
        return (gVarD.d() && M(gVarD.c().longValue())) ? gVarD.c().longValue() : oVarE.d().longValue();
    }

    public long B() {
        p pVarE = p.e();
        B9.g<Long> gVarP = p(pVarE);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        B9.g<Long> gVarW = w(pVarE);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f38472c.k(pVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(pVarE);
        return (gVarD.d() && J(gVarD.c().longValue())) ? gVarD.c().longValue() : pVarE.d().longValue();
    }

    public long C() {
        q qVarF = q.f();
        B9.g<Long> gVarP = p(qVarF);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        B9.g<Long> gVarW = w(qVarF);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f38472c.k(qVarF.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(qVarF);
        return (gVarD.d() && J(gVarD.c().longValue())) ? gVarD.c().longValue() : this.f38470a.isLastFetchFailed() ? qVarF.e().longValue() : qVarF.d().longValue();
    }

    public double D() {
        r rVarF = r.f();
        B9.g<Double> gVarO = o(rVarF);
        if (gVarO.d()) {
            double dDoubleValue = gVarO.c().doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        B9.g<Double> gVarV = v(rVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f38472c.j(rVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        B9.g<Double> gVarC = c(rVarF);
        return (gVarC.d() && L(gVarC.c().doubleValue())) ? gVarC.c().doubleValue() : this.f38470a.isLastFetchFailed() ? rVarF.e().doubleValue() : rVarF.d().doubleValue();
    }

    public long E() {
        s sVarE = s.e();
        B9.g<Long> gVarW = w(sVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f38472c.k(sVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(sVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : sVarE.d().longValue();
    }

    public long F() {
        t tVarE = t.e();
        B9.g<Long> gVarW = w(tVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f38472c.k(tVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(tVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : tVarE.d().longValue();
    }

    public double G() {
        u uVarF = u.f();
        B9.g<Double> gVarV = v(uVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f38472c.j(uVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        B9.g<Double> gVarC = c(uVarF);
        return (gVarC.d() && L(gVarC.c().doubleValue())) ? gVarC.c().doubleValue() : this.f38470a.isLastFetchFailed() ? uVarF.e().doubleValue() : uVarF.d().doubleValue();
    }

    public boolean K() {
        Boolean boolJ = j();
        return (boolJ == null || boolJ.booleanValue()) && m();
    }

    public void O(Context context) {
        f38468d.i(B9.o.b(context));
        this.f38472c.i(context);
    }

    public void P(B9.f fVar) {
        this.f38471b = fVar;
    }

    public String a() {
        String strF;
        f fVarE = f.e();
        if (C4518a.f49525a.booleanValue()) {
            return fVarE.d();
        }
        String strC = fVarE.c();
        long jLongValue = strC != null ? ((Long) this.f38470a.getRemoteConfigValueOrDefault(strC, -1L)).longValue() : -1L;
        String strA = fVarE.a();
        if (!f.g(jLongValue) || (strF = f.f(jLongValue)) == null) {
            B9.g<String> gVarE = e(fVarE);
            return gVarE.d() ? gVarE.c() : fVarE.d();
        }
        this.f38472c.l(strA, strF);
        return strF;
    }

    public double f() {
        e eVarE = e.e();
        B9.g<Double> gVarO = o(eVarE);
        if (gVarO.d()) {
            double dDoubleValue = gVarO.c().doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        B9.g<Double> gVarV = v(eVarE);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f38472c.j(eVarE.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        B9.g<Double> gVarC = c(eVarE);
        return (gVarC.d() && L(gVarC.c().doubleValue())) ? gVarC.c().doubleValue() : eVarE.d().doubleValue();
    }

    public boolean h() {
        d dVarE = d.e();
        B9.g<Boolean> gVarN = n(dVarE);
        if (gVarN.d()) {
            return gVarN.c().booleanValue();
        }
        B9.g<Boolean> gVarU = u(dVarE);
        if (gVarU.d()) {
            this.f38472c.m(dVarE.a(), gVarU.c().booleanValue());
            return gVarU.c().booleanValue();
        }
        B9.g<Boolean> gVarB = b(dVarE);
        return gVarB.d() ? gVarB.c().booleanValue() : dVarE.d().booleanValue();
    }

    public Boolean i() {
        b bVarE = b.e();
        B9.g<Boolean> gVarN = n(bVarE);
        return gVarN.d() ? gVarN.c() : bVarE.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarD = c.d();
        B9.g<Boolean> gVarB = b(cVarD);
        if (gVarB.d()) {
            return gVarB.c();
        }
        B9.g<Boolean> gVarN = n(cVarD);
        if (gVarN.d()) {
            return gVarN.c();
        }
        return null;
    }

    public boolean m() {
        return k() && !l();
    }

    public long q() {
        g gVarE = g.e();
        B9.g<Long> gVarW = w(gVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f38472c.k(gVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(gVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : gVarE.d().longValue();
    }

    public long r() {
        h hVarE = h.e();
        B9.g<Long> gVarW = w(hVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f38472c.k(hVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(hVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : hVarE.d().longValue();
    }

    public double s() {
        i iVarF = i.f();
        B9.g<Double> gVarV = v(iVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f38472c.j(iVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        B9.g<Double> gVarC = c(iVarF);
        return (gVarC.d() && L(gVarC.c().doubleValue())) ? gVarC.c().doubleValue() : this.f38470a.isLastFetchFailed() ? iVarF.e().doubleValue() : iVarF.d().doubleValue();
    }

    public long t() {
        j jVarE = j.e();
        B9.g<Long> gVarW = w(jVarE);
        if (gVarW.d() && N(gVarW.c().longValue())) {
            this.f38472c.k(jVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(jVarE);
        return (gVarD.d() && N(gVarD.c().longValue())) ? gVarD.c().longValue() : jVarE.d().longValue();
    }

    public long y() {
        m mVarE = m.e();
        B9.g<Long> gVarP = p(mVarE);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        B9.g<Long> gVarW = w(mVarE);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f38472c.k(mVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(mVarE);
        return (gVarD.d() && J(gVarD.c().longValue())) ? gVarD.c().longValue() : mVarE.d().longValue();
    }

    public long z() {
        n nVarF = n.f();
        B9.g<Long> gVarP = p(nVarF);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        B9.g<Long> gVarW = w(nVarF);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f38472c.k(nVarF.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        B9.g<Long> gVarD = d(nVarF);
        return (gVarD.d() && J(gVarD.c().longValue())) ? gVarD.c().longValue() : this.f38470a.isLastFetchFailed() ? nVarF.e().longValue() : nVarF.d().longValue();
    }
}
