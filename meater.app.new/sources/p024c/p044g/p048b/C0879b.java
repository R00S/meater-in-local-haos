package p024c.p044g.p048b;

import java.util.ArrayList;
import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.C0886i;

/* compiled from: ArrayRow.java */
/* renamed from: c.g.b.b */
/* loaded from: classes.dex */
public class C0879b implements C0881d.a {

    /* renamed from: e */
    public a f5810e;

    /* renamed from: a */
    C0886i f5806a = null;

    /* renamed from: b */
    float f5807b = 0.0f;

    /* renamed from: c */
    boolean f5808c = false;

    /* renamed from: d */
    ArrayList<C0886i> f5809d = new ArrayList<>();

    /* renamed from: f */
    boolean f5811f = false;

    /* compiled from: ArrayRow.java */
    /* renamed from: c.g.b.b$a */
    public interface a {
        /* renamed from: a */
        int mo5515a();

        /* renamed from: b */
        C0886i mo5516b(int i2);

        /* renamed from: c */
        void mo5517c();

        void clear();

        /* renamed from: d */
        float mo5518d(int i2);

        /* renamed from: e */
        void mo5519e(C0886i c0886i, float f2, boolean z);

        /* renamed from: f */
        float mo5520f(C0886i c0886i);

        /* renamed from: g */
        boolean mo5521g(C0886i c0886i);

        /* renamed from: h */
        float mo5522h(C0879b c0879b, boolean z);

        /* renamed from: i */
        void mo5523i(C0886i c0886i, float f2);

        /* renamed from: j */
        float mo5524j(C0886i c0886i, boolean z);

        /* renamed from: k */
        void mo5525k(float f2);
    }

    public C0879b() {
    }

    /* renamed from: u */
    private boolean m5526u(C0886i c0886i, C0881d c0881d) {
        return c0886i.f5868n <= 1;
    }

