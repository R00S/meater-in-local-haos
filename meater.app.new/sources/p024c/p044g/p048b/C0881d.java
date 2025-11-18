package p024c.p044g.p048b;

import java.util.Arrays;
import java.util.HashMap;
import p024c.p044g.p048b.C0886i;
import p024c.p044g.p048b.p049k.C0891d;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: LinearSystem.java */
/* renamed from: c.g.b.d */
/* loaded from: classes.dex */
public class C0881d {

    /* renamed from: a */
    public static boolean f5816a = false;

    /* renamed from: b */
    public static boolean f5817b = true;

    /* renamed from: c */
    public static boolean f5818c = true;

    /* renamed from: d */
    public static boolean f5819d = true;

    /* renamed from: e */
    public static boolean f5820e = false;

    /* renamed from: f */
    private static int f5821f = 1000;

    /* renamed from: g */
    public static C0882e f5822g;

    /* renamed from: h */
    public static long f5823h;

    /* renamed from: i */
    public static long f5824i;

    /* renamed from: m */
    private a f5828m;

    /* renamed from: p */
    C0879b[] f5831p;

    /* renamed from: w */
    final C0880c f5838w;

    /* renamed from: z */
    private a f5841z;

    /* renamed from: j */
    public boolean f5825j = false;

    /* renamed from: k */
    int f5826k = 0;

    /* renamed from: l */
    private HashMap<String, C0886i> f5827l = null;

    /* renamed from: n */
    private int f5829n = 32;

    /* renamed from: o */
    private int f5830o = 32;

    /* renamed from: q */
    public boolean f5832q = false;

    /* renamed from: r */
    public boolean f5833r = false;

    /* renamed from: s */
    private boolean[] f5834s = new boolean[32];

    /* renamed from: t */
    int f5835t = 1;

    /* renamed from: u */
    int f5836u = 0;

    /* renamed from: v */
    private int f5837v = 32;

    /* renamed from: x */
    private C0886i[] f5839x = new C0886i[f5821f];

    /* renamed from: y */
    private int f5840y = 0;

    /* compiled from: LinearSystem.java */
    /* renamed from: c.g.b.d$a */
    interface a {
        /* renamed from: a */
        void mo5532a(C0886i c0886i);

        /* renamed from: b */
        C0886i mo5533b(C0881d c0881d, boolean[] zArr);

        /* renamed from: c */
        void mo5534c(a aVar);

        void clear();

        C0886i getKey();

        boolean isEmpty();
    }

    /* compiled from: LinearSystem.java */
    /* renamed from: c.g.b.d$b */
    class b extends C0879b {
        public b(C0880c c0880c) {
            this.f5810e = new C0887j(this, c0880c);
        }
    }

    public C0881d() {
        this.f5831p = null;
        this.f5831p = new C0879b[32];
        m5557C();
        C0880c c0880c = new C0880c();
        this.f5838w = c0880c;
        this.f5828m = new C0885h(c0880c);
        if (f5820e) {
            this.f5841z = new b(c0880c);
        } else {
            this.f5841z = new C0879b(c0880c);
        }
    }

