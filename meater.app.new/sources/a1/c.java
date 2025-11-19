package a1;

import a1.e;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f19734a;

    /* renamed from: b, reason: collision with root package name */
    protected e f19735b;

    /* renamed from: c, reason: collision with root package name */
    protected e f19736c;

    /* renamed from: d, reason: collision with root package name */
    protected e f19737d;

    /* renamed from: e, reason: collision with root package name */
    protected e f19738e;

    /* renamed from: f, reason: collision with root package name */
    protected e f19739f;

    /* renamed from: g, reason: collision with root package name */
    protected e f19740g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f19741h;

    /* renamed from: i, reason: collision with root package name */
    protected int f19742i;

    /* renamed from: j, reason: collision with root package name */
    protected int f19743j;

    /* renamed from: k, reason: collision with root package name */
    protected float f19744k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f19745l;

    /* renamed from: m, reason: collision with root package name */
    int f19746m;

    /* renamed from: n, reason: collision with root package name */
    int f19747n;

    /* renamed from: o, reason: collision with root package name */
    boolean f19748o;

    /* renamed from: p, reason: collision with root package name */
    private int f19749p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19750q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f19751r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f19752s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f19753t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f19754u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f19755v;

    public c(e eVar, int i10, boolean z10) {
        this.f19734a = eVar;
        this.f19749p = i10;
        this.f19750q = z10;
    }

    private void b() {
        int i10 = this.f19749p * 2;
        e eVar = this.f19734a;
        this.f19748o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f19742i++;
            e[] eVarArr = eVar.f19787F0;
            int i11 = this.f19749p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f19785E0[i11] = null;
            if (eVar.V() != 8) {
                this.f19745l++;
                e.b bVarU = eVar.u(this.f19749p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f19746m += eVar.E(this.f19749p);
                }
                int iF = this.f19746m + eVar.f19808W[i10].f();
                this.f19746m = iF;
                int i12 = i10 + 1;
                this.f19746m = iF + eVar.f19808W[i12].f();
                int iF2 = this.f19747n + eVar.f19808W[i10].f();
                this.f19747n = iF2;
                this.f19747n = iF2 + eVar.f19808W[i12].f();
                if (this.f19735b == null) {
                    this.f19735b = eVar;
                }
                this.f19737d = eVar;
                e.b[] bVarArr = eVar.f19811Z;
                int i13 = this.f19749p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f19860y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f19743j++;
                        float f10 = eVar.f19783D0[i13];
                        if (f10 > 0.0f) {
                            this.f19744k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f19751r = true;
                            } else {
                                this.f19752s = true;
                            }
                            if (this.f19741h == null) {
                                this.f19741h = new ArrayList<>();
                            }
                            this.f19741h.add(eVar);
                        }
                        if (this.f19739f == null) {
                            this.f19739f = eVar;
                        }
                        e eVar4 = this.f19740g;
                        if (eVar4 != null) {
                            eVar4.f19785E0[this.f19749p] = eVar;
                        }
                        this.f19740g = eVar;
                    }
                    if (this.f19749p == 0) {
                        if (eVar.f19856w != 0 || eVar.f19862z != 0 || eVar.f19776A != 0) {
                            this.f19748o = false;
                        }
                    } else if (eVar.f19858x != 0 || eVar.f19780C != 0 || eVar.f19782D != 0) {
                        this.f19748o = false;
                    }
                    if (eVar.f19819d0 != 0.0f) {
                        this.f19748o = false;
                        this.f19754u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f19787F0[this.f19749p] = eVar;
            }
            d dVar = eVar.f19808W[i10 + 1].f19761f;
            if (dVar != null) {
                e eVar5 = dVar.f19759d;
                d dVar2 = eVar5.f19808W[i10].f19761f;
                if (dVar2 != null && dVar2.f19759d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f19735b;
        if (eVar6 != null) {
            this.f19746m -= eVar6.f19808W[i10].f();
        }
        e eVar7 = this.f19737d;
        if (eVar7 != null) {
            this.f19746m -= eVar7.f19808W[i10 + 1].f();
        }
        this.f19736c = eVar;
        if (this.f19749p == 0 && this.f19750q) {
            this.f19738e = eVar;
        } else {
            this.f19738e = this.f19734a;
        }
        this.f19753t = this.f19752s && this.f19751r;
    }

    private static boolean c(e eVar, int i10) {
        int i11;
        return eVar.V() != 8 && eVar.f19811Z[i10] == e.b.MATCH_CONSTRAINT && ((i11 = eVar.f19860y[i10]) == 0 || i11 == 3);
    }

    public void a() {
        if (!this.f19755v) {
            b();
        }
        this.f19755v = true;
    }
}
