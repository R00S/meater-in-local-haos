package a1;

import a1.d;
import a1.e;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: L0, reason: collision with root package name */
    protected float f19943L0 = -1.0f;

    /* renamed from: M0, reason: collision with root package name */
    protected int f19944M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    protected int f19945N0 = -1;

    /* renamed from: O0, reason: collision with root package name */
    protected boolean f19946O0 = true;

    /* renamed from: P0, reason: collision with root package name */
    private d f19947P0 = this.f19801P;

    /* renamed from: Q0, reason: collision with root package name */
    private int f19948Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private int f19949R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f19950S0;

    /* compiled from: Guideline.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19951a;

        static {
            int[] iArr = new int[d.a.values().length];
            f19951a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19951a[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19951a[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19951a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19951a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19951a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19951a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19951a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19951a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f19809X.clear();
        this.f19809X.add(this.f19947P0);
        int length = this.f19808W.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f19808W[i10] = this.f19947P0;
        }
    }

    public void A1(float f10) {
        if (f10 > -1.0f) {
            this.f19943L0 = f10;
            this.f19944M0 = -1;
            this.f19945N0 = -1;
        }
    }

    public void B1(int i10) {
        if (this.f19948Q0 == i10) {
            return;
        }
        this.f19948Q0 = i10;
        this.f19809X.clear();
        if (this.f19948Q0 == 1) {
            this.f19947P0 = this.f19800O;
        } else {
            this.f19947P0 = this.f19801P;
        }
        this.f19809X.add(this.f19947P0);
        int length = this.f19808W.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f19808W[i11] = this.f19947P0;
        }
    }

    @Override // a1.e
    public void g(X0.d dVar, boolean z10) {
        f fVar = (f) K();
        if (fVar == null) {
            return;
        }
        d dVarO = fVar.o(d.a.LEFT);
        d dVarO2 = fVar.o(d.a.RIGHT);
        e eVar = this.f19813a0;
        boolean z11 = eVar != null && eVar.f19811Z[0] == e.b.WRAP_CONTENT;
        if (this.f19948Q0 == 0) {
            dVarO = fVar.o(d.a.TOP);
            dVarO2 = fVar.o(d.a.BOTTOM);
            e eVar2 = this.f19813a0;
            z11 = eVar2 != null && eVar2.f19811Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.f19950S0 && this.f19947P0.n()) {
            X0.i iVarQ = dVar.q(this.f19947P0);
            dVar.f(iVarQ, this.f19947P0.e());
            if (this.f19944M0 != -1) {
                if (z11) {
                    dVar.h(dVar.q(dVarO2), iVarQ, 0, 5);
                }
            } else if (this.f19945N0 != -1 && z11) {
                X0.i iVarQ2 = dVar.q(dVarO2);
                dVar.h(iVarQ, dVar.q(dVarO), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.f19950S0 = false;
            return;
        }
        if (this.f19944M0 != -1) {
            X0.i iVarQ3 = dVar.q(this.f19947P0);
            dVar.e(iVarQ3, dVar.q(dVarO), this.f19944M0, 8);
            if (z11) {
                dVar.h(dVar.q(dVarO2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.f19945N0 == -1) {
            if (this.f19943L0 != -1.0f) {
                dVar.d(X0.d.s(dVar, dVar.q(this.f19947P0), dVar.q(dVarO2), this.f19943L0));
                return;
            }
            return;
        }
        X0.i iVarQ4 = dVar.q(this.f19947P0);
        X0.i iVarQ5 = dVar.q(dVarO2);
        dVar.e(iVarQ4, iVarQ5, -this.f19945N0, 8);
        if (z11) {
            dVar.h(iVarQ4, dVar.q(dVarO), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // a1.e
    public boolean h() {
        return true;
    }

    @Override // a1.e
    public boolean n0() {
        return this.f19950S0;
    }

    @Override // a1.e
    public d o(d.a aVar) {
        int i10 = a.f19951a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f19948Q0 == 1) {
                return this.f19947P0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f19948Q0 == 0) {
            return this.f19947P0;
        }
        return null;
    }

    @Override // a1.e
    public boolean o0() {
        return this.f19950S0;
    }

    @Override // a1.e
    public void r1(X0.d dVar, boolean z10) {
        if (K() == null) {
            return;
        }
        int iY = dVar.y(this.f19947P0);
        if (this.f19948Q0 == 1) {
            n1(iY);
            o1(0);
            M0(K().x());
            l1(0);
            return;
        }
        n1(0);
        o1(iY);
        l1(K().W());
        M0(0);
    }

    public d s1() {
        return this.f19947P0;
    }

    public int t1() {
        return this.f19948Q0;
    }

    public int u1() {
        return this.f19944M0;
    }

    public int v1() {
        return this.f19945N0;
    }

    public float w1() {
        return this.f19943L0;
    }

    public void x1(int i10) {
        this.f19947P0.t(i10);
        this.f19950S0 = true;
    }

    public void y1(int i10) {
        if (i10 > -1) {
            this.f19943L0 = -1.0f;
            this.f19944M0 = i10;
            this.f19945N0 = -1;
        }
    }

    public void z1(int i10) {
        if (i10 > -1) {
            this.f19943L0 = -1.0f;
            this.f19944M0 = -1;
            this.f19945N0 = i10;
        }
    }
}
