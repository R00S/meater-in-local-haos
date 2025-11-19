package androidx.media3.exoplayer.audio;

import X1.C1804a;
import X1.InterfaceC1807d;
import X1.L;
import android.media.AudioTrack;
import com.apptionlabs.meater_app.data.Config;
import java.lang.reflect.Method;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes.dex */
final class g {

    /* renamed from: A, reason: collision with root package name */
    private long f26784A;

    /* renamed from: B, reason: collision with root package name */
    private long f26785B;

    /* renamed from: C, reason: collision with root package name */
    private long f26786C;

    /* renamed from: D, reason: collision with root package name */
    private long f26787D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f26788E;

    /* renamed from: F, reason: collision with root package name */
    private long f26789F;

    /* renamed from: G, reason: collision with root package name */
    private long f26790G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f26791H;

    /* renamed from: I, reason: collision with root package name */
    private long f26792I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC1807d f26793J;

    /* renamed from: a, reason: collision with root package name */
    private final a f26794a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f26795b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f26796c;

    /* renamed from: d, reason: collision with root package name */
    private int f26797d;

    /* renamed from: e, reason: collision with root package name */
    private int f26798e;

    /* renamed from: f, reason: collision with root package name */
    private f f26799f;

    /* renamed from: g, reason: collision with root package name */
    private int f26800g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26801h;

    /* renamed from: i, reason: collision with root package name */
    private long f26802i;

    /* renamed from: j, reason: collision with root package name */
    private float f26803j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26804k;

    /* renamed from: l, reason: collision with root package name */
    private long f26805l;

    /* renamed from: m, reason: collision with root package name */
    private long f26806m;

    /* renamed from: n, reason: collision with root package name */
    private Method f26807n;

    /* renamed from: o, reason: collision with root package name */
    private long f26808o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f26809p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26810q;

    /* renamed from: r, reason: collision with root package name */
    private long f26811r;

    /* renamed from: s, reason: collision with root package name */
    private long f26812s;

    /* renamed from: t, reason: collision with root package name */
    private long f26813t;

    /* renamed from: u, reason: collision with root package name */
    private long f26814u;

    /* renamed from: v, reason: collision with root package name */
    private long f26815v;

    /* renamed from: w, reason: collision with root package name */
    private int f26816w;

    /* renamed from: x, reason: collision with root package name */
    private int f26817x;

    /* renamed from: y, reason: collision with root package name */
    private long f26818y;

    /* renamed from: z, reason: collision with root package name */
    private long f26819z;

