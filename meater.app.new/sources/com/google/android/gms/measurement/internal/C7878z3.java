package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* loaded from: classes2.dex */
final class C7878z3 {

    /* renamed from: A */
    private long f29020A;

    /* renamed from: B */
    private long f29021B;

    /* renamed from: C */
    private long f29022C;

    /* renamed from: D */
    private String f29023D;

    /* renamed from: E */
    private boolean f29024E;

    /* renamed from: F */
    private long f29025F;

    /* renamed from: G */
    private long f29026G;

    /* renamed from: a */
    private final zzfx f29027a;

    /* renamed from: b */
    private final String f29028b;

    /* renamed from: c */
    private String f29029c;

    /* renamed from: d */
    private String f29030d;

    /* renamed from: e */
    private String f29031e;

    /* renamed from: f */
    private String f29032f;

    /* renamed from: g */
    private long f29033g;

    /* renamed from: h */
    private long f29034h;

    /* renamed from: i */
    private long f29035i;

    /* renamed from: j */
    private String f29036j;

    /* renamed from: k */
    private long f29037k;

    /* renamed from: l */
    private String f29038l;

    /* renamed from: m */
    private long f29039m;

    /* renamed from: n */
    private long f29040n;

    /* renamed from: o */
    private boolean f29041o;

    /* renamed from: p */
    private long f29042p;

    /* renamed from: q */
    private boolean f29043q;

    /* renamed from: r */
    private boolean f29044r;

    /* renamed from: s */
    private String f29045s;

    /* renamed from: t */
    private Boolean f29046t;

    /* renamed from: u */
    private long f29047u;

    /* renamed from: v */
    private List<String> f29048v;

    /* renamed from: w */
    private String f29049w;

    /* renamed from: x */
    private long f29050x;

    /* renamed from: y */
    private long f29051y;

    /* renamed from: z */
    private long f29052z;

    C7878z3(zzfx zzfxVar, String str) {
        Preconditions.m14372k(zzfxVar);
        Preconditions.m14368g(str);
        this.f29027a = zzfxVar;
        this.f29028b = str;
        zzfxVar.mo22835g().mo22792d();
    }

