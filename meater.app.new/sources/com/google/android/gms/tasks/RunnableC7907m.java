package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.m */
/* loaded from: classes2.dex */
final class RunnableC7907m implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Task f29546f;

    /* renamed from: g */
    final /* synthetic */ C7908n f29547g;

    RunnableC7907m(C7908n c7908n, Task task) {
        this.f29547g = c7908n;
        this.f29546f = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f29547g.f29549b) {
            C7908n c7908n = this.f29547g;
            if (c7908n.f29550c != null) {
                c7908n.f29550c.mo23637c((Exception) Preconditions.m14372k(this.f29546f.mo23646i()));
            }
        }
    }
}
