package com.google.firebase.crashlytics.internal.p183n;

import android.annotation.SuppressLint;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Utils.java */
/* renamed from: com.google.firebase.crashlytics.h.n.q0 */
/* loaded from: classes2.dex */
public final class C8225q0 {

    /* renamed from: a */
    private static final ExecutorService f30959a = C8205g0.m25246c("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: a */
    public static <T> T m25312a(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo23644g(f30959a, new Continuation() { // from class: com.google.firebase.crashlytics.h.n.i
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public final Object mo13777a(Task task2) throws Exception {
                C8225q0.m25315d(countDownLatch, task2);
                return null;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.mo23651n()) {
            return task.mo23647j();
        }
        if (task.mo23649l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.mo23650m()) {
            throw new IllegalStateException(task.mo23646i());
        }
        throw new TimeoutException();
    }

    /* renamed from: b */
    public static boolean m25313b(CountDownLatch countDownLatch, long j2, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j2);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public static <T> Task<T> m25314c(final Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.h.n.k
            @Override // java.lang.Runnable
            public final void run() {
                C8225q0.m25317f(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.m23654a();
    }

    /* renamed from: d */
    static /* synthetic */ Object m25315d(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ Object m25316e(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.mo23651n()) {
            taskCompletionSource.m23656c(task.mo23647j());
            return null;
        }
        if (task.mo23646i() == null) {
            return null;
        }
        taskCompletionSource.m23655b(task.mo23646i());
        return null;
    }

    /* renamed from: f */
    static /* synthetic */ void m25317f(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).mo23644g(executor, new Continuation() { // from class: com.google.firebase.crashlytics.h.n.j
                @Override // com.google.android.gms.tasks.Continuation
                /* renamed from: a */
                public final Object mo13777a(Task task) throws Exception {
                    C8225q0.m25316e(taskCompletionSource, task);
                    return null;
                }
            });
        } catch (Exception e2) {
            taskCompletionSource.m23655b(e2);
        }
    }

    /* renamed from: g */
    static /* synthetic */ Void m25318g(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.mo23651n()) {
            taskCompletionSource.m23658e(task.mo23647j());
            return null;
        }
        if (task.mo23646i() == null) {
            return null;
        }
        taskCompletionSource.m23657d(task.mo23646i());
        return null;
    }

    /* renamed from: h */
    static /* synthetic */ Void m25319h(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.mo23651n()) {
            taskCompletionSource.m23658e(task.mo23647j());
            return null;
        }
        if (task.mo23646i() == null) {
            return null;
        }
        taskCompletionSource.m23657d(task.mo23646i());
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: i */
    public static <T> Task<T> m25320i(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.h.n.h
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public final Object mo13777a(Task task3) throws Exception {
                C8225q0.m25318g(taskCompletionSource, task3);
                return null;
            }
        };
        task.mo23643f(continuation);
        task2.mo23643f(continuation);
        return taskCompletionSource.m23654a();
    }

    /* renamed from: j */
    public static <T> Task<T> m25321j(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation() { // from class: com.google.firebase.crashlytics.h.n.g
            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public final Object mo13777a(Task task3) throws Exception {
                C8225q0.m25319h(taskCompletionSource, task3);
                return null;
            }
        };
        task.mo23644g(executor, continuation);
        task2.mo23644g(executor, continuation);
        return taskCompletionSource.m23654a();
    }
}
