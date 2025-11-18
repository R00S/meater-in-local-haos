package p024c.p044g.p048b.p049k;

import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.C0886i;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: Barrier.java */
/* renamed from: c.g.b.k.a */
/* loaded from: classes.dex */
public class C0888a extends C0896i {

    /* renamed from: F0 */
    private int f5893F0 = 0;

    /* renamed from: G0 */
    private boolean f5894G0 = true;

    /* renamed from: H0 */
    private int f5895H0 = 0;

    /* renamed from: I0 */
    boolean f5896I0 = false;

    /* renamed from: c1 */
    public boolean m5612c1() {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        boolean z = true;
        while (true) {
            i2 = this.f6065E0;
            if (i5 >= i2) {
                break;
            }
            C0892e c0892e = this.f6064D0[i5];
            if ((this.f5894G0 || c0892e.mo5620h()) && ((((i3 = this.f5893F0) == 0 || i3 == 1) && !c0892e.mo5614e0()) || (((i4 = this.f5893F0) == 2 || i4 == 3) && !c0892e.mo5616f0()))) {
                z = false;
            }
            i5++;
        }
        if (!z || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f6065E0; i6++) {
            C0892e c0892e2 = this.f6064D0[i6];
            if (this.f5894G0 || c0892e2.mo5620h()) {
                if (!z2) {
                    int i7 = this.f5893F0;
                    if (i7 == 0) {
                        iMax = c0892e2.mo5718m(C0891d.b.LEFT).m5633d();
                    } else if (i7 == 1) {
                        iMax = c0892e2.mo5718m(C0891d.b.RIGHT).m5633d();
                    } else if (i7 == 2) {
                        iMax = c0892e2.mo5718m(C0891d.b.TOP).m5633d();
                    } else if (i7 == 3) {
                        iMax = c0892e2.mo5718m(C0891d.b.BOTTOM).m5633d();
                    }
                    z2 = true;
                }
                int i8 = this.f5893F0;
                if (i8 == 0) {
                    iMax = Math.min(iMax, c0892e2.mo5718m(C0891d.b.LEFT).m5633d());
                } else if (i8 == 1) {
                    iMax = Math.max(iMax, c0892e2.mo5718m(C0891d.b.RIGHT).m5633d());
                } else if (i8 == 2) {
                    iMax = Math.min(iMax, c0892e2.mo5718m(C0891d.b.TOP).m5633d());
                } else if (i8 == 3) {
                    iMax = Math.max(iMax, c0892e2.mo5718m(C0891d.b.BOTTOM).m5633d());
                }
            }
        }
        int i9 = iMax + this.f5895H0;
        int i10 = this.f5893F0;
        if (i10 == 0 || i10 == 1) {
            m5725p0(i9, i9);
        } else {
            m5731s0(i9, i9);
        }
        this.f5896I0 = true;
        return true;
    }

