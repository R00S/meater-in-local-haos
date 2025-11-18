package androidx.media3.exoplayer;

import U1.AbstractC1731g;
import U1.B;
import U1.C1727c;
import U1.C1737m;
import U1.G;
import X1.C1804a;
import X1.C1810g;
import X1.C1816m;
import X1.InterfaceC1807d;
import X1.InterfaceC1813j;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.C2119a;
import androidx.media3.exoplayer.C2122d;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.U;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.p0;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.v0;
import d2.C3030b;
import d2.C3031c;
import e2.InterfaceC3129a;
import e2.InterfaceC3131b;
import e2.t1;
import e2.v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import l2.InterfaceC3895b;
import m8.AbstractC4009y;
import p2.InterfaceC4201h;
import q2.AbstractC4270C;
import q2.C4271D;
import u2.InterfaceC4662a;
import u2.l;

/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes.dex */
final class H extends AbstractC1731g implements ExoPlayer {

    /* renamed from: A, reason: collision with root package name */
    private final C2119a f26363A;

    /* renamed from: B, reason: collision with root package name */
    private final C2122d f26364B;

    /* renamed from: C, reason: collision with root package name */
    private final v0 f26365C;

    /* renamed from: D, reason: collision with root package name */
    private final y0 f26366D;

    /* renamed from: E, reason: collision with root package name */
    private final z0 f26367E;

    /* renamed from: F, reason: collision with root package name */
    private final long f26368F;

    /* renamed from: G, reason: collision with root package name */
    private AudioManager f26369G;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f26370H;

    /* renamed from: I, reason: collision with root package name */
    private final x0 f26371I;

    /* renamed from: J, reason: collision with root package name */
    private int f26372J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f26373K;

    /* renamed from: L, reason: collision with root package name */
    private int f26374L;

    /* renamed from: M, reason: collision with root package name */
    private int f26375M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f26376N;

    /* renamed from: O, reason: collision with root package name */
    private d2.I f26377O;

    /* renamed from: P, reason: collision with root package name */
    private n2.t f26378P;

    /* renamed from: Q, reason: collision with root package name */
    private ExoPlayer.c f26379Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f26380R;

    /* renamed from: S, reason: collision with root package name */
    private B.b f26381S;

    /* renamed from: T, reason: collision with root package name */
    private U1.x f26382T;

    /* renamed from: U, reason: collision with root package name */
    private U1.x f26383U;

    /* renamed from: V, reason: collision with root package name */
    private U1.s f26384V;

    /* renamed from: W, reason: collision with root package name */
    private U1.s f26385W;

    /* renamed from: X, reason: collision with root package name */
    private Object f26386X;

    /* renamed from: Y, reason: collision with root package name */
    private Surface f26387Y;

    /* renamed from: Z, reason: collision with root package name */
    private SurfaceHolder f26388Z;

    /* renamed from: a0, reason: collision with root package name */
    private u2.l f26389a0;

    /* renamed from: b, reason: collision with root package name */
    final C4271D f26390b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f26391b0;

    /* renamed from: c, reason: collision with root package name */
    final B.b f26392c;

    /* renamed from: c0, reason: collision with root package name */
    private TextureView f26393c0;

    /* renamed from: d, reason: collision with root package name */
    private final C1810g f26394d;

    /* renamed from: d0, reason: collision with root package name */
    private int f26395d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f26396e;

    /* renamed from: e0, reason: collision with root package name */
    private int f26397e0;

    /* renamed from: f, reason: collision with root package name */
    private final U1.B f26398f;

    /* renamed from: f0, reason: collision with root package name */
    private X1.A f26399f0;

    /* renamed from: g, reason: collision with root package name */
    private final t0[] f26400g;

    /* renamed from: g0, reason: collision with root package name */
    private C3030b f26401g0;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC4270C f26402h;

    /* renamed from: h0, reason: collision with root package name */
    private C3030b f26403h0;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1813j f26404i;

    /* renamed from: i0, reason: collision with root package name */
    private int f26405i0;

    /* renamed from: j, reason: collision with root package name */
    private final U.f f26406j;

    /* renamed from: j0, reason: collision with root package name */
    private C1727c f26407j0;

    /* renamed from: k, reason: collision with root package name */
    private final U f26408k;

    /* renamed from: k0, reason: collision with root package name */
    private float f26409k0;

    /* renamed from: l, reason: collision with root package name */
    private final C1816m<B.d> f26410l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f26411l0;

    /* renamed from: m, reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f26412m;

    /* renamed from: m0, reason: collision with root package name */
    private W1.b f26413m0;

    /* renamed from: n, reason: collision with root package name */
    private final G.b f26414n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f26415n0;

    /* renamed from: o, reason: collision with root package name */
    private final List<f> f26416o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f26417o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f26418p;

    /* renamed from: p0, reason: collision with root package name */
    private int f26419p0;

    /* renamed from: q, reason: collision with root package name */
    private final r.a f26420q;

    /* renamed from: q0, reason: collision with root package name */
    private PriorityTaskManager f26421q0;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3129a f26422r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f26423r0;

    /* renamed from: s, reason: collision with root package name */
    private final Looper f26424s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f26425s0;

    /* renamed from: t, reason: collision with root package name */
    private final r2.d f26426t;

    /* renamed from: t0, reason: collision with root package name */
    private C1737m f26427t0;

    /* renamed from: u, reason: collision with root package name */
    private final long f26428u;

    /* renamed from: u0, reason: collision with root package name */
    private U1.N f26429u0;

    /* renamed from: v, reason: collision with root package name */
    private final long f26430v;

    /* renamed from: v0, reason: collision with root package name */
    private U1.x f26431v0;

    /* renamed from: w, reason: collision with root package name */
    private final long f26432w;

    /* renamed from: w0, reason: collision with root package name */
    private q0 f26433w0;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC1807d f26434x;

    /* renamed from: x0, reason: collision with root package name */
    private int f26435x0;

    /* renamed from: y, reason: collision with root package name */
    private final d f26436y;

    /* renamed from: y0, reason: collision with root package name */
    private int f26437y0;

    /* renamed from: z, reason: collision with root package name */
    private final e f26438z;

    /* renamed from: z0, reason: collision with root package name */
    private long f26439z0;

