package P2;

import S2.r;
import U1.s;
import U1.y;
import X1.C1804a;
import X1.L;
import X1.y;
import Y1.b;
import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import v2.B;
import v2.C4797c;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.N;
import v2.O;
import v2.P;

/* compiled from: Mp4Extractor.java */
/* loaded from: classes.dex */
public final class m implements InterfaceC4810p, J {

    /* renamed from: G, reason: collision with root package name */
    @Deprecated
    public static final v2.u f13821G = new v2.u() { // from class: P2.l
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return m.y();
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private a[] f13822A;

    /* renamed from: B, reason: collision with root package name */
    private long[][] f13823B;

    /* renamed from: C, reason: collision with root package name */
    private int f13824C;

    /* renamed from: D, reason: collision with root package name */
    private long f13825D;

    /* renamed from: E, reason: collision with root package name */
    private int f13826E;

    /* renamed from: F, reason: collision with root package name */
    private K2.a f13827F;

    /* renamed from: a, reason: collision with root package name */
    private final r.a f13828a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13829b;

    /* renamed from: c, reason: collision with root package name */
    private final y f13830c;

    /* renamed from: d, reason: collision with root package name */
    private final y f13831d;

    /* renamed from: e, reason: collision with root package name */
    private final y f13832e;

    /* renamed from: f, reason: collision with root package name */
    private final y f13833f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<b.C0281b> f13834g;

    /* renamed from: h, reason: collision with root package name */
    private final p f13835h;

    /* renamed from: i, reason: collision with root package name */
    private final List<y.b> f13836i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC4009y<N> f13837j;

    /* renamed from: k, reason: collision with root package name */
    private int f13838k;

    /* renamed from: l, reason: collision with root package name */
    private int f13839l;

    /* renamed from: m, reason: collision with root package name */
    private long f13840m;

    /* renamed from: n, reason: collision with root package name */
    private int f13841n;

    /* renamed from: o, reason: collision with root package name */
    private X1.y f13842o;

    /* renamed from: p, reason: collision with root package name */
    private int f13843p;

    /* renamed from: q, reason: collision with root package name */
    private int f13844q;

    /* renamed from: r, reason: collision with root package name */
    private int f13845r;

    /* renamed from: s, reason: collision with root package name */
    private int f13846s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13847t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13848u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13849v;

    /* renamed from: w, reason: collision with root package name */
    private long f13850w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13851x;

    /* renamed from: y, reason: collision with root package name */
    private long f13852y;

    /* renamed from: z, reason: collision with root package name */
    private v2.r f13853z;

    /* compiled from: Mp4Extractor.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s f13854a;

        /* renamed from: b, reason: collision with root package name */
        public final v f13855b;

        /* renamed from: c, reason: collision with root package name */
        public final O f13856c;

        /* renamed from: d, reason: collision with root package name */
        public final P f13857d;

        /* renamed from: e, reason: collision with root package name */
        public int f13858e;

        public a(s sVar, v vVar, O o10) {
            this.f13854a = sVar;
            this.f13855b = vVar;
            this.f13856c = o10;
            this.f13857d = "audio/true-hd".equals(sVar.f13879g.f17162o) ? new P() : null;
        }
    }

    @Deprecated
    public m() {
        this(r.a.f15292a, 16);
    }

    private void A(U1.y yVar) {
        Y1.a aVarA = j.a(yVar, "editable.tracks.samples.location");
        if (aVarA == null || aVarA.f19213C[0] != 0) {
            return;
        }
        this.f13852y = this.f13850w + 16;
    }

    private void B(InterfaceC4811q interfaceC4811q) {
        this.f13832e.S(8);
        interfaceC4811q.p(this.f13832e.e(), 0, 8);
        b.e(this.f13832e);
        interfaceC4811q.n(this.f13832e.f());
        interfaceC4811q.m();
    }

    private void C(long j10) {
        while (!this.f13834g.isEmpty() && this.f13834g.peek().f19217b == j10) {
            b.C0281b c0281bPop = this.f13834g.pop();
            if (c0281bPop.f19216a == 1836019574) {
                F(c0281bPop);
                this.f13834g.clear();
                if (!this.f13849v) {
                    this.f13838k = 2;
                }
            } else if (!this.f13834g.isEmpty()) {
                this.f13834g.peek().b(c0281bPop);
            }
        }
        if (this.f13838k != 2) {
            r();
        }
    }

    private void D() {
        if (this.f13826E != 2 || (this.f13829b & 2) == 0) {
            return;
        }
        this.f13853z.a(0, 4).f(new s.b().l0(this.f13827F == null ? null : new U1.y(this.f13827F)).M());
        this.f13853z.n();
        this.f13853z.f(new J.b(-9223372036854775807L));
    }

