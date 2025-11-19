package kotlin;

import Ba.p;
import U0.h;
import U0.n;
import U0.r;
import Xb.I;
import Zb.g;
import Zb.j;
import h0.C3476g;
import h0.C3478i;
import h0.C3482m;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3861s;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: AnimateAsState.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0014\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014¨\u0006,²\u0006*\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00018\nX\u008a\u0084\u0002²\u0006\"\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"T", "Lv/q;", "V", "targetValue", "Lv/q0;", "typeConverter", "Lv/i;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "Loa/F;", "finishedListener", "LO/x1;", "c", "(Ljava/lang/Object;Lv/q0;Lv/i;Ljava/lang/Object;Ljava/lang/String;LBa/l;LO/l;II)LO/x1;", "Lv/f0;", "", "a", "Lv/f0;", "defaultAnimation", "LU0/h;", "b", "dpDefaultSpring", "Lh0/m;", "sizeDefaultSpring", "Lh0/g;", "d", "offsetDefaultSpring", "Lh0/i;", "e", "rectDefaultSpring", "", "f", "intDefaultSpring", "LU0/n;", "g", "intOffsetDefaultSpring", "LU0/r;", "h", "intSizeDefaultSpring", "listener", "animSpec", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4741c {

    /* renamed from: a, reason: collision with root package name */
    private static final C4748f0<Float> f50726a = C4755j.h(0.0f, 0.0f, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C4748f0<h> f50727b = C4755j.h(0.0f, 0.0f, h.p(C4717F0.a(h.INSTANCE)), 3, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C4748f0<C3482m> f50728c = C4755j.h(0.0f, 0.0f, C3482m.c(C4717F0.f(C3482m.INSTANCE)), 3, null);

    /* renamed from: d, reason: collision with root package name */
    private static final C4748f0<C3476g> f50729d = C4755j.h(0.0f, 0.0f, C3476g.d(C4717F0.e(C3476g.INSTANCE)), 3, null);

    /* renamed from: e, reason: collision with root package name */
    private static final C4748f0<C3478i> f50730e = C4755j.h(0.0f, 0.0f, C4717F0.g(C3478i.INSTANCE), 3, null);

    /* renamed from: f, reason: collision with root package name */
    private static final C4748f0<Integer> f50731f = C4755j.h(0.0f, 0.0f, Integer.valueOf(C4717F0.b(C3861s.f44009a)), 3, null);

    /* renamed from: g, reason: collision with root package name */
    private static final C4748f0<n> f50732g = C4755j.h(0.0f, 0.0f, n.b(C4717F0.c(n.INSTANCE)), 3, null);

    /* renamed from: h, reason: collision with root package name */
    private static final C4748f0<r> f50733h = C4755j.h(0.0f, 0.0f, r.b(C4717F0.d(r.INSTANCE)), 3, null);

    /* compiled from: AnimateAsState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.c$a */
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ g<T> f50734B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ T f50735C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<T> gVar, T t10) {
            super(0);
            this.f50734B = gVar;
            this.f50735C = t10;
        }

        public final void a() {
            this.f50734B.w(this.f50735C);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AnimateAsState.kt */
    @f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.c$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f50736B;

        /* renamed from: C, reason: collision with root package name */
        int f50737C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f50738D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ g<T> f50739E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C4737a<T, V> f50740F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ x1<InterfaceC4753i<T>> f50741G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ x1<Ba.l<T, C4153F>> f50742H;

        /* compiled from: AnimateAsState.kt */
        @f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.c$b$a */
        static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f50743B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ T f50744C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C4737a<T, V> f50745D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ x1<InterfaceC4753i<T>> f50746E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ x1<Ba.l<T, C4153F>> f50747F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t10, C4737a<T, V> c4737a, x1<? extends InterfaceC4753i<T>> x1Var, x1<? extends Ba.l<? super T, C4153F>> x1Var2, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f50744C = t10;
                this.f50745D = c4737a;
                this.f50746E = x1Var;
                this.f50747F = x1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f50744C, this.f50745D, this.f50746E, this.f50747F, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f50743B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    if (!C3862t.b(this.f50744C, this.f50745D.k())) {
                        C4737a<T, V> c4737a = this.f50745D;
                        T t10 = this.f50744C;
                        InterfaceC4753i interfaceC4753iE = C4741c.e(this.f50746E);
                        this.f50743B = 1;
                        if (C4737a.f(c4737a, t10, interfaceC4753iE, null, null, this, 12, null) == objE) {
                            return objE;
                        }
                    }
                    return C4153F.f46609a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                Ba.l lVarD = C4741c.d(this.f50747F);
                if (lVarD != null) {
                    lVarD.invoke(this.f50745D.m());
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g<T> gVar, C4737a<T, V> c4737a, x1<? extends InterfaceC4753i<T>> x1Var, x1<? extends Ba.l<? super T, C4153F>> x1Var2, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f50739E = gVar;
            this.f50740F = c4737a;
            this.f50741G = x1Var;
            this.f50742H = x1Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f50739E, this.f50740F, this.f50741G, this.f50742H, interfaceC4588d);
            bVar.f50738D = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r13.f50737C
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r13.f50736B
                Zb.i r1 = (Zb.i) r1
                java.lang.Object r3 = r13.f50738D
                Xb.I r3 = (Xb.I) r3
                oa.C4173r.b(r14)
                r4 = r14
                goto L3d
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                oa.C4173r.b(r14)
                java.lang.Object r1 = r13.f50738D
                Xb.I r1 = (Xb.I) r1
                Zb.g<T> r3 = r13.f50739E
                Zb.i r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L30:
                r13.f50738D = r3
                r13.f50736B = r1
                r13.f50737C = r2
                java.lang.Object r4 = r1.a(r13)
                if (r4 != r0) goto L3d
                return r0
            L3d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L6f
                java.lang.Object r4 = r1.next()
                Zb.g<T> r5 = r13.f50739E
                java.lang.Object r5 = r5.i()
                java.lang.Object r5 = Zb.k.f(r5)
                if (r5 != 0) goto L57
                r7 = r4
                goto L58
            L57:
                r7 = r5
            L58:
                v.c$b$a r4 = new v.c$b$a
                v.a<T, V> r8 = r13.f50740F
                O.x1<v.i<T>> r9 = r13.f50741G
                O.x1<Ba.l<T, oa.F>> r10 = r13.f50742H
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                Xb.C1837g.d(r5, r6, r7, r8, r9, r10)
                goto L30
            L6f:
                oa.F r0 = oa.C4153F.f46609a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C4741c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T, V extends AbstractC4769q> x1<T> c(T t10, InterfaceC4770q0<T, V> interfaceC4770q0, InterfaceC4753i<T> interfaceC4753i, T t11, String str, Ba.l<? super T, C4153F> lVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        InterfaceC4753i<T> interfaceC4753iG;
        if ((i11 & 4) != 0) {
            Object objF = interfaceC1554l.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = C4755j.h(0.0f, 0.0f, null, 7, null);
                interfaceC1554l.J(objF);
            }
            interfaceC4753iG = (C4748f0) objF;
        } else {
            interfaceC4753iG = interfaceC4753i;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        Ba.l<? super T, C4153F> lVar2 = (i11 & 32) != 0 ? null : lVar;
        if (C1560o.J()) {
            C1560o.S(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object objF2 = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF2 == companion.a()) {
            objF2 = r1.c(null, null, 2, null);
            interfaceC1554l.J(objF2);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF2;
        Object objF3 = interfaceC1554l.f();
        if (objF3 == companion.a()) {
            objF3 = new C4737a(t10, interfaceC4770q0, t12, str2);
            interfaceC1554l.J(objF3);
        }
        C4737a c4737a = (C4737a) objF3;
        x1 x1VarM = m1.m(lVar2, interfaceC1554l, (i10 >> 15) & 14);
        if (t12 != null && (interfaceC4753iG instanceof C4748f0)) {
            C4748f0 c4748f0 = (C4748f0) interfaceC4753iG;
            if (!C3862t.b(c4748f0.h(), t12)) {
                interfaceC4753iG = C4755j.g(c4748f0.getDampingRatio(), c4748f0.getStiffness(), t12);
            }
        }
        x1 x1VarM2 = m1.m(interfaceC4753iG, interfaceC1554l, 0);
        Object objF4 = interfaceC1554l.f();
        if (objF4 == companion.a()) {
            objF4 = j.b(-1, null, null, 6, null);
            interfaceC1554l.J(objF4);
        }
        g gVar = (g) objF4;
        boolean zL = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.l(t10)) || (i10 & 6) == 4) | interfaceC1554l.l(gVar);
        Object objF5 = interfaceC1554l.f();
        if (zL || objF5 == companion.a()) {
            objF5 = new a(gVar, t10);
            interfaceC1554l.J(objF5);
        }
        C1516O.g((Ba.a) objF5, interfaceC1554l, 0);
        boolean zL2 = interfaceC1554l.l(gVar) | interfaceC1554l.l(c4737a) | interfaceC1554l.R(x1VarM2) | interfaceC1554l.R(x1VarM);
        Object objF6 = interfaceC1554l.f();
        if (zL2 || objF6 == companion.a()) {
            objF6 = new b(gVar, c4737a, x1VarM2, x1VarM, null);
            interfaceC1554l.J(objF6);
        }
        C1516O.e(gVar, (p) objF6, interfaceC1554l, 0);
        x1<T> x1VarG = (x1) interfaceC1563p0.getValue();
        if (x1VarG == null) {
            x1VarG = c4737a.g();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Ba.l<T, C4153F> d(x1<? extends Ba.l<? super T, C4153F>> x1Var) {
        return x1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> InterfaceC4753i<T> e(x1<? extends InterfaceC4753i<T>> x1Var) {
        return x1Var.getValue();
    }
}
