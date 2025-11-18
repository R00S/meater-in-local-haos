package androidx.media3.exoplayer;

import U1.v;
import android.os.SystemClock;
import d2.InterfaceC3026D;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* renamed from: androidx.media3.exoplayer.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124f implements InterfaceC3026D {

    /* renamed from: a, reason: collision with root package name */
    private final float f27164a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27165b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27166c;

    /* renamed from: d, reason: collision with root package name */
    private final float f27167d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27168e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27169f;

    /* renamed from: g, reason: collision with root package name */
    private final float f27170g;

    /* renamed from: h, reason: collision with root package name */
    private long f27171h;

    /* renamed from: i, reason: collision with root package name */
    private long f27172i;

    /* renamed from: j, reason: collision with root package name */
    private long f27173j;

    /* renamed from: k, reason: collision with root package name */
    private long f27174k;

    /* renamed from: l, reason: collision with root package name */
    private long f27175l;

    /* renamed from: m, reason: collision with root package name */
    private long f27176m;

    /* renamed from: n, reason: collision with root package name */
    private float f27177n;

    /* renamed from: o, reason: collision with root package name */
    private float f27178o;

    /* renamed from: p, reason: collision with root package name */
    private float f27179p;

    /* renamed from: q, reason: collision with root package name */
    private long f27180q;

    /* renamed from: r, reason: collision with root package name */
    private long f27181r;

    /* renamed from: s, reason: collision with root package name */
    private long f27182s;

    /* compiled from: DefaultLivePlaybackSpeedControl.java */
    /* renamed from: androidx.media3.exoplayer.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f27183a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f27184b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f27185c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f27186d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f27187e = X1.L.Q0(20);

        /* renamed from: f, reason: collision with root package name */
        private long f27188f = X1.L.Q0(500);

        /* renamed from: g, reason: collision with root package name */
        private float f27189g = 0.999f;

        public C2124f a() {
            return new C2124f(this.f27183a, this.f27184b, this.f27185c, this.f27186d, this.f27187e, this.f27188f, this.f27189g);
        }
    }

    private void f(long j10) {
        long j11 = this.f27181r + (this.f27182s * 3);
        if (this.f27176m > j11) {
            float fQ0 = X1.L.Q0(this.f27166c);
            this.f27176m = p8.h.d(j11, this.f27173j, this.f27176m - (((long) ((this.f27179p - 1.0f) * fQ0)) + ((long) ((this.f27177n - 1.0f) * fQ0))));
            return;
        }
        long jQ = X1.L.q(j10 - ((long) (Math.max(0.0f, this.f27179p - 1.0f) / this.f27167d)), this.f27176m, j11);
        this.f27176m = jQ;
        long j12 = this.f27175l;
        if (j12 == -9223372036854775807L || jQ <= j12) {
            return;
        }
        this.f27176m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f27171h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f27172i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f27174k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f27175l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f27173j == j10) {
            return;
        }
        this.f27173j = j10;
        this.f27176m = j10;
        this.f27181r = -9223372036854775807L;
        this.f27182s = -9223372036854775807L;
        this.f27180q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f27181r;
        if (j13 == -9223372036854775807L) {
            this.f27181r = j12;
            this.f27182s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f27170g));
            this.f27181r = jMax;
            this.f27182s = h(this.f27182s, Math.abs(j12 - jMax), this.f27170g);
        }
    }

    @Override // d2.InterfaceC3026D
    public void a(v.g gVar) {
        this.f27171h = X1.L.Q0(gVar.f17308a);
        this.f27174k = X1.L.Q0(gVar.f17309b);
        this.f27175l = X1.L.Q0(gVar.f17310c);
        float f10 = gVar.f17311d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f27164a;
        }
        this.f27178o = f10;
        float f11 = gVar.f17312e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f27165b;
        }
        this.f27177n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f27171h = -9223372036854775807L;
        }
        g();
    }

    @Override // d2.InterfaceC3026D
    public float b(long j10, long j11) {
        if (this.f27171h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f27180q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f27180q < this.f27166c) {
            return this.f27179p;
        }
        this.f27180q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f27176m;
        if (Math.abs(j12) < this.f27168e) {
            this.f27179p = 1.0f;
        } else {
            this.f27179p = X1.L.o((this.f27167d * j12) + 1.0f, this.f27178o, this.f27177n);
        }
        return this.f27179p;
    }

    @Override // d2.InterfaceC3026D
    public long c() {
        return this.f27176m;
    }

    @Override // d2.InterfaceC3026D
    public void d() {
        long j10 = this.f27176m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f27169f;
        this.f27176m = j11;
        long j12 = this.f27175l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f27176m = j12;
        }
        this.f27180q = -9223372036854775807L;
    }

    @Override // d2.InterfaceC3026D
    public void e(long j10) {
        this.f27172i = j10;
        g();
    }

    private C2124f(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f27164a = f10;
        this.f27165b = f11;
        this.f27166c = j10;
        this.f27167d = f12;
        this.f27168e = j11;
        this.f27169f = j12;
        this.f27170g = f13;
        this.f27171h = -9223372036854775807L;
        this.f27172i = -9223372036854775807L;
        this.f27174k = -9223372036854775807L;
        this.f27175l = -9223372036854775807L;
        this.f27178o = f10;
        this.f27177n = f11;
        this.f27179p = 1.0f;
        this.f27180q = -9223372036854775807L;
        this.f27173j = -9223372036854775807L;
        this.f27176m = -9223372036854775807L;
        this.f27181r = -9223372036854775807L;
        this.f27182s = -9223372036854775807L;
    }
}
