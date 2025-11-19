package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC2535n;
import com.google.android.gms.internal.measurement.B7;
import com.google.android.gms.internal.measurement.C2439b2;
import com.google.android.gms.internal.measurement.C2448c2;
import com.google.android.gms.internal.measurement.C2457d2;
import com.google.android.gms.internal.measurement.C2466e2;
import com.google.android.gms.internal.measurement.C2498i2;
import com.google.android.gms.internal.measurement.C2620x5;
import com.google.android.gms.internal.measurement.v7;
import com.google.android.gms.internal.measurement.z7;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.measurement.internal.C2;
import com.google.android.gms.measurement.internal.C2823q3;
import g7.C3445p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import s.C4391a;
import s.C4413x;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class C2 extends AbstractC2873x5 implements InterfaceC2777k {

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Map<String, String>> f34765d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Set<String>> f34766e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f34767f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f34768g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, C2466e2> f34769h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f34770i;

    /* renamed from: j, reason: collision with root package name */
    final C4413x<String, com.google.android.gms.internal.measurement.C> f34771j;

    /* renamed from: k, reason: collision with root package name */
    private final z7 f34772k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, String> f34773l;

    /* renamed from: m, reason: collision with root package name */
    private final Map<String, String> f34774m;

    /* renamed from: n, reason: collision with root package name */
    private final Map<String, String> f34775n;

    C2(C2880y5 c2880y5) {
        super(c2880y5);
        this.f34765d = new C4391a();
        this.f34766e = new C4391a();
        this.f34767f = new C4391a();
        this.f34768g = new C4391a();
        this.f34769h = new C4391a();
        this.f34773l = new C4391a();
        this.f34774m = new C4391a();
        this.f34775n = new C4391a();
        this.f34770i = new C4391a();
        this.f34771j = new G2(this, 20);
        this.f34772k = new F2(this);
    }

    public static /* synthetic */ AbstractC2535n A(C2 c22) {
        return new v7(c22.f34772k);
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.C B(C2 c22, String str) throws Throwable {
        c22.v();
        C3445p.e(str);
        if (!c22.Y(str)) {
            return null;
        }
        if (!c22.f34769h.containsKey(str) || c22.f34769h.get(str) == null) {
            c22.i0(str);
        } else {
            c22.H(str, c22.f34769h.get(str));
        }
        return c22.f34771j.h().get(str);
    }

    private final C2466e2 C(String str, byte[] bArr) {
        if (bArr == null) {
            return C2466e2.S();
        }
        try {
            C2466e2 c2466e2 = (C2466e2) ((com.google.android.gms.internal.measurement.F4) ((C2466e2.a) N5.H(C2466e2.Q(), bArr)).x());
            k().L().c("Parsed config. version, gmp_app_id", c2466e2.e0() ? Long.valueOf(c2466e2.O()) : null, c2466e2.c0() ? c2466e2.U() : null);
            return c2466e2;
        } catch (zzkp e10) {
            k().M().c("Unable to merge remote config. appId", C2759h2.w(str), e10);
            return C2466e2.S();
        } catch (RuntimeException e11) {
            k().M().c("Unable to merge remote config. appId", C2759h2.w(str), e11);
            return C2466e2.S();
        }
    }

    private static C2823q3.a D(C2439b2.e eVar) {
        int i10 = H2.f34864b[eVar.ordinal()];
        if (i10 == 1) {
            return C2823q3.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return C2823q3.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return C2823q3.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return C2823q3.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> E(C2466e2 c2466e2) {
        C4391a c4391a = new C4391a();
        if (c2466e2 != null) {
            for (C2498i2 c2498i2 : c2466e2.Z()) {
                c4391a.put(c2498i2.L(), c2498i2.M());
            }
        }
        return c4391a;
    }

    private final void G(String str, C2466e2.a aVar) {
        HashSet hashSet = new HashSet();
        C4391a c4391a = new C4391a();
        C4391a c4391a2 = new C4391a();
        C4391a c4391a3 = new C4391a();
        if (aVar != null) {
            Iterator<C2448c2> it = aVar.E().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().L());
            }
            for (int i10 = 0; i10 < aVar.v(); i10++) {
                C2457d2.a aVarC = aVar.w(i10).C();
                if (aVarC.A().isEmpty()) {
                    k().M().a("EventConfig contained null event name");
                } else {
                    String strA = aVarC.A();
                    String strB = v7.H.b(aVarC.A());
                    if (!TextUtils.isEmpty(strB)) {
                        aVarC = aVarC.w(strB);
                        aVar.A(i10, aVarC);
                    }
                    if (aVarC.D() && aVarC.B()) {
                        c4391a.put(strA, Boolean.TRUE);
                    }
                    if (aVarC.E() && aVarC.C()) {
                        c4391a2.put(aVarC.A(), Boolean.TRUE);
                    }
                    if (aVarC.F()) {
                        if (aVarC.v() < 2 || aVarC.v() > 65535) {
                            k().M().c("Invalid sampling rate. Event name, sample rate", aVarC.A(), Integer.valueOf(aVarC.v()));
                        } else {
                            c4391a3.put(aVarC.A(), Integer.valueOf(aVarC.v()));
                        }
                    }
                }
            }
        }
        this.f34766e.put(str, hashSet);
        this.f34767f.put(str, c4391a);
        this.f34768g.put(str, c4391a2);
        this.f34770i.put(str, c4391a3);
    }

    private final void H(final String str, C2466e2 c2466e2) {
        if (c2466e2.n() == 0) {
            this.f34771j.e(str);
            return;
        }
        k().L().b("EES programs found", Integer.valueOf(c2466e2.n()));
        com.google.android.gms.internal.measurement.P2 p22 = c2466e2.Y().get(0);
        try {
            com.google.android.gms.internal.measurement.C c10 = new com.google.android.gms.internal.measurement.C();
            c10.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.D2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C2620x5("internal.remoteConfig", new I2(this.f34789a, str));
                }
            });
            c10.d("internal.appMetadata", new Callable() { // from class: v7.t
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C2 c22 = this.f51573a;
                    final String str2 = str;
                    return new B7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.E2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C2 c23 = c22;
                            String str3 = str2;
                            C2828r2 c2828r2V0 = c23.r().V0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 114010L);
                            if (c2828r2V0 != null) {
                                String strO = c2828r2V0.o();
                                if (strO != null) {
                                    map.put("app_version", strO);
                                }
                                map.put("app_version_int", Long.valueOf(c2828r2V0.V()));
                                map.put("dynamite_version", Long.valueOf(c2828r2V0.w0()));
                            }
                            return map;
                        }
                    });
                }
            });
            c10.d("internal.logger", new Callable() { // from class: v7.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C2.A(this.f51575a);
                }
            });
            c10.c(p22);
            this.f34771j.d(str, c10);
            k().L().c("EES program loaded for appId, activities", str, Integer.valueOf(p22.K().n()));
            Iterator<com.google.android.gms.internal.measurement.O2> it = p22.K().M().iterator();
            while (it.hasNext()) {
                k().L().b("EES program activity", it.next().L());
            }
        } catch (zzc unused) {
            k().H().b("Failed to load EES program. appId", str);
        }
    }

    private final void i0(String str) throws Throwable {
        v();
        n();
        C3445p.e(str);
        if (this.f34769h.get(str) == null) {
            r rVarW0 = r().W0(str);
            if (rVarW0 != null) {
                C2466e2.a aVarC = C(str, rVarW0.f35539a).C();
                G(str, aVarC);
                this.f34765d.put(str, E((C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x())));
                this.f34769h.put(str, (C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
                H(str, (C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
                this.f34773l.put(str, aVarC.C());
                this.f34774m.put(str, rVarW0.f35540b);
                this.f34775n.put(str, rVarW0.f35541c);
                return;
            }
            this.f34765d.put(str, null);
            this.f34767f.put(str, null);
            this.f34766e.put(str, null);
            this.f34768g.put(str, null);
            this.f34769h.put(str, null);
            this.f34773l.put(str, null);
            this.f34774m.put(str, null);
            this.f34775n.put(str, null);
            this.f34770i.put(str, null);
        }
    }

    final v7.E F(String str, C2823q3.a aVar) {
        n();
        i0(str);
        C2439b2 c2439b2K = K(str);
        if (c2439b2K == null) {
            return v7.E.UNINITIALIZED;
        }
        for (C2439b2.b bVar : c2439b2K.P()) {
            if (D(bVar.M()) == aVar) {
                int i10 = H2.f34865c[bVar.L().ordinal()];
                return i10 != 1 ? i10 != 2 ? v7.E.UNINITIALIZED : v7.E.GRANTED : v7.E.DENIED;
            }
        }
        return v7.E.UNINITIALIZED;
    }

    protected final boolean I(String str, byte[] bArr, String str2, String str3) {
        v();
        n();
        C3445p.e(str);
        C2466e2.a aVarC = C(str, bArr).C();
        if (aVarC == null) {
            return false;
        }
        G(str, aVarC);
        H(str, (C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
        this.f34769h.put(str, (C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
        this.f34773l.put(str, aVarC.C());
        this.f34774m.put(str, str2);
        this.f34775n.put(str, str3);
        this.f34765d.put(str, E((C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x())));
        r().h0(str, new ArrayList(aVarC.D()));
        try {
            aVarC.B();
            bArr = ((C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x())).m();
        } catch (RuntimeException e10) {
            k().M().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2759h2.w(str), e10);
        }
        C2812p c2812pR = r();
        C3445p.e(str);
        c2812pR.n();
        c2812pR.v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c2812pR.C().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c2812pR.k().H().b("Failed to update remote config (got 0). appId", C2759h2.w(str));
            }
        } catch (SQLiteException e11) {
            c2812pR.k().H().c("Error storing remote config. appId", C2759h2.w(str), e11);
        }
        this.f34769h.put(str, (C2466e2) ((com.google.android.gms.internal.measurement.F4) aVarC.x()));
        return true;
    }

    final int J(String str, String str2) throws Throwable {
        Integer num;
        n();
        i0(str);
        Map<String, Integer> map = this.f34770i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final C2439b2 K(String str) throws Throwable {
        n();
        i0(str);
        C2466e2 c2466e2N = N(str);
        if (c2466e2N == null || !c2466e2N.b0()) {
            return null;
        }
        return c2466e2N.P();
    }

    final C2823q3.a L(String str, C2823q3.a aVar) {
        n();
        i0(str);
        C2439b2 c2439b2K = K(str);
        if (c2439b2K == null) {
            return null;
        }
        for (C2439b2.c cVar : c2439b2K.O()) {
            if (aVar == D(cVar.M())) {
                return D(cVar.L());
            }
        }
        return null;
    }

    protected final C2466e2 N(String str) {
        v();
        n();
        C3445p.e(str);
        i0(str);
        return this.f34769h.get(str);
    }

    final boolean O(String str, C2823q3.a aVar) throws Throwable {
        n();
        i0(str);
        C2439b2 c2439b2K = K(str);
        if (c2439b2K == null) {
            return false;
        }
        Iterator<C2439b2.b> it = c2439b2K.N().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2439b2.b next = it.next();
            if (aVar == D(next.M())) {
                if (next.L() == C2439b2.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean P(String str, String str2) throws Throwable {
        Boolean bool;
        n();
        i0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f34768g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String Q(String str) {
        n();
        return this.f34775n.get(str);
    }

    final boolean R(String str, String str2) throws Throwable {
        Boolean bool;
        n();
        i0(str);
        if (Z(str) && Q5.H0(str2)) {
            return true;
        }
        if (b0(str) && Q5.J0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f34767f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String S(String str) {
        n();
        return this.f34774m.get(str);
    }

    final String T(String str) {
        n();
        i0(str);
        return this.f34773l.get(str);
    }

    final Set<String> U(String str) {
        n();
        i0(str);
        return this.f34766e.get(str);
    }

    final SortedSet<String> V(String str) {
        n();
        i0(str);
        TreeSet treeSet = new TreeSet();
        C2439b2 c2439b2K = K(str);
        if (c2439b2K == null) {
            return treeSet;
        }
        Iterator<C2439b2.f> it = c2439b2K.M().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().L());
        }
        return treeSet;
    }

    protected final void W(String str) {
        n();
        this.f34774m.put(str, null);
    }

    final void X(String str) {
        n();
        this.f34769h.remove(str);
    }

    public final boolean Y(String str) {
        C2466e2 c2466e2;
        return (TextUtils.isEmpty(str) || (c2466e2 = this.f34769h.get(str)) == null || c2466e2.n() == 0) ? false : true;
    }

    final boolean Z(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final boolean a0(String str) {
        n();
        i0(str);
        C2439b2 c2439b2K = K(str);
        return c2439b2K == null || !c2439b2K.R() || c2439b2K.Q();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    final boolean b0(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    final boolean c0(String str) throws Throwable {
        n();
        i0(str);
        return this.f34766e.get(str) != null && this.f34766e.get(str).contains("app_instance_id");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2777k
    public final String d(String str, String str2) throws Throwable {
        n();
        i0(str);
        Map<String, String> map = this.f34765d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    final boolean d0(String str) throws Throwable {
        n();
        i0(str);
        if (this.f34766e.get(str) != null) {
            return this.f34766e.get(str).contains("device_model") || this.f34766e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    final boolean e0(String str) throws Throwable {
        n();
        i0(str);
        return this.f34766e.get(str) != null && this.f34766e.get(str).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    final boolean f0(String str) throws Throwable {
        n();
        i0(str);
        return this.f34766e.get(str) != null && this.f34766e.get(str).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    final boolean g0(String str) throws Throwable {
        n();
        i0(str);
        if (this.f34766e.get(str) != null) {
            return this.f34766e.get(str).contains("os_version") || this.f34766e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    final boolean h0(String str) throws Throwable {
        n();
        i0(str);
        return this.f34766e.get(str) != null && this.f34766e.get(str).contains("user_id");
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

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ N5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2812p r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ Y4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C2825q5
    public final /* bridge */ /* synthetic */ C2866w5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2873x5
    protected final boolean y() {
        return false;
    }

    final long z(String str) throws Throwable {
        String strD = d(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strD)) {
            return 0L;
        }
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException e10) {
            k().M().c("Unable to parse timezone offset. appId", C2759h2.w(str), e10);
            return 0L;
        }
    }
}
