package androidx.media3.exoplayer.drm;

import X1.C1804a;
import X1.L;
import android.os.Handler;
import androidx.media3.exoplayer.source.r;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes.dex */
public interface h {

    /* compiled from: DrmSessionEventListener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27124a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f27125b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0378a> f27126c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: androidx.media3.exoplayer.drm.h$a$a, reason: collision with other inner class name */
        private static final class C0378a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f27127a;

            /* renamed from: b, reason: collision with root package name */
            public h f27128b;

            public C0378a(Handler handler, h hVar) {
                this.f27127a = handler;
                this.f27128b = hVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(h hVar) {
            hVar.c0(this.f27124a, this.f27125b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(h hVar) {
            hVar.m0(this.f27124a, this.f27125b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(h hVar) {
            hVar.Q(this.f27124a, this.f27125b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(h hVar, int i10) {
            hVar.i0(this.f27124a, this.f27125b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(h hVar, Exception exc) {
            hVar.n0(this.f27124a, this.f27125b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(h hVar) {
            hVar.h0(this.f27124a, this.f27125b);
        }

        public void g(Handler handler, h hVar) {
            C1804a.e(handler);
            C1804a.e(hVar);
            this.f27126c.add(new C0378a(handler, hVar));
        }

        public void h() {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                final h hVar = next.f27128b;
                L.Z0(next.f27127a, new Runnable() { // from class: i2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43052B.n(hVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                final h hVar = next.f27128b;
                L.Z0(next.f27127a, new Runnable() { // from class: i2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43048B.o(hVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                final h hVar = next.f27128b;
                L.Z0(next.f27127a, new Runnable() { // from class: i2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43050B.p(hVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                final h hVar = next.f27128b;
                L.Z0(next.f27127a, new Runnable() { // from class: i2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43043B.q(hVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                final h hVar = next.f27128b;
                L.Z0(next.f27127a, new Runnable() { // from class: i2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43040B.r(hVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                final h hVar = next.f27128b;
                L.Z0(next.f27127a, new Runnable() { // from class: i2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f43046B.s(hVar);
                    }
                });
            }
        }

        public void t(h hVar) {
            Iterator<C0378a> it = this.f27126c.iterator();
            while (it.hasNext()) {
                C0378a next = it.next();
                if (next.f27128b == hVar) {
                    this.f27126c.remove(next);
                }
            }
        }

        public a u(int i10, r.b bVar) {
            return new a(this.f27126c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0378a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f27126c = copyOnWriteArrayList;
            this.f27124a = i10;
            this.f27125b = bVar;
        }
    }

    default void Q(int i10, r.b bVar) {
    }

    default void c0(int i10, r.b bVar) {
    }

    default void h0(int i10, r.b bVar) {
    }

    default void m0(int i10, r.b bVar) {
    }

    default void i0(int i10, r.b bVar, int i11) {
    }

    default void n0(int i10, r.b bVar, Exception exc) {
    }
}
