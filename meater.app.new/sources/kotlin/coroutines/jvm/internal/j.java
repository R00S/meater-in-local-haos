package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/coroutines/jvm/internal/a;", "Lta/d;", "", "completion", "<init>", "(Lta/d;)V", "Lta/g;", "getContext", "()Lta/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class j extends a {
    public j(InterfaceC4588d<Object> interfaceC4588d) {
        super(interfaceC4588d);
        if (interfaceC4588d != null && interfaceC4588d.getContext() != ta.h.f50000B) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ta.InterfaceC4588d
    public ta.g getContext() {
        return ta.h.f50000B;
    }
}
