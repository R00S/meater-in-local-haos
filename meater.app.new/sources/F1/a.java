package F1;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import s.X;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f4420g = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f4424d;

    /* renamed from: a, reason: collision with root package name */
    private final X<b, Long> f4421a = new X<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f4422b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0080a f4423c = new C0080a();

    /* renamed from: e, reason: collision with root package name */
    long f4425e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4426f = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: F1.a$a, reason: collision with other inner class name */
    class C0080a {
        C0080a() {
        }

        void a() {
            a.this.f4425e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f4425e);
            if (a.this.f4422b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    /* compiled from: AnimationHandler.java */
    interface b {
        boolean a(long j10);
    }

    /* compiled from: AnimationHandler.java */
    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0080a f4428a;

        c(C0080a c0080a) {
            this.f4428a = c0080a;
        }

        abstract void a();
    }

    /* compiled from: AnimationHandler.java */
    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f4429b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f4430c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: F1.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0081a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0081a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f4428a.a();
            }
        }

        d(C0080a c0080a) {
            super(c0080a);
            this.f4429b = Choreographer.getInstance();
            this.f4430c = new ChoreographerFrameCallbackC0081a();
        }

        @Override // F1.a.c
        void a() {
            this.f4429b.postFrameCallback(this.f4430c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f4426f) {
            for (int size = this.f4422b.size() - 1; size >= 0; size--) {
                if (this.f4422b.get(size) == null) {
                    this.f4422b.remove(size);
                }
            }
            this.f4426f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f4420g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j10) {
        Long l10 = this.f4421a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f4421a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f4422b.size() == 0) {
            e().a();
        }
        if (!this.f4422b.contains(bVar)) {
            this.f4422b.add(bVar);
        }
        if (j10 > 0) {
            this.f4421a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f4422b.size(); i10++) {
            b bVar = this.f4422b.get(i10);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    c e() {
        if (this.f4424d == null) {
            this.f4424d = new d(this.f4423c);
        }
        return this.f4424d;
    }

    public void g(b bVar) {
        this.f4421a.remove(bVar);
        int iIndexOf = this.f4422b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f4422b.set(iIndexOf, null);
            this.f4426f = true;
        }
    }
}
