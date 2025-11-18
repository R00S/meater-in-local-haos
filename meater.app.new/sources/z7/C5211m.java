package z7;

import g7.C3445p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: z7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5211m {
    public static <TResult> TResult a(AbstractC5208j<TResult> abstractC5208j) throws InterruptedException {
        C3445p.i();
        C3445p.g();
        C3445p.l(abstractC5208j, "Task must not be null");
        if (abstractC5208j.n()) {
            return (TResult) k(abstractC5208j);
        }
        q qVar = new q(null);
        l(abstractC5208j, qVar);
        qVar.c();
        return (TResult) k(abstractC5208j);
    }

    public static <TResult> TResult b(AbstractC5208j<TResult> abstractC5208j, long j10, TimeUnit timeUnit) throws TimeoutException {
        C3445p.i();
        C3445p.g();
        C3445p.l(abstractC5208j, "Task must not be null");
        C3445p.l(timeUnit, "TimeUnit must not be null");
        if (abstractC5208j.n()) {
            return (TResult) k(abstractC5208j);
        }
        q qVar = new q(null);
        l(abstractC5208j, qVar);
        if (qVar.e(j10, timeUnit)) {
            return (TResult) k(abstractC5208j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> AbstractC5208j<TResult> c(Executor executor, Callable<TResult> callable) {
        C3445p.l(executor, "Executor must not be null");
        C3445p.l(callable, "Callback must not be null");
        N n10 = new N();
        executor.execute(new O(n10, callable));
        return n10;
    }

    public static <TResult> AbstractC5208j<TResult> d(Exception exc) {
        N n10 = new N();
        n10.r(exc);
        return n10;
    }

    public static <TResult> AbstractC5208j<TResult> e(TResult tresult) {
        N n10 = new N();
        n10.s(tresult);
        return n10;
    }

    public static AbstractC5208j<Void> f(Collection<? extends AbstractC5208j<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator<? extends AbstractC5208j<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        N n10 = new N();
        s sVar = new s(collection.size(), n10);
        Iterator<? extends AbstractC5208j<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            l(it2.next(), sVar);
        }
        return n10;
    }

    public static AbstractC5208j<Void> g(AbstractC5208j<?>... abstractC5208jArr) {
        return (abstractC5208jArr == null || abstractC5208jArr.length == 0) ? e(null) : f(Arrays.asList(abstractC5208jArr));
    }

    public static AbstractC5208j<List<AbstractC5208j<?>>> h(Collection<? extends AbstractC5208j<?>> collection) {
        return i(C5210l.f53820a, collection);
    }

    public static AbstractC5208j<List<AbstractC5208j<?>>> i(Executor executor, Collection<? extends AbstractC5208j<?>> collection) {
        return (collection == null || collection.isEmpty()) ? e(Collections.emptyList()) : f(collection).i(executor, new C5213o(collection));
    }

    public static AbstractC5208j<List<AbstractC5208j<?>>> j(AbstractC5208j<?>... abstractC5208jArr) {
        return (abstractC5208jArr == null || abstractC5208jArr.length == 0) ? e(Collections.emptyList()) : h(Arrays.asList(abstractC5208jArr));
    }

    private static Object k(AbstractC5208j abstractC5208j) throws ExecutionException {
        if (abstractC5208j.o()) {
            return abstractC5208j.k();
        }
        if (abstractC5208j.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC5208j.j());
    }

    private static void l(AbstractC5208j abstractC5208j, r rVar) {
        Executor executor = C5210l.f53821b;
        abstractC5208j.f(executor, rVar);
        abstractC5208j.d(executor, rVar);
        abstractC5208j.a(executor, rVar);
    }
}
