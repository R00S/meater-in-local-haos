package w;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import h0.C3476g;
import h0.C3477h;
import h0.C3482m;
import h0.C3483n;
import i0.C3606v0;
import kotlin.C5035o;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.m1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4631Q;
import u0.C4659y;
import u0.InterfaceC4622H;
import u0.InterfaceC4637c;
import ua.C4696b;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J6\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\"\u0012\u0006\u0012\u0004\u0018\u00010#0!H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000eH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010\rR\u001e\u00100\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u000b048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R(\u0010?\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010:\u0012\u0004\b>\u0010\r\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010=R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u001c\u0010D\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010L\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\b.\u0010KR\u0014\u0010M\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lw/a;", "Lw/I;", "Landroid/content/Context;", "context", "Lw/G;", "overscrollConfig", "<init>", "(Landroid/content/Context;Lw/G;)V", "", "q", "()Z", "Loa/F;", "h", "()V", "Lh0/g;", "delta", "p", "(J)Z", "scroll", "", "o", "(J)F", "l", "m", "n", "Lt0/e;", "source", "Lkotlin/Function1;", "performScroll", "d", "(JILBa/l;)J", "LU0/y;", "velocity", "Lkotlin/Function2;", "Lta/d;", "", "performFling", "b", "(JLBa/p;Lta/d;)Ljava/lang/Object;", "Lh0/m;", "size", "r", "(J)V", "i", "()J", "k", "a", "Lh0/g;", "pointerPosition", "Lw/q;", "Lw/q;", "edgeEffectWrapper", "LO/p0;", "c", "LO/p0;", "j", "()LO/p0;", "redrawSignal", "Z", "getInvalidationEnabled$foundation_release", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "invalidationEnabled", "e", "scrollCycleInProgress", "f", "J", "containerSize", "Lu0/y;", "g", "Lu0/y;", "pointerId", "Lb0/i;", "Lb0/i;", "()Lb0/i;", "effectModifier", "isInProgress", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4956a implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private C3476g pointerPosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q edgeEffectWrapper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0<C4153F> redrawSignal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long containerSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C4659y pointerId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b0.i effectModifier;

    /* compiled from: AndroidOverscroll.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", l = {533, 559}, m = "applyToFling-BMRW4eQ")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.a$a, reason: collision with other inner class name */
    static final class C0745a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f51696B;

        /* renamed from: C, reason: collision with root package name */
        long f51697C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f51698D;

        /* renamed from: F, reason: collision with root package name */
        int f51700F;

        C0745a(InterfaceC4588d<? super C0745a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f51698D = obj;
            this.f51700F |= Integer.MIN_VALUE;
            return C4956a.this.b(0L, null, this);
        }
    }

    /* compiled from: AndroidOverscroll.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", l = {638}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f51701B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f51702C;

        /* compiled from: AndroidOverscroll.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", l = {639, 643}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: w.a$b$a, reason: collision with other inner class name */
        static final class C0746a extends kotlin.coroutines.jvm.internal.k implements Ba.p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: C, reason: collision with root package name */
            int f51704C;

            /* renamed from: D, reason: collision with root package name */
            private /* synthetic */ Object f51705D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C4956a f51706E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0746a(C4956a c4956a, InterfaceC4588d<? super C0746a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f51706E = c4956a;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0746a) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0746a c0746a = new C0746a(this.f51706E, interfaceC4588d);
                c0746a.f51705D = obj;
                return c0746a;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0064 -> B:17:0x0067). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r12.f51704C
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r12.f51705D
                    u0.c r1 = (u0.InterfaceC4637c) r1
                    oa.C4173r.b(r13)
                    goto L67
                L17:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1f:
                    java.lang.Object r1 = r12.f51705D
                    u0.c r1 = (u0.InterfaceC4637c) r1
                    oa.C4173r.b(r13)
                    goto L40
                L27:
                    oa.C4173r.b(r13)
                    java.lang.Object r13 = r12.f51705D
                    r1 = r13
                    u0.c r1 = (u0.InterfaceC4637c) r1
                    r12.f51705D = r1
                    r12.f51704C = r4
                    r6 = 0
                    r7 = 0
                    r9 = 2
                    r10 = 0
                    r5 = r1
                    r8 = r12
                    java.lang.Object r13 = kotlin.C5018A.e(r5, r6, r7, r8, r9, r10)
                    if (r13 != r0) goto L40
                    return r0
                L40:
                    u0.z r13 = (u0.PointerInputChange) r13
                    w.a r5 = r12.f51706E
                    long r6 = r13.getId()
                    u0.y r6 = u0.C4659y.a(r6)
                    w.C4956a.f(r5, r6)
                    w.a r5 = r12.f51706E
                    long r6 = r13.getPosition()
                    h0.g r13 = h0.C3476g.d(r6)
                    w.C4956a.g(r5, r13)
                L5c:
                    r12.f51705D = r1
                    r12.f51704C = r2
                    java.lang.Object r13 = u0.InterfaceC4637c.D1(r1, r3, r12, r4, r3)
                    if (r13 != r0) goto L67
                    return r0
                L67:
                    u0.o r13 = (u0.C4649o) r13
                    java.util.List r13 = r13.c()
                    java.util.ArrayList r5 = new java.util.ArrayList
                    int r6 = r13.size()
                    r5.<init>(r6)
                    int r6 = r13.size()
                    r7 = 0
                    r8 = r7
                L7c:
                    if (r8 >= r6) goto L91
                    java.lang.Object r9 = r13.get(r8)
                    r10 = r9
                    u0.z r10 = (u0.PointerInputChange) r10
                    boolean r10 = r10.getPressed()
                    if (r10 == 0) goto L8e
                    r5.add(r9)
                L8e:
                    int r8 = r8 + 1
                    goto L7c
                L91:
                    w.a r13 = r12.f51706E
                    int r6 = r5.size()
                L97:
                    if (r7 >= r6) goto Lb2
                    java.lang.Object r8 = r5.get(r7)
                    r9 = r8
                    u0.z r9 = (u0.PointerInputChange) r9
                    long r9 = r9.getId()
                    u0.y r11 = w.C4956a.e(r13)
                    boolean r9 = u0.C4659y.c(r9, r11)
                    if (r9 == 0) goto Laf
                    goto Lb3
                Laf:
                    int r7 = r7 + 1
                    goto L97
                Lb2:
                    r8 = r3
                Lb3:
                    u0.z r8 = (u0.PointerInputChange) r8
                    if (r8 != 0) goto Lbe
                    java.lang.Object r13 = kotlin.collections.r.l0(r5)
                    r8 = r13
                    u0.z r8 = (u0.PointerInputChange) r8
                Lbe:
                    if (r8 == 0) goto Lda
                    w.a r13 = r12.f51706E
                    long r6 = r8.getId()
                    u0.y r6 = u0.C4659y.a(r6)
                    w.C4956a.f(r13, r6)
                    w.a r13 = r12.f51706E
                    long r6 = r8.getPosition()
                    h0.g r6 = h0.C3476g.d(r6)
                    w.C4956a.g(r13, r6)
                Lda:
                    boolean r13 = r5.isEmpty()
                    if (r13 == 0) goto L5c
                    w.a r13 = r12.f51706E
                    w.C4956a.f(r13, r3)
                    oa.F r13 = oa.C4153F.f46609a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: w.C4956a.b.C0746a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = C4956a.this.new b(interfaceC4588d);
            bVar.f51702C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f51701B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f51702C;
                C0746a c0746a = new C0746a(C4956a.this, null);
                this.f51701B = 1;
                if (C5035o.c(interfaceC4622H, c0746a, this) == objE) {
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

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w.a$c */
    public static final class c extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {
        public c() {
            super(1);
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("overscroll");
            c2040s0.c(C4956a.this);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w.a$d */
    public static final class d extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {
        public d() {
            super(1);
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("overscroll");
            c2040s0.c(C4956a.this);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    public C4956a(Context context, OverscrollConfiguration overscrollConfiguration) {
        b0.i c4964i;
        q qVar = new q(context, C3606v0.j(overscrollConfiguration.getGlowColor()));
        this.edgeEffectWrapper = qVar;
        C4153F c4153f = C4153F.f46609a;
        this.redrawSignal = m1.g(c4153f, m1.i());
        this.invalidationEnabled = true;
        this.containerSize = C3482m.INSTANCE.b();
        b0.i iVarC = C4631Q.c(b0.i.INSTANCE, c4153f, new b(null));
        if (Build.VERSION.SDK_INT >= 31) {
            c4964i = new o(this, qVar, C2037q0.b() ? new c() : C2037q0.a());
        } else {
            c4964i = new C4964i(this, qVar, overscrollConfiguration, C2037q0.b() ? new d() : C2037q0.a());
        }
        this.effectModifier = iVarC.e(c4964i);
    }

    private final void h() {
        boolean zIsFinished;
        q qVar = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = qVar.topEffect;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = qVar.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished = edgeEffect2.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect3 = qVar.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished = edgeEffect3.isFinished() || zIsFinished;
        }
        EdgeEffect edgeEffect4 = qVar.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished = edgeEffect4.isFinished() || zIsFinished;
        }
        if (zIsFinished) {
            k();
        }
    }

    private final float l(long scroll) {
        float fM = C3476g.m(i());
        float fN = C3476g.n(scroll) / C3482m.g(this.containerSize);
        EdgeEffect edgeEffectF = this.edgeEffectWrapper.f();
        p pVar = p.f51723a;
        return pVar.b(edgeEffectF) == 0.0f ? (-pVar.d(edgeEffectF, -fN, 1 - fM)) * C3482m.g(this.containerSize) : C3476g.n(scroll);
    }

    private final float m(long scroll) {
        float fN = C3476g.n(i());
        float fM = C3476g.m(scroll) / C3482m.i(this.containerSize);
        EdgeEffect edgeEffectH = this.edgeEffectWrapper.h();
        p pVar = p.f51723a;
        return pVar.b(edgeEffectH) == 0.0f ? pVar.d(edgeEffectH, fM, 1 - fN) * C3482m.i(this.containerSize) : C3476g.m(scroll);
    }

    private final float n(long scroll) {
        float fN = C3476g.n(i());
        float fM = C3476g.m(scroll) / C3482m.i(this.containerSize);
        EdgeEffect edgeEffectJ = this.edgeEffectWrapper.j();
        p pVar = p.f51723a;
        return pVar.b(edgeEffectJ) == 0.0f ? (-pVar.d(edgeEffectJ, -fM, fN)) * C3482m.i(this.containerSize) : C3476g.m(scroll);
    }

    private final float o(long scroll) {
        float fM = C3476g.m(i());
        float fN = C3476g.n(scroll) / C3482m.g(this.containerSize);
        EdgeEffect edgeEffectL = this.edgeEffectWrapper.l();
        p pVar = p.f51723a;
        return pVar.b(edgeEffectL) == 0.0f ? pVar.d(edgeEffectL, fN, fM) * C3482m.g(this.containerSize) : C3476g.n(scroll);
    }

    private final boolean p(long delta) {
        boolean z10;
        boolean z11 = true;
        if (!this.edgeEffectWrapper.r() || C3476g.m(delta) >= 0.0f) {
            z10 = false;
        } else {
            p.f51723a.e(this.edgeEffectWrapper.h(), C3476g.m(delta));
            z10 = !this.edgeEffectWrapper.r();
        }
        if (this.edgeEffectWrapper.u() && C3476g.m(delta) > 0.0f) {
            p.f51723a.e(this.edgeEffectWrapper.j(), C3476g.m(delta));
            z10 = z10 || !this.edgeEffectWrapper.u();
        }
        if (this.edgeEffectWrapper.y() && C3476g.n(delta) < 0.0f) {
            p.f51723a.e(this.edgeEffectWrapper.l(), C3476g.n(delta));
            z10 = z10 || !this.edgeEffectWrapper.y();
        }
        if (!this.edgeEffectWrapper.o() || C3476g.n(delta) <= 0.0f) {
            return z10;
        }
        p.f51723a.e(this.edgeEffectWrapper.f(), C3476g.n(delta));
        if (!z10 && this.edgeEffectWrapper.o()) {
            z11 = false;
        }
        return z11;
    }

    private final boolean q() {
        boolean z10;
        if (this.edgeEffectWrapper.t()) {
            m(C3476g.INSTANCE.c());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.edgeEffectWrapper.w()) {
            n(C3476g.INSTANCE.c());
            z10 = true;
        }
        if (this.edgeEffectWrapper.A()) {
            o(C3476g.INSTANCE.c());
            z10 = true;
        }
        if (!this.edgeEffectWrapper.q()) {
            return z10;
        }
        l(C3476g.INSTANCE.c());
        return true;
    }

    @Override // w.I
    /* renamed from: a, reason: from getter */
    public b0.i getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // w.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(long r11, Ba.p<? super U0.y, ? super ta.InterfaceC4588d<? super U0.y>, ? extends java.lang.Object> r13, ta.InterfaceC4588d<? super oa.C4153F> r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C4956a.b(long, Ba.p, ta.d):java.lang.Object");
    }

    @Override // w.I
    public boolean c() {
        q qVar = this.edgeEffectWrapper;
        EdgeEffect edgeEffect = qVar.topEffect;
        if (edgeEffect != null && p.f51723a.b(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = qVar.bottomEffect;
        if (edgeEffect2 != null && p.f51723a.b(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = qVar.leftEffect;
        if (edgeEffect3 != null && p.f51723a.b(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = qVar.rightEffect;
        return (edgeEffect4 == null || p.f51723a.b(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b A[ADDED_TO_REGION] */
    @Override // w.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long d(long r11, int r13, Ba.l<? super h0.C3476g, h0.C3476g> r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C4956a.d(long, int, Ba.l):long");
    }

    public final long i() {
        C3476g c3476g = this.pointerPosition;
        long packedValue = c3476g != null ? c3476g.getPackedValue() : C3483n.b(this.containerSize);
        return C3477h.a(C3476g.m(packedValue) / C3482m.i(this.containerSize), C3476g.n(packedValue) / C3482m.g(this.containerSize));
    }

    public final InterfaceC1563p0<C4153F> j() {
        return this.redrawSignal;
    }

    public final void k() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(C4153F.f46609a);
        }
    }

    public final void r(long size) {
        boolean zF = C3482m.f(this.containerSize, C3482m.INSTANCE.b());
        boolean zF2 = C3482m.f(size, this.containerSize);
        this.containerSize = size;
        if (!zF2) {
            this.edgeEffectWrapper.B(U0.s.a(Da.a.c(C3482m.i(size)), Da.a.c(C3482m.g(size))));
        }
        if (zF || zF2) {
            return;
        }
        k();
        h();
    }
}
