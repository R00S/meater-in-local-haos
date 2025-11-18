package O5;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.lang.Thread;

/* compiled from: BaseHandler.java */
/* loaded from: classes2.dex */
public class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f13265a;

    public b(Looper looper) {
        super(looper);
        this.f13265a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: O5.a
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) throws IOException {
                this.f13264a.b(thread, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Thread thread, Throwable th) throws IOException {
        U4.a.a(thread, th, "HANDLER");
        this.f13265a.uncaughtException(thread, th);
    }
}
