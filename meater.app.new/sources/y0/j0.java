package y0;

import A0.InterfaceC0828g;
import kotlin.AbstractC1564q;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1516O;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u000e\u001a3\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb0/i;", "modifier", "Lkotlin/Function2;", "Ly0/l0;", "LU0/b;", "Ly0/J;", "measurePolicy", "Loa/F;", "a", "(Lb0/i;LBa/p;LO/l;II)V", "Ly0/k0;", "state", "b", "(Ly0/k0;Lb0/i;LBa/p;LO/l;II)V", "y0/j0$a", "Ly0/j0$a;", "ReusedSlotId", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f53053a = new a();

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"y0/j0$a", "", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f53054B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p<l0, U0.b, J> f53055C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f53056D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f53057E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0.i iVar, Ba.p<? super l0, ? super U0.b, ? extends J> pVar, int i10, int i11) {
            super(2);
            this.f53054B = iVar;
            this.f53055C = pVar;
            this.f53056D = i10;
            this.f53057E = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            j0.a(this.f53054B, this.f53055C, interfaceC1554l, C1509K0.a(this.f53056D | 1), this.f53057E);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ k0 f53058B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k0 k0Var) {
            super(0);
            this.f53058B = k0Var;
        }

        public final void a() {
            this.f53058B.d();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ k0 f53059B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f53060C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.p<l0, U0.b, J> f53061D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f53062E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f53063F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(k0 k0Var, b0.i iVar, Ba.p<? super l0, ? super U0.b, ? extends J> pVar, int i10, int i11) {
            super(2);
            this.f53059B = k0Var;
            this.f53060C = iVar;
            this.f53061D = pVar;
            this.f53062E = i10;
            this.f53063F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            j0.b(this.f53059B, this.f53060C, this.f53061D, interfaceC1554l, C1509K0.a(this.f53062E | 1), this.f53063F);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(b0.i iVar, Ba.p<? super l0, ? super U0.b, ? extends J> pVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (C1560o.J()) {
                C1560o.S(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            Object objF = interfaceC1554lR.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new k0();
                interfaceC1554lR.J(objF);
            }
            b((k0) objF, iVar, pVar, interfaceC1554lR, (i12 << 3) & 1008, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(iVar, pVar, i10, i11));
        }
    }

    public static final void b(k0 k0Var, b0.i iVar, Ba.p<? super l0, ? super U0.b, ? extends J> pVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.l(k0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.R(iVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (C1560o.J()) {
                C1560o.S(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int iA = C1550j.a(interfaceC1554lR, 0);
            AbstractC1564q abstractC1564qD = C1550j.d(interfaceC1554lR, 0);
            b0.i iVarE = b0.h.e(interfaceC1554lR, iVar);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            Ba.a<A0.G> aVarA = A0.G.INSTANCE.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA, k0Var, k0Var.g());
            C1.b(interfaceC1554lA, abstractC1564qD, k0Var.e());
            C1.b(interfaceC1554lA, pVar, k0Var.f());
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            C1.b(interfaceC1554lA, iVarE, companion.d());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            interfaceC1554lR.P();
            if (interfaceC1554lR.u()) {
                interfaceC1554lR.S(-26502501);
                interfaceC1554lR.I();
            } else {
                interfaceC1554lR.S(-26580342);
                boolean zL = interfaceC1554lR.l(k0Var);
                Object objF = interfaceC1554lR.f();
                if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new c(k0Var);
                    interfaceC1554lR.J(objF);
                }
                C1516O.g((Ba.a) objF, interfaceC1554lR, 0);
                interfaceC1554lR.I();
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        b0.i iVar2 = iVar;
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new d(k0Var, iVar2, pVar, i10, i11));
        }
    }
}
