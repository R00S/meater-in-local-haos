package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.p */
/* loaded from: classes2.dex */
abstract class AbstractRunnableC6386p implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zaak f17436f;

    private AbstractRunnableC6386p(zaak zaakVar) {
        this.f17436f = zaakVar;
    }

    /* renamed from: a */
    protected abstract void mo14062a();

    @Override // java.lang.Runnable
    public void run() {
        this.f17436f.f17486b.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            mo14062a();
        } catch (RuntimeException e2) {
            this.f17436f.f17485a.m14179k(e2);
        } finally {
            this.f17436f.f17486b.unlock();
        }
    }

    /* synthetic */ AbstractRunnableC6386p(zaak zaakVar, RunnableC6368g runnableC6368g) {
        this(zaakVar);
    }
}
