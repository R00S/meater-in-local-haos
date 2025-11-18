package S9;

import C9.h;
import S9.b;
import V9.d;
import V9.k;
import ca.C2352a;

/* compiled from: AnimationController.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private b f15591a;

    /* renamed from: b, reason: collision with root package name */
    private b.a f15592b;

    /* renamed from: c, reason: collision with root package name */
    private V9.b f15593c;

    /* renamed from: d, reason: collision with root package name */
    private Y9.a f15594d;

    /* renamed from: e, reason: collision with root package name */
    private float f15595e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15596f;

    /* compiled from: AnimationController.java */
    /* renamed from: S9.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0227a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15597a;

        static {
            int[] iArr = new int[V9.a.values().length];
            f15597a = iArr;
            try {
                iArr[V9.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15597a[V9.a.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15597a[V9.a.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15597a[V9.a.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15597a[V9.a.FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15597a[V9.a.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15597a[V9.a.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15597a[V9.a.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15597a[V9.a.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15597a[V9.a.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public a(Y9.a aVar, b.a aVar2) {
        this.f15591a = new b(aVar2);
        this.f15592b = aVar2;
        this.f15594d = aVar;
    }

    private void a() {
        switch (C0227a.f15597a[this.f15594d.b().ordinal()]) {
            case 1:
                this.f15592b.a(null);
                break;
            case 2:
                c();
                break;
            case 3:
                h();
                break;
            case 4:
                m();
                break;
            case 5:
                f();
                break;
            case 6:
                j();
                break;
            case 7:
                l();
                break;
            case 8:
                d();
                break;
            case 9:
                k();
                break;
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                i();
                break;
        }
    }

    private void c() {
        int iO = this.f15594d.o();
        int iS = this.f15594d.s();
        V9.b bVarB = this.f15591a.a().l(iS, iO).b(this.f15594d.a());
        if (this.f15596f) {
            bVarB.m(this.f15595e);
        } else {
            bVarB.e();
        }
        this.f15593c = bVarB;
    }

    private void d() {
        int iP = this.f15594d.x() ? this.f15594d.p() : this.f15594d.e();
        int iQ = this.f15594d.x() ? this.f15594d.q() : this.f15594d.p();
        int iA = C2352a.a(this.f15594d, iP);
        int iA2 = C2352a.a(this.f15594d, iQ);
        int iK = this.f15594d.k();
        int i10 = this.f15594d.i();
        if (this.f15594d.f() != Y9.b.HORIZONTAL) {
            iK = i10;
        }
        int iL = this.f15594d.l();
        d dVarM = this.f15591a.b().i(this.f15594d.a()).m(iA, iA2, (iL * 3) + iK, iL + iK, iL);
        if (this.f15596f) {
            dVarM.m(this.f15595e);
        } else {
            dVarM.e();
        }
        this.f15593c = dVarM;
    }

    private void f() {
        int iO = this.f15594d.o();
        int iS = this.f15594d.s();
        int iL = this.f15594d.l();
        int iR = this.f15594d.r();
        V9.b bVarB = this.f15591a.c().q(iS, iO, iL, iR).b(this.f15594d.a());
        if (this.f15596f) {
            bVarB.m(this.f15595e);
        } else {
            bVarB.e();
        }
        this.f15593c = bVarB;
    }

    private void h() {
        int iO = this.f15594d.o();
        int iS = this.f15594d.s();
        int iL = this.f15594d.l();
        float fN = this.f15594d.n();
        V9.b bVarB = this.f15591a.d().p(iS, iO, iL, fN).b(this.f15594d.a());
        if (this.f15596f) {
            bVarB.m(this.f15595e);
        } else {
            bVarB.e();
        }
        this.f15593c = bVarB;
    }

    private void i() {
        int iO = this.f15594d.o();
        int iS = this.f15594d.s();
        int iL = this.f15594d.l();
        float fN = this.f15594d.n();
        V9.b bVarB = this.f15591a.e().p(iS, iO, iL, fN).b(this.f15594d.a());
        if (this.f15596f) {
            bVarB.m(this.f15595e);
        } else {
            bVarB.e();
        }
        this.f15593c = bVarB;
    }

    private void j() {
        int iP = this.f15594d.x() ? this.f15594d.p() : this.f15594d.e();
        int iQ = this.f15594d.x() ? this.f15594d.q() : this.f15594d.p();
        V9.b bVarB = this.f15591a.f().l(C2352a.a(this.f15594d, iP), C2352a.a(this.f15594d, iQ)).b(this.f15594d.a());
        if (this.f15596f) {
            bVarB.m(this.f15595e);
        } else {
            bVarB.e();
        }
        this.f15593c = bVarB;
    }

    private void k() {
        int iP = this.f15594d.x() ? this.f15594d.p() : this.f15594d.e();
        int iQ = this.f15594d.x() ? this.f15594d.q() : this.f15594d.p();
        V9.b bVarB = this.f15591a.g().l(C2352a.a(this.f15594d, iP), C2352a.a(this.f15594d, iQ)).b(this.f15594d.a());
        if (this.f15596f) {
            bVarB.m(this.f15595e);
        } else {
            bVarB.e();
        }
        this.f15593c = bVarB;
    }

    private void l() {
        int iP = this.f15594d.x() ? this.f15594d.p() : this.f15594d.e();
        int iQ = this.f15594d.x() ? this.f15594d.q() : this.f15594d.p();
        int iA = C2352a.a(this.f15594d, iP);
        int iA2 = C2352a.a(this.f15594d, iQ);
        boolean z10 = iQ > iP;
        k kVarJ = this.f15591a.h().n(iA, iA2, this.f15594d.l(), z10).j(this.f15594d.a());
        if (this.f15596f) {
            kVarJ.m(this.f15595e);
        } else {
            kVarJ.e();
        }
        this.f15593c = kVarJ;
    }

    private void m() {
        int iP = this.f15594d.x() ? this.f15594d.p() : this.f15594d.e();
        int iQ = this.f15594d.x() ? this.f15594d.q() : this.f15594d.p();
        int iA = C2352a.a(this.f15594d, iP);
        int iA2 = C2352a.a(this.f15594d, iQ);
        boolean z10 = iQ > iP;
        k kVarJ = this.f15591a.i().n(iA, iA2, this.f15594d.l(), z10).j(this.f15594d.a());
        if (this.f15596f) {
            kVarJ.m(this.f15595e);
        } else {
            kVarJ.e();
        }
        this.f15593c = kVarJ;
    }

    public void b() {
        this.f15596f = false;
        this.f15595e = 0.0f;
        a();
    }

    public void e() {
        V9.b bVar = this.f15593c;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void g(float f10) {
        this.f15596f = true;
        this.f15595e = f10;
        a();
    }
}
