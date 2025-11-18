package ec;

import Xb.AbstractC1848l0;
import Xb.E;
import cc.C2362G;
import cc.C2364I;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u00060\u0005j\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u00060\u0005j\u0002`\fH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lec/b;", "LXb/l0;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Loa/F;", "execute", "(Ljava/lang/Runnable;)V", "Lta/g;", "context", "Lkotlinx/coroutines/Runnable;", "block", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "r0", "close", "", "toString", "()Ljava/lang/String;", "LXb/E;", "F", "LXb/E;", "default", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ec.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC3295b extends AbstractC1848l0 implements Executor {

    /* renamed from: E, reason: collision with root package name */
    public static final ExecutorC3295b f40982E = new ExecutorC3295b();

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private static final E default = m.f41003D.C0(C2364I.e("kotlinx.coroutines.io.parallelism", Ha.g.d(64, C2362G.a()), 0, 0, 12, null));

    private ExecutorC3295b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        p0(ta.h.f50000B, command);
    }

    @Override // Xb.E
    public void p0(ta.g context, Runnable block) {
        default.p0(context, block);
    }

    @Override // Xb.E
    public void r0(ta.g context, Runnable block) {
        default.r0(context, block);
    }

    @Override // Xb.E
    public String toString() {
        return "Dispatchers.IO";
    }
}
