package a1;

import a1.d;
import b1.C2198c;
import b1.C2201f;
import b1.C2207l;
import b1.C2209n;
import b1.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: K0, reason: collision with root package name */
    public static float f19775K0 = 0.5f;

    /* renamed from: A0, reason: collision with root package name */
    int f19777A0;

    /* renamed from: B0, reason: collision with root package name */
    boolean f19779B0;

    /* renamed from: C0, reason: collision with root package name */
    boolean f19781C0;

    /* renamed from: D0, reason: collision with root package name */
    public float[] f19783D0;

    /* renamed from: E0, reason: collision with root package name */
    protected e[] f19785E0;

    /* renamed from: F0, reason: collision with root package name */
    protected e[] f19787F0;

    /* renamed from: G0, reason: collision with root package name */
    e f19789G0;

    /* renamed from: H0, reason: collision with root package name */
    e f19791H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f19793I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f19795J0;

    /* renamed from: K, reason: collision with root package name */
    private boolean f19796K;

    /* renamed from: V, reason: collision with root package name */
    public d f19807V;

    /* renamed from: W, reason: collision with root package name */
    public d[] f19808W;

    /* renamed from: X, reason: collision with root package name */
    protected ArrayList<d> f19809X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean[] f19810Y;

    /* renamed from: Z, reason: collision with root package name */
    public b[] f19811Z;

    /* renamed from: a0, reason: collision with root package name */
    public e f19813a0;

    /* renamed from: b0, reason: collision with root package name */
    int f19815b0;

    /* renamed from: c, reason: collision with root package name */
    public C2198c f19816c;

    /* renamed from: c0, reason: collision with root package name */
    int f19817c0;

    /* renamed from: d, reason: collision with root package name */
    public C2198c f19818d;

    /* renamed from: d0, reason: collision with root package name */
    public float f19819d0;

    /* renamed from: e0, reason: collision with root package name */
    protected int f19821e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f19823f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f19825g0;

    /* renamed from: h0, reason: collision with root package name */
    int f19827h0;

    /* renamed from: i0, reason: collision with root package name */
    int f19829i0;

    /* renamed from: j0, reason: collision with root package name */
    protected int f19831j0;

    /* renamed from: k0, reason: collision with root package name */
    protected int f19833k0;

    /* renamed from: l0, reason: collision with root package name */
    int f19835l0;

    /* renamed from: m0, reason: collision with root package name */
    protected int f19837m0;

    /* renamed from: n0, reason: collision with root package name */
    protected int f19839n0;

    /* renamed from: o, reason: collision with root package name */
    public String f19840o;

    /* renamed from: o0, reason: collision with root package name */
    float f19841o0;

    /* renamed from: p0, reason: collision with root package name */
    float f19843p0;

    /* renamed from: q0, reason: collision with root package name */
    private Object f19845q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f19847r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f19849s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f19851t0;

    /* renamed from: u0, reason: collision with root package name */
    private String f19853u0;

    /* renamed from: v0, reason: collision with root package name */
    private String f19855v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f19857w0;

    /* renamed from: x0, reason: collision with root package name */
    boolean f19859x0;

    /* renamed from: y0, reason: collision with root package name */
    boolean f19861y0;

    /* renamed from: z0, reason: collision with root package name */
    int f19863z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19812a = false;

    /* renamed from: b, reason: collision with root package name */
    public p[] f19814b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public C2207l f19820e = null;

    /* renamed from: f, reason: collision with root package name */
    public C2209n f19822f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f19824g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    boolean f19826h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19828i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19830j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19832k = true;

    /* renamed from: l, reason: collision with root package name */
    private int f19834l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f19836m = -1;

    /* renamed from: n, reason: collision with root package name */
    public Z0.a f19838n = new Z0.a(this);

    /* renamed from: p, reason: collision with root package name */
    private boolean f19842p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19844q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19846r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19848s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f19850t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f19852u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f19854v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f19856w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f19858x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f19860y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public int f19862z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f19776A = 0;

    /* renamed from: B, reason: collision with root package name */
    public float f19778B = 1.0f;

    /* renamed from: C, reason: collision with root package name */
    public int f19780C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f19782D = 0;

    /* renamed from: E, reason: collision with root package name */
    public float f19784E = 1.0f;

    /* renamed from: F, reason: collision with root package name */
    int f19786F = -1;

    /* renamed from: G, reason: collision with root package name */
    float f19788G = 1.0f;

    /* renamed from: H, reason: collision with root package name */
    private int[] f19790H = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: I, reason: collision with root package name */
    public float f19792I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    private boolean f19794J = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f19797L = false;

    /* renamed from: M, reason: collision with root package name */
    private int f19798M = 0;

    /* renamed from: N, reason: collision with root package name */
    private int f19799N = 0;

    /* renamed from: O, reason: collision with root package name */
    public d f19800O = new d(this, d.a.LEFT);

    /* renamed from: P, reason: collision with root package name */
    public d f19801P = new d(this, d.a.TOP);

    /* renamed from: Q, reason: collision with root package name */
    public d f19802Q = new d(this, d.a.RIGHT);

    /* renamed from: R, reason: collision with root package name */
    public d f19803R = new d(this, d.a.BOTTOM);

    /* renamed from: S, reason: collision with root package name */
    public d f19804S = new d(this, d.a.BASELINE);

    /* renamed from: T, reason: collision with root package name */
    d f19805T = new d(this, d.a.CENTER_X);

    /* renamed from: U, reason: collision with root package name */
    d f19806U = new d(this, d.a.CENTER_Y);

    /* compiled from: ConstraintWidget.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19864a;

        static {
            int[] iArr = new int[d.a.values().length];
            f19864a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19864a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19864a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19864a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19864a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19864a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19864a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19864a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19864a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.f19807V = dVar;
        this.f19808W = new d[]{this.f19800O, this.f19802Q, this.f19801P, this.f19803R, this.f19804S, dVar};
        this.f19809X = new ArrayList<>();
        this.f19810Y = new boolean[2];
        b bVar = b.FIXED;
        this.f19811Z = new b[]{bVar, bVar};
        this.f19813a0 = null;
        this.f19815b0 = 0;
        this.f19817c0 = 0;
        this.f19819d0 = 0.0f;
        this.f19821e0 = -1;
        this.f19823f0 = 0;
        this.f19825g0 = 0;
        this.f19827h0 = 0;
        this.f19829i0 = 0;
        this.f19831j0 = 0;
        this.f19833k0 = 0;
        this.f19835l0 = 0;
        float f10 = f19775K0;
        this.f19841o0 = f10;
        this.f19843p0 = f10;
        this.f19847r0 = 0;
        this.f19849s0 = 0;
        this.f19851t0 = false;
        this.f19853u0 = null;
        this.f19855v0 = null;
        this.f19861y0 = false;
        this.f19863z0 = 0;
        this.f19777A0 = 0;
        this.f19783D0 = new float[]{-1.0f, -1.0f};
        this.f19785E0 = new e[]{null, null};
        this.f19787F0 = new e[]{null, null};
        this.f19789G0 = null;
        this.f19791H0 = null;
        this.f19793I0 = -1;
        this.f19795J0 = -1;
        d();
    }

    private void A0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    private void P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        z0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        y0(sb2, "      size", i10, 0);
        y0(sb2, "      min", i11, 0);
        y0(sb2, "      max", i12, Integer.MAX_VALUE);
        y0(sb2, "      matchMin", i14, 0);
        y0(sb2, "      matchDef", i15, 0);
        x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void Q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f19761f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f19761f);
        sb2.append("'");
        if (dVar.f19763h != Integer.MIN_VALUE || dVar.f19762g != 0) {
            sb2.append(",");
            sb2.append(dVar.f19762g);
            if (dVar.f19763h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f19763h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.f19809X.add(this.f19800O);
        this.f19809X.add(this.f19801P);
        this.f19809X.add(this.f19802Q);
        this.f19809X.add(this.f19803R);
        this.f19809X.add(this.f19805T);
        this.f19809X.add(this.f19806U);
        this.f19809X.add(this.f19807V);
        this.f19809X.add(this.f19804S);
    }

    private boolean f0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.f19808W;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f19761f;
        return (dVar4 == null || dVar4.f19761f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f19761f) == null || dVar2.f19761f != dVar) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:380:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(X0.d r38, boolean r39, boolean r40, boolean r41, boolean r42, X0.i r43, X0.i r44, a1.e.b r45, boolean r46, a1.d r47, a1.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.e.i(X0.d, boolean, boolean, boolean, boolean, X0.i, X0.i, a1.e$b, boolean, a1.d, a1.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void z0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }

    public b A() {
        return this.f19811Z[0];
    }

    public int B() {
        d dVar = this.f19800O;
        int i10 = dVar != null ? dVar.f19762g : 0;
        d dVar2 = this.f19802Q;
        return dVar2 != null ? i10 + dVar2.f19762g : i10;
    }

    public void B0(int i10) {
        this.f19835l0 = i10;
        this.f19794J = i10 > 0;
    }

    public int C() {
        return this.f19798M;
    }

    public void C0(Object obj) {
        this.f19845q0 = obj;
    }

    public int D() {
        return this.f19799N;
    }

    public void D0(String str) {
        this.f19853u0 = str;
    }

    public int E(int i10) {
        if (i10 == 0) {
            return W();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.f19819d0 = r9
            r8.f19821e0 = r5
        L8f:
            return
        L90:
            r8.f19819d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.e.E0(java.lang.String):void");
    }

    public int F() {
        return this.f19790H[1];
    }

    public void F0(int i10) {
        if (this.f19794J) {
            int i11 = i10 - this.f19835l0;
            int i12 = this.f19817c0 + i11;
            this.f19825g0 = i11;
            this.f19801P.t(i11);
            this.f19803R.t(i12);
            this.f19804S.t(i10);
            this.f19844q = true;
        }
    }

    public int G() {
        return this.f19790H[0];
    }

    public void G0(int i10, int i11) {
        if (this.f19842p) {
            return;
        }
        this.f19800O.t(i10);
        this.f19802Q.t(i11);
        this.f19823f0 = i10;
        this.f19815b0 = i11 - i10;
        this.f19842p = true;
    }

    public int H() {
        return this.f19839n0;
    }

    public void H0(int i10) {
        this.f19800O.t(i10);
        this.f19823f0 = i10;
    }

    public int I() {
        return this.f19837m0;
    }

    public void I0(int i10) {
        this.f19801P.t(i10);
        this.f19825g0 = i10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f19803R).f19761f) != null && dVar2.f19761f == dVar) {
                return dVar2.f19759d;
            }
            return null;
        }
        d dVar3 = this.f19802Q;
        d dVar4 = dVar3.f19761f;
        if (dVar4 == null || dVar4.f19761f != dVar3) {
            return null;
        }
        return dVar4.f19759d;
    }

    public void J0(int i10, int i11) {
        if (this.f19844q) {
            return;
        }
        this.f19801P.t(i10);
        this.f19803R.t(i11);
        this.f19825g0 = i10;
        this.f19817c0 = i11 - i10;
        if (this.f19794J) {
            this.f19804S.t(i10 + this.f19835l0);
        }
        this.f19844q = true;
    }

    public e K() {
        return this.f19813a0;
    }

    public void K0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f19823f0 = i10;
        this.f19825g0 = i11;
        if (this.f19849s0 == 8) {
            this.f19815b0 = 0;
            this.f19817c0 = 0;
            return;
        }
        b[] bVarArr = this.f19811Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f19815b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f19817c0)) {
            i17 = i14;
        }
        this.f19815b0 = i16;
        this.f19817c0 = i17;
        int i18 = this.f19839n0;
        if (i17 < i18) {
            this.f19817c0 = i18;
        }
        int i19 = this.f19837m0;
        if (i16 < i19) {
            this.f19815b0 = i19;
        }
        int i20 = this.f19776A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f19815b0 = Math.min(this.f19815b0, i20);
        }
        int i21 = this.f19782D;
        if (i21 > 0 && this.f19811Z[1] == b.MATCH_CONSTRAINT) {
            this.f19817c0 = Math.min(this.f19817c0, i21);
        }
        int i22 = this.f19815b0;
        if (i16 != i22) {
            this.f19834l = i22;
        }
        int i23 = this.f19817c0;
        if (i17 != i23) {
            this.f19836m = i23;
        }
    }

    public e L(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f19801P).f19761f) != null && dVar2.f19761f == dVar) {
                return dVar2.f19759d;
            }
            return null;
        }
        d dVar3 = this.f19800O;
        d dVar4 = dVar3.f19761f;
        if (dVar4 == null || dVar4.f19761f != dVar3) {
            return null;
        }
        return dVar4.f19759d;
    }

    public void L0(boolean z10) {
        this.f19794J = z10;
    }

    public int M() {
        return X() + this.f19815b0;
    }

    public void M0(int i10) {
        this.f19817c0 = i10;
        int i11 = this.f19839n0;
        if (i10 < i11) {
            this.f19817c0 = i11;
        }
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f19820e;
        }
        if (i10 == 1) {
            return this.f19822f;
        }
        return null;
    }

    public void N0(float f10) {
        this.f19841o0 = f10;
    }

    public void O(StringBuilder sb2) {
        sb2.append("  " + this.f19840o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f19815b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f19817c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f19823f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f19825g0);
        sb2.append("\n");
        Q(sb2, "left", this.f19800O);
        Q(sb2, "top", this.f19801P);
        Q(sb2, "right", this.f19802Q);
        Q(sb2, "bottom", this.f19803R);
        Q(sb2, "baseline", this.f19804S);
        Q(sb2, "centerX", this.f19805T);
        Q(sb2, "centerY", this.f19806U);
        P(sb2, "    width", this.f19815b0, this.f19837m0, this.f19790H[0], this.f19834l, this.f19862z, this.f19856w, this.f19778B, this.f19811Z[0], this.f19783D0[0]);
        P(sb2, "    height", this.f19817c0, this.f19839n0, this.f19790H[1], this.f19836m, this.f19780C, this.f19858x, this.f19784E, this.f19811Z[1], this.f19783D0[1]);
        A0(sb2, "    dimensionRatio", this.f19819d0, this.f19821e0);
        x0(sb2, "    horizontalBias", this.f19841o0, f19775K0);
        x0(sb2, "    verticalBias", this.f19843p0, f19775K0);
        y0(sb2, "    horizontalChainStyle", this.f19863z0, 0);
        y0(sb2, "    verticalChainStyle", this.f19777A0, 0);
        sb2.append("  }");
    }

    public void O0(int i10) {
        this.f19863z0 = i10;
    }

    public void P0(int i10, int i11) {
        this.f19823f0 = i10;
        int i12 = i11 - i10;
        this.f19815b0 = i12;
        int i13 = this.f19837m0;
        if (i12 < i13) {
            this.f19815b0 = i13;
        }
    }

    public void Q0(b bVar) {
        this.f19811Z[0] = bVar;
    }

    public float R() {
        return this.f19843p0;
    }

    public void R0(int i10, int i11, int i12, float f10) {
        this.f19856w = i10;
        this.f19862z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f19776A = i12;
        this.f19778B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f19856w = 2;
    }

    public int S() {
        return this.f19777A0;
    }

    public void S0(float f10) {
        this.f19783D0[0] = f10;
    }

    public b T() {
        return this.f19811Z[1];
    }

    protected void T0(int i10, boolean z10) {
        this.f19810Y[i10] = z10;
    }

    public int U() {
        int i10 = this.f19800O != null ? this.f19801P.f19762g : 0;
        return this.f19802Q != null ? i10 + this.f19803R.f19762g : i10;
    }

    public void U0(boolean z10) {
        this.f19796K = z10;
    }

    public int V() {
        return this.f19849s0;
    }

    public void V0(boolean z10) {
        this.f19797L = z10;
    }

    public int W() {
        if (this.f19849s0 == 8) {
            return 0;
        }
        return this.f19815b0;
    }

    public void W0(int i10, int i11) {
        this.f19798M = i10;
        this.f19799N = i11;
        Z0(false);
    }

    public int X() {
        e eVar = this.f19813a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f19823f0 : ((f) eVar).f19876S0 + this.f19823f0;
    }

    public void X0(int i10) {
        this.f19790H[1] = i10;
    }

    public int Y() {
        e eVar = this.f19813a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f19825g0 : ((f) eVar).f19877T0 + this.f19825g0;
    }

    public void Y0(int i10) {
        this.f19790H[0] = i10;
    }

    public boolean Z() {
        return this.f19794J;
    }

    public void Z0(boolean z10) {
        this.f19828i = z10;
    }

    public boolean a0(int i10) {
        if (i10 == 0) {
            return (this.f19800O.f19761f != null ? 1 : 0) + (this.f19802Q.f19761f != null ? 1 : 0) < 2;
        }
        return ((this.f19801P.f19761f != null ? 1 : 0) + (this.f19803R.f19761f != null ? 1 : 0)) + (this.f19804S.f19761f != null ? 1 : 0) < 2;
    }

    public void a1(int i10) {
        if (i10 < 0) {
            this.f19839n0 = 0;
        } else {
            this.f19839n0 = i10;
        }
    }

    public boolean b0() {
        int size = this.f19809X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f19809X.get(i10).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i10) {
        if (i10 < 0) {
            this.f19837m0 = 0;
        } else {
            this.f19837m0 = i10;
        }
    }

    public boolean c0() {
        return (this.f19834l == -1 && this.f19836m == -1) ? false : true;
    }

    public void c1(int i10, int i11) {
        this.f19823f0 = i10;
        this.f19825g0 = i11;
    }

    public boolean d0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.f19800O.f19761f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.f19802Q.f19761f) != null && dVar2.n() && (this.f19802Q.f19761f.e() - this.f19802Q.f()) - (this.f19800O.f19761f.e() + this.f19800O.f()) >= i11;
        }
        d dVar4 = this.f19801P.f19761f;
        return dVar4 != null && dVar4.n() && (dVar = this.f19803R.f19761f) != null && dVar.n() && (this.f19803R.f19761f.e() - this.f19803R.f()) - (this.f19801P.f19761f.e() + this.f19801P.f()) >= i11;
        return false;
    }

    public void d1(e eVar) {
        this.f19813a0 = eVar;
    }

    public void e(f fVar, X0.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.V1(64));
        }
        if (i10 == 0) {
            HashSet<d> hashSetD = this.f19800O.d();
            if (hashSetD != null) {
                Iterator<d> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().f19759d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> hashSetD2 = this.f19802Q.d();
            if (hashSetD2 != null) {
                Iterator<d> it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    it2.next().f19759d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetD3 = this.f19801P.d();
        if (hashSetD3 != null) {
            Iterator<d> it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                it3.next().f19759d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSetD4 = this.f19803R.d();
        if (hashSetD4 != null) {
            Iterator<d> it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                it4.next().f19759d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSetD5 = this.f19804S.d();
        if (hashSetD5 != null) {
            Iterator<d> it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                it5.next().f19759d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public void e0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        o(aVar).b(eVar.o(aVar2), i10, i11, true);
    }

    public void e1(float f10) {
        this.f19843p0 = f10;
    }

    boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public void f1(int i10) {
        this.f19777A0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(X0.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.e.g(X0.d, boolean):void");
    }

    public boolean g0() {
        return this.f19846r;
    }

    public void g1(int i10, int i11) {
        this.f19825g0 = i10;
        int i12 = i11 - i10;
        this.f19817c0 = i12;
        int i13 = this.f19839n0;
        if (i12 < i13) {
            this.f19817c0 = i13;
        }
    }

    public boolean h() {
        return this.f19849s0 != 8;
    }

    public boolean h0(int i10) {
        return this.f19810Y[i10];
    }

    public void h1(b bVar) {
        this.f19811Z[1] = bVar;
    }

    public boolean i0() {
        d dVar = this.f19800O;
        d dVar2 = dVar.f19761f;
        if (dVar2 != null && dVar2.f19761f == dVar) {
            return true;
        }
        d dVar3 = this.f19802Q;
        d dVar4 = dVar3.f19761f;
        return dVar4 != null && dVar4.f19761f == dVar3;
    }

    public void i1(int i10, int i11, int i12, float f10) {
        this.f19858x = i10;
        this.f19780C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f19782D = i12;
        this.f19784E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f19858x = 2;
    }

    public void j(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    j(aVar6, eVar, aVar2, 0);
                    j(d.a.RIGHT, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    j(aVar7, eVar, aVar2, 0);
                    j(d.a.BOTTOM, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarO = o(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarO2 = o(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarO3 = o(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarO4 = o(aVar11);
            boolean z11 = true;
            if ((dVarO == null || !dVarO.o()) && (dVarO2 == null || !dVarO2.o())) {
                j(aVar8, eVar, aVar8, 0);
                j(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarO3 == null || !dVarO3.o()) && (dVarO4 == null || !dVarO4.o())) {
                j(aVar10, eVar, aVar10, 0);
                j(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                o(aVar5).a(eVar.o(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                o(aVar12).a(eVar.o(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    o(aVar13).a(eVar.o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarO5 = o(aVar4);
            d dVarO6 = eVar.o(aVar2);
            d dVarO7 = o(d.a.RIGHT);
            dVarO5.a(dVarO6, 0);
            dVarO7.a(dVarO6, 0);
            o(aVar14).a(dVarO6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarO8 = eVar.o(aVar2);
            o(aVar3).a(dVarO8, 0);
            o(d.a.BOTTOM).a(dVarO8, 0);
            o(aVar15).a(dVarO8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            o(aVar16).a(eVar.o(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            o(aVar17).a(eVar.o(aVar17), 0);
            o(aVar14).a(eVar.o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            o(aVar18).a(eVar.o(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            o(aVar19).a(eVar.o(aVar19), 0);
            o(aVar15).a(eVar.o(aVar2), 0);
            return;
        }
        d dVarO9 = o(aVar);
        d dVarO10 = eVar.o(aVar2);
        if (dVarO9.p(dVarO10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarO11 = o(d.a.TOP);
                d dVarO12 = o(d.a.BOTTOM);
                if (dVarO11 != null) {
                    dVarO11.q();
                }
                if (dVarO12 != null) {
                    dVarO12.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarO13 = o(aVar20);
                if (dVarO13 != null) {
                    dVarO13.q();
                }
                d dVarO14 = o(aVar5);
                if (dVarO14.j() != dVarO10) {
                    dVarO14.q();
                }
                d dVarG = o(aVar).g();
                d dVarO15 = o(aVar15);
                if (dVarO15.o()) {
                    dVarG.q();
                    dVarO15.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarO16 = o(aVar5);
                if (dVarO16.j() != dVarO10) {
                    dVarO16.q();
                }
                d dVarG2 = o(aVar).g();
                d dVarO17 = o(aVar14);
                if (dVarO17.o()) {
                    dVarG2.q();
                    dVarO17.q();
                }
            }
            dVarO9.a(dVarO10, i10);
        }
    }

    public boolean j0() {
        return this.f19796K;
    }

    public void j1(float f10) {
        this.f19783D0[1] = f10;
    }

    public void k(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean k0() {
        d dVar = this.f19801P;
        d dVar2 = dVar.f19761f;
        if (dVar2 != null && dVar2.f19761f == dVar) {
            return true;
        }
        d dVar3 = this.f19803R;
        d dVar4 = dVar3.f19761f;
        return dVar4 != null && dVar4.f19761f == dVar3;
    }

    public void k1(int i10) {
        this.f19849s0 = i10;
    }

    public void l(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        e0(aVar, eVar, aVar, i10, 0);
        this.f19792I = f10;
    }

    public boolean l0() {
        return this.f19797L;
    }

    public void l1(int i10) {
        this.f19815b0 = i10;
        int i11 = this.f19837m0;
        if (i10 < i11) {
            this.f19815b0 = i11;
        }
    }

    public void m(X0.d dVar) {
        dVar.q(this.f19800O);
        dVar.q(this.f19801P);
        dVar.q(this.f19802Q);
        dVar.q(this.f19803R);
        if (this.f19835l0 > 0) {
            dVar.q(this.f19804S);
        }
    }

    public boolean m0() {
        return this.f19828i && this.f19849s0 != 8;
    }

    public void m1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f19854v = i10;
    }

    public void n() {
        if (this.f19820e == null) {
            this.f19820e = new C2207l(this);
        }
        if (this.f19822f == null) {
            this.f19822f = new C2209n(this);
        }
    }

    public boolean n0() {
        return this.f19842p || (this.f19800O.n() && this.f19802Q.n());
    }

    public void n1(int i10) {
        this.f19823f0 = i10;
    }

    public d o(d.a aVar) {
        switch (a.f19864a[aVar.ordinal()]) {
            case 1:
                return this.f19800O;
            case 2:
                return this.f19801P;
            case 3:
                return this.f19802Q;
            case 4:
                return this.f19803R;
            case 5:
                return this.f19804S;
            case 6:
                return this.f19807V;
            case 7:
                return this.f19805T;
            case 8:
                return this.f19806U;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean o0() {
        return this.f19844q || (this.f19801P.n() && this.f19803R.n());
    }

    public void o1(int i10) {
        this.f19825g0 = i10;
    }

    public int p() {
        return this.f19835l0;
    }

    public boolean p0() {
        return this.f19848s;
    }

    public void p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f19786F == -1) {
            if (z12 && !z13) {
                this.f19786F = 0;
            } else if (!z12 && z13) {
                this.f19786F = 1;
                if (this.f19821e0 == -1) {
                    this.f19788G = 1.0f / this.f19788G;
                }
            }
        }
        if (this.f19786F == 0 && (!this.f19801P.o() || !this.f19803R.o())) {
            this.f19786F = 1;
        } else if (this.f19786F == 1 && (!this.f19800O.o() || !this.f19802Q.o())) {
            this.f19786F = 0;
        }
        if (this.f19786F == -1 && (!this.f19801P.o() || !this.f19803R.o() || !this.f19800O.o() || !this.f19802Q.o())) {
            if (this.f19801P.o() && this.f19803R.o()) {
                this.f19786F = 0;
            } else if (this.f19800O.o() && this.f19802Q.o()) {
                this.f19788G = 1.0f / this.f19788G;
                this.f19786F = 1;
            }
        }
        if (this.f19786F == -1) {
            int i10 = this.f19862z;
            if (i10 > 0 && this.f19780C == 0) {
                this.f19786F = 0;
            } else {
                if (i10 != 0 || this.f19780C <= 0) {
                    return;
                }
                this.f19788G = 1.0f / this.f19788G;
                this.f19786F = 1;
            }
        }
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f19841o0;
        }
        if (i10 == 1) {
            return this.f19843p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f19846r = true;
    }

    public void q1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f19820e.k();
        boolean zK2 = z11 & this.f19822f.k();
        C2207l c2207l = this.f19820e;
        int i12 = c2207l.f30080h.f30027g;
        C2209n c2209n = this.f19822f;
        int i13 = c2209n.f30080h.f30027g;
        int i14 = c2207l.f30081i.f30027g;
        int i15 = c2209n.f30081i.f30027g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f19823f0 = i12;
        }
        if (zK2) {
            this.f19825g0 = i13;
        }
        if (this.f19849s0 == 8) {
            this.f19815b0 = 0;
            this.f19817c0 = 0;
            return;
        }
        if (zK) {
            if (this.f19811Z[0] == b.FIXED && i17 < (i11 = this.f19815b0)) {
                i17 = i11;
            }
            this.f19815b0 = i17;
            int i19 = this.f19837m0;
            if (i17 < i19) {
                this.f19815b0 = i19;
            }
        }
        if (zK2) {
            if (this.f19811Z[1] == b.FIXED && i18 < (i10 = this.f19817c0)) {
                i18 = i10;
            }
            this.f19817c0 = i18;
            int i20 = this.f19839n0;
            if (i18 < i20) {
                this.f19817c0 = i20;
            }
        }
    }

    public int r() {
        return Y() + this.f19817c0;
    }

    public void r0() {
        this.f19848s = true;
    }

    public void r1(X0.d dVar, boolean z10) {
        C2209n c2209n;
        C2207l c2207l;
        int iY = dVar.y(this.f19800O);
        int iY2 = dVar.y(this.f19801P);
        int iY3 = dVar.y(this.f19802Q);
        int iY4 = dVar.y(this.f19803R);
        if (z10 && (c2207l = this.f19820e) != null) {
            C2201f c2201f = c2207l.f30080h;
            if (c2201f.f30030j) {
                C2201f c2201f2 = c2207l.f30081i;
                if (c2201f2.f30030j) {
                    iY = c2201f.f30027g;
                    iY3 = c2201f2.f30027g;
                }
            }
        }
        if (z10 && (c2209n = this.f19822f) != null) {
            C2201f c2201f3 = c2209n.f30080h;
            if (c2201f3.f30030j) {
                C2201f c2201f4 = c2209n.f30081i;
                if (c2201f4.f30030j) {
                    iY2 = c2201f3.f30027g;
                    iY4 = c2201f4.f30027g;
                }
            }
        }
        int i10 = iY4 - iY2;
        if (iY3 - iY < 0 || i10 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        K0(iY, iY2, iY3, iY4);
    }

    public Object s() {
        return this.f19845q0;
    }

    public boolean s0() {
        b[] bVarArr = this.f19811Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.f19853u0;
    }

    public void t0() {
        this.f19800O.q();
        this.f19801P.q();
        this.f19802Q.q();
        this.f19803R.q();
        this.f19804S.q();
        this.f19805T.q();
        this.f19806U.q();
        this.f19807V.q();
        this.f19813a0 = null;
        this.f19792I = Float.NaN;
        this.f19815b0 = 0;
        this.f19817c0 = 0;
        this.f19819d0 = 0.0f;
        this.f19821e0 = -1;
        this.f19823f0 = 0;
        this.f19825g0 = 0;
        this.f19831j0 = 0;
        this.f19833k0 = 0;
        this.f19835l0 = 0;
        this.f19837m0 = 0;
        this.f19839n0 = 0;
        float f10 = f19775K0;
        this.f19841o0 = f10;
        this.f19843p0 = f10;
        b[] bVarArr = this.f19811Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f19845q0 = null;
        this.f19847r0 = 0;
        this.f19849s0 = 0;
        this.f19855v0 = null;
        this.f19857w0 = false;
        this.f19859x0 = false;
        this.f19863z0 = 0;
        this.f19777A0 = 0;
        this.f19779B0 = false;
        this.f19781C0 = false;
        float[] fArr = this.f19783D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f19850t = -1;
        this.f19852u = -1;
        int[] iArr = this.f19790H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f19856w = 0;
        this.f19858x = 0;
        this.f19778B = 1.0f;
        this.f19784E = 1.0f;
        this.f19776A = Integer.MAX_VALUE;
        this.f19782D = Integer.MAX_VALUE;
        this.f19862z = 0;
        this.f19780C = 0;
        this.f19826h = false;
        this.f19786F = -1;
        this.f19788G = 1.0f;
        this.f19861y0 = false;
        boolean[] zArr = this.f19824g;
        zArr[0] = true;
        zArr[1] = true;
        this.f19797L = false;
        boolean[] zArr2 = this.f19810Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f19828i = true;
        int[] iArr2 = this.f19860y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f19834l = -1;
        this.f19836m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f19855v0 != null) {
            str = "type: " + this.f19855v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f19853u0 != null) {
            str2 = "id: " + this.f19853u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f19823f0);
        sb2.append(", ");
        sb2.append(this.f19825g0);
        sb2.append(") - (");
        sb2.append(this.f19815b0);
        sb2.append(" x ");
        sb2.append(this.f19817c0);
        sb2.append(")");
        return sb2.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e eVarK = K();
        if (eVarK != null && (eVarK instanceof f) && ((f) K()).N1()) {
            return;
        }
        int size = this.f19809X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19809X.get(i10).q();
        }
    }

    public float v() {
        return this.f19819d0;
    }

    public void v0() {
        this.f19842p = false;
        this.f19844q = false;
        this.f19846r = false;
        this.f19848s = false;
        int size = this.f19809X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19809X.get(i10).r();
        }
    }

    public int w() {
        return this.f19821e0;
    }

    public void w0(X0.c cVar) {
        this.f19800O.s(cVar);
        this.f19801P.s(cVar);
        this.f19802Q.s(cVar);
        this.f19803R.s(cVar);
        this.f19804S.s(cVar);
        this.f19807V.s(cVar);
        this.f19805T.s(cVar);
        this.f19806U.s(cVar);
    }

    public int x() {
        if (this.f19849s0 == 8) {
            return 0;
        }
        return this.f19817c0;
    }

    public float y() {
        return this.f19841o0;
    }

    public int z() {
        return this.f19863z0;
    }
}
