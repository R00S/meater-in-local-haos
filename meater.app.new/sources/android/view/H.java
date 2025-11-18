package android.view;

import Ba.p;
import Xb.C1837g;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.Z;
import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: PausingDispatcher.jvm.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001aF\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "Landroidx/lifecycle/m;", "Lkotlin/Function2;", "LXb/I;", "Lta/d;", "", "block", "a", "(Landroidx/lifecycle/m;LBa/p;Lta/d;)Ljava/lang/Object;", "Landroidx/lifecycle/m$b;", "minState", "b", "(Landroidx/lifecycle/m;Landroidx/lifecycle/m$b;LBa/p;Lta/d;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PausingDispatcher.jvm.kt */
    @f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LXb/I;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<T> extends l implements p<I, InterfaceC4588d<? super T>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f25868B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f25869C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m f25870D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m.b f25871E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<I, InterfaceC4588d<? super T>, Object> f25872F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC2106m abstractC2106m, AbstractC2106m.b bVar, p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f25870D = abstractC2106m;
            this.f25871E = bVar;
            this.f25872F = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f25870D, this.f25871E, this.f25872F, interfaceC4588d);
            aVar.f25869C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super T> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2108o c2108o;
            Object objE = C4696b.e();
            int i10 = this.f25868B;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2108o = (C2108o) this.f25869C;
                try {
                    C4173r.b(obj);
                    c2108o.b();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    c2108o.b();
                    throw th;
                }
            }
            C4173r.b(obj);
            InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) ((I) this.f25869C).getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
            if (interfaceC1867v0 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            G g10 = new G();
            C2108o c2108o2 = new C2108o(this.f25870D, this.f25871E, g10.dispatchQueue, interfaceC1867v0);
            try {
                p<I, InterfaceC4588d<? super T>, Object> pVar = this.f25872F;
                this.f25869C = c2108o2;
                this.f25868B = 1;
                obj = C1837g.g(g10, pVar, this);
                if (obj == objE) {
                    return objE;
                }
                c2108o = c2108o2;
                c2108o.b();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c2108o = c2108o2;
                c2108o.b();
                throw th;
            }
        }
    }

    @InterfaceC4156a
    public static final <T> Object a(AbstractC2106m abstractC2106m, p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return b(abstractC2106m, AbstractC2106m.b.RESUMED, pVar, interfaceC4588d);
    }

    @InterfaceC4156a
    public static final <T> Object b(AbstractC2106m abstractC2106m, AbstractC2106m.b bVar, p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return C1837g.g(Z.c().M0(), new a(abstractC2106m, bVar, pVar, null), interfaceC4588d);
    }
}
