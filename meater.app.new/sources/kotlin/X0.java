package kotlin;

import Ba.p;
import Xb.C1837g;
import Xb.I;
import Xb.T;
import Xb.Z;
import kotlin.InterfaceC1545g0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LO/X0;", "LO/g0;", "<init>", "()V", "R", "Lkotlin/Function1;", "", "onFrame", "K", "(LBa/l;Lta/d;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class X0 implements InterfaceC1545g0 {

    /* renamed from: B, reason: collision with root package name */
    public static final X0 f12760B = new X0();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ActualAndroid.android.kt */
    @f(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {52}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LXb/I;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<R> extends l implements p<I, InterfaceC4588d<? super R>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f12761B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Long, R> f12762C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.l<? super Long, ? extends R> lVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f12762C = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f12762C, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super R> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f12761B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f12761B = 1;
                if (T.a(16L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return this.f12762C.invoke(b.d(System.nanoTime()));
        }
    }

    private X0() {
    }

    @Override // kotlin.InterfaceC1545g0
    public <R> Object K(Ba.l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        return C1837g.g(Z.c(), new a(lVar, null), interfaceC4588d);
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
