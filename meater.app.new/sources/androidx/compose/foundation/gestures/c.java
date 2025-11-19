package androidx.compose.foundation.gestures;

import Ba.p;
import Ba.q;
import U0.y;
import Xb.C1841i;
import Xb.I;
import androidx.compose.foundation.gestures.a;
import h0.C3476g;
import kotlin.C5032l;
import kotlin.EnumC5037q;
import kotlin.InterfaceC5031k;
import kotlin.InterfaceC5033m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.PointerInputChange;
import ua.C4696b;
import w.EnumC4950C;
import z.InterfaceC5162k;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010!\u001a\u00020\u00122.\u0010 \u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001eH\u0096@¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J§\u0001\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R8\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R8\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/foundation/gestures/c;", "Landroidx/compose/foundation/gestures/b;", "Lx/m;", "state", "Lkotlin/Function1;", "Lu0/z;", "", "canDrag", "Lx/q;", "orientation", "enabled", "Lz/k;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LXb/I;", "Lh0/g;", "Lta/d;", "Loa/F;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lx/m;LBa/l;Lx/q;ZLz/k;ZLBa/q;LBa/q;Z)V", "LU0/y;", "P2", "(J)J", "Q2", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a$b;", "forEachDelta", "y2", "(LBa/p;Lta/d;)Ljava/lang/Object;", "startedPosition", "C2", "(J)V", "velocity", "D2", "H2", "()Z", "R2", "Z", "Lx/m;", "a0", "Lx/q;", "b0", "c0", "LBa/q;", "d0", "e0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends androidx.compose.foundation.gestures.b {

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5033m state;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private EnumC5037q orientation;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private boolean startDragImmediately;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private q<? super I, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onDragStarted;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private q<? super I, ? super Float, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onDragStopped;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {305}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/k;", "Loa/F;", "<anonymous>", "(Lx/k;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends l implements p<InterfaceC5031k, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22061B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f22062C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<Ba.l<? super a.b, C4153F>, InterfaceC4588d<? super C4153F>, Object> f22063D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ c f22064E;

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a$b;", "dragDelta", "Loa/F;", "a", "(Landroidx/compose/foundation/gestures/a$b;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.c$a$a, reason: collision with other inner class name */
        static final class C0312a extends AbstractC3864v implements Ba.l<a.b, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC5031k f22065B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ c f22066C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0312a(InterfaceC5031k interfaceC5031k, c cVar) {
                super(1);
                this.f22065B = interfaceC5031k;
                this.f22066C = cVar;
            }

            public final void a(a.b bVar) {
                this.f22065B.a(C5032l.j(this.f22066C.Q2(bVar.getDelta()), this.f22066C.orientation));
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(a.b bVar) {
                a(bVar);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super Ba.l<? super a.b, C4153F>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, c cVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22063D = pVar;
            this.f22064E = cVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5031k interfaceC5031k, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(interfaceC5031k, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f22063D, this.f22064E, interfaceC4588d);
            aVar.f22062C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22061B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5031k interfaceC5031k = (InterfaceC5031k) this.f22062C;
                p<Ba.l<? super a.b, C4153F>, InterfaceC4588d<? super C4153F>, Object> pVar = this.f22063D;
                C0312a c0312a = new C0312a(interfaceC5031k, this.f22064E);
                this.f22061B = 1;
                if (pVar.invoke(c0312a, this) == objE) {
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

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {314}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22067B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f22068C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f22070E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22070E = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = c.this.new b(this.f22070E, interfaceC4588d);
            bVar.f22068C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22067B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f22068C;
                q qVar = c.this.onDragStarted;
                C3476g c3476gD = C3476g.d(this.f22070E);
                this.f22067B = 1;
                if (qVar.g(i11, c3476gD, this) == objE) {
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

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {321}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    static final class C0313c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22071B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f22072C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f22074E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0313c(long j10, InterfaceC4588d<? super C0313c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22074E = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            C0313c c0313c = c.this.new C0313c(this.f22074E, interfaceC4588d);
            c0313c.f22072C = obj;
            return c0313c;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0313c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22071B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f22072C;
                q qVar = c.this.onDragStopped;
                Float fB = kotlin.coroutines.jvm.internal.b.b(C5032l.k(c.this.P2(this.f22074E), c.this.orientation));
                this.f22071B = 1;
                if (qVar.g(i11, fB, this) == objE) {
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

    public c(InterfaceC5033m interfaceC5033m, Ba.l<? super PointerInputChange, Boolean> lVar, EnumC5037q enumC5037q, boolean z10, InterfaceC5162k interfaceC5162k, boolean z11, q<? super I, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, q<? super I, ? super Float, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar2, boolean z12) {
        super(lVar, z10, interfaceC5162k, enumC5037q);
        this.state = interfaceC5033m;
        this.orientation = enumC5037q;
        this.startDragImmediately = z11;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P2(long j10) {
        return y.m(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Q2(long j10) {
        return C3476g.s(j10, this.reverseDirection ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void C2(long startedPosition) {
        if (!getIsAttached() || C3862t.b(this.onDragStarted, C5032l.f52478a)) {
            return;
        }
        C1841i.d(J1(), null, null, new b(startedPosition, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void D2(long velocity) {
        if (!getIsAttached() || C3862t.b(this.onDragStopped, C5032l.f52479b)) {
            return;
        }
        C1841i.d(J1(), null, null, new C0313c(velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    /* renamed from: H2, reason: from getter */
    public boolean getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void R2(InterfaceC5033m state, Ba.l<? super PointerInputChange, Boolean> canDrag, EnumC5037q orientation, boolean enabled, InterfaceC5162k interactionSource, boolean startDragImmediately, q<? super I, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onDragStarted, q<? super I, ? super Float, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onDragStopped, boolean reverseDirection) {
        boolean z10;
        boolean z11;
        q<? super I, ? super C3476g, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar;
        if (C3862t.b(this.state, state)) {
            z10 = false;
        } else {
            this.state = state;
            z10 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z10 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
            qVar = onDragStarted;
            z11 = true;
        } else {
            z11 = z10;
            qVar = onDragStarted;
        }
        this.onDragStarted = qVar;
        this.onDragStopped = onDragStopped;
        this.startDragImmediately = startDragImmediately;
        J2(canDrag, enabled, interactionSource, orientation, z11);
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object y2(p<? super Ba.l<? super a.b, C4153F>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objA = this.state.a(EnumC4950C.UserInput, new a(pVar, this, null), interfaceC4588d);
        return objA == C4696b.e() ? objA : C4153F.f46609a;
    }
}
