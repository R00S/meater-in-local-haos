package kotlin;

import Ha.g;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC4769q;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.K;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJZ\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u001b\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u000f\u001a\u00028\u00002\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010>\u001a\u0002072\u0006\u00108\u001a\u0002078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010\u001b\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u0012\u0004\bM\u0010\u001aR\u001a\u0010P\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u0010L\u0012\u0004\bO\u0010\u001aR\u0016\u0010Q\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010LR\u0011\u0010\u0016\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010AR\u0011\u0010V\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010A¨\u0006Y"}, d2 = {"Lv/a;", "T", "Lv/q;", "V", "", "initialValue", "Lv/q0;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Lv/q0;Ljava/lang/Object;Ljava/lang/String;)V", "Lv/d;", "animation", "initialVelocity", "Lkotlin/Function1;", "Loa/F;", "block", "Lv/g;", "q", "(Lv/d;Ljava/lang/Object;LBa/l;Lta/d;)Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "()V", "targetValue", "Lv/i;", "animationSpec", "e", "(Ljava/lang/Object;Lv/i;Ljava/lang/Object;LBa/l;Lta/d;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "u", "(Lta/d;)Ljava/lang/Object;", "LO/x1;", "g", "()LO/x1;", "a", "Lv/q0;", "l", "()Lv/q0;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lv/k;", "d", "Lv/k;", "j", "()Lv/k;", "internalState", "", "<set-?>", "LO/p0;", "p", "()Z", "r", "(Z)V", "isRunning", "f", "k", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "Lv/Y;", "Lv/Y;", "mutatorMutex", "Lv/f0;", "Lv/f0;", "getDefaultSpringSpec$animation_core_release", "()Lv/f0;", "defaultSpringSpec", "Lv/q;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "m", "o", "()Lv/q;", "velocityVector", "n", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4737a<T, V extends AbstractC4769q> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4770q0<T, V> typeConverter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T visibilityThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AnimationState<T, V> internalState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isRunning;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 targetValue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C4735Y mutatorMutex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C4748f0<T> defaultSpringSpec;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final V negativeInfinityBounds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final V positiveInfinityBounds;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lowerBoundVector;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V upperBoundVector;

    /* compiled from: Animatable.kt */
    @f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {312}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Lv/g;", "<anonymous>", "()Lv/g;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.a$a, reason: collision with other inner class name */
    static final class C0725a extends l implements Ba.l<InterfaceC4588d<? super AnimationResult<T, V>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f50685B;

        /* renamed from: C, reason: collision with root package name */
        Object f50686C;

        /* renamed from: D, reason: collision with root package name */
        int f50687D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C4737a<T, V> f50688E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ T f50689F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC4743d<T, V> f50690G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f50691H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Ba.l<C4737a<T, V>, C4153F> f50692I;

        /* compiled from: Animatable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "Lv/h;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.a$a$a, reason: collision with other inner class name */
        static final class C0726a extends AbstractC3864v implements Ba.l<C4751h<T, V>, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C4737a<T, V> f50693B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f50694C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Ba.l<C4737a<T, V>, C4153F> f50695D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ K f50696E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0726a(C4737a<T, V> c4737a, AnimationState<T, V> animationState, Ba.l<? super C4737a<T, V>, C4153F> lVar, K k10) {
                super(1);
                this.f50693B = c4737a;
                this.f50694C = animationState;
                this.f50695D = lVar;
                this.f50696E = k10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(C4751h<T, V> c4751h) {
                C4758k0.o(c4751h, this.f50693B.j());
                Object objH = this.f50693B.h(c4751h.e());
                if (C3862t.b(objH, c4751h.e())) {
                    Ba.l<C4737a<T, V>, C4153F> lVar = this.f50695D;
                    if (lVar != null) {
                        lVar.invoke(this.f50693B);
                        return;
                    }
                    return;
                }
                this.f50693B.j().v(objH);
                this.f50694C.v(objH);
                Ba.l<C4737a<T, V>, C4153F> lVar2 = this.f50695D;
                if (lVar2 != null) {
                    lVar2.invoke(this.f50693B);
                }
                c4751h.a();
                this.f50696E.f43974B = true;
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
                a((C4751h) obj);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0725a(C4737a<T, V> c4737a, T t10, InterfaceC4743d<T, V> interfaceC4743d, long j10, Ba.l<? super C4737a<T, V>, C4153F> lVar, InterfaceC4588d<? super C0725a> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f50688E = c4737a;
            this.f50689F = t10;
            this.f50690G = interfaceC4743d;
            this.f50691H = j10;
            this.f50692I = lVar;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super AnimationResult<T, V>> interfaceC4588d) {
            return ((C0725a) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return new C0725a(this.f50688E, this.f50689F, this.f50690G, this.f50691H, this.f50692I, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            K k10;
            Object objE = C4696b.e();
            int i10 = this.f50687D;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    this.f50688E.j().w(this.f50688E.l().a().invoke(this.f50689F));
                    this.f50688E.s(this.f50690G.g());
                    this.f50688E.r(true);
                    AnimationState animationStateD = C4759l.d(this.f50688E.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    K k11 = new K();
                    InterfaceC4743d<T, V> interfaceC4743d = this.f50690G;
                    long j10 = this.f50691H;
                    C0726a c0726a = new C0726a(this.f50688E, animationStateD, this.f50692I, k11);
                    this.f50685B = animationStateD;
                    this.f50686C = k11;
                    this.f50687D = 1;
                    if (C4758k0.c(animationStateD, interfaceC4743d, j10, c0726a, this) == objE) {
                        return objE;
                    }
                    animationState = animationStateD;
                    k10 = k11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10 = (K) this.f50686C;
                    animationState = (AnimationState) this.f50685B;
                    C4173r.b(obj);
                }
                EnumC4745e enumC4745e = k10.f43974B ? EnumC4745e.BoundReached : EnumC4745e.Finished;
                this.f50688E.i();
                return new AnimationResult(animationState, enumC4745e);
            } catch (CancellationException e10) {
                this.f50688E.i();
                throw e10;
            }
        }
    }

    /* compiled from: Animatable.kt */
    @f(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Loa/F;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.a$b */
    static final class b extends l implements Ba.l<InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f50697B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4737a<T, V> f50698C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ T f50699D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4737a<T, V> c4737a, T t10, InterfaceC4588d<? super b> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f50698C = c4737a;
            this.f50699D = t10;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f50698C, this.f50699D, interfaceC4588d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f50697B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            this.f50698C.i();
            Object objH = this.f50698C.h(this.f50699D);
            this.f50698C.j().v(objH);
            this.f50698C.s(objH);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Animatable.kt */
    @f(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Loa/F;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.a$c */
    static final class c extends l implements Ba.l<InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f50700B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4737a<T, V> f50701C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C4737a<T, V> c4737a, InterfaceC4588d<? super c> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f50701C = c4737a;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return new c(this.f50701C, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f50700B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            this.f50701C.i();
            return C4153F.f46609a;
        }
    }

    public C4737a(T t10, InterfaceC4770q0<T, V> interfaceC4770q0, T t11, String str) {
        this.typeConverter = interfaceC4770q0;
        this.visibilityThreshold = t11;
        this.label = str;
        this.internalState = new AnimationState<>(interfaceC4770q0, t10, null, 0L, 0L, false, 60, null);
        this.isRunning = r1.c(Boolean.FALSE, null, 2, null);
        this.targetValue = r1.c(t10, null, 2, null);
        this.mutatorMutex = new C4735Y();
        this.defaultSpringSpec = new C4748f0<>(0.0f, 0.0f, t11, 3, null);
        AbstractC4769q abstractC4769qO = o();
        V v10 = abstractC4769qO instanceof C4761m ? C4739b.f50709e : abstractC4769qO instanceof C4763n ? C4739b.f50710f : abstractC4769qO instanceof C4765o ? C4739b.f50711g : C4739b.f50712h;
        C3862t.e(v10, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v10;
        AbstractC4769q abstractC4769qO2 = o();
        V v11 = abstractC4769qO2 instanceof C4761m ? C4739b.f50705a : abstractC4769qO2 instanceof C4763n ? C4739b.f50706b : abstractC4769qO2 instanceof C4765o ? C4739b.f50707c : C4739b.f50708d;
        C3862t.e(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v11;
        this.lowerBoundVector = v10;
        this.upperBoundVector = v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(C4737a c4737a, Object obj, InterfaceC4753i interfaceC4753i, Object obj2, Ba.l lVar, InterfaceC4588d interfaceC4588d, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            interfaceC4753i = c4737a.defaultSpringSpec;
        }
        InterfaceC4753i interfaceC4753i2 = interfaceC4753i;
        T tN = obj2;
        if ((i10 & 4) != 0) {
            tN = c4737a.n();
        }
        T t10 = tN;
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        return c4737a.e(obj, interfaceC4753i2, t10, lVar, interfaceC4588d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T value) {
        if (C3862t.b(this.lowerBoundVector, this.negativeInfinityBounds) && C3862t.b(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vInvoke = this.typeConverter.a().invoke(value);
        int size = vInvoke.getSize();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (vInvoke.a(i10) < this.lowerBoundVector.a(i10) || vInvoke.a(i10) > this.upperBoundVector.a(i10)) {
                vInvoke.e(i10, g.j(vInvoke.a(i10), this.lowerBoundVector.a(i10), this.upperBoundVector.a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.typeConverter.b().invoke(vInvoke) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.q().d();
        animationState.t(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(InterfaceC4743d<T, V> interfaceC4743d, T t10, Ba.l<? super C4737a<T, V>, C4153F> lVar, InterfaceC4588d<? super AnimationResult<T, V>> interfaceC4588d) {
        return C4735Y.e(this.mutatorMutex, null, new C0725a(this, t10, interfaceC4743d, this.internalState.getLastFrameTimeNanos(), lVar, null), interfaceC4588d, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(T t10) {
        this.targetValue.setValue(t10);
    }

    public final Object e(T t10, InterfaceC4753i<T> interfaceC4753i, T t11, Ba.l<? super C4737a<T, V>, C4153F> lVar, InterfaceC4588d<? super AnimationResult<T, V>> interfaceC4588d) {
        return q(C4747f.a(interfaceC4753i, this.typeConverter, m(), t10, t11), t11, lVar, interfaceC4588d);
    }

    public final x1<T> g() {
        return this.internalState;
    }

    public final AnimationState<T, V> j() {
        return this.internalState;
    }

    public final T k() {
        return this.targetValue.getValue();
    }

    public final InterfaceC4770q0<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.internalState.getValue();
    }

    public final T n() {
        return (T) this.typeConverter.b().invoke(o());
    }

    public final V o() {
        return (V) this.internalState.q();
    }

    public final boolean p() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object t(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objE = C4735Y.e(this.mutatorMutex, null, new b(this, t10, null), interfaceC4588d, 1, null);
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }

    public final Object u(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objE = C4735Y.e(this.mutatorMutex, null, new c(this, null), interfaceC4588d, 1, null);
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }

    public /* synthetic */ C4737a(Object obj, InterfaceC4770q0 interfaceC4770q0, Object obj2, String str, int i10, C3854k c3854k) {
        this(obj, interfaceC4770q0, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
