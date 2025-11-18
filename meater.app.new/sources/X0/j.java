package X0;

import X0.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f18594n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f18595a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f18596b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f18597c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f18598d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f18599e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f18600f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f18601g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f18602h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f18603i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f18604j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f18605k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f18606l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f18607m;

    j(b bVar, c cVar) {
        this.f18606l = bVar;
        this.f18607m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f18573D % this.f18597c;
        int[] iArr2 = this.f18598d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f18599e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f18599e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f18600f[i10] = iVar.f18573D;
        this.f18601g[i10] = f10;
        this.f18602h[i10] = -1;
        this.f18603i[i10] = -1;
        iVar.c(this.f18606l);
        iVar.f18583N++;
        this.f18604j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f18596b; i10++) {
            if (this.f18600f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f18596b * 2;
        this.f18600f = Arrays.copyOf(this.f18600f, i10);
        this.f18601g = Arrays.copyOf(this.f18601g, i10);
        this.f18602h = Arrays.copyOf(this.f18602h, i10);
        this.f18603i = Arrays.copyOf(this.f18603i, i10);
        this.f18599e = Arrays.copyOf(this.f18599e, i10);
        for (int i11 = this.f18596b; i11 < i10; i11++) {
            this.f18600f[i11] = -1;
            this.f18599e[i11] = -1;
        }
        this.f18596b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f18602h[iN] = i10;
            int[] iArr = this.f18603i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f18602h[iN] = -1;
            if (this.f18604j > 0) {
                this.f18603i[iN] = this.f18605k;
                this.f18605k = iN;
            } else {
                this.f18603i[iN] = -1;
            }
        }
        int i11 = this.f18603i[iN];
        if (i11 != -1) {
            this.f18602h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f18573D;
        int i12 = i11 % this.f18597c;
        int[] iArr2 = this.f18598d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f18600f[i13] == i11) {
            int[] iArr3 = this.f18599e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f18599e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f18600f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f18600f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // X0.b.a
    public void a(i iVar, float f10) {
        float f11 = f18594n;
        if (f10 > (-f11) && f10 < f11) {
            i(iVar, true);
            return;
        }
        if (this.f18604j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f18605k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f18601g[iP] = f10;
            return;
        }
        if (this.f18604j + 1 >= this.f18596b) {
            o();
        }
        int i10 = this.f18604j;
        int i11 = this.f18605k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f18600f[i11];
            int i15 = iVar.f18573D;
            if (i14 == i15) {
                this.f18601g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f18603i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // X0.b.a
    public float b(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f18601g[iP];
        }
        return 0.0f;
    }

    @Override // X0.b.a
    public int c() {
        return this.f18604j;
    }

    @Override // X0.b.a
    public void clear() {
        int i10 = this.f18604j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarF = f(i11);
            if (iVarF != null) {
                iVarF.p(this.f18606l);
            }
        }
        for (int i12 = 0; i12 < this.f18596b; i12++) {
            this.f18600f[i12] = -1;
            this.f18599e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f18597c; i13++) {
            this.f18598d[i13] = -1;
        }
        this.f18604j = 0;
        this.f18605k = -1;
    }

    @Override // X0.b.a
    public void d(i iVar, float f10, boolean z10) {
        float f11 = f18594n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                a(iVar, f10);
                return;
            }
            float[] fArr = this.f18601g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f18594n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            i(iVar, z10);
        }
    }

    @Override // X0.b.a
    public float e(b bVar, boolean z10) {
        float fB = b(bVar.f18523a);
        i(bVar.f18523a, z10);
        j jVar = (j) bVar.f18527e;
        int iC = jVar.c();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iC) {
            int i12 = jVar.f18600f[i11];
            if (i12 != -1) {
                d(this.f18607m.f18532d[i12], jVar.f18601g[i11] * fB, z10);
                i10++;
            }
            i11++;
        }
        return fB;
    }

    @Override // X0.b.a
    public i f(int i10) {
        int i11 = this.f18604j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f18605k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f18607m.f18532d[this.f18600f[i12]];
            }
            i12 = this.f18603i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // X0.b.a
    public void g() {
        int i10 = this.f18604j;
        int i11 = this.f18605k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f18601g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f18603i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // X0.b.a
    public float h(int i10) {
        int i11 = this.f18604j;
        int i12 = this.f18605k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f18601g[i12];
            }
            i12 = this.f18603i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // X0.b.a
    public float i(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f18601g[iP];
        if (this.f18605k == iP) {
            this.f18605k = this.f18603i[iP];
        }
        this.f18600f[iP] = -1;
        int[] iArr = this.f18602h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f18603i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f18603i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f18604j--;
        iVar.f18583N--;
        if (z10) {
            iVar.p(this.f18606l);
        }
        return f10;
    }

    @Override // X0.b.a
    public boolean j(i iVar) {
        return p(iVar) != -1;
    }

    @Override // X0.b.a
    public void k(float f10) {
        int i10 = this.f18604j;
        int i11 = this.f18605k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f18601g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f18603i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f18604j != 0 && iVar != null) {
            int i10 = iVar.f18573D;
            int i11 = this.f18598d[i10 % this.f18597c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f18600f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f18599e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f18600f[i11] != i10);
            if (i11 != -1 && this.f18600f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f18604j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarF = f(i11);
            if (iVarF != null) {
                String str2 = str + iVarF + " = " + h(i11) + " ";
                int iP = p(iVarF);
                String str3 = str2 + "[p: ";
                String str4 = (this.f18602h[iP] != -1 ? str3 + this.f18607m.f18532d[this.f18600f[this.f18602h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f18603i[iP] != -1 ? str4 + this.f18607m.f18532d[this.f18600f[this.f18603i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
