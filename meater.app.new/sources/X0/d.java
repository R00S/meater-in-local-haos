package X0;

import X0.i;
import a1.d;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f18533s = false;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f18534t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f18535u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f18536v = true;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f18537w = false;

    /* renamed from: x, reason: collision with root package name */
    public static long f18538x;

    /* renamed from: y, reason: collision with root package name */
    public static long f18539y;

    /* renamed from: e, reason: collision with root package name */
    private a f18544e;

    /* renamed from: o, reason: collision with root package name */
    final c f18554o;

    /* renamed from: r, reason: collision with root package name */
    private a f18557r;

    /* renamed from: a, reason: collision with root package name */
    private int f18540a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18541b = false;

    /* renamed from: c, reason: collision with root package name */
    int f18542c = 0;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, i> f18543d = null;

    /* renamed from: f, reason: collision with root package name */
    private int f18545f = 32;

    /* renamed from: g, reason: collision with root package name */
    private int f18546g = 32;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18548i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18549j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean[] f18550k = new boolean[32];

    /* renamed from: l, reason: collision with root package name */
    int f18551l = 1;

    /* renamed from: m, reason: collision with root package name */
    int f18552m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f18553n = 32;

    /* renamed from: p, reason: collision with root package name */
    private i[] f18555p = new i[1000];

    /* renamed from: q, reason: collision with root package name */
    private int f18556q = 0;

    /* renamed from: h, reason: collision with root package name */
    X0.b[] f18547h = new X0.b[32];

    /* compiled from: LinearSystem.java */
    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem.java */
    static class b extends X0.b {
        b(c cVar) {
            this.f18527e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f18554o = cVar;
        this.f18544e = new h(cVar);
        if (f18537w) {
            this.f18557r = new b(cVar);
        } else {
            this.f18557r = new X0.b(cVar);
        }
    }

    private int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f18551l; i10++) {
            this.f18550k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f18551l * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f18550k[aVar.getKey().f18573D] = true;
            }
            i iVarC = aVar.c(this, this.f18550k);
            if (iVarC != null) {
                boolean[] zArr = this.f18550k;
                int i12 = iVarC.f18573D;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (iVarC != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f18552m; i14++) {
                    X0.b bVar = this.f18547h[i14];
                    if (bVar.f18523a.f18580K != i.a.UNRESTRICTED && !bVar.f18528f && bVar.t(iVarC)) {
                        float fB = bVar.f18527e.b(iVarC);
                        if (fB < 0.0f) {
                            float f11 = (-bVar.f18524b) / fB;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    X0.b bVar2 = this.f18547h[i13];
                    bVar2.f18523a.f18574E = -1;
                    bVar2.x(iVarC);
                    i iVar = bVar2.f18523a;
                    iVar.f18574E = i13;
                    iVar.v(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void D() {
        int i10 = 0;
        if (f18537w) {
            while (i10 < this.f18552m) {
                X0.b bVar = this.f18547h[i10];
                if (bVar != null) {
                    this.f18554o.f18529a.a(bVar);
                }
                this.f18547h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f18552m) {
            X0.b bVar2 = this.f18547h[i10];
            if (bVar2 != null) {
                this.f18554o.f18530b.a(bVar2);
            }
            this.f18547h[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f18554o.f18531c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.u(aVar, str);
        } else {
            iVarB.s();
            iVarB.u(aVar, str);
        }
        int i10 = this.f18556q;
        int i11 = this.f18540a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f18540a = i12;
            this.f18555p = (i[]) Arrays.copyOf(this.f18555p, i12);
        }
        i[] iVarArr = this.f18555p;
        int i13 = this.f18556q;
        this.f18556q = i13 + 1;
        iVarArr[i13] = iVarB;
        return iVarB;
    }

    private void l(X0.b bVar) {
        int i10;
        if (f18535u && bVar.f18528f) {
            bVar.f18523a.t(this, bVar.f18524b);
        } else {
            X0.b[] bVarArr = this.f18547h;
            int i11 = this.f18552m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f18523a;
            iVar.f18574E = i11;
            this.f18552m = i11 + 1;
            iVar.v(this, bVar);
        }
        if (f18535u && this.f18541b) {
            int i12 = 0;
            while (i12 < this.f18552m) {
                if (this.f18547h[i12] == null) {
                    System.out.println("WTF");
                }
                X0.b bVar2 = this.f18547h[i12];
                if (bVar2 != null && bVar2.f18528f) {
                    bVar2.f18523a.t(this, bVar2.f18524b);
                    if (f18537w) {
                        this.f18554o.f18529a.a(bVar2);
                    } else {
                        this.f18554o.f18530b.a(bVar2);
                    }
                    this.f18547h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f18552m;
                        if (i13 >= i10) {
                            break;
                        }
                        X0.b[] bVarArr2 = this.f18547h;
                        int i15 = i13 - 1;
                        X0.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f18523a;
                        if (iVar2.f18574E == i13) {
                            iVar2.f18574E = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f18547h[i14] = null;
                    }
                    this.f18552m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f18541b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f18552m; i10++) {
            X0.b bVar = this.f18547h[i10];
            bVar.f18523a.f18576G = bVar.f18524b;
        }
    }

    public static X0.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f18552m; i10++) {
            X0.b bVar = this.f18547h[i10];
            if (bVar.f18523a.f18580K != i.a.UNRESTRICTED && bVar.f18524b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        if (i12 >= this.f18552m) {
                            break;
                        }
                        X0.b bVar2 = this.f18547h[i12];
                        if (bVar2.f18523a.f18580K != i.a.UNRESTRICTED && !bVar2.f18528f && bVar2.f18524b < 0.0f) {
                            int i16 = 9;
                            if (f18536v) {
                                int iC = bVar2.f18527e.c();
                                int i17 = 0;
                                while (i17 < iC) {
                                    i iVarF = bVar2.f18527e.f(i17);
                                    float fB = bVar2.f18527e.b(iVarF);
                                    if (fB > 0.0f) {
                                        int i18 = 0;
                                        while (i18 < i16) {
                                            float f11 = iVarF.f18578I[i18] / fB;
                                            if ((f11 < f10 && i18 == i15) || i18 > i15) {
                                                i15 = i18;
                                                i14 = iVarF.f18573D;
                                                i13 = i12;
                                                f10 = f11;
                                            }
                                            i18++;
                                            i16 = 9;
                                        }
                                    }
                                    i17++;
                                    i16 = 9;
                                }
                            } else {
                                for (int i19 = 1; i19 < this.f18551l; i19++) {
                                    i iVar = this.f18554o.f18532d[i19];
                                    float fB2 = bVar2.f18527e.b(iVar);
                                    if (fB2 > 0.0f) {
                                        for (int i20 = 0; i20 < 9; i20++) {
                                            float f12 = iVar.f18578I[i20] / fB2;
                                            if ((f12 < f10 && i20 == i15) || i20 > i15) {
                                                i13 = i12;
                                                i14 = i19;
                                                i15 = i20;
                                                f10 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i13 != -1) {
                        X0.b bVar3 = this.f18547h[i13];
                        bVar3.f18523a.f18574E = -1;
                        bVar3.x(this.f18554o.f18532d[i14]);
                        i iVar2 = bVar3.f18523a;
                        iVar2.f18574E = i13;
                        iVar2.v(this, bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f18551l / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i10 = this.f18545f * 2;
        this.f18545f = i10;
        this.f18547h = (X0.b[]) Arrays.copyOf(this.f18547h, i10);
        c cVar = this.f18554o;
        cVar.f18532d = (i[]) Arrays.copyOf(cVar.f18532d, this.f18545f);
        int i11 = this.f18545f;
        this.f18550k = new boolean[i11];
        this.f18546g = i11;
        this.f18553n = i11;
    }

    public void A() {
        if (this.f18544e.isEmpty()) {
            n();
            return;
        }
        if (!this.f18548i && !this.f18549j) {
            B(this.f18544e);
            return;
        }
        for (int i10 = 0; i10 < this.f18552m; i10++) {
            if (!this.f18547h[i10].f18528f) {
                B(this.f18544e);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f18554o;
            i[] iVarArr = cVar.f18532d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.s();
            }
            i10++;
        }
        cVar.f18531c.c(this.f18555p, this.f18556q);
        this.f18556q = 0;
        Arrays.fill(this.f18554o.f18532d, (Object) null);
        HashMap<String, i> map = this.f18543d;
        if (map != null) {
            map.clear();
        }
        this.f18542c = 0;
        this.f18544e.clear();
        this.f18551l = 1;
        for (int i11 = 0; i11 < this.f18552m; i11++) {
            X0.b bVar = this.f18547h[i11];
            if (bVar != null) {
                bVar.f18525c = false;
            }
        }
        D();
        this.f18552m = 0;
        if (f18537w) {
            this.f18557r = new b(this.f18554o);
        } else {
            this.f18557r = new X0.b(this.f18554o);
        }
    }

    public void b(a1.e eVar, a1.e eVar2, float f10, int i10) {
        d.a aVar = d.a.LEFT;
        i iVarQ = q(eVar.o(aVar));
        d.a aVar2 = d.a.TOP;
        i iVarQ2 = q(eVar.o(aVar2));
        d.a aVar3 = d.a.RIGHT;
        i iVarQ3 = q(eVar.o(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        i iVarQ4 = q(eVar.o(aVar4));
        i iVarQ5 = q(eVar2.o(aVar));
        i iVarQ6 = q(eVar2.o(aVar2));
        i iVarQ7 = q(eVar2.o(aVar3));
        i iVarQ8 = q(eVar2.o(aVar4));
        X0.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        X0.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        X0.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(X0.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f18552m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f18553n
            if (r0 >= r2) goto L12
            int r0 = r5.f18551l
            int r0 = r0 + r1
            int r2 = r5.f18546g
            if (r0 < r2) goto L15
        L12:
            r5.z()
        L15:
            boolean r0 = r6.f18528f
            r2 = 0
            if (r0 != 0) goto L84
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7b
            X0.i r0 = r5.p()
            r6.f18523a = r0
            int r3 = r5.f18552m
            r5.l(r6)
            int r4 = r5.f18552m
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            X0.d$a r2 = r5.f18557r
            r2.a(r6)
            X0.d$a r2 = r5.f18557r
            r5.C(r2, r1)
            int r2 = r0.f18574E
            r3 = -1
            if (r2 != r3) goto L7c
            X0.i r2 = r6.f18523a
            if (r2 != r0) goto L59
            X0.i r0 = r6.v(r0)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f18528f
            if (r0 != 0) goto L62
            X0.i r0 = r6.f18523a
            r0.v(r5, r6)
        L62:
            boolean r0 = X0.d.f18537w
            if (r0 == 0) goto L6e
            X0.c r0 = r5.f18554o
            X0.f<X0.b> r0 = r0.f18529a
            r0.a(r6)
            goto L75
        L6e:
            X0.c r0 = r5.f18554o
            X0.f<X0.b> r0 = r0.f18530b
            r0.a(r6)
        L75:
            int r0 = r5.f18552m
            int r0 = r0 - r1
            r5.f18552m = r0
            goto L7c
        L7b:
            r1 = r2
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r2 = r1
        L84:
            if (r2 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.d.d(X0.b):void");
    }

    public X0.b e(i iVar, i iVar2, int i10, int i11) {
        if (f18534t && i11 == 8 && iVar2.f18577H && iVar.f18574E == -1) {
            iVar.t(this, iVar2.f18576G + i10);
            return null;
        }
        X0.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        if (f18534t && iVar.f18574E == -1) {
            float f10 = i10;
            iVar.t(this, f10);
            for (int i11 = 0; i11 < this.f18542c + 1; i11++) {
                i iVar2 = this.f18554o.f18532d[i11];
                if (iVar2 != null && iVar2.f18584O && iVar2.f18585P == iVar.f18573D) {
                    iVar2.t(this, iVar2.f18586Q + f10);
                }
            }
            return;
        }
        int i12 = iVar.f18574E;
        if (i12 == -1) {
            X0.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        X0.b bVar = this.f18547h[i12];
        if (bVar.f18528f) {
            bVar.f18524b = i10;
            return;
        }
        if (bVar.f18527e.c() == 0) {
            bVar.f18528f = true;
            bVar.f18524b = i10;
        } else {
            X0.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        X0.b bVarR = r();
        i iVarT = t();
        iVarT.f18575F = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        X0.b bVarR = r();
        i iVarT = t();
        iVarT.f18575F = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f18527e.b(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        X0.b bVarR = r();
        i iVarT = t();
        iVarT.f18575F = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        X0.b bVarR = r();
        i iVarT = t();
        iVarT.f18575F = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f18527e.b(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        X0.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(X0.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f18551l + 1 >= this.f18546g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f18542c + 1;
        this.f18542c = i11;
        this.f18551l++;
        iVarA.f18573D = i11;
        iVarA.f18575F = i10;
        this.f18554o.f18532d[i11] = iVarA;
        this.f18544e.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f18551l + 1 >= this.f18546g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f18542c + 1;
        this.f18542c = i10;
        this.f18551l++;
        iVarA.f18573D = i10;
        this.f18554o.f18532d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f18551l + 1 >= this.f18546g) {
            z();
        }
        if (obj instanceof a1.d) {
            a1.d dVar = (a1.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f18554o);
                iVarI = dVar.i();
            }
            int i10 = iVarI.f18573D;
            if (i10 == -1 || i10 > this.f18542c || this.f18554o.f18532d[i10] == null) {
                if (i10 != -1) {
                    iVarI.s();
                }
                int i11 = this.f18542c + 1;
                this.f18542c = i11;
                this.f18551l++;
                iVarI.f18573D = i11;
                iVarI.f18580K = i.a.UNRESTRICTED;
                this.f18554o.f18532d[i11] = iVarI;
            }
        }
        return iVarI;
    }

    public X0.b r() {
        X0.b bVarB;
        if (f18537w) {
            bVarB = this.f18554o.f18529a.b();
            if (bVarB == null) {
                bVarB = new b(this.f18554o);
                f18539y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f18554o.f18530b.b();
            if (bVarB == null) {
                bVarB = new X0.b(this.f18554o);
                f18538x++;
            } else {
                bVarB.y();
            }
        }
        i.n();
        return bVarB;
    }

    public i t() {
        if (this.f18551l + 1 >= this.f18546g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f18542c + 1;
        this.f18542c = i10;
        this.f18551l++;
        iVarA.f18573D = i10;
        this.f18554o.f18532d[i10] = iVarA;
        return iVarA;
    }

    public c w() {
        return this.f18554o;
    }

    public int y(Object obj) {
        i iVarI = ((a1.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f18576G + 0.5f);
        }
        return 0;
    }

    public void v(e eVar) {
    }
}
