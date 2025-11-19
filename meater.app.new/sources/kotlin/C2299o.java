package kotlin;

import Ba.p;
import Ba.q;
import Ub.n;
import Xb.C1873y0;
import ac.InterfaceC1971f;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;
import ta.g;
import ta.h;
import ua.C4696b;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lbc/o;", "T", "Lac/f;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "collector", "Lta/g;", "collectContext", "<init>", "(Lac/f;Lta/g;)V", "Lta/d;", "Loa/F;", "uCont", "value", "", "m", "(Lta/d;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "b", "(Lta/g;Lta/g;Ljava/lang/Object;)V", "Lbc/i;", "exception", "n", "(Lbc/i;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Loa/q;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "B", "Lac/f;", "C", "Lta/g;", "", "D", "I", "collectContextSize", "E", "lastEmissionContext", "F", "Lta/d;", "completion_", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "getContext", "()Lta/g;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2299o<T> extends d implements InterfaceC1971f<T>, e {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC1971f<T> collector;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final g collectContext;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final int collectContextSize;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private g lastEmissionContext;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4588d<? super C4153F> completion_;

    /* compiled from: SafeCollector.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "count", "Lta/g$b;", "<anonymous parameter 1>", "a", "(ILta/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.o$a */
    static final class a extends AbstractC3864v implements p<Integer, g.b, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f30791B = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2299o(InterfaceC1971f<? super T> interfaceC1971f, g gVar) {
        super(C2296l.f30780B, h.f50000B);
        this.collector = interfaceC1971f;
        this.collectContext = gVar;
        this.collectContextSize = ((Number) gVar.L(0, a.f30791B)).intValue();
    }

    private final void b(g currentContext, g previousContext, T value) {
        if (previousContext instanceof C2293i) {
            n((C2293i) previousContext, value);
        }
        C2300q.a(this, currentContext);
    }

    private final Object m(InterfaceC4588d<? super C4153F> uCont, T value) {
        g context = uCont.getContext();
        C1873y0.m(context);
        g gVar = this.lastEmissionContext;
        if (gVar != context) {
            b(context, gVar, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        q qVar = Function3.f30792a;
        InterfaceC1971f<T> interfaceC1971f = this.collector;
        C3862t.e(interfaceC1971f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C3862t.e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objG = qVar.g(interfaceC1971f, value, this);
        if (!C3862t.b(objG, C4696b.e())) {
            this.completion_ = null;
        }
        return objG;
    }

    private final void n(C2293i exception, Object value) {
        throw new IllegalStateException(n.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // ac.InterfaceC1971f
    public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        try {
            Object objM = m(interfaceC4588d, t10);
            if (objM == C4696b.e()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
            }
            return objM == C4696b.e() ? objM : C4153F.f46609a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C2293i(th, interfaceC4588d.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        InterfaceC4588d<? super C4153F> interfaceC4588d = this.completion_;
        if (interfaceC4588d instanceof e) {
            return (e) interfaceC4588d;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, ta.InterfaceC4588d
    public g getContext() {
        g gVar = this.lastEmissionContext;
        return gVar == null ? h.f50000B : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object result) {
        Throwable thB = C4172q.b(result);
        if (thB != null) {
            this.lastEmissionContext = new C2293i(thB, getContext());
        }
        InterfaceC4588d<? super C4153F> interfaceC4588d = this.completion_;
        if (interfaceC4588d != null) {
            interfaceC4588d.resumeWith(result);
        }
        return C4696b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