    /* compiled from: AudioTrackPositionTracker.java */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public g(a aVar) {
        this.f26794a = (a) C1804a.e(aVar);
        try {
            this.f26807n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f26795b = new long[10];
        this.f26793J = InterfaceC1807d.f18647a;
    }

    private boolean b() {
        return this.f26801h && ((AudioTrack) C1804a.e(this.f26796c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        long jC = this.f26793J.c();
        if (this.f26818y != -9223372036854775807L) {
            if (((AudioTrack) C1804a.e(this.f26796c)).getPlayState() == 2) {
                return this.f26784A;
            }
            return Math.min(this.f26785B, this.f26784A + L.F(L.e0(L.Q0(jC) - this.f26818y, this.f26803j), this.f26800g));
        }
        if (jC - this.f26812s >= 5) {
            v(jC);
            this.f26812s = jC;
        }
        return this.f26813t + this.f26792I + (this.f26814u << 32);
    }

    private long e() {
        return L.c1(d(), this.f26800g);
    }

    private void k(long j10) {
        f fVar = (f) C1804a.e(this.f26799f);
        if (fVar.f(j10)) {
            long jD = fVar.d();
            long jC = fVar.c();
            long jE = e();
            if (Math.abs(jD - j10) > 5000000) {
                this.f26794a.e(jC, jD, j10, jE);
                fVar.g();
            } else if (Math.abs(L.c1(jC, this.f26800g) - jE) <= 5000000) {
                fVar.a();
            } else {
                this.f26794a.d(jC, jD, j10, jE);
                fVar.g();
            }
        }
    }

    private void l() {
        long jB = this.f26793J.b() / 1000;
        if (jB - this.f26806m >= Config.MC_STATS_INTERVAL) {
            long jE = e();
            if (jE != 0) {
                this.f26795b[this.f26816w] = L.j0(jE, this.f26803j) - jB;
                this.f26816w = (this.f26816w + 1) % 10;
                int i10 = this.f26817x;
                if (i10 < 10) {
                    this.f26817x = i10 + 1;
                }
                this.f26806m = jB;
                this.f26805l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f26817x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f26805l += this.f26795b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f26801h) {
            return;
        }
        k(jB);
        m(jB);
    }

    private void m(long j10) {
        Method method;
        if (!this.f26810q || (method = this.f26807n) == null || j10 - this.f26811r < 500000) {
            return;
        }
        try {
            long jIntValue = (((Integer) L.i((Integer) method.invoke(C1804a.e(this.f26796c), null))).intValue() * 1000) - this.f26802i;
            this.f26808o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f26808o = jMax;
            if (jMax > 5000000) {
                this.f26794a.b(jMax);
                this.f26808o = 0L;
            }
        } catch (Exception unused) {
            this.f26807n = null;
        }
        this.f26811r = j10;
    }

    private static boolean n(int i10) {
        return L.f18626a < 23 && (i10 == 5 || i10 == 6);
    }

    private void q() {
        this.f26805l = 0L;
        this.f26817x = 0;
        this.f26816w = 0;
        this.f26806m = 0L;
        this.f26787D = 0L;
        this.f26790G = 0L;
        this.f26804k = false;
    }

    private void v(long j10) {
        int playState = ((AudioTrack) C1804a.e(this.f26796c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f26801h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f26815v = this.f26813t;
            }
            playbackHeadPosition += this.f26815v;
        }
        if (L.f18626a <= 29) {
            if (playbackHeadPosition == 0 && this.f26813t > 0 && playState == 3) {
                if (this.f26819z == -9223372036854775807L) {
                    this.f26819z = j10;
                    return;
                }
                return;
            }
            this.f26819z = -9223372036854775807L;
        }
        long j11 = this.f26813t;
        if (j11 > playbackHeadPosition) {
            if (this.f26791H) {
                this.f26792I += j11;
                this.f26791H = false;
            } else {
                this.f26814u++;
            }
        }
        this.f26813t = playbackHeadPosition;
    }

    public void a() {
        this.f26791H = true;
        f fVar = this.f26799f;
        if (fVar != null) {
            fVar.b();
        }
    }

    public long c(boolean z10) {
        long jE;
        if (((AudioTrack) C1804a.e(this.f26796c)).getPlayState() == 3) {
            l();
        }
        long jB = this.f26793J.b() / 1000;
        f fVar = (f) C1804a.e(this.f26799f);
        boolean zE = fVar.e();
        if (zE) {
            jE = L.c1(fVar.c(), this.f26800g) + L.e0(jB - fVar.d(), this.f26803j);
        } else {
            jE = this.f26817x == 0 ? e() : L.e0(this.f26805l + jB, this.f26803j);
            if (!z10) {
                jE = Math.max(0L, jE - this.f26808o);
            }
        }
        if (this.f26788E != zE) {
            this.f26790G = this.f26787D;
            this.f26789F = this.f26786C;
        }
        long j10 = jB - this.f26790G;
        if (j10 < 1000000) {
            long jE0 = this.f26789F + L.e0(j10, this.f26803j);
            long j11 = (j10 * 1000) / 1000000;
            jE = ((jE * j11) + ((1000 - j11) * jE0)) / 1000;
        }
        if (!this.f26804k) {
            long j12 = this.f26786C;
            if (jE > j12) {
                this.f26804k = true;
                this.f26794a.c(this.f26793J.a() - L.u1(L.j0(L.u1(jE - j12), this.f26803j)));
            }
        }
        this.f26787D = jB;
        this.f26786C = jE;
        this.f26788E = zE;
        return jE;
    }

    public void f(long j10) {
        this.f26784A = d();
        this.f26818y = L.Q0(this.f26793J.c());
        this.f26785B = j10;
    }

    public boolean g(long j10) {
        return j10 > L.F(c(false), this.f26800g) || b();
    }

    public boolean h() {
        return ((AudioTrack) C1804a.e(this.f26796c)).getPlayState() == 3;
    }

    public boolean i(long j10) {
        return this.f26819z != -9223372036854775807L && j10 > 0 && this.f26793J.c() - this.f26819z >= 200;
    }

    public boolean j(long j10) {
        int playState = ((AudioTrack) C1804a.e(this.f26796c)).getPlayState();
        if (this.f26801h) {
            if (playState == 2) {
                this.f26809p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f26809p;
        boolean zG = g(j10);
        this.f26809p = zG;
        if (z10 && !zG && playState != 1) {
            this.f26794a.a(this.f26798e, L.u1(this.f26802i));
        }
        return true;
    }

    public boolean o() {
        q();
        if (this.f26818y == -9223372036854775807L) {
            ((f) C1804a.e(this.f26799f)).h();
            return true;
        }
        this.f26784A = d();
        return false;
    }

    public void p() {
        q();
        this.f26796c = null;
        this.f26799f = null;
    }

    public void r(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f26796c = audioTrack;
        this.f26797d = i11;
        this.f26798e = i12;
        this.f26799f = new f(audioTrack);
        this.f26800g = audioTrack.getSampleRate();
        this.f26801h = z10 && n(i10);
        boolean zF0 = L.F0(i10);
        this.f26810q = zF0;
        this.f26802i = zF0 ? L.c1(i12 / i11, this.f26800g) : -9223372036854775807L;
        this.f26813t = 0L;
        this.f26814u = 0L;
        this.f26791H = false;
        this.f26792I = 0L;
        this.f26815v = 0L;
        this.f26809p = false;
        this.f26818y = -9223372036854775807L;
        this.f26819z = -9223372036854775807L;
        this.f26811r = 0L;
        this.f26808o = 0L;
        this.f26803j = 1.0f;
    }

    public void s(float f10) {
        this.f26803j = f10;
        f fVar = this.f26799f;
        if (fVar != null) {
            fVar.h();
        }
        q();
    }

    public void t(InterfaceC1807d interfaceC1807d) {
        this.f26793J = interfaceC1807d;
    }

    public void u() {
        if (this.f26818y != -9223372036854775807L) {
            this.f26818y = L.Q0(this.f26793J.c());
        }
        ((f) C1804a.e(this.f26799f)).h();
    }
}
