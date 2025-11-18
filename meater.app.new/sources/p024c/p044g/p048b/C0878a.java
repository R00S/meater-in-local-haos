package p024c.p044g.p048b;

import java.util.Arrays;
import okhttp3.HttpUrl;
import p024c.p044g.p048b.C0879b;

/* compiled from: ArrayLinkedVariables.java */
/* renamed from: c.g.b.a */
/* loaded from: classes.dex */
public class C0878a implements C0879b.a {

    /* renamed from: a */
    private static float f5794a = 0.001f;

    /* renamed from: c */
    private final C0879b f5796c;

    /* renamed from: d */
    protected final C0880c f5797d;

    /* renamed from: b */
    int f5795b = 0;

    /* renamed from: e */
    private int f5798e = 8;

    /* renamed from: f */
    private C0886i f5799f = null;

    /* renamed from: g */
    private int[] f5800g = new int[8];

    /* renamed from: h */
    private int[] f5801h = new int[8];

    /* renamed from: i */
    private float[] f5802i = new float[8];

    /* renamed from: j */
    private int f5803j = -1;

    /* renamed from: k */
    private int f5804k = -1;

    /* renamed from: l */
    private boolean f5805l = false;

    C0878a(C0879b c0879b, C0880c c0880c) {
        this.f5796c = c0879b;
        this.f5797d = c0880c;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: a */
    public int mo5515a() {
        return this.f5795b;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: b */
    public C0886i mo5516b(int i2) {
        int i3 = this.f5803j;
        for (int i4 = 0; i3 != -1 && i4 < this.f5795b; i4++) {
            if (i4 == i2) {
                return this.f5797d.f5815d[this.f5800g[i3]];
            }
            i3 = this.f5801h[i3];
        }
        return null;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: c */
    public void mo5517c() {
        int i2 = this.f5803j;
        for (int i3 = 0; i2 != -1 && i3 < this.f5795b; i3++) {
            float[] fArr = this.f5802i;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f5801h[i2];
        }
    }

    @Override // p024c.p044g.p048b.C0879b.a
    public final void clear() {
        int i2 = this.f5803j;
        for (int i3 = 0; i2 != -1 && i3 < this.f5795b; i3++) {
            C0886i c0886i = this.f5797d.f5815d[this.f5800g[i2]];
            if (c0886i != null) {
                c0886i.m5600c(this.f5796c);
            }
            i2 = this.f5801h[i2];
        }
        this.f5803j = -1;
        this.f5804k = -1;
        this.f5805l = false;
        this.f5795b = 0;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: d */
    public float mo5518d(int i2) {
        int i3 = this.f5803j;
        for (int i4 = 0; i3 != -1 && i4 < this.f5795b; i4++) {
            if (i4 == i2) {
                return this.f5802i[i3];
            }
            i3 = this.f5801h[i3];
        }
        return 0.0f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: e */
    public void mo5519e(C0886i c0886i, float f2, boolean z) {
        float f3 = f5794a;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f5803j;
            if (i2 == -1) {
                this.f5803j = 0;
                this.f5802i[0] = f2;
                this.f5800g[0] = c0886i.f5858d;
                this.f5801h[0] = -1;
                c0886i.f5868n++;
                c0886i.m5599a(this.f5796c);
                this.f5795b++;
                if (this.f5805l) {
                    return;
                }
                int i3 = this.f5804k + 1;
                this.f5804k = i3;
                int[] iArr = this.f5800g;
                if (i3 >= iArr.length) {
                    this.f5805l = true;
                    this.f5804k = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f5795b; i5++) {
                int[] iArr2 = this.f5800g;
                int i6 = iArr2[i2];
                int i7 = c0886i.f5858d;
                if (i6 == i7) {
                    float[] fArr = this.f5802i;
                    float f4 = fArr[i2] + f2;
                    float f5 = f5794a;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f5803j) {
                            this.f5803j = this.f5801h[i2];
                        } else {
                            int[] iArr3 = this.f5801h;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z) {
                            c0886i.m5600c(this.f5796c);
                        }
                        if (this.f5805l) {
                            this.f5804k = i2;
                        }
                        c0886i.f5868n--;
                        this.f5795b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f5801h[i2];
            }
            int length = this.f5804k;
            int i8 = length + 1;
            if (this.f5805l) {
                int[] iArr4 = this.f5800g;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i8;
            }
            int[] iArr5 = this.f5800g;
            if (length >= iArr5.length && this.f5795b < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f5800g;
                    if (i9 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr7 = this.f5800g;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i10 = this.f5798e * 2;
                this.f5798e = i10;
                this.f5805l = false;
                this.f5804k = length - 1;
                this.f5802i = Arrays.copyOf(this.f5802i, i10);
                this.f5800g = Arrays.copyOf(this.f5800g, this.f5798e);
                this.f5801h = Arrays.copyOf(this.f5801h, this.f5798e);
            }
            this.f5800g[length] = c0886i.f5858d;
            this.f5802i[length] = f2;
            if (i4 != -1) {
                int[] iArr8 = this.f5801h;
                iArr8[length] = iArr8[i4];
                iArr8[i4] = length;
            } else {
                this.f5801h[length] = this.f5803j;
                this.f5803j = length;
            }
            c0886i.f5868n++;
            c0886i.m5599a(this.f5796c);
            this.f5795b++;
            if (!this.f5805l) {
                this.f5804k++;
            }
            int i11 = this.f5804k;
            int[] iArr9 = this.f5800g;
            if (i11 >= iArr9.length) {
                this.f5805l = true;
                this.f5804k = iArr9.length - 1;
            }
        }
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: f */
    public final float mo5520f(C0886i c0886i) {
        int i2 = this.f5803j;
        for (int i3 = 0; i2 != -1 && i3 < this.f5795b; i3++) {
            if (this.f5800g[i2] == c0886i.f5858d) {
                return this.f5802i[i2];
            }
            i2 = this.f5801h[i2];
        }
        return 0.0f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: g */
    public boolean mo5521g(C0886i c0886i) {
        int i2 = this.f5803j;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f5795b; i3++) {
            if (this.f5800g[i2] == c0886i.f5858d) {
                return true;
            }
            i2 = this.f5801h[i2];
        }
        return false;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: h */
    public float mo5522h(C0879b c0879b, boolean z) {
        float fMo5520f = mo5520f(c0879b.f5806a);
        mo5524j(c0879b.f5806a, z);
        C0879b.a aVar = c0879b.f5810e;
        int iMo5515a = aVar.mo5515a();
        for (int i2 = 0; i2 < iMo5515a; i2++) {
            C0886i c0886iMo5516b = aVar.mo5516b(i2);
            mo5519e(c0886iMo5516b, aVar.mo5520f(c0886iMo5516b) * fMo5520f, z);
        }
        return fMo5520f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: i */
    public final void mo5523i(C0886i c0886i, float f2) {
        if (f2 == 0.0f) {
            mo5524j(c0886i, true);
            return;
        }
        int i2 = this.f5803j;
        if (i2 == -1) {
            this.f5803j = 0;
            this.f5802i[0] = f2;
            this.f5800g[0] = c0886i.f5858d;
            this.f5801h[0] = -1;
            c0886i.f5868n++;
            c0886i.m5599a(this.f5796c);
            this.f5795b++;
            if (this.f5805l) {
                return;
            }
            int i3 = this.f5804k + 1;
            this.f5804k = i3;
            int[] iArr = this.f5800g;
            if (i3 >= iArr.length) {
                this.f5805l = true;
                this.f5804k = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f5795b; i5++) {
            int[] iArr2 = this.f5800g;
            int i6 = iArr2[i2];
            int i7 = c0886i.f5858d;
            if (i6 == i7) {
                this.f5802i[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f5801h[i2];
        }
        int length = this.f5804k;
        int i8 = length + 1;
        if (this.f5805l) {
            int[] iArr3 = this.f5800g;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i8;
        }
        int[] iArr4 = this.f5800g;
        if (length >= iArr4.length && this.f5795b < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f5800g;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f5800g;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i10 = this.f5798e * 2;
            this.f5798e = i10;
            this.f5805l = false;
            this.f5804k = length - 1;
            this.f5802i = Arrays.copyOf(this.f5802i, i10);
            this.f5800g = Arrays.copyOf(this.f5800g, this.f5798e);
            this.f5801h = Arrays.copyOf(this.f5801h, this.f5798e);
        }
        this.f5800g[length] = c0886i.f5858d;
        this.f5802i[length] = f2;
        if (i4 != -1) {
            int[] iArr7 = this.f5801h;
            iArr7[length] = iArr7[i4];
            iArr7[i4] = length;
        } else {
            this.f5801h[length] = this.f5803j;
            this.f5803j = length;
        }
        c0886i.f5868n++;
        c0886i.m5599a(this.f5796c);
        int i11 = this.f5795b + 1;
        this.f5795b = i11;
        if (!this.f5805l) {
            this.f5804k++;
        }
        int[] iArr8 = this.f5800g;
        if (i11 >= iArr8.length) {
            this.f5805l = true;
        }
        if (this.f5804k >= iArr8.length) {
            this.f5805l = true;
            this.f5804k = iArr8.length - 1;
        }
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: j */
    public final float mo5524j(C0886i c0886i, boolean z) {
        if (this.f5799f == c0886i) {
            this.f5799f = null;
        }
        int i2 = this.f5803j;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f5795b) {
            if (this.f5800g[i2] == c0886i.f5858d) {
                if (i2 == this.f5803j) {
                    this.f5803j = this.f5801h[i2];
                } else {
                    int[] iArr = this.f5801h;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    c0886i.m5600c(this.f5796c);
                }
                c0886i.f5868n--;
                this.f5795b--;
                this.f5800g[i2] = -1;
                if (this.f5805l) {
                    this.f5804k = i2;
                }
                return this.f5802i[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f5801h[i2];
        }
        return 0.0f;
    }

    @Override // p024c.p044g.p048b.C0879b.a
    /* renamed from: k */
    public void mo5525k(float f2) {
        int i2 = this.f5803j;
        for (int i3 = 0; i2 != -1 && i3 < this.f5795b; i3++) {
            float[] fArr = this.f5802i;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f5801h[i2];
        }
    }

    public String toString() {
        int i2 = this.f5803j;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (int i3 = 0; i2 != -1 && i3 < this.f5795b; i3++) {
            str = ((str + " -> ") + this.f5802i[i2] + " : ") + this.f5797d.f5815d[this.f5800g[i2]];
            i2 = this.f5801h[i2];
        }
        return str;
    }
}
