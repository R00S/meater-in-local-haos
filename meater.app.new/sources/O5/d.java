package O5;

import java.io.IOException;
import java.lang.Thread;

/* compiled from: BaseThread.java */
/* loaded from: classes2.dex */
public class d extends Thread {

    /* renamed from: B, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f13267B = Thread.getDefaultUncaughtExceptionHandler();

    protected d() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: O5.c
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) throws IOException {
                this.f13266a.b(thread, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Thread thread, Throwable th) throws IOException {
        U4.a.a(thread, th, "THREAD");
        this.f13267B.uncaughtException(thread, th);
    }
}
