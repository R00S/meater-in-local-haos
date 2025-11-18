package kotlin;

import A0.InterfaceC0828g;
import Ba.a;
import Ba.l;
import Ba.p;
import Ba.q;
import F0.o;
import F0.v;
import F0.x;
import Xb.T;
import androidx.compose.ui.platform.C2013e0;
import androidx.compose.ui.platform.InterfaceC2020i;
import java.util.List;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1516O;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C4716F;
import kotlin.C4737a;
import kotlin.C4739b;
import kotlin.C4755j;
import kotlin.C4761m;
import kotlin.C4768p0;
import kotlin.InterfaceC1505I0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import y0.I;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *0\b\u0002\u0010!\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\""}, d2 = {"LI/g0;", "hostState", "Lb0/i;", "modifier", "Lkotlin/Function1;", "LI/c0;", "Loa/F;", "snackbar", "b", "(LI/g0;Lb0/i;LBa/q;LO/l;II)V", "LI/e0;", "", "hasAction", "Landroidx/compose/ui/platform/i;", "accessibilityManager", "", "h", "(LI/e0;ZLandroidx/compose/ui/platform/i;)J", "current", "content", "a", "(LI/c0;Lb0/i;LBa/q;LO/l;II)V", "Lv/i;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "LO/x1;", "f", "(Lv/i;ZLBa/a;LO/l;II)LO/x1;", "g", "(Lv/i;ZLO/l;I)LO/x1;", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "children", "a", "(LBa/p;LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.f0$a, reason: from Kotlin metadata */
    static final class Function0 extends AbstractC3864v implements q<p<? super InterfaceC1554l, ? super Integer, ? extends C4153F>, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c0 f6162B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c0 f6163C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ List<c0> f6164D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1121H<c0> f6165E;

        /* compiled from: SnackbarHost.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.f0$a$a */
        static final class a extends AbstractC3864v implements l<x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ c0 f6166B;

            /* compiled from: SnackbarHost.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.f0$a$a$a, reason: collision with other inner class name */
            static final class C0119a extends AbstractC3864v implements Ba.a<Boolean> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ c0 f6167B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0119a(c0 c0Var) {
                    super(0);
                    this.f6167B = c0Var;
                }

                @Override // Ba.a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    this.f6167B.dismiss();
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var) {
                super(1);
                this.f6166B = c0Var;
            }

            public final void a(x xVar) {
                v.E(xVar, F0.g.INSTANCE.b());
                v.h(xVar, null, new C0119a(this.f6166B), 1, null);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
                a(xVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: SnackbarHost.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.f0$a$b */
        static final class b extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ c0 f6168B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C1121H<c0> f6169C;

            /* compiled from: SnackbarHost.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LI/G;", "LI/c0;", "it", "", "a", "(LI/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.f0$a$b$a */
            static final class a extends AbstractC3864v implements l<FadeInFadeOutAnimationItem<c0>, Boolean> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ c0 f6170B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(c0 c0Var) {
                    super(1);
                    this.f6170B = c0Var;
                }

                @Override // Ba.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(FadeInFadeOutAnimationItem<c0> fadeInFadeOutAnimationItem) {
                    return Boolean.valueOf(C3862t.b(fadeInFadeOutAnimationItem.c(), this.f6170B));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c0 c0Var, C1121H<c0> c1121h) {
                super(0);
                this.f6168B = c0Var;
                this.f6169C = c1121h;
            }

            public final void a() {
                if (C3862t.b(this.f6168B, this.f6169C.getCurrent())) {
                    return;
                }
                r.J(this.f6169C.b(), new a(this.f6168B));
                InterfaceC1505I0 scope = this.f6169C.getScope();
                if (scope != null) {
                    scope.invalidate();
                }
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Function0(c0 c0Var, c0 c0Var2, List<c0> list, C1121H<c0> c1121h) {
            super(3);
            this.f6162B = c0Var;
            this.f6163C = c0Var2;
            this.f6164D = list;
            this.f6165E = c1121h;
        }

        public final void a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC1554l.l(pVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1471040642, i11, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:274)");
            }
            boolean zB = C3862t.b(this.f6162B, this.f6163C);
            int i12 = zB ? 150 : 75;
            int i13 = (!zB || W0.a.b(this.f6164D).size() == 1) ? 0 : 75;
            C4768p0 c4768p0I = C4755j.i(i12, i13, C4716F.e());
            boolean zL = interfaceC1554l.l(this.f6162B) | interfaceC1554l.l(this.f6165E);
            c0 c0Var = this.f6162B;
            C1121H<c0> c1121h = this.f6165E;
            Object objF = interfaceC1554l.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new b(c0Var, c1121h);
                interfaceC1554l.J(objF);
            }
            x1 x1VarF = f0.f(c4768p0I, zB, (Ba.a) objF, interfaceC1554l, 0, 0);
            x1 x1VarG = f0.g(C4755j.i(i12, i13, C4716F.d()), zB, interfaceC1554l, 0);
            b0.i iVarC = androidx.compose.ui.graphics.b.c(b0.i.INSTANCE, ((Number) x1VarG.getValue()).floatValue(), ((Number) x1VarG.getValue()).floatValue(), ((Number) x1VarF.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            boolean zL2 = interfaceC1554l.l(this.f6162B);
            c0 c0Var2 = this.f6162B;
            Object objF2 = interfaceC1554l.f();
            if (zL2 || objF2 == InterfaceC1554l.INSTANCE.a()) {
                objF2 = new a(c0Var2);
                interfaceC1554l.J(objF2);
            }
            b0.i iVarD = o.d(iVarC, false, (l) objF2, 1, null);
            I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            b0.i iVarE = b0.h.e(interfaceC1554l, iVarD);
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
            pVar.invoke(interfaceC1554l, Integer.valueOf(i11 & 14));
            interfaceC1554l.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(p<? super InterfaceC1554l, ? super Integer, ? extends C4153F> pVar, InterfaceC1554l interfaceC1554l, Integer num) {
            a(pVar, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ q<c0, InterfaceC1554l, Integer, C4153F> f6171B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c0 f6172C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super c0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, c0 c0Var) {
            super(2);
            this.f6171B = qVar;
            this.f6172C = c0Var;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(2041982076, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:327)");
            }
            q<c0, InterfaceC1554l, Integer, C4153F> qVar = this.f6171B;
            c0 c0Var = this.f6172C;
            C3862t.d(c0Var);
            qVar.g(c0Var, interfaceC1554l, 0);
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

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c0 f6173B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f6174C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<c0, InterfaceC1554l, Integer, C4153F> f6175D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f6176E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f6177F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(c0 c0Var, b0.i iVar, q<? super c0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11) {
            super(2);
            this.f6173B = c0Var;
            this.f6174C = iVar;
            this.f6175D = qVar;
            this.f6176E = i10;
            this.f6177F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            f0.a(this.f6173B, this.f6174C, this.f6175D, interfaceC1554l, C1509K0.a(this.f6176E | 1), this.f6177F);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {167}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6178B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c0 f6179C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC2020i f6180D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0 c0Var, InterfaceC2020i interfaceC2020i, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6179C = c0Var;
            this.f6180D = interfaceC2020i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new d(this.f6179C, this.f6180D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6178B;
            if (i10 == 0) {
                C4173r.b(obj);
                c0 c0Var = this.f6179C;
                if (c0Var != null) {
                    long jH = f0.h(c0Var.b(), this.f6179C.d() != null, this.f6180D);
                    this.f6178B = 1;
                    if (T.a(jH, this) == objE) {
                        return objE;
                    }
                }
                return C4153F.f46609a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            this.f6179C.dismiss();
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ g0 f6181B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f6182C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<c0, InterfaceC1554l, Integer, C4153F> f6183D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f6184E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f6185F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(g0 g0Var, b0.i iVar, q<? super c0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i10, int i11) {
            super(2);
            this.f6181B = g0Var;
            this.f6182C = iVar;
            this.f6183D = qVar;
            this.f6184E = i10;
            this.f6185F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            f0.b(this.f6181B, this.f6182C, this.f6183D, interfaceC1554l, C1509K0.a(this.f6184E | 1), this.f6185F);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6186a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6186a = iArr;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {357}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6188B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4737a<Float, C4761m> f6189C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f6190D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC4753i<Float> f6191E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ a<C4153F> f6192F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C4737a<Float, C4761m> c4737a, boolean z10, InterfaceC4753i<Float> interfaceC4753i, a<C4153F> aVar, InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6189C = c4737a;
            this.f6190D = z10;
            this.f6191E = interfaceC4753i;
            this.f6192F = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new h(this.f6189C, this.f6190D, this.f6191E, this.f6192F, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((h) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6188B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a<Float, C4761m> c4737a = this.f6189C;
                Float fB = kotlin.coroutines.jvm.internal.b.b(this.f6190D ? 1.0f : 0.0f);
                InterfaceC4753i<Float> interfaceC4753i = this.f6191E;
                this.f6188B = 1;
                if (C4737a.f(c4737a, fB, interfaceC4753i, null, null, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            this.f6192F.invoke();
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnackbarHost.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", l = {370}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6193B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4737a<Float, C4761m> f6194C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f6195D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC4753i<Float> f6196E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C4737a<Float, C4761m> c4737a, boolean z10, InterfaceC4753i<Float> interfaceC4753i, InterfaceC4588d<? super i> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6194C = c4737a;
            this.f6195D = z10;
            this.f6196E = interfaceC4753i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new i(this.f6194C, this.f6195D, this.f6196E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((i) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6193B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a<Float, C4761m> c4737a = this.f6194C;
                Float fB = kotlin.coroutines.jvm.internal.b.b(this.f6195D ? 1.0f : 0.8f);
                InterfaceC4753i<Float> interfaceC4753i = this.f6196E;
                this.f6193B = 1;
                if (C4737a.f(c4737a, fB, interfaceC4753i, null, null, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc A[LOOP:2: B:78:0x01ba->B:79:0x01bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.c0 r16, b0.i r17, Ba.q<? super kotlin.c0, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r18, kotlin.InterfaceC1554l r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.f0.a(I.c0, b0.i, Ba.q, O.l, int, int):void");
    }

    public static final void b(g0 g0Var, b0.i iVar, q<? super c0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.R(g0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.R(iVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC1554lR.l(qVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (i14 != 0) {
                qVar = C1148k.f6320a.a();
            }
            if (C1560o.J()) {
                C1560o.S(431012348, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)");
            }
            c0 c0VarA = g0Var.a();
            InterfaceC2020i interfaceC2020i = (InterfaceC2020i) interfaceC1554lR.o(C2013e0.c());
            boolean zL = interfaceC1554lR.l(c0VarA) | interfaceC1554lR.l(interfaceC2020i);
            Object objF = interfaceC1554lR.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new d(c0VarA, interfaceC2020i, null);
                interfaceC1554lR.J(objF);
            }
            C1516O.e(c0VarA, (p) objF, interfaceC1554lR, 0);
            a(g0Var.a(), iVar, qVar, interfaceC1554lR, i12 & 1008, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        b0.i iVar2 = iVar;
        q<? super c0, ? super InterfaceC1554l, ? super Integer, C4153F> qVar2 = qVar;
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new e(g0Var, iVar2, qVar2, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1<Float> f(InterfaceC4753i<Float> interfaceC4753i, boolean z10, a<C4153F> aVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 4) != 0) {
            aVar = g.f6187B;
        }
        a<C4153F> aVar2 = aVar;
        if (C1560o.J()) {
            C1560o.S(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = C4739b.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            interfaceC1554l.J(objF);
        }
        C4737a c4737a = (C4737a) objF;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zL = interfaceC1554l.l(c4737a) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.c(z10)) || (i10 & 48) == 32) | interfaceC1554l.l(interfaceC4753i) | ((((i10 & 896) ^ 384) > 256 && interfaceC1554l.R(aVar2)) || (i10 & 384) == 256);
        Object objF2 = interfaceC1554l.f();
        if (zL || objF2 == companion.a()) {
            Object hVar = new h(c4737a, z10, interfaceC4753i, aVar2, null);
            interfaceC1554l.J(hVar);
            objF2 = hVar;
        }
        C1516O.e(boolValueOf, (p) objF2, interfaceC1554l, (i10 >> 3) & 14);
        x1<Float> x1VarG = c4737a.g();
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1<Float> g(InterfaceC4753i<Float> interfaceC4753i, boolean z10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = C4739b.b(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            interfaceC1554l.J(objF);
        }
        C4737a c4737a = (C4737a) objF;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zL = interfaceC1554l.l(c4737a) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.c(z10)) || (i10 & 48) == 32) | interfaceC1554l.l(interfaceC4753i);
        Object objF2 = interfaceC1554l.f();
        if (zL || objF2 == companion.a()) {
            objF2 = new i(c4737a, z10, interfaceC4753i, null);
            interfaceC1554l.J(objF2);
        }
        C1516O.e(boolValueOf, (p) objF2, interfaceC1554l, (i10 >> 3) & 14);
        x1<Float> x1VarG = c4737a.g();
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarG;
    }

    public static final long h(e0 e0Var, boolean z10, InterfaceC2020i interfaceC2020i) {
        long j10;
        int i10 = f.f6186a[e0Var.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return interfaceC2020i == null ? j11 : interfaceC2020i.a(j11, true, true, z10);
    }

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends AbstractC3864v implements a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f6187B = new g();

        g() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }
}
