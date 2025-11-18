package o;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f46051c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f46052d = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.i(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f46053e = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.j(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private e f46054a;

    /* renamed from: b, reason: collision with root package name */
    private final e f46055b;

    private c() {
        d dVar = new d();
        this.f46055b = dVar;
        this.f46054a = dVar;
    }

    public static Executor g() {
        return f46053e;
    }

    public static c h() {
        if (f46051c != null) {
            return f46051c;
        }
        synchronized (c.class) {
            try {
                if (f46051c == null) {
                    f46051c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f46051c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        h().d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        h().a(runnable);
    }

    @Override // o.e
    public void a(Runnable runnable) {
        this.f46054a.a(runnable);
    }

    @Override // o.e
    public boolean c() {
        return this.f46054a.c();
    }

    @Override // o.e
    public void d(Runnable runnable) {
        this.f46054a.d(runnable);
    }
}
