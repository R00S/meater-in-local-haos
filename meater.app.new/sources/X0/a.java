package X0;

import X0.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f18511l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f18513b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f18514c;

    /* renamed from: a, reason: collision with root package name */
    int f18512a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18515d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f18516e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f18517f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f18518g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f18519h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f18520i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f18521j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18522k = false;

    a(b bVar, c cVar) {
        this.f18513b = bVar;
        this.f18514c = cVar;
    }

    @Override // X0.b.a
    public final void a(i iVar, float f10) {
        if (f10 == 0.0f) {
            i(iVar, true);
            return;
        }
        int i10 = this.f18520i;
        if (i10 == -1) {
            this.f18520i = 0;
            this.f18519h[0] = f10;
            this.f18517f[0] = iVar.f18573D;
            this.f18518g[0] = -1;
            iVar.f18583N++;
            iVar.c(this.f18513b);
            this.f18512a++;
            if (this.f18522k) {
                return;
            }
            int i11 = this.f18521j + 1;
            this.f18521j = i11;
            int[] iArr = this.f18517f;
            if (i11 >= iArr.length) {
                this.f18522k = true;
                this.f18521j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f18512a; i13++) {
            int i14 = this.f18517f[i10];
            int i15 = iVar.f18573D;
            if (i14 == i15) {
                this.f18519h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f18518g[i10];
        }
        int length = this.f18521j;
        int i16 = length + 1;
        if (this.f18522k) {
            int[] iArr2 = this.f18517f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f18517f;
        if (length >= iArr3.length && this.f18512a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f18517f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f18517f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f18515d * 2;
            this.f18515d = i18;
            this.f18522k = false;
            this.f18521j = length - 1;
            this.f18519h = Arrays.copyOf(this.f18519h, i18);
            this.f18517f = Arrays.copyOf(this.f18517f, this.f18515d);
            this.f18518g = Arrays.copyOf(this.f18518g, this.f18515d);
        }
        this.f18517f[length] = iVar.f18573D;
        this.f18519h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f18518g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f18518g[length] = this.f18520i;
            this.f18520i = length;
        }
        iVar.f18583N++;
        iVar.c(this.f18513b);
        int i19 = this.f18512a + 1;
        this.f18512a = i19;
        if (!this.f18522k) {
            this.f18521j++;
        }
        int[] iArr7 = this.f18517f;
        if (i19 >= iArr7.length) {
            this.f18522k = true;
        }
        if (this.f18521j >= iArr7.length) {
            this.f18522k = true;
            this.f18521j = iArr7.length - 1;
        }
    }

    @Override // X0.b.a
    public final float b(i iVar) {
        int i10 = this.f18520i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18512a; i11++) {
            if (this.f18517f[i10] == iVar.f18573D) {
                return this.f18519h[i10];
            }
            i10 = this.f18518g[i10];
        }
        return 0.0f;
    }

    @Override // X0.b.a
    public int c() {
        return this.f18512a;
    }

    @Override // X0.b.a
    public final void clear() {
        int i10 = this.f18520i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18512a; i11++) {
            i iVar = this.f18514c.f18532d[this.f18517f[i10]];
            if (iVar != null) {
                iVar.p(this.f18513b);
            }
            i10 = this.f18518g[i10];
        }
        this.f18520i = -1;
        this.f18521j = -1;
        this.f18522k = false;
        this.f18512a = 0;
    }

    @Override // X0.b.a
    public void d(i iVar, float f10, boolean z10) {
        float f11 = f18511l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f18520i;
            if (i10 == -1) {
                this.f18520i = 0;
                this.f18519h[0] = f10;
                this.f18517f[0] = iVar.f18573D;
                this.f18518g[0] = -1;
                iVar.f18583N++;
                iVar.c(this.f18513b);
                this.f18512a++;
                if (this.f18522k) {
                    return;
                }
                int i11 = this.f18521j + 1;
                this.f18521j = i11;
                int[] iArr = this.f18517f;
                if (i11 >= iArr.length) {
                    this.f18522k = true;
                    this.f18521j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f18512a; i13++) {
                int i14 = this.f18517f[i10];
                int i15 = iVar.f18573D;
                if (i14 == i15) {
                    float[] fArr = this.f18519h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f18511l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f18520i) {
                            this.f18520i = this.f18518g[i10];
                        } else {
                            int[] iArr2 = this.f18518g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.p(this.f18513b);
                        }
                        if (this.f18522k) {
                            this.f18521j = i10;
                        }
                        iVar.f18583N--;
                        this.f18512a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f18518g[i10];
            }
            int length = this.f18521j;
            int i16 = length + 1;
            if (this.f18522k) {
                int[] iArr3 = this.f18517f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f18517f;
            if (length >= iArr4.length && this.f18512a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f18517f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f18517f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f18515d * 2;
                this.f18515d = i18;
                this.f18522k = false;
                this.f18521j = length - 1;
                this.f18519h = Arrays.copyOf(this.f18519h, i18);
                this.f18517f = Arrays.copyOf(this.f18517f, this.f18515d);
                this.f18518g = Arrays.copyOf(this.f18518g, this.f18515d);
            }
            this.f18517f[length] = iVar.f18573D;
            this.f18519h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f18518g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f18518g[length] = this.f18520i;
                this.f18520i = length;
            }
            iVar.f18583N++;
            iVar.c(this.f18513b);
            this.f18512a++;
            if (!this.f18522k) {
                this.f18521j++;
            }
            int i19 = this.f18521j;
            int[] iArr8 = this.f18517f;
            if (i19 >= iArr8.length) {
                this.f18522k = true;
                this.f18521j = iArr8.length - 1;
            }
        }
    }

    @Override // X0.b.a
    public float e(b bVar, boolean z10) {
        float fB = b(bVar.f18523a);
        i(bVar.f18523a, z10);
        b.a aVar = bVar.f18527e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarF = aVar.f(i10);
            d(iVarF, aVar.b(iVarF) * fB, z10);
        }
        return fB;
    }

    @Override // X0.b.a
    public i f(int i10) {
        int i11 = this.f18520i;
        for (int i12 = 0; i11 != -1 && i12 < this.f18512a; i12++) {
            if (i12 == i10) {
                return this.f18514c.f18532d[this.f18517f[i11]];
            }
            i11 = this.f18518g[i11];
        }
        return null;
    }

    @Override // X0.b.a
    public void g() {
        int i10 = this.f18520i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18512a; i11++) {
            float[] fArr = this.f18519h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f18518g[i10];
        }
    }

    @Override // X0.b.a
    public float h(int i10) {
        int i11 = this.f18520i;
        for (int i12 = 0; i11 != -1 && i12 < this.f18512a; i12++) {
            if (i12 == i10) {
                return this.f18519h[i11];
            }
            i11 = this.f18518g[i11];
        }
        return 0.0f;
    }

    @Override // X0.b.a
    public final float i(i iVar, boolean z10) {
        if (this.f18516e == iVar) {
            this.f18516e = null;
        }
        int i10 = this.f18520i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f18512a) {
            if (this.f18517f[i10] == iVar.f18573D) {
                if (i10 == this.f18520i) {
                    this.f18520i = this.f18518g[i10];
                } else {
                    int[] iArr = this.f18518g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.p(this.f18513b);
                }
                iVar.f18583N--;
                this.f18512a--;
                this.f18517f[i10] = -1;
                if (this.f18522k) {
                    this.f18521j = i10;
                }
                return this.f18519h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f18518g[i10];
        }
        return 0.0f;
    }

    @Override // X0.b.a
    public boolean j(i iVar) {
        int i10 = this.f18520i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f18512a; i11++) {
            if (this.f18517f[i10] == iVar.f18573D) {
                return true;
            }
            i10 = this.f18518g[i10];
        }
        return false;
    }

    @Override // X0.b.a
    public void k(float f10) {
        int i10 = this.f18520i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18512a; i11++) {
            float[] fArr = this.f18519h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f18518g[i10];
        }
    }

    public String toString() {
        int i10 = this.f18520i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f18512a; i11++) {
            str = ((str + " -> ") + this.f18519h[i10] + " : ") + this.f18514c.f18532d[this.f18517f[i10]];
            i10 = this.f18518g[i10];
        }
        return str;
    }
}
