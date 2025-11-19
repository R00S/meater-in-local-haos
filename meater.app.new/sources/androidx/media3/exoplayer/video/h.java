package androidx.media3.exoplayer.video;

import X1.C1804a;
import X1.InterfaceC1807d;
import X1.L;
import android.content.Context;
import android.view.Surface;

/* compiled from: VideoFrameReleaseControl.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final b f27997a;

    /* renamed from: b, reason: collision with root package name */
    private final t2.j f27998b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27999c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28000d;

    /* renamed from: g, reason: collision with root package name */
    private long f28003g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28006j;

    /* renamed from: e, reason: collision with root package name */
    private int f28001e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f28002f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f28004h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f28005i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    private float f28007k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC1807d f28008l = InterfaceC1807d.f18647a;

    /* compiled from: VideoFrameReleaseControl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f28009a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private long f28010b = -9223372036854775807L;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f28009a = -9223372036854775807L;
            this.f28010b = -9223372036854775807L;
        }

        public long f() {
            return this.f28009a;
        }

        public long g() {
            return this.f28010b;
        }
    }

    /* compiled from: VideoFrameReleaseControl.java */
    public interface b {
        boolean E(long j10, long j11, boolean z10);

        boolean O(long j10, long j11);

        boolean m(long j10, long j11, long j12, boolean z10, boolean z11);
    }

    public h(Context context, b bVar, long j10) {
        this.f27997a = bVar;
        this.f27999c = j10;
        this.f27998b = new t2.j(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / this.f28007k);
        return this.f28000d ? j13 - (L.Q0(this.f28008l.c()) - j11) : j13;
    }

    private void f(int i10) {
        this.f28001e = Math.min(this.f28001e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f28005i != -9223372036854775807L && !this.f28006j) {
            return false;
        }
        int i10 = this.f28001e;
        if (i10 == 0) {
            return this.f28000d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f28000d && this.f27997a.O(j11, L.Q0(this.f28008l.c()) - this.f28003g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f28001e == 0) {
            this.f28001e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, a aVar) {
        aVar.h();
        if (this.f28002f == -9223372036854775807L) {
            this.f28002f = j11;
        }
        if (this.f28004h != j10) {
            this.f27998b.h(j10);
            this.f28004h = j10;
        }
        aVar.f28009a = b(j11, j12, j10);
        boolean z11 = false;
        if (s(j11, aVar.f28009a, j13)) {
            return 0;
        }
        if (!this.f28000d || j11 == this.f28002f) {
            return 5;
        }
        long jB = this.f28008l.b();
        aVar.f28010b = this.f27998b.b((aVar.f28009a * 1000) + jB);
        aVar.f28009a = (aVar.f28010b - jB) / 1000;
        if (this.f28005i != -9223372036854775807L && !this.f28006j) {
            z11 = true;
        }
        if (this.f27997a.m(aVar.f28009a, j11, j12, z10, z11)) {
            return 4;
        }
        return this.f27997a.E(aVar.f28009a, j12, z10) ? z11 ? 3 : 2 : aVar.f28009a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && this.f28001e == 3) {
            this.f28005i = -9223372036854775807L;
            return true;
        }
        if (this.f28005i == -9223372036854775807L) {
            return false;
        }
        if (this.f28008l.c() < this.f28005i) {
            return true;
        }
        this.f28005i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f28006j = z10;
        this.f28005i = this.f27999c > 0 ? this.f28008l.c() + this.f27999c : -9223372036854775807L;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f28001e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f28001e != 3;
        this.f28001e = 3;
        this.f28003g = L.Q0(this.f28008l.c());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f28000d = true;
        this.f28003g = L.Q0(this.f28008l.c());
        this.f27998b.k();
    }

    public void l() {
        this.f28000d = false;
        this.f28005i = -9223372036854775807L;
        this.f27998b.l();
    }

    public void m() {
        this.f27998b.j();
        this.f28004h = -9223372036854775807L;
        this.f28002f = -9223372036854775807L;
        f(1);
        this.f28005i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f27998b.o(i10);
    }

    public void o(InterfaceC1807d interfaceC1807d) {
        this.f28008l = interfaceC1807d;
    }

    public void p(float f10) {
        this.f27998b.g(f10);
    }

    public void q(Surface surface) {
        this.f27998b.m(surface);
        f(1);
    }

    public void r(float f10) {
        C1804a.a(f10 > 0.0f);
        if (f10 == this.f28007k) {
            return;
        }
        this.f28007k = f10;
        this.f27998b.i(f10);
    }
}
