package com.google.firebase.concurrent;

import com.google.firebase.concurrent.ScheduledFutureC8161x;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DelegatingScheduledExecutorService.java */
/* renamed from: com.google.firebase.concurrent.w */
/* loaded from: classes2.dex */
class ScheduledExecutorServiceC8160w implements ScheduledExecutorService {

    /* renamed from: f */
    private final ExecutorService f30812f;

    /* renamed from: g */
    private final ScheduledExecutorService f30813g;

    ScheduledExecutorServiceC8160w(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f30812f = executorService;
        this.f30813g = scheduledExecutorService;
    }

    /* renamed from: a */
    static /* synthetic */ void m25102a(Runnable runnable, ScheduledFutureC8161x.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e2) {
            bVar.mo25125a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25114c(final Runnable runnable, final ScheduledFutureC8161x.b bVar) {
        this.f30812f.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC8160w.m25102a(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ScheduledFuture m25115e(final Runnable runnable, long j2, TimeUnit timeUnit, final ScheduledFutureC8161x.b bVar) {
        return this.f30813g.schedule(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f30767f.m25114c(runnable, bVar);
            }
        }, j2, timeUnit);
    }

    /* renamed from: f */
    static /* synthetic */ void m25105f(Callable callable, ScheduledFutureC8161x.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e2) {
            bVar.mo25125a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Future m25116h(final Callable callable, final ScheduledFutureC8161x.b bVar) throws Exception {
        return this.f30812f.submit(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC8160w.m25105f(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ScheduledFuture m25117j(final Callable callable, long j2, TimeUnit timeUnit, final ScheduledFutureC8161x.b bVar) {
        return this.f30813g.schedule(new Callable() { // from class: com.google.firebase.concurrent.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f30770f.m25116h(callable, bVar);
            }
        }, j2, timeUnit);
    }

    /* renamed from: k */
    static /* synthetic */ void m25108k(Runnable runnable, ScheduledFutureC8161x.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e2) {
            bVar.mo25125a(e2);
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25118m(final Runnable runnable, final ScheduledFutureC8161x.b bVar) {
        this.f30812f.execute(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                ScheduledExecutorServiceC8160w.m25108k(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ScheduledFuture m25119o(final Runnable runnable, long j2, long j3, TimeUnit timeUnit, final ScheduledFutureC8161x.b bVar) {
        return this.f30813g.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f30778f.m25118m(runnable, bVar);
            }
        }, j2, j3, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25120q(final Runnable runnable, final ScheduledFutureC8161x.b bVar) {
        this.f30812f.execute(new Runnable() { // from class: com.google.firebase.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC8160w.m25113t(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ScheduledFuture m25121s(final Runnable runnable, long j2, long j3, TimeUnit timeUnit, final ScheduledFutureC8161x.b bVar) {
        return this.f30813g.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f30794f.m25120q(runnable, bVar);
            }
        }, j2, j3, timeUnit);
    }

    /* renamed from: t */
    static /* synthetic */ void m25113t(Runnable runnable, ScheduledFutureC8161x.b bVar) {
        try {
            runnable.run();
        } catch (Exception e2) {
            bVar.mo25125a(e2);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f30812f.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f30812f.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f30812f.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f30812f.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f30812f.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f30812f.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC8161x(new ScheduledFutureC8161x.c() { // from class: com.google.firebase.concurrent.b
            @Override // com.google.firebase.concurrent.ScheduledFutureC8161x.c
            /* renamed from: a */
            public final ScheduledFuture mo25099a(ScheduledFutureC8161x.b bVar) {
                return this.f30761a.m25115e(runnable, j2, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j2, final long j3, final TimeUnit timeUnit) {
        return new ScheduledFutureC8161x(new ScheduledFutureC8161x.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.ScheduledFutureC8161x.c
            /* renamed from: a */
            public final ScheduledFuture mo25099a(ScheduledFutureC8161x.b bVar) {
                return this.f30773a.m25119o(runnable, j2, j3, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j2, final long j3, final TimeUnit timeUnit) {
        return new ScheduledFutureC8161x(new ScheduledFutureC8161x.c() { // from class: com.google.firebase.concurrent.j
            @Override // com.google.firebase.concurrent.ScheduledFutureC8161x.c
            /* renamed from: a */
            public final ScheduledFuture mo25099a(ScheduledFutureC8161x.b bVar) {
                return this.f30787a.m25121s(runnable, j2, j3, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f30812f.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f30812f.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f30812f.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j2, final TimeUnit timeUnit) {
        return new ScheduledFutureC8161x(new ScheduledFutureC8161x.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.ScheduledFutureC8161x.c
            /* renamed from: a */
            public final ScheduledFuture mo25099a(ScheduledFutureC8161x.b bVar) {
                return this.f30781a.m25117j(callable, j2, timeUnit, bVar);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f30812f.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f30812f.submit(runnable);
    }
}