    /* renamed from: d1 */
    public boolean m5613d1() {
        return this.f5894G0;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: e0 */
    public boolean mo5614e0() {
        return this.f5896I0;
    }

    /* renamed from: e1 */
    public int m5615e1() {
        return this.f5893F0;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: f0 */
    public boolean mo5616f0() {
        return this.f5896I0;
    }

    /* renamed from: f1 */
    public int m5617f1() {
        return this.f5895H0;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: g */
    public void mo5618g(C0881d c0881d, boolean z) {
        C0891d[] c0891dArr;
        boolean z2;
        int i2;
        int i3;
        int i4;
        C0891d[] c0891dArr2 = this.f5959Q;
        c0891dArr2[0] = this.f5951I;
        c0891dArr2[2] = this.f5952J;
        c0891dArr2[1] = this.f5953K;
        c0891dArr2[3] = this.f5954L;
        int i5 = 0;
        while (true) {
            c0891dArr = this.f5959Q;
            if (i5 >= c0891dArr.length) {
                break;
            }
            c0891dArr[i5].f5927i = c0881d.m5580q(c0891dArr[i5]);
            i5++;
        }
        int i6 = this.f5893F0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        C0891d c0891d = c0891dArr[i6];
        if (!this.f5896I0) {
            m5612c1();
        }
        if (this.f5896I0) {
            this.f5896I0 = false;
            int i7 = this.f5893F0;
            if (i7 == 0 || i7 == 1) {
                c0881d.m5571f(this.f5951I.f5927i, this.f5968Z);
                c0881d.m5571f(this.f5953K.f5927i, this.f5968Z);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    c0881d.m5571f(this.f5952J.f5927i, this.f5969a0);
                    c0881d.m5571f(this.f5954L.f5927i, this.f5969a0);
                    return;
                }
                return;
            }
        }
        for (int i8 = 0; i8 < this.f6065E0; i8++) {
            C0892e c0892e = this.f6064D0[i8];
            if ((this.f5894G0 || c0892e.mo5620h()) && ((((i3 = this.f5893F0) == 0 || i3 == 1) && c0892e.m5742y() == C0892e.b.MATCH_CONSTRAINT && c0892e.f5951I.f5924f != null && c0892e.f5953K.f5924f != null) || (((i4 = this.f5893F0) == 2 || i4 == 3) && c0892e.m5680O() == C0892e.b.MATCH_CONSTRAINT && c0892e.f5952J.f5924f != null && c0892e.f5954L.f5924f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f5951I.m5640k() || this.f5953K.m5640k();
        boolean z4 = this.f5952J.m5640k() || this.f5954L.m5640k();
        int i9 = !z2 && (((i2 = this.f5893F0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.f6065E0; i10++) {
            C0892e c0892e2 = this.f6064D0[i10];
            if (this.f5894G0 || c0892e2.mo5620h()) {
                C0886i c0886iM5580q = c0881d.m5580q(c0892e2.f5959Q[this.f5893F0]);
                C0891d[] c0891dArr3 = c0892e2.f5959Q;
                int i11 = this.f5893F0;
                c0891dArr3[i11].f5927i = c0886iM5580q;
                int i12 = (c0891dArr3[i11].f5924f == null || c0891dArr3[i11].f5924f.f5922d != this) ? 0 : c0891dArr3[i11].f5925g + 0;
                if (i11 == 0 || i11 == 2) {
                    c0881d.m5574i(c0891d.f5927i, c0886iM5580q, this.f5895H0 - i12, z2);
                } else {
                    c0881d.m5572g(c0891d.f5927i, c0886iM5580q, this.f5895H0 + i12, z2);
                }
                c0881d.m5570e(c0891d.f5927i, c0886iM5580q, this.f5895H0 + i12, i9);
            }
        }
        int i13 = this.f5893F0;
        if (i13 == 0) {
            c0881d.m5570e(this.f5953K.f5927i, this.f5951I.f5927i, 0, 8);
            c0881d.m5570e(this.f5951I.f5927i, this.f5963U.f5953K.f5927i, 0, 4);
            c0881d.m5570e(this.f5951I.f5927i, this.f5963U.f5951I.f5927i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0881d.m5570e(this.f5951I.f5927i, this.f5953K.f5927i, 0, 8);
            c0881d.m5570e(this.f5951I.f5927i, this.f5963U.f5951I.f5927i, 0, 4);
            c0881d.m5570e(this.f5951I.f5927i, this.f5963U.f5953K.f5927i, 0, 0);
        } else if (i13 == 2) {
            c0881d.m5570e(this.f5954L.f5927i, this.f5952J.f5927i, 0, 8);
            c0881d.m5570e(this.f5952J.f5927i, this.f5963U.f5954L.f5927i, 0, 4);
            c0881d.m5570e(this.f5952J.f5927i, this.f5963U.f5952J.f5927i, 0, 0);
        } else if (i13 == 3) {
            c0881d.m5570e(this.f5952J.f5927i, this.f5954L.f5927i, 0, 8);
            c0881d.m5570e(this.f5952J.f5927i, this.f5963U.f5952J.f5927i, 0, 4);
            c0881d.m5570e(this.f5952J.f5927i, this.f5963U.f5954L.f5927i, 0, 0);
        }
    }

    /* renamed from: g1 */
    public int m5619g1() {
        int i2 = this.f5893F0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: h */
    public boolean mo5620h() {
        return true;
    }

    /* renamed from: h1 */
    protected void m5621h1() {
        for (int i2 = 0; i2 < this.f6065E0; i2++) {
            C0892e c0892e = this.f6064D0[i2];
            int i3 = this.f5893F0;
            if (i3 == 0 || i3 == 1) {
                c0892e.m5657C0(0, true);
            } else if (i3 == 2 || i3 == 3) {
                c0892e.m5657C0(1, true);
            }
        }
    }

    /* renamed from: i1 */
    public void m5622i1(boolean z) {
        this.f5894G0 = z;
    }

    /* renamed from: j1 */
    public void m5623j1(int i2) {
        this.f5893F0 = i2;
    }

    /* renamed from: k1 */
    public void m5624k1(int i2) {
        this.f5895H0 = i2;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    public String toString() {
        String str = "[Barrier] " + m5728r() + " {";
        for (int i2 = 0; i2 < this.f6065E0; i2++) {
            C0892e c0892e = this.f6064D0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + c0892e.m5728r();
        }
        return str + "}";
    }
}
