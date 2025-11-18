package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.exoplayer.source.r;
import java.util.List;
import m8.AbstractC4009y;
import q2.C4271D;

/* compiled from: PlaybackInfo.java */
/* loaded from: classes.dex */
final class q0 {

    /* renamed from: u, reason: collision with root package name */
    private static final r.b f27444u = new r.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final U1.G f27445a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f27446b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27447c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27448d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27449e;

    /* renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f27450f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27451g;

    /* renamed from: h, reason: collision with root package name */
    public final n2.x f27452h;

    /* renamed from: i, reason: collision with root package name */
    public final C4271D f27453i;

    /* renamed from: j, reason: collision with root package name */
    public final List<U1.y> f27454j;

    /* renamed from: k, reason: collision with root package name */
    public final r.b f27455k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27456l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27457m;

    /* renamed from: n, reason: collision with root package name */
    public final int f27458n;

    /* renamed from: o, reason: collision with root package name */
    public final U1.A f27459o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f27460p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f27461q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f27462r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f27463s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f27464t;

    public q0(U1.G g10, r.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, n2.x xVar, C4271D c4271d, List<U1.y> list, r.b bVar2, boolean z11, int i11, int i12, U1.A a10, long j12, long j13, long j14, long j15, boolean z12) {
        this.f27445a = g10;
        this.f27446b = bVar;
        this.f27447c = j10;
        this.f27448d = j11;
        this.f27449e = i10;
        this.f27450f = exoPlaybackException;
        this.f27451g = z10;
        this.f27452h = xVar;
        this.f27453i = c4271d;
        this.f27454j = list;
        this.f27455k = bVar2;
        this.f27456l = z11;
        this.f27457m = i11;
        this.f27458n = i12;
        this.f27459o = a10;
        this.f27461q = j12;
        this.f27462r = j13;
        this.f27463s = j14;
        this.f27464t = j15;
        this.f27460p = z12;
    }

    public static q0 k(C4271D c4271d) {
        U1.G g10 = U1.G.f16812a;
        r.b bVar = f27444u;
        return new q0(g10, bVar, -9223372036854775807L, 0L, 1, null, false, n2.x.f45675d, c4271d, AbstractC4009y.G(), bVar, false, 1, 0, U1.A.f16772d, 0L, 0L, 0L, 0L, false);
    }

    public static r.b l() {
        return f27444u;
    }

    public q0 a() {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, m(), SystemClock.elapsedRealtime(), this.f27460p);
    }

    public q0 b(boolean z10) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, z10, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public q0 c(r.b bVar) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, bVar, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public q0 d(r.b bVar, long j10, long j11, long j12, long j13, n2.x xVar, C4271D c4271d, List<U1.y> list) {
        return new q0(this.f27445a, bVar, j11, j12, this.f27449e, this.f27450f, this.f27451g, xVar, c4271d, list, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, j13, j10, SystemClock.elapsedRealtime(), this.f27460p);
    }

    public q0 e(boolean z10, int i10, int i11) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, z10, i10, i11, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public q0 f(ExoPlaybackException exoPlaybackException) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, exoPlaybackException, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public q0 g(U1.A a10) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, a10, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public q0 h(int i10) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, i10, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public q0 i(boolean z10) {
        return new q0(this.f27445a, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, z10);
    }

    public q0 j(U1.G g10) {
        return new q0(g10, this.f27446b, this.f27447c, this.f27448d, this.f27449e, this.f27450f, this.f27451g, this.f27452h, this.f27453i, this.f27454j, this.f27455k, this.f27456l, this.f27457m, this.f27458n, this.f27459o, this.f27461q, this.f27462r, this.f27463s, this.f27464t, this.f27460p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f27463s;
        }
        do {
            j10 = this.f27464t;
            j11 = this.f27463s;
        } while (j10 != this.f27464t);
        return X1.L.Q0(X1.L.u1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f27459o.f16775a)));
    }

    public boolean n() {
        return this.f27449e == 3 && this.f27456l && this.f27458n == 0;
    }

    public void o(long j10) {
        this.f27463s = j10;
        this.f27464t = SystemClock.elapsedRealtime();
    }
}
