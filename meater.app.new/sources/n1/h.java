package n1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: ExecutorCompat.java */
    private static class a implements Executor {

        /* renamed from: B, reason: collision with root package name */
        private final Handler f45598B;

        a(Handler handler) {
            this.f45598B = (Handler) r1.i.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f45598B.post((Runnable) r1.i.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f45598B + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
