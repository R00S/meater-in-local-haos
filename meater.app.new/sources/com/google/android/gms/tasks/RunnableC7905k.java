package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.k */
/* loaded from: classes2.dex */
final class RunnableC7905k implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29541f;

    /* renamed from: g */
    final /* synthetic */ C7906l f29542g;

    RunnableC7905k(C7906l c7906l, Task task) {
        this.f29542g = c7906l;
        this.f29541f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f29542g.f29544b) {
            C7906l c7906l = this.f29542g;
            if (c7906l.f29545c != null) {
                c7906l.f29545c.mo7019a(this.f29541f);
            }
        }
    }
}
