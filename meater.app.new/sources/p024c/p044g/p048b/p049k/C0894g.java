package p024c.p044g.p048b.p049k;

import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.C0886i;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: Guideline.java */
/* renamed from: c.g.b.k.g */
/* loaded from: classes.dex */
public class C0894g extends C0892e {

    /* renamed from: D0 */
    protected float f6056D0 = -1.0f;

    /* renamed from: E0 */
    protected int f6057E0 = -1;

    /* renamed from: F0 */
    protected int f6058F0 = -1;

    /* renamed from: G0 */
    private C0891d f6059G0 = this.f5952J;

    /* renamed from: H0 */
    private int f6060H0 = 0;

    /* renamed from: I0 */
    private int f6061I0 = 0;

    /* renamed from: J0 */
    private boolean f6062J0;

    /* compiled from: Guideline.java */
    /* renamed from: c.g.b.k.g$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6063a;

        static {
            int[] iArr = new int[C0891d.b.values().length];
            f6063a = iArr;
            try {
                iArr[C0891d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6063a[C0891d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6063a[C0891d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6063a[C0891d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6063a[C0891d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6063a[C0891d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6063a[C0891d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6063a[C0891d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6063a[C0891d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0894g() {
        this.f5960R.clear();
        this.f5960R.add(this.f6059G0);
        int length = this.f5959Q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f5959Q[i2] = this.f6059G0;
        }
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: Z0 */
    public void mo5702Z0(C0881d c0881d, boolean z) {
        if (m5668I() == null) {
            return;
        }
        int iM5584x = c0881d.m5584x(this.f6059G0);
        if (this.f6060H0 == 1) {
            m5695V0(iM5584x);
            m5697W0(0);
            m5737v0(m5668I().m5736v());
            m5693U0(0);
            return;
        }
        m5695V0(0);
        m5697W0(iM5584x);
        m5693U0(m5668I().m5686R());
        m5737v0(0);
    }

    /* renamed from: a1 */
    public C0891d m5777a1() {
        return this.f6059G0;
    }

    /* renamed from: b1 */
    public int m5778b1() {
        return this.f6060H0;
    }

    /* renamed from: c1 */
    public int m5779c1() {
        return this.f6057E0;
    }

    /* renamed from: d1 */
    public int m5780d1() {
        return this.f6058F0;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: e0 */
    public boolean mo5614e0() {
        return this.f6062J0;
    }

    /* renamed from: e1 */
    public float m5781e1() {
        return this.f6056D0;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: f0 */
    public boolean mo5616f0() {
        return this.f6062J0;
    }

    /* renamed from: f1 */
    public void m5782f1(int i2) {
        this.f6059G0.m5648s(i2);
        this.f6062J0 = true;
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: g */
    public void mo5618g(C0881d c0881d, boolean z) {
        C0893f c0893f = (C0893f) m5668I();
        if (c0893f == null) {
            return;
        }
        C0891d c0891dMo5718m = c0893f.mo5718m(C0891d.b.LEFT);
        C0891d c0891dMo5718m2 = c0893f.mo5718m(C0891d.b.RIGHT);
        C0892e c0892e = this.f5963U;
        boolean z2 = c0892e != null && c0892e.f5962T[0] == C0892e.b.WRAP_CONTENT;
        if (this.f6060H0 == 0) {
            c0891dMo5718m = c0893f.mo5718m(C0891d.b.TOP);
            c0891dMo5718m2 = c0893f.mo5718m(C0891d.b.BOTTOM);
            C0892e c0892e2 = this.f5963U;
            z2 = c0892e2 != null && c0892e2.f5962T[1] == C0892e.b.WRAP_CONTENT;
        }
        if (this.f6062J0 && this.f6059G0.m5642m()) {
            C0886i c0886iM5580q = c0881d.m5580q(this.f6059G0);
            c0881d.m5571f(c0886iM5580q, this.f6059G0.m5633d());
            if (this.f6057E0 != -1) {
                if (z2) {
                    c0881d.m5573h(c0881d.m5580q(c0891dMo5718m2), c0886iM5580q, 0, 5);
                }
            } else if (this.f6058F0 != -1 && z2) {
                C0886i c0886iM5580q2 = c0881d.m5580q(c0891dMo5718m2);
                c0881d.m5573h(c0886iM5580q, c0881d.m5580q(c0891dMo5718m), 0, 5);
                c0881d.m5573h(c0886iM5580q2, c0886iM5580q, 0, 5);
            }
            this.f6062J0 = false;
            return;
        }
        if (this.f6057E0 != -1) {
            C0886i c0886iM5580q3 = c0881d.m5580q(this.f6059G0);
            c0881d.m5570e(c0886iM5580q3, c0881d.m5580q(c0891dMo5718m), this.f6057E0, 8);
            if (z2) {
                c0881d.m5573h(c0881d.m5580q(c0891dMo5718m2), c0886iM5580q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f6058F0 == -1) {
            if (this.f6056D0 != -1.0f) {
                c0881d.m5569d(C0881d.m5561s(c0881d, c0881d.m5580q(this.f6059G0), c0881d.m5580q(c0891dMo5718m2), this.f6056D0));
                return;
            }
            return;
        }
        C0886i c0886iM5580q4 = c0881d.m5580q(this.f6059G0);
        C0886i c0886iM5580q5 = c0881d.m5580q(c0891dMo5718m2);
        c0881d.m5570e(c0886iM5580q4, c0886iM5580q5, -this.f6058F0, 8);
        if (z2) {
            c0881d.m5573h(c0886iM5580q4, c0881d.m5580q(c0891dMo5718m), 0, 5);
            c0881d.m5573h(c0886iM5580q5, c0886iM5580q4, 0, 5);
        }
    }

    /* renamed from: g1 */
    public void m5783g1(int i2) {
        if (i2 > -1) {
            this.f6056D0 = -1.0f;
            this.f6057E0 = i2;
            this.f6058F0 = -1;
        }
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: h */
    public boolean mo5620h() {
        return true;
    }

    /* renamed from: h1 */
    public void m5784h1(int i2) {
        if (i2 > -1) {
            this.f6056D0 = -1.0f;
            this.f6057E0 = -1;
            this.f6058F0 = i2;
        }
    }

    /* renamed from: i1 */
    public void m5785i1(float f2) {
        if (f2 > -1.0f) {
            this.f6056D0 = f2;
            this.f6057E0 = -1;
            this.f6058F0 = -1;
        }
    }

    /* renamed from: j1 */
    public void m5786j1(int i2) {
        if (this.f6060H0 == i2) {
            return;
        }
        this.f6060H0 = i2;
        this.f5960R.clear();
        if (this.f6060H0 == 1) {
            this.f6059G0 = this.f5951I;
        } else {
            this.f6059G0 = this.f5952J;
        }
        this.f5960R.add(this.f6059G0);
        int length = this.f5959Q.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f5959Q[i3] = this.f6059G0;
        }
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: m */
    public C0891d mo5718m(C0891d.b bVar) {
        switch (a.f6063a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f6060H0 == 1) {
                    return this.f6059G0;
                }
                break;
            case 3:
            case 4:
                if (this.f6060H0 == 0) {
                    return this.f6059G0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
