package X3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LottieThreadFactory.java */
/* loaded from: classes.dex */
public class e implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f18719d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private final ThreadGroup f18720a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f18721b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    private final String f18722c;

    public e() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f18720a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f18722c = "lottie-" + f18719d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f18720a, runnable, this.f18722c + this.f18721b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
