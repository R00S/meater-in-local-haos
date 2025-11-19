package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Lta/d;", "", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/io/Serializable;", "completion", "<init>", "(Lta/d;)V", "Loa/q;", "result", "Loa/F;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lta/d;)Lta/d;", "value", "(Ljava/lang/Object;Lta/d;)Lta/d;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lta/d;", "getCompletion", "()Lta/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a implements InterfaceC4588d<Object>, e, Serializable {
    private final InterfaceC4588d<Object> completion;

    public a(InterfaceC4588d<Object> interfaceC4588d) {
        this.completion = interfaceC4588d;
    }

    public InterfaceC4588d<C4153F> create(InterfaceC4588d<?> completion) {
        C3862t.g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        InterfaceC4588d<Object> interfaceC4588d = this.completion;
        if (interfaceC4588d instanceof e) {
            return (e) interfaceC4588d;
        }
        return null;
    }

    public final InterfaceC4588d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object result);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ta.InterfaceC4588d
    public final void resumeWith(Object result) {
        Object objInvokeSuspend;
        InterfaceC4588d interfaceC4588d = this;
        while (true) {
            h.b(interfaceC4588d);
            a aVar = (a) interfaceC4588d;
            InterfaceC4588d interfaceC4588d2 = aVar.completion;
            C3862t.d(interfaceC4588d2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(result);
            } catch (Throwable th) {
                C4172q.Companion companion = C4172q.INSTANCE;
                result = C4172q.a(C4173r.a(th));
            }
            if (objInvokeSuspend == C4696b.e()) {
                return;
            }
            result = C4172q.a(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(interfaceC4588d2 instanceof a)) {
                interfaceC4588d2.resumeWith(result);
                return;
            }
            interfaceC4588d = interfaceC4588d2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC4588d<C4153F> create(Object value, InterfaceC4588d<?> completion) {
        C3862t.g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
