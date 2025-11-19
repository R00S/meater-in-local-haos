package kotlin;

import Xb.InterfaceC1847l;
import gc.InterfaceC3460a;
import kotlin.InterfaceC1555l0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0015J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u0005R+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0017\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R+\u0010/\u001a\u00020(2\u0006\u0010\r\u001a\u00020(8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b)\u00103\"\u0004\b4\u00105R\u001a\u0010:\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b1\u00109¨\u0006;"}, d2 = {"Lv/b0;", "S", "Lv/o0;", "Loa/F;", "m", "()V", "Lv/m0;", "transition", "f", "(Lv/m0;)V", "g", "k", "l", "<set-?>", "b", "LO/p0;", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "targetState", "c", "a", "d", "currentState", "Ljava/lang/Object;", "getComposedTargetState$animation_core_release", "n", "composedTargetState", "e", "Lv/m0;", "", "J", "getTotalDurationNanos$animation_core_release", "()J", "setTotalDurationNanos$animation_core_release", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "LBa/a;", "recalculateTotalDurationNanos", "", "h", "LO/l0;", "j", "()F", "setFraction", "(F)V", "fraction", "LXb/l;", "i", "LXb/l;", "()LXb/l;", "o", "(LXb/l;)V", "compositionContinuation", "Lgc/a;", "Lgc/a;", "()Lgc/a;", "compositionContinuationMutex", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4740b0<S> extends AbstractC4766o0<S> {

    /* renamed from: k, reason: collision with root package name */
    private static final a f50713k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f50714l = 8;

    /* renamed from: m, reason: collision with root package name */
    private static final C4761m f50715m = new C4761m(0.0f);

    /* renamed from: n, reason: collision with root package name */
    private static final C4761m f50716n = new C4761m(1.0f);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 targetState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 currentState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private S composedTargetState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C4762m0<S> transition;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long totalDurationNanos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> recalculateTotalDurationNanos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1555l0 fraction;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1847l<? super S> compositionContinuation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3460a compositionContinuationMutex;

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv/b0$a;", "", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.b0$a */
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    private final void m() {
        C4762m0<S> c4762m0 = this.transition;
        if (c4762m0 == null) {
            return;
        }
        c4762m0.y(Da.a.d(j() * c4762m0.l()));
    }

    @Override // kotlin.AbstractC4766o0
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // kotlin.AbstractC4766o0
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // kotlin.AbstractC4766o0
    public void d(S s10) {
        this.currentState.setValue(s10);
    }

    @Override // kotlin.AbstractC4766o0
    public void f(C4762m0<S> transition) {
        C4762m0<S> c4762m0 = this.transition;
        if (!(c4762m0 == null || C3862t.b(transition, c4762m0))) {
            C4736Z.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // kotlin.AbstractC4766o0
    public void g() {
        this.transition = null;
        C4764n0.c().k(this);
    }

    public final InterfaceC1847l<S> h() {
        return this.compositionContinuation;
    }

    /* renamed from: i, reason: from getter */
    public final InterfaceC3460a getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    public final float j() {
        return this.fraction.b();
    }

    public final void k() {
        C4764n0.c().o(this, C4764n0.f50869a, this.recalculateTotalDurationNanos);
    }

    public final void l() {
        long j10 = this.totalDurationNanos;
        k();
        long j11 = this.totalDurationNanos;
        if (j10 == j11 || j11 == 0) {
            return;
        }
        m();
    }

    public final void n(S s10) {
        this.composedTargetState = s10;
    }

    public final void o(InterfaceC1847l<? super S> interfaceC1847l) {
        this.compositionContinuation = interfaceC1847l;
    }
}
