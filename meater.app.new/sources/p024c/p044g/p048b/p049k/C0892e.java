package p024c.p044g.p048b.p049k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p024c.p044g.p048b.C0880c;
import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.p050m.AbstractC0915p;
import p024c.p044g.p048b.p049k.p050m.C0902c;
import p024c.p044g.p048b.p049k.p050m.C0905f;
import p024c.p044g.p048b.p049k.p050m.C0911l;
import p024c.p044g.p048b.p049k.p050m.C0913n;

/* compiled from: ConstraintWidget.java */
/* renamed from: c.g.b.k.e */
/* loaded from: classes.dex */
public class C0892e {

    /* renamed from: a */
    public static float f5939a = 0.5f;

    /* renamed from: A0 */
    C0892e f5941A0;

    /* renamed from: B0 */
    public int f5943B0;

    /* renamed from: C0 */
    public int f5945C0;

    /* renamed from: E */
    private boolean f5947E;

    /* renamed from: P */
    public C0891d f5958P;

    /* renamed from: Q */
    public C0891d[] f5959Q;

    /* renamed from: R */
    protected ArrayList<C0891d> f5960R;

    /* renamed from: S */
    private boolean[] f5961S;

    /* renamed from: T */
    public b[] f5962T;

    /* renamed from: U */
    public C0892e f5963U;

    /* renamed from: V */
    int f5964V;

    /* renamed from: W */
    int f5965W;

    /* renamed from: X */
    public float f5966X;

    /* renamed from: Y */
    protected int f5967Y;

    /* renamed from: Z */
    protected int f5968Z;

    /* renamed from: a0 */
    protected int f5969a0;

    /* renamed from: b0 */
    int f5971b0;

    /* renamed from: c0 */
    int f5973c0;

    /* renamed from: d */
    public C0902c f5974d;

    /* renamed from: d0 */
    protected int f5975d0;

    /* renamed from: e */
    public C0902c f5976e;

    /* renamed from: e0 */
    protected int f5977e0;

    /* renamed from: f0 */
    int f5979f0;

    /* renamed from: g0 */
    protected int f5981g0;

    /* renamed from: h0 */
    protected int f5983h0;

    /* renamed from: i0 */
    float f5985i0;

    /* renamed from: j0 */
    float f5987j0;

    /* renamed from: k0 */
    private Object f5989k0;

    /* renamed from: l0 */
    private int f5991l0;

    /* renamed from: m0 */
    private int f5993m0;

    /* renamed from: n0 */
    private String f5995n0;

    /* renamed from: o0 */
    private String f5997o0;

    /* renamed from: p0 */
    boolean f5999p0;

    /* renamed from: q0 */
    boolean f6001q0;

    /* renamed from: r0 */
    boolean f6003r0;

    /* renamed from: s0 */
    int f6005s0;

    /* renamed from: t0 */
    int f6007t0;

    /* renamed from: u0 */
    boolean f6009u0;

    /* renamed from: v0 */
    boolean f6011v0;

    /* renamed from: w0 */
    public float[] f6013w0;

    /* renamed from: x0 */
    protected C0892e[] f6015x0;

    /* renamed from: y0 */
    protected C0892e[] f6017y0;

    /* renamed from: z0 */
    C0892e f6019z0;

    /* renamed from: b */
    public boolean f5970b = false;

    /* renamed from: c */
    public AbstractC0915p[] f5972c = new AbstractC0915p[2];

    /* renamed from: f */
    public C0911l f5978f = null;

    /* renamed from: g */
    public C0913n f5980g = null;

    /* renamed from: h */
    public boolean[] f5982h = {true, true};

    /* renamed from: i */
    boolean f5984i = false;

    /* renamed from: j */
    private boolean f5986j = true;

    /* renamed from: k */
    private boolean f5988k = false;

    /* renamed from: l */
    private boolean f5990l = true;

    /* renamed from: m */
    private boolean f5992m = false;

    /* renamed from: n */
    private boolean f5994n = false;

    /* renamed from: o */
    public int f5996o = -1;

    /* renamed from: p */
    public int f5998p = -1;

    /* renamed from: q */
    public int f6000q = 0;

    /* renamed from: r */
    public int f6002r = 0;

    /* renamed from: s */
    public int[] f6004s = new int[2];

    /* renamed from: t */
    public int f6006t = 0;

    /* renamed from: u */
    public int f6008u = 0;

    /* renamed from: v */
    public float f6010v = 1.0f;

    /* renamed from: w */
    public int f6012w = 0;

