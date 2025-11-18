package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: NoOpSentryExecutorService.java */
/* renamed from: io.sentry.a3 */
/* loaded from: classes2.dex */
final class C9246a3 implements InterfaceC9366b2 {

    /* renamed from: a */
    private static final C9246a3 f35745a = new C9246a3();

    private C9246a3() {
    }

    /* renamed from: c */
    public static InterfaceC9366b2 m30026c() {
        return f35745a;
    }

    /* renamed from: d */
    static /* synthetic */ Object m30027d() throws Exception {
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ Object m30028e() throws Exception {
        return null;
    }

    @Override // io.sentry.InterfaceC9366b2
    /* renamed from: a */
    public void mo30029a(long j2) {
    }

    @Override // io.sentry.InterfaceC9366b2
    /* renamed from: b */
    public Future<?> mo30030b(Runnable runnable, long j2) {
        return new FutureTask(new Callable() { // from class: io.sentry.n
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                C9246a3.m30027d();
                return null;
            }
        });
    }

    @Override // io.sentry.InterfaceC9366b2
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC9366b2
    public Future<?> submit(Runnable runnable) {
        return new FutureTask(new Callable() { // from class: io.sentry.o
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                C9246a3.m30028e();
                return null;
            }
        });
    }
}
