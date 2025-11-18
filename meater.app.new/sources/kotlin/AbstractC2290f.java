package kotlin;

import Ba.p;
import Xb.D;
import Zb.d;
import Zb.t;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.e;
import ta.g;
import ua.C4696b;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lbc/f;", "S", "T", "Lbc/d;", "Lac/e;", "flow", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "<init>", "(Lac/e;Lta/g;ILZb/d;)V", "Lac/f;", "collector", "newContext", "Loa/F;", "r", "(Lac/f;Lta/g;Lta/d;)Ljava/lang/Object;", "s", "(Lac/f;Lta/d;)Ljava/lang/Object;", "LZb/t;", "scope", "h", "(LZb/t;Lta/d;)Ljava/lang/Object;", "b", "", "toString", "()Ljava/lang/String;", "E", "Lac/e;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2290f<S, T> extends AbstractC2288d<T> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    protected final InterfaceC1970e<S> flow;

    /* compiled from: ChannelFlow.kt */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "T", "Lac/f;", "it", "Loa/F;", "<anonymous>", "(Lac/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.f$a */
    static final class a extends l implements p<InterfaceC1971f<? super T>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30756B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f30757C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ AbstractC2290f<S, T> f30758D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2290f<S, T> abstractC2290f, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30758D = abstractC2290f;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(interfaceC1971f, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f30758D, interfaceC4588d);
            aVar.f30757C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f30756B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1971f<? super T> interfaceC1971f = (InterfaceC1971f) this.f30757C;
                AbstractC2290f<S, T> abstractC2290f = this.f30758D;
                this.f30756B = 1;
                if (abstractC2290f.s(interfaceC1971f, this) == objE) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2290f(InterfaceC1970e<? extends S> interfaceC1970e, g gVar, int i10, d dVar) {
        super(gVar, i10, dVar);
        this.flow = interfaceC1970e;
    }

    static /* synthetic */ <S, T> Object p(AbstractC2290f<S, T> abstractC2290f, InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (abstractC2290f.capacity == -3) {
            g context = interfaceC4588d.getContext();
            g gVarE = D.e(context, abstractC2290f.context);
            if (C3862t.b(gVarE, context)) {
                Object objS = abstractC2290f.s(interfaceC1971f, interfaceC4588d);
                return objS == C4696b.e() ? objS : C4153F.f46609a;
            }
            e.Companion companion = e.INSTANCE;
            if (C3862t.b(gVarE.b(companion), context.b(companion))) {
                Object objR = abstractC2290f.r(interfaceC1971f, gVarE, interfaceC4588d);
                return objR == C4696b.e() ? objR : C4153F.f46609a;
            }
        }
        Object objB = super.b(interfaceC1971f, interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    static /* synthetic */ <S, T> Object q(AbstractC2290f<S, T> abstractC2290f, t<? super T> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objS = abstractC2290f.s(new C2301r(tVar), interfaceC4588d);
        return objS == C4696b.e() ? objS : C4153F.f46609a;
    }

    private final Object r(InterfaceC1971f<? super T> interfaceC1971f, g gVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return C2289e.c(gVar, C2289e.d(interfaceC1971f, interfaceC4588d.getContext()), null, new a(this, null), interfaceC4588d, 4, null);
    }

    @Override // kotlin.AbstractC2288d, ac.InterfaceC1970e
    public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return p(this, interfaceC1971f, interfaceC4588d);
    }

    @Override // kotlin.AbstractC2288d
    protected Object h(t<? super T> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return q(this, tVar, interfaceC4588d);
    }

    protected abstract Object s(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d);

    @Override // kotlin.AbstractC2288d
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
