package kotlin;

import Ba.l;
import Ba.p;
import Xb.I;
import Xb.InterfaceC1847l;
import gc.InterfaceC3460a;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C4762m0;
import kotlin.C4762m0.c;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.x1;
import oa.C4153F;
import oa.C4165j;
import oa.C4172q;
import oa.C4173r;
import oa.EnumC4168m;
import oa.InterfaceC4156a;
import oa.InterfaceC4164i;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\n\u001ao\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\r*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"$\u0010\u001c\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001b\u0010!\u001a\u00020\u001d8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"T", "Lv/o0;", "transitionState", "", "label", "Lv/m0;", "d", "(Lv/o0;Ljava/lang/String;LO/l;II)Lv/m0;", "Lv/V;", "e", "(Lv/V;Ljava/lang/String;LO/l;II)Lv/m0;", "S", "Lv/q;", "V", "initialValue", "targetValue", "Lv/G;", "animationSpec", "Lv/q0;", "typeConverter", "LO/x1;", "b", "(Lv/m0;Ljava/lang/Object;Ljava/lang/Object;Lv/G;Lv/q0;Ljava/lang/String;LO/l;I)LO/x1;", "Lkotlin/Function1;", "Lv/b0;", "Loa/F;", "a", "LBa/l;", "SeekableTransitionStateTotalDurationChanged", "Landroidx/compose/runtime/snapshots/l;", "Loa/i;", "c", "()Landroidx/compose/runtime/snapshots/l;", "SeekableStateObserver", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4764n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final l<C4740b0<?>, C4153F> f50869a = b.f50873B;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC4164i f50870b = C4165j.b(EnumC4168m.f46628D, a.f50871B);

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "a", "()Landroidx/compose/runtime/snapshots/l;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.n0$a */
    static final class a extends AbstractC3864v implements Ba.a<androidx.compose.runtime.snapshots.l> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f50871B = new a();

        /* compiled from: Transition.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "it", "a", "(LBa/a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.n0$a$a, reason: from Kotlin metadata */
        static final class Function0 extends AbstractC3864v implements l<Ba.a<? extends C4153F>, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final Function0 f50872B = new Function0();

            Function0() {
                super(1);
            }

            public final void a(Ba.a<C4153F> aVar) {
                aVar.invoke();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Ba.a<? extends C4153F> aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.l invoke() {
            androidx.compose.runtime.snapshots.l lVar = new androidx.compose.runtime.snapshots.l(Function0.f50872B);
            lVar.s();
            return lVar;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/b0;", "it", "Loa/F;", "a", "(Lv/b0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.n0$b */
    static final class b extends AbstractC3864v implements l<C4740b0<?>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f50873B = new b();

        b() {
            super(1);
        }

        public final void a(C4740b0<?> c4740b0) {
            c4740b0.l();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C4740b0<?> c4740b0) {
            a(c4740b0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"S", "T", "Lv/q;", "V", "LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.n0$c */
    static final class c extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4762m0<S> f50874B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4762m0<S>.c<T, V> f50875C;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v/n0$c$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v.n0$c$a */
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4762m0 f50876a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4762m0.c f50877b;

            public a(C4762m0 c4762m0, C4762m0.c cVar) {
                this.f50876a = c4762m0;
                this.f50877b = cVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f50876a.w(this.f50877b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4762m0<S> c4762m0, C4762m0<S>.c<T, V> cVar) {
            super(1);
            this.f50874B = c4762m0;
            this.f50875C = cVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f50874B.c(this.f50875C);
            return new a(this.f50874B, this.f50875C);
        }
    }

    /* compiled from: Transition.kt */
    @f(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2191}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.n0$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f50878B;

        /* renamed from: C, reason: collision with root package name */
        Object f50879C;

        /* renamed from: D, reason: collision with root package name */
        int f50880D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC4766o0<T> f50881E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC4766o0<T> abstractC4766o0, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f50881E = abstractC4766o0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new d(this.f50881E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3460a interfaceC3460aI;
            AbstractC4766o0 abstractC4766o0;
            Object objE = C4696b.e();
            int i10 = this.f50880D;
            if (i10 == 0) {
                C4173r.b(obj);
                ((C4740b0) this.f50881E).k();
                interfaceC3460aI = ((C4740b0) this.f50881E).i();
                AbstractC4766o0 abstractC4766o02 = this.f50881E;
                this.f50878B = interfaceC3460aI;
                this.f50879C = abstractC4766o02;
                this.f50880D = 1;
                if (interfaceC3460aI.d(null, this) == objE) {
                    return objE;
                }
                abstractC4766o0 = abstractC4766o02;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC4766o0 = (AbstractC4766o0) this.f50879C;
                interfaceC3460aI = (InterfaceC3460a) this.f50878B;
                C4173r.b(obj);
            }
            try {
                ((C4740b0) abstractC4766o0).n(abstractC4766o0.b());
                InterfaceC1847l interfaceC1847lH = ((C4740b0) abstractC4766o0).h();
                if (interfaceC1847lH != null) {
                    C4172q.Companion companion = C4172q.INSTANCE;
                    interfaceC1847lH.resumeWith(C4172q.a(abstractC4766o0.b()));
                }
                ((C4740b0) abstractC4766o0).o(null);
                C4153F c4153f = C4153F.f46609a;
                interfaceC3460aI.c(null);
                return C4153F.f46609a;
            } catch (Throwable th) {
                interfaceC3460aI.c(null);
                throw th;
            }
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.n0$e */
    static final class e extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4762m0<T> f50882B;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v/n0$e$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v.n0$e$a */
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4762m0 f50883a;

            public a(C4762m0 c4762m0) {
                this.f50883a = c4762m0;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f50883a.r();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C4762m0<T> c4762m0) {
            super(1);
            this.f50882B = c4762m0;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            return new a(this.f50882B);
        }
    }

    public static final <S, T, V extends AbstractC4769q> x1<T> b(C4762m0<S> c4762m0, T t10, T t11, InterfaceC4718G<T> interfaceC4718G, InterfaceC4770q0<T, V> interfaceC4770q0, String str, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && interfaceC1554l.R(c4762m0)) || (i10 & 6) == 4;
        Object objF = interfaceC1554l.f();
        if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
            Object cVar = c4762m0.new c(t10, C4759l.e(interfaceC4770q0, t11), interfaceC4770q0, str);
            interfaceC1554l.J(cVar);
            objF = cVar;
        }
        C4762m0.c cVar2 = (C4762m0.c) objF;
        if (c4762m0.p()) {
            cVar2.E(t10, t11, interfaceC4718G);
        } else {
            cVar2.F(t11, interfaceC4718G);
        }
        if ((i11 <= 4 || !interfaceC1554l.R(c4762m0)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zR = interfaceC1554l.R(cVar2) | z10;
        Object objF2 = interfaceC1554l.f();
        if (zR || objF2 == InterfaceC1554l.INSTANCE.a()) {
            objF2 = new c(c4762m0, cVar2);
            interfaceC1554l.J(objF2);
        }
        C1516O.a(cVar2, (l) objF2, interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return cVar2;
    }

    public static final androidx.compose.runtime.snapshots.l c() {
        return (androidx.compose.runtime.snapshots.l) f50870b.getValue();
    }

    public static final <T> C4762m0<T> d(AbstractC4766o0<T> abstractC4766o0, String str, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (C1560o.J()) {
            C1560o.S(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && interfaceC1554l.R(abstractC4766o0)) || (i10 & 6) == 4;
        Object objF = interfaceC1554l.f();
        if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C4762m0(abstractC4766o0, str);
            interfaceC1554l.J(objF);
        }
        C4762m0<T> c4762m0 = (C4762m0) objF;
        if (abstractC4766o0 instanceof C4740b0) {
            interfaceC1554l.S(1030413636);
            T tA = abstractC4766o0.a();
            T tB = abstractC4766o0.b();
            if ((i12 <= 4 || !interfaceC1554l.R(abstractC4766o0)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objF2 = interfaceC1554l.f();
            if (z10 || objF2 == InterfaceC1554l.INSTANCE.a()) {
                objF2 = new d(abstractC4766o0, null);
                interfaceC1554l.J(objF2);
            }
            C1516O.f(tA, tB, (p) objF2, interfaceC1554l, 0);
            interfaceC1554l.I();
        } else {
            interfaceC1554l.S(1030875195);
            c4762m0.d(abstractC4766o0.b(), interfaceC1554l, 0);
            interfaceC1554l.I();
        }
        boolean zR = interfaceC1554l.R(c4762m0);
        Object objF3 = interfaceC1554l.f();
        if (zR || objF3 == InterfaceC1554l.INSTANCE.a()) {
            objF3 = new e(c4762m0);
            interfaceC1554l.J(objF3);
        }
        C1516O.a(c4762m0, (l) objF3, interfaceC1554l, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c4762m0;
    }

    @InterfaceC4156a
    public static final <T> C4762m0<T> e(C4732V<T> c4732v, String str, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (C1560o.J()) {
            C1560o.S(882913843, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:873)");
        }
        C4762m0<T> c4762m0D = d(c4732v, str, interfaceC1554l, i10 & 126, 0);
        if (C1560o.J()) {
            C1560o.R();
        }
        return c4762m0D;
    }
}