    /* renamed from: w */
    private C0886i m5527w(boolean[] zArr, C0886i c0886i) {
        C0886i.a aVar;
        int iMo5515a = this.f5810e.mo5515a();
        C0886i c0886i2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iMo5515a; i2++) {
            float fMo5518d = this.f5810e.mo5518d(i2);
            if (fMo5518d < 0.0f) {
                C0886i c0886iMo5516b = this.f5810e.mo5516b(i2);
                if ((zArr == null || !zArr[c0886iMo5516b.f5858d]) && c0886iMo5516b != c0886i && (((aVar = c0886iMo5516b.f5865k) == C0886i.a.SLACK || aVar == C0886i.a.ERROR) && fMo5518d < f2)) {
                    f2 = fMo5518d;
                    c0886i2 = c0886iMo5516b;
                }
            }
        }
        return c0886i2;
    }

    /* renamed from: A */
    public void m5528A(C0881d c0881d, C0886i c0886i, boolean z) {
        if (c0886i.f5862h) {
            this.f5807b += c0886i.f5861g * this.f5810e.mo5520f(c0886i);
            this.f5810e.mo5524j(c0886i, z);
            if (z) {
                c0886i.m5600c(this);
            }
            if (C0881d.f5818c && this.f5810e.mo5515a() == 0) {
                this.f5811f = true;
                c0881d.f5825j = true;
            }
        }
    }

    /* renamed from: B */
    public void mo5529B(C0881d c0881d, C0879b c0879b, boolean z) {
        this.f5807b += c0879b.f5807b * this.f5810e.mo5522h(c0879b, z);
        if (z) {
            c0879b.f5806a.m5600c(this);
        }
        if (C0881d.f5818c && this.f5806a != null && this.f5810e.mo5515a() == 0) {
            this.f5811f = true;
            c0881d.f5825j = true;
        }
    }

    /* renamed from: C */
    public void m5530C(C0881d c0881d, C0886i c0886i, boolean z) {
        if (c0886i.f5869o) {
            float fMo5520f = this.f5810e.mo5520f(c0886i);
            this.f5807b += c0886i.f5871q * fMo5520f;
            this.f5810e.mo5524j(c0886i, z);
            if (z) {
                c0886i.m5600c(this);
            }
            this.f5810e.mo5519e(c0881d.f5838w.f5815d[c0886i.f5870p], fMo5520f, z);
            if (C0881d.f5818c && this.f5810e.mo5515a() == 0) {
                this.f5811f = true;
                c0881d.f5825j = true;
            }
        }
    }

    /* renamed from: D */
    public void m5531D(C0881d c0881d) {
        if (c0881d.f5831p.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iMo5515a = this.f5810e.mo5515a();
            for (int i2 = 0; i2 < iMo5515a; i2++) {
                C0886i c0886iMo5516b = this.f5810e.mo5516b(i2);
                if (c0886iMo5516b.f5859e != -1 || c0886iMo5516b.f5862h || c0886iMo5516b.f5869o) {
                    this.f5809d.add(c0886iMo5516b);
                }
            }
            int size = this.f5809d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    C0886i c0886i = this.f5809d.get(i3);
                    if (c0886i.f5862h) {
                        m5528A(c0881d, c0886i, true);
                    } else if (c0886i.f5869o) {
                        m5530C(c0881d, c0886i, true);
                    } else {
                        mo5529B(c0881d, c0881d.f5831p[c0886i.f5859e], true);
                    }
                }
                this.f5809d.clear();
            } else {
                z = true;
            }
        }
        if (C0881d.f5818c && this.f5806a != null && this.f5810e.mo5515a() == 0) {
            this.f5811f = true;
            c0881d.f5825j = true;
        }
    }

    @Override // p024c.p044g.p048b.C0881d.a
    /* renamed from: a */
    public void mo5532a(C0886i c0886i) {
        int i2 = c0886i.f5860f;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f5810e.mo5523i(c0886i, f2);
    }

    @Override // p024c.p044g.p048b.C0881d.a
    /* renamed from: b */
    public C0886i mo5533b(C0881d c0881d, boolean[] zArr) {
        return m5527w(zArr, null);
    }

    @Override // p024c.p044g.p048b.C0881d.a
    /* renamed from: c */
    public void mo5534c(C0881d.a aVar) {
        if (aVar instanceof C0879b) {
            C0879b c0879b = (C0879b) aVar;
            this.f5806a = null;
            this.f5810e.clear();
            for (int i2 = 0; i2 < c0879b.f5810e.mo5515a(); i2++) {
                this.f5810e.mo5519e(c0879b.f5810e.mo5516b(i2), c0879b.f5810e.mo5518d(i2), true);
            }
        }
    }

    @Override // p024c.p044g.p048b.C0881d.a
    public void clear() {
        this.f5810e.clear();
        this.f5806a = null;
        this.f5807b = 0.0f;
    }

    /* renamed from: d */
    public C0879b m5535d(C0881d c0881d, int i2) {
        this.f5810e.mo5523i(c0881d.m5578o(i2, "ep"), 1.0f);
        this.f5810e.mo5523i(c0881d.m5578o(i2, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    C0879b m5536e(C0886i c0886i, int i2) {
        this.f5810e.mo5523i(c0886i, i2);
        return this;
    }

    /* renamed from: f */
    boolean m5537f(C0881d c0881d) {
        boolean z;
        C0886i c0886iM5538g = m5538g(c0881d);
        if (c0886iM5538g == null) {
            z = true;
        } else {
            m5553x(c0886iM5538g);
            z = false;
        }
        if (this.f5810e.mo5515a() == 0) {
            this.f5811f = true;
        }
        return z;
    }

    /* renamed from: g */
    C0886i m5538g(C0881d c0881d) {
        int iMo5515a = this.f5810e.mo5515a();
        C0886i c0886i = null;
        C0886i c0886i2 = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < iMo5515a; i2++) {
            float fMo5518d = this.f5810e.mo5518d(i2);
            C0886i c0886iMo5516b = this.f5810e.mo5516b(i2);
            if (c0886iMo5516b.f5865k == C0886i.a.UNRESTRICTED) {
                if (c0886i == null || f2 > fMo5518d) {
                    boolean zM5526u = m5526u(c0886iMo5516b, c0881d);
                    z = zM5526u;
                    f2 = fMo5518d;
                    c0886i = c0886iMo5516b;
                } else if (!z && m5526u(c0886iMo5516b, c0881d)) {
                    f2 = fMo5518d;
                    c0886i = c0886iMo5516b;
                    z = true;
                }
            } else if (c0886i == null && fMo5518d < 0.0f) {
                if (c0886i2 == null || f3 > fMo5518d) {
                    boolean zM5526u2 = m5526u(c0886iMo5516b, c0881d);
                    z2 = zM5526u2;
                    f3 = fMo5518d;
                    c0886i2 = c0886iMo5516b;
                } else if (!z2 && m5526u(c0886iMo5516b, c0881d)) {
                    f3 = fMo5518d;
                    c0886i2 = c0886iMo5516b;
                    z2 = true;
                }
            }
        }
        return c0886i != null ? c0886i : c0886i2;
    }

    @Override // p024c.p044g.p048b.C0881d.a
    public C0886i getKey() {
        return this.f5806a;
    }

    /* renamed from: h */
    C0879b m5539h(C0886i c0886i, C0886i c0886i2, int i2, float f2, C0886i c0886i3, C0886i c0886i4, int i3) {
        if (c0886i2 == c0886i3) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i4, 1.0f);
            this.f5810e.mo5523i(c0886i2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
            this.f5810e.mo5523i(c0886i3, -1.0f);
            this.f5810e.mo5523i(c0886i4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.f5807b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            this.f5810e.mo5523i(c0886i, -1.0f);
            this.f5810e.mo5523i(c0886i2, 1.0f);
            this.f5807b = i2;
        } else if (f2 >= 1.0f) {
            this.f5810e.mo5523i(c0886i4, -1.0f);
            this.f5810e.mo5523i(c0886i3, 1.0f);
            this.f5807b = -i3;
        } else {
            float f3 = 1.0f - f2;
            this.f5810e.mo5523i(c0886i, f3 * 1.0f);
            this.f5810e.mo5523i(c0886i2, f3 * (-1.0f));
            this.f5810e.mo5523i(c0886i3, (-1.0f) * f2);
            this.f5810e.mo5523i(c0886i4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                this.f5807b = ((-i2) * f3) + (i3 * f2);
            }
        }
        return this;
    }

    /* renamed from: i */
    C0879b m5540i(C0886i c0886i, int i2) {
        this.f5806a = c0886i;
        float f2 = i2;
        c0886i.f5861g = f2;
        this.f5807b = f2;
        this.f5811f = true;
        return this;
    }

    @Override // p024c.p044g.p048b.C0881d.a
    public boolean isEmpty() {
        return this.f5806a == null && this.f5807b == 0.0f && this.f5810e.mo5515a() == 0;
    }

    /* renamed from: j */
    C0879b m5541j(C0886i c0886i, C0886i c0886i2, float f2) {
        this.f5810e.mo5523i(c0886i, -1.0f);
        this.f5810e.mo5523i(c0886i2, f2);
        return this;
    }

    /* renamed from: k */
    public C0879b m5542k(C0886i c0886i, C0886i c0886i2, C0886i c0886i3, C0886i c0886i4, float f2) {
        this.f5810e.mo5523i(c0886i, -1.0f);
        this.f5810e.mo5523i(c0886i2, 1.0f);
        this.f5810e.mo5523i(c0886i3, f2);
        this.f5810e.mo5523i(c0886i4, -f2);
        return this;
    }

    /* renamed from: l */
    public C0879b m5543l(float f2, float f3, float f4, C0886i c0886i, C0886i c0886i2, C0886i c0886i3, C0886i c0886i4) {
        this.f5807b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
            this.f5810e.mo5523i(c0886i4, 1.0f);
            this.f5810e.mo5523i(c0886i3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f5810e.mo5523i(c0886i3, 1.0f);
            this.f5810e.mo5523i(c0886i4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
            this.f5810e.mo5523i(c0886i4, f5);
            this.f5810e.mo5523i(c0886i3, -f5);
        }
        return this;
    }

    /* renamed from: m */
    public C0879b m5544m(C0886i c0886i, int i2) {
        if (i2 < 0) {
            this.f5807b = i2 * (-1);
            this.f5810e.mo5523i(c0886i, 1.0f);
        } else {
            this.f5807b = i2;
            this.f5810e.mo5523i(c0886i, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C0879b m5545n(C0886i c0886i, C0886i c0886i2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f5807b = i2;
        }
        if (z) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
        } else {
            this.f5810e.mo5523i(c0886i, -1.0f);
            this.f5810e.mo5523i(c0886i2, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0879b m5546o(C0886i c0886i, C0886i c0886i2, C0886i c0886i3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f5807b = i2;
        }
        if (z) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
            this.f5810e.mo5523i(c0886i3, -1.0f);
        } else {
            this.f5810e.mo5523i(c0886i, -1.0f);
            this.f5810e.mo5523i(c0886i2, 1.0f);
            this.f5810e.mo5523i(c0886i3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C0879b m5547p(C0886i c0886i, C0886i c0886i2, C0886i c0886i3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f5807b = i2;
        }
        if (z) {
            this.f5810e.mo5523i(c0886i, 1.0f);
            this.f5810e.mo5523i(c0886i2, -1.0f);
            this.f5810e.mo5523i(c0886i3, 1.0f);
        } else {
            this.f5810e.mo5523i(c0886i, -1.0f);
            this.f5810e.mo5523i(c0886i2, 1.0f);
            this.f5810e.mo5523i(c0886i3, -1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C0879b m5548q(C0886i c0886i, C0886i c0886i2, C0886i c0886i3, C0886i c0886i4, float f2) {
        this.f5810e.mo5523i(c0886i3, 0.5f);
        this.f5810e.mo5523i(c0886i4, 0.5f);
        this.f5810e.mo5523i(c0886i, -0.5f);
        this.f5810e.mo5523i(c0886i2, -0.5f);
        this.f5807b = -f2;
        return this;
    }

    /* renamed from: r */
    void m5549r() {
        float f2 = this.f5807b;
        if (f2 < 0.0f) {
            this.f5807b = f2 * (-1.0f);
            this.f5810e.mo5517c();
        }
    }

    /* renamed from: s */
    boolean m5550s() {
        C0886i c0886i = this.f5806a;
        return c0886i != null && (c0886i.f5865k == C0886i.a.UNRESTRICTED || this.f5807b >= 0.0f);
    }

    /* renamed from: t */
    boolean m5551t(C0886i c0886i) {
        return this.f5810e.mo5521g(c0886i);
    }

    public String toString() {
        return m5555z();
    }

    /* renamed from: v */
    public C0886i m5552v(C0886i c0886i) {
        return m5527w(null, c0886i);
    }

    /* renamed from: x */
    void m5553x(C0886i c0886i) {
        C0886i c0886i2 = this.f5806a;
        if (c0886i2 != null) {
            this.f5810e.mo5523i(c0886i2, -1.0f);
            this.f5806a.f5859e = -1;
            this.f5806a = null;
        }
        float fMo5524j = this.f5810e.mo5524j(c0886i, true) * (-1.0f);
        this.f5806a = c0886i;
        if (fMo5524j == 1.0f) {
            return;
        }
        this.f5807b /= fMo5524j;
        this.f5810e.mo5525k(fMo5524j);
    }

    /* renamed from: y */
    public void m5554y() {
        this.f5806a = null;
        this.f5810e.clear();
        this.f5807b = 0.0f;
        this.f5811f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m5555z() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.C0879b.m5555z():java.lang.String");
    }

    public C0879b(C0880c c0880c) {
        this.f5810e = new C0878a(this, c0880c);
    }
}
