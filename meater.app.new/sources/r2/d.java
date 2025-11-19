package r2;

import X1.C1804a;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r2.d;

/* compiled from: BandwidthMeter.java */
/* loaded from: classes.dex */
public interface d {

    /* compiled from: BandwidthMeter.java */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: r2.d$a$a, reason: collision with other inner class name */
        public static final class C0674a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0675a> f48350a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* compiled from: BandwidthMeter.java */
            /* renamed from: r2.d$a$a$a, reason: collision with other inner class name */
            static final class C0675a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f48351a;

                /* renamed from: b, reason: collision with root package name */
                private final a f48352b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f48353c;

                public C0675a(Handler handler, a aVar) {
                    this.f48351a = handler;
                    this.f48352b = aVar;
                }

                public void d() {
                    this.f48353c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0675a c0675a, int i10, long j10, long j11) {
                c0675a.f48352b.P(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                C1804a.e(handler);
                C1804a.e(aVar);
                e(aVar);
                this.f48350a.add(new C0675a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0675a> it = this.f48350a.iterator();
                while (it.hasNext()) {
                    final C0675a next = it.next();
                    if (!next.f48353c) {
                        next.f48351a.post(new Runnable() { // from class: r2.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0674a.d(next, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0675a> it = this.f48350a.iterator();
                while (it.hasNext()) {
                    C0675a next = it.next();
                    if (next.f48352b == aVar) {
                        next.d();
                        this.f48350a.remove(next);
                    }
                }
            }
        }

        void P(int i10, long j10, long j11);
    }

    void a(a aVar);

    default long b() {
        return -9223372036854775807L;
    }

    a2.n e();

    long f();

    void g(Handler handler, a aVar);
}
