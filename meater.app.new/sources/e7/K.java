package e7;

import android.os.SystemClock;
import c7.C2333b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import g7.AbstractC3433d;
import g7.C3435f;
import g7.C3442m;
import g7.C3446q;
import z7.AbstractC5208j;
import z7.InterfaceC5203e;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class K implements InterfaceC5203e {

    /* renamed from: a, reason: collision with root package name */
    private final C3216f f40616a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40617b;

    /* renamed from: c, reason: collision with root package name */
    private final C3212b f40618c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40619d;

    /* renamed from: e, reason: collision with root package name */
    private final long f40620e;

    K(C3216f c3216f, int i10, C3212b c3212b, long j10, long j11, String str, String str2) {
        this.f40616a = c3216f;
        this.f40617b = i10;
        this.f40618c = c3212b;
        this.f40619d = j10;
        this.f40620e = j11;
    }

    static K b(C3216f c3216f, int i10, C3212b c3212b) {
        boolean zV0;
        if (!c3216f.d()) {
            return null;
        }
        g7.r rVarA = C3446q.b().a();
        if (rVarA == null) {
            zV0 = true;
        } else {
            if (!rVarA.r0()) {
                return null;
            }
            zV0 = rVarA.v0();
            C3209B c3209bS = c3216f.s(c3212b);
            if (c3209bS != null) {
                if (!(c3209bS.w() instanceof AbstractC3433d)) {
                    return null;
                }
                AbstractC3433d abstractC3433d = (AbstractC3433d) c3209bS.w();
                if (abstractC3433d.J() && !abstractC3433d.d()) {
                    C3435f c3435fC = c(c3209bS, abstractC3433d, i10);
                    if (c3435fC == null) {
                        return null;
                    }
                    c3209bS.H();
                    zV0 = c3435fC.G0();
                }
            }
        }
        return new K(c3216f, i10, c3212b, zV0 ? System.currentTimeMillis() : 0L, zV0 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C3435f c(C3209B c3209b, AbstractC3433d abstractC3433d, int i10) {
        int[] iArrH0;
        int[] iArrR0;
        C3435f c3435fH = abstractC3433d.H();
        if (c3435fH == null || !c3435fH.v0() || ((iArrH0 = c3435fH.h0()) != null ? !com.google.android.gms.common.util.b.a(iArrH0, i10) : !((iArrR0 = c3435fH.r0()) == null || !com.google.android.gms.common.util.b.a(iArrR0, i10))) || c3209b.t() >= c3435fH.f0()) {
            return null;
        }
        return c3435fH;
    }

    @Override // z7.InterfaceC5203e
    public final void a(AbstractC5208j abstractC5208j) {
        C3209B c3209bS;
        int iG0;
        int i10;
        int i11;
        int iF0;
        long j10;
        long j11;
        int iElapsedRealtime;
        if (this.f40616a.d()) {
            g7.r rVarA = C3446q.b().a();
            if ((rVarA == null || rVarA.r0()) && (c3209bS = this.f40616a.s(this.f40618c)) != null && (c3209bS.w() instanceof AbstractC3433d)) {
                AbstractC3433d abstractC3433d = (AbstractC3433d) c3209bS.w();
                int i12 = 0;
                boolean zV0 = this.f40619d > 0;
                int iZ = abstractC3433d.z();
                int iH0 = 100;
                if (rVarA != null) {
                    zV0 &= rVarA.v0();
                    int iF02 = rVarA.f0();
                    int iH02 = rVarA.h0();
                    iG0 = rVarA.G0();
                    if (abstractC3433d.J() && !abstractC3433d.d()) {
                        C3435f c3435fC = c(c3209bS, abstractC3433d, this.f40617b);
                        if (c3435fC == null) {
                            return;
                        }
                        boolean z10 = c3435fC.G0() && this.f40619d > 0;
                        iH02 = c3435fC.f0();
                        zV0 = z10;
                    }
                    i11 = iF02;
                    i10 = iH02;
                } else {
                    iG0 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C3216f c3216f = this.f40616a;
                if (abstractC5208j.o()) {
                    iF0 = 0;
                } else if (abstractC5208j.m()) {
                    i12 = iH0;
                    iF0 = -1;
                } else {
                    Exception excJ = abstractC5208j.j();
                    if (excJ instanceof ApiException) {
                        Status statusA = ((ApiException) excJ).a();
                        iH0 = statusA.h0();
                        C2333b c2333bF0 = statusA.f0();
                        if (c2333bF0 != null) {
                            iF0 = c2333bF0.f0();
                            i12 = iH0;
                        }
                        i12 = iH0;
                        iF0 = -1;
                    } else {
                        i12 = 101;
                        iF0 = -1;
                    }
                }
                if (zV0) {
                    long j12 = this.f40619d;
                    long j13 = this.f40620e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                    iElapsedRealtime = -1;
                }
                c3216f.B(new C3442m(this.f40617b, i12, iF0, j10, j11, null, null, iZ, iElapsedRealtime), iG0, i11, i10);
            }
        }
    }
}
