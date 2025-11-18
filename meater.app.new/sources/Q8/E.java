package Q8;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes2.dex */
class E implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f14378a;

    /* renamed from: b, reason: collision with root package name */
    private final Y8.j f14379b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f14380c;

    /* renamed from: d, reason: collision with root package name */
    private final N8.a f14381d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f14382e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    interface a {
        void a(Y8.j jVar, Thread thread, Throwable th);
    }

    public E(a aVar, Y8.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, N8.a aVar2) {
        this.f14378a = aVar;
        this.f14379b = jVar;
        this.f14380c = uncaughtExceptionHandler;
        this.f14381d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            N8.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            N8.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f14381d.b()) {
            return true;
        }
        N8.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f14382e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f14382e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f14378a.a(this.f14379b, thread, th);
                } else {
                    N8.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                N8.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f14380c != null) {
                }
            }
            if (this.f14380c != null) {
                N8.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f14380c.uncaughtException(thread, th);
            } else {
                N8.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f14382e.set(false);
        } catch (Throwable th2) {
            if (this.f14380c != null) {
                N8.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f14380c.uncaughtException(thread, th);
            } else {
                N8.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f14382e.set(false);
            throw th2;
        }
    }
}
