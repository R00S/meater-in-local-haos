package p456rx.p461n.p466e;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* renamed from: rx.n.e.i */
/* loaded from: classes3.dex */
public final class ThreadFactoryC11360i extends AtomicLong implements ThreadFactory {

    /* renamed from: f */
    public static final ThreadFactory f42888f = new a();

    /* renamed from: g */
    final String f42889g;

    /* compiled from: RxThreadFactory.java */
    /* renamed from: rx.n.e.i$a */
    static class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public ThreadFactoryC11360i(String str) {
        this.f42889g = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f42889g + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
