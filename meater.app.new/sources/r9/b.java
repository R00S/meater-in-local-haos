package r9;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PoolableExecutors.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4369a f48491a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile InterfaceC4369a f48492b;

    /* compiled from: PoolableExecutors.java */
    /* renamed from: r9.b$b, reason: collision with other inner class name */
    private static class C0680b implements InterfaceC4369a {
        private C0680b() {
        }

        @Override // r9.InterfaceC4369a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0680b c0680b = new C0680b();
        f48491a = c0680b;
        f48492b = c0680b;
    }

    public static InterfaceC4369a a() {
        return f48492b;
    }
}
