package kotlin;

import Ba.p;
import ac.InterfaceC1971f;
import cc.C2365J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lbc/u;", "T", "Lac/f;", "downstream", "Lta/g;", "emitContext", "<init>", "(Lac/f;Lta/g;)V", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "B", "Lta/g;", "", "C", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lta/d;", "D", "LBa/p;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2304u<T> implements InterfaceC1971f<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final g emitContext;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Object countOrElement;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final p<T, InterfaceC4588d<? super C4153F>, Object> emitRef;

    /* compiled from: ChannelFlow.kt */
    @f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Loa/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.u$a */
    static final class a extends l implements p<T, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30801B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f30802C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1971f<T> f30803D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30803D = interfaceC1971f;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(t10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f30803D, interfaceC4588d);
            aVar.f30802C = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f30801B;
            if (i10 == 0) {
                C4173r.b(obj);
                Object obj2 = this.f30802C;
                InterfaceC1971f<T> interfaceC1971f = this.f30803D;
                this.f30801B = 1;
                if (interfaceC1971f.a(obj2, this) == objE) {
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

    public C2304u(InterfaceC1971f<? super T> interfaceC1971f, g gVar) {
        this.emitContext = gVar;
        this.countOrElement = C2365J.b(gVar);
        this.emitRef = new a(interfaceC1971f, null);
    }

    @Override // ac.InterfaceC1971f
    public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objB = C2289e.b(this.emitContext, t10, this.countOrElement, this.emitRef, interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }
}
