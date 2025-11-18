package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.i */
/* loaded from: classes2.dex */
final class RunnableC7903i implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C7904j f29537f;

    RunnableC7903i(C7904j c7904j) {
        this.f29537f = c7904j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f29537f.f29539b) {
            C7904j c7904j = this.f29537f;
            if (c7904j.f29540c != null) {
                c7904j.f29540c.mo23636b();
            }
        }
    }
}
