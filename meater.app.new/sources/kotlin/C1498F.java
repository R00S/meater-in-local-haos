package kotlin;

import Ba.p;
import Xb.C1837g;
import Xb.C1849m;
import Xb.I;
import Xb.InterfaceC1847l;
import Xb.Z;
import android.view.Choreographer;
import kotlin.InterfaceC1545g0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LO/F;", "LO/g0;", "<init>", "()V", "R", "Lkotlin/Function1;", "", "onFrame", "K", "(LBa/l;Lta/d;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "C", "Landroid/view/Choreographer;", "choreographer", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1498F implements InterfaceC1545g0 {

    /* renamed from: B, reason: collision with root package name */
    public static final C1498F f12603B = new C1498F();

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final Choreographer choreographer = (Choreographer) C1837g.e(Z.c().M0(), new a(null));

    /* compiled from: ActualAndroid.android.kt */
    @f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXb/I;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(LXb/I;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.F$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super Choreographer>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f12605B;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super Choreographer> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f12605B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return Choreographer.getInstance();
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.F$b */
    static final class b extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f12606B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f12606B = frameCallback;
        }

        public final void a(Throwable th) {
            C1498F.choreographer.removeFrameCallback(this.f12606B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Loa/F;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.F$c */
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l<R> f12607B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Long, R> f12608C;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC1847l<? super R> interfaceC1847l, Ba.l<? super Long, ? extends R> lVar) {
            this.f12607B = interfaceC1847l;
            this.f12608C = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objA;
            InterfaceC4588d interfaceC4588d = this.f12607B;
            C1498F c1498f = C1498F.f12603B;
            Ba.l<Long, R> lVar = this.f12608C;
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

    private C1498F() {
    }

    @Override // kotlin.InterfaceC1545g0
    public <R> Object K(Ba.l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        c cVar = new c(c1849m, lVar);
        choreographer.postFrameCallback(cVar);
        c1849m.R(new b(cVar));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            h.c(interfaceC4588d);
        }
        return objR;
    }

    @Override // ta.g
    public <R> R L(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) InterfaceC1545g0.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public g N(g.c<?> cVar) {
        return InterfaceC1545g0.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) InterfaceC1545g0.a.b(this, cVar);
    }

    @Override // ta.g
    public g s(g gVar) {
        return InterfaceC1545g0.a.d(this, gVar);
    }
}
