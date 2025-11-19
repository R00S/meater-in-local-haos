package cc;

import Xb.AbstractC1825a;
import kotlin.Metadata;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcc/B;", "T", "LXb/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lta/g;", "context", "Lta/d;", "uCont", "<init>", "(Lta/g;Lta/d;)V", "", "state", "Loa/F;", "H", "(Ljava/lang/Object;)V", "b1", "E", "Lta/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "", "z0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2357B<T> extends AbstractC1825a<T> implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final InterfaceC4588d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public C2357B(ta.g gVar, InterfaceC4588d<? super T> interfaceC4588d) {
        super(gVar, true, true);
        this.uCont = interfaceC4588d;
    }

    @Override // Xb.C0
    protected void H(Object state) {
        C2380k.c(C4696b.c(this.uCont), Xb.B.a(state, this.uCont), null, 2, null);
    }

    @Override // Xb.AbstractC1825a
    protected void b1(Object state) {
        InterfaceC4588d<T> interfaceC4588d = this.uCont;
        interfaceC4588d.resumeWith(Xb.B.a(state, interfaceC4588d));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC4588d<T> interfaceC4588d = this.uCont;
        if (interfaceC4588d instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC4588d;
        }
        return null;
    }

    @Override // Xb.C0
    protected final boolean z0() {
        return true;
    }
}
