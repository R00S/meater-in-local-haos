package androidx.compose.foundation.gestures;

import A0.AbstractC0834m;
import A0.C0830i;
import A0.InterfaceC0829h;
import A0.s0;
import Ba.l;
import Ba.p;
import Ba.q;
import U0.z;
import Xb.C1841i;
import Xb.I;
import Xb.J;
import Zb.g;
import Zb.j;
import Zb.k;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.platform.C2013e0;
import androidx.compose.ui.platform.i1;
import h0.C3476g;
import kotlin.C5032l;
import kotlin.EnumC5037q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4631Q;
import u0.C4649o;
import u0.EnumC4651q;
import u0.InterfaceC4622H;
import u0.InterfaceC4633T;
import u0.PointerInputChange;
import ua.C4696b;
import v0.C4792d;
import z.C5152a;
import z.C5153b;
import z.InterfaceC5162k;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010#\u001a\u00020\u000f2.\u0010\"\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001eH¦@¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H&ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u000f\u0010,\u001a\u00020\u0006H&¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0011J*\u00105\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010\u0011J\r\u00108\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0011JO\u0010:\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R<\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR$\u0010\b\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010-R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010@R\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010DR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/gestures/b;", "LA0/m;", "LA0/s0;", "LA0/h;", "Lkotlin/Function1;", "Lu0/z;", "", "canDrag", "enabled", "Lz/k;", "interactionSource", "Lx/q;", "orientationLock", "<init>", "(LBa/l;ZLz/k;Lx/q;)V", "Loa/F;", "I2", "()V", "Lu0/T;", "B2", "()Lu0/T;", "Landroidx/compose/foundation/gestures/a$c;", "event", "F2", "(Landroidx/compose/foundation/gestures/a$c;Lta/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/a$d;", "G2", "(Landroidx/compose/foundation/gestures/a$d;Lta/d;)Ljava/lang/Object;", "E2", "(Lta/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/a$b;", "Lta/d;", "", "forEachDelta", "y2", "(LBa/p;Lta/d;)Ljava/lang/Object;", "Lh0/g;", "startedPosition", "C2", "(J)V", "LU0/y;", "velocity", "D2", "H2", "()Z", "U1", "Lu0/o;", "pointerEvent", "Lu0/q;", "pass", "LU0/r;", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "w0", "x2", "shouldResetPointerInputHandling", "J2", "(LBa/l;ZLz/k;Lx/q;Z)V", "Q", "Lx/q;", "<set-?>", "R", "LBa/l;", "z2", "()LBa/l;", "S", "Z", "A2", "T", "Lz/k;", "getInteractionSource", "()Lz/k;", "U", "_canDrag", "LZb/g;", "Landroidx/compose/foundation/gestures/a;", "V", "LZb/g;", "channel", "Lz/b;", "W", "Lz/b;", "dragInteraction", "X", "isListeningForEvents", "Y", "Lu0/T;", "pointerInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b extends AbstractC0834m implements s0, InterfaceC0829h {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private EnumC5037q orientationLock;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private l<? super PointerInputChange, Boolean> canDrag;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5162k interactionSource;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final l<PointerInputChange, Boolean> _canDrag = new a();

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private g<androidx.compose.foundation.gestures.a> channel;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private C5153b dragInteraction;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean isListeningForEvents;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4633T pointerInputNode;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "it", "", "a", "(Lu0/z;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<PointerInputChange, Boolean> {
        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return b.this.z2().invoke(pointerInputChange);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1", f = "Draggable.kt", l = {524}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    static final class C0310b extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22010B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f22011C;

        /* compiled from: Draggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {526}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f22013B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f22014C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ b f22015D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ InterfaceC4622H f22016E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ q<PointerInputChange, PointerInputChange, C3476g, C4153F> f22017F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ l<PointerInputChange, C4153F> f22018G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ Ba.a<C4153F> f22019H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ Ba.a<Boolean> f22020I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ p<PointerInputChange, C3476g, C4153F> f22021J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, InterfaceC4622H interfaceC4622H, q<? super PointerInputChange, ? super PointerInputChange, ? super C3476g, C4153F> qVar, l<? super PointerInputChange, C4153F> lVar, Ba.a<C4153F> aVar, Ba.a<Boolean> aVar2, p<? super PointerInputChange, ? super C3476g, C4153F> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f22015D = bVar;
                this.f22016E = interfaceC4622H;
                this.f22017F = qVar;
                this.f22018G = lVar;
                this.f22019H = aVar;
                this.f22020I = aVar2;
                this.f22021J = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f22015D, this.f22016E, this.f22017F, this.f22018G, this.f22019H, this.f22020I, this.f22021J, interfaceC4588d);
                aVar.f22014C = obj;
                return aVar;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r12.f22013B
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r12.f22014C
                    Xb.I r0 = (Xb.I) r0
                    oa.C4173r.b(r13)     // Catch: java.util.concurrent.CancellationException -> L13
                    goto L5d
                L13:
                    r13 = move-exception
                    goto L46
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    oa.C4173r.b(r13)
                    java.lang.Object r13 = r12.f22014C
                    Xb.I r13 = (Xb.I) r13
                    androidx.compose.foundation.gestures.b r1 = r12.f22015D     // Catch: java.util.concurrent.CancellationException -> L42
                    x.q r8 = androidx.compose.foundation.gestures.b.q2(r1)     // Catch: java.util.concurrent.CancellationException -> L42
                    u0.H r3 = r12.f22016E     // Catch: java.util.concurrent.CancellationException -> L42
                    Ba.q<u0.z, u0.z, h0.g, oa.F> r4 = r12.f22017F     // Catch: java.util.concurrent.CancellationException -> L42
                    Ba.l<u0.z, oa.F> r5 = r12.f22018G     // Catch: java.util.concurrent.CancellationException -> L42
                    Ba.a<oa.F> r6 = r12.f22019H     // Catch: java.util.concurrent.CancellationException -> L42
                    Ba.a<java.lang.Boolean> r7 = r12.f22020I     // Catch: java.util.concurrent.CancellationException -> L42
                    Ba.p<u0.z, h0.g, oa.F> r9 = r12.f22021J     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.f22014C = r13     // Catch: java.util.concurrent.CancellationException -> L42
                    r12.f22013B = r2     // Catch: java.util.concurrent.CancellationException -> L42
                    r10 = r12
                    java.lang.Object r13 = kotlin.C5030j.e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L42
                    if (r13 != r0) goto L5d
                    return r0
                L42:
                    r0 = move-exception
                    r11 = r0
                    r0 = r13
                    r13 = r11
                L46:
                    androidx.compose.foundation.gestures.b r1 = r12.f22015D
                    Zb.g r1 = androidx.compose.foundation.gestures.b.p2(r1)
                    if (r1 == 0) goto L57
                    androidx.compose.foundation.gestures.a$a r2 = androidx.compose.foundation.gestures.a.C0309a.f21996a
                    java.lang.Object r1 = r1.w(r2)
                    Zb.k.b(r1)
                L57:
                    boolean r0 = Xb.J.f(r0)
                    if (r0 == 0) goto L60
                L5d:
                    oa.F r13 = oa.C4153F.f46609a
                    return r13
                L60:
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.C0310b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu0/z;", "change", "Lh0/g;", "delta", "Loa/F;", "a", "(Lu0/z;J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$b$b, reason: collision with other inner class name */
        static final class C0311b extends AbstractC3864v implements p<PointerInputChange, C3476g, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C4792d f22022B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ b f22023C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0311b(C4792d c4792d, b bVar) {
                super(2);
                this.f22022B = c4792d;
                this.f22023C = bVar;
            }

            public final void a(PointerInputChange pointerInputChange, long j10) {
                v0.e.c(this.f22022B, pointerInputChange);
                g gVar = this.f22023C.channel;
                if (gVar != null) {
                    k.b(gVar.w(new a.b(j10, null)));
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange, C3476g c3476g) {
                a(pointerInputChange, c3476g.getPackedValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$b$c */
        static final class c extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ b f22024B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.f22024B = bVar;
            }

            public final void a() {
                g gVar = this.f22024B.channel;
                if (gVar != null) {
                    k.b(gVar.w(a.C0309a.f21996a));
                }
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "upEvent", "Loa/F;", "a", "(Lu0/z;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$b$d */
        static final class d extends AbstractC3864v implements l<PointerInputChange, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C4792d f22025B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ b f22026C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C4792d c4792d, b bVar) {
                super(1);
                this.f22025B = c4792d;
                this.f22026C = bVar;
            }

            public final void a(PointerInputChange pointerInputChange) {
                v0.e.c(this.f22025B, pointerInputChange);
                float fE = ((i1) C0830i.a(this.f22026C, C2013e0.m())).e();
                long jB = this.f22025B.b(z.a(fE, fE));
                this.f22025B.e();
                g gVar = this.f22026C.channel;
                if (gVar != null) {
                    k.b(gVar.w(new a.d(C5032l.l(jB), null)));
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange) {
                a(pointerInputChange);
                return C4153F.f46609a;
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu0/z;", "down", "slopTriggerChange", "Lh0/g;", "postSlopOffset", "Loa/F;", "a", "(Lu0/z;Lu0/z;J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$b$e */
        static final class e extends AbstractC3864v implements q<PointerInputChange, PointerInputChange, C3476g, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ b f22027B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4792d f22028C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b bVar, C4792d c4792d) {
                super(3);
                this.f22027B = bVar;
                this.f22028C = c4792d;
            }

            public final void a(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j10) {
                if (this.f22027B.z2().invoke(pointerInputChange).booleanValue()) {
                    if (!this.f22027B.isListeningForEvents) {
                        if (this.f22027B.channel == null) {
                            this.f22027B.channel = j.b(Integer.MAX_VALUE, null, null, 6, null);
                        }
                        this.f22027B.I2();
                    }
                    v0.e.c(this.f22028C, pointerInputChange);
                    long jQ = C3476g.q(pointerInputChange2.getPosition(), j10);
                    g gVar = this.f22027B.channel;
                    if (gVar != null) {
                        k.b(gVar.w(new a.c(jQ, null)));
                    }
                }
            }

            @Override // Ba.q
            public /* bridge */ /* synthetic */ C4153F g(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, C3476g c3476g) {
                a(pointerInputChange, pointerInputChange2, c3476g.getPackedValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.b$b$f */
        static final class f extends AbstractC3864v implements Ba.a<Boolean> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ b f22029B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(b bVar) {
                super(0);
                this.f22029B = bVar;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(!this.f22029B.getStartDragImmediately());
            }
        }

        C0310b(InterfaceC4588d<? super C0310b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0310b) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            C0310b c0310b = b.this.new C0310b(interfaceC4588d);
            c0310b.f22011C = obj;
            return c0310b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22010B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f22011C;
                C4792d c4792d = new C4792d();
                a aVar = new a(b.this, interfaceC4622H, new e(b.this, c4792d), new d(c4792d, b.this), new c(b.this), new f(b.this), new C0311b(c4792d, b.this), null);
                this.f22010B = 1;
                if (J.d(aVar, this) == objE) {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {566}, m = "processDragCancel")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f22030B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f22031C;

        /* renamed from: E, reason: collision with root package name */
        int f22033E;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22031C = obj;
            this.f22033E |= Integer.MIN_VALUE;
            return b.this.E2(this);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {548, 551}, m = "processDragStart")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f22034B;

        /* renamed from: C, reason: collision with root package name */
        Object f22035C;

        /* renamed from: D, reason: collision with root package name */
        Object f22036D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f22037E;

        /* renamed from: G, reason: collision with root package name */
        int f22039G;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22037E = obj;
            this.f22039G |= Integer.MIN_VALUE;
            return b.this.F2(null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {558}, m = "processDragStop")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f22040B;

        /* renamed from: C, reason: collision with root package name */
        Object f22041C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f22042D;

        /* renamed from: F, reason: collision with root package name */
        int f22044F;

        e(InterfaceC4588d<? super e> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22042D = obj;
            this.f22044F |= Integer.MIN_VALUE;
            return b.this.G2(null, this);
        }
    }

    /* compiled from: Draggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f22045B;

        /* renamed from: C, reason: collision with root package name */
        Object f22046C;

        /* renamed from: D, reason: collision with root package name */
        int f22047D;

        /* renamed from: E, reason: collision with root package name */
        private /* synthetic */ Object f22048E;

        /* compiled from: Draggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {438}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/a$b;", "Loa/F;", "processDelta", "<anonymous>", "(LBa/l;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<l<? super a.b, ? extends C4153F>, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            Object f22050B;

            /* renamed from: C, reason: collision with root package name */
            int f22051C;

            /* renamed from: D, reason: collision with root package name */
            /* synthetic */ Object f22052D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ O<androidx.compose.foundation.gestures.a> f22053E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ b f22054F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O<androidx.compose.foundation.gestures.a> o10, b bVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f22053E = o10;
                this.f22054F = bVar;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l<? super a.b, C4153F> lVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(lVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f22053E, this.f22054F, interfaceC4588d);
                aVar.f22052D = obj;
                return aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:25:0x005b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r5.f22051C
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r5.f22050B
                    kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                    java.lang.Object r3 = r5.f22052D
                    Ba.l r3 = (Ba.l) r3
                    oa.C4173r.b(r6)
                    goto L58
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1f:
                    oa.C4173r.b(r6)
                    java.lang.Object r6 = r5.f22052D
                    Ba.l r6 = (Ba.l) r6
                    r3 = r6
                L27:
                    kotlin.jvm.internal.O<androidx.compose.foundation.gestures.a> r6 = r5.f22053E
                    T r6 = r6.f43978B
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.d
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.C0309a
                    if (r1 != 0) goto L5e
                    boolean r1 = r6 instanceof androidx.compose.foundation.gestures.a.b
                    r4 = 0
                    if (r1 == 0) goto L3b
                    androidx.compose.foundation.gestures.a$b r6 = (androidx.compose.foundation.gestures.a.b) r6
                    goto L3c
                L3b:
                    r6 = r4
                L3c:
                    if (r6 == 0) goto L41
                    r3.invoke(r6)
                L41:
                    kotlin.jvm.internal.O<androidx.compose.foundation.gestures.a> r1 = r5.f22053E
                    androidx.compose.foundation.gestures.b r6 = r5.f22054F
                    Zb.g r6 = androidx.compose.foundation.gestures.b.p2(r6)
                    if (r6 == 0) goto L5b
                    r5.f22052D = r3
                    r5.f22050B = r1
                    r5.f22051C = r2
                    java.lang.Object r6 = r6.r(r5)
                    if (r6 != r0) goto L58
                    return r0
                L58:
                    r4 = r6
                    androidx.compose.foundation.gestures.a r4 = (androidx.compose.foundation.gestures.a) r4
                L5b:
                    r1.f43978B = r4
                    goto L27
                L5e:
                    oa.F r6 = oa.C4153F.f46609a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = b.this.new f(interfaceC4588d);
            fVar.f22048E = obj;
            return fVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:34|35|(1:37)|14|57|38|(2:44|(2:46|(1:48)))(2:40|(1:42))) */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
        
            r1 = r4;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #1 {CancellationException -> 0x00d7, blocks: (B:38:0x00ba, B:40:0x00c0, B:44:0x00d9, B:46:0x00dd), top: B:57:0x00ba }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008d -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d4 -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00db -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ea -> B:19:0x005e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00fa -> B:11:0x0027). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(l<? super PointerInputChange, Boolean> lVar, boolean z10, InterfaceC5162k interfaceC5162k, EnumC5037q enumC5037q) {
        this.orientationLock = enumC5037q;
        this.canDrag = lVar;
        this.enabled = z10;
        this.interactionSource = interfaceC5162k;
    }

    private final InterfaceC4633T B2() {
        return C4631Q.a(new C0310b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E2(ta.InterfaceC4588d<? super oa.C4153F> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.b.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.b$c r0 = (androidx.compose.foundation.gestures.b.c) r0
            int r1 = r0.f22033E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22033E = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$c r0 = new androidx.compose.foundation.gestures.b$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22031C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f22033E
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f22030B
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            oa.C4173r.b(r6)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            oa.C4173r.b(r6)
            z.b r6 = r5.dragInteraction
            if (r6 == 0) goto L55
            z.k r2 = r5.interactionSource
            if (r2 == 0) goto L50
            z.a r4 = new z.a
            r4.<init>(r6)
            r0.f22030B = r5
            r0.f22033E = r3
            java.lang.Object r6 = r2.c(r4, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.dragInteraction = r6
            goto L56
        L55:
            r0 = r5
        L56:
            U0.y$a r6 = U0.y.INSTANCE
            long r1 = r6.a()
            r0.D2(r1)
            oa.F r6 = oa.C4153F.f46609a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.E2(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F2(androidx.compose.foundation.gestures.a.c r7, ta.InterfaceC4588d<? super oa.C4153F> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.b.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.b$d r0 = (androidx.compose.foundation.gestures.b.d) r0
            int r1 = r0.f22039G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22039G = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$d r0 = new androidx.compose.foundation.gestures.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f22037E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f22039G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f22036D
            z.b r7 = (z.C5153b) r7
            java.lang.Object r1 = r0.f22035C
            androidx.compose.foundation.gestures.a$c r1 = (androidx.compose.foundation.gestures.a.c) r1
            java.lang.Object r0 = r0.f22034B
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            oa.C4173r.b(r8)
            goto L85
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f22035C
            androidx.compose.foundation.gestures.a$c r7 = (androidx.compose.foundation.gestures.a.c) r7
            java.lang.Object r2 = r0.f22034B
            androidx.compose.foundation.gestures.b r2 = (androidx.compose.foundation.gestures.b) r2
            oa.C4173r.b(r8)
            goto L6a
        L4c:
            oa.C4173r.b(r8)
            z.b r8 = r6.dragInteraction
            if (r8 == 0) goto L69
            z.k r2 = r6.interactionSource
            if (r2 == 0) goto L69
            z.a r5 = new z.a
            r5.<init>(r8)
            r0.f22034B = r6
            r0.f22035C = r7
            r0.f22039G = r4
            java.lang.Object r8 = r2.c(r5, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            r2 = r6
        L6a:
            z.b r8 = new z.b
            r8.<init>()
            z.k r4 = r2.interactionSource
            if (r4 == 0) goto L88
            r0.f22034B = r2
            r0.f22035C = r7
            r0.f22036D = r8
            r0.f22039G = r3
            java.lang.Object r0 = r4.c(r8, r0)
            if (r0 != r1) goto L82
            return r1
        L82:
            r1 = r7
            r7 = r8
            r0 = r2
        L85:
            r8 = r7
            r2 = r0
            r7 = r1
        L88:
            r2.dragInteraction = r8
            long r7 = r7.getStartPoint()
            r2.C2(r7)
            oa.F r7 = oa.C4153F.f46609a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.F2(androidx.compose.foundation.gestures.a$c, ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G2(androidx.compose.foundation.gestures.a.d r6, ta.InterfaceC4588d<? super oa.C4153F> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.b.e
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.b$e r0 = (androidx.compose.foundation.gestures.b.e) r0
            int r1 = r0.f22044F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22044F = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.b$e r0 = new androidx.compose.foundation.gestures.b$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22042D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f22044F
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f22041C
            androidx.compose.foundation.gestures.a$d r6 = (androidx.compose.foundation.gestures.a.d) r6
            java.lang.Object r0 = r0.f22040B
            androidx.compose.foundation.gestures.b r0 = (androidx.compose.foundation.gestures.b) r0
            oa.C4173r.b(r7)
            goto L57
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            oa.C4173r.b(r7)
            z.b r7 = r5.dragInteraction
            if (r7 == 0) goto L5b
            z.k r2 = r5.interactionSource
            if (r2 == 0) goto L56
            z.c r4 = new z.c
            r4.<init>(r7)
            r0.f22040B = r5
            r0.f22041C = r6
            r0.f22044F = r3
            java.lang.Object r7 = r2.c(r4, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r0 = r5
        L57:
            r7 = 0
            r0.dragInteraction = r7
            goto L5c
        L5b:
            r0 = r5
        L5c:
            long r6 = r6.getVelocity()
            r0.D2(r6)
            oa.F r6 = oa.C4153F.f46609a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b.G2(androidx.compose.foundation.gestures.a$d, ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        this.isListeningForEvents = true;
        C1841i.d(J1(), null, null, new f(null), 3, null);
    }

    /* renamed from: A2, reason: from getter */
    protected final boolean getEnabled() {
        return this.enabled;
    }

    public abstract void C2(long startedPosition);

    public abstract void D2(long velocity);

    /* renamed from: H2 */
    public abstract boolean getStartDragImmediately();

    public final void J2(l<? super PointerInputChange, Boolean> canDrag, boolean enabled, InterfaceC5162k interactionSource, EnumC5037q orientationLock, boolean shouldResetPointerInputHandling) {
        InterfaceC4633T interfaceC4633T;
        this.canDrag = canDrag;
        boolean z10 = true;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                x2();
                InterfaceC4633T interfaceC4633T2 = this.pointerInputNode;
                if (interfaceC4633T2 != null) {
                    m2(interfaceC4633T2);
                }
                this.pointerInputNode = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!C3862t.b(this.interactionSource, interactionSource)) {
            x2();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else {
            z10 = shouldResetPointerInputHandling;
        }
        if (!z10 || (interfaceC4633T = this.pointerInputNode) == null) {
            return;
        }
        interfaceC4633T.F1();
    }

    @Override // b0.i.c
    public void U1() {
        this.isListeningForEvents = false;
        x2();
    }

    @Override // A0.s0
    public void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        if (this.enabled && this.pointerInputNode == null) {
            this.pointerInputNode = (InterfaceC4633T) j2(B2());
        }
        InterfaceC4633T interfaceC4633T = this.pointerInputNode;
        if (interfaceC4633T != null) {
            interfaceC4633T.t0(pointerEvent, pass, bounds);
        }
    }

    @Override // A0.s0
    public void w0() {
        InterfaceC4633T interfaceC4633T = this.pointerInputNode;
        if (interfaceC4633T != null) {
            interfaceC4633T.w0();
        }
    }

    public final void x2() {
        C5153b c5153b = this.dragInteraction;
        if (c5153b != null) {
            InterfaceC5162k interfaceC5162k = this.interactionSource;
            if (interfaceC5162k != null) {
                interfaceC5162k.a(new C5152a(c5153b));
            }
            this.dragInteraction = null;
        }
    }

    public abstract Object y2(p<? super l<? super a.b, C4153F>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d);

    protected final l<PointerInputChange, Boolean> z2() {
        return this.canDrag;
    }
}