    /* renamed from: x */
    public int f6014x = 0;

    /* renamed from: y */
    public float f6016y = 1.0f;

    /* renamed from: z */
    int f6018z = -1;

    /* renamed from: A */
    float f5940A = 1.0f;

    /* renamed from: B */
    private int[] f5942B = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: C */
    private float f5944C = 0.0f;

    /* renamed from: D */
    private boolean f5946D = false;

    /* renamed from: F */
    private boolean f5948F = false;

    /* renamed from: G */
    private int f5949G = 0;

    /* renamed from: H */
    private int f5950H = 0;

    /* renamed from: I */
    public C0891d f5951I = new C0891d(this, C0891d.b.LEFT);

    /* renamed from: J */
    public C0891d f5952J = new C0891d(this, C0891d.b.TOP);

    /* renamed from: K */
    public C0891d f5953K = new C0891d(this, C0891d.b.RIGHT);

    /* renamed from: L */
    public C0891d f5954L = new C0891d(this, C0891d.b.BOTTOM);

    /* renamed from: M */
    public C0891d f5955M = new C0891d(this, C0891d.b.BASELINE);

    /* renamed from: N */
    C0891d f5956N = new C0891d(this, C0891d.b.CENTER_X);

    /* renamed from: O */
    C0891d f5957O = new C0891d(this, C0891d.b.CENTER_Y);

    /* compiled from: ConstraintWidget.java */
    /* renamed from: c.g.b.k.e$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6020a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6021b;

        static {
            int[] iArr = new int[b.values().length];
            f6021b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6021b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6021b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6021b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C0891d.b.values().length];
            f6020a = iArr2;
            try {
                iArr2[C0891d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6020a[C0891d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6020a[C0891d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6020a[C0891d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6020a[C0891d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6020a[C0891d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6020a[C0891d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6020a[C0891d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6020a[C0891d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* renamed from: c.g.b.k.e$b */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0892e() {
        C0891d c0891d = new C0891d(this, C0891d.b.CENTER);
        this.f5958P = c0891d;
        this.f5959Q = new C0891d[]{this.f5951I, this.f5953K, this.f5952J, this.f5954L, this.f5955M, c0891d};
        this.f5960R = new ArrayList<>();
        this.f5961S = new boolean[2];
        b bVar = b.FIXED;
        this.f5962T = new b[]{bVar, bVar};
        this.f5963U = null;
        this.f5964V = 0;
        this.f5965W = 0;
        this.f5966X = 0.0f;
        this.f5967Y = -1;
        this.f5968Z = 0;
        this.f5969a0 = 0;
        this.f5971b0 = 0;
        this.f5973c0 = 0;
        this.f5975d0 = 0;
        this.f5977e0 = 0;
        this.f5979f0 = 0;
        float f2 = f5939a;
        this.f5985i0 = f2;
        this.f5987j0 = f2;
        this.f5991l0 = 0;
        this.f5993m0 = 0;
        this.f5995n0 = null;
        this.f5997o0 = null;
        this.f6003r0 = false;
        this.f6005s0 = 0;
        this.f6007t0 = 0;
        this.f6013w0 = new float[]{-1.0f, -1.0f};
        this.f6015x0 = new C0892e[]{null, null};
        this.f6017y0 = new C0892e[]{null, null};
        this.f6019z0 = null;
        this.f5941A0 = null;
        this.f5943B0 = -1;
        this.f5945C0 = -1;
        m5650d();
    }

