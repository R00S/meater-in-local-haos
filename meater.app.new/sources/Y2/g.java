package Y2;

import android.text.Layout;

/* compiled from: TtmlStyle.java */
/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f19362a;

    /* renamed from: b, reason: collision with root package name */
    private int f19363b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19364c;

    /* renamed from: d, reason: collision with root package name */
    private int f19365d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19366e;

    /* renamed from: k, reason: collision with root package name */
    private float f19372k;

    /* renamed from: l, reason: collision with root package name */
    private String f19373l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f19376o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f19377p;

    /* renamed from: r, reason: collision with root package name */
    private b f19379r;

    /* renamed from: f, reason: collision with root package name */
    private int f19367f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f19368g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f19369h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f19370i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f19371j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f19374m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f19375n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f19378q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f19380s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f19364c && gVar.f19364c) {
                w(gVar.f19363b);
            }
            if (this.f19369h == -1) {
                this.f19369h = gVar.f19369h;
            }
            if (this.f19370i == -1) {
                this.f19370i = gVar.f19370i;
            }
            if (this.f19362a == null && (str = gVar.f19362a) != null) {
                this.f19362a = str;
            }
            if (this.f19367f == -1) {
                this.f19367f = gVar.f19367f;
            }
            if (this.f19368g == -1) {
                this.f19368g = gVar.f19368g;
            }
            if (this.f19375n == -1) {
                this.f19375n = gVar.f19375n;
            }
            if (this.f19376o == null && (alignment2 = gVar.f19376o) != null) {
                this.f19376o = alignment2;
            }
            if (this.f19377p == null && (alignment = gVar.f19377p) != null) {
                this.f19377p = alignment;
            }
            if (this.f19378q == -1) {
                this.f19378q = gVar.f19378q;
            }
            if (this.f19371j == -1) {
                this.f19371j = gVar.f19371j;
                this.f19372k = gVar.f19372k;
            }
            if (this.f19379r == null) {
                this.f19379r = gVar.f19379r;
            }
            if (this.f19380s == Float.MAX_VALUE) {
                this.f19380s = gVar.f19380s;
            }
            if (z10 && !this.f19366e && gVar.f19366e) {
                u(gVar.f19365d);
            }
            if (z10 && this.f19374m == -1 && (i10 = gVar.f19374m) != -1) {
                this.f19374m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f19373l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f19370i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f19367f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f19377p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f19375n = i10;
        return this;
    }

    public g F(int i10) {
        this.f19374m = i10;
        return this;
    }

    public g G(float f10) {
        this.f19380s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f19376o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f19378q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f19379r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f19368g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f19366e) {
            return this.f19365d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f19364c) {
            return this.f19363b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f19362a;
    }

    public float e() {
        return this.f19372k;
    }

    public int f() {
        return this.f19371j;
    }

    public String g() {
        return this.f19373l;
    }

    public Layout.Alignment h() {
        return this.f19377p;
    }

    public int i() {
        return this.f19375n;
    }

    public int j() {
        return this.f19374m;
    }

    public float k() {
        return this.f19380s;
    }

    public int l() {
        int i10 = this.f19369h;
        if (i10 == -1 && this.f19370i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f19370i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f19376o;
    }

    public boolean n() {
        return this.f19378q == 1;
    }

    public b o() {
        return this.f19379r;
    }

    public boolean p() {
        return this.f19366e;
    }

    public boolean q() {
        return this.f19364c;
    }

    public boolean s() {
        return this.f19367f == 1;
    }

    public boolean t() {
        return this.f19368g == 1;
    }

    public g u(int i10) {
        this.f19365d = i10;
        this.f19366e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f19369h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f19363b = i10;
        this.f19364c = true;
        return this;
    }

    public g x(String str) {
        this.f19362a = str;
        return this;
    }

    public g y(float f10) {
        this.f19372k = f10;
        return this;
    }

    public g z(int i10) {
        this.f19371j = i10;
        return this;
    }
}
