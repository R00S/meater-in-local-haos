package p024c.p044g.p048b.p049k;

import java.util.ArrayList;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: ChainHead.java */
/* renamed from: c.g.b.k.c */
/* loaded from: classes.dex */
public class C0890c {

    /* renamed from: a */
    protected C0892e f5897a;

    /* renamed from: b */
    protected C0892e f5898b;

    /* renamed from: c */
    protected C0892e f5899c;

    /* renamed from: d */
    protected C0892e f5900d;

    /* renamed from: e */
    protected C0892e f5901e;

    /* renamed from: f */
    protected C0892e f5902f;

    /* renamed from: g */
    protected C0892e f5903g;

    /* renamed from: h */
    protected ArrayList<C0892e> f5904h;

    /* renamed from: i */
    protected int f5905i;

    /* renamed from: j */
    protected int f5906j;

    /* renamed from: k */
    protected float f5907k = 0.0f;

    /* renamed from: l */
    int f5908l;

    /* renamed from: m */
    int f5909m;

    /* renamed from: n */
    int f5910n;

    /* renamed from: o */
    boolean f5911o;

    /* renamed from: p */
    private int f5912p;

    /* renamed from: q */
    private boolean f5913q;

    /* renamed from: r */
    protected boolean f5914r;

    /* renamed from: s */
    protected boolean f5915s;

    /* renamed from: t */
    protected boolean f5916t;

    /* renamed from: u */
    protected boolean f5917u;

    /* renamed from: v */
    private boolean f5918v;

    public C0890c(C0892e c0892e, int i2, boolean z) {
        this.f5913q = false;
        this.f5897a = c0892e;
        this.f5912p = i2;
        this.f5913q = z;
    }

    /* renamed from: b */
    private void m5627b() {
        int i2 = this.f5912p * 2;
        C0892e c0892e = this.f5897a;
        this.f5911o = true;
        C0892e c0892e2 = c0892e;
        boolean z = false;
        while (!z) {
            this.f5905i++;
            C0892e[] c0892eArr = c0892e.f6017y0;
            int i3 = this.f5912p;
            C0892e c0892e3 = null;
            c0892eArr[i3] = null;
            c0892e.f6015x0[i3] = null;
            if (c0892e.m5684Q() != 8) {
                this.f5908l++;
                C0892e.b bVarM5730s = c0892e.m5730s(this.f5912p);
                C0892e.b bVar = C0892e.b.MATCH_CONSTRAINT;
                if (bVarM5730s != bVar) {
                    this.f5909m += c0892e.m5656C(this.f5912p);
                }
                int iM5634e = this.f5909m + c0892e.f5959Q[i2].m5634e();
                this.f5909m = iM5634e;
                int i4 = i2 + 1;
                this.f5909m = iM5634e + c0892e.f5959Q[i4].m5634e();
                int iM5634e2 = this.f5910n + c0892e.f5959Q[i2].m5634e();
                this.f5910n = iM5634e2;
                this.f5910n = iM5634e2 + c0892e.f5959Q[i4].m5634e();
                if (this.f5898b == null) {
                    this.f5898b = c0892e;
                }
                this.f5900d = c0892e;
                C0892e.b[] bVarArr = c0892e.f5962T;
                int i5 = this.f5912p;
                if (bVarArr[i5] == bVar) {
                    int[] iArr = c0892e.f6004s;
                    if (iArr[i5] == 0 || iArr[i5] == 3 || iArr[i5] == 2) {
                        this.f5906j++;
                        float[] fArr = c0892e.f6013w0;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.f5907k += fArr[i5];
                        }
                        if (m5628c(c0892e, i5)) {
                            if (f2 < 0.0f) {
                                this.f5914r = true;
                            } else {
                                this.f5915s = true;
                            }
                            if (this.f5904h == null) {
                                this.f5904h = new ArrayList<>();
                            }
                            this.f5904h.add(c0892e);
                        }
                        if (this.f5902f == null) {
                            this.f5902f = c0892e;
                        }
                        C0892e c0892e4 = this.f5903g;
                        if (c0892e4 != null) {
                            c0892e4.f6015x0[this.f5912p] = c0892e;
                        }
                        this.f5903g = c0892e;
                    }
                    if (this.f5912p == 0) {
                        if (c0892e.f6000q != 0 || c0892e.f6006t != 0 || c0892e.f6008u != 0) {
                            this.f5911o = false;
                        }
                    } else if (c0892e.f6002r != 0 || c0892e.f6012w != 0 || c0892e.f6014x != 0) {
                        this.f5911o = false;
                    }
                    if (c0892e.f5966X != 0.0f) {
                        this.f5911o = false;
                        this.f5917u = true;
                    }
                }
            }
            if (c0892e2 != c0892e) {
                c0892e2.f6017y0[this.f5912p] = c0892e;
            }
            C0891d c0891d = c0892e.f5959Q[i2 + 1].f5924f;
            if (c0891d != null) {
                C0892e c0892e5 = c0891d.f5922d;
                C0891d[] c0891dArr = c0892e5.f5959Q;
                if (c0891dArr[i2].f5924f != null && c0891dArr[i2].f5924f.f5922d == c0892e) {
                    c0892e3 = c0892e5;
                }
            }
            if (c0892e3 == null) {
                c0892e3 = c0892e;
                z = true;
            }
            c0892e2 = c0892e;
            c0892e = c0892e3;
        }
        C0892e c0892e6 = this.f5898b;
        if (c0892e6 != null) {
            this.f5909m -= c0892e6.f5959Q[i2].m5634e();
        }
        C0892e c0892e7 = this.f5900d;
        if (c0892e7 != null) {
            this.f5909m -= c0892e7.f5959Q[i2 + 1].m5634e();
        }
        this.f5899c = c0892e;
        if (this.f5912p == 0 && this.f5913q) {
            this.f5901e = c0892e;
        } else {
            this.f5901e = this.f5897a;
        }
        this.f5916t = this.f5915s && this.f5914r;
    }

    /* renamed from: c */
    private static boolean m5628c(C0892e c0892e, int i2) {
        if (c0892e.m5684Q() != 8 && c0892e.f5962T[i2] == C0892e.b.MATCH_CONSTRAINT) {
            int[] iArr = c0892e.f6004s;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m5629a() {
        if (!this.f5918v) {
            m5627b();
        }
        this.f5918v = true;
    }
}
