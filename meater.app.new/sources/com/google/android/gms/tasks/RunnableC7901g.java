package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.g */
/* loaded from: classes2.dex */
final class RunnableC7901g implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29532f;

    /* renamed from: g */
    final /* synthetic */ C7902h f29533g;

    RunnableC7901g(C7902h c7902h, Task task) {
        this.f29533g = c7902h;
        this.f29532f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f29533g.f29535b.mo13777a(this.f29532f);
            if (task == null) {
                this.f29533g.mo23637c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = TaskExecutors.f29516b;
            task.mo23642e(executor, this.f29533g);
            task.mo23641d(executor, this.f29533g);
            task.mo23638a(executor, this.f29533g);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f29533g.f29536c.m23692q((Exception) e2.getCause());
            } else {
                this.f29533g.f29536c.m23692q(e2);
            }
        } catch (Exception e3) {
            this.f29533g.f29536c.m23692q(e3);
        }
    }
}
