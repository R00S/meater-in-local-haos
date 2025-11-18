package Xb;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003*\f\b\u0007\u0010\u0005\"\u00020\u00042\u00020\u0004¨\u0006\u0006"}, d2 = {"Ljava/util/concurrent/Executor;", "LXb/E;", "a", "(Ljava/util/concurrent/Executor;)LXb/E;", "LXb/l0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1852n0 {
    public static final E a(Executor executor) {
        E e10;
        Y y10 = executor instanceof Y ? (Y) executor : null;
        return (y10 == null || (e10 = y10.dispatcher) == null) ? new C1850m0(executor) : e10;
    }
}
