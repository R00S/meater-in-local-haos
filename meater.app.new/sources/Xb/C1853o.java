package Xb;

import cc.C2379j;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "LXb/l;", "LXb/k;", "handler", "Loa/F;", "c", "(LXb/l;LXb/k;)V", "Lta/d;", "delegate", "LXb/m;", "b", "(Lta/d;)LXb/m;", "LXb/b0;", "handle", "a", "(LXb/l;LXb/b0;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1853o {
    public static final void a(InterfaceC1847l<?> interfaceC1847l, InterfaceC1828b0 interfaceC1828b0) {
        c(interfaceC1847l, new C1830c0(interfaceC1828b0));
    }

    public static final <T> C1849m<T> b(InterfaceC4588d<? super T> interfaceC4588d) {
        if (!(interfaceC4588d instanceof C2379j)) {
            return new C1849m<>(interfaceC4588d, 1);
        }
        C1849m<T> c1849mI = ((C2379j) interfaceC4588d).i();
        if (c1849mI != null) {
            if (!c1849mI.I()) {
                c1849mI = null;
            }
            if (c1849mI != null) {
                return c1849mI;
            }
        }
        return new C1849m<>(interfaceC4588d, 2);
    }

    public static final <T> void c(InterfaceC1847l<? super T> interfaceC1847l, InterfaceC1845k interfaceC1845k) {
        if (!(interfaceC1847l instanceof C1849m)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C1849m) interfaceC1847l).A(interfaceC1845k);
    }
}
