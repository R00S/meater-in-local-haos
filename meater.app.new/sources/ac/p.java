package ac;

import cc.C2362G;
import kotlin.C2292h;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0007¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\" \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"T", "R", "Lac/e;", "Lkotlin/Function3;", "Lac/f;", "Lta/d;", "Loa/F;", "", "transform", "b", "(Lac/e;LBa/q;)Lac/e;", "Lkotlin/Function2;", "a", "(Lac/e;LBa/p;)Lac/e;", "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20395a = C2362G.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lac/f;", "it", "Loa/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class a<R, T> extends kotlin.coroutines.jvm.internal.l implements Ba.q<InterfaceC1971f<? super R>, T, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f20396B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f20397C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f20398D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.p<T, InterfaceC4588d<? super R>, Object> f20399E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.p<? super T, ? super InterfaceC4588d<? super R>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
            this.f20399E = pVar;
        }

        @Override // Ba.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object g(InterfaceC1971f<? super R> interfaceC1971f, T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            a aVar = new a(this.f20399E, interfaceC4588d);
            aVar.f20397C = interfaceC1971f;
            aVar.f20398D = t10;
            return aVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1971f interfaceC1971f;
            Object objE = C4696b.e();
            int i10 = this.f20396B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1971f interfaceC1971f2 = (InterfaceC1971f) this.f20397C;
                Object obj2 = this.f20398D;
                Ba.p<T, InterfaceC4588d<? super R>, Object> pVar = this.f20399E;
                this.f20397C = interfaceC1971f2;
                this.f20396B = 1;
                obj = pVar.invoke(obj2, this);
                interfaceC1971f = interfaceC1971f2;
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    return C4153F.f46609a;
                }
                InterfaceC1971f interfaceC1971f3 = (InterfaceC1971f) this.f20397C;
                C4173r.b(obj);
                interfaceC1971f = interfaceC1971f3;
            }
            this.f20397C = null;
            this.f20396B = 2;
            if (interfaceC1971f.a(obj, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    public static final <T, R> InterfaceC1970e<R> a(InterfaceC1970e<? extends T> interfaceC1970e, Ba.p<? super T, ? super InterfaceC4588d<? super R>, ? extends Object> pVar) {
        return C1972g.w(interfaceC1970e, new a(pVar, null));
    }

    public static final <T, R> InterfaceC1970e<R> b(InterfaceC1970e<? extends T> interfaceC1970e, Ba.q<? super InterfaceC1971f<? super R>, ? super T, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar) {
        return new C2292h(qVar, interfaceC1970e, null, 0, null, 28, null);
    }
}