    /* compiled from: ExoPlayerImpl.java */
    private static final class b {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            if (!X1.L.K0(context)) {
                return true;
            }
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = X1.L.f18626a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    private static final class c {
        public static v1 a(Context context, H h10, boolean z10, String str) {
            t1 t1VarV0 = t1.v0(context);
            if (t1VarV0 == null) {
                X1.n.h("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new v1(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z10) {
                h10.v1(t1VarV0);
            }
            return new v1(t1VarV0.C0(), str);
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    private static final class e implements t2.h, InterfaceC4662a, r0.b {

        /* renamed from: B, reason: collision with root package name */
        private t2.h f26441B;

        /* renamed from: C, reason: collision with root package name */
        private InterfaceC4662a f26442C;

        /* renamed from: D, reason: collision with root package name */
        private t2.h f26443D;

        /* renamed from: E, reason: collision with root package name */
        private InterfaceC4662a f26444E;

        private e() {
        }

        @Override // androidx.media3.exoplayer.r0.b
        public void J(int i10, Object obj) {
            if (i10 == 7) {
                this.f26441B = (t2.h) obj;
                return;
            }
            if (i10 == 8) {
                this.f26442C = (InterfaceC4662a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            u2.l lVar = (u2.l) obj;
            if (lVar == null) {
                this.f26443D = null;
                this.f26444E = null;
            } else {
                this.f26443D = lVar.getVideoFrameMetadataListener();
                this.f26444E = lVar.getCameraMotionListener();
            }
        }

        @Override // u2.InterfaceC4662a
        public void a(long j10, float[] fArr) {
            InterfaceC4662a interfaceC4662a = this.f26444E;
            if (interfaceC4662a != null) {
                interfaceC4662a.a(j10, fArr);
            }
            InterfaceC4662a interfaceC4662a2 = this.f26442C;
            if (interfaceC4662a2 != null) {
                interfaceC4662a2.a(j10, fArr);
            }
        }

        @Override // u2.InterfaceC4662a
        public void e() {
            InterfaceC4662a interfaceC4662a = this.f26444E;
            if (interfaceC4662a != null) {
                interfaceC4662a.e();
            }
            InterfaceC4662a interfaceC4662a2 = this.f26442C;
            if (interfaceC4662a2 != null) {
                interfaceC4662a2.e();
            }
        }

        @Override // t2.h
        public void h(long j10, long j11, U1.s sVar, MediaFormat mediaFormat) {
            t2.h hVar = this.f26443D;
            if (hVar != null) {
                hVar.h(j10, j11, sVar, mediaFormat);
            }
            t2.h hVar2 = this.f26441B;
            if (hVar2 != null) {
                hVar2.h(j10, j11, sVar, mediaFormat);
            }
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    private static final class f implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f26445a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.r f26446b;

        /* renamed from: c, reason: collision with root package name */
        private U1.G f26447c;

        public f(Object obj, androidx.media3.exoplayer.source.p pVar) {
            this.f26445a = obj;
            this.f26446b = pVar;
            this.f26447c = pVar.V();
        }

        @Override // androidx.media3.exoplayer.b0
        public Object a() {
            return this.f26445a;
        }

        @Override // androidx.media3.exoplayer.b0
        public U1.G b() {
            return this.f26447c;
        }

        public void c(U1.G g10) {
            this.f26447c = g10;
        }
    }

    /* compiled from: ExoPlayerImpl.java */
    private final class g extends AudioDeviceCallback {
        private g() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (H.this.Q1() && H.this.f26433w0.f27458n == 3) {
                H h10 = H.this;
                h10.K2(h10.f26433w0.f27456l, 1, 0);
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (H.this.Q1()) {
                return;
            }
            H h10 = H.this;
            h10.K2(h10.f26433w0.f27456l, 1, 3);
        }
    }

    static {
        U1.w.a("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x02c0 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:3:0x000e, B:7:0x00ae, B:11:0x00f7, B:13:0x01bc, B:18:0x01d2, B:20:0x025f, B:21:0x0262, B:23:0x027f, B:25:0x0283, B:29:0x0292, B:35:0x02bc, B:37:0x02c0, B:39:0x02d4, B:43:0x02e4, B:47:0x02f8, B:38:0x02d2, B:34:0x02a2, B:17:0x01c9), top: B:52:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d2 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:3:0x000e, B:7:0x00ae, B:11:0x00f7, B:13:0x01bc, B:18:0x01d2, B:20:0x025f, B:21:0x0262, B:23:0x027f, B:25:0x0283, B:29:0x0292, B:35:0x02bc, B:37:0x02c0, B:39:0x02d4, B:43:0x02e4, B:47:0x02f8, B:38:0x02d2, B:34:0x02a2, B:17:0x01c9), top: B:52:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f7  */
    @android.annotation.SuppressLint({"HandlerLeak"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H(androidx.media3.exoplayer.ExoPlayer.b r43, U1.B r44) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.H.<init>(androidx.media3.exoplayer.ExoPlayer$b, U1.B):void");
    }

    private int B1(boolean z10, int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (!this.f26370H) {
            return 0;
        }
        if (!z10 || Q1()) {
            return (z10 || this.f26433w0.f27458n != 3) ? 0 : 3;
        }
        return 3;
    }

    private void B2(List<androidx.media3.exoplayer.source.r> list, int i10, long j10, boolean z10) {
        int iA;
        long j11;
        int iJ1 = J1(this.f26433w0);
        long jI0 = i0();
        this.f26374L++;
        if (!this.f26416o.isEmpty()) {
            u2(0, this.f26416o.size());
        }
        List<p0.c> listX1 = x1(0, list);
        U1.G gD1 = D1();
        if (!gD1.q() && i10 >= gD1.p()) {
            throw new IllegalSeekPositionException(gD1, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            iA = gD1.a(this.f26373K);
        } else if (i10 == -1) {
            iA = iJ1;
            j11 = jI0;
        } else {
            iA = i10;
            j11 = j10;
        }
        q0 q0VarP2 = p2(this.f26433w0, gD1, q2(gD1, iA, j11));
        int i11 = q0VarP2.f27449e;
        if (iA != -1 && i11 != 1) {
            i11 = (gD1.q() || iA >= gD1.p()) ? 4 : 2;
        }
        q0 q0VarH = q0VarP2.h(i11);
        this.f26408k.b1(listX1, iA, X1.L.Q0(j11), this.f26378P);
        J2(q0VarH, 0, (this.f26433w0.f27446b.f27812a.equals(q0VarH.f27446b.f27812a) || this.f26433w0.f27445a.q()) ? false : true, 4, I1(q0VarH), -1, false);
    }

    private static C1737m C1(v0 v0Var) {
        return new C1737m.b(0).g(v0Var != null ? v0Var.d() : 0).f(v0Var != null ? v0Var.c() : 0).e();
    }

    private void C2(SurfaceHolder surfaceHolder) {
        this.f26391b0 = false;
        this.f26388Z = surfaceHolder;
        surfaceHolder.addCallback(this.f26436y);
        Surface surface = this.f26388Z.getSurface();
        if (surface == null || !surface.isValid()) {
            r2(0, 0);
        } else {
            Rect surfaceFrame = this.f26388Z.getSurfaceFrame();
            r2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private U1.G D1() {
        return new s0(this.f26416o, this.f26378P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        E2(surface);
        this.f26387Y = surface;
    }

    private List<androidx.media3.exoplayer.source.r> E1(List<U1.v> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f26420q.c(list.get(i10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E2(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (t0 t0Var : this.f26400g) {
            if (t0Var.l() == 2) {
                arrayList.add(F1(t0Var).n(1).m(obj).l());
            }
        }
        Object obj2 = this.f26386X;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r0) it.next()).a(this.f26368F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.f26386X;
            Surface surface = this.f26387Y;
            if (obj3 == surface) {
                surface.release();
                this.f26387Y = null;
            }
        }
        this.f26386X = obj;
        if (z10) {
            G2(ExoPlaybackException.d(new ExoTimeoutException(3), 1003));
        }
    }

    private r0 F1(r0.b bVar) {
        int iJ1 = J1(this.f26433w0);
        U u10 = this.f26408k;
        U1.G g10 = this.f26433w0.f27445a;
        if (iJ1 == -1) {
            iJ1 = 0;
        }
        return new r0(u10, bVar, g10, iJ1, this.f26434x, u10.H());
    }

    private Pair<Boolean, Integer> G1(q0 q0Var, q0 q0Var2, boolean z10, int i10, boolean z11, boolean z12) {
        U1.G g10 = q0Var2.f27445a;
        U1.G g11 = q0Var.f27445a;
        if (g11.q() && g10.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (g11.q() != g10.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (g10.n(g10.h(q0Var2.f27446b.f27812a, this.f26414n).f16823c, this.f17046a).f16844a.equals(g11.n(g11.h(q0Var.f27446b.f27812a, this.f26414n).f16823c, this.f17046a).f16844a)) {
            return (z10 && i10 == 0 && q0Var2.f27446b.f27815d < q0Var.f27446b.f27815d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void G2(ExoPlaybackException exoPlaybackException) {
        q0 q0Var = this.f26433w0;
        q0 q0VarC = q0Var.c(q0Var.f27446b);
        q0VarC.f27461q = q0VarC.f27463s;
        q0VarC.f27462r = 0L;
        q0 q0VarH = q0VarC.h(1);
        if (exoPlaybackException != null) {
            q0VarH = q0VarH.f(exoPlaybackException);
        }
        this.f26374L++;
        this.f26408k.w1();
        J2(q0VarH, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private long H1(q0 q0Var) {
        if (!q0Var.f27446b.b()) {
            return X1.L.u1(I1(q0Var));
        }
        q0Var.f27445a.h(q0Var.f27446b.f27812a, this.f26414n);
        return q0Var.f27447c == -9223372036854775807L ? q0Var.f27445a.n(J1(q0Var), this.f17046a).b() : this.f26414n.m() + X1.L.u1(q0Var.f27447c);
    }

    private void H2() {
        B.b bVar = this.f26381S;
        B.b bVarO = X1.L.O(this.f26398f, this.f26392c);
        this.f26381S = bVarO;
        if (bVarO.equals(bVar)) {
            return;
        }
        this.f26410l.i(13, new C1816m.a() { // from class: androidx.media3.exoplayer.w
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                this.f28023a.a2((B.d) obj);
            }
        });
    }

    private long I1(q0 q0Var) {
        if (q0Var.f27445a.q()) {
            return X1.L.Q0(this.f26439z0);
        }
        long jM = q0Var.f27460p ? q0Var.m() : q0Var.f27463s;
        return q0Var.f27446b.b() ? jM : t2(q0Var.f27445a, q0Var.f27446b, jM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2(boolean z10, int i10, int i11) {
        boolean z11 = z10 && i10 != -1;
        int iB1 = B1(z11, i10);
        q0 q0Var = this.f26433w0;
        if (q0Var.f27456l == z11 && q0Var.f27458n == iB1 && q0Var.f27457m == i11) {
            return;
        }
        K2(z11, i11, iB1);
    }

    private int J1(q0 q0Var) {
        return q0Var.f27445a.q() ? this.f26435x0 : q0Var.f27445a.h(q0Var.f27446b.f27812a, this.f26414n).f16823c;
    }

    private void J2(final q0 q0Var, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        q0 q0Var2 = this.f26433w0;
        this.f26433w0 = q0Var;
        boolean zEquals = q0Var2.f27445a.equals(q0Var.f27445a);
        Pair<Boolean, Integer> pairG1 = G1(q0Var, q0Var2, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairG1.first).booleanValue();
        final int iIntValue = ((Integer) pairG1.second).intValue();
        if (zBooleanValue) {
            vVar = q0Var.f27445a.q() ? null : q0Var.f27445a.n(q0Var.f27445a.h(q0Var.f27446b.f27812a, this.f26414n).f16823c, this.f17046a).f16846c;
            this.f26431v0 = U1.x.f17368I;
        }
        if (zBooleanValue || !q0Var2.f27454j.equals(q0Var.f27454j)) {
            this.f26431v0 = this.f26431v0.a().N(q0Var.f27454j).J();
        }
        U1.x xVarY1 = y1();
        boolean zEquals2 = xVarY1.equals(this.f26382T);
        this.f26382T = xVarY1;
        boolean z12 = q0Var2.f27456l != q0Var.f27456l;
        boolean z13 = q0Var2.f27449e != q0Var.f27449e;
        if (z13 || z12) {
            M2();
        }
        boolean z14 = q0Var2.f27451g;
        boolean z15 = q0Var.f27451g;
        boolean z16 = z14 != z15;
        if (z16) {
            L2(z15);
        }
        if (!zEquals) {
            this.f26410l.i(0, new C1816m.a() { // from class: androidx.media3.exoplayer.j
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.b2(q0Var, i10, (B.d) obj);
                }
            });
        }
        if (z10) {
            final B.e eVarN1 = N1(i11, q0Var2, i12);
            final B.e eVarM1 = M1(j10);
            this.f26410l.i(11, new C1816m.a() { // from class: androidx.media3.exoplayer.C
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.c2(i11, eVarN1, eVarM1, (B.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f26410l.i(1, new C1816m.a() { // from class: androidx.media3.exoplayer.D
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).a0(vVar, iIntValue);
                }
            });
        }
        if (q0Var2.f27450f != q0Var.f27450f) {
            this.f26410l.i(10, new C1816m.a() { // from class: androidx.media3.exoplayer.E
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.e2(q0Var, (B.d) obj);
                }
            });
            if (q0Var.f27450f != null) {
                this.f26410l.i(10, new C1816m.a() { // from class: androidx.media3.exoplayer.F
                    @Override // X1.C1816m.a
                    public final void invoke(Object obj) {
                        H.f2(q0Var, (B.d) obj);
                    }
                });
            }
        }
        C4271D c4271d = q0Var2.f27453i;
        C4271D c4271d2 = q0Var.f27453i;
        if (c4271d != c4271d2) {
            this.f26402h.i(c4271d2.f47809e);
            this.f26410l.i(2, new C1816m.a() { // from class: androidx.media3.exoplayer.G
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.g2(q0Var, (B.d) obj);
                }
            });
        }
        if (!zEquals2) {
            final U1.x xVar = this.f26382T;
            this.f26410l.i(14, new C1816m.a() { // from class: androidx.media3.exoplayer.k
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).Z(xVar);
                }
            });
        }
        if (z16) {
            this.f26410l.i(3, new C1816m.a() { // from class: androidx.media3.exoplayer.l
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.i2(q0Var, (B.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f26410l.i(-1, new C1816m.a() { // from class: androidx.media3.exoplayer.m
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.j2(q0Var, (B.d) obj);
                }
            });
        }
        if (z13) {
            this.f26410l.i(4, new C1816m.a() { // from class: androidx.media3.exoplayer.n
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.k2(q0Var, (B.d) obj);
                }
            });
        }
        if (z12 || q0Var2.f27457m != q0Var.f27457m) {
            this.f26410l.i(5, new C1816m.a() { // from class: androidx.media3.exoplayer.u
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.l2(q0Var, (B.d) obj);
                }
            });
        }
        if (q0Var2.f27458n != q0Var.f27458n) {
            this.f26410l.i(6, new C1816m.a() { // from class: androidx.media3.exoplayer.z
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.m2(q0Var, (B.d) obj);
                }
            });
        }
        if (q0Var2.n() != q0Var.n()) {
            this.f26410l.i(7, new C1816m.a() { // from class: androidx.media3.exoplayer.A
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.n2(q0Var, (B.d) obj);
                }
            });
        }
        if (!q0Var2.f27459o.equals(q0Var.f27459o)) {
            this.f26410l.i(12, new C1816m.a() { // from class: androidx.media3.exoplayer.B
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.o2(q0Var, (B.d) obj);
                }
            });
        }
        H2();
        this.f26410l.f();
        if (q0Var2.f27460p != q0Var.f27460p) {
            Iterator<ExoPlayer.a> it = this.f26412m.iterator();
            while (it.hasNext()) {
                it.next().G(q0Var.f27460p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K1(int i10) {
        return i10 == -1 ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2(boolean z10, int i10, int i11) {
        this.f26374L++;
        q0 q0VarA = this.f26433w0;
        if (q0VarA.f27460p) {
            q0VarA = q0VarA.a();
        }
        q0 q0VarE = q0VarA.e(z10, i10, i11);
        this.f26408k.e1(z10, i10, i11);
        J2(q0VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void L2(boolean z10) {
        PriorityTaskManager priorityTaskManager = this.f26421q0;
        if (priorityTaskManager != null) {
            if (z10 && !this.f26423r0) {
                priorityTaskManager.a(this.f26419p0);
                this.f26423r0 = true;
            } else {
                if (z10 || !this.f26423r0) {
                    return;
                }
                priorityTaskManager.c(this.f26419p0);
                this.f26423r0 = false;
            }
        }
    }

    private B.e M1(long j10) {
        U1.v vVar;
        Object obj;
        int iB;
        Object obj2;
        int iQ = Q();
        if (this.f26433w0.f27445a.q()) {
            vVar = null;
            obj = null;
            iB = -1;
            obj2 = null;
        } else {
            q0 q0Var = this.f26433w0;
            Object obj3 = q0Var.f27446b.f27812a;
            q0Var.f27445a.h(obj3, this.f26414n);
            iB = this.f26433w0.f27445a.b(obj3);
            obj = obj3;
            obj2 = this.f26433w0.f27445a.n(iQ, this.f17046a).f16844a;
            vVar = this.f17046a.f16846c;
        }
        long jU1 = X1.L.u1(j10);
        long jU12 = this.f26433w0.f27446b.b() ? X1.L.u1(O1(this.f26433w0)) : jU1;
        r.b bVar = this.f26433w0.f27446b;
        return new B.e(obj2, iQ, vVar, obj, iB, jU1, jU12, bVar.f27813b, bVar.f27814c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        int iK = K();
        if (iK != 1) {
            if (iK == 2 || iK == 3) {
                this.f26366D.b(o() && !R1());
                this.f26367E.b(o());
                return;
            } else if (iK != 4) {
                throw new IllegalStateException();
            }
        }
        this.f26366D.b(false);
        this.f26367E.b(false);
    }

    private B.e N1(int i10, q0 q0Var, int i11) {
        int i12;
        Object obj;
        U1.v vVar;
        Object obj2;
        int i13;
        long jO1;
        long jO12;
        G.b bVar = new G.b();
        if (q0Var.f27445a.q()) {
            i12 = i11;
            obj = null;
            vVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = q0Var.f27446b.f27812a;
            q0Var.f27445a.h(obj3, bVar);
            int i14 = bVar.f16823c;
            int iB = q0Var.f27445a.b(obj3);
            Object obj4 = q0Var.f27445a.n(i14, this.f17046a).f16844a;
            vVar = this.f17046a.f16846c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (q0Var.f27446b.b()) {
                r.b bVar2 = q0Var.f27446b;
                jO1 = bVar.b(bVar2.f27813b, bVar2.f27814c);
                jO12 = O1(q0Var);
            } else {
                jO1 = q0Var.f27446b.f27816e != -1 ? O1(this.f26433w0) : bVar.f16825e + bVar.f16824d;
                jO12 = jO1;
            }
        } else if (q0Var.f27446b.b()) {
            jO1 = q0Var.f27463s;
            jO12 = O1(q0Var);
        } else {
            jO1 = bVar.f16825e + q0Var.f27463s;
            jO12 = jO1;
        }
        long jU1 = X1.L.u1(jO1);
        long jU12 = X1.L.u1(jO12);
        r.b bVar3 = q0Var.f27446b;
        return new B.e(obj, i12, vVar, obj2, i13, jU1, jU12, bVar3.f27813b, bVar3.f27814c);
    }

    private void N2() {
        this.f26394d.b();
        if (Thread.currentThread() != Y().getThread()) {
            String strG = X1.L.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), Y().getThread().getName());
            if (this.f26415n0) {
                throw new IllegalStateException(strG);
            }
            X1.n.i("ExoPlayerImpl", strG, this.f26417o0 ? null : new IllegalStateException());
            this.f26417o0 = true;
        }
    }

    private static long O1(q0 q0Var) {
        G.c cVar = new G.c();
        G.b bVar = new G.b();
        q0Var.f27445a.h(q0Var.f27446b.f27812a, bVar);
        return q0Var.f27447c == -9223372036854775807L ? q0Var.f27445a.n(bVar.f16823c, cVar).c() : bVar.n() + q0Var.f27447c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void U1(U.e eVar) {
        long jT2;
        int i10 = this.f26374L - eVar.f26532c;
        this.f26374L = i10;
        boolean z10 = true;
        if (eVar.f26533d) {
            this.f26375M = eVar.f26534e;
            this.f26376N = true;
        }
        if (i10 == 0) {
            U1.G g10 = eVar.f26531b.f27445a;
            if (!this.f26433w0.f27445a.q() && g10.q()) {
                this.f26435x0 = -1;
                this.f26439z0 = 0L;
                this.f26437y0 = 0;
            }
            if (!g10.q()) {
                List<U1.G> listF = ((s0) g10).F();
                C1804a.g(listF.size() == this.f26416o.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    this.f26416o.get(i11).c(listF.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f26376N) {
                if (eVar.f26531b.f27446b.equals(this.f26433w0.f27446b) && eVar.f26531b.f27448d == this.f26433w0.f27463s) {
                    z10 = false;
                }
                if (z10) {
                    if (g10.q() || eVar.f26531b.f27446b.b()) {
                        jT2 = eVar.f26531b.f27448d;
                    } else {
                        q0 q0Var = eVar.f26531b;
                        jT2 = t2(g10, q0Var.f27446b, q0Var.f27448d);
                    }
                    j10 = jT2;
                }
            } else {
                z10 = false;
            }
            this.f26376N = false;
            J2(eVar.f26531b, 1, z10, this.f26375M, j10, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q1() {
        AudioManager audioManager;
        x0 x0Var;
        int i10 = X1.L.f18626a;
        if (i10 >= 35 && (x0Var = this.f26371I) != null) {
            return x0Var.b();
        }
        if (i10 < 23 || (audioManager = this.f26369G) == null) {
            return true;
        }
        return b.a(this.f26396e, audioManager.getDevices(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1(B.d dVar, U1.q qVar) {
        dVar.o0(this.f26398f, new B.c(qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(final U.e eVar) {
        this.f26404i.c(new Runnable() { // from class: androidx.media3.exoplayer.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f27876B.U1(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W1(B.d dVar) {
        dVar.j0(ExoPlaybackException.d(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(B.d dVar) {
        dVar.W(this.f26381S);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b2(q0 q0Var, int i10, B.d dVar) {
        dVar.H(q0Var.f27445a, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c2(int i10, B.e eVar, B.e eVar2, B.d dVar) {
        dVar.F(i10);
        dVar.U(eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e2(q0 q0Var, B.d dVar) {
        dVar.f0(q0Var.f27450f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f2(q0 q0Var, B.d dVar) {
        dVar.j0(q0Var.f27450f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g2(q0 q0Var, B.d dVar) {
        dVar.K(q0Var.f27453i.f47808d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i2(q0 q0Var, B.d dVar) {
        dVar.E(q0Var.f27451g);
        dVar.J(q0Var.f27451g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j2(q0 q0Var, B.d dVar) {
        dVar.Y(q0Var.f27456l, q0Var.f27449e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k2(q0 q0Var, B.d dVar) {
        dVar.N(q0Var.f27449e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l2(q0 q0Var, B.d dVar) {
        dVar.g0(q0Var.f27456l, q0Var.f27457m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m2(q0 q0Var, B.d dVar) {
        dVar.C(q0Var.f27458n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n2(q0 q0Var, B.d dVar) {
        dVar.p0(q0Var.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o2(q0 q0Var, B.d dVar) {
        dVar.x(q0Var.f27459o);
    }

    private q0 p2(q0 q0Var, U1.G g10, Pair<Object, Long> pair) {
        C1804a.a(g10.q() || pair != null);
        U1.G g11 = q0Var.f27445a;
        long jH1 = H1(q0Var);
        q0 q0VarJ = q0Var.j(g10);
        if (g10.q()) {
            r.b bVarL = q0.l();
            long jQ0 = X1.L.Q0(this.f26439z0);
            q0 q0VarC = q0VarJ.d(bVarL, jQ0, jQ0, jQ0, 0L, n2.x.f45675d, this.f26390b, AbstractC4009y.G()).c(bVarL);
            q0VarC.f27461q = q0VarC.f27463s;
            return q0VarC;
        }
        Object obj = q0VarJ.f27446b.f27812a;
        boolean zEquals = obj.equals(((Pair) X1.L.i(pair)).first);
        r.b bVar = !zEquals ? new r.b(pair.first) : q0VarJ.f27446b;
        long jLongValue = ((Long) pair.second).longValue();
        long jQ02 = X1.L.Q0(jH1);
        if (!g11.q()) {
            jQ02 -= g11.h(obj, this.f26414n).n();
        }
        if (!zEquals || jLongValue < jQ02) {
            C1804a.g(!bVar.b());
            q0 q0VarC2 = q0VarJ.d(bVar, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? n2.x.f45675d : q0VarJ.f27452h, !zEquals ? this.f26390b : q0VarJ.f27453i, !zEquals ? AbstractC4009y.G() : q0VarJ.f27454j).c(bVar);
            q0VarC2.f27461q = jLongValue;
            return q0VarC2;
        }
        if (jLongValue == jQ02) {
            int iB = g10.b(q0VarJ.f27455k.f27812a);
            if (iB == -1 || g10.f(iB, this.f26414n).f16823c != g10.h(bVar.f27812a, this.f26414n).f16823c) {
                g10.h(bVar.f27812a, this.f26414n);
                long jB = bVar.b() ? this.f26414n.b(bVar.f27813b, bVar.f27814c) : this.f26414n.f16824d;
                q0VarJ = q0VarJ.d(bVar, q0VarJ.f27463s, q0VarJ.f27463s, q0VarJ.f27448d, jB - q0VarJ.f27463s, q0VarJ.f27452h, q0VarJ.f27453i, q0VarJ.f27454j).c(bVar);
                q0VarJ.f27461q = jB;
            }
        } else {
            C1804a.g(!bVar.b());
            long jMax = Math.max(0L, q0VarJ.f27462r - (jLongValue - jQ02));
            long j10 = q0VarJ.f27461q;
            if (q0VarJ.f27455k.equals(q0VarJ.f27446b)) {
                j10 = jLongValue + jMax;
            }
            q0VarJ = q0VarJ.d(bVar, jLongValue, jLongValue, jLongValue, jMax, q0VarJ.f27452h, q0VarJ.f27453i, q0VarJ.f27454j);
            q0VarJ.f27461q = j10;
        }
        return q0VarJ;
    }

    private Pair<Object, Long> q2(U1.G g10, int i10, long j10) {
        if (g10.q()) {
            this.f26435x0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f26439z0 = j10;
            this.f26437y0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= g10.p()) {
            i10 = g10.a(this.f26373K);
            j10 = g10.n(i10, this.f17046a).b();
        }
        return g10.j(this.f17046a, this.f26414n, i10, X1.L.Q0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r2(final int i10, final int i11) {
        if (i10 == this.f26399f0.b() && i11 == this.f26399f0.a()) {
            return;
        }
        this.f26399f0 = new X1.A(i10, i11);
        this.f26410l.l(24, new C1816m.a() { // from class: androidx.media3.exoplayer.o
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((B.d) obj).k0(i10, i11);
            }
        });
        w2(2, 14, new X1.A(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(boolean z10) {
        if (!z10) {
            K2(this.f26433w0.f27456l, 1, 3);
            return;
        }
        q0 q0Var = this.f26433w0;
        if (q0Var.f27458n == 3) {
            K2(q0Var.f27456l, 1, 0);
        }
    }

    private long t2(U1.G g10, r.b bVar, long j10) {
        g10.h(bVar.f27812a, this.f26414n);
        return j10 + this.f26414n.n();
    }

    private void u2(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f26416o.remove(i12);
        }
        this.f26378P = this.f26378P.b(i10, i11);
    }

    private void v2() {
        if (this.f26389a0 != null) {
            F1(this.f26438z).n(10000).m(null).l();
            this.f26389a0.i(this.f26436y);
            this.f26389a0 = null;
        }
        TextureView textureView = this.f26393c0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f26436y) {
                X1.n.h("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f26393c0.setSurfaceTextureListener(null);
            }
            this.f26393c0 = null;
        }
        SurfaceHolder surfaceHolder = this.f26388Z;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f26436y);
            this.f26388Z = null;
        }
    }

    private void w2(int i10, int i11, Object obj) {
        for (t0 t0Var : this.f26400g) {
            if (i10 == -1 || t0Var.l() == i10) {
                F1(t0Var).n(i11).m(obj).l();
            }
        }
    }

    private List<p0.c> x1(int i10, List<androidx.media3.exoplayer.source.r> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            p0.c cVar = new p0.c(list.get(i11), this.f26418p);
            arrayList.add(cVar);
            this.f26416o.add(i11 + i10, new f(cVar.f27439b, cVar.f27438a));
        }
        this.f26378P = this.f26378P.f(i10, arrayList.size());
        return arrayList;
    }

    private void x2(int i10, Object obj) {
        w2(-1, i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public U1.x y1() {
        U1.G gX = X();
        if (gX.q()) {
            return this.f26431v0;
        }
        return this.f26431v0.a().L(gX.n(Q(), this.f17046a).f16846c.f17237e).J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y2() {
        w2(1, 2, Float.valueOf(this.f26409k0 * this.f26364B.h()));
    }

    @Override // U1.B
    public void A(final U1.J j10) {
        N2();
        if (!this.f26402h.h() || j10.equals(this.f26402h.c())) {
            return;
        }
        this.f26402h.m(j10);
        this.f26410l.l(19, new C1816m.a() { // from class: androidx.media3.exoplayer.y
            @Override // X1.C1816m.a
            public final void invoke(Object obj) {
                ((B.d) obj).b0(j10);
            }
        });
    }

    public void A1(SurfaceHolder surfaceHolder) {
        N2();
        if (surfaceHolder == null || surfaceHolder != this.f26388Z) {
            return;
        }
        z1();
    }

    public void A2(List<androidx.media3.exoplayer.source.r> list, boolean z10) {
        N2();
        B2(list, -1, -9223372036854775807L, z10);
    }

    @Override // U1.B
    public void C(B.d dVar) {
        this.f26410l.c((B.d) C1804a.e(dVar));
    }

    @Override // U1.B
    public void F(boolean z10) {
        N2();
        int iR = this.f26364B.r(z10, K());
        I2(z10, iR, K1(iR));
    }

    public void F2(SurfaceHolder surfaceHolder) {
        N2();
        if (surfaceHolder == null) {
            z1();
            return;
        }
        v2();
        this.f26391b0 = true;
        this.f26388Z = surfaceHolder;
        surfaceHolder.addCallback(this.f26436y);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            E2(null);
            r2(0, 0);
        } else {
            E2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            r2(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // U1.B
    public long G() {
        N2();
        return this.f26430v;
    }

    @Override // U1.B
    public void H(B.d dVar) {
        N2();
        this.f26410l.k((B.d) C1804a.e(dVar));
    }

    @Override // U1.B
    public long I() {
        N2();
        return H1(this.f26433w0);
    }

    @Override // U1.B
    public int K() {
        N2();
        return this.f26433w0.f27449e;
    }

    @Override // U1.B
    public U1.K L() {
        N2();
        return this.f26433w0.f27453i.f47808d;
    }

    @Override // U1.B
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException E() {
        N2();
        return this.f26433w0.f27450f;
    }

    @Override // U1.B
    public W1.b O() {
        N2();
        return this.f26413m0;
    }

    @Override // U1.B
    public int P() {
        N2();
        if (k()) {
            return this.f26433w0.f27446b.f27813b;
        }
        return -1;
    }

    @Override // U1.B
    public int Q() {
        N2();
        int iJ1 = J1(this.f26433w0);
        if (iJ1 == -1) {
            return 0;
        }
        return iJ1;
    }

    public boolean R1() {
        N2();
        return this.f26433w0.f27460p;
    }

    @Override // U1.B
    public void S(final int i10) {
        N2();
        if (this.f26372J != i10) {
            this.f26372J = i10;
            this.f26408k.j1(i10);
            this.f26410l.i(8, new C1816m.a() { // from class: androidx.media3.exoplayer.q
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).q(i10);
                }
            });
            H2();
            this.f26410l.f();
        }
    }

    @Override // U1.B
    public void T(SurfaceView surfaceView) {
        N2();
        A1(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // U1.B
    public int V() {
        N2();
        return this.f26433w0.f27458n;
    }

    @Override // U1.B
    public int W() {
        N2();
        return this.f26372J;
    }

    @Override // U1.B
    public U1.G X() {
        N2();
        return this.f26433w0.f27445a;
    }

    @Override // U1.B
    public Looper Y() {
        return this.f26424s;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void a(androidx.media3.exoplayer.source.r rVar, boolean z10) {
        N2();
        A2(Collections.singletonList(rVar), z10);
    }

    @Override // U1.B
    public boolean a0() {
        N2();
        return this.f26373K;
    }

    @Override // U1.B
    public long b() {
        N2();
        if (!k()) {
            return r();
        }
        q0 q0Var = this.f26433w0;
        r.b bVar = q0Var.f27446b;
        q0Var.f27445a.h(bVar.f27812a, this.f26414n);
        return X1.L.u1(this.f26414n.b(bVar.f27813b, bVar.f27814c));
    }

    @Override // U1.B
    public U1.J b0() {
        N2();
        return this.f26402h.c();
    }

    @Override // U1.B
    public void c() {
        X1.n.f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + X1.L.f18630e + "] [" + U1.w.b() + "]");
        N2();
        this.f26363A.b(false);
        v0 v0Var = this.f26365C;
        if (v0Var != null) {
            v0Var.g();
        }
        this.f26366D.b(false);
        this.f26367E.b(false);
        this.f26364B.k();
        if (!this.f26408k.x0()) {
            this.f26410l.l(10, new C1816m.a() { // from class: androidx.media3.exoplayer.p
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    H.W1((B.d) obj);
                }
            });
        }
        this.f26410l.j();
        this.f26404i.j(null);
        this.f26426t.a(this.f26422r);
        q0 q0Var = this.f26433w0;
        if (q0Var.f27460p) {
            this.f26433w0 = q0Var.a();
        }
        x0 x0Var = this.f26371I;
        if (x0Var != null && X1.L.f18626a >= 35) {
            x0Var.g();
        }
        q0 q0VarH = this.f26433w0.h(1);
        this.f26433w0 = q0VarH;
        q0 q0VarC = q0VarH.c(q0VarH.f27446b);
        this.f26433w0 = q0VarC;
        q0VarC.f27461q = q0VarC.f27463s;
        this.f26433w0.f27462r = 0L;
        this.f26422r.c();
        this.f26402h.j();
        v2();
        Surface surface = this.f26387Y;
        if (surface != null) {
            surface.release();
            this.f26387Y = null;
        }
        if (this.f26423r0) {
            ((PriorityTaskManager) C1804a.e(this.f26421q0)).c(this.f26419p0);
            this.f26423r0 = false;
        }
        this.f26413m0 = W1.b.f18333c;
        this.f26425s0 = true;
    }

    @Override // U1.B
    public long c0() {
        N2();
        if (this.f26433w0.f27445a.q()) {
            return this.f26439z0;
        }
        q0 q0Var = this.f26433w0;
        if (q0Var.f27455k.f27815d != q0Var.f27446b.f27815d) {
            return q0Var.f27445a.n(Q(), this.f17046a).d();
        }
        long j10 = q0Var.f27461q;
        if (this.f26433w0.f27455k.b()) {
            q0 q0Var2 = this.f26433w0;
            G.b bVarH = q0Var2.f27445a.h(q0Var2.f27455k.f27812a, this.f26414n);
            long jF = bVarH.f(this.f26433w0.f27455k.f27813b);
            j10 = jF == Long.MIN_VALUE ? bVarH.f16824d : jF;
        }
        q0 q0Var3 = this.f26433w0;
        return X1.L.u1(t2(q0Var3.f27445a, q0Var3.f27455k, j10));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void d(androidx.media3.exoplayer.source.r rVar) {
        N2();
        z2(Collections.singletonList(rVar));
    }

    @Override // U1.B
    public void e(U1.A a10) {
        N2();
        if (a10 == null) {
            a10 = U1.A.f16772d;
        }
        if (this.f26433w0.f27459o.equals(a10)) {
            return;
        }
        q0 q0VarG = this.f26433w0.g(a10);
        this.f26374L++;
        this.f26408k.g1(a10);
        J2(q0VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // U1.B
    public void f0(TextureView textureView) {
        N2();
        if (textureView == null) {
            z1();
            return;
        }
        v2();
        this.f26393c0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            X1.n.h("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f26436y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            E2(null);
            r2(0, 0);
        } else {
            D2(surfaceTexture);
            r2(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // U1.B
    public U1.A h() {
        N2();
        return this.f26433w0.f27459o;
    }

    @Override // U1.B
    public U1.x h0() {
        N2();
        return this.f26382T;
    }

    @Override // U1.B
    public void i() {
        N2();
        boolean zO = o();
        int iR = this.f26364B.r(zO, 2);
        I2(zO, iR, K1(iR));
        q0 q0Var = this.f26433w0;
        if (q0Var.f27449e != 1) {
            return;
        }
        q0 q0VarF = q0Var.f(null);
        q0 q0VarH = q0VarF.h(q0VarF.f27445a.q() ? 4 : 2);
        this.f26374L++;
        this.f26408k.v0();
        J2(q0VarH, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // U1.B
    public long i0() {
        N2();
        return X1.L.u1(I1(this.f26433w0));
    }

    @Override // U1.B
    public long j0() {
        N2();
        return this.f26428u;
    }

    @Override // U1.B
    public boolean k() {
        N2();
        return this.f26433w0.f27446b.b();
    }

    @Override // U1.B
    public long l() {
        N2();
        return X1.L.u1(this.f26433w0.f27462r);
    }

    @Override // U1.B
    public B.b n() {
        N2();
        return this.f26381S;
    }

    @Override // U1.B
    public boolean o() {
        N2();
        return this.f26433w0.f27456l;
    }

    @Override // U1.B
    public void p(final boolean z10) {
        N2();
        if (this.f26373K != z10) {
            this.f26373K = z10;
            this.f26408k.m1(z10);
            this.f26410l.i(9, new C1816m.a() { // from class: androidx.media3.exoplayer.x
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).S(z10);
                }
            });
            H2();
            this.f26410l.f();
        }
    }

    @Override // U1.AbstractC1731g
    public void p0(int i10, long j10, int i11, boolean z10) {
        N2();
        if (i10 == -1) {
            return;
        }
        C1804a.a(i10 >= 0);
        U1.G g10 = this.f26433w0.f27445a;
        if (g10.q() || i10 < g10.p()) {
            this.f26422r.R();
            this.f26374L++;
            if (k()) {
                X1.n.h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                U.e eVar = new U.e(this.f26433w0);
                eVar.b(1);
                this.f26406j.a(eVar);
                return;
            }
            q0 q0VarH = this.f26433w0;
            int i12 = q0VarH.f27449e;
            if (i12 == 3 || (i12 == 4 && !g10.q())) {
                q0VarH = this.f26433w0.h(2);
            }
            int iQ = Q();
            q0 q0VarP2 = p2(q0VarH, g10, q2(g10, i10, j10));
            this.f26408k.O0(g10, i10, X1.L.Q0(j10));
            J2(q0VarP2, 0, true, 1, I1(q0VarP2), iQ, z10);
        }
    }

    @Override // U1.B
    public long q() {
        N2();
        return this.f26432w;
    }

    @Override // U1.B
    public int s() {
        N2();
        if (this.f26433w0.f27445a.q()) {
            return this.f26437y0;
        }
        q0 q0Var = this.f26433w0;
        return q0Var.f27445a.b(q0Var.f27446b.f27812a);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        N2();
        w2(4, 15, imageOutput);
    }

    @Override // U1.B
    public void stop() {
        N2();
        this.f26364B.r(o(), 1);
        G2(null);
        this.f26413m0 = new W1.b(AbstractC4009y.G(), this.f26433w0.f27463s);
    }

    @Override // U1.B
    public void t(TextureView textureView) {
        N2();
        if (textureView == null || textureView != this.f26393c0) {
            return;
        }
        z1();
    }

    @Override // U1.B
    public U1.N u() {
        N2();
        return this.f26429u0;
    }

    public void v1(InterfaceC3131b interfaceC3131b) {
        this.f26422r.O((InterfaceC3131b) C1804a.e(interfaceC3131b));
    }

    @Override // U1.B
    public void w(List<U1.v> list, boolean z10) {
        N2();
        A2(E1(list), z10);
    }

    public void w1(ExoPlayer.a aVar) {
        this.f26412m.add(aVar);
    }

    @Override // U1.B
    public int y() {
        N2();
        if (k()) {
            return this.f26433w0.f27446b.f27814c;
        }
        return -1;
    }

    @Override // U1.B
    public void z(SurfaceView surfaceView) {
        N2();
        if (surfaceView instanceof t2.g) {
            v2();
            E2(surfaceView);
            C2(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof u2.l)) {
                F2(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            v2();
            this.f26389a0 = (u2.l) surfaceView;
            F1(this.f26438z).n(10000).m(this.f26389a0).l();
            this.f26389a0.d(this.f26436y);
            E2(this.f26389a0.getVideoSurface());
            C2(surfaceView.getHolder());
        }
    }

    public void z1() {
        N2();
        v2();
        E2(null);
        r2(0, 0);
    }

    public void z2(List<androidx.media3.exoplayer.source.r> list) {
        N2();
        A2(list, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerImpl.java */
    final class d implements androidx.media3.exoplayer.video.j, androidx.media3.exoplayer.audio.e, InterfaceC4201h, InterfaceC3895b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, C2122d.b, C2119a.b, v0.b, ExoPlayer.a {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Q(B.d dVar) {
            dVar.Z(H.this.f26382T);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void A(int i10, long j10, long j11) {
            H.this.f26422r.A(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void B(long j10, int i10) {
            H.this.f26422r.B(j10, i10);
        }

        @Override // u2.l.b
        public void C(Surface surface) {
            H.this.E2(null);
        }

        @Override // u2.l.b
        public void E(Surface surface) {
            H.this.E2(surface);
        }

        @Override // androidx.media3.exoplayer.v0.b
        public void F(final int i10, final boolean z10) {
            H.this.f26410l.l(30, new C1816m.a() { // from class: androidx.media3.exoplayer.N
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).X(i10, z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void G(boolean z10) {
            H.this.M2();
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void a(AudioSink.a aVar) {
            H.this.f26422r.a(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void b(AudioSink.a aVar) {
            H.this.f26422r.b(aVar);
        }

        @Override // androidx.media3.exoplayer.C2119a.b
        public void c() {
            H.this.I2(false, -1, 3);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void d(final U1.N n10) {
            H.this.f26429u0 = n10;
            H.this.f26410l.l(25, new C1816m.a() { // from class: androidx.media3.exoplayer.M
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).d(n10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void e(final boolean z10) {
            if (H.this.f26411l0 == z10) {
                return;
            }
            H.this.f26411l0 = z10;
            H.this.f26410l.l(23, new C1816m.a() { // from class: androidx.media3.exoplayer.O
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).e(z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void f(Exception exc) {
            H.this.f26422r.f(exc);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void g(String str) {
            H.this.f26422r.g(str);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void h(String str, long j10, long j11) {
            H.this.f26422r.h(str, j10, j11);
        }

        @Override // p2.InterfaceC4201h
        public void i(final W1.b bVar) {
            H.this.f26413m0 = bVar;
            H.this.f26410l.l(27, new C1816m.a() { // from class: androidx.media3.exoplayer.I
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).i(bVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.j
        public void j(C3030b c3030b) {
            H.this.f26422r.j(c3030b);
            H.this.f26384V = null;
            H.this.f26401g0 = null;
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void k(String str) {
            H.this.f26422r.k(str);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void l(String str, long j10, long j11) {
            H.this.f26422r.l(str, j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void m(int i10, long j10) {
            H.this.f26422r.m(i10, j10);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void n(C3030b c3030b) {
            H.this.f26403h0 = c3030b;
            H.this.f26422r.n(c3030b);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void o(C3030b c3030b) {
            H.this.f26422r.o(c3030b);
            H.this.f26385W = null;
            H.this.f26403h0 = null;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            H.this.D2(surfaceTexture);
            H.this.r2(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            H.this.E2(null);
            H.this.r2(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            H.this.r2(i10, i11);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void p(Object obj, long j10) {
            H.this.f26422r.p(obj, j10);
            if (H.this.f26386X == obj) {
                H.this.f26410l.l(26, new C1816m.a() { // from class: d2.B
                    @Override // X1.C1816m.a
                    public final void invoke(Object obj2) {
                        ((B.d) obj2).d0();
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.C2122d.b
        public void q(float f10) {
            H.this.y2();
        }

        @Override // androidx.media3.exoplayer.video.j
        public void r(U1.s sVar, C3031c c3031c) {
            H.this.f26384V = sVar;
            H.this.f26422r.r(sVar, c3031c);
        }

        @Override // p2.InterfaceC4201h
        public void s(final List<W1.a> list) {
            H.this.f26410l.l(27, new C1816m.a() { // from class: androidx.media3.exoplayer.L
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).s(list);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            H.this.r2(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (H.this.f26391b0) {
                H.this.E2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (H.this.f26391b0) {
                H.this.E2(null);
            }
            H.this.r2(0, 0);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void t(long j10) {
            H.this.f26422r.t(j10);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void u(U1.s sVar, C3031c c3031c) {
            H.this.f26385W = sVar;
            H.this.f26422r.u(sVar, c3031c);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void v(Exception exc) {
            H.this.f26422r.v(exc);
        }

        @Override // androidx.media3.exoplayer.video.j
        public void w(Exception exc) {
            H.this.f26422r.w(exc);
        }

        @Override // androidx.media3.exoplayer.C2122d.b
        public void x(int i10) {
            H.this.I2(H.this.o(), i10, H.K1(i10));
        }

        @Override // androidx.media3.exoplayer.video.j
        public void y(C3030b c3030b) {
            H.this.f26401g0 = c3030b;
            H.this.f26422r.y(c3030b);
        }

        @Override // l2.InterfaceC3895b
        public void z(final U1.y yVar) {
            H h10 = H.this;
            h10.f26431v0 = h10.f26431v0.a().M(yVar).J();
            U1.x xVarY1 = H.this.y1();
            if (!xVarY1.equals(H.this.f26382T)) {
                H.this.f26382T = xVarY1;
                H.this.f26410l.i(14, new C1816m.a() { // from class: androidx.media3.exoplayer.J
                    @Override // X1.C1816m.a
                    public final void invoke(Object obj) {
                        this.f26450a.Q((B.d) obj);
                    }
                });
            }
            H.this.f26410l.i(28, new C1816m.a() { // from class: androidx.media3.exoplayer.K
                @Override // X1.C1816m.a
                public final void invoke(Object obj) {
                    ((B.d) obj).z(yVar);
                }
            });
            H.this.f26410l.f();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
