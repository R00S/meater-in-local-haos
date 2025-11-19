package kotlin;

import Ba.p;
import Ba.q;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import com.apptionlabs.meater_app.data.Config;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.O;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ta.h;
import ua.C4696b;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lbc/h;", "T", "R", "Lbc/f;", "Lkotlin/Function3;", "Lac/f;", "Lta/d;", "Loa/F;", "", "transform", "Lac/e;", "flow", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "<init>", "(LBa/q;Lac/e;Lta/g;ILZb/d;)V", "Lbc/d;", "k", "(Lta/g;ILZb/d;)Lbc/d;", "collector", "s", "(Lac/f;Lta/d;)Ljava/lang/Object;", "F", "LBa/q;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2292h<T, R> extends AbstractC2290f<T, R> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final q<InterfaceC1971f<? super R>, T, InterfaceC4588d<? super C4153F>, Object> transform;

    /* compiled from: Merge.kt */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.h$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30760B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f30761C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C2292h<T, R> f30762D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC1971f<R> f30763E;

        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: bc.h$a$a, reason: collision with other inner class name */
        static final class C0426a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ O<InterfaceC1867v0> f30764B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ I f30765C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C2292h<T, R> f30766D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ InterfaceC1971f<R> f30767E;

            /* compiled from: Merge.kt */
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: bc.h$a$a$a, reason: collision with other inner class name */
            static final class C0427a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f30768B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C2292h<T, R> f30769C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ InterfaceC1971f<R> f30770D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ T f30771E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0427a(C2292h<T, R> c2292h, InterfaceC1971f<? super R> interfaceC1971f, T t10, InterfaceC4588d<? super C0427a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f30769C = c2292h;
                    this.f30770D = interfaceC1971f;
                    this.f30771E = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0427a(this.f30769C, this.f30770D, this.f30771E, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0427a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f30768B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        q qVar = ((C2292h) this.f30769C).transform;
                        InterfaceC1971f<R> interfaceC1971f = this.f30770D;
                        T t10 = this.f30771E;
                        this.f30768B = 1;
                        if (qVar.g(interfaceC1971f, t10, this) == objE) {
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

            /* compiled from: Merge.kt */
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {26}, m = "emit")
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: bc.h$a$a$b */
            static final class b extends d {

                /* renamed from: B, reason: collision with root package name */
                Object f30772B;

                /* renamed from: C, reason: collision with root package name */
                Object f30773C;

                /* renamed from: D, reason: collision with root package name */
                Object f30774D;

                /* renamed from: E, reason: collision with root package name */
                /* synthetic */ Object f30775E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ C0426a<T> f30776F;

                /* renamed from: G, reason: collision with root package name */
                int f30777G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0426a<? super T> c0426a, InterfaceC4588d<? super b> interfaceC4588d) {
                    super(interfaceC4588d);
                    this.f30776F = c0426a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f30775E = obj;
                    this.f30777G |= Integer.MIN_VALUE;
                    return this.f30776F.a(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0426a(O<InterfaceC1867v0> o10, I i10, C2292h<T, R> c2292h, InterfaceC1971f<? super R> interfaceC1971f) {
                this.f30764B = o10;
                this.f30765C = i10;
                this.f30766D = c2292h;
                this.f30767E = interfaceC1971f;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // ac.InterfaceC1971f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(T r8, ta.InterfaceC4588d<? super oa.C4153F> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlin.C2292h.a.C0426a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    bc.h$a$a$b r0 = (kotlin.C2292h.a.C0426a.b) r0
                    int r1 = r0.f30777G
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f30777G = r1
                    goto L18
                L13:
                    bc.h$a$a$b r0 = new bc.h$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f30775E
                    java.lang.Object r1 = ua.C4696b.e()
                    int r2 = r0.f30777G
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f30774D
                    Xb.v0 r8 = (Xb.InterfaceC1867v0) r8
                    java.lang.Object r8 = r0.f30773C
                    java.lang.Object r0 = r0.f30772B
                    bc.h$a$a r0 = (kotlin.C2292h.a.C0426a) r0
                    oa.C4173r.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    oa.C4173r.b(r9)
                    kotlin.jvm.internal.O<Xb.v0> r9 = r7.f30764B
                    T r9 = r9.f43978B
                    Xb.v0 r9 = (Xb.InterfaceC1867v0) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.e(r2)
                    r0.f30772B = r7
                    r0.f30773C = r8
                    r0.f30774D = r9
                    r0.f30777G = r3
                    java.lang.Object r9 = r9.o(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.O<Xb.v0> r9 = r0.f30764B
                    Xb.I r1 = r0.f30765C
                    Xb.K r3 = Xb.K.f19033E
                    bc.h$a$a$a r4 = new bc.h$a$a$a
                    bc.h<T, R> r2 = r0.f30766D
                    ac.f<R> r0 = r0.f30767E
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    Xb.v0 r8 = Xb.C1837g.d(r1, r2, r3, r4, r5, r6)
                    r9.f43978B = r8
                    oa.F r8 = oa.C4153F.f46609a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C2292h.a.C0426a.a(java.lang.Object, ta.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C2292h<T, R> c2292h, InterfaceC1971f<? super R> interfaceC1971f, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30762D = c2292h;
            this.f30763E = interfaceC1971f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f30762D, this.f30763E, interfaceC4588d);
            aVar.f30761C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f30760B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f30761C;
                O o10 = new O();
                C2292h<T, R> c2292h = this.f30762D;
                InterfaceC1970e<S> interfaceC1970e = c2292h.flow;
                C0426a c0426a = new C0426a(o10, i11, c2292h, this.f30763E);
                this.f30760B = 1;
                if (interfaceC1970e.b(c0426a, this) == objE) {
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

    public /* synthetic */ C2292h(q qVar, InterfaceC1970e interfaceC1970e, g gVar, int i10, Zb.d dVar, int i11, C3854k c3854k) {
        this(qVar, interfaceC1970e, (i11 & 4) != 0 ? h.f50000B : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? Zb.d.f19650B : dVar);
    }

    @Override // kotlin.AbstractC2288d
    protected AbstractC2288d<R> k(g context, int capacity, Zb.d onBufferOverflow) {
        return new C2292h(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.AbstractC2290f
    protected Object s(InterfaceC1971f<? super R> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new a(this, interfaceC1971f, null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2292h(q<? super InterfaceC1971f<? super R>, ? super T, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, InterfaceC1970e<? extends T> interfaceC1970e, g gVar, int i10, Zb.d dVar) {
        super(interfaceC1970e, gVar, i10, dVar);
        this.transform = qVar;
    }
}
