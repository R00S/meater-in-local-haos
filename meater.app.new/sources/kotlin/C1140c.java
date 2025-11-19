package kotlin;

import Ba.a;
import Ba.l;
import Ba.p;
import Ba.q;
import Ba.r;
import kotlin.C1491B0;
import kotlin.InterfaceC1555l0;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC4753i;
import kotlin.InterfaceC5031k;
import kotlin.InterfaceC5033m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4170o;
import oa.C4173r;
import oa.v;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.EnumC4950C;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0001\u0018\u0000 S*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00011BU\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b!\u0010\"JJ\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020#2.\u0010(\u001a*\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020%H\u0086@¢\u0006\u0004\b)\u0010*JX\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010$\u001a\u00020#24\u0010(\u001a0\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020+H\u0086@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0000¢\u0006\u0004\b/\u00100R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010H\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR+\u0010\u0010\u001a\u00028\u00002\u0006\u0010I\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001b\u0010\u0016\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010MR\u001b\u0010T\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010Q\u001a\u0004\bS\u0010MR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010U\u001a\u0004\bV\u0010\u001a\"\u0004\bW\u0010XR\u001b\u0010[\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Q\u001a\u0004\bZ\u0010\u001aR+\u0010^\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010U\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010XR/\u0010a\u001a\u0004\u0018\u00018\u00002\b\u0010I\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010K\u001a\u0004\b_\u0010M\"\u0004\b`\u0010OR7\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010K\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010gR\u0011\u0010k\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"LI/c;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lv/i;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;LBa/l;LBa/a;Lv/i;LBa/l;)V", "offset", "currentValue", "velocity", "l", "(FLjava/lang/Object;F)Ljava/lang/Object;", "m", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "G", "(Ljava/lang/Object;)Z", "z", "()F", "LI/u;", "newAnchors", "newTarget", "Loa/F;", "H", "(LI/u;Ljava/lang/Object;)V", "F", "(FLta/d;)Ljava/lang/Object;", "Lw/C;", "dragPriority", "Lkotlin/Function3;", "LI/a;", "Lta/d;", "block", "j", "(Lw/C;LBa/q;Lta/d;)Ljava/lang/Object;", "Lkotlin/Function4;", "i", "(Ljava/lang/Object;Lw/C;LBa/r;Lta/d;)Ljava/lang/Object;", "delta", "y", "(F)F", "a", "LBa/l;", "getPositionalThreshold$material_release", "()LBa/l;", "b", "LBa/a;", "getVelocityThreshold$material_release", "()LBa/a;", "c", "Lv/i;", "o", "()Lv/i;", "d", "q", "LI/N;", "e", "LI/N;", "dragMutex", "Lx/m;", "f", "Lx/m;", "t", "()Lx/m;", "draggableState", "<set-?>", "g", "LO/p0;", "r", "()Ljava/lang/Object;", "B", "(Ljava/lang/Object;)V", "h", "LO/x1;", "w", "p", "closestValue", "LO/l0;", "v", "E", "(F)V", "k", "getProgress", "progress", "u", "D", "lastVelocity", "s", "C", "dragTarget", "n", "()LI/u;", "A", "(LI/u;)V", "anchors", "LI/a;", "anchoredDragScope", "x", "()Z", "isAnimationRunning", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1140c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, Float> positionalThreshold;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a<Float> velocityThreshold;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4753i<Float> animationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<T, Boolean> confirmValueChange;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 currentValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C1127N dragMutex = new C1127N();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5033m draggableState = new h(this);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final x1 targetValue = m1.d(new j(this));

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x1 closestValue = m1.d(new g(this));

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1555l0 offset = C1491B0.a(Float.NaN);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final x1 progress = m1.e(m1.o(), new i(this));

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1555l0 lastVelocity = C1491B0.a(0.0f);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 dragTarget = r1.c(null, null, 2, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 anchors = r1.c(C1139b.h(), null, 2, null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1138a anchoredDragScope = new f(this);

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {539}, m = "anchoredDrag")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f6109B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f6110C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6111D;

        /* renamed from: E, reason: collision with root package name */
        int f6112E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C1140c<T> c1140c, InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
            this.f6111D = c1140c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6110C = obj;
            this.f6112E |= Integer.MIN_VALUE;
            return this.f6111D.j(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {540}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loa/F;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.c$c, reason: collision with other inner class name */
    static final class C0118c extends kotlin.coroutines.jvm.internal.l implements l<InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6113B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6114C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q<InterfaceC1138a, InterfaceC1158u<T>, InterfaceC4588d<? super C4153F>, Object> f6115D;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LI/u;", "a", "()LI/u;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.c$c$a */
        static final class a extends AbstractC3864v implements Ba.a<InterfaceC1158u<T>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1140c<T> f6116B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1140c<T> c1140c) {
                super(0);
                this.f6116B = c1140c;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC1158u<T> invoke() {
                return this.f6116B.n();
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {541}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LI/u;", "latestAnchors", "Loa/F;", "<anonymous>", "(LI/u;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.c$c$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC1158u<T>, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6117B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f6118C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ q<InterfaceC1138a, InterfaceC1158u<T>, InterfaceC4588d<? super C4153F>, Object> f6119D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C1140c<T> f6120E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(q<? super InterfaceC1138a, ? super InterfaceC1158u<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, C1140c<T> c1140c, InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f6119D = qVar;
                this.f6120E = c1140c;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1158u<T> interfaceC1158u, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((b) create(interfaceC1158u, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                b bVar = new b(this.f6119D, this.f6120E, interfaceC4588d);
                bVar.f6118C = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f6117B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    InterfaceC1158u<T> interfaceC1158u = (InterfaceC1158u) this.f6118C;
                    q<InterfaceC1138a, InterfaceC1158u<T>, InterfaceC4588d<? super C4153F>, Object> qVar = this.f6119D;
                    InterfaceC1138a interfaceC1138a = ((C1140c) this.f6120E).anchoredDragScope;
                    this.f6117B = 1;
                    if (qVar.g(interfaceC1138a, interfaceC1158u, this) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0118c(C1140c<T> c1140c, q<? super InterfaceC1138a, ? super InterfaceC1158u<T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, InterfaceC4588d<? super C0118c> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f6114C = c1140c;
            this.f6115D = qVar;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0118c) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return new C0118c(this.f6114C, this.f6115D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6113B;
            if (i10 == 0) {
                C4173r.b(obj);
                a aVar = new a(this.f6114C);
                b bVar = new b(this.f6115D, this.f6114C, null);
                this.f6113B = 1;
                if (C1139b.i(aVar, bVar, this) == objE) {
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

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {585}, m = "anchoredDrag")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f6121B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f6122C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6123D;

        /* renamed from: E, reason: collision with root package name */
        int f6124E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C1140c<T> c1140c, InterfaceC4588d<? super d> interfaceC4588d) {
            super(interfaceC4588d);
            this.f6123D = c1140c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6122C = obj;
            this.f6124E |= Integer.MIN_VALUE;
            return this.f6123D.i(null, null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {587}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loa/F;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.c$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements l<InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6125B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6126C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ T f6127D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ r<InterfaceC1138a, InterfaceC1158u<T>, T, InterfaceC4588d<? super C4153F>, Object> f6128E;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Loa/o;", "LI/u;", "a", "()Loa/o;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.c$e$a */
        static final class a extends AbstractC3864v implements Ba.a<C4170o<? extends InterfaceC1158u<T>, ? extends T>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1140c<T> f6129B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1140c<T> c1140c) {
                super(0);
                this.f6129B = c1140c;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4170o<InterfaceC1158u<T>, T> invoke() {
                return v.a(this.f6129B.n(), this.f6129B.w());
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {590}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Loa/o;", "LI/u;", "<name for destructuring parameter 0>", "Loa/F;", "<anonymous>", "(Loa/o;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.c$e$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements p<C4170o<? extends InterfaceC1158u<T>, ? extends T>, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6130B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f6131C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ r<InterfaceC1138a, InterfaceC1158u<T>, T, InterfaceC4588d<? super C4153F>, Object> f6132D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C1140c<T> f6133E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(r<? super InterfaceC1138a, ? super InterfaceC1158u<T>, ? super T, ? super InterfaceC4588d<? super C4153F>, ? extends Object> rVar, C1140c<T> c1140c, InterfaceC4588d<? super b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f6132D = rVar;
                this.f6133E = c1140c;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C4170o<? extends InterfaceC1158u<T>, ? extends T> c4170o, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((b) create(c4170o, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                b bVar = new b(this.f6132D, this.f6133E, interfaceC4588d);
                bVar.f6131C = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f6130B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C4170o c4170o = (C4170o) this.f6131C;
                    InterfaceC1158u interfaceC1158u = (InterfaceC1158u) c4170o.a();
                    Object objB = c4170o.b();
                    r<InterfaceC1138a, InterfaceC1158u<T>, T, InterfaceC4588d<? super C4153F>, Object> rVar = this.f6132D;
                    InterfaceC1138a interfaceC1138a = ((C1140c) this.f6133E).anchoredDragScope;
                    this.f6130B = 1;
                    if (rVar.k(interfaceC1138a, interfaceC1158u, objB, this) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C1140c<T> c1140c, T t10, r<? super InterfaceC1138a, ? super InterfaceC1158u<T>, ? super T, ? super InterfaceC4588d<? super C4153F>, ? extends Object> rVar, InterfaceC4588d<? super e> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f6126C = c1140c;
            this.f6127D = t10;
            this.f6128E = rVar;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return new e(this.f6126C, this.f6127D, this.f6128E, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6125B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f6126C.C(this.f6127D);
                a aVar = new a(this.f6126C);
                b bVar = new b(this.f6128E, this.f6126C, null);
                this.f6125B = 1;
                if (C1139b.i(aVar, bVar, this) == objE) {
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

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"I/c$f", "LI/a;", "", "newOffset", "lastKnownVelocity", "Loa/F;", "a", "(FF)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.c$f */
    public static final class f implements InterfaceC1138a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6134a;

        f(C1140c<T> c1140c) {
            this.f6134a = c1140c;
        }

        @Override // kotlin.InterfaceC1138a
        public void a(float newOffset, float lastKnownVelocity) {
            this.f6134a.E(newOffset);
            this.f6134a.D(lastKnownVelocity);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.c$g */
    static final class g extends AbstractC3864v implements a<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6135B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1140c<T> c1140c) {
            super(0);
            this.f6135B = c1140c;
        }

        @Override // Ba.a
        public final T invoke() {
            T t10 = (T) this.f6135B.s();
            if (t10 != null) {
                return t10;
            }
            C1140c<T> c1140c = this.f6135B;
            float fV = c1140c.v();
            return !Float.isNaN(fV) ? (T) c1140c.m(fV, c1140c.r()) : c1140c.r();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\f\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"I/c$h", "Lx/m;", "Lw/C;", "dragPriority", "Lkotlin/Function2;", "Lx/k;", "Lta/d;", "Loa/F;", "", "block", "a", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "I/c$h$b", "LI/c$h$b;", "dragScope", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.c$h */
    public static final class h implements InterfaceC5033m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b dragScope;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6137b;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {292}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LI/a;", "LI/u;", "it", "Loa/F;", "<anonymous>", "(LI/a;LI/u;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.c$h$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements q<InterfaceC1138a, InterfaceC1158u<T>, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6138B;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC5031k, InterfaceC4588d<? super C4153F>, Object> f6140D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, InterfaceC4588d interfaceC4588d) {
                super(3, interfaceC4588d);
                this.f6140D = pVar;
            }

            @Override // Ba.q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object g(InterfaceC1138a interfaceC1138a, InterfaceC1158u<T> interfaceC1158u, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return h.this.new a(this.f6140D, interfaceC4588d).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f6138B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    b bVar = h.this.dragScope;
                    p<InterfaceC5031k, InterfaceC4588d<? super C4153F>, Object> pVar = this.f6140D;
                    this.f6138B = 1;
                    if (pVar.invoke(bVar, this) == objE) {
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

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"I/c$h$b", "Lx/k;", "", "pixels", "Loa/F;", "a", "(F)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: I.c$h$b */
        public static final class b implements InterfaceC5031k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1140c<T> f6141a;

            b(C1140c<T> c1140c) {
                this.f6141a = c1140c;
            }

            @Override // kotlin.InterfaceC5031k
            public void a(float pixels) {
                InterfaceC1138a.b(((C1140c) this.f6141a).anchoredDragScope, this.f6141a.y(pixels), 0.0f, 2, null);
            }
        }

        h(C1140c<T> c1140c) {
            this.f6137b = c1140c;
            this.dragScope = new b(c1140c);
        }

        @Override // kotlin.InterfaceC5033m
        public Object a(EnumC4950C enumC4950C, p<? super InterfaceC5031k, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) throws Throwable {
            Object objJ = this.f6137b.j(enumC4950C, new a(pVar, null), interfaceC4588d);
            return objJ == C4696b.e() ? objJ : C4153F.f46609a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.c$i */
    static final class i extends AbstractC3864v implements a<Float> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6142B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C1140c<T> c1140c) {
            super(0);
            this.f6142B = c1140c;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float fD = this.f6142B.n().d(this.f6142B.r());
            float fD2 = this.f6142B.n().d(this.f6142B.p()) - fD;
            float fAbs = Math.abs(fD2);
            float f10 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fZ = (this.f6142B.z() - fD) / fD2;
                if (fZ < 1.0E-6f) {
                    f10 = 0.0f;
                } else if (fZ <= 0.999999f) {
                    f10 = fZ;
                }
            }
            return Float.valueOf(f10);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.c$j */
    static final class j extends AbstractC3864v implements a<T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6143B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C1140c<T> c1140c) {
            super(0);
            this.f6143B = c1140c;
        }

        @Override // Ba.a
        public final T invoke() {
            T t10 = (T) this.f6143B.s();
            if (t10 != null) {
                return t10;
            }
            C1140c<T> c1140c = this.f6143B;
            float fV = c1140c.v();
            return !Float.isNaN(fV) ? (T) c1140c.l(fV, c1140c.r(), 0.0f) : c1140c.r();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.c$k */
    static final class k extends AbstractC3864v implements a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6144B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ T f6145C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C1140c<T> c1140c, T t10) {
            super(0);
            this.f6144B = c1140c;
            this.f6145C = t10;
        }

        public final void a() {
            InterfaceC1138a interfaceC1138a = ((C1140c) this.f6144B).anchoredDragScope;
            C1140c<T> c1140c = this.f6144B;
            T t10 = this.f6145C;
            float fD = c1140c.n().d(t10);
            if (!Float.isNaN(fD)) {
                InterfaceC1138a.b(interfaceC1138a, fD, 0.0f, 2, null);
                c1140c.C(null);
            }
            c1140c.B(t10);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1140c(T t10, l<? super Float, Float> lVar, a<Float> aVar, InterfaceC4753i<Float> interfaceC4753i, l<? super T, Boolean> lVar2) {
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = interfaceC4753i;
        this.confirmValueChange = lVar2;
        this.currentValue = r1.c(t10, null, 2, null);
    }

    private final void A(InterfaceC1158u<T> interfaceC1158u) {
        this.anchors.setValue(interfaceC1158u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(T t10) {
        this.currentValue.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(T t10) {
        this.dragTarget.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(float f10) {
        this.lastVelocity.f(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(float f10) {
        this.offset.f(f10);
    }

    private final boolean G(T targetValue) {
        return this.dragMutex.e(new k(this, targetValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I(C1140c c1140c, InterfaceC1158u interfaceC1158u, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(c1140c.v()) || (obj = interfaceC1158u.c(c1140c.v())) == null)) {
            obj = c1140c.w();
        }
        c1140c.H(interfaceC1158u, obj);
    }

    public static /* synthetic */ Object k(C1140c c1140c, Object obj, EnumC4950C enumC4950C, r rVar, InterfaceC4588d interfaceC4588d, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            enumC4950C = EnumC4950C.Default;
        }
        return c1140c.i(obj, enumC4950C, rVar, interfaceC4588d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T l(float offset, T currentValue, float velocity) {
        T tB;
        InterfaceC1158u<T> interfaceC1158uN = n();
        float fD = interfaceC1158uN.d(currentValue);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fD == offset || Float.isNaN(fD)) {
            return currentValue;
        }
        if (fD < offset) {
            if (velocity >= fFloatValue) {
                T tB2 = interfaceC1158uN.b(offset, true);
                C3862t.d(tB2);
                return tB2;
            }
            tB = interfaceC1158uN.b(offset, true);
            C3862t.d(tB);
            if (offset < Math.abs(fD + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(interfaceC1158uN.d(tB) - fD))).floatValue()))) {
                return currentValue;
            }
        } else {
            if (velocity <= (-fFloatValue)) {
                T tB3 = interfaceC1158uN.b(offset, false);
                C3862t.d(tB3);
                return tB3;
            }
            tB = interfaceC1158uN.b(offset, false);
            C3862t.d(tB);
            float fAbs = Math.abs(fD - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fD - interfaceC1158uN.d(tB)))).floatValue()));
            if (offset < 0.0f) {
                if (Math.abs(offset) < fAbs) {
                    return currentValue;
                }
            } else if (offset > fAbs) {
                return currentValue;
            }
        }
        return tB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T m(float offset, T currentValue) {
        T tB;
        InterfaceC1158u<T> interfaceC1158uN = n();
        float fD = interfaceC1158uN.d(currentValue);
        if (fD == offset || Float.isNaN(fD)) {
            return currentValue;
        }
        if (fD < offset) {
            tB = interfaceC1158uN.b(offset, true);
            if (tB == null) {
                return currentValue;
            }
        } else {
            tB = interfaceC1158uN.b(offset, false);
            if (tB == null) {
                return currentValue;
            }
        }
        return tB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T s() {
        return this.dragTarget.getValue();
    }

    public final Object F(float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        T tR = r();
        T tL = l(z(), tR, f10);
        if (this.confirmValueChange.invoke(tL).booleanValue()) {
            Object objF = C1139b.f(this, tL, f10, interfaceC4588d);
            return objF == C4696b.e() ? objF : C4153F.f46609a;
        }
        Object objF2 = C1139b.f(this, tR, f10, interfaceC4588d);
        return objF2 == C4696b.e() ? objF2 : C4153F.f46609a;
    }

    public final void H(InterfaceC1158u<T> newAnchors, T newTarget) {
        if (C3862t.b(n(), newAnchors)) {
            return;
        }
        A(newAnchors);
        if (G(newTarget)) {
            return;
        }
        C(newTarget);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(T r7, w.EnumC4950C r8, Ba.r<? super kotlin.InterfaceC1138a, ? super kotlin.InterfaceC1158u<T>, ? super T, ? super ta.InterfaceC4588d<? super oa.C4153F>, ? extends java.lang.Object> r9, ta.InterfaceC4588d<? super oa.C4153F> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof kotlin.C1140c.d
            if (r0 == 0) goto L13
            r0 = r10
            I.c$d r0 = (kotlin.C1140c.d) r0
            int r1 = r0.f6124E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6124E = r1
            goto L18
        L13:
            I.c$d r0 = new I.c$d
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f6122C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f6124E
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.f6121B
            I.c r7 = (kotlin.C1140c) r7
            oa.C4173r.b(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            oa.C4173r.b(r10)
            I.u r10 = r6.n()
            boolean r10 = r10.e(r7)
            if (r10 == 0) goto Lcc
            I.N r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L92
            I.c$e r2 = new I.c$e     // Catch: java.lang.Throwable -> L92
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.f6121B = r6     // Catch: java.lang.Throwable -> L92
            r0.f6124E = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.C(r5)
            I.u r8 = r7.n()
            float r9 = r7.v()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto Lcf
            float r9 = r7.v()
            I.u r10 = r7.n()
            float r10 = r10.d(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcf
            Ba.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcf
            r7.B(r8)
            goto Lcf
        L92:
            r8 = move-exception
            r7 = r6
        L94:
            r7.C(r5)
            I.u r9 = r7.n()
            float r10 = r7.v()
            java.lang.Object r9 = r9.c(r10)
            if (r9 == 0) goto Lcb
            float r10 = r7.v()
            I.u r0 = r7.n()
            float r0 = r0.d(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcb
            Ba.l<T, java.lang.Boolean> r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcb
            r7.B(r9)
        Lcb:
            throw r8
        Lcc:
            r6.B(r7)
        Lcf:
            oa.F r7 = oa.C4153F.f46609a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1140c.i(java.lang.Object, w.C, Ba.r, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(w.EnumC4950C r7, Ba.q<? super kotlin.InterfaceC1138a, ? super kotlin.InterfaceC1158u<T>, ? super ta.InterfaceC4588d<? super oa.C4153F>, ? extends java.lang.Object> r8, ta.InterfaceC4588d<? super oa.C4153F> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kotlin.C1140c.b
            if (r0 == 0) goto L13
            r0 = r9
            I.c$b r0 = (kotlin.C1140c.b) r0
            int r1 = r0.f6112E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6112E = r1
            goto L18
        L13:
            I.c$b r0 = new I.c$b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f6110C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f6112E
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.f6109B
            I.c r7 = (kotlin.C1140c) r7
            oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            oa.C4173r.b(r9)
            I.N r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L87
            I.c$c r2 = new I.c$c     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.f6109B = r6     // Catch: java.lang.Throwable -> L87
            r0.f6112E = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            I.u r8 = r7.n()
            float r9 = r7.v()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L84
            float r9 = r7.v()
            I.u r0 = r7.n()
            float r0 = r0.d(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            Ba.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.B(r8)
        L84:
            oa.F r7 = oa.C4153F.f46609a
            return r7
        L87:
            r8 = move-exception
            r7 = r6
        L89:
            I.u r9 = r7.n()
            float r0 = r7.v()
            java.lang.Object r9 = r9.c(r0)
            if (r9 == 0) goto Lbd
            float r0 = r7.v()
            I.u r1 = r7.n()
            float r1 = r1.d(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbd
            Ba.l<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.B(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1140c.j(w.C, Ba.q, ta.d):java.lang.Object");
    }

    public final InterfaceC1158u<T> n() {
        return (InterfaceC1158u) this.anchors.getValue();
    }

    public final InterfaceC4753i<Float> o() {
        return this.animationSpec;
    }

    public final T p() {
        return (T) this.closestValue.getValue();
    }

    public final l<T, Boolean> q() {
        return this.confirmValueChange;
    }

    public final T r() {
        return this.currentValue.getValue();
    }

    /* renamed from: t, reason: from getter */
    public final InterfaceC5033m getDraggableState() {
        return this.draggableState;
    }

    public final float u() {
        return this.lastVelocity.b();
    }

    public final float v() {
        return this.offset.b();
    }

    public final T w() {
        return (T) this.targetValue.getValue();
    }

    public final boolean x() {
        return s() != null;
    }

    public final float y(float delta) {
        return Ha.g.j((Float.isNaN(v()) ? 0.0f : v()) + delta, n().a(), n().f());
    }

    public final float z() {
        if (Float.isNaN(v())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return v();
    }
}
