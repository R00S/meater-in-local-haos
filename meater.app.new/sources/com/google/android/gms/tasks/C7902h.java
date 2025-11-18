package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.h */
/* loaded from: classes2.dex */
final class C7902h<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, InterfaceC7913t {

    /* renamed from: a */
    private final Executor f29534a;

    /* renamed from: b */
    private final Continuation f29535b;

    /* renamed from: c */
    private final C7917x f29536c;

    public C7902h(Executor executor, Continuation continuation, C7917x c7917x) {
        this.f29534a = executor;
        this.f29535b = continuation;
        this.f29536c = c7917x;
    }

    @Override // com.google.android.gms.tasks.InterfaceC7913t
    /* renamed from: a */
    public final void mo23674a(Task task) {
        this.f29534a.execute(new RunnableC7901g(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: b */
    public final void mo23636b() {
        this.f29536c.m23694s();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: c */
    public final void mo23637c(Exception exc) {
        this.f29536c.m23692q(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f29536c.m23693r(tcontinuationresult);
    }
}
