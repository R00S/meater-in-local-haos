package kotlin;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.InterfaceC0801i;
import A0.InterfaceC0828g;
import Ba.p;
import Ba.q;
import b0.h;
import b0.i;
import i0.c1;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import w.C4959d;
import y0.I;
import z.InterfaceC5162k;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a{\u0010\u0016\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb0/i;", "modifier", "Li0/c1;", "shape", "LK/k;", "colors", "LK/m;", "elevation", "Lw/d;", "border", "Lkotlin/Function1;", "LA/i;", "Loa/F;", "content", "b", "(Lb0/i;Li0/c1;LK/k;LK/m;Lw/d;LBa/q;LO/l;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "Lz/k;", "interactionSource", "a", "(LBa/a;Lb0/i;ZLi0/c1;LK/k;LK/m;Lw/d;Lz/k;LBa/q;LO/l;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293n {

    /* compiled from: Card.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.n$a */
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f8490B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f8490B = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(664103990, i10, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
            }
            q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> qVar = this.f8490B;
            i.Companion companion = i.INSTANCE;
            I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554l, 0);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE = h.e(interfaceC1554l, companion);
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
            C1.b(interfaceC1554lA, iA, companion2.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            qVar.g(C0802j.f149a, interfaceC1554l, 6);
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

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.n$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f8491B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c1 f8492C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1290k f8493D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1292m f8494E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f8495F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f8496G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f8497H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i iVar, c1 c1Var, C1290k c1290k, C1292m c1292m, C4959d c4959d, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11) {
            super(2);
            this.f8491B = iVar;
            this.f8492C = c1Var;
            this.f8493D = c1290k;
            this.f8494E = c1292m;
            this.f8495F = qVar;
            this.f8496G = i10;
            this.f8497H = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1293n.b(this.f8491B, this.f8492C, this.f8493D, this.f8494E, null, this.f8495F, interfaceC1554l, C1509K0.a(this.f8496G | 1), this.f8497H);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Card.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.n$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f8498B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f8498B = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(776921067, i10, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:161)");
            }
            q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> qVar = this.f8498B;
            i.Companion companion = i.INSTANCE;
            I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554l, 0);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE = h.e(interfaceC1554l, companion);
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
            C1.b(interfaceC1554lA, iA, companion2.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            qVar.g(C0802j.f149a, interfaceC1554l, 6);
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

    /* compiled from: Card.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.n$d */
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8499B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f8500C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f8501D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ c1 f8502E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1290k f8503F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C1292m f8504G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f8505H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f8506I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f8507J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f8508K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Ba.a<C4153F> aVar, i iVar, boolean z10, c1 c1Var, C1290k c1290k, C1292m c1292m, C4959d c4959d, InterfaceC5162k interfaceC5162k, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11) {
            super(2);
            this.f8499B = aVar;
            this.f8500C = iVar;
            this.f8501D = z10;
            this.f8502E = c1Var;
            this.f8503F = c1290k;
            this.f8504G = c1292m;
            this.f8505H = interfaceC5162k;
            this.f8506I = qVar;
            this.f8507J = i10;
            this.f8508K = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1293n.a(this.f8499B, this.f8500C, this.f8501D, this.f8502E, this.f8503F, this.f8504G, null, this.f8505H, this.f8506I, interfaceC1554l, C1509K0.a(this.f8507J | 1), this.f8508K);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Ba.a<oa.C4153F> r30, b0.i r31, boolean r32, i0.c1 r33, kotlin.C1290k r34, kotlin.C1292m r35, w.C4959d r36, z.InterfaceC5162k r37, Ba.q<? super A.InterfaceC0801i, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r38, kotlin.InterfaceC1554l r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1293n.a(Ba.a, b0.i, boolean, i0.c1, K.k, K.m, w.d, z.k, Ba.q, O.l, int, int):void");
    }

    public static final void b(i iVar, c1 c1Var, C1290k c1290k, C1292m c1292m, C4959d c4959d, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        i iVar2;
        int i12;
        c1 c1Var2;
        C1290k c1290k2;
        C1292m c1292m2;
        C4959d c4959d2;
        i iVar3;
        c1 c1VarD;
        C1290k c1290kA;
        C1292m c1292mB;
        C4959d c4959d3;
        int i13;
        C1292m c1292m3;
        C1292m c1292m4;
        C4959d c4959d4;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1179621553);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            iVar2 = iVar;
        } else if ((i10 & 6) == 0) {
            iVar2 = iVar;
            i12 = (interfaceC1554lR.R(iVar2) ? 4 : 2) | i10;
        } else {
            iVar2 = iVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                c1Var2 = c1Var;
                int i15 = interfaceC1554lR.R(c1Var2) ? 32 : 16;
                i12 |= i15;
            } else {
                c1Var2 = c1Var;
            }
            i12 |= i15;
        } else {
            c1Var2 = c1Var;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                c1290k2 = c1290k;
                int i16 = interfaceC1554lR.R(c1290k2) ? 256 : 128;
                i12 |= i16;
            } else {
                c1290k2 = c1290k;
            }
            i12 |= i16;
        } else {
            c1290k2 = c1290k;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                c1292m2 = c1292m;
                int i17 = interfaceC1554lR.R(c1292m2) ? 2048 : 1024;
                i12 |= i17;
            } else {
                c1292m2 = c1292m;
            }
            i12 |= i17;
        } else {
            c1292m2 = c1292m;
        }
        int i18 = i11 & 16;
        if (i18 != 0) {
            i12 |= 24576;
            c4959d2 = c4959d;
        } else {
            c4959d2 = c4959d;
            if ((i10 & 24576) == 0) {
                i12 |= interfaceC1554lR.R(c4959d2) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= interfaceC1554lR.l(qVar) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
            iVar3 = iVar2;
            c1VarD = c1Var2;
            c1292m4 = c1292m2;
            c4959d4 = c4959d2;
        } else {
            interfaceC1554lR.q();
            if ((i10 & 1) == 0 || interfaceC1554lR.G()) {
                iVar3 = i14 != 0 ? i.INSTANCE : iVar2;
                if ((i11 & 2) != 0) {
                    c1VarD = C1291l.f8472a.d(interfaceC1554lR, 6);
                    i12 &= -113;
                } else {
                    c1VarD = c1Var2;
                }
                if ((i11 & 4) != 0) {
                    c1290kA = C1291l.f8472a.a(interfaceC1554lR, 6);
                    i12 &= -897;
                } else {
                    c1290kA = c1290k2;
                }
                if ((i11 & 8) != 0) {
                    c1292mB = C1291l.f8472a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC1554lR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    c1292mB = c1292m2;
                }
                c4959d3 = i18 != 0 ? null : c4959d;
                C1292m c1292m5 = c1292mB;
                i13 = i12;
                c1292m3 = c1292m5;
            } else {
                interfaceC1554lR.C();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                iVar3 = iVar2;
                c1VarD = c1Var2;
                c1290kA = c1290k2;
                c4959d3 = c4959d2;
                i13 = i12;
                c1292m3 = c1292m2;
            }
            interfaceC1554lR.Q();
            if (C1560o.J()) {
                C1560o.S(1179621553, i13, -1, "androidx.compose.material3.Card (Card.kt:87)");
            }
            C1292m c1292m6 = c1292m3;
            C1272Y.a(iVar3, c1VarD, c1290kA.a(true), c1290kA.b(true), 0.0f, c1292m3.f(true, null, interfaceC1554lR, ((i13 >> 3) & 896) | 54).getValue().getValue(), c4959d3, W.c.d(664103990, true, new a(qVar), interfaceC1554lR, 54), interfaceC1554lR, (i13 & 14) | 12582912 | (i13 & 112) | (3670016 & (i13 << 6)), 16);
            if (C1560o.J()) {
                C1560o.R();
            }
            c1290k2 = c1290kA;
            c1292m4 = c1292m6;
            c4959d4 = c4959d3;
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(iVar3, c1VarD, c1290k2, c1292m4, c4959d4, qVar, i10, i11));
        }
    }
}
