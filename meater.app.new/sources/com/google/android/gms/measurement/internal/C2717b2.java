package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.measurement.internal.C2823q3;
import g7.C3445p;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2717b2 extends B1 {

    /* renamed from: c, reason: collision with root package name */
    private String f35278c;

    /* renamed from: d, reason: collision with root package name */
    private String f35279d;

    /* renamed from: e, reason: collision with root package name */
    private int f35280e;

    /* renamed from: f, reason: collision with root package name */
    private String f35281f;

    /* renamed from: g, reason: collision with root package name */
    private String f35282g;

    /* renamed from: h, reason: collision with root package name */
    private long f35283h;

    /* renamed from: i, reason: collision with root package name */
    private long f35284i;

    /* renamed from: j, reason: collision with root package name */
    private List<String> f35285j;

    /* renamed from: k, reason: collision with root package name */
    private String f35286k;

    /* renamed from: l, reason: collision with root package name */
    private int f35287l;

    /* renamed from: m, reason: collision with root package name */
    private String f35288m;

    /* renamed from: n, reason: collision with root package name */
    private String f35289n;

    /* renamed from: o, reason: collision with root package name */
    private String f35290o;

    /* renamed from: p, reason: collision with root package name */
    private long f35291p;

    /* renamed from: q, reason: collision with root package name */
    private String f35292q;

    C2717b2(P2 p22, long j10) {
        super(p22);
        this.f35291p = 0L;
        this.f35292q = null;
        this.f35284i = j10;
    }

    private final String M() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (p7.a() && c().u(K.f34912C0)) {
            k().L().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> clsLoadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, a());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                } catch (Exception unused) {
                    k().N().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                k().O().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(1:4)(22:86|6|(1:10)(2:11|(1:13))|84|14|(4:16|(1:18)(1:20)|88|21)|26|(1:31)(1:30)|32|33|(1:46)|47|(1:49)|90|50|(1:52)(1:53)|54|(1:56)|(3:60|(1:62)(1:63)|64)|67|(1:78)(2:69|(1:71)(4:72|(3:75|(1:93)(1:94)|73)|92|78))|(2:80|81)(2:82|83))|5|26|(2:28|31)(0)|32|33|(0)|47|(0)|90|50|(0)(0)|54|(0)|(0)|67|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ac, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
    
        k().H().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C2759h2.w(r0), r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    @Override // com.google.android.gms.measurement.internal.B1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void C() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2717b2.C():void");
    }

    final E5 D(String str) {
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        String str2;
        int iZ0;
        n();
        String strH = H();
        String strJ = J();
        z();
        String str3 = this.f35279d;
        long jF = F();
        z();
        C3445p.k(this.f35281f);
        String str4 = this.f35281f;
        z();
        n();
        if (this.f35283h == 0) {
            this.f35283h = this.f35457a.P().A(a(), a().getPackageName());
        }
        long j12 = this.f35283h;
        boolean zS = this.f35457a.s();
        boolean z12 = !h().f35614t;
        n();
        String strM = !this.f35457a.s() ? null : M();
        P2 p22 = this.f35457a;
        long jA = p22.H().f35601g.a();
        long jMin = jA == 0 ? p22.f35089I : Math.min(p22.f35089I, jA);
        int iE = E();
        boolean zX = c().X();
        C2835s2 c2835s2H = h();
        c2835s2H.n();
        boolean z13 = c2835s2H.K().getBoolean("deferred_analytics_collection", false);
        String strG = G();
        Boolean boolValueOf = Boolean.valueOf(c().E("google_analytics_default_allow_ad_personalization_signals", true) != v7.E.GRANTED);
        long j13 = this.f35284i;
        List<String> list = this.f35285j;
        String strV = h().N().v();
        if (this.f35286k == null) {
            this.f35286k = j().S0();
        }
        String str5 = this.f35286k;
        if (h().N().m(C2823q3.a.ANALYTICS_STORAGE)) {
            n();
            j10 = j13;
            j11 = 0;
            if (this.f35291p != 0) {
                z10 = zS;
                z11 = z12;
                long jA2 = b().a() - this.f35291p;
                if (this.f35290o != null && jA2 > 86400000 && this.f35292q == null) {
                    L();
                }
            } else {
                z10 = zS;
                z11 = z12;
            }
            if (this.f35290o == null) {
                L();
            }
            str2 = this.f35290o;
        } else {
            j10 = j13;
            z10 = zS;
            z11 = z12;
            j11 = 0;
            str2 = null;
        }
        boolean zW = c().w();
        long jA0 = j().A0(H());
        int iB = h().N().b();
        String strJ2 = h().M().j();
        if (W6.a() && c().u(K.f34942R0)) {
            j();
            iZ0 = Q5.z0();
        } else {
            iZ0 = 0;
        }
        return new E5(strH, strJ, str3, jF, str4, 114010L, j12, str, z10, z11, strM, jMin, iE, zX, z13, strG, boolValueOf, j10, list, (String) null, strV, str5, str2, zW, jA0, iB, strJ2, iZ0, (W6.a() && c().u(K.f34942R0)) ? j().P0() : j11, c().W(), new C2882z0(c().E("google_analytics_default_allow_ad_personalization_signals", true)).c(), this.f35457a.f35089I, c().u(K.f34932M0) ? t().E().a() : 0);
    }

    final int E() {
        z();
        return this.f35287l;
    }

    final int F() {
        z();
        return this.f35280e;
    }

    final String G() {
        z();
        return this.f35289n;
    }

    final String H() {
        z();
        C3445p.k(this.f35278c);
        return this.f35278c;
    }

    final String I() {
        z();
        C3445p.k(this.f35282g);
        return this.f35282g;
    }

    final String J() {
        n();
        z();
        C3445p.k(this.f35288m);
        return this.f35288m;
    }

    final List<String> K() {
        return this.f35285j;
    }

    final void L() {
        String str;
        n();
        if (h().N().m(C2823q3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            j().U0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            k().G().a("Analytics Storage consent is not granted");
            str = null;
        }
        k().G().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f35290o = str;
        this.f35291p = b().a();
    }

    final boolean N(String str) {
        String str2 = this.f35292q;
        boolean z10 = (str2 == null || str2.equals(str)) ? false : true;
        this.f35292q = str;
        return z10;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.Z1, com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2707a p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2717b2 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2731d2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2843t3 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2768i4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2796m4 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2837s4 v() {
        return super.v();
    }

    @Override // com.google.android.gms.measurement.internal.Z1
    public final /* bridge */ /* synthetic */ C2727c5 w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.B1
    protected final boolean y() {
        return true;
    }
}
