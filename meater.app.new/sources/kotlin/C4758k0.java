package kotlin;

import Ba.l;
import Ba.p;
import b0.k;
import kotlin.C1547h0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SuspendAnimation.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001az\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001at\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001aj\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001ap\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0080@¢\u0006\u0004\b \u0010!\u001aJ\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000b\"\b\b\u0002\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u0015H\u0082@¢\u0006\u0004\b$\u0010%\u001aC\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0087\u0001\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0087\u0001\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u0010*\u001a\u00020\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Lv/i;", "animationSpec", "Lkotlin/Function2;", "Loa/F;", "block", "b", "(FFFLv/i;LBa/p;Lta/d;)Ljava/lang/Object;", "T", "Lv/q;", "V", "Lv/q0;", "typeConverter", "d", "(Lv/q0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lv/i;LBa/p;Lta/d;)Ljava/lang/Object;", "Lv/k;", "", "sequentialAnimation", "Lkotlin/Function1;", "Lv/h;", "i", "(Lv/k;Ljava/lang/Object;Lv/i;ZLBa/l;Lta/d;)Ljava/lang/Object;", "Lv/z;", "g", "(Lv/k;Lv/z;ZLBa/l;Lta/d;)Ljava/lang/Object;", "Lv/d;", "animation", "", "startTimeNanos", "c", "(Lv/k;Lv/d;JLBa/l;Lta/d;)Ljava/lang/Object;", "R", "onFrame", "k", "(Lv/d;LBa/l;Lta/d;)Ljava/lang/Object;", "state", "o", "(Lv/h;Lv/k;)V", "frameTimeNanos", "durationScale", "anim", "m", "(Lv/h;JFLv/d;Lv/k;LBa/l;)V", "playTimeNanos", "l", "(Lv/h;JJLv/d;Lv/k;LBa/l;)V", "Lta/g;", "n", "(Lta/g;)F", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4758k0 {

    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "Lv/h;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$a */
    static final class a<T, V> extends AbstractC3864v implements l<C4751h<T, V>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<T, T, C4153F> f50786B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC4770q0<T, V> f50787C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super T, ? super T, C4153F> pVar, InterfaceC4770q0<T, V> interfaceC4770q0) {
            super(1);
            this.f50786B = pVar;
            this.f50787C = interfaceC4770q0;
        }

        public final void a(C4751h<T, V> c4751h) {
            this.f50786B.invoke(c4751h.e(), this.f50787C.b().invoke(c4751h.g()));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a((C4751h) obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.k0$b */
    static final class b<T, V extends AbstractC4769q> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f50788B;

        /* renamed from: C, reason: collision with root package name */
        Object f50789C;

        /* renamed from: D, reason: collision with root package name */
        Object f50790D;

        /* renamed from: E, reason: collision with root package name */
        Object f50791E;

        /* renamed from: F, reason: collision with root package name */
        /* synthetic */ Object f50792F;

        /* renamed from: G, reason: collision with root package name */
        int f50793G;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f50792F = obj;
            this.f50793G |= Integer.MIN_VALUE;
            return C4758k0.c(null, null, 0L, null, this);
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lv/q;", "V", "", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$d */
    static final class d extends AbstractC3864v implements l<Long, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<C4751h<T, V>> f50795B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ T f50796C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC4743d<T, V> f50797D;

        /* renamed from: E, reason: collision with root package name */
        /* JADX INFO: Incorrect field signature: TV; */
        final /* synthetic */ AbstractC4769q f50798E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f50799F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f50800G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ l<C4751h<T, V>, C4153F> f50801H;

        /* compiled from: SuspendAnimation.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.k0$d$a */
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AnimationState<T, V> f50802B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AnimationState<T, V> animationState) {
                super(0);
                this.f50802B = animationState;
            }

            public final void a() {
                this.f50802B.u(false);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/O<Lv/h<TT;TV;>;>;TT;Lv/d<TT;TV;>;TV;Lv/k<TT;TV;>;FLBa/l<-Lv/h<TT;TV;>;Loa/F;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(O o10, Object obj, InterfaceC4743d interfaceC4743d, AbstractC4769q abstractC4769q, AnimationState animationState, float f10, l lVar) {
            super(1);
            this.f50795B = o10;
            this.f50796C = obj;
            this.f50797D = interfaceC4743d;
            this.f50798E = abstractC4769q;
            this.f50799F = animationState;
            this.f50800G = f10;
            this.f50801H = lVar;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, v.h] */
        public final void a(long j10) {
            O<C4751h<T, V>> o10 = this.f50795B;
            ?? c4751h = new C4751h(this.f50796C, this.f50797D.c(), this.f50798E, j10, this.f50797D.g(), j10, true, new a(this.f50799F));
            C4758k0.m(c4751h, j10, this.f50800G, this.f50797D, this.f50799F, this.f50801H);
            o10.f43978B = c4751h;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
            a(l10.longValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lv/q;", "V", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$e */
    static final class e extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f50803B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AnimationState<T, V> animationState) {
            super(0);
            this.f50803B = animationState;
        }

        public final void a() {
            this.f50803B.u(false);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lv/q;", "V", "", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$f */
    static final class f extends AbstractC3864v implements l<Long, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<C4751h<T, V>> f50804B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f50805C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC4743d<T, V> f50806D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AnimationState<T, V> f50807E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ l<C4751h<T, V>, C4153F> f50808F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(O<C4751h<T, V>> o10, float f10, InterfaceC4743d<T, V> interfaceC4743d, AnimationState<T, V> animationState, l<? super C4751h<T, V>, C4153F> lVar) {
            super(1);
            this.f50804B = o10;
            this.f50805C = f10;
            this.f50806D = interfaceC4743d;
            this.f50807E = animationState;
            this.f50808F = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j10) {
            T t10 = this.f50804B.f43978B;
            C3862t.d(t10);
            C4758k0.m((C4751h) t10, j10, this.f50805C, this.f50806D, this.f50807E, this.f50808F);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
            a(l10.longValue());
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lv/q;", "V", "", "it", "a", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$i */
    static final class i<R> extends AbstractC3864v implements l<Long, R> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ l<Long, R> f50811B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(l<? super Long, ? extends R> lVar) {
            super(1);
            this.f50811B = lVar;
        }

        public final R a(long j10) {
            return this.f50811B.invoke(Long.valueOf(j10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, InterfaceC4753i<Float> interfaceC4753i, p<? super Float, ? super Float, C4153F> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = d(C4774s0.i(C3856m.f44008a), kotlin.coroutines.jvm.internal.b.b(f10), kotlin.coroutines.jvm.internal.b.b(f11), kotlin.coroutines.jvm.internal.b.b(f12), interfaceC4753i, pVar, interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, v.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends kotlin.AbstractC4769q> java.lang.Object c(kotlin.AnimationState<T, V> r25, kotlin.InterfaceC4743d<T, V> r26, long r27, Ba.l<? super kotlin.C4751h<T, V>, oa.C4153F> r29, ta.InterfaceC4588d<? super oa.C4153F> r30) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C4758k0.c(v.k, v.d, long, Ba.l, ta.d):java.lang.Object");
    }

    public static final <T, V extends AbstractC4769q> Object d(InterfaceC4770q0<T, V> interfaceC4770q0, T t10, T t11, T t12, InterfaceC4753i<T> interfaceC4753i, p<? super T, ? super T, C4153F> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        V vG;
        if (t12 == null || (vG = interfaceC4770q0.a().invoke(t12)) == null) {
            vG = C4771r.g(interfaceC4770q0.a().invoke(t10));
        }
        Object objF = f(new AnimationState(interfaceC4770q0, t10, vG, 0L, 0L, false, 56, null), new C4760l0(interfaceC4753i, interfaceC4770q0, t10, t11, vG), 0L, new a(pVar, interfaceC4770q0), interfaceC4588d, 2, null);
        return objF == C4696b.e() ? objF : C4153F.f46609a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, InterfaceC4753i interfaceC4753i, p pVar, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        float f13 = (i10 & 4) != 0 ? 0.0f : f12;
        if ((i10 & 8) != 0) {
            interfaceC4753i = C4755j.h(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f13, interfaceC4753i, pVar, interfaceC4588d);
    }

    public static /* synthetic */ Object f(AnimationState animationState, InterfaceC4743d interfaceC4743d, long j10, l lVar, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar = c.f50794B;
        }
        return c(animationState, interfaceC4743d, j11, lVar, interfaceC4588d);
    }

    public static final <T, V extends AbstractC4769q> Object g(AnimationState<T, V> animationState, InterfaceC4787z<T> interfaceC4787z, boolean z10, l<? super C4751h<T, V>, C4153F> lVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objC = c(animationState, new C4785y(interfaceC4787z, animationState.j(), animationState.getValue(), animationState.q()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, interfaceC4588d);
        return objC == C4696b.e() ? objC : C4153F.f46609a;
    }

    public static /* synthetic */ Object h(AnimationState animationState, InterfaceC4787z interfaceC4787z, boolean z10, l lVar, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = g.f50809B;
        }
        return g(animationState, interfaceC4787z, z10, lVar, interfaceC4588d);
    }

    public static final <T, V extends AbstractC4769q> Object i(AnimationState<T, V> animationState, T t10, InterfaceC4753i<T> interfaceC4753i, boolean z10, l<? super C4751h<T, V>, C4153F> lVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objC = c(animationState, new C4760l0(interfaceC4753i, animationState.j(), animationState.getValue(), t10, animationState.q()), z10 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, interfaceC4588d);
        return objC == C4696b.e() ? objC : C4153F.f46609a;
    }

    public static /* synthetic */ Object j(AnimationState animationState, Object obj, InterfaceC4753i interfaceC4753i, boolean z10, l lVar, InterfaceC4588d interfaceC4588d, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC4753i = C4755j.h(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC4753i interfaceC4753i2 = interfaceC4753i;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = h.f50810B;
        }
        return i(animationState, obj, interfaceC4753i2, z11, lVar, interfaceC4588d);
    }

    private static final <R, T, V extends AbstractC4769q> Object k(InterfaceC4743d<T, V> interfaceC4743d, l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        return interfaceC4743d.getIsInfinite() ? C4723L.a(lVar, interfaceC4588d) : C1547h0.b(new i(lVar), interfaceC4588d);
    }

    private static final <T, V extends AbstractC4769q> void l(C4751h<T, V> c4751h, long j10, long j11, InterfaceC4743d<T, V> interfaceC4743d, AnimationState<T, V> animationState, l<? super C4751h<T, V>, C4153F> lVar) {
        c4751h.j(j10);
        c4751h.l(interfaceC4743d.f(j11));
        c4751h.m(interfaceC4743d.d(j11));
        if (interfaceC4743d.e(j11)) {
            c4751h.i(c4751h.getLastFrameTimeNanos());
            c4751h.k(false);
        }
        o(c4751h, animationState);
        lVar.invoke(c4751h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AbstractC4769q> void m(C4751h<T, V> c4751h, long j10, float f10, InterfaceC4743d<T, V> interfaceC4743d, AnimationState<T, V> animationState, l<? super C4751h<T, V>, C4153F> lVar) {
        l(c4751h, j10, f10 == 0.0f ? interfaceC4743d.getDurationNanos() : (long) ((j10 - c4751h.getStartTimeNanos()) / f10), interfaceC4743d, animationState, lVar);
    }

    public static final float n(ta.g gVar) {
        k kVar = (k) gVar.b(k.INSTANCE);
        float fZ = kVar != null ? kVar.z() : 1.0f;
        if (!(fZ >= 0.0f)) {
            C4736Z.b("negative scale factor");
        }
        return fZ;
    }

    public static final <T, V extends AbstractC4769q> void o(C4751h<T, V> c4751h, AnimationState<T, V> animationState) {
        animationState.v(c4751h.e());
        C4771r.f(animationState.q(), c4751h.g());
        animationState.s(c4751h.getFinishedTimeNanos());
        animationState.t(c4751h.getLastFrameTimeNanos());
        animationState.u(c4751h.h());
    }

    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "Lv/h;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$c */
    static final class c extends AbstractC3864v implements l {

        /* renamed from: B, reason: collision with root package name */
        public static final c f50794B = new c();

        c() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4751h) obj);
            return C4153F.f46609a;
        }

        public final void a(C4751h c4751h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "Lv/h;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$g */
    public static final class g extends AbstractC3864v implements l {

        /* renamed from: B, reason: collision with root package name */
        public static final g f50809B = new g();

        g() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4751h) obj);
            return C4153F.f46609a;
        }

        public final void a(C4751h c4751h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lv/q;", "V", "Lv/h;", "Loa/F;", "a", "(Lv/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.k0$h */
    public static final class h extends AbstractC3864v implements l {

        /* renamed from: B, reason: collision with root package name */
        public static final h f50810B = new h();

        h() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4751h) obj);
            return C4153F.f46609a;
        }

        public final void a(C4751h c4751h) {
        }
    }
}
