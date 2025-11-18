package p345i.p346a.p347g.p352u;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: NamedThreadFactory.java */
/* renamed from: i.a.g.u.a */
/* loaded from: classes2.dex */
public class ThreadFactoryC9224a implements ThreadFactory {

    /* renamed from: f */
    private final ThreadFactory f35615f = Executors.defaultThreadFactory();

    /* renamed from: g */
    private final String f35616g;

    public ThreadFactoryC9224a(String str) {
        this.f35616g = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f35615f.newThread(runnable);
        threadNewThread.setName(this.f35616g + ' ' + threadNewThread.getName());
        return threadNewThread;
    }
}
