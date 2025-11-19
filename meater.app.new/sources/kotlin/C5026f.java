package kotlin;

import A0.A;
import A0.C0830i;
import A0.C0832k;
import A0.InterfaceC0829h;
import Ba.p;
import D.d;
import U0.r;
import U0.s;
import Xb.A0;
import Xb.C1841i;
import Xb.C1849m;
import Xb.C1873y0;
import Xb.I;
import Xb.InterfaceC1847l;
import Xb.InterfaceC1867v0;
import Xb.K;
import b0.i;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import h0.C3482m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import t0.e;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.EnumC4950C;
import y0.InterfaceC5116v;

/* compiled from: ContentInViewNode.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001ZB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\"\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'*\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'*\u00020*2\u0006\u0010&\u001a\u00020*H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J \u00100\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110/H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b8\u00109R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010?R*\u0010W\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Lx/f;", "Lb0/i$c;", "LD/d;", "LA0/A;", "LA0/h;", "Lx/q;", "orientation", "Lx/z;", "scrollingLogic", "", "reverseDirection", "Lx/d;", "bringIntoViewSpec", "<init>", "(Lx/q;Lx/z;ZLx/d;)V", "F2", "()Lx/d;", "Lh0/i;", "y2", "()Lh0/i;", "Loa/F;", "C2", "()V", "", "t2", "(Lx/d;)F", "x2", "childBounds", "LU0/r;", "containerSize", "w2", "(Lh0/i;J)Lh0/i;", "size", "A2", "(Lh0/i;J)Z", "Lh0/g;", "E2", "(Lh0/i;J)J", "other", "", "u2", "(JJ)I", "Lh0/m;", "v2", "localRect", "f0", "(Lh0/i;)Lh0/i;", "Lkotlin/Function0;", "W0", "(LBa/a;Lta/d;)Ljava/lang/Object;", "Ly0/v;", "newBounds", "D2", "(Ly0/v;)V", "q", "(J)V", "G2", "(Lx/q;ZLx/d;)V", "O", "Lx/q;", "P", "Lx/z;", "Q", "Z", "R", "Lx/d;", "S", "O1", "()Z", "shouldAutoInvalidate", "Lx/c;", "T", "Lx/c;", "bringIntoViewRequests", "U", "Ly0/v;", "focusedChild", "V", "Lh0/i;", "focusedChildBoundsFromPreviousRemeasure", "W", "trackingFocusedChild", "<set-?>", "X", "J", "z2", "()J", "viewportSize", "Y", "isAnimationRunning", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5026f extends i.c implements d, A, InterfaceC0829h {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private EnumC5037q orientation;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final C5046z scrollingLogic;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5024d bringIntoViewSpec;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5116v focusedChild;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private C3478i focusedChildBoundsFromPreviousRemeasure;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private boolean trackingFocusedChild;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimationRunning;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final C5023c bringIntoViewRequests = new C5023c();

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private long viewportSize = r.INSTANCE.a();

    /* compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx/f$a;", "", "Lkotlin/Function0;", "Lh0/i;", "currentBounds", "LXb/l;", "Loa/F;", "continuation", "<init>", "(LBa/a;LXb/l;)V", "", "toString", "()Ljava/lang/String;", "a", "LBa/a;", "b", "()LBa/a;", "LXb/l;", "()LXb/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Ba.a<C3478i> currentBounds;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1847l<C4153F> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ba.a<C3478i> aVar, InterfaceC1847l<? super C4153F> interfaceC1847l) {
            this.currentBounds = aVar;
            this.continuation = interfaceC1847l;
        }

        public final InterfaceC1847l<C4153F> a() {
            return this.continuation;
        }

        public final Ba.a<C3478i> b() {
            return this.currentBounds;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                Xb.l<oa.F> r0 = r4.continuation
                ta.g r0 = r0.getContext()
                Xb.H$a r1 = Xb.CoroutineName.INSTANCE
                ta.g$b r0 = r0.b(r1)
                Xb.H r0 = (Xb.CoroutineName) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.getName()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = Ub.C1786a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.C3862t.f(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                Ba.a<h0.i> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                Xb.l<oa.F> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5026f.a.toString():java.lang.String");
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.f$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52358a;

        static {
            int[] iArr = new int[EnumC5037q.values().length];
            try {
                iArr[EnumC5037q.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5037q.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52358a = iArr;
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {196}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.f$c */
    static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f52359B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f52360C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C5020C f52362E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ InterfaceC5024d f52363F;

        /* compiled from: ContentInViewNode.kt */
        @f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {201}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx/p;", "Loa/F;", "<anonymous>", "(Lx/p;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x.f$c$a */
        static final class a extends l implements p<InterfaceC5036p, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f52364B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f52365C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C5020C f52366D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C5026f f52367E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ InterfaceC5024d f52368F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ InterfaceC1867v0 f52369G;

            /* compiled from: ContentInViewNode.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Loa/F;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.f$c$a$a, reason: collision with other inner class name */
            static final class C0763a extends AbstractC3864v implements Ba.l<Float, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ C5026f f52370B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5020C f52371C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ InterfaceC1867v0 f52372D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC5036p f52373E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0763a(C5026f c5026f, C5020C c5020c, InterfaceC1867v0 interfaceC1867v0, InterfaceC5036p interfaceC5036p) {
                    super(1);
                    this.f52370B = c5026f;
                    this.f52371C = c5020c;
                    this.f52372D = interfaceC1867v0;
                    this.f52373E = interfaceC5036p;
                }

                public final void a(float f10) {
                    float f11 = this.f52370B.reverseDirection ? 1.0f : -1.0f;
                    C5046z c5046z = this.f52370B.scrollingLogic;
                    float fA = f11 * c5046z.A(c5046z.u(this.f52373E.b(c5046z.u(c5046z.B(f11 * f10)), e.INSTANCE.b())));
                    if (Math.abs(fA) < Math.abs(f10)) {
                        A0.e(this.f52372D, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f10 + ')', null, 2, null);
                    }
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(Float f10) {
                    a(f10.floatValue());
                    return C4153F.f46609a;
                }
            }

            /* compiled from: ContentInViewNode.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: x.f$c$a$b */
            static final class b extends AbstractC3864v implements Ba.a<C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ C5026f f52374B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C5020C f52375C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ InterfaceC5024d f52376D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C5026f c5026f, C5020C c5020c, InterfaceC5024d interfaceC5024d) {
                    super(0);
                    this.f52374B = c5026f;
                    this.f52375C = c5020c;
                    this.f52376D = interfaceC5024d;
                }

                public final void a() {
                    C5023c c5023c = this.f52374B.bringIntoViewRequests;
                    C5026f c5026f = this.f52374B;
                    while (true) {
                        if (!c5023c.requests.y()) {
                            break;
                        }
                        C3478i c3478iInvoke = ((a) c5023c.requests.z()).b().invoke();
                        if (!(c3478iInvoke == null ? true : C5026f.B2(c5026f, c3478iInvoke, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) c5023c.requests.E(c5023c.requests.getSize() - 1)).a().resumeWith(C4172q.a(C4153F.f46609a));
                        }
                    }
                    if (this.f52374B.trackingFocusedChild) {
                        C3478i c3478iY2 = this.f52374B.y2();
                        if (c3478iY2 != null && C5026f.B2(this.f52374B, c3478iY2, 0L, 1, null)) {
                            this.f52374B.trackingFocusedChild = false;
                        }
                    }
                    this.f52375C.j(this.f52374B.t2(this.f52376D));
                }

                @Override // Ba.a
                public /* bridge */ /* synthetic */ C4153F invoke() {
                    a();
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C5020C c5020c, C5026f c5026f, InterfaceC5024d interfaceC5024d, InterfaceC1867v0 interfaceC1867v0, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f52366D = c5020c;
                this.f52367E = c5026f;
                this.f52368F = interfaceC5024d;
                this.f52369G = interfaceC1867v0;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5036p interfaceC5036p, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(interfaceC5036p, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f52366D, this.f52367E, this.f52368F, this.f52369G, interfaceC4588d);
                aVar.f52365C = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f52364B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    InterfaceC5036p interfaceC5036p = (InterfaceC5036p) this.f52365C;
                    this.f52366D.j(this.f52367E.t2(this.f52368F));
                    C5020C c5020c = this.f52366D;
                    C0763a c0763a = new C0763a(this.f52367E, c5020c, this.f52369G, interfaceC5036p);
                    b bVar = new b(this.f52367E, this.f52366D, this.f52368F);
                    this.f52364B = 1;
                    if (c5020c.h(c0763a, bVar, this) == objE) {
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
        c(C5020C c5020c, InterfaceC5024d interfaceC5024d, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52362E = c5020c;
            this.f52363F = interfaceC5024d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = C5026f.this.new c(this.f52362E, this.f52363F, interfaceC4588d);
            cVar.f52360C = obj;
            return cVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f52359B;
            try {
                try {
                    if (i10 == 0) {
                        C4173r.b(obj);
                        InterfaceC1867v0 interfaceC1867v0N = C1873y0.n(((I) this.f52360C).getCoroutineContext());
                        C5026f.this.isAnimationRunning = true;
                        C5046z c5046z = C5026f.this.scrollingLogic;
                        EnumC4950C enumC4950C = EnumC4950C.Default;
                        a aVar = new a(this.f52362E, C5026f.this, this.f52363F, interfaceC1867v0N, null);
                        this.f52359B = 1;
                        if (c5046z.v(enumC4950C, aVar, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    C5026f.this.bringIntoViewRequests.d();
                    C5026f.this.isAnimationRunning = false;
                    C5026f.this.bringIntoViewRequests.b(null);
                    C5026f.this.trackingFocusedChild = false;
                    return C4153F.f46609a;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                C5026f.this.isAnimationRunning = false;
                C5026f.this.bringIntoViewRequests.b(null);
                C5026f.this.trackingFocusedChild = false;
                throw th;
            }
        }
    }

    public C5026f(EnumC5037q enumC5037q, C5046z c5046z, boolean z10, InterfaceC5024d interfaceC5024d) {
        this.orientation = enumC5037q;
        this.scrollingLogic = c5046z;
        this.reverseDirection = z10;
        this.bringIntoViewSpec = interfaceC5024d;
    }

    private final boolean A2(C3478i c3478i, long j10) {
        long jE2 = E2(c3478i, j10);
        return Math.abs(C3476g.m(jE2)) <= 0.5f && Math.abs(C3476g.n(jE2)) <= 0.5f;
    }

    static /* synthetic */ boolean B2(C5026f c5026f, C3478i c3478i, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = c5026f.viewportSize;
        }
        return c5026f.A2(c3478i, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2() {
        InterfaceC5024d interfaceC5024dF2 = F2();
        if (this.isAnimationRunning) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        C1841i.d(J1(), null, K.f19033E, new c(new C5020C(interfaceC5024dF2.b()), interfaceC5024dF2, null), 1, null);
    }

    private final long E2(C3478i childBounds, long containerSize) {
        long jD = s.d(containerSize);
        int i10 = b.f52358a[this.orientation.ordinal()];
        if (i10 == 1) {
            return C3477h.a(0.0f, F2().a(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), C3482m.g(jD)));
        }
        if (i10 == 2) {
            return C3477h.a(F2().a(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), C3482m.i(jD)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC5024d F2() {
        InterfaceC5024d interfaceC5024d = this.bringIntoViewSpec;
        return interfaceC5024d == null ? (InterfaceC5024d) C0830i.a(this, C5025e.a()) : interfaceC5024d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float t2(InterfaceC5024d bringIntoViewSpec) {
        if (r.e(this.viewportSize, r.INSTANCE.a())) {
            return 0.0f;
        }
        C3478i c3478iX2 = x2();
        if (c3478iX2 == null) {
            c3478iX2 = this.trackingFocusedChild ? y2() : null;
            if (c3478iX2 == null) {
                return 0.0f;
            }
        }
        long jD = s.d(this.viewportSize);
        int i10 = b.f52358a[this.orientation.ordinal()];
        if (i10 == 1) {
            return bringIntoViewSpec.a(c3478iX2.getTop(), c3478iX2.getBottom() - c3478iX2.getTop(), C3482m.g(jD));
        }
        if (i10 == 2) {
            return bringIntoViewSpec.a(c3478iX2.getLeft(), c3478iX2.getRight() - c3478iX2.getLeft(), C3482m.i(jD));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int u2(long j10, long j11) {
        int i10 = b.f52358a[this.orientation.ordinal()];
        if (i10 == 1) {
            return C3862t.i(r.f(j10), r.f(j11));
        }
        if (i10 == 2) {
            return C3862t.i(r.g(j10), r.g(j11));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int v2(long j10, long j11) {
        int i10 = b.f52358a[this.orientation.ordinal()];
        if (i10 == 1) {
            return Float.compare(C3482m.g(j10), C3482m.g(j11));
        }
        if (i10 == 2) {
            return Float.compare(C3482m.i(j10), C3482m.i(j11));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final C3478i w2(C3478i childBounds, long containerSize) {
        return childBounds.q(C3476g.u(E2(childBounds, containerSize)));
    }

    private final C3478i x2() {
        Q.b bVar = this.bringIntoViewRequests.requests;
        int size = bVar.getSize();
        C3478i c3478i = null;
        if (size > 0) {
            int i10 = size - 1;
            Object[] objArrT = bVar.t();
            do {
                C3478i c3478iInvoke = ((a) objArrT[i10]).b().invoke();
                if (c3478iInvoke != null) {
                    if (v2(c3478iInvoke.h(), s.d(this.viewportSize)) > 0) {
                        return c3478i == null ? c3478iInvoke : c3478i;
                    }
                    c3478i = c3478iInvoke;
                }
                i10--;
            } while (i10 >= 0);
        }
        return c3478i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3478i y2() {
        if (!getIsAttached()) {
            return null;
        }
        InterfaceC5116v interfaceC5116vJ = C0832k.j(this);
        InterfaceC5116v interfaceC5116v = this.focusedChild;
        if (interfaceC5116v != null) {
            if (!interfaceC5116v.L()) {
                interfaceC5116v = null;
            }
            if (interfaceC5116v != null) {
                return interfaceC5116vJ.M(interfaceC5116v, false);
            }
        }
        return null;
    }

    public final void D2(InterfaceC5116v newBounds) {
        this.focusedChild = newBounds;
    }

    public final void G2(EnumC5037q orientation, boolean reverseDirection, InterfaceC5024d bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // D.d
    public Object W0(Ba.a<C3478i> aVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C3478i c3478iInvoke = aVar.invoke();
        if (c3478iInvoke == null || B2(this, c3478iInvoke, 0L, 1, null)) {
            return C4153F.f46609a;
        }
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        if (this.bringIntoViewRequests.c(new a(aVar, c1849m)) && !this.isAnimationRunning) {
            C2();
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    @Override // D.d
    public C3478i f0(C3478i localRect) {
        if (r.e(this.viewportSize, r.INSTANCE.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return w2(localRect, this.viewportSize);
    }

    @Override // A0.A
    public void q(long size) {
        C3478i c3478iY2;
        long j10 = this.viewportSize;
        this.viewportSize = size;
        if (u2(size, j10) < 0 && (c3478iY2 = y2()) != null) {
            C3478i c3478i = this.focusedChildBoundsFromPreviousRemeasure;
            if (c3478i == null) {
                c3478i = c3478iY2;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && A2(c3478i, j10) && !A2(c3478iY2, size)) {
                this.trackingFocusedChild = true;
                C2();
            }
            this.focusedChildBoundsFromPreviousRemeasure = c3478iY2;
        }
    }

    /* renamed from: z2, reason: from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }
}
