package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    /* renamed from: a */
    public static <TResult> TResult m23659a(Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.m14370i();
        Preconditions.m14373l(task, "Task must not be null");
        if (task.mo23650m()) {
            return (TResult) m23666h(task);
        }
        C7895a c7895a = new C7895a(null);
        m23667i(task, c7895a);
        c7895a.m23668a();
        return (TResult) m23666h(task);
    }

    /* renamed from: b */
    public static <TResult> TResult m23660b(Task<TResult> task, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.m14370i();
        Preconditions.m14373l(task, "Task must not be null");
        Preconditions.m14373l(timeUnit, "TimeUnit must not be null");
        if (task.mo23650m()) {
            return (TResult) m23666h(task);
        }
        C7895a c7895a = new C7895a(null);
        m23667i(task, c7895a);
        if (c7895a.m23669d(j2, timeUnit)) {
            return (TResult) m23666h(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> Task<TResult> m23661c(Executor executor, Callable<TResult> callable) {
        Preconditions.m14373l(executor, "Executor must not be null");
        Preconditions.m14373l(callable, "Callback must not be null");
        C7917x c7917x = new C7917x();
        executor.execute(new RunnableC7918y(c7917x, callable));
        return c7917x;
    }

    /* renamed from: d */
    public static <TResult> Task<TResult> m23662d(Exception exc) {
        C7917x c7917x = new C7917x();
        c7917x.m23692q(exc);
        return c7917x;
    }

    /* renamed from: e */
    public static <TResult> Task<TResult> m23663e(TResult tresult) {
        C7917x c7917x = new C7917x();
        c7917x.m23693r(tresult);
        return c7917x;
    }

    /* renamed from: f */
    public static Task<Void> m23664f(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m23663e(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C7917x c7917x = new C7917x();
        C7897c c7897c = new C7897c(collection.size(), c7917x);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            m23667i(it2.next(), c7897c);
        }
        return c7917x;
    }

    /* renamed from: g */
    public static Task<Void> m23665g(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? m23663e(null) : m23664f(Arrays.asList(taskArr));
    }

    /* renamed from: h */
    private static Object m23666h(Task task) throws ExecutionException {
        if (task.mo23651n()) {
            return task.mo23647j();
        }
        if (task.mo23649l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo23646i());
    }

    /* renamed from: i */
    private static void m23667i(Task task, InterfaceC7896b interfaceC7896b) {
        Executor executor = TaskExecutors.f29516b;
        task.mo23642e(executor, interfaceC7896b);
        task.mo23641d(executor, interfaceC7896b);
        task.mo23638a(executor, interfaceC7896b);
    }
}
