package p024c.p044g.p048b;

import java.util.Arrays;
import p024c.p044g.p048b.C0879b;

/* compiled from: SolverVariableValues.java */
/* renamed from: c.g.b.j */
/* loaded from: classes.dex */
public class C0887j implements C0879b.a {

    /* renamed from: a */
    private static float f5879a = 0.001f;

    /* renamed from: b */
    private final int f5880b = -1;

    /* renamed from: c */
    private int f5881c = 16;

    /* renamed from: d */
    private int f5882d = 16;

    /* renamed from: e */
    int[] f5883e = new int[16];

    /* renamed from: f */
    int[] f5884f = new int[16];

    /* renamed from: g */
    int[] f5885g = new int[16];

    /* renamed from: h */
    float[] f5886h = new float[16];

    /* renamed from: i */
    int[] f5887i = new int[16];

    /* renamed from: j */
    int[] f5888j = new int[16];

    /* renamed from: k */
    int f5889k = 0;

    /* renamed from: l */
    int f5890l = -1;

    /* renamed from: m */
    private final C0879b f5891m;

    /* renamed from: n */
    protected final C0880c f5892n;

    C0887j(C0879b c0879b, C0880c c0880c) {
        this.f5891m = c0879b;
        this.f5892n = c0880c;
        clear();
    }

