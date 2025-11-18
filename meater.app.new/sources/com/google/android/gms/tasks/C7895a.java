package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.a */
/* loaded from: classes2.dex */
final class C7895a<T> implements InterfaceC7896b<T> {

    /* renamed from: a */
    private final CountDownLatch f29517a = new CountDownLatch(1);

    /* synthetic */ C7895a(zzac zzacVar) {
    }

    /* renamed from: a */
    public final void m23668a() throws InterruptedException {
        this.f29517a.await();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: b */
    public final void mo23636b() {
        this.f29517a.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: c */
    public final void mo23637c(Exception exc) {
        this.f29517a.countDown();
    }

    /* renamed from: d */
    public final boolean m23669d(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f29517a.await(j2, timeUnit);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        this.f29517a.countDown();
    }
}
