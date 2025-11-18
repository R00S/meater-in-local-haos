package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lbc/s;", "T", "Lta/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lta/g;", "context", "<init>", "(Lta/d;Lta/g;)V", "Loa/q;", "result", "Loa/F;", "resumeWith", "(Ljava/lang/Object;)V", "B", "Lta/d;", "C", "Lta/g;", "getContext", "()Lta/g;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2302s<T> implements InterfaceC4588d<T>, e {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4588d<T> uCont;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final g context;

    /* JADX WARN: Multi-variable type inference failed */
    public C2302s(InterfaceC4588d<? super T> interfaceC4588d, g gVar) {
        this.uCont = interfaceC4588d;
        this.context = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        InterfaceC4588d<T> interfaceC4588d = this.uCont;
        if (interfaceC4588d instanceof e) {
            return (e) interfaceC4588d;
        }
        return null;
    }

    @Override // ta.InterfaceC4588d
    public g getContext() {
        return this.context;
    }

    @Override // ta.InterfaceC4588d
    public void resumeWith(Object result) {
        this.uCont.resumeWith(result);
    }
}
