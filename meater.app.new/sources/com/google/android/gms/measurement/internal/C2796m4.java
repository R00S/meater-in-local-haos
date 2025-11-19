package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2481g1;
import g7.C3445p;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2796m4 extends B1 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C2782k4 f35458c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C2782k4 f35459d;

    /* renamed from: e, reason: collision with root package name */
    protected C2782k4 f35460e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, C2782k4> f35461f;

    /* renamed from: g, reason: collision with root package name */
    private C2481g1 f35462g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f35463h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C2782k4 f35464i;

    /* renamed from: j, reason: collision with root package name */
    private C2782k4 f35465j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35466k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f35467l;

    public C2796m4(P2 p22) {
        super(p22);
        this.f35467l = new Object();
        this.f35461f = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(com.google.android.gms.measurement.internal.C2782k4 r16, com.google.android.gms.measurement.internal.C2782k4 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r15.n()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2f
            long r8 = r2.f35429c
            long r10 = r1.f35429c
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L2f
            java.lang.String r8 = r2.f35428b
            java.lang.String r9 = r1.f35428b
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L2f
            java.lang.String r8 = r2.f35427a
            java.lang.String r9 = r1.f35427a
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L2d
            goto L2f
        L2d:
            r8 = r6
            goto L30
        L2f:
            r8 = r7
        L30:
            if (r20 == 0) goto L37
            com.google.android.gms.measurement.internal.k4 r9 = r0.f35460e
            if (r9 == 0) goto L37
            r6 = r7
        L37:
            if (r8 == 0) goto Lba
            android.os.Bundle r8 = new android.os.Bundle
            if (r5 == 0) goto L42
            r8.<init>(r5)
        L40:
            r14 = r8
            goto L46
        L42:
            r8.<init>()
            goto L40
        L46:
            com.google.android.gms.measurement.internal.Q5.Y(r1, r14, r7)
            if (r2 == 0) goto L64
            java.lang.String r5 = r2.f35427a
            if (r5 == 0) goto L54
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L54:
            java.lang.String r5 = r2.f35428b
            if (r5 == 0) goto L5d
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L5d:
            java.lang.String r5 = "_pi"
            long r8 = r2.f35429c
            r14.putLong(r5, r8)
        L64:
            r8 = 0
            if (r6 == 0) goto L7d
            com.google.android.gms.measurement.internal.c5 r2 = r15.w()
            com.google.android.gms.measurement.internal.j5 r2 = r2.f35314f
            long r10 = r2.a(r3)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7d
            com.google.android.gms.measurement.internal.Q5 r2 = r15.j()
            r2.N(r14, r10)
        L7d:
            com.google.android.gms.measurement.internal.i r2 = r15.c()
            boolean r2 = r2.Y()
            if (r2 != 0) goto L8e
            java.lang.String r2 = "_mst"
            r10 = 1
            r14.putLong(r2, r10)
        L8e:
            boolean r2 = r1.f35431e
            if (r2 == 0) goto L96
            java.lang.String r2 = "app"
        L94:
            r10 = r2
            goto L99
        L96:
            java.lang.String r2 = "auto"
            goto L94
        L99:
            com.google.android.gms.common.util.e r2 = r15.b()
            long r11 = r2.a()
            boolean r2 = r1.f35431e
            r20 = r11
            if (r2 == 0) goto Laf
            long r11 = r1.f35432f
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 == 0) goto Laf
            r12 = r11
            goto Lb1
        Laf:
            r12 = r20
        Lb1:
            com.google.android.gms.measurement.internal.t3 r9 = r15.s()
            java.lang.String r11 = "_vs"
            r9.i0(r10, r11, r12, r14)
        Lba:
            if (r6 == 0) goto Lc1
            com.google.android.gms.measurement.internal.k4 r2 = r0.f35460e
            r15.K(r2, r7, r3)
        Lc1:
            r0.f35460e = r1
            boolean r2 = r1.f35431e
            if (r2 == 0) goto Lc9
            r0.f35465j = r1
        Lc9:
            com.google.android.gms.measurement.internal.s4 r2 = r15.v()
            r2.M(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2796m4.J(com.google.android.gms.measurement.internal.k4, com.google.android.gms.measurement.internal.k4, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(C2782k4 c2782k4, boolean z10, long j10) {
        p().x(b().c());
        if (!w().G(c2782k4 != null && c2782k4.f35430d, z10, j10) || c2782k4 == null) {
            return;
        }
        c2782k4.f35430d = false;
    }

    static /* synthetic */ void L(C2796m4 c2796m4, Bundle bundle, C2782k4 c2782k4, C2782k4 c2782k42, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c2796m4.J(c2782k4, c2782k42, j10, true, c2796m4.j().G(null, "screen_view", bundle, null, false));
    }

    private final void P(String str, C2782k4 c2782k4, boolean z10) {
        C2782k4 c2782k42;
        C2782k4 c2782k43 = this.f35458c == null ? this.f35459d : this.f35458c;
        if (c2782k4.f35428b == null) {
            c2782k42 = new C2782k4(c2782k4.f35427a, str != null ? d(str, "Activity") : null, c2782k4.f35429c, c2782k4.f35431e, c2782k4.f35432f);
        } else {
            c2782k42 = c2782k4;
        }
        this.f35459d = this.f35458c;
        this.f35458c = c2782k42;
        o().E(new RunnableC2817p4(this, c2782k42, c2782k43, b().c(), z10));
    }

    private final C2782k4 U(C2481g1 c2481g1) {
        C3445p.k(c2481g1);
        C2782k4 c2782k4 = this.f35461f.get(Integer.valueOf(c2481g1.f34117B));
        if (c2782k4 == null) {
            C2782k4 c2782k42 = new C2782k4(null, d(c2481g1.f34118C, "Activity"), j().Q0());
            this.f35461f.put(Integer.valueOf(c2481g1.f34117B), c2782k42);
            c2782k4 = c2782k42;
        }
        return this.f35464i != null ? this.f35464i : c2782k4;
    }

    private final String d(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String[] strArrSplit = str.split("\\.");
        String str3 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str3.length() > c().s(null, false) ? str3.substring(0, c().s(null, false)) : str3;
    }

    public final C2782k4 E(boolean z10) {
        z();
        n();
        if (!z10) {
            return this.f35460e;
        }
        C2782k4 c2782k4 = this.f35460e;
        return c2782k4 != null ? c2782k4 : this.f35465j;
    }

    public final void F(Bundle bundle, long j10) {
        String str;
        synchronized (this.f35467l) {
            try {
                if (!this.f35466k) {
                    k().N().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strD = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > c().s(null, false))) {
                        k().N().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > c().s(null, false))) {
                        k().N().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        strD = string2;
                    }
                } else {
                    str = null;
                }
                if (strD == null) {
                    C2481g1 c2481g1 = this.f35462g;
                    strD = c2481g1 != null ? d(c2481g1.f34118C, "Activity") : "Activity";
                }
                String str2 = strD;
                C2782k4 c2782k4 = this.f35458c;
                if (this.f35463h && c2782k4 != null) {
                    this.f35463h = false;
                    boolean zEquals = Objects.equals(c2782k4.f35428b, str2);
                    boolean zEquals2 = Objects.equals(c2782k4.f35427a, str);
                    if (zEquals && zEquals2) {
                        k().N().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                k().L().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                C2782k4 c2782k42 = this.f35458c == null ? this.f35459d : this.f35458c;
                C2782k4 c2782k43 = new C2782k4(str, str2, j().Q0(), true, j10);
                this.f35458c = c2782k43;
                this.f35459d = c2782k42;
                this.f35464i = c2782k43;
                o().E(new RunnableC2789l4(this, bundle, c2782k43, c2782k42, b().c()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void G(C2481g1 c2481g1) {
        synchronized (this.f35467l) {
            try {
                if (Objects.equals(this.f35462g, c2481g1)) {
                    this.f35462g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c().Y()) {
            this.f35461f.remove(Integer.valueOf(c2481g1.f34117B));
        }
    }

    public final void H(C2481g1 c2481g1, Bundle bundle) {
        Bundle bundle2;
        if (!c().Y() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f35461f.put(Integer.valueOf(c2481g1.f34117B), new C2782k4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Deprecated
    public final void I(C2481g1 c2481g1, String str, String str2) {
        if (!c().Y()) {
            k().N().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C2782k4 c2782k4 = this.f35458c;
        if (c2782k4 == null) {
            k().N().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f35461f.get(Integer.valueOf(c2481g1.f34117B)) == null) {
            k().N().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = d(c2481g1.f34118C, "Activity");
        }
        boolean zEquals = Objects.equals(c2782k4.f35428b, str2);
        boolean zEquals2 = Objects.equals(c2782k4.f35427a, str);
        if (zEquals && zEquals2) {
            k().N().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c().s(null, false))) {
            k().N().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c().s(null, false))) {
            k().N().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        k().L().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C2782k4 c2782k42 = new C2782k4(str, str2, j().Q0());
        this.f35461f.put(Integer.valueOf(c2481g1.f34117B), c2782k42);
        P(c2481g1.f34118C, c2782k42, true);
    }

    public final C2782k4 Q() {
        return this.f35458c;
    }

    public final void R(C2481g1 c2481g1) {
        synchronized (this.f35467l) {
            this.f35466k = false;
            this.f35463h = true;
        }
        long jC = b().c();
        if (!c().Y()) {
            this.f35458c = null;
            o().E(new RunnableC2830r4(this, jC));
        } else {
            C2782k4 c2782k4U = U(c2481g1);
            this.f35459d = this.f35458c;
            this.f35458c = null;
            o().E(new RunnableC2824q4(this, c2782k4U, jC));
        }
    }

    public final void S(C2481g1 c2481g1, Bundle bundle) {
        C2782k4 c2782k4;
        if (!c().Y() || bundle == null || (c2782k4 = this.f35461f.get(Integer.valueOf(c2481g1.f34117B))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2782k4.f35429c);
        bundle2.putString("name", c2782k4.f35427a);
        bundle2.putString("referrer_name", c2782k4.f35428b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void T(C2481g1 c2481g1) {
        synchronized (this.f35467l) {
            this.f35466k = true;
            if (!Objects.equals(c2481g1, this.f35462g)) {
                synchronized (this.f35467l) {
                    this.f35462g = c2481g1;
                    this.f35463h = false;
                }
                if (c().Y()) {
                    this.f35464i = null;
                    o().E(new RunnableC2844t4(this));
                }
            }
        }
        if (!c().Y()) {
            this.f35458c = this.f35464i;
            o().E(new RunnableC2810o4(this));
            return;
        }
        P(c2481g1.f34118C, U(c2481g1), false);
        C2707a c2707aP = p();
        c2707aP.o().E(new RunnableC2709a1(c2707aP, c2707aP.b().c()));
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
        return false;
    }
}
