package com.flurry.sdk;

import com.flurry.sdk.AbstractC6050g2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.c1 */
/* loaded from: classes2.dex */
public class C6012c1<T extends AbstractC6050g2> {

    /* renamed from: a */
    private final C6211z0<Object, T> f15709a = new C6211z0<>();

    /* renamed from: b */
    private final HashMap<T, Object> f15710b = new HashMap<>();

    /* renamed from: c */
    final HashMap<T, Future<?>> f15711c = new HashMap<>();

    /* renamed from: d */
    private final ThreadPoolExecutor f15712d;

    /* renamed from: com.flurry.sdk.c1$b */
    final class b extends ThreadPoolExecutor.DiscardPolicy {

        /* renamed from: com.flurry.sdk.c1$b$a */
        final class a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ AbstractC6050g2 f15719h;

            a(AbstractC6050g2 abstractC6050g2) {
                this.f15719h = abstractC6050g2;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() {
            }
        }

        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            AbstractC6050g2 abstractC6050g2M12980a = C6012c1.m12980a(runnable);
            if (abstractC6050g2M12980a == null) {
                return;
            }
            synchronized (C6012c1.this.f15711c) {
                C6012c1.this.f15711c.remove(abstractC6050g2M12980a);
            }
            C6012c1.this.m12983b(abstractC6050g2M12980a);
            new a(abstractC6050g2M12980a).run();
        }
    }

    public C6012c1(String str, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        a aVar = new a(timeUnit, blockingQueue);
        this.f15712d = aVar;
        aVar.setRejectedExecutionHandler(new b());
        aVar.setThreadFactory(new ThreadFactoryC6212z1(str));
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC6050g2 m12980a(Runnable runnable) {
        if (runnable instanceof C6003b1) {
            return (AbstractC6050g2) ((C6003b1) runnable).m12966a();
        }
        if (runnable instanceof AbstractC6050g2) {
            return (AbstractC6050g2) runnable;
        }
        C6021d1.m13030c(6, "TrackedThreadPoolExecutor", "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }

    /* renamed from: d */
    private synchronized void m12981d(Object obj, T t) {
        List<T> listM13381b;
        C6211z0<Object, T> c6211z0 = this.f15709a;
        if (obj != null && (listM13381b = c6211z0.m13381b(obj, false)) != null) {
            listM13381b.remove(t);
            if (listM13381b.size() == 0) {
                c6211z0.f16533a.remove(obj);
            }
        }
        this.f15710b.remove(t);
    }

    /* renamed from: e */
    private synchronized void m12982e(Object obj, T t) {
        this.f15709a.m13382c(obj, t);
        this.f15710b.put(t, obj);
    }

    /* renamed from: b */
    final synchronized void m12983b(T t) {
        m12981d(this.f15710b.get(t), t);
    }

    /* renamed from: c */
    public final synchronized void m12984c(Object obj, T t) {
        if (obj == null) {
            return;
        }
        m12982e(obj, t);
        this.f15712d.submit(t);
    }

    /* renamed from: com.flurry.sdk.c1$a */
    final class a extends ThreadPoolExecutor {

        /* renamed from: com.flurry.sdk.c1$a$a, reason: collision with other inner class name */
        final class C11465a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ AbstractC6050g2 f15714h;

            C11465a(AbstractC6050g2 abstractC6050g2) {
                this.f15714h = abstractC6050g2;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() {
            }
        }

        /* renamed from: com.flurry.sdk.c1$a$b */
        final class b extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ AbstractC6050g2 f15716h;

            b(AbstractC6050g2 abstractC6050g2) {
                this.f15716h = abstractC6050g2;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() {
            }
        }

        a(TimeUnit timeUnit, BlockingQueue blockingQueue) {
            super(0, 5, 5000L, timeUnit, blockingQueue);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.ThreadPoolExecutor
        protected final void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            AbstractC6050g2 abstractC6050g2M12980a = C6012c1.m12980a(runnable);
            if (abstractC6050g2M12980a == null) {
                return;
            }
            synchronized (C6012c1.this.f15711c) {
                C6012c1.this.f15711c.remove(abstractC6050g2M12980a);
            }
            C6012c1.this.m12983b(abstractC6050g2M12980a);
            new b(abstractC6050g2M12980a).run();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected final void beforeExecute(Thread thread, Runnable runnable) {
            super.beforeExecute(thread, runnable);
            AbstractC6050g2 abstractC6050g2M12980a = C6012c1.m12980a(runnable);
            if (abstractC6050g2M12980a == null) {
                return;
            }
            new C11465a(abstractC6050g2M12980a).run();
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
            C6003b1 c6003b1 = new C6003b1(runnable, v);
            synchronized (C6012c1.this.f15711c) {
                C6012c1.this.f15711c.put((AbstractC6050g2) runnable, c6003b1);
            }
            return c6003b1;
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
            throw new UnsupportedOperationException("Callable not supported");
        }
    }
}
