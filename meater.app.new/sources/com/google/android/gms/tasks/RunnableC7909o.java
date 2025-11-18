package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.o */
/* loaded from: classes2.dex */
final class RunnableC7909o implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29551f;

    /* renamed from: g */
    final /* synthetic */ C7910p f29552g;

    RunnableC7909o(C7910p c7910p, Task task) {
        this.f29552g = c7910p;
        this.f29551f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f29552g.f29554b) {
            C7910p c7910p = this.f29552g;
            if (c7910p.f29555c != null) {
                c7910p.f29555c.onSuccess(this.f29551f.mo23647j());
            }
        }
    }
}
