package kotlin;

import A.C0794b;
import A.N;
import A.U;
import A.W;
import A.X;
import A0.InterfaceC0828g;
import Ba.l;
import Ba.p;
import Ba.q;
import F0.i;
import F0.v;
import F0.x;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import b0.c;
import b0.h;
import b0.i;
import i0.C3602t0;
import i0.c1;
import kotlin.C1;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;
import w.C4959d;
import y0.I;
import z.InterfaceC5162k;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "onClick", "Lb0/i;", "modifier", "", "enabled", "Lz/k;", "interactionSource", "LI/f;", "elevation", "Li0/c1;", "shape", "Lw/d;", "border", "LI/d;", "colors", "LA/N;", "contentPadding", "Lkotlin/Function1;", "LA/W;", "content", "a", "(LBa/a;Lb0/i;ZLz/k;LI/f;Li0/c1;Lw/d;LI/d;LA/N;LBa/q;LO/l;II)V", "c", "Li0/t0;", "contentColor", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.g, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144g {

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.g$a */
    static final class a extends AbstractC3864v implements l<x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6197B = new a();

        a() {
            super(1);
        }

        public final void a(x xVar) {
            v.H(xVar, i.INSTANCE.a());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.g$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<C3602t0> f6198B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ N f6199C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f6200D;

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.g$b$a */
        static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ N f6201B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f6202C;

            /* compiled from: Button.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.g$b$a$a, reason: collision with other inner class name */
            static final class C0120a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ N f6203B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f6204C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0120a(N n10, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
                    super(2);
                    this.f6203B = n10;
                    this.f6204C = qVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(-630330208, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
                    }
                    i.Companion companion = b0.i.INSTANCE;
                    C1142e c1142e = C1142e.f6147a;
                    b0.i iVarH = o.h(r.a(companion, c1142e.e(), c1142e.d()), this.f6203B);
                    C0794b.e eVarB = C0794b.f54a.b();
                    c.InterfaceC0420c interfaceC0420cI = b0.c.INSTANCE.i();
                    q<W, InterfaceC1554l, Integer, C4153F> qVar = this.f6204C;
                    I iB = U.b(eVarB, interfaceC0420cI, interfaceC1554l, 54);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = h.e(interfaceC1554l, iVarH);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    qVar.g(X.f45a, interfaceC1554l, 6);
                    interfaceC1554l.P();
                    if (C1560o.J()) {
                        C1560o.R();
                    }
                }

                @Override // Ba.p
                public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                    a(interfaceC1554l, num.intValue());
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(N n10, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
                super(2);
                this.f6201B = n10;
                this.f6202C = qVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1699085201, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:119)");
                }
                l0.a(C1129P.f5916a.c(interfaceC1554l, 6).getButton(), W.c.d(-630330208, true, new C0120a(this.f6201B, this.f6202C), interfaceC1554l, 54), interfaceC1554l, 48);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(x1<C3602t0> x1Var, N n10, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f6198B = x1Var;
            this.f6199C = n10;
            this.f6200D = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(7524271, i10, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:118)");
            }
            C1576w.a(C1150m.a().d(Float.valueOf(C3602t0.n(C1144g.b(this.f6198B)))), W.c.d(-1699085201, true, new a(this.f6199C, this.f6200D), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.g$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f6205B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f6206C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f6207D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f6208E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC1143f f6209F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ c1 f6210G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ InterfaceC1141d f6211H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ N f6212I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ q<W, InterfaceC1554l, Integer, C4153F> f6213J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f6214K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ int f6215L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Ba.a<C4153F> aVar, b0.i iVar, boolean z10, InterfaceC5162k interfaceC5162k, InterfaceC1143f interfaceC1143f, c1 c1Var, C4959d c4959d, InterfaceC1141d interfaceC1141d, N n10, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11) {
            super(2);
            this.f6205B = aVar;
            this.f6206C = iVar;
            this.f6207D = z10;
            this.f6208E = interfaceC5162k;
            this.f6209F = interfaceC1143f;
            this.f6210G = c1Var;
            this.f6211H = interfaceC1141d;
            this.f6212I = n10;
            this.f6213J = qVar;
            this.f6214K = i10;
            this.f6215L = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1144g.a(this.f6205B, this.f6206C, this.f6207D, this.f6208E, this.f6209F, this.f6210G, null, this.f6211H, this.f6212I, this.f6213J, interfaceC1554l, C1509K0.a(this.f6214K | 1), this.f6215L);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Ba.a<oa.C4153F> r40, b0.i r41, boolean r42, z.InterfaceC5162k r43, kotlin.InterfaceC1143f r44, i0.c1 r45, w.C4959d r46, kotlin.InterfaceC1141d r47, A.N r48, Ba.q<? super A.W, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r49, kotlin.InterfaceC1554l r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1144g.a(Ba.a, b0.i, boolean, z.k, I.f, i0.c1, w.d, I.d, A.N, Ba.q, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(x1<C3602t0> x1Var) {
        return x1Var.getValue().getValue();
    }

    public static final void c(Ba.a<C4153F> aVar, b0.i iVar, boolean z10, InterfaceC5162k interfaceC5162k, InterfaceC1143f interfaceC1143f, c1 c1Var, C4959d c4959d, InterfaceC1141d interfaceC1141d, N n10, q<? super W, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        b0.i iVar2 = (i11 & 2) != 0 ? b0.i.INSTANCE : iVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        InterfaceC5162k interfaceC5162k2 = (i11 & 8) != 0 ? null : interfaceC5162k;
        InterfaceC1143f interfaceC1143f2 = (i11 & 16) != 0 ? null : interfaceC1143f;
        c1 small = (i11 & 32) != 0 ? C1129P.f5916a.b(interfaceC1554l, 6).getSmall() : c1Var;
        C4959d c4959d2 = (i11 & 64) != 0 ? null : c4959d;
        InterfaceC1141d interfaceC1141dG = (i11 & 128) != 0 ? C1142e.f6147a.g(0L, 0L, 0L, interfaceC1554l, 3072, 7) : interfaceC1141d;
        N nF = (i11 & 256) != 0 ? C1142e.f6147a.f() : n10;
        if (C1560o.J()) {
            C1560o.S(288797557, i10, -1, "androidx.compose.material.TextButton (Button.kt:233)");
        }
        a(aVar, iVar2, z11, interfaceC5162k2, interfaceC1143f2, small, c4959d2, interfaceC1141dG, nF, qVar, interfaceC1554l, i10 & 2147483646, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
    }
}