    private static int E(X1.y yVar) {
        yVar.W(8);
        int iP = p(yVar.q());
        if (iP != 0) {
            return iP;
        }
        yVar.X(4);
        while (yVar.a() > 0) {
            int iP2 = p(yVar.q());
            if (iP2 != 0) {
                return iP2;
            }
        }
        return 0;
    }

    private void F(b.C0281b c0281b) {
        List<Integer> list;
        U1.y yVar;
        U1.y yVar2;
        U1.y yVar3;
        List<v> list2;
        int i10;
        ArrayList arrayList;
        U1.y yVar4;
        U1.y yVar5;
        ArrayList arrayList2;
        int i11;
        int i12;
        b.C0281b c0281bD = c0281b.d(1835365473);
        List<Integer> arrayList3 = new ArrayList<>();
        if (c0281bD != null) {
            U1.y yVarQ = b.q(c0281bD);
            if (this.f13851x) {
                C1804a.i(yVarQ);
                A(yVarQ);
                arrayList3 = s(yVarQ);
            } else if (N(yVarQ)) {
                this.f13849v = true;
                return;
            }
            yVar = yVarQ;
            list = arrayList3;
        } else {
            list = arrayList3;
            yVar = null;
        }
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = this.f13826E == 1;
        B b10 = new B();
        b.c cVarE = c0281b.e(1969517665);
        if (cVarE != null) {
            U1.y yVarE = b.E(cVarE);
            b10.c(yVarE);
            yVar2 = yVarE;
        } else {
            yVar2 = null;
        }
        U1.y yVar6 = new U1.y(b.s(((b.c) C1804a.e(c0281b.e(1836476516))).f19220b));
        U1.y yVar7 = yVar2;
        List<v> listD = b.D(c0281b, b10, -9223372036854775807L, null, (this.f13829b & 1) != 0, z10, new InterfaceC3914g() { // from class: P2.k
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return m.x((s) obj);
            }
        });
        if (this.f13851x) {
            C1804a.h(list.size() == listD.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of editable video tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listD.size())));
        }
        int i13 = 0;
        int i14 = 0;
        int size = -1;
        long j10 = -9223372036854775807L;
        while (i14 < listD.size()) {
            v vVar = listD.get(i14);
            if (vVar.f13909b == 0) {
                list2 = listD;
                i10 = i13;
                yVar5 = yVar6;
                yVar3 = yVar;
                arrayList2 = arrayList4;
                i11 = 1;
            } else {
                s sVar = vVar.f13908a;
                U1.y yVar8 = yVar6;
                yVar3 = yVar;
                long j11 = sVar.f13877e;
                if (j11 == -9223372036854775807L) {
                    j11 = vVar.f13915h;
                }
                long jMax = Math.max(j10, j11);
                list2 = listD;
                i10 = i13 + 1;
                a aVar = new a(sVar, vVar, this.f13853z.a(i13, sVar.f13874b));
                int i15 = "audio/true-hd".equals(sVar.f13879g.f17162o) ? vVar.f13912e * 16 : vVar.f13912e + 30;
                s.b bVarB = sVar.f13879g.b();
                bVarB.j0(i15);
                if (sVar.f13874b == 2) {
                    U1.s sVar2 = sVar.f13879g;
                    int i16 = sVar2.f17153f;
                    arrayList = arrayList4;
                    if ((this.f13829b & 8) != 0) {
                        i16 |= size == -1 ? 1 : 2;
                    }
                    if (sVar2.f17171x == -1.0f && j11 > 0 && (i12 = vVar.f13909b) > 0) {
                        bVarB.a0(i12 / (j11 / 1000000.0f));
                    }
                    if (this.f13851x) {
                        i16 |= 32768;
                        bVarB.O(list.get(i14).intValue());
                    }
                    bVarB.q0(i16);
                } else {
                    arrayList = arrayList4;
                }
                j.l(sVar.f13874b, b10, bVarB);
                int i17 = sVar.f13874b;
                if (this.f13836i.isEmpty()) {
                    yVar5 = yVar8;
                    yVar4 = null;
                } else {
                    yVar4 = new U1.y(this.f13836i);
                    yVar5 = yVar8;
                }
                j.m(i17, yVar3, bVarB, yVar4, yVar7, yVar5);
                aVar.f13856c.f(bVarB.M());
                if (sVar.f13874b == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList2 = arrayList;
                arrayList2.add(aVar);
                j10 = jMax;
                i11 = 1;
            }
            i14 += i11;
            yVar = yVar3;
            arrayList4 = arrayList2;
            yVar6 = yVar5;
            listD = list2;
            i13 = i10;
        }
        this.f13824C = size;
        this.f13825D = j10;
        a[] aVarArr = (a[]) arrayList4.toArray(new a[0]);
        this.f13822A = aVarArr;
        this.f13823B = q(aVarArr);
        this.f13853z.n();
        this.f13853z.f(this);
    }

    private void G(long j10) {
        if (this.f13839l == 1836086884) {
            int i10 = this.f13841n;
            this.f13827F = new K2.a(0L, j10, -9223372036854775807L, j10 + i10, this.f13840m - i10);
        }
    }

    private boolean H(InterfaceC4811q interfaceC4811q) throws ParserException {
        b.C0281b c0281bPeek;
        if (this.f13841n == 0) {
            if (!interfaceC4811q.f(this.f13833f.e(), 0, 8, true)) {
                D();
                return false;
            }
            this.f13841n = 8;
            this.f13833f.W(0);
            this.f13840m = this.f13833f.J();
            this.f13839l = this.f13833f.q();
        }
        long j10 = this.f13840m;
        if (j10 == 1) {
            interfaceC4811q.readFully(this.f13833f.e(), 8, 8);
            this.f13841n += 8;
            this.f13840m = this.f13833f.O();
        } else if (j10 == 0) {
            long jA = interfaceC4811q.a();
            if (jA == -1 && (c0281bPeek = this.f13834g.peek()) != null) {
                jA = c0281bPeek.f19217b;
            }
            if (jA != -1) {
                this.f13840m = (jA - interfaceC4811q.getPosition()) + this.f13841n;
            }
        }
        if (this.f13840m < this.f13841n) {
            throw ParserException.d("Atom size less than header length (unsupported).");
        }
        if (L(this.f13839l)) {
            long position = interfaceC4811q.getPosition();
            long j11 = this.f13840m;
            int i10 = this.f13841n;
            long j12 = (position + j11) - i10;
            if (j11 != i10 && this.f13839l == 1835365473) {
                B(interfaceC4811q);
            }
            this.f13834g.push(new b.C0281b(this.f13839l, j12));
            if (this.f13840m == this.f13841n) {
                C(j12);
            } else {
                r();
            }
        } else if (M(this.f13839l)) {
            C1804a.g(this.f13841n == 8);
            C1804a.g(this.f13840m <= 2147483647L);
            X1.y yVar = new X1.y((int) this.f13840m);
            System.arraycopy(this.f13833f.e(), 0, yVar.e(), 0, 8);
            this.f13842o = yVar;
            this.f13838k = 1;
        } else {
            G(interfaceC4811q.getPosition() - this.f13841n);
            this.f13842o = null;
            this.f13838k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean I(v2.InterfaceC4811q r10, v2.I r11) {
        /*
            r9 = this;
            long r0 = r9.f13840m
            int r2 = r9.f13841n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            X1.y r4 = r9.f13842o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.e()
            int r8 = r9.f13841n
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f13839l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.f13848u = r5
            int r10 = E(r4)
            r9.f13826E = r10
            goto L5e
        L2b:
            java.util.ArrayDeque<Y1.b$b> r10 = r9.f13834g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque<Y1.b$b> r10 = r9.f13834g
            java.lang.Object r10 = r10.peek()
            Y1.b$b r10 = (Y1.b.C0281b) r10
            Y1.b$c r0 = new Y1.b$c
            int r1 = r9.f13839l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L5e
        L46:
            boolean r4 = r9.f13848u
            if (r4 != 0) goto L53
            int r4 = r9.f13839l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.f13826E = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.n(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f51048a = r7
            r10 = r5
        L68:
            r9.C(r2)
            boolean r0 = r9.f13849v
            if (r0 == 0) goto L78
            r9.f13851x = r5
            long r0 = r9.f13850w
            r11.f51048a = r0
            r9.f13849v = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.f13838k
            r11 = 2
            if (r10 == r11) goto L80
            goto L81
        L80:
            r5 = r6
        L81:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.m.I(v2.q, v2.I):boolean");
    }

    private int J(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        int i11;
        I i12;
        boolean z10;
        long position = interfaceC4811q.getPosition();
        if (this.f13843p == -1) {
            int iW = w(position);
            this.f13843p = iW;
            if (iW == -1) {
                return -1;
            }
        }
        a aVar = this.f13822A[this.f13843p];
        O o10 = aVar.f13856c;
        int i13 = aVar.f13858e;
        v vVar = aVar.f13855b;
        long j10 = vVar.f13910c[i13] + this.f13852y;
        int i14 = vVar.f13911d[i13];
        P p10 = aVar.f13857d;
        long j11 = (j10 - position) + this.f13844q;
        if (j11 < 0) {
            i11 = 1;
            i12 = i10;
        } else {
            if (j11 < 262144) {
                if (aVar.f13854a.f13880h == 1) {
                    j11 += 8;
                    i14 -= 8;
                }
                interfaceC4811q.n((int) j11);
                if (!Objects.equals(aVar.f13854a.f13879g.f17162o, "video/avc")) {
                    this.f13847t = true;
                }
                s sVar = aVar.f13854a;
                if (sVar.f13883k == 0) {
                    if ("audio/ac4".equals(sVar.f13879g.f17162o)) {
                        if (this.f13845r == 0) {
                            C4797c.a(i14, this.f13832e);
                            o10.d(this.f13832e, 7);
                            this.f13845r += 7;
                        }
                        i14 += 7;
                    } else if (p10 != null) {
                        p10.d(interfaceC4811q);
                    }
                    while (true) {
                        int i15 = this.f13845r;
                        if (i15 >= i14) {
                            break;
                        }
                        int iC = o10.c(interfaceC4811q, i14 - i15, false);
                        this.f13844q += iC;
                        this.f13845r += iC;
                        this.f13846s -= iC;
                    }
                } else {
                    byte[] bArrE = this.f13831d.e();
                    bArrE[0] = 0;
                    bArrE[1] = 0;
                    bArrE[2] = 0;
                    int i16 = aVar.f13854a.f13883k;
                    int i17 = i16 + 1;
                    int i18 = 4;
                    int i19 = 4 - i16;
                    while (this.f13845r < i14) {
                        int i20 = this.f13846s;
                        if (i20 == 0) {
                            interfaceC4811q.readFully(bArrE, i19, i17);
                            this.f13844q += i17;
                            this.f13831d.W(0);
                            int iQ = this.f13831d.q();
                            if (iQ < 1) {
                                throw ParserException.a("Invalid NAL length", null);
                            }
                            this.f13846s = iQ - 1;
                            this.f13830c.W(0);
                            o10.d(this.f13830c, i18);
                            o10.d(this.f13831d, 1);
                            this.f13845r += 5;
                            i14 += i19;
                            if (!this.f13847t && Y1.e.k(bArrE[i18])) {
                                this.f13847t = true;
                            }
                        } else {
                            int iC2 = o10.c(interfaceC4811q, i20, false);
                            this.f13844q += iC2;
                            this.f13845r += iC2;
                            this.f13846s -= iC2;
                            i18 = 4;
                        }
                    }
                }
                int i21 = i14;
                v vVar2 = aVar.f13855b;
                long j12 = vVar2.f13913f[i13];
                int i22 = vVar2.f13914g[i13];
                if (!this.f13847t) {
                    i22 |= 67108864;
                }
                if (p10 != null) {
                    z10 = true;
                    p10.c(o10, j12, i22, i21, 0, null);
                    if (i13 + 1 == aVar.f13855b.f13909b) {
                        p10.a(o10, null);
                    }
                } else {
                    z10 = true;
                    o10.e(j12, i22, i21, 0, null);
                }
                aVar.f13858e++;
                this.f13843p = -1;
                this.f13844q = 0;
                this.f13845r = 0;
                this.f13846s = 0;
                this.f13847t = (this.f13829b & 32) == 0 ? z10 : false;
                return 0;
            }
            i12 = i10;
            i11 = 1;
        }
        i12.f51048a = j10;
        return i11;
    }

    private int K(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        int iC = this.f13835h.c(interfaceC4811q, i10, this.f13836i);
        if (iC == 1 && i10.f51048a == 0) {
            r();
        }
        return iC;
    }

    private static boolean L(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1701082724;
    }

    private static boolean M(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean N(U1.y yVar) {
        Y1.a aVarA;
        if (yVar != null && (this.f13829b & 64) != 0 && (aVarA = j.a(yVar, "editable.tracks.offset")) != null) {
            long jO = new X1.y(aVarA.f19213C).O();
            if (jO > 0) {
                this.f13850w = jO;
                return true;
            }
        }
        return false;
    }

    private void O(a aVar, long j10) {
        v vVar = aVar.f13855b;
        int iA = vVar.a(j10);
        if (iA == -1) {
            iA = vVar.b(j10);
        }
        aVar.f13858e = iA;
    }

    private static int p(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] q(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f13855b.f13909b];
            jArr2[i10] = aVarArr[i10].f13855b.f13913f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            v vVar = aVarArr[i12].f13855b;
            j10 += vVar.f13911d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = vVar.f13913f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void r() {
        this.f13838k = 0;
        this.f13841n = 0;
    }

    private List<Integer> s(U1.y yVar) {
        List<Integer> listA = ((Y1.a) C1804a.i(j.a(yVar, "editable.tracks.map"))).a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (int i10 = 0; i10 < listA.size(); i10++) {
            int iIntValue = listA.get(i10).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int v(v vVar, long j10) {
        int iA = vVar.a(j10);
        return iA == -1 ? vVar.b(j10) : iA;
    }

    private int w(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f13822A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f13858e;
            v vVar = aVar.f13855b;
            if (i13 != vVar.f13909b) {
                long j14 = vVar.f13910c[i13];
                long j15 = ((long[][]) L.i(this.f13823B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] y() {
        return new InterfaceC4810p[]{new m(r.a.f15292a, 16)};
    }

    private static long z(v vVar, long j10, long j11) {
        int iV = v(vVar, j10);
        return iV == -1 ? j11 : Math.min(vVar.f13910c[iV], j11);
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f13834g.clear();
        this.f13841n = 0;
        this.f13843p = -1;
        this.f13844q = 0;
        this.f13845r = 0;
        this.f13846s = 0;
        this.f13847t = (this.f13829b & 32) == 0;
        if (j10 == 0) {
            if (this.f13838k != 3) {
                r();
                return;
            } else {
                this.f13835h.g();
                this.f13836i.clear();
                return;
            }
        }
        for (a aVar : this.f13822A) {
            O(aVar, j11);
            P p10 = aVar.f13857d;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        N nD = r.d(interfaceC4811q, (this.f13829b & 2) != 0);
        this.f13837j = nD != null ? AbstractC4009y.H(nD) : AbstractC4009y.G();
        return nD == null;
    }

    @Override // v2.J
    public boolean g() {
        return true;
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        if ((this.f13829b & 16) == 0) {
            rVar = new S2.s(rVar, this.f13828a);
        }
        this.f13853z = rVar;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        while (true) {
            int i11 = this.f13838k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return J(interfaceC4811q, i10);
                    }
                    if (i11 == 3) {
                        return K(interfaceC4811q, i10);
                    }
                    throw new IllegalStateException();
                }
                if (I(interfaceC4811q, i10)) {
                    return 1;
                }
            } else if (!H(interfaceC4811q)) {
                return -1;
            }
        }
    }

    @Override // v2.J
    public J.a k(long j10) {
        return t(j10, -1);
    }

    @Override // v2.J
    public long m() {
        return this.f13825D;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v2.J.a t(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            P2.m$a[] r4 = r0.f13822A
            int r5 = r4.length
            if (r5 != 0) goto L13
            v2.J$a r1 = new v2.J$a
            v2.K r2 = v2.K.f51053c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f13824C
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            P2.v r4 = r4.f13855b
            int r6 = v(r4, r1)
            if (r6 != r5) goto L35
            v2.J$a r1 = new v2.J$a
            v2.K r2 = v2.K.f51053c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f13913f
            r12 = r11[r6]
            long[] r11 = r4.f13910c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f13909b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f13913f
            r9 = r2[r1]
            long[] r2 = r4.f13910c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            P2.m$a[] r4 = r0.f13822A
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f13824C
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            P2.v r4 = r4.f13855b
            long r5 = z(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = z(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            v2.K r3 = new v2.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            v2.J$a r1 = new v2.J$a
            r1.<init>(r3)
            return r1
        L8f:
            v2.K r4 = new v2.K
            r4.<init>(r9, r1)
            v2.J$a r1 = new v2.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.m.t(long, int):v2.J$a");
    }

    @Override // v2.InterfaceC4810p
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC4009y<N> j() {
        return this.f13837j;
    }

    public m(r.a aVar, int i10) {
        this.f13828a = aVar;
        this.f13829b = i10;
        this.f13837j = AbstractC4009y.G();
        this.f13838k = (i10 & 4) != 0 ? 3 : 0;
        this.f13835h = new p();
        this.f13836i = new ArrayList();
        this.f13833f = new X1.y(16);
        this.f13834g = new ArrayDeque<>();
        this.f13830c = new X1.y(Y1.e.f19226a);
        this.f13831d = new X1.y(5);
        this.f13832e = new X1.y();
        this.f13843p = -1;
        this.f13853z = v2.r.f51223A;
        this.f13822A = new a[0];
        this.f13847t = (i10 & 32) == 0;
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s x(s sVar) {
        return sVar;
    }
}
