package p024c.p044g.p048b.p049k.p050m;

import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: WidgetRun.java */
/* renamed from: c.g.b.k.m.p */
/* loaded from: classes.dex */
public abstract class AbstractC0915p implements InterfaceC0903d {

    /* renamed from: a */
    public int f6159a;

    /* renamed from: b */
    C0892e f6160b;

    /* renamed from: c */
    C0912m f6161c;

    /* renamed from: d */
    protected C0892e.b f6162d;

    /* renamed from: e */
    C0906g f6163e = new C0906g(this);

    /* renamed from: f */
    public int f6164f = 0;

    /* renamed from: g */
    boolean f6165g = false;

    /* renamed from: h */
    public C0905f f6166h = new C0905f(this);

    /* renamed from: i */
    public C0905f f6167i = new C0905f(this);

    /* renamed from: j */
    protected b f6168j = b.NONE;

    /* compiled from: WidgetRun.java */
    /* renamed from: c.g.b.k.m.p$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6169a;

        static {
            int[] iArr = new int[C0891d.b.values().length];
            f6169a = iArr;
            try {
                iArr[C0891d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6169a[C0891d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6169a[C0891d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6169a[C0891d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6169a[C0891d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* renamed from: c.g.b.k.m.p$b */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC0915p(C0892e c0892e) {
        this.f6160b = c0892e;
    }

