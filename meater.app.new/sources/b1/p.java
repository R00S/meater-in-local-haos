package b1;

import a1.d;
import a1.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements InterfaceC2199d {

    /* renamed from: a, reason: collision with root package name */
    public int f30073a;

    /* renamed from: b, reason: collision with root package name */
    a1.e f30074b;

    /* renamed from: c, reason: collision with root package name */
    C2208m f30075c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f30076d;

    /* renamed from: e, reason: collision with root package name */
    C2202g f30077e = new C2202g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f30078f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f30079g = false;

    /* renamed from: h, reason: collision with root package name */
    public C2201f f30080h = new C2201f(this);

    /* renamed from: i, reason: collision with root package name */
    public C2201f f30081i = new C2201f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f30082j = b.NONE;

    /* compiled from: WidgetRun.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30083a;

        static {
            int[] iArr = new int[d.a.values().length];
            f30083a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30083a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30083a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30083a[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30083a[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(a1.e eVar) {
        this.f30074b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f30073a;
        if (i12 == 0) {
            this.f30077e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f30077e.d(Math.min(g(this.f30077e.f30042m, i10), i11));
            return;
        }
        if (i12 == 2) {
            a1.e eVarK = this.f30074b.K();
            if (eVarK != null) {
                if ((i10 == 0 ? eVarK.f19820e : eVarK.f19822f).f30077e.f30030j) {
                    this.f30077e.d(g((int) ((r9.f30027g * (i10 == 0 ? this.f30074b.f19778B : this.f30074b.f19784E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        a1.e eVar = this.f30074b;
        p pVar = eVar.f19820e;
        e.b bVar = pVar.f30076d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f30073a == 3) {
            C2209n c2209n = eVar.f19822f;
            if (c2209n.f30076d == bVar2 && c2209n.f30073a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f19822f;
        }
        if (pVar.f30077e.f30030j) {
            float fV = eVar.v();
            this.f30077e.d(i10 == 1 ? (int) ((pVar.f30077e.f30027g / fV) + 0.5f) : (int) ((fV * pVar.f30077e.f30027g) + 0.5f));
        }
    }

    protected final void b(C2201f c2201f, C2201f c2201f2, int i10) {
        c2201f.f30032l.add(c2201f2);
        c2201f.f30026f = i10;
        c2201f2.f30031k.add(c2201f);
    }

    protected final void c(C2201f c2201f, C2201f c2201f2, int i10, C2202g c2202g) {
        c2201f.f30032l.add(c2201f2);
        c2201f.f30032l.add(this.f30077e);
        c2201f.f30028h = i10;
        c2201f.f30029i = c2202g;
        c2201f2.f30031k.add(c2201f);
        c2202g.f30031k.add(c2201f);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            a1.e eVar = this.f30074b;
            int i12 = eVar.f19776A;
            iMax = Math.max(eVar.f19862z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            a1.e eVar2 = this.f30074b;
            int i13 = eVar2.f19782D;
            iMax = Math.max(eVar2.f19780C, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    protected final C2201f h(a1.d dVar) {
        a1.d dVar2 = dVar.f19761f;
        if (dVar2 == null) {
            return null;
        }
        a1.e eVar = dVar2.f19759d;
        int i10 = a.f30083a[dVar2.f19760e.ordinal()];
        if (i10 == 1) {
            return eVar.f19820e.f30080h;
        }
        if (i10 == 2) {
            return eVar.f19820e.f30081i;
        }
        if (i10 == 3) {
            return eVar.f19822f.f30080h;
        }
        if (i10 == 4) {
            return eVar.f19822f.f30056k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f19822f.f30081i;
    }

    protected final C2201f i(a1.d dVar, int i10) {
        a1.d dVar2 = dVar.f19761f;
        if (dVar2 == null) {
            return null;
        }
        a1.e eVar = dVar2.f19759d;
        p pVar = i10 == 0 ? eVar.f19820e : eVar.f19822f;
        int i11 = a.f30083a[dVar2.f19760e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f30081i;
        }
        return pVar.f30080h;
    }

    public long j() {
        if (this.f30077e.f30030j) {
            return r0.f30027g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f30079g;
    }

    abstract boolean m();

    protected void n(InterfaceC2199d interfaceC2199d, a1.d dVar, a1.d dVar2, int i10) {
        C2201f c2201fH = h(dVar);
        C2201f c2201fH2 = h(dVar2);
        if (c2201fH.f30030j && c2201fH2.f30030j) {
            int iF = c2201fH.f30027g + dVar.f();
            int iF2 = c2201fH2.f30027g - dVar2.f();
            int i11 = iF2 - iF;
            if (!this.f30077e.f30030j && this.f30076d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            C2202g c2202g = this.f30077e;
            if (c2202g.f30030j) {
                if (c2202g.f30027g == i11) {
                    this.f30080h.d(iF);
                    this.f30081i.d(iF2);
                    return;
                }
                float fY = i10 == 0 ? this.f30074b.y() : this.f30074b.R();
                if (c2201fH == c2201fH2) {
                    iF = c2201fH.f30027g;
                    iF2 = c2201fH2.f30027g;
                    fY = 0.5f;
                }
                this.f30080h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f30077e.f30027g) * fY)));
                this.f30081i.d(this.f30080h.f30027g + this.f30077e.f30027g);
            }
        }
    }

    @Override // b1.InterfaceC2199d
    public void a(InterfaceC2199d interfaceC2199d) {
    }

    protected void o(InterfaceC2199d interfaceC2199d) {
    }

    protected void p(InterfaceC2199d interfaceC2199d) {
    }
}
