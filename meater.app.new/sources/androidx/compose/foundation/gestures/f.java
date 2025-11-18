package androidx.compose.foundation.gestures;

import A0.C0830i;
import A0.C0832k;
import A0.InterfaceC0829h;
import A0.h0;
import A0.i0;
import A0.v0;
import A0.w0;
import Ba.l;
import Ba.p;
import F0.v;
import F0.x;
import Xb.C1841i;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.C2013e0;
import g0.j;
import g0.r;
import h0.C3476g;
import h0.C3477h;
import java.util.List;
import kotlin.C4612f;
import kotlin.C5022b;
import kotlin.C5026f;
import kotlin.C5028h;
import kotlin.C5042v;
import kotlin.C5046z;
import kotlin.EnumC5037q;
import kotlin.InterfaceC5024d;
import kotlin.InterfaceC5034n;
import kotlin.InterfaceC5036p;
import kotlin.InterfaceC5040t;
import kotlin.InterfaceC5044x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import s0.C4416a;
import s0.C4418c;
import s0.C4419d;
import ta.InterfaceC4588d;
import u0.C4649o;
import u0.C4652r;
import u0.EnumC4651q;
import u0.PointerInputChange;
import ua.C4696b;
import w.EnumC4950C;
import w.I;
import w.w;
import y0.InterfaceC5116v;
import z.InterfaceC5162k;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BO\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\"\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J@\u0010)\u001a\u00020\u00182.\u0010(\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00180$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&\u0012\u0006\u0012\u0004\u0018\u00010'0#H\u0096@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b2\u00103JU\u00104\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H\u0016¢\u0006\u0004\b6\u0010\u001aJ\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001aJ\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b?\u0010>J*\u0010D\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020\u0018*\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010O\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u00103R\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR*\u0010n\u001a\u0016\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010mR4\u0010p\u001a \b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010m\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/gestures/b;", "LA0/h0;", "LA0/h;", "Lg0/j;", "Ls0/e;", "LA0/v0;", "Lx/x;", "state", "Lw/I;", "overscrollEffect", "Lx/n;", "flingBehavior", "Lx/q;", "orientation", "", "enabled", "reverseDirection", "Lz/k;", "interactionSource", "Lx/d;", "bringIntoViewSpec", "<init>", "(Lx/x;Lw/I;Lx/n;Lx/q;ZZLz/k;Lx/d;)V", "Loa/F;", "R2", "()V", "P2", "N2", "Lu0/o;", "event", "LU0/r;", "size", "O2", "(Lu0/o;J)V", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/a$b;", "Lta/d;", "", "forEachDelta", "y2", "(LBa/p;Lta/d;)Ljava/lang/Object;", "Lh0/g;", "startedPosition", "C2", "(J)V", "LU0/y;", "velocity", "D2", "H2", "()Z", "Q2", "(Lx/x;Lx/q;Lw/I;ZZLx/n;Lz/k;Lx/d;)V", "T1", "e1", "Landroidx/compose/ui/focus/g;", "focusProperties", "j0", "(Landroidx/compose/ui/focus/g;)V", "Ls0/b;", "p0", "(Landroid/view/KeyEvent;)Z", "Q", "pointerEvent", "Lu0/q;", "pass", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "LF0/x;", "m1", "(LF0/x;)V", "Z", "Lw/I;", "a0", "Lx/n;", "b0", "O1", "shouldAutoInvalidate", "Lt0/b;", "c0", "Lt0/b;", "nestedScrollDispatcher", "Lx/v;", "d0", "Lx/v;", "scrollableContainerNode", "Lx/h;", "e0", "Lx/h;", "defaultFlingBehavior", "Lx/z;", "f0", "Lx/z;", "scrollingLogic", "Landroidx/compose/foundation/gestures/e;", "g0", "Landroidx/compose/foundation/gestures/e;", "nestedScrollConnection", "Lx/f;", "h0", "Lx/f;", "contentInViewNode", "Lx/t;", "i0", "Lx/t;", "scrollConfig", "", "LBa/p;", "scrollByAction", "k0", "scrollByOffsetAction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends androidx.compose.foundation.gestures.b implements h0, InterfaceC0829h, j, s0.e, v0 {

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private I overscrollEffect;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5034n flingBehavior;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final t0.b nestedScrollDispatcher;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final C5042v scrollableContainerNode;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final C5028h defaultFlingBehavior;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final C5046z scrollingLogic;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.gestures.e nestedScrollConnection;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final C5026f contentInViewNode;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5040t scrollConfig;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private p<? super Float, ? super Float, Boolean> scrollByAction;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private p<? super C3476g, ? super InterfaceC4588d<? super C3476g>, ? extends Object> scrollByOffsetAction;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/v;", "it", "Loa/F;", "a", "(Ly0/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<InterfaceC5116v, C4153F> {
        a() {
            super(1);
        }

        public final void a(InterfaceC5116v interfaceC5116v) {
            f.this.contentInViewNode.D2(interfaceC5116v);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC5116v interfaceC5116v) {
            a(interfaceC5116v);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {344}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/p;", "Loa/F;", "<anonymous>", "(Lx/p;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22111B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f22112C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<l<? super a.b, C4153F>, InterfaceC4588d<? super C4153F>, Object> f22113D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C5046z f22114E;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a$b;", "it", "Loa/F;", "a", "(Landroidx/compose/foundation/gestures/a$b;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements l<a.b, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC5036p f22115B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C5046z f22116C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5036p interfaceC5036p, C5046z c5046z) {
                super(1);
                this.f22115B = interfaceC5036p;
                this.f22116C = c5046z;
            }

            public final void a(a.b bVar) {
                this.f22115B.a(this.f22116C.x(bVar.getDelta()), t0.e.INSTANCE.b());
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(a.b bVar) {
                a(bVar);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l<? super a.b, C4153F>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, C5046z c5046z, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22113D = pVar;
            this.f22114E = c5046z;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5036p interfaceC5036p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(interfaceC5036p, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f22113D, this.f22114E, interfaceC4588d);
            bVar.f22112C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22111B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5036p interfaceC5036p = (InterfaceC5036p) this.f22112C;
                p<l<? super a.b, C4153F>, InterfaceC4588d<? super C4153F>, Object> pVar = this.f22113D;
                a aVar = new a(interfaceC5036p, this.f22114E);
                this.f22111B = 1;
                if (pVar.invoke(aVar, this) == objE) {
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

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {358}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22117B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f22119D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22119D = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return f.this.new c(this.f22119D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22117B;
            if (i10 == 0) {
                C4173r.b(obj);
                C5046z c5046z = f.this.scrollingLogic;
                long j10 = this.f22119D;
                this.f22117B = 1;
                if (c5046z.q(j10, this) == objE) {
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

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {477}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22120B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f22122D;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/p;", "Loa/F;", "<anonymous>", "(Lx/p;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f22123B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f22124C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ long f22125D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f22125D = j10;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5036p interfaceC5036p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(interfaceC5036p, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f22125D, interfaceC4588d);
                aVar.f22124C = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f22123B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                ((InterfaceC5036p) this.f22124C).b(this.f22125D, t0.e.INSTANCE.b());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22122D = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return f.this.new d(this.f22122D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22120B;
            if (i10 == 0) {
                C4173r.b(obj);
                C5046z c5046z = f.this.scrollingLogic;
                EnumC4950C enumC4950C = EnumC4950C.UserInput;
                a aVar = new a(this.f22122D, null);
                this.f22120B = 1;
                if (c5046z.v(enumC4950C, aVar, this) == objE) {
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

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1", f = "Scrollable.kt", l = {549}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22126B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f22128D;

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/p;", "Loa/F;", "<anonymous>", "(Lx/p;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f22129B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f22130C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ long f22131D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f22131D = j10;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5036p interfaceC5036p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(interfaceC5036p, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f22131D, interfaceC4588d);
                aVar.f22130C = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f22129B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                ((InterfaceC5036p) this.f22130C).b(this.f22131D, t0.e.INSTANCE.b());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22128D = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return f.this.new e(this.f22128D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22126B;
            if (i10 == 0) {
                C4173r.b(obj);
                C5046z c5046z = f.this.scrollingLogic;
                EnumC4950C enumC4950C = EnumC4950C.UserInput;
                a aVar = new a(this.f22128D, null);
                this.f22126B = 1;
                if (c5046z.v(enumC4950C, aVar, this) == objE) {
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

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "", "a", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.f$f, reason: collision with other inner class name */
    static final class C0315f extends AbstractC3864v implements p<Float, Float, Boolean> {

        /* compiled from: Scrollable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {522}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.f$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f22133B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ f f22134C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ float f22135D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ float f22136E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, float f10, float f11, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f22134C = fVar;
                this.f22135D = f10;
                this.f22136E = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f22134C, this.f22135D, this.f22136E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f22133B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C5046z c5046z = this.f22134C.scrollingLogic;
                    long jA = C3477h.a(this.f22135D, this.f22136E);
                    this.f22133B = 1;
                    if (androidx.compose.foundation.gestures.d.g(c5046z, jA, this) == objE) {
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

        C0315f() {
            super(2);
        }

        public final Boolean a(float f10, float f11) {
            C1841i.d(f.this.J1(), null, null, new a(f.this, f10, f11, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
            return a(f10.floatValue(), f11.floatValue());
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {527}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh0/g;", "offset", "<anonymous>", "(Lh0/g;)Lh0/g;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<C3476g, InterfaceC4588d<? super C3476g>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22137B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ long f22138C;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        public final Object b(long j10, InterfaceC4588d<? super C3476g> interfaceC4588d) {
            return ((g) create(C3476g.d(j10), interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            g gVar = f.this.new g(interfaceC4588d);
            gVar.f22138C = ((C3476g) obj).getPackedValue();
            return gVar;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(C3476g c3476g, InterfaceC4588d<? super C3476g> interfaceC4588d) {
            return b(c3476g.getPackedValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22137B;
            if (i10 == 0) {
                C4173r.b(obj);
                long j10 = this.f22138C;
                C5046z c5046z = f.this.scrollingLogic;
                this.f22137B = 1;
                obj = androidx.compose.foundation.gestures.d.g(c5046z, j10, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.a<C4153F> {
        h() {
            super(0);
        }

        public final void a() {
            f.this.defaultFlingBehavior.d(C4612f.c((U0.d) C0830i.a(f.this, C2013e0.d())));
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [x.n] */
    public f(InterfaceC5044x interfaceC5044x, I i10, InterfaceC5034n interfaceC5034n, EnumC5037q enumC5037q, boolean z10, boolean z11, InterfaceC5162k interfaceC5162k, InterfaceC5024d interfaceC5024d) {
        super(androidx.compose.foundation.gestures.d.f22075a, z10, interfaceC5162k, enumC5037q);
        this.overscrollEffect = i10;
        this.flingBehavior = interfaceC5034n;
        t0.b bVar = new t0.b();
        this.nestedScrollDispatcher = bVar;
        this.scrollableContainerNode = (C5042v) j2(new C5042v(z10));
        C5028h c5028h = new C5028h(C4612f.c(androidx.compose.foundation.gestures.d.f22078d), null, 2, null);
        this.defaultFlingBehavior = c5028h;
        I i11 = this.overscrollEffect;
        ?? r22 = this.flingBehavior;
        C5046z c5046z = new C5046z(interfaceC5044x, i11, r22 == 0 ? c5028h : r22, enumC5037q, z11, bVar);
        this.scrollingLogic = c5046z;
        androidx.compose.foundation.gestures.e eVar = new androidx.compose.foundation.gestures.e(c5046z, z10);
        this.nestedScrollConnection = eVar;
        C5026f c5026f = (C5026f) j2(new C5026f(enumC5037q, c5046z, z11, interfaceC5024d));
        this.contentInViewNode = c5026f;
        j2(t0.d.a(eVar, bVar));
        j2(r.a());
        j2(new D.e(c5026f));
        j2(new w(new a()));
    }

    private final void N2() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    private final void O2(C4649o event, long size) {
        List<PointerInputChange> listC = event.c();
        int size2 = listC.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (listC.get(i10).p()) {
                return;
            }
        }
        InterfaceC5040t interfaceC5040t = this.scrollConfig;
        C3862t.d(interfaceC5040t);
        C1841i.d(J1(), null, null, new e(interfaceC5040t.a(C0832k.i(this), event, size), null), 3, null);
        List<PointerInputChange> listC2 = event.c();
        int size3 = listC2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            listC2.get(i11).a();
        }
    }

    private final void P2() {
        this.scrollByAction = new C0315f();
        this.scrollByOffsetAction = new g(null);
    }

    private final void R2() {
        i0.a(this, new h());
    }

    @Override // androidx.compose.foundation.gestures.b
    public void D2(long velocity) {
        C1841i.d(this.nestedScrollDispatcher.e(), null, null, new c(velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    /* renamed from: H2 */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.w();
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // s0.e
    public boolean Q(KeyEvent event) {
        return false;
    }

    public final void Q2(InterfaceC5044x state, EnumC5037q orientation, I overscrollEffect, boolean enabled, boolean reverseDirection, InterfaceC5034n flingBehavior, InterfaceC5162k interactionSource, InterfaceC5024d bringIntoViewSpec) {
        boolean z10;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.a(enabled);
            this.scrollableContainerNode.k2(enabled);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean zC = this.scrollingLogic.C(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.G2(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        J2(androidx.compose.foundation.gestures.d.f22075a, enabled, interactionSource, this.scrollingLogic.p() ? EnumC5037q.Vertical : EnumC5037q.Horizontal, zC);
        if (z11) {
            N2();
            w0.b(this);
        }
    }

    @Override // b0.i.c
    public void T1() {
        R2();
        this.scrollConfig = C5022b.a(this);
    }

    @Override // A0.h0
    public void e1() {
        R2();
    }

    @Override // g0.j
    public void j0(androidx.compose.ui.focus.g focusProperties) {
        focusProperties.y(false);
    }

    @Override // A0.v0
    public void m1(x xVar) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            P2();
        }
        p<? super Float, ? super Float, Boolean> pVar = this.scrollByAction;
        if (pVar != null) {
            v.v(xVar, null, pVar, 1, null);
        }
        p<? super C3476g, ? super InterfaceC4588d<? super C3476g>, ? extends Object> pVar2 = this.scrollByOffsetAction;
        if (pVar2 != null) {
            v.w(xVar, pVar2);
        }
    }

    @Override // s0.e
    public boolean p0(KeyEvent event) {
        long jA;
        if (getEnabled()) {
            long jA2 = C4419d.a(event);
            C4416a.Companion companion = C4416a.INSTANCE;
            if ((C4416a.p(jA2, companion.j()) || C4416a.p(C4419d.a(event), companion.k())) && C4418c.e(C4419d.b(event), C4418c.INSTANCE.a()) && !C4419d.c(event)) {
                if (this.scrollingLogic.p()) {
                    int iF = U0.r.f(this.contentInViewNode.getViewportSize());
                    jA = C3477h.a(0.0f, C4416a.p(C4419d.a(event), companion.k()) ? iF : -iF);
                } else {
                    int iG = U0.r.g(this.contentInViewNode.getViewportSize());
                    jA = C3477h.a(C4416a.p(C4419d.a(event), companion.k()) ? iG : -iG, 0.0f);
                }
                C1841i.d(J1(), null, null, new d(jA, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.b, A0.s0
    public void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (z2().invoke(listC.get(i10)).booleanValue()) {
                super.t0(pointerEvent, pass, bounds);
                break;
            }
            i10++;
        }
        if (pass == EnumC4651q.Main && C4652r.i(pointerEvent.getType(), C4652r.INSTANCE.f())) {
            O2(pointerEvent, bounds);
        }
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object y2(p<? super l<? super a.b, C4153F>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C5046z c5046z = this.scrollingLogic;
        Object objV = c5046z.v(EnumC4950C.UserInput, new b(pVar, c5046z, null), interfaceC4588d);
        return objV == C4696b.e() ? objV : C4153F.f46609a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void C2(long startedPosition) {
    }
}
