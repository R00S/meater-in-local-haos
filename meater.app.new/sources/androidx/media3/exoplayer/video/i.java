package androidx.media3.exoplayer.video;

import U1.N;
import X1.C1804a;
import X1.D;
import X1.p;
import androidx.media3.exoplayer.video.h;

/* compiled from: VideoFrameRenderControl.java */
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f28011a;

    /* renamed from: b, reason: collision with root package name */
    private final h f28012b;

    /* renamed from: g, reason: collision with root package name */
    private N f28017g;

    /* renamed from: i, reason: collision with root package name */
    private long f28019i;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f28013c = new h.a();

    /* renamed from: d, reason: collision with root package name */
    private final D<N> f28014d = new D<>();

    /* renamed from: e, reason: collision with root package name */
    private final D<Long> f28015e = new D<>();

    /* renamed from: f, reason: collision with root package name */
    private final p f28016f = new p();

    /* renamed from: h, reason: collision with root package name */
    private N f28018h = N.f16982e;

    /* renamed from: j, reason: collision with root package name */
    private long f28020j = -9223372036854775807L;

    /* compiled from: VideoFrameRenderControl.java */
    interface a {
        void a(long j10, long j11, long j12, boolean z10);

        void b();

        void d(N n10);
    }

    public i(a aVar, h hVar) {
        this.f28011a = aVar;
        this.f28012b = hVar;
    }

    private void a() {
        C1804a.i(Long.valueOf(this.f28016f.d()));
        this.f28011a.b();
    }

    private static <T> T c(D<T> d10) {
        C1804a.a(d10.l() > 0);
        while (d10.l() > 1) {
            d10.i();
        }
        return (T) C1804a.e(d10.i());
    }

    private boolean e(long j10) {
        Long lJ = this.f28015e.j(j10);
        if (lJ == null || lJ.longValue() == this.f28019i) {
            return false;
        }
        this.f28019i = lJ.longValue();
        return true;
    }

    private boolean f(long j10) {
        N nJ = this.f28014d.j(j10);
        if (nJ == null || nJ.equals(N.f16982e) || nJ.equals(this.f28018h)) {
            return false;
        }
        this.f28018h = nJ;
        return true;
    }

    private void j(boolean z10) {
        long jLongValue = ((Long) C1804a.i(Long.valueOf(this.f28016f.d()))).longValue();
        if (f(jLongValue)) {
            this.f28011a.d(this.f28018h);
        }
        this.f28011a.a(z10 ? -1L : this.f28013c.g(), jLongValue, this.f28019i, this.f28012b.i());
    }

    public void b() {
        this.f28016f.a();
        this.f28020j = -9223372036854775807L;
        if (this.f28015e.l() > 0) {
            Long l10 = (Long) c(this.f28015e);
            l10.longValue();
            this.f28015e.a(0L, l10);
        }
        if (this.f28017g != null) {
            this.f28014d.c();
        } else if (this.f28014d.l() > 0) {
            this.f28017g = (N) c(this.f28014d);
        }
    }

    public boolean d(long j10) {
        long j11 = this.f28020j;
        return j11 != -9223372036854775807L && j11 >= j10;
    }

    public void g(int i10, int i11) {
        this.f28017g = new N(i10, i11);
    }

    public void h(long j10, long j11) {
        this.f28015e.a(j10, Long.valueOf(j11));
    }

    public void i(long j10, long j11) {
        while (!this.f28016f.c()) {
            long jB = this.f28016f.b();
            if (e(jB)) {
                this.f28012b.j();
            }
            int iC = this.f28012b.c(jB, j10, j11, this.f28019i, false, this.f28013c);
            if (iC == 0 || iC == 1) {
                this.f28020j = jB;
                j(iC == 0);
            } else if (iC != 2 && iC != 3 && iC != 4) {
                if (iC != 5) {
                    throw new IllegalStateException(String.valueOf(iC));
                }
                return;
            } else {
                this.f28020j = jB;
                a();
            }
        }
    }
}
