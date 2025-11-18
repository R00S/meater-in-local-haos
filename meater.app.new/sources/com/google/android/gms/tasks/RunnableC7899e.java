package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.e */
/* loaded from: classes2.dex */
final class RunnableC7899e implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29527f;

    /* renamed from: g */
    final /* synthetic */ C7900f f29528g;

    RunnableC7899e(C7900f c7900f, Task task) {
        this.f29528g = c7900f;
        this.f29527f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f29527f.mo23649l()) {
            this.f29528g.f29531c.m23694s();
            return;
        }
        try {
            this.f29528g.f29531c.m23693r(this.f29528g.f29530b.mo13777a(this.f29527f));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f29528g.f29531c.m23692q((Exception) e2.getCause());
            } else {
                this.f29528g.f29531c.m23692q(e2);
            }
        } catch (Exception e3) {
            this.f29528g.f29531c.m23692q(e3);
        }
    }
}
