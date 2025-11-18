package androidx.compose.ui.platform;

import Xb.C1849m;
import Xb.InterfaceC1847l;
import android.view.Choreographer;
import kotlin.InterfaceC1545g0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: AndroidUiFrameClock.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/T;", "LO/g0;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/Q;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/Q;)V", "R", "Lkotlin/Function1;", "", "onFrame", "K", "(LBa/l;Lta/d;)Ljava/lang/Object;", "B", "Landroid/view/Choreographer;", "c", "()Landroid/view/Choreographer;", "C", "Landroidx/compose/ui/platform/Q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T implements InterfaceC1545g0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Q dispatcher;

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Q f23005B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f23006C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q q10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f23005B = q10;
            this.f23006C = frameCallback;
        }

        public final void a(Throwable th) {
            this.f23005B.s1(this.f23006C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f23008C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f23008C = frameCallback;
        }

        public final void a(Throwable th) {
            T.this.getChoreographer().removeFrameCallback(this.f23008C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Loa/F;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l<R> f23009B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ T f23010C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.l<Long, R> f23011D;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC1847l<? super R> interfaceC1847l, T t10, Ba.l<? super Long, ? extends R> lVar) {
            this.f23009B = interfaceC1847l;
            this.f23010C = t10;
            this.f23011D = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objA;
            InterfaceC4588d interfaceC4588d = this.f23009B;
            Ba.l<Long, R> lVar = this.f23011D;
            try {
                C4172q.Companion companion = C4172q.INSTANCE;
                objA = C4172q.a(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                C4172q.Companion companion2 = C4172q.INSTANCE;
                objA = C4172q.a(C4173r.a(th));
            }
            interfaceC4588d.resumeWith(objA);
        }
    }

    public T(Choreographer choreographer, Q q10) {
        this.choreographer = choreographer;
        this.dispatcher = q10;
    }

    @Override // kotlin.InterfaceC1545g0
    public <R> Object K(Ba.l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        Q q10 = this.dispatcher;
        if (q10 == null) {
            g.b bVarB = interfaceC4588d.getContext().b(ta.e.INSTANCE);
            q10 = bVarB instanceof Q ? (Q) bVarB : null;
        }
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        c cVar = new c(c1849m, this, lVar);
        if (q10 == null || !C3862t.b(q10.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(cVar);
            c1849m.R(new b(cVar));
        } else {
            q10.q1(cVar);
            c1849m.R(new a(q10, cVar));
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR;
    }

    @Override // ta.g
    public <R> R L(R r10, Ba.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) InterfaceC1545g0.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public ta.g N(g.c<?> cVar) {
        return InterfaceC1545g0.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) InterfaceC1545g0.a.b(this, cVar);
    }

    /* renamed from: c, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // ta.g
    public ta.g s(ta.g gVar) {
        return InterfaceC1545g0.a.d(this, gVar);
    }
}
