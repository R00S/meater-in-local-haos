package k7;

import g7.C3445p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ThreadFactoryC3803a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f43818a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f43819b = Executors.defaultThreadFactory();

    public ThreadFactoryC3803a(String str) {
        C3445p.l(str, "Name must not be null");
        this.f43818a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f43819b.newThread(new RunnableC3804b(runnable, 0));
        threadNewThread.setName(this.f43818a);
        return threadNewThread;
    }
}
