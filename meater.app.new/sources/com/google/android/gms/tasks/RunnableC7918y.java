package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.y */
/* loaded from: classes2.dex */
final class RunnableC7918y implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C7917x f29571f;

    /* renamed from: g */
    final /* synthetic */ Callable f29572g;

    RunnableC7918y(C7917x c7917x, Callable callable) {
        this.f29571f = c7917x;
        this.f29572g = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29571f.m23693r(this.f29572g.call());
        } catch (Exception e2) {
            this.f29571f.m23692q(e2);
        } catch (Throwable th) {
            this.f29571f.m23692q(new RuntimeException(th));
        }
    }
}