    /* renamed from: B */
    private final int m5556B(a aVar, boolean z) {
        if (f5822g != null) {
            throw null;
        }
        for (int i2 = 0; i2 < this.f5835t; i2++) {
            this.f5834s[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (f5822g != null) {
                throw null;
            }
            i3++;
            if (i3 >= this.f5835t * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f5834s[aVar.getKey().f5858d] = true;
            }
            C0886i c0886iMo5533b = aVar.mo5533b(this, this.f5834s);
            if (c0886iMo5533b != null) {
                boolean[] zArr = this.f5834s;
                int i4 = c0886iMo5533b.f5858d;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (c0886iMo5533b != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f5836u; i6++) {
                    C0879b c0879b = this.f5831p[i6];
                    if (c0879b.f5806a.f5865k != C0886i.a.UNRESTRICTED && !c0879b.f5811f && c0879b.m5551t(c0886iMo5533b)) {
                        float fMo5520f = c0879b.f5810e.mo5520f(c0886iMo5533b);
                        if (fMo5520f < 0.0f) {
                            float f3 = (-c0879b.f5807b) / fMo5520f;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    C0879b c0879b2 = this.f5831p[i5];
                    c0879b2.f5806a.f5859e = -1;
                    if (f5822g != null) {
                        throw null;
                    }
                    c0879b2.m5553x(c0886iMo5533b);
                    C0886i c0886i = c0879b2.f5806a;
                    c0886i.f5859e = i5;
                    c0886i.m5604g(this, c0879b2);
                } else {
                    continue;
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    /* renamed from: C */
    private void m5557C() {
        int i2 = 0;
        if (f5820e) {
            while (i2 < this.f5836u) {
                C0879b c0879b = this.f5831p[i2];
                if (c0879b != null) {
                    this.f5838w.f5812a.mo5586a(c0879b);
                }
                this.f5831p[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.f5836u) {
            C0879b c0879b2 = this.f5831p[i2];
            if (c0879b2 != null) {
                this.f5838w.f5813b.mo5586a(c0879b2);
            }
            this.f5831p[i2] = null;
            i2++;
        }
    }

    /* renamed from: a */
    private C0886i m5558a(C0886i.a aVar, String str) {
        C0886i c0886iMo5587b = this.f5838w.f5814c.mo5587b();
        if (c0886iMo5587b == null) {
            c0886iMo5587b = new C0886i(aVar, str);
            c0886iMo5587b.m5603f(aVar, str);
        } else {
            c0886iMo5587b.m5601d();
            c0886iMo5587b.m5603f(aVar, str);
        }
        int i2 = this.f5840y;
        int i3 = f5821f;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f5821f = i4;
            this.f5839x = (C0886i[]) Arrays.copyOf(this.f5839x, i4);
        }
        C0886i[] c0886iArr = this.f5839x;
        int i5 = this.f5840y;
        this.f5840y = i5 + 1;
        c0886iArr[i5] = c0886iMo5587b;
        return c0886iMo5587b;
    }

    /* renamed from: l */
    private final void m5559l(C0879b c0879b) {
        int i2;
        if (f5818c && c0879b.f5811f) {
            c0879b.f5806a.m5602e(this, c0879b.f5807b);
        } else {
            C0879b[] c0879bArr = this.f5831p;
            int i3 = this.f5836u;
            c0879bArr[i3] = c0879b;
            C0886i c0886i = c0879b.f5806a;
            c0886i.f5859e = i3;
            this.f5836u = i3 + 1;
            c0886i.m5604g(this, c0879b);
        }
        if (f5818c && this.f5825j) {
            int i4 = 0;
            while (i4 < this.f5836u) {
                if (this.f5831p[i4] == null) {
                    System.out.println("WTF");
                }
                C0879b[] c0879bArr2 = this.f5831p;
                if (c0879bArr2[i4] != null && c0879bArr2[i4].f5811f) {
                    C0879b c0879b2 = c0879bArr2[i4];
                    c0879b2.f5806a.m5602e(this, c0879b2.f5807b);
                    if (f5820e) {
                        this.f5838w.f5812a.mo5586a(c0879b2);
                    } else {
                        this.f5838w.f5813b.mo5586a(c0879b2);
                    }
                    this.f5831p[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f5836u;
                        if (i5 >= i2) {
                            break;
                        }
                        C0879b[] c0879bArr3 = this.f5831p;
                        int i7 = i5 - 1;
                        c0879bArr3[i7] = c0879bArr3[i5];
                        if (c0879bArr3[i7].f5806a.f5859e == i5) {
                            c0879bArr3[i7].f5806a.f5859e = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f5831p[i6] = null;
                    }
                    this.f5836u = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f5825j = false;
        }
    }

    /* renamed from: n */
    private void m5560n() {
        for (int i2 = 0; i2 < this.f5836u; i2++) {
            C0879b c0879b = this.f5831p[i2];
            c0879b.f5806a.f5861g = c0879b.f5807b;
        }
    }

    /* renamed from: s */
    public static C0879b m5561s(C0881d c0881d, C0886i c0886i, C0886i c0886i2, float f2) {
        return c0881d.m5581r().m5541j(c0886i, c0886i2, f2);
    }

    /* renamed from: u */
    private int m5562u(a aVar) throws Exception {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f5836u) {
                z = false;
                break;
            }
            C0879b[] c0879bArr = this.f5831p;
            if (c0879bArr[i2].f5806a.f5865k != C0886i.a.UNRESTRICTED && c0879bArr[i2].f5807b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (f5822g != null) {
                throw null;
            }
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f5836u; i7++) {
                C0879b c0879b = this.f5831p[i7];
                if (c0879b.f5806a.f5865k != C0886i.a.UNRESTRICTED && !c0879b.f5811f && c0879b.f5807b < 0.0f) {
                    int i8 = 9;
                    if (f5819d) {
                        int iMo5515a = c0879b.f5810e.mo5515a();
                        int i9 = 0;
                        while (i9 < iMo5515a) {
                            C0886i c0886iMo5516b = c0879b.f5810e.mo5516b(i9);
                            float fMo5520f = c0879b.f5810e.mo5520f(c0886iMo5516b);
                            if (fMo5520f > 0.0f) {
                                int i10 = 0;
                                while (i10 < i8) {
                                    float f3 = c0886iMo5516b.f5863i[i10] / fMo5520f;
                                    if ((f3 < f2 && i10 == i6) || i10 > i6) {
                                        i5 = c0886iMo5516b.f5858d;
                                        i6 = i10;
                                        i4 = i7;
                                        f2 = f3;
                                    }
                                    i10++;
                                    i8 = 9;
                                }
                            }
                            i9++;
                            i8 = 9;
                        }
                    } else {
                        for (int i11 = 1; i11 < this.f5835t; i11++) {
                            C0886i c0886i = this.f5838w.f5815d[i11];
                            float fMo5520f2 = c0879b.f5810e.mo5520f(c0886i);
                            if (fMo5520f2 > 0.0f) {
                                for (int i12 = 0; i12 < 9; i12++) {
                                    float f4 = c0886i.f5863i[i12] / fMo5520f2;
                                    if ((f4 < f2 && i12 == i6) || i12 > i6) {
                                        i5 = i11;
                                        i6 = i12;
                                        i4 = i7;
                                        f2 = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                C0879b c0879b2 = this.f5831p[i4];
                c0879b2.f5806a.f5859e = -1;
                if (f5822g != null) {
                    throw null;
                }
                c0879b2.m5553x(this.f5838w.f5815d[i5]);
                C0886i c0886i2 = c0879b2.f5806a;
                c0886i2.f5859e = i4;
                c0886i2.m5604g(this, c0879b2);
            } else {
                z2 = true;
            }
            if (i3 > this.f5835t / 2) {
                z2 = true;
            }
        }
        return i3;
    }

    /* renamed from: w */
    public static C0882e m5563w() {
        return f5822g;
    }

    /* renamed from: y */
    private void m5564y() {
        int i2 = this.f5829n * 2;
        this.f5829n = i2;
        this.f5831p = (C0879b[]) Arrays.copyOf(this.f5831p, i2);
        C0880c c0880c = this.f5838w;
        c0880c.f5815d = (C0886i[]) Arrays.copyOf(c0880c.f5815d, this.f5829n);
        int i3 = this.f5829n;
        this.f5834s = new boolean[i3];
        this.f5830o = i3;
        this.f5837v = i3;
        if (f5822g != null) {
            throw null;
        }
    }

    /* renamed from: A */
    void m5565A(a aVar) throws Exception {
        if (f5822g != null) {
            throw null;
        }
        m5562u(aVar);
        m5556B(aVar, false);
        m5560n();
    }

    /* renamed from: D */
    public void m5566D() {
        C0880c c0880c;
        int i2 = 0;
        while (true) {
            c0880c = this.f5838w;
            C0886i[] c0886iArr = c0880c.f5815d;
            if (i2 >= c0886iArr.length) {
                break;
            }
            C0886i c0886i = c0886iArr[i2];
            if (c0886i != null) {
                c0886i.m5601d();
            }
            i2++;
        }
        c0880c.f5814c.mo5588c(this.f5839x, this.f5840y);
        this.f5840y = 0;
        Arrays.fill(this.f5838w.f5815d, (Object) null);
        HashMap<String, C0886i> map = this.f5827l;
        if (map != null) {
            map.clear();
        }
        this.f5826k = 0;
        this.f5828m.clear();
        this.f5835t = 1;
        for (int i3 = 0; i3 < this.f5836u; i3++) {
            C0879b[] c0879bArr = this.f5831p;
            if (c0879bArr[i3] != null) {
                c0879bArr[i3].f5808c = false;
            }
        }
        m5557C();
        this.f5836u = 0;
        if (f5820e) {
            this.f5841z = new b(this.f5838w);
        } else {
            this.f5841z = new C0879b(this.f5838w);
        }
    }

    /* renamed from: b */
    public void m5567b(C0892e c0892e, C0892e c0892e2, float f2, int i2) {
        C0891d.b bVar = C0891d.b.LEFT;
        C0886i c0886iM5580q = m5580q(c0892e.mo5718m(bVar));
        C0891d.b bVar2 = C0891d.b.TOP;
        C0886i c0886iM5580q2 = m5580q(c0892e.mo5718m(bVar2));
        C0891d.b bVar3 = C0891d.b.RIGHT;
        C0886i c0886iM5580q3 = m5580q(c0892e.mo5718m(bVar3));
        C0891d.b bVar4 = C0891d.b.BOTTOM;
        C0886i c0886iM5580q4 = m5580q(c0892e.mo5718m(bVar4));
        C0886i c0886iM5580q5 = m5580q(c0892e2.mo5718m(bVar));
        C0886i c0886iM5580q6 = m5580q(c0892e2.mo5718m(bVar2));
        C0886i c0886iM5580q7 = m5580q(c0892e2.mo5718m(bVar3));
        C0886i c0886iM5580q8 = m5580q(c0892e2.mo5718m(bVar4));
        C0879b c0879bM5581r = m5581r();
        double d2 = f2;
        double dSin = Math.sin(d2);
        double d3 = i2;
        Double.isNaN(d3);
        c0879bM5581r.m5548q(c0886iM5580q2, c0886iM5580q4, c0886iM5580q6, c0886iM5580q8, (float) (dSin * d3));
        m5569d(c0879bM5581r);
        C0879b c0879bM5581r2 = m5581r();
        double dCos = Math.cos(d2);
        Double.isNaN(d3);
        c0879bM5581r2.m5548q(c0886iM5580q, c0886iM5580q3, c0886iM5580q5, c0886iM5580q7, (float) (dCos * d3));
        m5569d(c0879bM5581r2);
    }

    /* renamed from: c */
    public void m5568c(C0886i c0886i, C0886i c0886i2, int i2, float f2, C0886i c0886i3, C0886i c0886i4, int i3, int i4) {
        C0879b c0879bM5581r = m5581r();
        c0879bM5581r.m5539h(c0886i, c0886i2, i2, f2, c0886i3, c0886i4, i3);
        if (i4 != 8) {
            c0879bM5581r.m5535d(this, i4);
        }
        m5569d(c0879bM5581r);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m5569d(p024c.p044g.p048b.C0879b r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            c.g.b.e r0 = p024c.p044g.p048b.C0881d.f5822g
            r1 = 0
            if (r0 != 0) goto L95
            int r0 = r6.f5836u
            r2 = 1
            int r0 = r0 + r2
            int r3 = r6.f5837v
            if (r0 >= r3) goto L17
            int r0 = r6.f5835t
            int r0 = r0 + r2
            int r3 = r6.f5830o
            if (r0 < r3) goto L1a
        L17:
            r6.m5564y()
        L1a:
            r0 = 0
            boolean r3 = r7.f5811f
            if (r3 != 0) goto L8f
            r7.m5531D(r6)
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L29
            return
        L29:
            r7.m5549r()
            boolean r3 = r7.m5537f(r6)
            if (r3 == 0) goto L86
            c.g.b.i r3 = r6.m5579p()
            r7.f5806a = r3
            int r4 = r6.f5836u
            r6.m5559l(r7)
            int r5 = r6.f5836u
            int r4 = r4 + r2
            if (r5 != r4) goto L86
            c.g.b.d$a r0 = r6.f5841z
            r0.mo5534c(r7)
            c.g.b.d$a r0 = r6.f5841z
            r6.m5556B(r0, r2)
            int r0 = r3.f5859e
            r4 = -1
            if (r0 != r4) goto L87
            c.g.b.i r0 = r7.f5806a
            if (r0 != r3) goto L64
            c.g.b.i r0 = r7.m5552v(r3)
            if (r0 == 0) goto L64
            c.g.b.e r3 = p024c.p044g.p048b.C0881d.f5822g
            if (r3 != 0) goto L63
            r7.m5553x(r0)
            goto L64
        L63:
            throw r1
        L64:
            boolean r0 = r7.f5811f
            if (r0 != 0) goto L6d
            c.g.b.i r0 = r7.f5806a
            r0.m5604g(r6, r7)
        L6d:
            boolean r0 = p024c.p044g.p048b.C0881d.f5820e
            if (r0 == 0) goto L79
            c.g.b.c r0 = r6.f5838w
            c.g.b.f<c.g.b.b> r0 = r0.f5812a
            r0.mo5586a(r7)
            goto L80
        L79:
            c.g.b.c r0 = r6.f5838w
            c.g.b.f<c.g.b.b> r0 = r0.f5813b
            r0.mo5586a(r7)
        L80:
            int r0 = r6.f5836u
            int r0 = r0 - r2
            r6.f5836u = r0
            goto L87
        L86:
            r2 = 0
        L87:
            boolean r0 = r7.m5550s()
            if (r0 != 0) goto L8e
            return
        L8e:
            r0 = r2
        L8f:
            if (r0 != 0) goto L94
            r6.m5559l(r7)
        L94:
            return
        L95:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.C0881d.m5569d(c.g.b.b):void");
    }

    /* renamed from: e */
    public C0879b m5570e(C0886i c0886i, C0886i c0886i2, int i2, int i3) {
        if (f5817b && i3 == 8 && c0886i2.f5862h && c0886i.f5859e == -1) {
            c0886i.m5602e(this, c0886i2.f5861g + i2);
            return null;
        }
        C0879b c0879bM5581r = m5581r();
        c0879bM5581r.m5545n(c0886i, c0886i2, i2);
        if (i3 != 8) {
            c0879bM5581r.m5535d(this, i3);
        }
        m5569d(c0879bM5581r);
        return c0879bM5581r;
    }

    /* renamed from: f */
    public void m5571f(C0886i c0886i, int i2) {
        if (f5817b && c0886i.f5859e == -1) {
            float f2 = i2;
            c0886i.m5602e(this, f2);
            for (int i3 = 0; i3 < this.f5826k + 1; i3++) {
                C0886i c0886i2 = this.f5838w.f5815d[i3];
                if (c0886i2 != null && c0886i2.f5869o && c0886i2.f5870p == c0886i.f5858d) {
                    c0886i2.m5602e(this, c0886i2.f5871q + f2);
                }
            }
            return;
        }
        int i4 = c0886i.f5859e;
        if (i4 == -1) {
            C0879b c0879bM5581r = m5581r();
            c0879bM5581r.m5540i(c0886i, i2);
            m5569d(c0879bM5581r);
            return;
        }
        C0879b c0879b = this.f5831p[i4];
        if (c0879b.f5811f) {
            c0879b.f5807b = i2;
            return;
        }
        if (c0879b.f5810e.mo5515a() == 0) {
            c0879b.f5811f = true;
            c0879b.f5807b = i2;
        } else {
            C0879b c0879bM5581r2 = m5581r();
            c0879bM5581r2.m5544m(c0886i, i2);
            m5569d(c0879bM5581r2);
        }
    }

    /* renamed from: g */
    public void m5572g(C0886i c0886i, C0886i c0886i2, int i2, boolean z) {
        C0879b c0879bM5581r = m5581r();
        C0886i c0886iM5582t = m5582t();
        c0886iM5582t.f5860f = 0;
        c0879bM5581r.m5546o(c0886i, c0886i2, c0886iM5582t, i2);
        m5569d(c0879bM5581r);
    }

    /* renamed from: h */
    public void m5573h(C0886i c0886i, C0886i c0886i2, int i2, int i3) {
        C0879b c0879bM5581r = m5581r();
        C0886i c0886iM5582t = m5582t();
        c0886iM5582t.f5860f = 0;
        c0879bM5581r.m5546o(c0886i, c0886i2, c0886iM5582t, i2);
        if (i3 != 8) {
            m5577m(c0879bM5581r, (int) (c0879bM5581r.f5810e.mo5520f(c0886iM5582t) * (-1.0f)), i3);
        }
        m5569d(c0879bM5581r);
    }

    /* renamed from: i */
    public void m5574i(C0886i c0886i, C0886i c0886i2, int i2, boolean z) {
        C0879b c0879bM5581r = m5581r();
        C0886i c0886iM5582t = m5582t();
        c0886iM5582t.f5860f = 0;
        c0879bM5581r.m5547p(c0886i, c0886i2, c0886iM5582t, i2);
        m5569d(c0879bM5581r);
    }

    /* renamed from: j */
    public void m5575j(C0886i c0886i, C0886i c0886i2, int i2, int i3) {
        C0879b c0879bM5581r = m5581r();
        C0886i c0886iM5582t = m5582t();
        c0886iM5582t.f5860f = 0;
        c0879bM5581r.m5547p(c0886i, c0886i2, c0886iM5582t, i2);
        if (i3 != 8) {
            m5577m(c0879bM5581r, (int) (c0879bM5581r.f5810e.mo5520f(c0886iM5582t) * (-1.0f)), i3);
        }
        m5569d(c0879bM5581r);
    }

    /* renamed from: k */
    public void m5576k(C0886i c0886i, C0886i c0886i2, C0886i c0886i3, C0886i c0886i4, float f2, int i2) {
        C0879b c0879bM5581r = m5581r();
        c0879bM5581r.m5542k(c0886i, c0886i2, c0886i3, c0886i4, f2);
        if (i2 != 8) {
            c0879bM5581r.m5535d(this, i2);
        }
        m5569d(c0879bM5581r);
    }

    /* renamed from: m */
    void m5577m(C0879b c0879b, int i2, int i3) {
        c0879b.m5536e(m5578o(i3, null), i2);
    }

    /* renamed from: o */
    public C0886i m5578o(int i2, String str) {
        if (f5822g != null) {
            throw null;
        }
        if (this.f5835t + 1 >= this.f5830o) {
            m5564y();
        }
        C0886i c0886iM5558a = m5558a(C0886i.a.ERROR, str);
        int i3 = this.f5826k + 1;
        this.f5826k = i3;
        this.f5835t++;
        c0886iM5558a.f5858d = i3;
        c0886iM5558a.f5860f = i2;
        this.f5838w.f5815d[i3] = c0886iM5558a;
        this.f5828m.mo5532a(c0886iM5558a);
        return c0886iM5558a;
    }

    /* renamed from: p */
    public C0886i m5579p() {
        if (f5822g != null) {
            throw null;
        }
        if (this.f5835t + 1 >= this.f5830o) {
            m5564y();
        }
        C0886i c0886iM5558a = m5558a(C0886i.a.SLACK, null);
        int i2 = this.f5826k + 1;
        this.f5826k = i2;
        this.f5835t++;
        c0886iM5558a.f5858d = i2;
        this.f5838w.f5815d[i2] = c0886iM5558a;
        return c0886iM5558a;
    }

    /* renamed from: q */
    public C0886i m5580q(Object obj) {
        C0886i c0886iM5637h = null;
        if (obj == null) {
            return null;
        }
        if (this.f5835t + 1 >= this.f5830o) {
            m5564y();
        }
        if (obj instanceof C0891d) {
            C0891d c0891d = (C0891d) obj;
            c0886iM5637h = c0891d.m5637h();
            if (c0886iM5637h == null) {
                c0891d.m5647r(this.f5838w);
                c0886iM5637h = c0891d.m5637h();
            }
            int i2 = c0886iM5637h.f5858d;
            if (i2 == -1 || i2 > this.f5826k || this.f5838w.f5815d[i2] == null) {
                if (i2 != -1) {
                    c0886iM5637h.m5601d();
                }
                int i3 = this.f5826k + 1;
                this.f5826k = i3;
                this.f5835t++;
                c0886iM5637h.f5858d = i3;
                c0886iM5637h.f5865k = C0886i.a.UNRESTRICTED;
                this.f5838w.f5815d[i3] = c0886iM5637h;
            }
        }
        return c0886iM5637h;
    }

    /* renamed from: r */
    public C0879b m5581r() {
        C0879b c0879bMo5587b;
        if (f5820e) {
            c0879bMo5587b = this.f5838w.f5812a.mo5587b();
            if (c0879bMo5587b == null) {
                c0879bMo5587b = new b(this.f5838w);
                f5824i++;
            } else {
                c0879bMo5587b.m5554y();
            }
        } else {
            c0879bMo5587b = this.f5838w.f5813b.mo5587b();
            if (c0879bMo5587b == null) {
                c0879bMo5587b = new C0879b(this.f5838w);
                f5823h++;
            } else {
                c0879bMo5587b.m5554y();
            }
        }
        C0886i.m5598b();
        return c0879bMo5587b;
    }

    /* renamed from: t */
    public C0886i m5582t() {
        if (f5822g != null) {
            throw null;
        }
        if (this.f5835t + 1 >= this.f5830o) {
            m5564y();
        }
        C0886i c0886iM5558a = m5558a(C0886i.a.SLACK, null);
        int i2 = this.f5826k + 1;
        this.f5826k = i2;
        this.f5835t++;
        c0886iM5558a.f5858d = i2;
        this.f5838w.f5815d[i2] = c0886iM5558a;
        return c0886iM5558a;
    }

    /* renamed from: v */
    public C0880c m5583v() {
        return this.f5838w;
    }

    /* renamed from: x */
    public int m5584x(Object obj) {
        C0886i c0886iM5637h = ((C0891d) obj).m5637h();
        if (c0886iM5637h != null) {
            return (int) (c0886iM5637h.f5861g + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void m5585z() throws Exception {
        if (f5822g != null) {
            throw null;
        }
        if (this.f5828m.isEmpty()) {
            m5560n();
            return;
        }
        if (!this.f5832q && !this.f5833r) {
            m5565A(this.f5828m);
            return;
        }
        if (f5822g != null) {
            throw null;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f5836u) {
                z = true;
                break;
            } else if (!this.f5831p[i2].f5811f) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            m5565A(this.f5828m);
        } else {
            if (f5822g != null) {
                throw null;
            }
            m5560n();
        }
    }
}
