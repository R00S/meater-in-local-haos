package kotlin;

import Ba.l;
import Ba.p;
import U0.y;
import h0.C3476g;
import h0.C3477h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.N;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.EnumC4950C;
import w.I;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001N\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0010*\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u0011*\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010%J>\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020&2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0*\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0086@¢\u0006\u0004\b,\u0010-J?\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010%J\u0016\u00101\u001a\u00020\u0010*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0017J\u0016\u00102\u001a\u00020\u001d*\u00020\u001dH\u0002ø\u0001\u0001¢\u0006\u0004\b2\u0010\u0015J\u001e\u00104\u001a\u00020\u001d*\u00020\u001d2\u0006\u00103\u001a\u00020\u0010H\u0002ø\u0001\u0001¢\u0006\u0004\b4\u00105J&\u0010:\u001a\u00020\u0011*\u0002062\u0006\u00107\u001a\u00020\u00112\u0006\u00109\u001a\u000208H\u0002ø\u0001\u0001¢\u0006\u0004\b:\u0010;R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006X"}, d2 = {"Lx/z;", "", "Lx/x;", "scrollableState", "Lw/I;", "overscrollEffect", "Lx/n;", "flingBehavior", "Lx/q;", "orientation", "", "reverseDirection", "Lt0/b;", "nestedScrollDispatcher", "<init>", "(Lx/x;Lw/I;Lx/n;Lx/q;ZLt0/b;)V", "", "Lh0/g;", "B", "(F)J", "x", "(J)J", "A", "(J)F", "t", "(F)F", "u", "scroll", "r", "LU0/y;", "initialVelocity", "Loa/F;", "q", "(JLta/d;)Ljava/lang/Object;", "available", "n", "w", "()Z", "Lw/C;", "scrollPriority", "Lkotlin/Function2;", "Lx/p;", "Lta/d;", "block", "v", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "C", "(Lx/x;Lx/q;Lw/I;ZLx/n;Lt0/b;)Z", "p", "z", "y", "newValue", "D", "(JF)J", "Lx/u;", "delta", "Lt0/e;", "source", "s", "(Lx/u;JI)J", "a", "Lx/x;", "b", "Lw/I;", "c", "Lx/n;", "d", "Lx/q;", "e", "Z", "f", "Lt0/b;", "g", "I", "latestScrollSource", "h", "Lx/u;", "outerStateScope", "x/z$c", "i", "Lx/z$c;", "nestedScrollScope", "Lkotlin/Function1;", "j", "LBa/l;", "performScrollForOverscroll", "o", "shouldDispatchOverscroll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5046z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5044x scrollableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private I overscrollEffect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5034n flingBehavior;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EnumC5037q orientation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private t0.b nestedScrollDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int latestScrollSource = t0.e.INSTANCE.b();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5041u outerStateScope = androidx.compose.foundation.gestures.d.f22076b;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c nestedScrollScope = new c();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l<C3476g, C3476g> performScrollForOverscroll = new e();

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {769}, m = "doFlingAnimation-QWom1Mo")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.z$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f52520B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f52521C;

        /* renamed from: E, reason: collision with root package name */
        int f52523E;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52521C = obj;
            this.f52523E |= Integer.MIN_VALUE;
            return C5046z.this.n(0L, this);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {782}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/p;", "Loa/F;", "<anonymous>", "(Lx/p;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.z$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f52524B;

        /* renamed from: C, reason: collision with root package name */
        Object f52525C;

        /* renamed from: D, reason: collision with root package name */
        long f52526D;

        /* renamed from: E, reason: collision with root package name */
        int f52527E;

        /* renamed from: F, reason: collision with root package name */
        private /* synthetic */ Object f52528F;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ N f52530H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f52531I;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"x/z$b$a", "Lx/u;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: x.z$b$a */
        public static final class a implements InterfaceC5041u {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5046z f52532a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5036p f52533b;

            a(C5046z c5046z, InterfaceC5036p interfaceC5036p) {
                this.f52532a = c5046z;
                this.f52533b = interfaceC5036p;
            }

            @Override // kotlin.InterfaceC5041u
            public float a(float pixels) {
                C5046z c5046z = this.f52532a;
                return c5046z.t(c5046z.A(this.f52533b.a(c5046z.u(c5046z.B(pixels)), t0.e.INSTANCE.a())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(N n10, long j10, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52530H = n10;
            this.f52531I = j10;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5036p interfaceC5036p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(interfaceC5036p, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = C5046z.this.new b(this.f52530H, this.f52531I, interfaceC4588d);
            bVar.f52528F = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C5046z c5046z;
            N n10;
            C5046z c5046z2;
            long j10;
            Object objE = C4696b.e();
            int i10 = this.f52527E;
            if (i10 == 0) {
                C4173r.b(obj);
                a aVar = new a(C5046z.this, (InterfaceC5036p) this.f52528F);
                c5046z = C5046z.this;
                N n11 = this.f52530H;
                long j11 = this.f52531I;
                InterfaceC5034n interfaceC5034n = c5046z.flingBehavior;
                long j12 = n11.f43977B;
                float fT = c5046z.t(c5046z.z(j11));
                this.f52528F = c5046z;
                this.f52524B = c5046z;
                this.f52525C = n11;
                this.f52526D = j12;
                this.f52527E = 1;
                Object objA = interfaceC5034n.a(aVar, fT, this);
                if (objA == objE) {
                    return objE;
                }
                n10 = n11;
                obj = objA;
                c5046z2 = c5046z;
                j10 = j12;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f52526D;
                n10 = (N) this.f52525C;
                c5046z = (C5046z) this.f52524B;
                c5046z2 = (C5046z) this.f52528F;
                C4173r.b(obj);
            }
            n10.f43977B = c5046z.D(j10, c5046z2.t(((Number) obj).floatValue()));
            return C4153F.f46609a;
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"x/z$c", "Lx/p;", "Lh0/g;", "offset", "Lt0/e;", "source", "b", "(JI)J", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.z$c */
    public static final class c implements InterfaceC5036p {
        c() {
        }

        @Override // kotlin.InterfaceC5036p
        public long a(long offset, int source) {
            C5046z.this.latestScrollSource = source;
            I i10 = C5046z.this.overscrollEffect;
            if (i10 != null && C5046z.this.o()) {
                return i10.d(offset, C5046z.this.latestScrollSource, C5046z.this.performScrollForOverscroll);
            }
            return C5046z.this.s(C5046z.this.outerStateScope, offset, source);
        }

        @Override // kotlin.InterfaceC5036p
        public long b(long offset, int source) {
            return C5046z.this.s(C5046z.this.outerStateScope, offset, source);
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {745, 748, 751}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/y;", "velocity", "<anonymous>", "(LU0/y;)LU0/y;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.z$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<y, InterfaceC4588d<? super y>, Object> {

        /* renamed from: B, reason: collision with root package name */
        long f52535B;

        /* renamed from: C, reason: collision with root package name */
        int f52536C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ long f52537D;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        public final Object b(long j10, InterfaceC4588d<? super y> interfaceC4588d) {
            return ((d) create(y.b(j10), interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = C5046z.this.new d(interfaceC4588d);
            dVar.f52537D = ((y) obj).getPackedValue();
            return dVar;
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Object invoke(y yVar, InterfaceC4588d<? super y> interfaceC4588d) {
            return b(yVar.getPackedValue(), interfaceC4588d);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = ua.C4696b.e()
                int r0 = r13.f52536C
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L35
                if (r0 == r3) goto L2e
                if (r0 == r2) goto L24
                if (r0 != r1) goto L1c
                long r0 = r13.f52535B
                long r2 = r13.f52537D
                oa.C4173r.b(r14)
                r9 = r0
                r0 = r14
                goto L89
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L24:
                long r2 = r13.f52535B
                long r4 = r13.f52537D
                oa.C4173r.b(r14)
                r0 = r14
                r7 = r4
                goto L68
            L2e:
                long r3 = r13.f52537D
                oa.C4173r.b(r14)
                r0 = r14
                goto L4c
            L35:
                oa.C4173r.b(r14)
                long r4 = r13.f52537D
                x.z r0 = kotlin.C5046z.this
                t0.b r0 = kotlin.C5046z.c(r0)
                r13.f52537D = r4
                r13.f52536C = r3
                java.lang.Object r0 = r0.c(r4, r13)
                if (r0 != r6) goto L4b
                return r6
            L4b:
                r3 = r4
            L4c:
                U0.y r0 = (U0.y) r0
                long r7 = r0.getPackedValue()
                long r7 = U0.y.k(r3, r7)
                x.z r0 = kotlin.C5046z.this
                r13.f52537D = r3
                r13.f52535B = r7
                r13.f52536C = r2
                java.lang.Object r0 = r0.n(r7, r13)
                if (r0 != r6) goto L65
                return r6
            L65:
                r11 = r3
                r2 = r7
                r7 = r11
            L68:
                U0.y r0 = (U0.y) r0
                long r9 = r0.getPackedValue()
                x.z r0 = kotlin.C5046z.this
                t0.b r0 = kotlin.C5046z.c(r0)
                long r2 = U0.y.k(r2, r9)
                r13.f52537D = r7
                r13.f52535B = r9
                r13.f52536C = r1
                r1 = r2
                r3 = r9
                r5 = r13
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L88
                return r6
            L88:
                r2 = r7
            L89:
                U0.y r0 = (U0.y) r0
                long r0 = r0.getPackedValue()
                long r0 = U0.y.k(r9, r0)
                long r0 = U0.y.k(r2, r0)
                U0.y r0 = U0.y.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5046z.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh0/g;", "delta", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.z$e */
    static final class e extends AbstractC3864v implements l<C3476g, C3476g> {
        e() {
            super(1);
        }

        public final long a(long j10) {
            InterfaceC5041u interfaceC5041u = C5046z.this.outerStateScope;
            C5046z c5046z = C5046z.this;
            return c5046z.s(interfaceC5041u, j10, c5046z.latestScrollSource);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C3476g invoke(C3476g c3476g) {
            return C3476g.d(a(c3476g.getPackedValue()));
        }
    }

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {804}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/u;", "Loa/F;", "<anonymous>", "(Lx/u;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.z$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC5041u, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52540B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f52541C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> f52543E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(p<? super InterfaceC5036p, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52543E = pVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5041u interfaceC5041u, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(interfaceC5041u, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = C5046z.this.new f(this.f52543E, interfaceC4588d);
            fVar.f52541C = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f52540B;
            if (i10 == 0) {
                C4173r.b(obj);
                C5046z.this.outerStateScope = (InterfaceC5041u) this.f52541C;
                p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> pVar = this.f52543E;
                c cVar = C5046z.this.nestedScrollScope;
                this.f52540B = 1;
                if (pVar.invoke(cVar, this) == objE) {
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

    public C5046z(InterfaceC5044x interfaceC5044x, I i10, InterfaceC5034n interfaceC5034n, EnumC5037q enumC5037q, boolean z10, t0.b bVar) {
        this.scrollableState = interfaceC5044x;
        this.overscrollEffect = i10;
        this.flingBehavior = interfaceC5034n;
        this.orientation = enumC5037q;
        this.reverseDirection = z10;
        this.nestedScrollDispatcher = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D(long j10, float f10) {
        return this.orientation == EnumC5037q.Horizontal ? y.e(j10, f10, 0.0f, 2, null) : y.e(j10, 0.0f, f10, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        return this.scrollableState.e() || this.scrollableState.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(InterfaceC5041u interfaceC5041u, long j10, int i10) {
        long jD = this.nestedScrollDispatcher.d(j10, i10);
        long jQ = C3476g.q(j10, jD);
        long jU = u(B(interfaceC5041u.a(A(u(x(jQ))))));
        return C3476g.r(C3476g.r(jD, jU), this.nestedScrollDispatcher.b(jU, C3476g.q(jQ, jU), i10));
    }

    private final long y(long j10) {
        return this.orientation == EnumC5037q.Horizontal ? y.e(j10, 0.0f, 0.0f, 1, null) : y.e(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float z(long j10) {
        return this.orientation == EnumC5037q.Horizontal ? y.h(j10) : y.i(j10);
    }

    public final float A(long j10) {
        return this.orientation == EnumC5037q.Horizontal ? C3476g.m(j10) : C3476g.n(j10);
    }

    public final long B(float f10) {
        return f10 == 0.0f ? C3476g.INSTANCE.c() : this.orientation == EnumC5037q.Horizontal ? C3477h.a(f10, 0.0f) : C3477h.a(0.0f, f10);
    }

    public final boolean C(InterfaceC5044x scrollableState, EnumC5037q orientation, I overscrollEffect, boolean reverseDirection, InterfaceC5034n flingBehavior, t0.b nestedScrollDispatcher) {
        boolean z10;
        boolean z11 = true;
        if (C3862t.b(this.scrollableState, scrollableState)) {
            z10 = false;
        } else {
            this.scrollableState = scrollableState;
            z10 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z10 = true;
        }
        if (this.reverseDirection != reverseDirection) {
            this.reverseDirection = reverseDirection;
        } else {
            z11 = z10;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(long r12, ta.InterfaceC4588d<? super U0.y> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof kotlin.C5046z.a
            if (r0 == 0) goto L13
            r0 = r14
            x.z$a r0 = (kotlin.C5046z.a) r0
            int r1 = r0.f52523E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52523E = r1
            goto L18
        L13:
            x.z$a r0 = new x.z$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f52521C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f52523E
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f52520B
            kotlin.jvm.internal.N r12 = (kotlin.jvm.internal.N) r12
            oa.C4173r.b(r14)
            goto L57
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            oa.C4173r.b(r14)
            kotlin.jvm.internal.N r14 = new kotlin.jvm.internal.N
            r14.<init>()
            r14.f43977B = r12
            w.C r2 = w.EnumC4950C.Default
            x.z$b r10 = new x.z$b
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r6, r7, r9)
            r0.f52520B = r14
            r0.f52523E = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L56
            return r1
        L56:
            r12 = r14
        L57:
            long r12 = r12.f43977B
            U0.y r12 = U0.y.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5046z.n(long, ta.d):java.lang.Object");
    }

    public final boolean p() {
        return this.orientation == EnumC5037q.Vertical;
    }

    public final Object q(long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        long jY = y(j10);
        d dVar = new d(null);
        I i10 = this.overscrollEffect;
        if (i10 == null || !o()) {
            Object objInvoke = dVar.invoke(y.b(jY), interfaceC4588d);
            return objInvoke == C4696b.e() ? objInvoke : C4153F.f46609a;
        }
        Object objB = i10.b(jY, dVar, interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    public final long r(long scroll) {
        return this.scrollableState.a() ? C3476g.INSTANCE.c() : B(t(this.scrollableState.f(t(A(scroll)))));
    }

    public final float t(float f10) {
        return this.reverseDirection ? f10 * (-1) : f10;
    }

    public final long u(long j10) {
        return this.reverseDirection ? C3476g.s(j10, -1.0f) : j10;
    }

    public final Object v(EnumC4950C enumC4950C, p<? super InterfaceC5036p, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objB = this.scrollableState.b(enumC4950C, new f(pVar, null), interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    public final boolean w() {
        if (!this.scrollableState.a()) {
            I i10 = this.overscrollEffect;
            if (!(i10 != null ? i10.c() : false)) {
                return false;
            }
        }
        return true;
    }

    public final long x(long j10) {
        return this.orientation == EnumC5037q.Horizontal ? C3476g.g(j10, 0.0f, 0.0f, 1, null) : C3476g.g(j10, 0.0f, 0.0f, 2, null);
    }
}
