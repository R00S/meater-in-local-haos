package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C2569r2;
import com.google.android.gms.internal.measurement.C2577s2;
import com.google.android.gms.internal.measurement.C2585t2;
import com.google.android.gms.internal.measurement.C2601v2;
import com.google.android.gms.internal.measurement.C2609w2;
import com.google.android.gms.internal.measurement.C2617x2;
import com.google.android.gms.internal.measurement.e7;
import g7.C3445p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2775j4 extends AbstractC2873x5 {
    public C2775j4(C2880y5 c2880y5) {
        super(c2880y5);
    }

    private static String d(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }

    public final byte[] z(J j10, String str) {
        R5 next;
        Bundle bundle;
        C2609w2.a aVar;
        C2828r2 c2828r2;
        C2601v2.b bVar;
        byte[] bArr;
        long j11;
        G gA;
        n();
        this.f35457a.n();
        C3445p.k(j10);
        C3445p.e(str);
        if (!"_iap".equals(j10.f34889B) && !"_iapx".equals(j10.f34889B)) {
            k().G().c("Generating a payload for this event is not available. package_name, event_name", str, j10.f34889B);
            return null;
        }
        C2601v2.b bVarQ = C2601v2.Q();
        r().o1();
        try {
            C2828r2 c2828r2V0 = r().V0(str);
            if (c2828r2V0 == null) {
                k().G().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!c2828r2V0.A()) {
                k().G().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C2609w2.a aVarJ1 = C2609w2.I2().H0(1).j1("android");
            if (!TextUtils.isEmpty(c2828r2V0.l())) {
                aVarJ1.Z(c2828r2V0.l());
            }
            if (!TextUtils.isEmpty(c2828r2V0.n())) {
                aVarJ1.o0((String) C3445p.k(c2828r2V0.n()));
            }
            if (!TextUtils.isEmpty(c2828r2V0.o())) {
                aVarJ1.w0((String) C3445p.k(c2828r2V0.o()));
            }
            if (c2828r2V0.V() != -2147483648L) {
                aVarJ1.s0((int) c2828r2V0.V());
            }
            aVarJ1.D0(c2828r2V0.A0()).t0(c2828r2V0.w0());
            String strQ = c2828r2V0.q();
            String strJ = c2828r2V0.j();
            if (!TextUtils.isEmpty(strQ)) {
                aVarJ1.d1(strQ);
            } else if (!TextUtils.isEmpty(strJ)) {
                aVarJ1.N(strJ);
            }
            aVarJ1.V0(c2828r2V0.K0());
            C2823q3 c2823q3E0 = this.f35538b.e0(str);
            aVarJ1.m0(c2828r2V0.u0());
            if (this.f35457a.s() && c().Q(aVarJ1.r1()) && c2823q3E0.w() && !TextUtils.isEmpty(null)) {
                aVarJ1.S0(null);
            }
            aVarJ1.E0(c2823q3E0.u());
            if (c2823q3E0.w() && c2828r2V0.z()) {
                Pair<String, Boolean> pairA = t().A(c2828r2V0.l(), c2823q3E0);
                if (c2828r2V0.z() && pairA != null && !TextUtils.isEmpty((CharSequence) pairA.first)) {
                    aVarJ1.l1(d((String) pairA.first, Long.toString(j10.f34892E)));
                    Object obj = pairA.second;
                    if (obj != null) {
                        aVarJ1.j0(((Boolean) obj).booleanValue());
                    }
                }
            }
            e().q();
            C2609w2.a aVarN0 = aVarJ1.N0(Build.MODEL);
            e().q();
            aVarN0.h1(Build.VERSION.RELEASE).Q0((int) e().v()).p1(e().w());
            if (c2823q3E0.x() && c2828r2V0.m() != null) {
                aVarJ1.i0(d((String) C3445p.k(c2828r2V0.m()), Long.toString(j10.f34892E)));
            }
            if (!TextUtils.isEmpty(c2828r2V0.p())) {
                aVarJ1.a1((String) C3445p.k(c2828r2V0.p()));
            }
            String strL = c2828r2V0.l();
            List<R5> listI1 = r().i1(strL);
            Iterator<R5> it = listI1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ("_lte".equals(next.f35161c)) {
                    break;
                }
            }
            if (next == null || next.f35163e == null) {
                R5 r52 = new R5(strL, "auto", "_lte", b().a(), 0L);
                listI1.add(r52);
                r().n0(r52);
            }
            com.google.android.gms.internal.measurement.B2[] b2Arr = new com.google.android.gms.internal.measurement.B2[listI1.size()];
            for (int i10 = 0; i10 < listI1.size(); i10++) {
                B2.a aVarD = com.google.android.gms.internal.measurement.B2.W().B(listI1.get(i10).f35161c).D(listI1.get(i10).f35162d);
                p().W(aVarD, listI1.get(i10).f35163e);
                b2Arr[i10] = (com.google.android.gms.internal.measurement.B2) ((com.google.android.gms.internal.measurement.F4) aVarD.x());
            }
            aVarJ1.u0(Arrays.asList(b2Arr));
            this.f35538b.A(c2828r2V0, aVarJ1);
            this.f35538b.l0(c2828r2V0, aVarJ1);
            C2780k2 c2780k2B = C2780k2.b(j10);
            j().O(c2780k2B.f35423d, r().R0(str));
            j().X(c2780k2B, c().y(str));
            Bundle bundle2 = c2780k2B.f35423d;
            bundle2.putLong("_c", 1L);
            k().G().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", j10.f34891D);
            if (j().F0(aVarJ1.r1(), c2828r2V0.v())) {
                j().P(bundle2, "_dbg", 1L);
                j().P(bundle2, "_r", 1L);
            }
            G gU0 = r().U0(str, j10.f34889B);
            if (gU0 == null) {
                bundle = bundle2;
                aVar = aVarJ1;
                c2828r2 = c2828r2V0;
                bVar = bVarQ;
                bArr = null;
                gA = new G(str, j10.f34889B, 0L, 0L, j10.f34892E, 0L, null, null, null, null);
                j11 = 0;
            } else {
                bundle = bundle2;
                aVar = aVarJ1;
                c2828r2 = c2828r2V0;
                bVar = bVarQ;
                bArr = null;
                j11 = gU0.f34850f;
                gA = gU0.a(j10.f34892E);
            }
            r().Z(gA);
            D d10 = new D(this.f35457a, j10.f34891D, str, j10.f34889B, j10.f34892E, j11, bundle);
            C2569r2.a aVarC = C2569r2.W().I(d10.f34786d).G(d10.f34784b).C(d10.f34787e);
            Iterator<String> it2 = d10.f34788f.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                C2585t2.a aVarD2 = C2585t2.Y().D(next2);
                Object objO0 = d10.f34788f.O0(next2);
                if (objO0 != null) {
                    p().V(aVarD2, objO0);
                    aVarC.D(aVarD2);
                }
            }
            C2609w2.a aVar2 = aVar;
            aVar2.G(aVarC).H(C2617x2.K().v(C2577s2.K().v(gA.f34847c).w(j10.f34889B)));
            aVar2.M(q().A(c2828r2.l(), Collections.emptyList(), aVar2.R(), Long.valueOf(aVarC.L()), Long.valueOf(aVarC.L()), false));
            if (aVarC.P()) {
                aVar2.R0(aVarC.L()).z0(aVarC.L());
            }
            long jE0 = c2828r2.E0();
            if (jE0 != 0) {
                aVar2.I0(jE0);
            }
            long jI0 = c2828r2.I0();
            if (jI0 != 0) {
                aVar2.M0(jI0);
            } else if (jE0 != 0) {
                aVar2.M0(jE0);
            }
            String strU = c2828r2.u();
            if (e7.a() && c().I(str, K.f34922H0) && strU != null) {
                aVar2.n1(strU);
            }
            c2828r2.y();
            aVar2.y0((int) c2828r2.G0()).c1(114010L).Z0(b().a()).p0(true);
            this.f35538b.K(aVar2.r1(), aVar2);
            C2601v2.b bVar2 = bVar;
            bVar2.A(aVar2);
            C2828r2 c2828r22 = c2828r2;
            c2828r22.D0(aVar2.x0());
            c2828r22.z0(aVar2.q0());
            r().a0(c2828r22, false, false);
            r().t1();
            try {
                return p().i0(((C2601v2) ((com.google.android.gms.internal.measurement.F4) bVar2.x())).m());
            } catch (IOException e10) {
                k().H().c("Data loss. Failed to bundle and serialize. appId", C2759h2.w(str), e10);
                return bArr;
            }
        } catch (SecurityException e11) {
            k().G().b("Resettable device id encryption failed", e11.getMessage());
            return new byte[0];
        } catch (SecurityException e12) {
            k().G().b("app instance id encryption failed", e12.getMessage());
            return new byte[0];
        } finally {
            r().r1();
        }
    }
}
