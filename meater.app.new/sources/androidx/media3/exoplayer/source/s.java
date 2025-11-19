package androidx.media3.exoplayer.source;

import X1.C1804a;
import X1.InterfaceC1811h;
import android.os.Handler;
import androidx.media3.exoplayer.source.r;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes.dex */
public interface s {

    /* compiled from: MediaSourceEventListener.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27817a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f27818b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0380a> f27819c;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: androidx.media3.exoplayer.source.s$a$a, reason: collision with other inner class name */
        private static final class C0380a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f27820a;

            /* renamed from: b, reason: collision with root package name */
            public s f27821b;

            public C0380a(Handler handler, s sVar) {
                this.f27820a = handler;
                this.f27821b = sVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(n2.j jVar, s sVar) {
            sVar.I(this.f27817a, this.f27818b, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(n2.i iVar, n2.j jVar, s sVar) {
            sVar.T(this.f27817a, this.f27818b, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(n2.i iVar, n2.j jVar, s sVar) {
            sVar.e0(this.f27817a, this.f27818b, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(n2.i iVar, n2.j jVar, IOException iOException, boolean z10, s sVar) {
            sVar.L(this.f27817a, this.f27818b, iVar, jVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(n2.i iVar, n2.j jVar, s sVar) {
            sVar.M(this.f27817a, this.f27818b, iVar, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(r.b bVar, n2.j jVar, s sVar) {
            sVar.D(this.f27817a, bVar, jVar);
        }

        public void A(final n2.i iVar, final n2.j jVar, final IOException iOException, final boolean z10) {
            i(new InterfaceC1811h() { // from class: n2.n
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f45642a.p(iVar, jVar, iOException, z10, (androidx.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void B(n2.i iVar, int i10) {
            C(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void C(n2.i iVar, int i10, int i11, U1.s sVar, int i12, Object obj, long j10, long j11) {
            D(iVar, new n2.j(i10, i11, sVar, i12, obj, X1.L.u1(j10), X1.L.u1(j11)));
        }

        public void D(final n2.i iVar, final n2.j jVar) {
            i(new InterfaceC1811h() { // from class: n2.l
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f45636a.q(iVar, jVar, (androidx.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void E(s sVar) {
            Iterator<C0380a> it = this.f27819c.iterator();
            while (it.hasNext()) {
                C0380a next = it.next();
                if (next.f27821b == sVar) {
                    this.f27819c.remove(next);
                }
            }
        }

        public void F(int i10, long j10, long j11) {
            G(new n2.j(1, i10, null, 3, null, X1.L.u1(j10), X1.L.u1(j11)));
        }

        public void G(final n2.j jVar) {
            final r.b bVar = (r.b) C1804a.e(this.f27818b);
            i(new InterfaceC1811h() { // from class: n2.p
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f45650a.r(bVar, jVar, (androidx.media3.exoplayer.source.s) obj);
                }
            });
        }

        public a H(int i10, r.b bVar) {
            return new a(this.f27819c, i10, bVar);
        }

        public void h(Handler handler, s sVar) {
            C1804a.e(handler);
            C1804a.e(sVar);
            this.f27819c.add(new C0380a(handler, sVar));
        }

        public void i(final InterfaceC1811h<s> interfaceC1811h) {
            Iterator<C0380a> it = this.f27819c.iterator();
            while (it.hasNext()) {
                C0380a next = it.next();
                final s sVar = next.f27821b;
                X1.L.Z0(next.f27820a, new Runnable() { // from class: n2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1811h.accept(sVar);
                    }
                });
            }
        }

        public void j(int i10, U1.s sVar, int i11, Object obj, long j10) {
            k(new n2.j(1, i10, sVar, i11, obj, X1.L.u1(j10), -9223372036854775807L));
        }

        public void k(final n2.j jVar) {
            i(new InterfaceC1811h() { // from class: n2.k
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f45634a.m(jVar, (androidx.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void s(n2.i iVar, int i10) {
            t(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(n2.i iVar, int i10, int i11, U1.s sVar, int i12, Object obj, long j10, long j11) {
            u(iVar, new n2.j(i10, i11, sVar, i12, obj, X1.L.u1(j10), X1.L.u1(j11)));
        }

        public void u(final n2.i iVar, final n2.j jVar) {
            i(new InterfaceC1811h() { // from class: n2.o
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f45647a.n(iVar, jVar, (androidx.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void v(n2.i iVar, int i10) {
            w(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void w(n2.i iVar, int i10, int i11, U1.s sVar, int i12, Object obj, long j10, long j11) {
            x(iVar, new n2.j(i10, i11, sVar, i12, obj, X1.L.u1(j10), X1.L.u1(j11)));
        }

        public void x(final n2.i iVar, final n2.j jVar) {
            i(new InterfaceC1811h() { // from class: n2.m
                @Override // X1.InterfaceC1811h
                public final void accept(Object obj) {
                    this.f45639a.o(iVar, jVar, (androidx.media3.exoplayer.source.s) obj);
                }
            });
        }

        public void y(n2.i iVar, int i10, int i11, U1.s sVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            A(iVar, new n2.j(i10, i11, sVar, i12, obj, X1.L.u1(j10), X1.L.u1(j11)), iOException, z10);
        }

        public void z(n2.i iVar, int i10, IOException iOException, boolean z10) {
            y(iVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        private a(CopyOnWriteArrayList<C0380a> copyOnWriteArrayList, int i10, r.b bVar) {
            this.f27819c = copyOnWriteArrayList;
            this.f27817a = i10;
            this.f27818b = bVar;
        }
    }

    default void D(int i10, r.b bVar, n2.j jVar) {
    }

    default void I(int i10, r.b bVar, n2.j jVar) {
    }

    default void M(int i10, r.b bVar, n2.i iVar, n2.j jVar) {
    }

    default void T(int i10, r.b bVar, n2.i iVar, n2.j jVar) {
    }

    default void e0(int i10, r.b bVar, n2.i iVar, n2.j jVar) {
    }

    default void L(int i10, r.b bVar, n2.i iVar, n2.j jVar, IOException iOException, boolean z10) {
    }
}
