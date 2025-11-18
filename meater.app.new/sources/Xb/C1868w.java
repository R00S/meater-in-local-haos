package Xb;

import kotlin.Metadata;
import oa.C4172q;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "LXb/u;", "Loa/q;", "result", "", "c", "(LXb/u;Ljava/lang/Object;)Z", "LXb/v0;", "parent", "a", "(LXb/v0;)LXb/u;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1868w {
    public static final <T> InterfaceC1864u<T> a(InterfaceC1867v0 interfaceC1867v0) {
        return new C1866v(interfaceC1867v0);
    }

    public static /* synthetic */ InterfaceC1864u b(InterfaceC1867v0 interfaceC1867v0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1867v0 = null;
        }
        return a(interfaceC1867v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(InterfaceC1864u<T> interfaceC1864u, Object obj) {
        Throwable thB = C4172q.b(obj);
        return thB == null ? interfaceC1864u.X(obj) : interfaceC1864u.d(thB);
    }
}
