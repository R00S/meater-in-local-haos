package android.view;

import Xb.G0;
import Xb.Z;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: DispatchQueue.jvm.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/h;", "", "<init>", "()V", "Ljava/lang/Runnable;", "runnable", "Loa/F;", "f", "(Ljava/lang/Runnable;)V", "h", "i", "g", "e", "", "b", "()Z", "Lta/g;", "context", "c", "(Lta/g;Ljava/lang/Runnable;)V", "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", "d", "Ljava/util/Queue;", "queue", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2101h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean finished;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isDraining;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean paused = true;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2101h this$0, Runnable runnable) {
        C3862t.g(this$0, "this$0");
        C3862t.g(runnable, "$runnable");
        this$0.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    public final boolean b() {
        return this.finished || !this.paused;
    }

    public final void c(g context, final Runnable runnable) {
        C3862t.g(context, "context");
        C3862t.g(runnable, "runnable");
        G0 G02 = Z.c().G0();
        if (G02.v0(context) || b()) {
            G02.p0(context, new Runnable() { // from class: androidx.lifecycle.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2101h.d(this.f25955B, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && b()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final void g() {
        this.finished = true;
        e();
    }

    public final void h() {
        this.paused = true;
    }

    public final void i() {
        if (this.paused) {
            if (this.finished) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            e();
        }
    }
}
