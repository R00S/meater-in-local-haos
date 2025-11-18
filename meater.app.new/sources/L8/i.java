package L8;

import java.util.concurrent.Executor;

/* compiled from: FirebaseExecutors.java */
/* loaded from: classes2.dex */
public class i {

    /* compiled from: FirebaseExecutors.java */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new j(executor);
    }
}
