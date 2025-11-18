package e2;

import U1.B;
import X1.C1804a;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.r;
import d2.C3030b;
import d2.C3031c;
import java.io.IOException;
import java.util.List;
import l8.C3918k;

/* compiled from: AnalyticsListener.java */
/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3131b {

    /* compiled from: AnalyticsListener.java */
    /* renamed from: e2.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f40133a;

        /* renamed from: b, reason: collision with root package name */
        public final U1.G f40134b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40135c;

        /* renamed from: d, reason: collision with root package name */
        public final r.b f40136d;

        /* renamed from: e, reason: collision with root package name */
        public final long f40137e;

        /* renamed from: f, reason: collision with root package name */
        public final U1.G f40138f;

        /* renamed from: g, reason: collision with root package name */
        public final int f40139g;

        /* renamed from: h, reason: collision with root package name */
        public final r.b f40140h;

        /* renamed from: i, reason: collision with root package name */
        public final long f40141i;

        /* renamed from: j, reason: collision with root package name */
        public final long f40142j;

        public a(long j10, U1.G g10, int i10, r.b bVar, long j11, U1.G g11, int i11, r.b bVar2, long j12, long j13) {
            this.f40133a = j10;
            this.f40134b = g10;
            this.f40135c = i10;
            this.f40136d = bVar;
            this.f40137e = j11;
            this.f40138f = g11;
            this.f40139g = i11;
            this.f40140h = bVar2;
            this.f40141i = j12;
            this.f40142j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40133a == aVar.f40133a && this.f40135c == aVar.f40135c && this.f40137e == aVar.f40137e && this.f40139g == aVar.f40139g && this.f40141i == aVar.f40141i && this.f40142j == aVar.f40142j && C3918k.a(this.f40134b, aVar.f40134b) && C3918k.a(this.f40136d, aVar.f40136d) && C3918k.a(this.f40138f, aVar.f40138f) && C3918k.a(this.f40140h, aVar.f40140h);
        }

        public int hashCode() {
            return C3918k.b(Long.valueOf(this.f40133a), this.f40134b, Integer.valueOf(this.f40135c), this.f40136d, Long.valueOf(this.f40137e), this.f40138f, Integer.valueOf(this.f40139g), this.f40140h, Long.valueOf(this.f40141i), Long.valueOf(this.f40142j));
        }
    }

    /* compiled from: AnalyticsListener.java */
    /* renamed from: e2.b$b, reason: collision with other inner class name */
    public static final class C0509b {

        /* renamed from: a, reason: collision with root package name */
        private final U1.q f40143a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f40144b;

        public C0509b(U1.q qVar, SparseArray<a> sparseArray) {
            this.f40143a = qVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(qVar.d());
            for (int i10 = 0; i10 < qVar.d(); i10++) {
                int iC = qVar.c(i10);
                sparseArray2.append(iC, (a) C1804a.e(sparseArray.get(iC)));
            }
            this.f40144b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f40143a.a(i10);
        }

        public int b(int i10) {
            return this.f40143a.c(i10);
        }

        public a c(int i10) {
            return (a) C1804a.e(this.f40144b.get(i10));
        }

        public int d() {
            return this.f40143a.d();
        }
    }

    @Deprecated
    default void D(a aVar) {
    }

    default void F(a aVar) {
    }

    @Deprecated
    default void M(a aVar) {
    }

    default void P(a aVar) {
    }

    default void T(a aVar) {
    }

    default void b0(a aVar) {
    }

    default void e0(a aVar) {
    }

    default void A(a aVar, String str) {
    }

    default void G(a aVar, boolean z10) {
    }

    default void H(a aVar, AudioSink.a aVar2) {
    }

    default void J(a aVar, U1.J j10) {
    }

    default void K(a aVar, C3030b c3030b) {
    }

    default void L(a aVar, String str) {
    }

    default void N(a aVar, Exception exc) {
    }

    default void O(a aVar, int i10) {
    }

    @Deprecated
    default void Q(a aVar, List<W1.a> list) {
    }

    default void R(a aVar, boolean z10) {
    }

    default void S(a aVar, Exception exc) {
    }

    default void U(a aVar, boolean z10) {
    }

    default void W(a aVar, B.b bVar) {
    }

    default void X(a aVar, C3030b c3030b) {
    }

    default void Y(a aVar, U1.K k10) {
    }

    default void Z(a aVar, U1.y yVar) {
    }

    default void b(a aVar, int i10) {
    }

    default void c0(a aVar, U1.A a10) {
    }

    default void d0(a aVar, W1.b bVar) {
    }

    default void f0(a aVar, AudioSink.a aVar2) {
    }

    default void g0(U1.B b10, C0509b c0509b) {
    }

    default void h(a aVar, Exception exc) {
    }

    default void h0(a aVar, U1.N n10) {
    }

    @Deprecated
    default void j0(a aVar, int i10) {
    }

    default void l0(a aVar, int i10) {
    }

    default void m0(a aVar, n2.j jVar) {
    }

    default void n0(a aVar, boolean z10) {
    }

    @Deprecated
    default void o(a aVar, boolean z10) {
    }

    default void o0(a aVar, C3030b c3030b) {
    }

    default void p0(a aVar, PlaybackException playbackException) {
    }

    default void q0(a aVar, Exception exc) {
    }

    default void r(a aVar, C3030b c3030b) {
    }

    default void s(a aVar, int i10) {
    }

    default void t(a aVar, long j10) {
    }

    default void t0(a aVar, PlaybackException playbackException) {
    }

    default void u(a aVar, U1.x xVar) {
    }

    default void v(a aVar, int i10) {
    }

    default void y(a aVar, n2.j jVar) {
    }

    default void C(a aVar, n2.i iVar, n2.j jVar) {
    }

    default void E(a aVar, int i10, long j10) {
    }

    default void c(a aVar, n2.i iVar, n2.j jVar) {
    }

    default void d(a aVar, U1.v vVar, int i10) {
    }

    default void e(a aVar, Object obj, long j10) {
    }

    default void i(a aVar, U1.s sVar, C3031c c3031c) {
    }

    default void i0(a aVar, int i10, int i11) {
    }

    @Deprecated
    default void j(a aVar, String str, long j10) {
    }

    @Deprecated
    default void k(a aVar, boolean z10, int i10) {
    }

    default void k0(a aVar, int i10, boolean z10) {
    }

    default void m(a aVar, U1.s sVar, C3031c c3031c) {
    }

    default void r0(a aVar, n2.i iVar, n2.j jVar) {
    }

    @Deprecated
    default void w(a aVar, String str, long j10) {
    }

    default void x(a aVar, boolean z10, int i10) {
    }

    default void z(a aVar, long j10, int i10) {
    }

    default void V(a aVar, int i10, long j10, long j11) {
    }

    default void f(a aVar, B.e eVar, B.e eVar2, int i10) {
    }

    default void g(a aVar, String str, long j10, long j11) {
    }

    default void l(a aVar, String str, long j10, long j11) {
    }

    default void n(a aVar, int i10, int i11, boolean z10) {
    }

    default void p(a aVar, int i10, long j10, long j11) {
    }

    default void a(a aVar, n2.i iVar, n2.j jVar, IOException iOException, boolean z10) {
    }

    @Deprecated
    default void q(a aVar, int i10, int i11, int i12, float f10) {
    }
}
