package Xb;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LXb/Y;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loa/F;", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "LXb/E;", "B", "LXb/E;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Y implements Executor {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final E dispatcher;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable block) {
        E e10 = this.dispatcher;
        ta.h hVar = ta.h.f50000B;
        if (e10.v0(hVar)) {
            this.dispatcher.p0(hVar, block);
        } else {
            block.run();
        }
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
