package Xb;

import kotlin.Metadata;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LXb/v;", "T", "LXb/C0;", "LXb/u;", "LXb/v0;", "parent", "<init>", "(LXb/v0;)V", "g", "()Ljava/lang/Object;", "n", "(Lta/d;)Ljava/lang/Object;", "value", "", "X", "(Ljava/lang/Object;)Z", "", "exception", "d", "(Ljava/lang/Throwable;)Z", "n0", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1866v<T> extends C0 implements InterfaceC1864u<T> {
    public C1866v(InterfaceC1867v0 interfaceC1867v0) {
        super(true);
        w0(interfaceC1867v0);
    }

    @Override // Xb.InterfaceC1864u
    public boolean X(T value) {
        return D0(value);
    }

    @Override // Xb.InterfaceC1864u
    public boolean d(Throwable exception) {
        return D0(new C1874z(exception, false, 2, null));
    }

    @Override // Xb.P
    public T g() {
        return (T) j0();
    }

    @Override // Xb.P
    public Object n(InterfaceC4588d<? super T> interfaceC4588d) throws Throwable {
        Object objI = I(interfaceC4588d);
        C4696b.e();
        return objI;
    }

    @Override // Xb.C0
    public boolean n0() {
        return true;
    }
}