    /* renamed from: l */
    private void m5605l(C0886i c0886i, int i2) {
        int[] iArr;
        int i3 = c0886i.f5858d % this.f5882d;
        int[] iArr2 = this.f5883e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f5884f;
                if (iArr[i4] == -1) {
                    break;
                } else {
                    i4 = iArr[i4];
                }
            }
            iArr[i4] = i2;
        }
        this.f5884f[i2] = -1;
    }

    /* renamed from: m */
    private void m5606m(int i2, C0886i c0886i, float f2) {
        this.f5885g[i2] = c0886i.f5858d;
        this.f5886h[i2] = f2;
        this.f5887i[i2] = -1;
        this.f5888j[i2] = -1;
        c0886i.m5599a(this.f5891m);
        c0886i.f5868n++;
        this.f5889k++;
    }

    /* renamed from: n */
    private int m5607n() {
        for (int i2 = 0; i2 < this.f5881c; i2++) {
            if (this.f5885g[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m5608o() {
        int i2 = this.f5881c * 2;
        this.f5885g = Arrays.copyOf(this.f5885g, i2);
        this.f5886h = Arrays.copyOf(this.f5886h, i2);
        this.f5887i = Arrays.copyOf(this.f5887i, i2);
        this.f5888j = Arrays.copyOf(this.f5888j, i2);
        this.f5884f = Arrays.copyOf(this.f5884f, i2);
        for (int i3 = this.f5881c; i3 < i2; i3++) {
            this.f5885g[i3] = -1;
            this.f5884f[i3] = -1;
        }
        this.f5881c = i2;
    }

    /* renamed from: q */
    private void m5609q(int i2, C0886i c0886i, float f2) {
        int iM5607n = m5607n();
        m5606m(iM5607n, c0886i, f2);
        if (i2 != -1) {
            this.f5887i[iM5607n] = i2;
            int[] iArr = this.f5888j;
            iArr[iM5607n] = iArr[i2];
            iArr[i2] = iM5607n;
        } else {
            this.f5887i[iM5607n] = -1;
            if (this.f5889k > 0) {
                this.f5888j[iM5607n] = this.f5890l;
                this.f5890l = iM5607n;
            } else {
                this.f5888j[iM5607n] = -1;
            }
        }
        int[] iArr2 = this.f5888j;
        if (iArr2[iM5607n] != -1) {
            this.f5887i[iArr2[iM5607n]] = iM5607n;
        }
        m5605l(c0886i, iM5607n);
    }

    /* renamed from: r */
    private void m5610r(C0886i c0886i) {
        int[] iArr;
        int i2 = c0886i.f5858d;
        int i3 = i2 % this.f5882d;
        int[] iArr2 = this.f5883e;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f5885g[i4] == i2) {
            int[] iArr3 = this.f5884f;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.f5884f;
            if (iArr[i4] == -1 || this.f5885g[iArr[i4]] == i2) {
                break;
            } else {
                i4 = iArr[i4];
            }
        }
        int i5 = iArr[i4];
        if (i5 == -1 || this.f5885g[i5] != i2) {
            return;
        }
        iArr[i4] = iArr[i5];
        iArr[i5] = -1;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: a */
    public int mo5515a() {
        return this.f5889k;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: b */
    public C0886i mo5516b(int i2) {
        int i3 = this.f5889k;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f5890l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f5892n.f5815d[this.f5885g[i4]];
            }
            i4 = this.f5888j[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: c */
    public void mo5517c() {
        int i2 = this.f5889k;
        int i3 = this.f5890l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f5886h;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f5888j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // p024c.p044g.p048b.C0879b.a
    public void clear() {
        int i2 = this.f5889k;
        for (int i3 = 0; i3 < i2; i3++) {
            C0886i c0886iMo5516b = mo5516b(i3);
            if (c0886iMo5516b != null) {
                c0886iMo5516b.m5600c(this.f5891m);
            }
        }
        for (int i4 = 0; i4 < this.f5881c; i4++) {
            this.f5885g[i4] = -1;
            this.f5884f[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f5882d; i5++) {
            this.f5883e[i5] = -1;
        }
        this.f5889k = 0;
        this.f5890l = -1;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: d */
    public float mo5518d(int i2) {
        int i3 = this.f5889k;
        int i4 = this.f5890l;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f5886h[i4];
            }
            i4 = this.f5888j[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: e */
    public void mo5519e(C0886i c0886i, float f2, boolean z) {
        float f3 = f5879a;
        if (f2 <= (-f3) || f2 >= f3) {
            int iM5611p = m5611p(c0886i);
            if (iM5611p == -1) {
                mo5523i(c0886i, f2);
                return;
            }
            float[] fArr = this.f5886h;
            fArr[iM5611p] = fArr[iM5611p] + f2;
            float f4 = fArr[iM5611p];
            float f5 = f5879a;
            if (f4 <= (-f5) || fArr[iM5611p] >= f5) {
                return;
            }
            fArr[iM5611p] = 0.0f;
            mo5524j(c0886i, z);
        }
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: f */
    public float mo5520f(C0886i c0886i) {
        int iM5611p = m5611p(c0886i);
        if (iM5611p != -1) {
            return this.f5886h[iM5611p];
        }
        return 0.0f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: g */
    public boolean mo5521g(C0886i c0886i) {
        return m5611p(c0886i) != -1;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: h */
    public float mo5522h(C0879b c0879b, boolean z) {
        float fMo5520f = mo5520f(c0879b.f5806a);
        mo5524j(c0879b.f5806a, z);
        C0887j c0887j = (C0887j) c0879b.f5810e;
        int iMo5515a = c0887j.mo5515a();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iMo5515a) {
            int[] iArr = c0887j.f5885g;
            if (iArr[i3] != -1) {
                mo5519e(this.f5892n.f5815d[iArr[i3]], c0887j.f5886h[i3] * fMo5520f, z);
                i2++;
            }
            i3++;
        }
        return fMo5520f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: i */
    public void mo5523i(C0886i c0886i, float f2) {
        float f3 = f5879a;
        if (f2 > (-f3) && f2 < f3) {
            mo5524j(c0886i, true);
            return;
        }
        if (this.f5889k == 0) {
            m5606m(0, c0886i, f2);
            m5605l(c0886i, 0);
            this.f5890l = 0;
            return;
        }
        int iM5611p = m5611p(c0886i);
        if (iM5611p != -1) {
            this.f5886h[iM5611p] = f2;
            return;
        }
        if (this.f5889k + 1 >= this.f5881c) {
            m5608o();
        }
        int i2 = this.f5889k;
        int i3 = this.f5890l;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int[] iArr = this.f5885g;
            int i6 = iArr[i3];
            int i7 = c0886i.f5858d;
            if (i6 == i7) {
                this.f5886h[i3] = f2;
                return;
            }
            if (iArr[i3] < i7) {
                i4 = i3;
            }
            i3 = this.f5888j[i3];
            if (i3 == -1) {
                break;
            }
        }
        m5609q(i4, c0886i, f2);
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: j */
    public float mo5524j(C0886i c0886i, boolean z) {
        int iM5611p = m5611p(c0886i);
        if (iM5611p == -1) {
            return 0.0f;
        }
        m5610r(c0886i);
        float f2 = this.f5886h[iM5611p];
        if (this.f5890l == iM5611p) {
            this.f5890l = this.f5888j[iM5611p];
        }
        this.f5885g[iM5611p] = -1;
        int[] iArr = this.f5887i;
        if (iArr[iM5611p] != -1) {
            int[] iArr2 = this.f5888j;
            iArr2[iArr[iM5611p]] = iArr2[iM5611p];
        }
        int[] iArr3 = this.f5888j;
        if (iArr3[iM5611p] != -1) {
            iArr[iArr3[iM5611p]] = iArr[iM5611p];
        }
        this.f5889k--;
        c0886i.f5868n--;
        if (z) {
            c0886i.m5600c(this.f5891m);
        }
        return f2;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: k */
    public void mo5525k(float f2) {
        int i2 = this.f5889k;
        int i3 = this.f5890l;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f5886h;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f5888j[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m5611p(C0886i c0886i) {
        int[] iArr;
        if (this.f5889k != 0 && c0886i != null) {
            int i2 = c0886i.f5858d;
            int i3 = this.f5883e[i2 % this.f5882d];
            if (i3 == -1) {
                return -1;
            }
            if (this.f5885g[i3] == i2) {
                return i3;
            }
            while (true) {
                iArr = this.f5884f;
                if (iArr[i3] == -1 || this.f5885g[iArr[i3]] == i2) {
                    break;
                }
                i3 = iArr[i3];
            }
            if (iArr[i3] != -1 && this.f5885g[iArr[i3]] == i2) {
                return iArr[i3];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i2 = this.f5889k;
        for (int i3 = 0; i3 < i2; i3++) {
            C0886i c0886iMo5516b = mo5516b(i3);
            if (c0886iMo5516b != null) {
                String str2 = str + c0886iMo5516b + " = " + mo5518d(i3) + " ";
                int iM5611p = m5611p(c0886iMo5516b);
                String str3 = str2 + "[p: ";
                String str4 = (this.f5887i[iM5611p] != -1 ? str3 + this.f5892n.f5815d[this.f5885g[this.f5887i[iM5611p]]] : str3 + "none") + ", n: ";
                str = (this.f5888j[iM5611p] != -1 ? str4 + this.f5892n.f5815d[this.f5885g[this.f5888j[iM5611p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
