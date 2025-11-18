package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.n */
/* loaded from: classes2.dex */
final class C7908n implements InterfaceC7913t {

    /* renamed from: a */
    private final Executor f29548a;

    /* renamed from: b */
    private final Object f29549b = new Object();

    /* renamed from: c */
    private OnFailureListener f29550c;

    public C7908n(Executor executor, OnFailureListener onFailureListener) {
        this.f29548a = executor;
        this.f29550c = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7913t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        if (task.mo23651n() || task.mo23649l()) {
            return;
        }
        synchronized (this.f29549b) {
            if (this.f29550c == null) {
                return;
            }
            this.f29548a.execute(new RunnableC7907m(this, task));
        }
    }
}
