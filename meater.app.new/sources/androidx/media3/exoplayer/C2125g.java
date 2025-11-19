package androidx.media3.exoplayer;

import X1.C1804a;
import androidx.media3.exoplayer.V;
import androidx.media3.exoplayer.source.r;
import e2.v1;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: DefaultLoadControl.java */
/* renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2125g implements V {

    /* renamed from: b, reason: collision with root package name */
    private final r2.g f27192b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27193c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27194d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27195e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27196f;

    /* renamed from: g, reason: collision with root package name */
    private final int f27197g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f27198h;

    /* renamed from: i, reason: collision with root package name */
    private final long f27199i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f27200j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<v1, b> f27201k;

    /* renamed from: l, reason: collision with root package name */
    private long f27202l;

    /* compiled from: DefaultLoadControl.java */
    /* renamed from: androidx.media3.exoplayer.g$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f27203a;

        /* renamed from: b, reason: collision with root package name */
        public int f27204b;

        private b() {
        }
    }

    public C2125g() {
        this(new r2.g(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    private static void s(int i10, int i11, String str, String str2) {
        C1804a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int v(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void w(v1 v1Var) {
        if (this.f27201k.remove(v1Var) != null) {
            y();
        }
    }

    private void x(v1 v1Var) {
        b bVar = (b) C1804a.e(this.f27201k.get(v1Var));
        int i10 = this.f27197g;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f27204b = i10;
        bVar.f27203a = false;
    }

    private void y() {
        if (this.f27201k.isEmpty()) {
            this.f27192b.g();
        } else {
            this.f27192b.h(u());
        }
    }

    @Override // androidx.media3.exoplayer.V
    public boolean a(V.a aVar) {
        long jJ0 = X1.L.j0(aVar.f26549e, aVar.f26550f);
        long jMin = aVar.f26552h ? this.f27196f : this.f27195e;
        long j10 = aVar.f26553i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || jJ0 >= jMin || (!this.f27198h && this.f27192b.f() >= u());
    }

    @Override // androidx.media3.exoplayer.V
    public boolean d(V.a aVar) {
        b bVar = (b) C1804a.e(this.f27201k.get(aVar.f26545a));
        boolean z10 = true;
        boolean z11 = this.f27192b.f() >= u();
        long jMin = this.f27193c;
        float f10 = aVar.f26550f;
        if (f10 > 1.0f) {
            jMin = Math.min(X1.L.e0(jMin, f10), this.f27194d);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f26549e;
        if (j10 < jMax) {
            if (!this.f27198h && z11) {
                z10 = false;
            }
            bVar.f27203a = z10;
            if (!z10 && j10 < 500000) {
                X1.n.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f27194d || z11) {
            bVar.f27203a = false;
        }
        return bVar.f27203a;
    }

    @Override // androidx.media3.exoplayer.V
    public void e(V.a aVar, n2.x xVar, q2.x[] xVarArr) {
        b bVar = (b) C1804a.e(this.f27201k.get(aVar.f26545a));
        int iT = this.f27197g;
        if (iT == -1) {
            iT = t(xVarArr);
        }
        bVar.f27204b = iT;
        y();
    }

    @Override // androidx.media3.exoplayer.V
    public boolean f(U1.G g10, r.b bVar, long j10) {
        Iterator<b> it = this.f27201k.values().iterator();
        while (it.hasNext()) {
            if (it.next().f27203a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.V
    public void g(v1 v1Var) {
        w(v1Var);
        if (this.f27201k.isEmpty()) {
            this.f27202l = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.V
    public void i(v1 v1Var) {
        w(v1Var);
    }

    @Override // androidx.media3.exoplayer.V
    public long n(v1 v1Var) {
        return this.f27199i;
    }

    @Override // androidx.media3.exoplayer.V
    public r2.b o() {
        return this.f27192b;
    }

    @Override // androidx.media3.exoplayer.V
    public void q(v1 v1Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f27202l;
        C1804a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f27202l = id2;
        if (!this.f27201k.containsKey(v1Var)) {
            this.f27201k.put(v1Var, new b());
        }
        x(v1Var);
    }

    @Override // androidx.media3.exoplayer.V
    public boolean r(v1 v1Var) {
        return this.f27200j;
    }

    protected int t(q2.x[] xVarArr) {
        int iV = 0;
        for (q2.x xVar : xVarArr) {
            if (xVar != null) {
                iV += v(xVar.b().f16864c);
            }
        }
        return Math.max(13107200, iV);
    }

    int u() {
        Iterator<b> it = this.f27201k.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f27204b;
        }
        return i10;
    }

    protected C2125g(r2.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        s(i12, 0, "bufferForPlaybackMs", "0");
        s(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        s(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        s(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        s(i11, i10, "maxBufferMs", "minBufferMs");
        s(i15, 0, "backBufferDurationMs", "0");
        this.f27192b = gVar;
        this.f27193c = X1.L.Q0(i10);
        this.f27194d = X1.L.Q0(i11);
        this.f27195e = X1.L.Q0(i12);
        this.f27196f = X1.L.Q0(i13);
        this.f27197g = i14;
        this.f27198h = z10;
        this.f27199i = X1.L.Q0(i15);
        this.f27200j = z11;
        this.f27201k = new HashMap<>();
        this.f27202l = -1L;
    }
}
