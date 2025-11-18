package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.j */
/* loaded from: classes2.dex */
final class C7904j implements InterfaceC7913t {

    /* renamed from: a */
    private final Executor f29538a;

    /* renamed from: b */
    private final Object f29539b = new Object();

    /* renamed from: c */
    private OnCanceledListener f29540c;

    public C7904j(Executor executor, OnCanceledListener onCanceledListener) {
        this.f29538a = executor;
        this.f29540c = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7913t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        if (task.mo23649l()) {
            synchronized (this.f29539b) {
                if (this.f29540c == null) {
                    return;
                }
                this.f29538a.execute(new RunnableC7903i(this));
            }
        }
    }
}
