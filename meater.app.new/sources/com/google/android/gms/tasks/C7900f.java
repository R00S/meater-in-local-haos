package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.f */
/* loaded from: classes2.dex */
final class C7900f implements InterfaceC7913t {

    /* renamed from: a */
    private final Executor f29529a;

    /* renamed from: b */
    private final Continuation f29530b;

    /* renamed from: c */
    private final C7917x f29531c;

    public C7900f(Executor executor, Continuation continuation, C7917x c7917x) {
        this.f29529a = executor;
        this.f29530b = continuation;
        this.f29531c = c7917x;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7913t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        this.f29529a.execute(new RunnableC7899e(this, task));
    }
}