    /* renamed from: l */
    private void m5863l(int i2, int i3) {
        int i4 = this.f6159a;
        if (i4 == 0) {
            this.f6163e.mo5830d(m5866g(i3, i2));
            return;
        }
        if (i4 == 1) {
            this.f6163e.mo5830d(Math.min(m5866g(this.f6163e.f6129m, i2), i3));
            return;
        }
        if (i4 == 2) {
            C0892e c0892eM5668I = this.f6160b.m5668I();
            if (c0892eM5668I != null) {
                if ((i2 == 0 ? c0892eM5668I.f5978f : c0892eM5668I.f5980g).f6163e.f6117j) {
                    C0892e c0892e = this.f6160b;
                    this.f6163e.mo5830d(m5866g((int) ((r9.f6114g * (i2 == 0 ? c0892e.f6010v : c0892e.f6016y)) + 0.5f), i2));
                    return;
                }
                return;
            }
            return;
        }
        if (i4 != 3) {
            return;
        }
        C0892e c0892e2 = this.f6160b;
        AbstractC0915p abstractC0915p = c0892e2.f5978f;
        C0892e.b bVar = abstractC0915p.f6162d;
        C0892e.b bVar2 = C0892e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && abstractC0915p.f6159a == 3) {
            C0913n c0913n = c0892e2.f5980g;
            if (c0913n.f6162d == bVar2 && c0913n.f6159a == 3) {
                return;
            }
        }
        if (i2 == 0) {
            abstractC0915p = c0892e2.f5980g;
        }
        if (abstractC0915p.f6163e.f6117j) {
            float fM5732t = c0892e2.m5732t();
            this.f6163e.mo5830d(i2 == 1 ? (int) ((abstractC0915p.f6163e.f6114g / fM5732t) + 0.5f) : (int) ((fM5732t * abstractC0915p.f6163e.f6114g) + 0.5f));
        }
    }

    @Override // p024c.p044g.p048b.p049k.p050m.InterfaceC0903d
    /* renamed from: a */
    public void mo5808a(InterfaceC0903d interfaceC0903d) {
    }

    /* renamed from: b */
    protected final void m5864b(C0905f c0905f, C0905f c0905f2, int i2) {
        c0905f.f6119l.add(c0905f2);
        c0905f.f6113f = i2;
        c0905f2.f6118k.add(c0905f);
    }

    /* renamed from: c */
    protected final void m5865c(C0905f c0905f, C0905f c0905f2, int i2, C0906g c0906g) {
        c0905f.f6119l.add(c0905f2);
        c0905f.f6119l.add(this.f6163e);
        c0905f.f6115h = i2;
        c0905f.f6116i = c0906g;
        c0905f2.f6118k.add(c0905f);
        c0906g.f6118k.add(c0905f);
    }

    /* renamed from: d */
    abstract void mo5809d();

    /* renamed from: e */
    abstract void mo5810e();

    /* renamed from: f */
    abstract void mo5811f();

    /* renamed from: g */
    protected final int m5866g(int i2, int i3) {
        int iMax;
        if (i3 == 0) {
            C0892e c0892e = this.f6160b;
            int i4 = c0892e.f6008u;
            iMax = Math.max(c0892e.f6006t, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            C0892e c0892e2 = this.f6160b;
            int i5 = c0892e2.f6014x;
            iMax = Math.max(c0892e2.f6012w, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    /* renamed from: h */
    protected final C0905f m5867h(C0891d c0891d) {
        C0891d c0891d2 = c0891d.f5924f;
        if (c0891d2 == null) {
            return null;
        }
        C0892e c0892e = c0891d2.f5922d;
        int i2 = a.f6169a[c0891d2.f5923e.ordinal()];
        if (i2 == 1) {
            return c0892e.f5978f.f6166h;
        }
        if (i2 == 2) {
            return c0892e.f5978f.f6167i;
        }
        if (i2 == 3) {
            return c0892e.f5980g.f6166h;
        }
        if (i2 == 4) {
            return c0892e.f5980g.f6141k;
        }
        if (i2 != 5) {
            return null;
        }
        return c0892e.f5980g.f6167i;
    }

    /* renamed from: i */
    protected final C0905f m5868i(C0891d c0891d, int i2) {
        C0891d c0891d2 = c0891d.f5924f;
        if (c0891d2 == null) {
            return null;
        }
        C0892e c0892e = c0891d2.f5922d;
        AbstractC0915p abstractC0915p = i2 == 0 ? c0892e.f5978f : c0892e.f5980g;
        int i3 = a.f6169a[c0891d2.f5923e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return abstractC0915p.f6167i;
        }
        return abstractC0915p.f6166h;
    }

    /* renamed from: j */
    public long mo5812j() {
        if (this.f6163e.f6117j) {
            return r0.f6114g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m5869k() {
        return this.f6165g;
    }

    /* renamed from: m */
    abstract boolean mo5813m();

    /* renamed from: n */
    protected void m5870n(InterfaceC0903d interfaceC0903d, C0891d c0891d, C0891d c0891d2, int i2) {
        C0905f c0905fM5867h = m5867h(c0891d);
        C0905f c0905fM5867h2 = m5867h(c0891d2);
        if (c0905fM5867h.f6117j && c0905fM5867h2.f6117j) {
            int iM5634e = c0905fM5867h.f6114g + c0891d.m5634e();
            int iM5634e2 = c0905fM5867h2.f6114g - c0891d2.m5634e();
            int i3 = iM5634e2 - iM5634e;
            if (!this.f6163e.f6117j && this.f6162d == C0892e.b.MATCH_CONSTRAINT) {
                m5863l(i2, i3);
            }
            C0906g c0906g = this.f6163e;
            if (c0906g.f6117j) {
                if (c0906g.f6114g == i3) {
                    this.f6166h.mo5830d(iM5634e);
                    this.f6167i.mo5830d(iM5634e2);
                    return;
                }
                C0892e c0892e = this.f6160b;
                float fM5738w = i2 == 0 ? c0892e.m5738w() : c0892e.m5676M();
                if (c0905fM5867h == c0905fM5867h2) {
                    iM5634e = c0905fM5867h.f6114g;
                    iM5634e2 = c0905fM5867h2.f6114g;
                    fM5738w = 0.5f;
                }
                this.f6166h.mo5830d((int) (iM5634e + 0.5f + (((iM5634e2 - iM5634e) - this.f6163e.f6114g) * fM5738w)));
                this.f6167i.mo5830d(this.f6166h.f6114g + this.f6163e.f6114g);
            }
        }
    }

    /* renamed from: o */
    protected void m5871o(InterfaceC0903d interfaceC0903d) {
    }

    /* renamed from: p */
    protected void m5872p(InterfaceC0903d interfaceC0903d) {
    }
}
