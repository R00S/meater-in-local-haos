package X0;

import X0.d;
import X0.i;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f18527e;

    /* renamed from: a, reason: collision with root package name */
    i f18523a = null;

    /* renamed from: b, reason: collision with root package name */
    float f18524b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f18525c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f18526d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f18528f = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        void a(i iVar, float f10);

        float b(i iVar);

        int c();

        void clear();

        void d(i iVar, float f10, boolean z10);

        float e(b bVar, boolean z10);

        i f(int i10);

        void g();

        float h(int i10);

        float i(i iVar, boolean z10);

        boolean j(i iVar);

        void k(float f10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f18583N <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iC = this.f18527e.c();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iC; i10++) {
            float fH = this.f18527e.h(i10);
            if (fH < 0.0f) {
                i iVarF = this.f18527e.f(i10);
                if ((zArr == null || !zArr[iVarF.f18573D]) && iVarF != iVar && (((aVar = iVarF.f18580K) == i.a.SLACK || aVar == i.a.ERROR) && fH < f10)) {
                    f10 = fH;
                    iVar2 = iVarF;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f18577H) {
            return;
        }
        this.f18524b += iVar.f18576G * this.f18527e.b(iVar);
        this.f18527e.i(iVar, z10);
        if (z10) {
            iVar.p(this);
        }
        if (d.f18535u && this.f18527e.c() == 0) {
            this.f18528f = true;
            dVar.f18541b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f18524b += bVar.f18524b * this.f18527e.e(bVar, z10);
        if (z10) {
            bVar.f18523a.p(this);
        }
        if (d.f18535u && this.f18523a != null && this.f18527e.c() == 0) {
            this.f18528f = true;
            dVar.f18541b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f18584O) {
            return;
        }
        float fB = this.f18527e.b(iVar);
        this.f18524b += iVar.f18586Q * fB;
        this.f18527e.i(iVar, z10);
        if (z10) {
            iVar.p(this);
        }
        this.f18527e.d(dVar.f18554o.f18532d[iVar.f18585P], fB, z10);
        if (d.f18535u && this.f18527e.c() == 0) {
            this.f18528f = true;
            dVar.f18541b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f18547h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iC = this.f18527e.c();
            for (int i10 = 0; i10 < iC; i10++) {
                i iVarF = this.f18527e.f(i10);
                if (iVarF.f18574E != -1 || iVarF.f18577H || iVarF.f18584O) {
                    this.f18526d.add(iVarF);
                }
            }
            int size = this.f18526d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f18526d.get(i11);
                    if (iVar.f18577H) {
                        A(dVar, iVar, true);
                    } else if (iVar.f18584O) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f18547h[iVar.f18574E], true);
                    }
                }
                this.f18526d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f18535u && this.f18523a != null && this.f18527e.c() == 0) {
            this.f18528f = true;
            dVar.f18541b = true;
        }
    }

    @Override // X0.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f18523a = null;
            this.f18527e.clear();
            for (int i10 = 0; i10 < bVar.f18527e.c(); i10++) {
                this.f18527e.d(bVar.f18527e.f(i10), bVar.f18527e.h(i10), true);
            }
        }
    }

    @Override // X0.d.a
    public void b(i iVar) {
        int i10 = iVar.f18575F;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f18527e.a(iVar, f10);
    }

    @Override // X0.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // X0.d.a
    public void clear() {
        this.f18527e.clear();
        this.f18523a = null;
        this.f18524b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f18527e.a(dVar.o(i10, "ep"), 1.0f);
        this.f18527e.a(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f18527e.a(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f18527e.c() == 0) {
            this.f18528f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iC = this.f18527e.c();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iC; i10++) {
            float fH = this.f18527e.h(i10);
            i iVarF = this.f18527e.f(i10);
            if (iVarF.f18580K == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fH) {
                    boolean zU = u(iVarF, dVar);
                    z10 = zU;
                    f10 = fH;
                    iVar = iVarF;
                } else if (!z10 && u(iVarF, dVar)) {
                    f10 = fH;
                    iVar = iVarF;
                    z10 = true;
                }
            } else if (iVar == null && fH < 0.0f) {
                if (iVar2 == null || f11 > fH) {
                    boolean zU2 = u(iVarF, dVar);
                    z11 = zU2;
                    f11 = fH;
                    iVar2 = iVarF;
                } else if (!z11 && u(iVarF, dVar)) {
                    f11 = fH;
                    iVar2 = iVarF;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // X0.d.a
    public i getKey() {
        return this.f18523a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar4, 1.0f);
            this.f18527e.a(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
            this.f18527e.a(iVar3, -1.0f);
            this.f18527e.a(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f18524b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f18527e.a(iVar, -1.0f);
            this.f18527e.a(iVar2, 1.0f);
            this.f18524b = i10;
        } else if (f10 >= 1.0f) {
            this.f18527e.a(iVar4, -1.0f);
            this.f18527e.a(iVar3, 1.0f);
            this.f18524b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f18527e.a(iVar, f11 * 1.0f);
            this.f18527e.a(iVar2, f11 * (-1.0f));
            this.f18527e.a(iVar3, (-1.0f) * f10);
            this.f18527e.a(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f18524b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f18523a = iVar;
        float f10 = i10;
        iVar.f18576G = f10;
        this.f18524b = f10;
        this.f18528f = true;
        return this;
    }

    @Override // X0.d.a
    public boolean isEmpty() {
        return this.f18523a == null && this.f18524b == 0.0f && this.f18527e.c() == 0;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f18527e.a(iVar, -1.0f);
        this.f18527e.a(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f18527e.a(iVar, -1.0f);
        this.f18527e.a(iVar2, 1.0f);
        this.f18527e.a(iVar3, f10);
        this.f18527e.a(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f18524b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
            this.f18527e.a(iVar4, 1.0f);
            this.f18527e.a(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f18527e.a(iVar3, 1.0f);
            this.f18527e.a(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
            this.f18527e.a(iVar4, f13);
            this.f18527e.a(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f18524b = i10 * (-1);
            this.f18527e.a(iVar, 1.0f);
        } else {
            this.f18524b = i10;
            this.f18527e.a(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f18524b = i10;
        }
        if (z10) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
        } else {
            this.f18527e.a(iVar, -1.0f);
            this.f18527e.a(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f18524b = i10;
        }
        if (z10) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
            this.f18527e.a(iVar3, -1.0f);
        } else {
            this.f18527e.a(iVar, -1.0f);
            this.f18527e.a(iVar2, 1.0f);
            this.f18527e.a(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f18524b = i10;
        }
        if (z10) {
            this.f18527e.a(iVar, 1.0f);
            this.f18527e.a(iVar2, -1.0f);
            this.f18527e.a(iVar3, 1.0f);
        } else {
            this.f18527e.a(iVar, -1.0f);
            this.f18527e.a(iVar2, 1.0f);
            this.f18527e.a(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f18527e.a(iVar3, 0.5f);
        this.f18527e.a(iVar4, 0.5f);
        this.f18527e.a(iVar, -0.5f);
        this.f18527e.a(iVar2, -0.5f);
        this.f18524b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f18524b;
        if (f10 < 0.0f) {
            this.f18524b = f10 * (-1.0f);
            this.f18527e.g();
        }
    }

    boolean s() {
        i iVar = this.f18523a;
        return iVar != null && (iVar.f18580K == i.a.UNRESTRICTED || this.f18524b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f18527e.j(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f18523a;
        if (iVar2 != null) {
            this.f18527e.a(iVar2, -1.0f);
            this.f18523a.f18574E = -1;
            this.f18523a = null;
        }
        float fI = this.f18527e.i(iVar, true) * (-1.0f);
        this.f18523a = iVar;
        if (fI == 1.0f) {
            return;
        }
        this.f18524b /= fI;
        this.f18527e.k(fI);
    }

    public void y() {
        this.f18523a = null;
        this.f18527e.clear();
        this.f18524b = 0.0f;
        this.f18528f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f18527e = new X0.a(this, cVar);
    }
}
