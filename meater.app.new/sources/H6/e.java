package H6;

import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f5586a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f5587b = new b();

    /* compiled from: Executors.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.u(runnable);
        }
    }

    /* compiled from: Executors.java */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f5587b;
    }

    public static Executor b() {
        return f5586a;
    }
}