    /* renamed from: Y */
    private boolean m5649Y(int i2) {
        int i3 = i2 * 2;
        C0891d[] c0891dArr = this.f5959Q;
        if (c0891dArr[i3].f5924f != null && c0891dArr[i3].f5924f.f5924f != c0891dArr[i3]) {
            int i4 = i3 + 1;
            if (c0891dArr[i4].f5924f != null && c0891dArr[i4].f5924f.f5924f == c0891dArr[i4]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m5650d() {
        this.f5960R.add(this.f5951I);
        this.f5960R.add(this.f5952J);
        this.f5960R.add(this.f5953K);
        this.f5960R.add(this.f5954L);
        this.f5960R.add(this.f5956N);
        this.f5960R.add(this.f5957O);
        this.f5960R.add(this.f5958P);
        this.f5960R.add(this.f5955M);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0384 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x046d A[PHI: r1
      0x046d: PHI (r1v40 int) = (r1v39 int), (r1v44 int), (r1v44 int), (r1v44 int) binds: [B:278:0x045d, B:280:0x0463, B:281:0x0465, B:283:0x0469] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5651i(p024c.p044g.p048b.C0881d r32, boolean r33, boolean r34, boolean r35, boolean r36, p024c.p044g.p048b.C0886i r37, p024c.p044g.p048b.C0886i r38, p024c.p044g.p048b.p049k.C0892e.b r39, boolean r40, p024c.p044g.p048b.p049k.C0891d r41, p024c.p044g.p048b.p049k.C0891d r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.C0892e.m5651i(c.g.b.d, boolean, boolean, boolean, boolean, c.g.b.i, c.g.b.i, c.g.b.k.e$b, boolean, c.g.b.k.d, c.g.b.k.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: A */
    public int m5652A() {
        return this.f5949G;
    }

    /* renamed from: A0 */
    public void m5653A0(int i2, int i3, int i4, float f2) {
        this.f6000q = i2;
        this.f6006t = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f6008u = i4;
        this.f6010v = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f6000q = 2;
    }

    /* renamed from: B */
    public int m5654B() {
        return this.f5950H;
    }

    /* renamed from: B0 */
    public void m5655B0(float f2) {
        this.f6013w0[0] = f2;
    }

    /* renamed from: C */
    public int m5656C(int i2) {
        if (i2 == 0) {
            return m5686R();
        }
        if (i2 == 1) {
            return m5736v();
        }
        return 0;
    }

    /* renamed from: C0 */
    protected void m5657C0(int i2, boolean z) {
        this.f5961S[i2] = z;
    }

    /* renamed from: D */
    public int m5658D() {
        return this.f5942B[1];
    }

    /* renamed from: D0 */
    public void m5659D0(boolean z) {
        this.f5947E = z;
    }

    /* renamed from: E */
    public int m5660E() {
        return this.f5942B[0];
    }

    /* renamed from: E0 */
    public void m5661E0(boolean z) {
        this.f5948F = z;
    }

    /* renamed from: F */
    public int m5662F() {
        return this.f5983h0;
    }

    /* renamed from: F0 */
    public void m5663F0(int i2, int i3) {
        this.f5949G = i2;
        this.f5950H = i3;
        m5669I0(false);
    }

    /* renamed from: G */
    public int m5664G() {
        return this.f5981g0;
    }

    /* renamed from: G0 */
    public void m5665G0(int i2) {
        this.f5942B[1] = i2;
    }

    /* renamed from: H */
    public C0892e m5666H(int i2) {
        C0891d c0891d;
        C0891d c0891d2;
        if (i2 != 0) {
            if (i2 == 1 && (c0891d2 = (c0891d = this.f5954L).f5924f) != null && c0891d2.f5924f == c0891d) {
                return c0891d2.f5922d;
            }
            return null;
        }
        C0891d c0891d3 = this.f5953K;
        C0891d c0891d4 = c0891d3.f5924f;
        if (c0891d4 == null || c0891d4.f5924f != c0891d3) {
            return null;
        }
        return c0891d4.f5922d;
    }

    /* renamed from: H0 */
    public void m5667H0(int i2) {
        this.f5942B[0] = i2;
    }

    /* renamed from: I */
    public C0892e m5668I() {
        return this.f5963U;
    }

    /* renamed from: I0 */
    public void m5669I0(boolean z) {
        this.f5986j = z;
    }

    /* renamed from: J */
    public C0892e m5670J(int i2) {
        C0891d c0891d;
        C0891d c0891d2;
        if (i2 != 0) {
            if (i2 == 1 && (c0891d2 = (c0891d = this.f5952J).f5924f) != null && c0891d2.f5924f == c0891d) {
                return c0891d2.f5922d;
            }
            return null;
        }
        C0891d c0891d3 = this.f5951I;
        C0891d c0891d4 = c0891d3.f5924f;
        if (c0891d4 == null || c0891d4.f5924f != c0891d3) {
            return null;
        }
        return c0891d4.f5922d;
    }

    /* renamed from: J0 */
    public void m5671J0(int i2) {
        if (i2 < 0) {
            this.f5983h0 = 0;
        } else {
            this.f5983h0 = i2;
        }
    }

    /* renamed from: K */
    public int m5672K() {
        return m5688S() + this.f5964V;
    }

    /* renamed from: K0 */
    public void m5673K0(int i2) {
        if (i2 < 0) {
            this.f5981g0 = 0;
        } else {
            this.f5981g0 = i2;
        }
    }

    /* renamed from: L */
    public AbstractC0915p m5674L(int i2) {
        if (i2 == 0) {
            return this.f5978f;
        }
        if (i2 == 1) {
            return this.f5980g;
        }
        return null;
    }

    /* renamed from: L0 */
    public void m5675L0(int i2, int i3) {
        this.f5968Z = i2;
        this.f5969a0 = i3;
    }

    /* renamed from: M */
    public float m5676M() {
        return this.f5987j0;
    }

    /* renamed from: M0 */
    public void m5677M0(C0892e c0892e) {
        this.f5963U = c0892e;
    }

    /* renamed from: N */
    public int m5678N() {
        return this.f6007t0;
    }

    /* renamed from: N0 */
    public void m5679N0(float f2) {
        this.f5987j0 = f2;
    }

    /* renamed from: O */
    public b m5680O() {
        return this.f5962T[1];
    }

    /* renamed from: O0 */
    public void m5681O0(int i2) {
        this.f6007t0 = i2;
    }

    /* renamed from: P */
    public int m5682P() {
        int i2 = this.f5951I != null ? 0 + this.f5952J.f5925g : 0;
        return this.f5953K != null ? i2 + this.f5954L.f5925g : i2;
    }

    /* renamed from: P0 */
    public void m5683P0(int i2, int i3) {
        this.f5969a0 = i2;
        int i4 = i3 - i2;
        this.f5965W = i4;
        int i5 = this.f5983h0;
        if (i4 < i5) {
            this.f5965W = i5;
        }
    }

    /* renamed from: Q */
    public int m5684Q() {
        return this.f5993m0;
    }

    /* renamed from: Q0 */
    public void m5685Q0(b bVar) {
        this.f5962T[1] = bVar;
    }

    /* renamed from: R */
    public int m5686R() {
        if (this.f5993m0 == 8) {
            return 0;
        }
        return this.f5964V;
    }

    /* renamed from: R0 */
    public void m5687R0(int i2, int i3, int i4, float f2) {
        this.f6002r = i2;
        this.f6012w = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f6014x = i4;
        this.f6016y = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.f6002r = 2;
    }

    /* renamed from: S */
    public int m5688S() {
        C0892e c0892e = this.f5963U;
        return (c0892e == null || !(c0892e instanceof C0893f)) ? this.f5968Z : ((C0893f) c0892e).f6033K0 + this.f5968Z;
    }

    /* renamed from: S0 */
    public void m5689S0(float f2) {
        this.f6013w0[1] = f2;
    }

    /* renamed from: T */
    public int m5690T() {
        C0892e c0892e = this.f5963U;
        return (c0892e == null || !(c0892e instanceof C0893f)) ? this.f5969a0 : ((C0893f) c0892e).f6034L0 + this.f5969a0;
    }

    /* renamed from: T0 */
    public void m5691T0(int i2) {
        this.f5993m0 = i2;
    }

    /* renamed from: U */
    public boolean m5692U() {
        return this.f5946D;
    }

    /* renamed from: U0 */
    public void m5693U0(int i2) {
        this.f5964V = i2;
        int i3 = this.f5981g0;
        if (i2 < i3) {
            this.f5964V = i3;
        }
    }

    /* renamed from: V */
    public boolean m5694V(int i2) {
        if (i2 == 0) {
            return (this.f5951I.f5924f != null ? 1 : 0) + (this.f5953K.f5924f != null ? 1 : 0) < 2;
        }
        return ((this.f5952J.f5924f != null ? 1 : 0) + (this.f5954L.f5924f != null ? 1 : 0)) + (this.f5955M.f5924f != null ? 1 : 0) < 2;
    }

    /* renamed from: V0 */
    public void m5695V0(int i2) {
        this.f5968Z = i2;
    }

    /* renamed from: W */
    public boolean m5696W() {
        int size = this.f5960R.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f5960R.get(i2).m5641l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W0 */
    public void m5697W0(int i2) {
        this.f5969a0 = i2;
    }

    /* renamed from: X */
    public void m5698X(C0891d.b bVar, C0892e c0892e, C0891d.b bVar2, int i2, int i3) {
        mo5718m(bVar).m5630a(c0892e.mo5718m(bVar2), i2, i3, true);
    }

    /* renamed from: X0 */
    public void m5699X0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f6018z == -1) {
            if (z3 && !z4) {
                this.f6018z = 0;
            } else if (!z3 && z4) {
                this.f6018z = 1;
                if (this.f5967Y == -1) {
                    this.f5940A = 1.0f / this.f5940A;
                }
            }
        }
        if (this.f6018z == 0 && (!this.f5952J.m5643n() || !this.f5954L.m5643n())) {
            this.f6018z = 1;
        } else if (this.f6018z == 1 && (!this.f5951I.m5643n() || !this.f5953K.m5643n())) {
            this.f6018z = 0;
        }
        if (this.f6018z == -1 && (!this.f5952J.m5643n() || !this.f5954L.m5643n() || !this.f5951I.m5643n() || !this.f5953K.m5643n())) {
            if (this.f5952J.m5643n() && this.f5954L.m5643n()) {
                this.f6018z = 0;
            } else if (this.f5951I.m5643n() && this.f5953K.m5643n()) {
                this.f5940A = 1.0f / this.f5940A;
                this.f6018z = 1;
            }
        }
        if (this.f6018z == -1) {
            int i2 = this.f6006t;
            if (i2 > 0 && this.f6012w == 0) {
                this.f6018z = 0;
            } else {
                if (i2 != 0 || this.f6012w <= 0) {
                    return;
                }
                this.f5940A = 1.0f / this.f5940A;
                this.f6018z = 1;
            }
        }
    }

    /* renamed from: Y0 */
    public void mo5700Y0(boolean z, boolean z2) {
        int i2;
        int i3;
        boolean zM5869k = z & this.f5978f.m5869k();
        boolean zM5869k2 = z2 & this.f5980g.m5869k();
        C0911l c0911l = this.f5978f;
        int i4 = c0911l.f6166h.f6114g;
        C0913n c0913n = this.f5980g;
        int i5 = c0913n.f6166h.f6114g;
        int i6 = c0911l.f6167i.f6114g;
        int i7 = c0913n.f6167i.f6114g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (zM5869k) {
            this.f5968Z = i4;
        }
        if (zM5869k2) {
            this.f5969a0 = i5;
        }
        if (this.f5993m0 == 8) {
            this.f5964V = 0;
            this.f5965W = 0;
            return;
        }
        if (zM5869k) {
            if (this.f5962T[0] == b.FIXED && i9 < (i3 = this.f5964V)) {
                i9 = i3;
            }
            this.f5964V = i9;
            int i11 = this.f5981g0;
            if (i9 < i11) {
                this.f5964V = i11;
            }
        }
        if (zM5869k2) {
            if (this.f5962T[1] == b.FIXED && i10 < (i2 = this.f5965W)) {
                i10 = i2;
            }
            this.f5965W = i10;
            int i12 = this.f5983h0;
            if (i10 < i12) {
                this.f5965W = i12;
            }
        }
    }

    /* renamed from: Z */
    public boolean m5701Z() {
        C0891d c0891d = this.f5951I;
        C0891d c0891d2 = c0891d.f5924f;
        if (c0891d2 != null && c0891d2.f5924f == c0891d) {
            return true;
        }
        C0891d c0891d3 = this.f5953K;
        C0891d c0891d4 = c0891d3.f5924f;
        return c0891d4 != null && c0891d4.f5924f == c0891d3;
    }

    /* renamed from: Z0 */
    public void mo5702Z0(C0881d c0881d, boolean z) {
        C0913n c0913n;
        C0911l c0911l;
        int iM5584x = c0881d.m5584x(this.f5951I);
        int iM5584x2 = c0881d.m5584x(this.f5952J);
        int iM5584x3 = c0881d.m5584x(this.f5953K);
        int iM5584x4 = c0881d.m5584x(this.f5954L);
        if (z && (c0911l = this.f5978f) != null) {
            C0905f c0905f = c0911l.f6166h;
            if (c0905f.f6117j) {
                C0905f c0905f2 = c0911l.f6167i;
                if (c0905f2.f6117j) {
                    iM5584x = c0905f.f6114g;
                    iM5584x3 = c0905f2.f6114g;
                }
            }
        }
        if (z && (c0913n = this.f5980g) != null) {
            C0905f c0905f3 = c0913n.f6166h;
            if (c0905f3.f6117j) {
                C0905f c0905f4 = c0913n.f6167i;
                if (c0905f4.f6117j) {
                    iM5584x2 = c0905f3.f6114g;
                    iM5584x4 = c0905f4.f6114g;
                }
            }
        }
        int i2 = iM5584x4 - iM5584x2;
        if (iM5584x3 - iM5584x < 0 || i2 < 0 || iM5584x == Integer.MIN_VALUE || iM5584x == Integer.MAX_VALUE || iM5584x2 == Integer.MIN_VALUE || iM5584x2 == Integer.MAX_VALUE || iM5584x3 == Integer.MIN_VALUE || iM5584x3 == Integer.MAX_VALUE || iM5584x4 == Integer.MIN_VALUE || iM5584x4 == Integer.MAX_VALUE) {
            iM5584x4 = 0;
            iM5584x = 0;
            iM5584x2 = 0;
            iM5584x3 = 0;
        }
        m5733t0(iM5584x, iM5584x2, iM5584x3, iM5584x4);
    }

    /* renamed from: a0 */
    public boolean m5703a0() {
        return this.f5947E;
    }

    /* renamed from: b0 */
    public boolean m5704b0() {
        C0891d c0891d = this.f5952J;
        C0891d c0891d2 = c0891d.f5924f;
        if (c0891d2 != null && c0891d2.f5924f == c0891d) {
            return true;
        }
        C0891d c0891d3 = this.f5954L;
        C0891d c0891d4 = c0891d3.f5924f;
        return c0891d4 != null && c0891d4.f5924f == c0891d3;
    }

    /* renamed from: c0 */
    public boolean m5705c0() {
        return this.f5948F;
    }

    /* renamed from: d0 */
    public boolean m5706d0() {
        return this.f5986j && this.f5993m0 != 8;
    }

    /* renamed from: e */
    public void m5707e(C0893f c0893f, C0881d c0881d, HashSet<C0892e> hashSet, int i2, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C0897j.m5792a(c0893f, c0881d, this);
            hashSet.remove(this);
            mo5618g(c0881d, c0893f.m5752B1(64));
        }
        if (i2 == 0) {
            HashSet<C0891d> hashSetM5632c = this.f5951I.m5632c();
            if (hashSetM5632c != null) {
                Iterator<C0891d> it = hashSetM5632c.iterator();
                while (it.hasNext()) {
                    it.next().f5922d.m5707e(c0893f, c0881d, hashSet, i2, true);
                }
            }
            HashSet<C0891d> hashSetM5632c2 = this.f5953K.m5632c();
            if (hashSetM5632c2 != null) {
                Iterator<C0891d> it2 = hashSetM5632c2.iterator();
                while (it2.hasNext()) {
                    it2.next().f5922d.m5707e(c0893f, c0881d, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<C0891d> hashSetM5632c3 = this.f5952J.m5632c();
        if (hashSetM5632c3 != null) {
            Iterator<C0891d> it3 = hashSetM5632c3.iterator();
            while (it3.hasNext()) {
                it3.next().f5922d.m5707e(c0893f, c0881d, hashSet, i2, true);
            }
        }
        HashSet<C0891d> hashSetM5632c4 = this.f5954L.m5632c();
        if (hashSetM5632c4 != null) {
            Iterator<C0891d> it4 = hashSetM5632c4.iterator();
            while (it4.hasNext()) {
                it4.next().f5922d.m5707e(c0893f, c0881d, hashSet, i2, true);
            }
        }
        HashSet<C0891d> hashSetM5632c5 = this.f5955M.m5632c();
        if (hashSetM5632c5 != null) {
            Iterator<C0891d> it5 = hashSetM5632c5.iterator();
            while (it5.hasNext()) {
                it5.next().f5922d.m5707e(c0893f, c0881d, hashSet, i2, true);
            }
        }
    }

    /* renamed from: e0 */
    public boolean mo5614e0() {
        return this.f5992m || (this.f5951I.m5642m() && this.f5953K.m5642m());
    }

    /* renamed from: f */
    boolean m5708f() {
        return (this instanceof C0898k) || (this instanceof C0894g);
    }

    /* renamed from: f0 */
    public boolean mo5616f0() {
        return this.f5994n || (this.f5952J.m5642m() && this.f5954L.m5642m());
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05c0  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5618g(p024c.p044g.p048b.C0881d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.C0892e.mo5618g(c.g.b.d, boolean):void");
    }

    /* renamed from: g0 */
    public boolean m5709g0() {
        b[] bVarArr = this.f5962T;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    /* renamed from: h */
    public boolean mo5620h() {
        return this.f5993m0 != 8;
    }

    /* renamed from: h0 */
    public void mo5710h0() {
        this.f5951I.m5645p();
        this.f5952J.m5645p();
        this.f5953K.m5645p();
        this.f5954L.m5645p();
        this.f5955M.m5645p();
        this.f5956N.m5645p();
        this.f5957O.m5645p();
        this.f5958P.m5645p();
        this.f5963U = null;
        this.f5944C = 0.0f;
        this.f5964V = 0;
        this.f5965W = 0;
        this.f5966X = 0.0f;
        this.f5967Y = -1;
        this.f5968Z = 0;
        this.f5969a0 = 0;
        this.f5975d0 = 0;
        this.f5977e0 = 0;
        this.f5979f0 = 0;
        this.f5981g0 = 0;
        this.f5983h0 = 0;
        float f2 = f5939a;
        this.f5985i0 = f2;
        this.f5987j0 = f2;
        b[] bVarArr = this.f5962T;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f5989k0 = null;
        this.f5991l0 = 0;
        this.f5993m0 = 0;
        this.f5997o0 = null;
        this.f5999p0 = false;
        this.f6001q0 = false;
        this.f6005s0 = 0;
        this.f6007t0 = 0;
        this.f6009u0 = false;
        this.f6011v0 = false;
        float[] fArr = this.f6013w0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f5996o = -1;
        this.f5998p = -1;
        int[] iArr = this.f5942B;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f6000q = 0;
        this.f6002r = 0;
        this.f6010v = 1.0f;
        this.f6016y = 1.0f;
        this.f6008u = Integer.MAX_VALUE;
        this.f6014x = Integer.MAX_VALUE;
        this.f6006t = 0;
        this.f6012w = 0;
        this.f5984i = false;
        this.f6018z = -1;
        this.f5940A = 1.0f;
        this.f6003r0 = false;
        boolean[] zArr = this.f5982h;
        zArr[0] = true;
        zArr[1] = true;
        this.f5948F = false;
        boolean[] zArr2 = this.f5961S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f5986j = true;
    }

    /* renamed from: i0 */
    public void m5711i0() {
        this.f5992m = false;
        this.f5994n = false;
        int size = this.f5960R.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5960R.get(i2).m5646q();
        }
    }

    /* renamed from: j */
    public void m5712j(C0892e c0892e, float f2, int i2) {
        C0891d.b bVar = C0891d.b.CENTER;
        m5698X(bVar, c0892e, bVar, i2, 0);
        this.f5944C = f2;
    }

    /* renamed from: j0 */
    public void mo5713j0(C0880c c0880c) {
        this.f5951I.m5647r(c0880c);
        this.f5952J.m5647r(c0880c);
        this.f5953K.m5647r(c0880c);
        this.f5954L.m5647r(c0880c);
        this.f5955M.m5647r(c0880c);
        this.f5958P.m5647r(c0880c);
        this.f5956N.m5647r(c0880c);
        this.f5957O.m5647r(c0880c);
    }

    /* renamed from: k */
    public void m5714k(C0881d c0881d) {
        c0881d.m5580q(this.f5951I);
        c0881d.m5580q(this.f5952J);
        c0881d.m5580q(this.f5953K);
        c0881d.m5580q(this.f5954L);
        if (this.f5979f0 > 0) {
            c0881d.m5580q(this.f5955M);
        }
    }

    /* renamed from: k0 */
    public void m5715k0(int i2) {
        this.f5979f0 = i2;
        this.f5946D = i2 > 0;
    }

    /* renamed from: l */
    public void m5716l() {
        if (this.f5978f == null) {
            this.f5978f = new C0911l(this);
        }
        if (this.f5980g == null) {
            this.f5980g = new C0913n(this);
        }
    }

    /* renamed from: l0 */
    public void m5717l0(Object obj) {
        this.f5989k0 = obj;
    }

    /* renamed from: m */
    public C0891d mo5718m(C0891d.b bVar) {
        switch (a.f6020a[bVar.ordinal()]) {
            case 1:
                return this.f5951I;
            case 2:
                return this.f5952J;
            case 3:
                return this.f5953K;
            case 4:
                return this.f5954L;
            case 5:
                return this.f5955M;
            case 6:
                return this.f5958P;
            case 7:
                return this.f5956N;
            case 8:
                return this.f5957O;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: m0 */
    public void m5719m0(String str) {
        this.f5995n0 = str;
    }

    /* renamed from: n */
    public int m5720n() {
        return this.f5979f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5721n0(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.f5966X = r9
            r8.f5967Y = r1
        L8d:
            return
        L8e:
            r8.f5966X = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.C0892e.m5721n0(java.lang.String):void");
    }

    /* renamed from: o */
    public float m5722o(int i2) {
        if (i2 == 0) {
            return this.f5985i0;
        }
        if (i2 == 1) {
            return this.f5987j0;
        }
        return -1.0f;
    }

    /* renamed from: o0 */
    public void m5723o0(int i2) {
        if (this.f5946D) {
            int i3 = i2 - this.f5979f0;
            int i4 = this.f5965W + i3;
            this.f5969a0 = i3;
            this.f5952J.m5648s(i3);
            this.f5954L.m5648s(i4);
            this.f5955M.m5648s(i2);
            this.f5994n = true;
        }
    }

    /* renamed from: p */
    public int m5724p() {
        return m5690T() + this.f5965W;
    }

    /* renamed from: p0 */
    public void m5725p0(int i2, int i3) {
        this.f5951I.m5648s(i2);
        this.f5953K.m5648s(i3);
        this.f5968Z = i2;
        this.f5964V = i3 - i2;
        this.f5992m = true;
    }

    /* renamed from: q */
    public Object m5726q() {
        return this.f5989k0;
    }

    /* renamed from: q0 */
    public void m5727q0(int i2) {
        this.f5951I.m5648s(i2);
        this.f5968Z = i2;
    }

    /* renamed from: r */
    public String m5728r() {
        return this.f5995n0;
    }

    /* renamed from: r0 */
    public void m5729r0(int i2) {
        this.f5952J.m5648s(i2);
        this.f5969a0 = i2;
    }

    /* renamed from: s */
    public b m5730s(int i2) {
        if (i2 == 0) {
            return m5742y();
        }
        if (i2 == 1) {
            return m5680O();
        }
        return null;
    }

    /* renamed from: s0 */
    public void m5731s0(int i2, int i3) {
        this.f5952J.m5648s(i2);
        this.f5954L.m5648s(i3);
        this.f5969a0 = i2;
        this.f5965W = i3 - i2;
        if (this.f5946D) {
            this.f5955M.m5648s(i2 + this.f5979f0);
        }
        this.f5994n = true;
    }

    /* renamed from: t */
    public float m5732t() {
        return this.f5966X;
    }

    /* renamed from: t0 */
    public void m5733t0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.f5968Z = i2;
        this.f5969a0 = i3;
        if (this.f5993m0 == 8) {
            this.f5964V = 0;
            this.f5965W = 0;
            return;
        }
        b[] bVarArr = this.f5962T;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.f5964V)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.f5965W)) {
            i9 = i6;
        }
        this.f5964V = i8;
        this.f5965W = i9;
        int i10 = this.f5983h0;
        if (i9 < i10) {
            this.f5965W = i10;
        }
        int i11 = this.f5981g0;
        if (i8 < i11) {
            this.f5964V = i11;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.f5997o0;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 != null) {
            str = "type: " + this.f5997o0 + " ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (this.f5995n0 != null) {
            str3 = "id: " + this.f5995n0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.f5968Z);
        sb.append(", ");
        sb.append(this.f5969a0);
        sb.append(") - (");
        sb.append(this.f5964V);
        sb.append(" x ");
        sb.append(this.f5965W);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int m5734u() {
        return this.f5967Y;
    }

    /* renamed from: u0 */
    public void m5735u0(boolean z) {
        this.f5946D = z;
    }

    /* renamed from: v */
    public int m5736v() {
        if (this.f5993m0 == 8) {
            return 0;
        }
        return this.f5965W;
    }

    /* renamed from: v0 */
    public void m5737v0(int i2) {
        this.f5965W = i2;
        int i3 = this.f5983h0;
        if (i2 < i3) {
            this.f5965W = i3;
        }
    }

    /* renamed from: w */
    public float m5738w() {
        return this.f5985i0;
    }

    /* renamed from: w0 */
    public void m5739w0(float f2) {
        this.f5985i0 = f2;
    }

    /* renamed from: x */
    public int m5740x() {
        return this.f6005s0;
    }

    /* renamed from: x0 */
    public void m5741x0(int i2) {
        this.f6005s0 = i2;
    }

    /* renamed from: y */
    public b m5742y() {
        return this.f5962T[0];
    }

    /* renamed from: y0 */
    public void m5743y0(int i2, int i3) {
        this.f5968Z = i2;
        int i4 = i3 - i2;
        this.f5964V = i4;
        int i5 = this.f5981g0;
        if (i4 < i5) {
            this.f5964V = i5;
        }
    }

    /* renamed from: z */
    public int m5744z() {
        C0891d c0891d = this.f5951I;
        int i2 = c0891d != null ? 0 + c0891d.f5925g : 0;
        C0891d c0891d2 = this.f5953K;
        return c0891d2 != null ? i2 + c0891d2.f5925g : i2;
    }

    /* renamed from: z0 */
    public void m5745z0(b bVar) {
        this.f5962T[0] = bVar;
    }
}
