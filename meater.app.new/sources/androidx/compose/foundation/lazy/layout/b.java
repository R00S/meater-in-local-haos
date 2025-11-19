package androidx.compose.foundation.lazy.layout;

import Ba.p;
import U0.n;
import U0.o;
import Xb.C1841i;
import Xb.I;
import i0.F0;
import kotlin.C4737a;
import kotlin.C4761m;
import kotlin.C4763n;
import kotlin.C4774s0;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC4718G;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3856m;
import kotlin.r1;
import l0.C3870c;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: LazyLayoutItemAnimation.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00108\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00101\"\u0004\b;\u00107R+\u0010@\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00101\"\u0004\b?\u00107R+\u0010C\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bA\u00101\"\u0004\bB\u00107R(\u0010I\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010L\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR(\u0010Q\u001a\u0004\u0018\u00010M2\b\u0010-\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010PR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010TR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010TR1\u0010Z\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bX\u00104\u001a\u0004\bX\u0010F\"\u0004\bY\u0010HR(\u0010]\u001a\u00020\r8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bE\u0010D\u001a\u0004\b[\u0010F\"\u0004\b\\\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/foundation/lazy/layout/b;", "", "LXb/I;", "coroutineScope", "Li0/F0;", "graphicsContext", "Lkotlin/Function0;", "Loa/F;", "onLayerPropertyChanged", "<init>", "(LXb/I;Li0/F0;LBa/a;)V", "n", "()V", "LU0/n;", "delta", "", "isMovingAway", "m", "(JZ)V", "k", "l", "x", "a", "LXb/I;", "b", "Li0/F0;", "c", "LBa/a;", "Lv/G;", "", "d", "Lv/G;", "getFadeInSpec", "()Lv/G;", "B", "(Lv/G;)V", "fadeInSpec", "e", "getPlacementSpec", "G", "placementSpec", "f", "getFadeOutSpec", "C", "fadeOutSpec", "<set-?>", "g", "Z", "w", "()Z", "isRunningMovingAwayAnimation", "h", "LO/p0;", "v", "E", "(Z)V", "isPlacementAnimationInProgress", "i", "s", "y", "isAppearanceAnimationInProgress", "j", "u", "A", "isDisappearanceAnimationInProgress", "t", "z", "isDisappearanceAnimationFinished", "J", "r", "()J", "H", "(J)V", "rawOffset", "o", "D", "finalOffset", "Ll0/c;", "Ll0/c;", "p", "()Ll0/c;", "layer", "Lv/a;", "Lv/n;", "Lv/a;", "placementDeltaAnimation", "Lv/m;", "visibilityAnimation", "q", "F", "placementDelta", "getLookaheadOffset-nOcc-ac", "setLookaheadOffset--gyyYBs", "lookaheadOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f22373t = 8;

    /* renamed from: u, reason: collision with root package name */
    private static final long f22374u = o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final F0 graphicsContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onLayerPropertyChanged;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4718G<Float> fadeInSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4718G<n> placementSpec;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4718G<Float> fadeOutSpec;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isRunningMovingAwayAnimation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isPlacementAnimationInProgress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isAppearanceAnimationInProgress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isDisappearanceAnimationInProgress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isDisappearanceAnimationFinished;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rawOffset;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long finalOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private C3870c layer;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C4737a<n, C4763n> placementDeltaAnimation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C4737a<Float, C4761m> visibilityAnimation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 placementDelta;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long lookaheadOffset;

    /* compiled from: LazyLayoutItemAnimation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/b$a;", "", "<init>", "()V", "LU0/n;", "NotInitialized", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a() {
            return b.f22374u;
        }

        private Companion() {
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {182}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.b$b, reason: collision with other inner class name */
    static final class C0318b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22393B;

        C0318b(InterfaceC4588d<? super C0318b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new C0318b(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0318b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22393B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = b.this.visibilityAnimation;
                Float fB = kotlin.coroutines.jvm.internal.b.b(1.0f);
                this.f22393B = 1;
                if (c4737a.t(fB, this) == objE) {
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

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {195, 197}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22395B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f22396C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ b f22397D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC4718G<Float> f22398E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C3870c f22399F;

        /* compiled from: LazyLayoutItemAnimation.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/a;", "", "Lv/m;", "Loa/F;", "a", "(Lv/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<C4737a<Float, C4761m>, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C3870c f22400B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ b f22401C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3870c c3870c, b bVar) {
                super(1);
                this.f22400B = c3870c;
                this.f22401C = bVar;
            }

            public final void a(C4737a<Float, C4761m> c4737a) {
                this.f22400B.J(c4737a.m().floatValue());
                this.f22401C.onLayerPropertyChanged.invoke();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C4737a<Float, C4761m> c4737a) {
                a(c4737a);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, b bVar, InterfaceC4718G<Float> interfaceC4718G, C3870c c3870c, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22396C = z10;
            this.f22397D = bVar;
            this.f22398E = interfaceC4718G;
            this.f22399F = c3870c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new c(this.f22396C, this.f22397D, this.f22398E, this.f22399F, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22395B;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    if (this.f22396C) {
                        C4737a c4737a = this.f22397D.visibilityAnimation;
                        Float fB = kotlin.coroutines.jvm.internal.b.b(0.0f);
                        this.f22395B = 1;
                        if (c4737a.t(fB, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                        this.f22397D.y(false);
                        return C4153F.f46609a;
                    }
                    C4173r.b(obj);
                }
                C4737a c4737a2 = this.f22397D.visibilityAnimation;
                Float fB2 = kotlin.coroutines.jvm.internal.b.b(1.0f);
                InterfaceC4718G<Float> interfaceC4718G = this.f22398E;
                a aVar = new a(this.f22399F, this.f22397D);
                this.f22395B = 2;
                if (C4737a.f(c4737a2, fB2, interfaceC4718G, null, aVar, this, 4, null) == objE) {
                    return objE;
                }
                this.f22397D.y(false);
                return C4153F.f46609a;
            } catch (Throwable th) {
                this.f22397D.y(false);
                throw th;
            }
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {216}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22402B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC4718G<Float> f22404D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C3870c f22405E;

        /* compiled from: LazyLayoutItemAnimation.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/a;", "", "Lv/m;", "Loa/F;", "a", "(Lv/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<C4737a<Float, C4761m>, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C3870c f22406B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ b f22407C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3870c c3870c, b bVar) {
                super(1);
                this.f22406B = c3870c;
                this.f22407C = bVar;
            }

            public final void a(C4737a<Float, C4761m> c4737a) {
                this.f22406B.J(c4737a.m().floatValue());
                this.f22407C.onLayerPropertyChanged.invoke();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C4737a<Float, C4761m> c4737a) {
                a(c4737a);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC4718G<Float> interfaceC4718G, C3870c c3870c, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22404D = interfaceC4718G;
            this.f22405E = c3870c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new d(this.f22404D, this.f22405E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22402B;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    C4737a c4737a = b.this.visibilityAnimation;
                    Float fB = kotlin.coroutines.jvm.internal.b.b(0.0f);
                    InterfaceC4718G<Float> interfaceC4718G = this.f22404D;
                    a aVar = new a(this.f22405E, b.this);
                    this.f22402B = 1;
                    if (C4737a.f(c4737a, fB, interfaceC4718G, null, aVar, this, 4, null) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                b.this.z(true);
                b.this.A(false);
                return C4153F.f46609a;
            } catch (Throwable th) {
                b.this.A(false);
                throw th;
            }
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {151, 158}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f22408B;

        /* renamed from: C, reason: collision with root package name */
        int f22409C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC4718G<n> f22411E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f22412F;

        /* compiled from: LazyLayoutItemAnimation.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv/a;", "LU0/n;", "Lv/n;", "Loa/F;", "a", "(Lv/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<C4737a<n, C4763n>, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ b f22413B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ long f22414C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, long j10) {
                super(1);
                this.f22413B = bVar;
                this.f22414C = j10;
            }

            public final void a(C4737a<n, C4763n> c4737a) {
                this.f22413B.F(n.k(c4737a.m().getPackedValue(), this.f22414C));
                this.f22413B.onLayerPropertyChanged.invoke();
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C4737a<n, C4763n> c4737a) {
                a(c4737a);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC4718G<n> interfaceC4718G, long j10, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f22411E = interfaceC4718G;
            this.f22412F = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new e(this.f22411E, this.f22412F, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r11.f22409C
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oa.C4173r.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto Laa
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                java.lang.Object r1 = r11.f22408B
                v.G r1 = (kotlin.InterfaceC4718G) r1
                oa.C4173r.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto L67
            L23:
                oa.C4173r.b(r12)
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                v.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 == 0) goto L41
                v.G<U0.n> r12 = r11.f22411E     // Catch: java.util.concurrent.CancellationException -> Lb5
                boolean r1 = r12 instanceof kotlin.C4748f0     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r1 == 0) goto L3b
                v.f0 r12 = (kotlin.C4748f0) r12     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto L3f
            L3b:
                v.f0 r12 = kotlin.C0974m.a()     // Catch: java.util.concurrent.CancellationException -> Lb5
            L3f:
                r1 = r12
                goto L44
            L41:
                v.G<U0.n> r12 = r11.f22411E     // Catch: java.util.concurrent.CancellationException -> Lb5
                goto L3f
            L44:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                v.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 != 0) goto L70
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                v.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r4 = r11.f22412F     // Catch: java.util.concurrent.CancellationException -> Lb5
                U0.n r4 = U0.n.b(r4)     // Catch: java.util.concurrent.CancellationException -> Lb5
                r11.f22408B = r1     // Catch: java.util.concurrent.CancellationException -> Lb5
                r11.f22409C = r3     // Catch: java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r12 = r12.t(r4, r11)     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 != r0) goto L67
                return r0
            L67:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                Ba.a r12 = androidx.compose.foundation.lazy.layout.b.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> Lb5
            L70:
                r5 = r1
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                v.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r12 = r12.m()     // Catch: java.util.concurrent.CancellationException -> Lb5
                U0.n r12 = (U0.n) r12     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r3 = r12.getPackedValue()     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r6 = r11.f22412F     // Catch: java.util.concurrent.CancellationException -> Lb5
                long r3 = U0.n.k(r3, r6)     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                v.a r12 = androidx.compose.foundation.lazy.layout.b.c(r12)     // Catch: java.util.concurrent.CancellationException -> Lb5
                U0.n r1 = U0.n.b(r3)     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b$e$a r7 = new androidx.compose.foundation.lazy.layout.b$e$a     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b r6 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r7.<init>(r6, r3)     // Catch: java.util.concurrent.CancellationException -> Lb5
                r3 = 0
                r11.f22408B = r3     // Catch: java.util.concurrent.CancellationException -> Lb5
                r11.f22409C = r2     // Catch: java.util.concurrent.CancellationException -> Lb5
                r6 = 0
                r9 = 4
                r10 = 0
                r3 = r12
                r4 = r1
                r8 = r11
                java.lang.Object r12 = kotlin.C4737a.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lb5
                if (r12 != r0) goto Laa
                return r0
            Laa:
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                r0 = 0
                androidx.compose.foundation.lazy.layout.b.h(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b r12 = androidx.compose.foundation.lazy.layout.b.this     // Catch: java.util.concurrent.CancellationException -> Lb5
                androidx.compose.foundation.lazy.layout.b.j(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lb5
            Lb5:
                oa.F r12 = oa.C4153F.f46609a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {115}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22415B;

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new f(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22415B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = b.this.placementDeltaAnimation;
                n nVarB = n.b(n.INSTANCE.a());
                this.f22415B = 1;
                if (c4737a.t(nVarB, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            b.this.F(n.INSTANCE.a());
            b.this.E(false);
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {231}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22417B;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new g(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((g) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22417B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = b.this.placementDeltaAnimation;
                this.f22417B = 1;
                if (c4737a.u(this) == objE) {
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

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {237}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22419B;

        h(InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new h(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((h) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22419B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = b.this.visibilityAnimation;
                this.f22419B = 1;
                if (c4737a.u(this) == objE) {
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

    /* compiled from: LazyLayoutItemAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {243}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22421B;

        i(InterfaceC4588d<? super i> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return b.this.new i(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((i) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22421B;
            if (i10 == 0) {
                C4173r.b(obj);
                C4737a c4737a = b.this.visibilityAnimation;
                this.f22421B = 1;
                if (c4737a.u(this) == objE) {
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

    public b(I i10, F0 f02, Ba.a<C4153F> aVar) {
        this.coroutineScope = i10;
        this.graphicsContext = f02;
        this.onLayerPropertyChanged = aVar;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = r1.c(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = r1.c(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = r1.c(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = r1.c(bool, null, 2, null);
        long j10 = f22374u;
        this.rawOffset = j10;
        n.Companion companion = n.INSTANCE;
        this.finalOffset = companion.a();
        this.layer = f02 != null ? f02.b() : null;
        this.placementDeltaAnimation = new C4737a<>(n.b(companion.a()), C4774s0.d(companion), null, null, 12, null);
        this.visibilityAnimation = new C4737a<>(Float.valueOf(1.0f), C4774s0.i(C3856m.f44008a), null, null, 12, null);
        this.placementDelta = r1.c(n.b(companion.a()), null, 2, null);
        this.lookaheadOffset = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z10) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(boolean z10) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(long j10) {
        this.placementDelta.setValue(n.b(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean z10) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z10) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z10));
    }

    public final void B(InterfaceC4718G<Float> interfaceC4718G) {
        this.fadeInSpec = interfaceC4718G;
    }

    public final void C(InterfaceC4718G<Float> interfaceC4718G) {
        this.fadeOutSpec = interfaceC4718G;
    }

    public final void D(long j10) {
        this.finalOffset = j10;
    }

    public final void G(InterfaceC4718G<n> interfaceC4718G) {
        this.placementSpec = interfaceC4718G;
    }

    public final void H(long j10) {
        this.rawOffset = j10;
    }

    public final void k() {
        C3870c c3870c = this.layer;
        InterfaceC4718G<Float> interfaceC4718G = this.fadeInSpec;
        if (s() || interfaceC4718G == null || c3870c == null) {
            if (u()) {
                if (c3870c != null) {
                    c3870c.J(1.0f);
                }
                C1841i.d(this.coroutineScope, null, null, new C0318b(null), 3, null);
                return;
            }
            return;
        }
        y(true);
        boolean zU = u();
        boolean z10 = !zU;
        if (!zU) {
            c3870c.J(0.0f);
        }
        C1841i.d(this.coroutineScope, null, null, new c(z10, this, interfaceC4718G, c3870c, null), 3, null);
    }

    public final void l() {
        C3870c c3870c = this.layer;
        InterfaceC4718G<Float> interfaceC4718G = this.fadeOutSpec;
        if (c3870c == null || u() || interfaceC4718G == null) {
            return;
        }
        A(true);
        C1841i.d(this.coroutineScope, null, null, new d(interfaceC4718G, c3870c, null), 3, null);
    }

    public final void m(long delta, boolean isMovingAway) {
        InterfaceC4718G<n> interfaceC4718G = this.placementSpec;
        if (interfaceC4718G == null) {
            return;
        }
        long jK = n.k(q(), delta);
        F(jK);
        E(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        C1841i.d(this.coroutineScope, null, null, new e(interfaceC4718G, jK, null), 3, null);
    }

    public final void n() {
        if (v()) {
            C1841i.d(this.coroutineScope, null, null, new f(null), 3, null);
        }
    }

    /* renamed from: o, reason: from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* renamed from: p, reason: from getter */
    public final C3870c getLayer() {
        return this.layer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((n) this.placementDelta.getValue()).getPackedValue();
    }

    /* renamed from: r, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* renamed from: w, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void x() {
        F0 f02;
        if (v()) {
            E(false);
            C1841i.d(this.coroutineScope, null, null, new g(null), 3, null);
        }
        if (s()) {
            y(false);
            C1841i.d(this.coroutineScope, null, null, new h(null), 3, null);
        }
        if (u()) {
            A(false);
            C1841i.d(this.coroutineScope, null, null, new i(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        F(n.INSTANCE.a());
        this.rawOffset = f22374u;
        C3870c c3870c = this.layer;
        if (c3870c != null && (f02 = this.graphicsContext) != null) {
            f02.a(c3870c);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }
}
