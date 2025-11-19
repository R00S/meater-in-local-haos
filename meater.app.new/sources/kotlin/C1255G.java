package kotlin;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.I;
import A.InterfaceC0801i;
import A.N;
import A.U;
import A.W;
import A.X;
import A0.InterfaceC0828g;
import Ba.l;
import Ba.p;
import Ba.q;
import U0.h;
import androidx.compose.foundation.layout.r;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.platform.C2038r0;
import b0.i;
import com.apptionlabs.meater_app.model.TemperatureLog;
import i0.C3602t0;
import i0.c1;
import kotlin.C1;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.C4716F;
import kotlin.C4732V;
import kotlin.C4755j;
import kotlin.C4761m;
import kotlin.C4762m0;
import kotlin.C4764n0;
import kotlin.C4768p0;
import kotlin.C4774s0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC1578x;
import kotlin.InterfaceC4718G;
import kotlin.InterfaceC4770q0;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;
import w.C4959d;
import z.InterfaceC5162k;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a|\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001au\u0010%\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\"\u001a\u0010/\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.\"\u0014\u00101\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,\"\u001a\u00105\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b4\u0010.\"\u0014\u00107\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,\"\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020:8\nX\u008a\u0084\u0002"}, d2 = {"Lb0/i;", "modifier", "Lv/V;", "", "expandedState", "LO/p0;", "Landroidx/compose/ui/graphics/f;", "transformOriginState", "Landroidx/compose/foundation/o;", "scrollState", "Li0/c1;", "shape", "Li0/t0;", "containerColor", "LU0/h;", "tonalElevation", "shadowElevation", "Lw/d;", "border", "Lkotlin/Function1;", "LA/i;", "Loa/F;", "content", "a", "(Lb0/i;Lv/V;LO/p0;Landroidx/compose/foundation/o;Li0/c1;JFFLw/d;LBa/q;LO/l;I)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "LK/F;", "colors", "LA/N;", "contentPadding", "Lz/k;", "interactionSource", "d", "(LBa/p;LBa/a;Lb0/i;LBa/p;LBa/p;ZLK/F;LA/N;Lz/k;LO/l;I)V", "LU0/p;", "anchorBounds", "menuBounds", "h", "(LU0/p;LU0/p;)J", "F", "j", "()F", "MenuVerticalMargin", "b", "MenuListItemContainerHeight", "c", "DropdownMenuItemHorizontalPadding", "i", "DropdownMenuVerticalPadding", "e", "DropdownMenuItemDefaultMinWidth", "f", "DropdownMenuItemDefaultMaxWidth", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1255G {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7872a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f7873b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f7874c = h.u(12);

    /* renamed from: d, reason: collision with root package name */
    private static final float f7875d = h.u(8);

    /* renamed from: e, reason: collision with root package name */
    private static final float f7876e = h.u(112);

    /* renamed from: f, reason: collision with root package name */
    private static final float f7877f = h.u(280);

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Loa/F;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.G$a */
    static final class a extends AbstractC3864v implements l<androidx.compose.ui.graphics.c, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ boolean f7878B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4732V<Boolean> f7879C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<androidx.compose.ui.graphics.f> f7880D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ x1<Float> f7881E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ x1<Float> f7882F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, C4732V<Boolean> c4732v, InterfaceC1563p0<androidx.compose.ui.graphics.f> interfaceC1563p0, x1<Float> x1Var, x1<Float> x1Var2) {
            super(1);
            this.f7878B = z10;
            this.f7879C = c4732v;
            this.f7880D = interfaceC1563p0;
            this.f7881E = x1Var;
            this.f7882F = x1Var2;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float fB = 0.8f;
            float fC = 1.0f;
            cVar.j(!this.f7878B ? C1255G.b(this.f7881E) : this.f7879C.b().booleanValue() ? 1.0f : 0.8f);
            if (!this.f7878B) {
                fB = C1255G.b(this.f7881E);
            } else if (this.f7879C.b().booleanValue()) {
                fB = 1.0f;
            }
            cVar.i(fB);
            if (!this.f7878B) {
                fC = C1255G.c(this.f7882F);
            } else if (!this.f7879C.b().booleanValue()) {
                fC = 0.0f;
            }
            cVar.c(fC);
            cVar.j1(this.f7880D.getValue().getPackedValue());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.G$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f7883B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ o f7884C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f7885D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i iVar, o oVar, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f7883B = iVar;
            this.f7884C = oVar;
            this.f7885D = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1573559053, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
            }
            i iVarD = m.d(androidx.compose.foundation.layout.i.b(androidx.compose.foundation.layout.o.k(this.f7883B, 0.0f, C1255G.i(), 1, null), I.Max), this.f7884C, false, null, false, 14, null);
            q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> qVar = this.f7885D;
            y0.I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554l, 0);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE = b0.h.e(interfaceC1554l, iVarD);
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.n()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iA, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion.d());
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

    /* compiled from: Menu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.G$c */
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f7886B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4732V<Boolean> f7887C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<androidx.compose.ui.graphics.f> f7888D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ o f7889E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c1 f7890F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f7891G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f7892H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f7893I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> f7894J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f7895K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i iVar, C4732V<Boolean> c4732v, InterfaceC1563p0<androidx.compose.ui.graphics.f> interfaceC1563p0, o oVar, c1 c1Var, long j10, float f10, float f11, C4959d c4959d, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10) {
            super(2);
            this.f7886B = iVar;
            this.f7887C = c4732v;
            this.f7888D = interfaceC1563p0;
            this.f7889E = oVar;
            this.f7890F = c1Var;
            this.f7891G = j10;
            this.f7892H = f10;
            this.f7893I = f11;
            this.f7894J = qVar;
            this.f7895K = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1255G.a(this.f7886B, this.f7887C, this.f7888D, this.f7889E, this.f7890F, this.f7891G, this.f7892H, this.f7893I, null, this.f7894J, interfaceC1554l, C1509K0.a(this.f7895K | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/m0$a;", "", "Lv/G;", "", "a", "(Lv/m0$a;LO/l;I)Lv/G;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.G$d */
    static final class d extends AbstractC3864v implements q<C4762m0.a<Boolean>, InterfaceC1554l, Integer, InterfaceC4718G<Float>> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f7896B = new d();

        d() {
            super(3);
        }

        public final InterfaceC4718G<Float> a(C4762m0.a<Boolean> aVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(-1355418157);
            if (C1560o.J()) {
                C1560o.S(-1355418157, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
            }
            C4768p0 c4768p0J = aVar.b(Boolean.FALSE, Boolean.TRUE) ? C4755j.j(30, 0, null, 6, null) : C4755j.j(75, 0, null, 6, null);
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return c4768p0J;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ InterfaceC4718G<Float> g(C4762m0.a<Boolean> aVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(aVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/m0$a;", "", "Lv/G;", "", "a", "(Lv/m0$a;LO/l;I)Lv/G;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.G$e */
    static final class e extends AbstractC3864v implements q<C4762m0.a<Boolean>, InterfaceC1554l, Integer, InterfaceC4718G<Float>> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f7897B = new e();

        e() {
            super(3);
        }

        public final InterfaceC4718G<Float> a(C4762m0.a<Boolean> aVar, InterfaceC1554l interfaceC1554l, int i10) {
            interfaceC1554l.S(1033023423);
            if (C1560o.J()) {
                C1560o.S(1033023423, i10, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
            }
            C4768p0 c4768p0J = aVar.b(Boolean.FALSE, Boolean.TRUE) ? C4755j.j(TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, 0, C4716F.f(), 2, null) : C4755j.j(1, 74, null, 4, null);
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return c4768p0J;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ InterfaceC4718G<Float> g(C4762m0.a<Boolean> aVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(aVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: Menu.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.G$f */
    static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7898B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1254F f7899C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f7900D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7901E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ W f7902F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7903G;

        /* compiled from: Menu.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.G$f$a */
        static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7904B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f7904B = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(2035552199, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                }
                i iVarB = r.b(i.INSTANCE, M.i.f11519a.i(), 0.0f, 2, null);
                p<InterfaceC1554l, Integer, C4153F> pVar = this.f7904B;
                y0.I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarB);
                InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
                pVar.invoke(interfaceC1554l, 0);
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

        /* compiled from: Menu.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.G$f$b */
        static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ W f7905B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7906C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7907D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7908E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(W w10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3) {
                super(2);
                this.f7905B = w10;
                this.f7906C = pVar;
                this.f7907D = pVar2;
                this.f7908E = pVar3;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1728894036, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                }
                i iVarM = androidx.compose.foundation.layout.o.m(W.c(this.f7905B, i.INSTANCE, 1.0f, false, 2, null), this.f7906C != null ? C1255G.f7874c : h.u(0), 0.0f, this.f7907D != null ? C1255G.f7874c : h.u(0), 0.0f, 10, null);
                p<InterfaceC1554l, Integer, C4153F> pVar = this.f7908E;
                y0.I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarM);
                InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
                pVar.invoke(interfaceC1554l, 0);
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

        /* compiled from: Menu.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.G$f$c */
        static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7909B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f7909B = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(580312062, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                }
                i iVarB = r.b(i.INSTANCE, M.i.f11519a.k(), 0.0f, 2, null);
                p<InterfaceC1554l, Integer, C4153F> pVar = this.f7909B;
                y0.I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarB);
                InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
                pVar.invoke(interfaceC1554l, 0);
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
        f(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, C1254F c1254f, boolean z10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, W w10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3) {
            super(2);
            this.f7898B = pVar;
            this.f7899C = c1254f;
            this.f7900D = z10;
            this.f7901E = pVar2;
            this.f7902F = w10;
            this.f7903G = pVar3;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1065051884, i10, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
            }
            interfaceC1554l.S(1264683960);
            if (this.f7898B != null) {
                C1576w.a(C1298s.a().d(C3602t0.g(this.f7899C.a(this.f7900D))), W.c.d(2035552199, true, new a(this.f7898B), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
            }
            interfaceC1554l.I();
            C1503H0<C3602t0> c1503h0D = C1298s.a().d(C3602t0.g(this.f7899C.b(this.f7900D)));
            W.a aVarD = W.c.d(-1728894036, true, new b(this.f7902F, this.f7898B, this.f7901E, this.f7903G), interfaceC1554l, 54);
            int i11 = C1503H0.f12626i;
            C1576w.a(c1503h0D, aVarD, interfaceC1554l, i11 | 48);
            if (this.f7901E != null) {
                C1576w.a(C1298s.a().d(C3602t0.g(this.f7899C.c(this.f7900D))), W.c.d(580312062, true, new c(this.f7901E), interfaceC1554l, 54), interfaceC1554l, i11 | 48);
            }
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

    /* compiled from: Menu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.G$g */
    static final class g extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7910B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7911C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ i f7912D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7913E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f7914F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f7915G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C1254F f7916H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ N f7917I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ InterfaceC5162k f7918J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f7919K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, Ba.a<C4153F> aVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, boolean z10, C1254F c1254f, N n10, InterfaceC5162k interfaceC5162k, int i10) {
            super(2);
            this.f7910B = pVar;
            this.f7911C = aVar;
            this.f7912D = iVar;
            this.f7913E = pVar2;
            this.f7914F = pVar3;
            this.f7915G = z10;
            this.f7916H = c1254f;
            this.f7917I = n10;
            this.f7918J = interfaceC5162k;
            this.f7919K = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1255G.d(this.f7910B, this.f7911C, this.f7912D, this.f7913E, this.f7914F, this.f7915G, this.f7916H, this.f7917I, this.f7918J, interfaceC1554l, C1509K0.a(this.f7919K | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    static {
        float f10 = 48;
        f7872a = h.u(f10);
        f7873b = h.u(f10);
    }

    public static final void a(i iVar, C4732V<Boolean> c4732v, InterfaceC1563p0<androidx.compose.ui.graphics.f> interfaceC1563p0, o oVar, c1 c1Var, long j10, float f10, float f11, C4959d c4959d, q<? super InterfaceC0801i, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-151448888);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? interfaceC1554lR.R(c4732v) : interfaceC1554lR.l(c4732v) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.R(interfaceC1563p0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1554lR.R(oVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC1554lR.R(c1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC1554lR.i(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC1554lR.g(f10) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= interfaceC1554lR.g(f11) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= interfaceC1554lR.R(c4959d) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i11 |= interfaceC1554lR.l(qVar) ? 536870912 : 268435456;
        }
        if ((i11 & 306783379) == 306783378 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-151448888, i11, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            C4762m0 c4762m0E = C4764n0.e(c4732v, "DropDownMenu", interfaceC1554lR, C4732V.f50654d | 48 | ((i11 >> 3) & 14), 0);
            e eVar = e.f7897B;
            C3856m c3856m = C3856m.f44008a;
            InterfaceC4770q0<Float, C4761m> interfaceC4770q0I = C4774s0.i(c3856m);
            boolean zBooleanValue = ((Boolean) c4762m0E.g()).booleanValue();
            interfaceC1554lR.S(2139028452);
            if (C1560o.J()) {
                C1560o.S(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f12 = zBooleanValue ? 1.0f : 0.8f;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554lR.I();
            Float fValueOf = Float.valueOf(f12);
            boolean zBooleanValue2 = ((Boolean) c4762m0E.k()).booleanValue();
            interfaceC1554lR.S(2139028452);
            if (C1560o.J()) {
                C1560o.S(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f13 = zBooleanValue2 ? 1.0f : 0.8f;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554lR.I();
            x1 x1VarB = C4764n0.b(c4762m0E, fValueOf, Float.valueOf(f13), eVar.g(c4762m0E.i(), interfaceC1554lR, 0), interfaceC4770q0I, "FloatAnimation", interfaceC1554lR, 0);
            d dVar = d.f7896B;
            InterfaceC4770q0<Float, C4761m> interfaceC4770q0I2 = C4774s0.i(c3856m);
            boolean zBooleanValue3 = ((Boolean) c4762m0E.g()).booleanValue();
            interfaceC1554lR.S(-249413128);
            if (C1560o.J()) {
                C1560o.S(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f14 = zBooleanValue3 ? 1.0f : 0.0f;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554lR.I();
            Float fValueOf2 = Float.valueOf(f14);
            boolean zBooleanValue4 = ((Boolean) c4762m0E.k()).booleanValue();
            interfaceC1554lR.S(-249413128);
            if (C1560o.J()) {
                C1560o.S(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f15 = zBooleanValue4 ? 1.0f : 0.0f;
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554lR.I();
            x1 x1VarB2 = C4764n0.b(c4762m0E, fValueOf2, Float.valueOf(f15), dVar.g(c4762m0E.i(), interfaceC1554lR, 0), interfaceC4770q0I2, "FloatAnimation", interfaceC1554lR, 0);
            boolean zBooleanValue5 = ((Boolean) interfaceC1554lR.o(C2038r0.a())).booleanValue();
            i.Companion companion = i.INSTANCE;
            boolean zC = interfaceC1554lR.c(zBooleanValue5) | interfaceC1554lR.R(x1VarB) | ((i11 & 112) == 32 || ((i11 & 64) != 0 && interfaceC1554lR.l(c4732v))) | interfaceC1554lR.R(x1VarB2) | ((i11 & 896) == 256);
            Object objF = interfaceC1554lR.f();
            if (zC || objF == InterfaceC1554l.INSTANCE.a()) {
                i12 = i11;
                a aVar = new a(zBooleanValue5, c4732v, interfaceC1563p0, x1VarB, x1VarB2);
                interfaceC1554lR.J(aVar);
                objF = aVar;
            } else {
                i12 = i11;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            C1272Y.a(androidx.compose.ui.graphics.b.a(companion, (l) objF), c1Var, j10, 0L, f10, f11, c4959d, W.c.d(1573559053, true, new b(iVar, oVar, qVar), interfaceC1554lR, 54), interfaceC1554lR, (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new c(iVar, c4732v, interfaceC1563p0, oVar, c1Var, j10, f10, f11, c4959d, qVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(x1<Float> x1Var) {
        return x1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(x1<Float> x1Var) {
        return x1Var.getValue().floatValue();
    }

    public static final void d(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, Ba.a<C4153F> aVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, boolean z10, C1254F c1254f, N n10, InterfaceC5162k interfaceC5162k, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1564716777);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.R(iVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1554lR.l(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC1554lR.l(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC1554lR.c(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC1554lR.R(c1254f) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC1554lR.R(n10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC1554lR.R(interfaceC5162k) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-1564716777, i11, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            i iVarH = androidx.compose.foundation.layout.o.h(r.p(r.h(androidx.compose.foundation.d.b(iVar, interfaceC5162k, C1263O.c(true, 0.0f, 0L, interfaceC1554lR, 6, 6), z10, null, null, aVar, 24, null), 0.0f, 1, null), f7876e, f7873b, f7877f, 0.0f, 8, null), n10);
            y0.I iB = U.b(C0794b.f54a.e(), b0.c.INSTANCE.i(), interfaceC1554lR, 48);
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            i iVarE = b0.h.e(interfaceC1554lR, iVarH);
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
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
            C1.b(interfaceC1554lA, iB, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion.d());
            C1273Z.a(C1252D.f7860a.c(interfaceC1554lR, 6).getLabelLarge(), W.c.d(1065051884, true, new f(pVar2, c1254f, z10, pVar3, X.f45a, pVar), interfaceC1554lR, 54), interfaceC1554lR, 48);
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new g(pVar, aVar, iVar, pVar2, pVar3, z10, c1254f, n10, interfaceC5162k, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long h(U0.p r5, U0.p r6) {
        /*
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.l()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.l()
            float r1 = (float) r1
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.f()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.f()
            float r6 = (float) r6
            float r2 = r5 / r6
        L8f:
            long r5 = i0.g1.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1255G.h(U0.p, U0.p):long");
    }

    public static final float i() {
        return f7875d;
    }

    public static final float j() {
        return f7872a;
    }
}