    /* renamed from: A */
    public final String m22882A() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29030d;
    }

    /* renamed from: B */
    public final void m22883B(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29040n != j2;
        this.f29040n = j2;
    }

    /* renamed from: C */
    public final void m22884C(String str) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23514t0(this.f29031e, str);
        this.f29031e = str;
    }

    /* renamed from: D */
    public final String m22885D() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29045s;
    }

    /* renamed from: E */
    public final void m22886E(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29047u != j2;
        this.f29047u = j2;
    }

    /* renamed from: F */
    public final void m22887F(String str) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23514t0(this.f29032f, str);
        this.f29032f = str;
    }

    /* renamed from: G */
    public final String m22888G() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29049w;
    }

    /* renamed from: H */
    public final void m22889H(long j2) {
        Preconditions.m14362a(j2 >= 0);
        this.f29027a.mo22835g().mo22792d();
        this.f29024E = (this.f29033g != j2) | this.f29024E;
        this.f29033g = j2;
    }

    /* renamed from: I */
    public final void m22890I(String str) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23514t0(this.f29036j, str);
        this.f29036j = str;
    }

    /* renamed from: J */
    public final String m22891J() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29031e;
    }

    /* renamed from: K */
    public final void m22892K(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29025F != j2;
        this.f29025F = j2;
    }

    /* renamed from: L */
    public final void m22893L(String str) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23514t0(this.f29038l, str);
        this.f29038l = str;
    }

    /* renamed from: M */
    public final String m22894M() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29032f;
    }

    /* renamed from: N */
    public final void m22895N(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29026G != j2;
        this.f29026G = j2;
    }

    /* renamed from: O */
    public final void m22896O(String str) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23514t0(this.f29023D, str);
        this.f29023D = str;
    }

    /* renamed from: P */
    public final long m22897P() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29034h;
    }

    /* renamed from: Q */
    public final void m22898Q(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29050x != j2;
        this.f29050x = j2;
    }

    /* renamed from: R */
    public final long m22899R() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29035i;
    }

    /* renamed from: S */
    public final void m22900S(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29051y != j2;
        this.f29051y = j2;
    }

    /* renamed from: T */
    public final String m22901T() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29036j;
    }

    /* renamed from: U */
    public final void m22902U(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29052z != j2;
        this.f29052z = j2;
    }

    /* renamed from: V */
    public final long m22903V() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29037k;
    }

    /* renamed from: W */
    public final void m22904W(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29020A != j2;
        this.f29020A = j2;
    }

    /* renamed from: X */
    public final String m22905X() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29038l;
    }

    /* renamed from: Y */
    public final void m22906Y(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29022C != j2;
        this.f29022C = j2;
    }

    /* renamed from: Z */
    public final long m22907Z() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29039m;
    }

    /* renamed from: a */
    public final void m22908a(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29034h != j2;
        this.f29034h = j2;
    }

    /* renamed from: a0 */
    public final void m22909a0(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29021B != j2;
        this.f29021B = j2;
    }

    /* renamed from: b */
    public final void m22910b(Boolean bool) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23503X(this.f29046t, bool);
        this.f29046t = bool;
    }

    /* renamed from: b0 */
    public final long m22911b0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29040n;
    }

    /* renamed from: c */
    public final void m22912c(String str) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= !zzkk.m23514t0(this.f29029c, str);
        this.f29029c = str;
    }

    /* renamed from: c0 */
    public final void m22913c0(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29042p != j2;
        this.f29042p = j2;
    }

    /* renamed from: d */
    public final void m22914d(List<String> list) {
        this.f29027a.mo22835g().mo22792d();
        if (zzkk.m23507f0(this.f29048v, list)) {
            return;
        }
        this.f29024E = true;
        this.f29048v = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: d0 */
    public final long m22915d0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29047u;
    }

    /* renamed from: e */
    public final void m22916e(boolean z) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29041o != z;
        this.f29041o = z;
    }

    /* renamed from: e0 */
    public final boolean m22917e0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29041o;
    }

    /* renamed from: f */
    public final boolean m22918f() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29024E;
    }

    /* renamed from: f0 */
    public final long m22919f0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29033g;
    }

    /* renamed from: g */
    public final long m22920g() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29022C;
    }

    /* renamed from: g0 */
    public final long m22921g0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29025F;
    }

    /* renamed from: h */
    public final long m22922h() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29021B;
    }

    /* renamed from: h0 */
    public final long m22923h0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29026G;
    }

    /* renamed from: i */
    public final String m22924i() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29023D;
    }

    /* renamed from: i0 */
    public final void m22925i0() {
        this.f29027a.mo22835g().mo22792d();
        long j2 = this.f29033g + 1;
        if (j2 > 2147483647L) {
            this.f29027a.mo22836h().m23140K().m23148b("Bundle index overflow. appId", zzet.m23131x(this.f29028b));
            j2 = 0;
        }
        this.f29024E = true;
        this.f29033g = j2;
    }

    /* renamed from: j */
    public final String m22926j() {
        this.f29027a.mo22835g().mo22792d();
        String str = this.f29023D;
        m22896O(null);
        return str;
    }

    /* renamed from: j0 */
    public final long m22927j0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29050x;
    }

    /* renamed from: k */
    public final long m22928k() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29042p;
    }

    /* renamed from: k0 */
    public final long m22929k0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29051y;
    }

    /* renamed from: l */
    public final boolean m22930l() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29043q;
    }

    /* renamed from: l0 */
    public final long m22931l0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29052z;
    }

    /* renamed from: m */
    public final boolean m22932m() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29044r;
    }

    /* renamed from: m0 */
    public final long m22933m0() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29020A;
    }

    /* renamed from: n */
    public final Boolean m22934n() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29046t;
    }

    /* renamed from: o */
    public final List<String> m22935o() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29048v;
    }

    /* renamed from: p */
    public final void m22936p() {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E = false;
    }

    /* renamed from: q */
    public final void m22937q(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29035i != j2;
        this.f29035i = j2;
    }

    /* renamed from: r */
    public final void m22938r(String str) {
        this.f29027a.mo22835g().mo22792d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f29024E |= !zzkk.m23514t0(this.f29030d, str);
        this.f29030d = str;
    }

    /* renamed from: s */
    public final void m22939s(boolean z) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29043q != z;
        this.f29043q = z;
    }

    /* renamed from: t */
    public final String m22940t() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29028b;
    }

    /* renamed from: u */
    public final void m22941u(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29037k != j2;
        this.f29037k = j2;
    }

    /* renamed from: v */
    public final void m22942v(String str) {
        this.f29027a.mo22835g().mo22792d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f29024E |= !zzkk.m23514t0(this.f29045s, str);
        this.f29045s = str;
    }

    /* renamed from: w */
    public final void m22943w(boolean z) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29044r != z;
        this.f29044r = z;
    }

    /* renamed from: x */
    public final String m22944x() {
        this.f29027a.mo22835g().mo22792d();
        return this.f29029c;
    }

    /* renamed from: y */
    public final void m22945y(long j2) {
        this.f29027a.mo22835g().mo22792d();
        this.f29024E |= this.f29039m != j2;
        this.f29039m = j2;
    }

    /* renamed from: z */
    public final void m22946z(String str) {
        this.f29027a.mo22835g().mo22792d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f29024E |= !zzkk.m23514t0(this.f29049w, str);
        this.f29049w = str;
    }
}
