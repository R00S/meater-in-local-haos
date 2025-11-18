package p024c.p073p.p075b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* renamed from: c.p.b.c */
/* loaded from: classes.dex */
abstract class AbstractC0996c<Params, Progress, Result> {

    /* renamed from: f */
    private static final ThreadFactory f6561f;

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f6562g;

    /* renamed from: h */
    public static final Executor f6563h;

    /* renamed from: i */
    private static f f6564i;

    /* renamed from: j */
    private static volatile Executor f6565j;

    /* renamed from: k */
    private final h<Params, Result> f6566k;

    /* renamed from: l */
    private final FutureTask<Result> f6567l;

    /* renamed from: m */
    private volatile g f6568m = g.PENDING;

    /* renamed from: n */
    final AtomicBoolean f6569n = new AtomicBoolean();

    /* renamed from: o */
    final AtomicBoolean f6570o = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$a */
    static class a implements ThreadFactory {

        /* renamed from: f */
        private final AtomicInteger f6571f = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f6571f.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$b */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC0996c.this.f6570o.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC0996c.this.mo6307b(this.f6581f);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$c */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC0996c.this.m6340m(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                AbstractC0996c.this.m6340m(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$d */
    static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f6574a;

        static {
            int[] iArr = new int[g.values().length];
            f6574a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6574a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$e */
    private static class e<Data> {

        /* renamed from: a */
        final AbstractC0996c f6575a;

        /* renamed from: b */
        final Data[] f6576b;

        e(AbstractC0996c abstractC0996c, Data... dataArr) {
            this.f6575a = abstractC0996c;
            this.f6576b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$f */
    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                eVar.f6575a.m6334d(eVar.f6576b[0]);
            } else {
                if (i2 != 2) {
                    return;
                }
                eVar.f6575a.m6338k(eVar.f6576b);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$g */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* renamed from: c.p.b.c$h */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: f */
        Params[] f6581f;

        h() {
        }
    }

    static {
        a aVar = new a();
        f6561f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f6562g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f6563h = threadPoolExecutor;
        f6565j = threadPoolExecutor;
    }

    AbstractC0996c() {
        b bVar = new b();
        this.f6566k = bVar;
        this.f6567l = new c(bVar);
    }

    /* renamed from: e */
    private static Handler m6331e() {
        f fVar;
        synchronized (AbstractC0996c.class) {
            if (f6564i == null) {
                f6564i = new f();
            }
            fVar = f6564i;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean m6332a(boolean z) {
        this.f6569n.set(true);
        return this.f6567l.cancel(z);
    }

    /* renamed from: b */
    protected abstract Result mo6307b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC0996c<Params, Progress, Result> m6333c(Executor executor, Params... paramsArr) {
        if (this.f6568m == g.PENDING) {
            this.f6568m = g.RUNNING;
            m6337j();
            this.f6566k.f6581f = paramsArr;
            executor.execute(this.f6567l);
            return this;
        }
        int i2 = d.f6574a[this.f6568m.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* renamed from: d */
    void m6334d(Result result) {
        if (m6335f()) {
            mo6308h(result);
        } else {
            mo6309i(result);
        }
        this.f6568m = g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m6335f() {
        return this.f6569n.get();
    }

    /* renamed from: g */
    protected void m6336g() {
    }

    /* renamed from: h */
    protected void mo6308h(Result result) {
        m6336g();
    }

    /* renamed from: i */
    protected void mo6309i(Result result) {
    }

    /* renamed from: j */
    protected void m6337j() {
    }

    /* renamed from: k */
    protected void m6338k(Progress... progressArr) {
    }

    /* renamed from: l */
    Result m6339l(Result result) {
        m6331e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    void m6340m(Result result) {
        if (this.f6570o.get()) {
            return;
        }
        m6339l(result);
    }
}
