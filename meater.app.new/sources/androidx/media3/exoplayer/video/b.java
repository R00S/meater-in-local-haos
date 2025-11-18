package androidx.media3.exoplayer.video;

import U1.G;
import U1.N;
import U1.s;
import U1.z;
import X1.A;
import X1.C1804a;
import X1.F;
import X1.L;
import X1.n;
import X1.q;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.mediacodec.l;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.c;
import androidx.media3.exoplayer.video.h;
import androidx.media3.exoplayer.video.j;
import com.apptionlabs.meater_app.data.Config;
import d2.C3025C;
import d2.C3030b;
import d2.C3031c;
import java.nio.ByteBuffer;
import java.util.List;
import m8.AbstractC4009y;
import t2.C4539b;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes.dex */
public class b extends MediaCodecRenderer implements h.b {

    /* renamed from: Q1, reason: collision with root package name */
    private static final int[] f27894Q1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: R1, reason: collision with root package name */
    private static boolean f27895R1;

    /* renamed from: S1, reason: collision with root package name */
    private static boolean f27896S1;

    /* renamed from: A1, reason: collision with root package name */
    private int f27897A1;

    /* renamed from: B1, reason: collision with root package name */
    private int f27898B1;

    /* renamed from: C1, reason: collision with root package name */
    private int f27899C1;

    /* renamed from: D1, reason: collision with root package name */
    private long f27900D1;

    /* renamed from: E1, reason: collision with root package name */
    private int f27901E1;

    /* renamed from: F1, reason: collision with root package name */
    private long f27902F1;

    /* renamed from: G1, reason: collision with root package name */
    private N f27903G1;

    /* renamed from: H1, reason: collision with root package name */
    private N f27904H1;

    /* renamed from: I1, reason: collision with root package name */
    private int f27905I1;

    /* renamed from: J1, reason: collision with root package name */
    private boolean f27906J1;

    /* renamed from: K1, reason: collision with root package name */
    private int f27907K1;

    /* renamed from: L1, reason: collision with root package name */
    e f27908L1;

    /* renamed from: M1, reason: collision with root package name */
    private t2.h f27909M1;

    /* renamed from: N1, reason: collision with root package name */
    private long f27910N1;

    /* renamed from: O1, reason: collision with root package name */
    private long f27911O1;

    /* renamed from: P1, reason: collision with root package name */
    private boolean f27912P1;

    /* renamed from: g1, reason: collision with root package name */
    private final Context f27913g1;

    /* renamed from: h1, reason: collision with root package name */
    private final boolean f27914h1;

    /* renamed from: i1, reason: collision with root package name */
    private final j.a f27915i1;

    /* renamed from: j1, reason: collision with root package name */
    private final int f27916j1;

    /* renamed from: k1, reason: collision with root package name */
    private final boolean f27917k1;

    /* renamed from: l1, reason: collision with root package name */
    private final h f27918l1;

    /* renamed from: m1, reason: collision with root package name */
    private final h.a f27919m1;

    /* renamed from: n1, reason: collision with root package name */
    private d f27920n1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f27921o1;

    /* renamed from: p1, reason: collision with root package name */
    private boolean f27922p1;

    /* renamed from: q1, reason: collision with root package name */
    private VideoSink f27923q1;

    /* renamed from: r1, reason: collision with root package name */
    private boolean f27924r1;

    /* renamed from: s1, reason: collision with root package name */
    private List<Object> f27925s1;

    /* renamed from: t1, reason: collision with root package name */
    private Surface f27926t1;

    /* renamed from: u1, reason: collision with root package name */
    private C4539b f27927u1;

    /* renamed from: v1, reason: collision with root package name */
    private A f27928v1;

    /* renamed from: w1, reason: collision with root package name */
    private boolean f27929w1;

    /* renamed from: x1, reason: collision with root package name */
    private int f27930x1;

    /* renamed from: y1, reason: collision with root package name */
    private int f27931y1;

    /* renamed from: z1, reason: collision with root package name */
    private long f27932z1;

    /* compiled from: MediaCodecVideoRenderer.java */
    /* renamed from: androidx.media3.exoplayer.video.b$b, reason: collision with other inner class name */
    class C0383b implements VideoSink.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.exoplayer.mediacodec.h f27934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27936c;

        C0383b(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
            this.f27934a = hVar;
            this.f27935b = i10;
            this.f27936c = j10;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void a(long j10) {
            b.this.M2(this.f27934a, this.f27935b, this.f27936c, j10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void b() {
            b.this.Z2(this.f27934a, this.f27935b, this.f27936c);
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    protected static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f27938a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27939b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27940c;

        public d(int i10, int i11, int i12) {
            this.f27938a = i10;
            this.f27939b = i11;
            this.f27940c = i12;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    private final class e implements h.d, Handler.Callback {

        /* renamed from: B, reason: collision with root package name */
        private final Handler f27941B;

        public e(androidx.media3.exoplayer.mediacodec.h hVar) {
            Handler handlerB = L.B(this);
            this.f27941B = handlerB;
            hVar.g(this, handlerB);
        }

        private void b(long j10) {
            b bVar = b.this;
            if (this != bVar.f27908L1 || bVar.P0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                b.this.I2();
                return;
            }
            try {
                b.this.H2(j10);
            } catch (ExoPlaybackException e10) {
                b.this.N1(e10);
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.d
        public void a(androidx.media3.exoplayer.mediacodec.h hVar, long j10, long j11) {
            if (L.f18626a >= 30) {
                b(j10);
            } else {
                this.f27941B.sendMessageAtFrontOfQueue(Message.obtain(this.f27941B, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(L.r1(message.arg1, message.arg2));
            return true;
        }
    }

    public b(Context context, h.b bVar, l lVar, long j10, boolean z10, Handler handler, j jVar, int i10) {
        this(context, bVar, lVar, j10, z10, handler, jVar, i10, 30.0f);
    }

    private void A2(N n10) {
        if (n10.equals(N.f16982e) || n10.equals(this.f27904H1)) {
            return;
        }
        this.f27904H1 = n10;
        this.f27915i1.D(n10);
    }

    private void B2() {
        Surface surface = this.f27926t1;
        if (surface == null || !this.f27929w1) {
            return;
        }
        this.f27915i1.A(surface);
    }

    private void C2() {
        N n10 = this.f27904H1;
        if (n10 != null) {
            this.f27915i1.D(n10);
        }
    }

    private void D2(MediaFormat mediaFormat) {
        if (this.f27923q1 == null || L.G0(this.f27913g1)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void E2() {
        int i10;
        androidx.media3.exoplayer.mediacodec.h hVarP0;
        if (!this.f27906J1 || (i10 = L.f18626a) < 23 || (hVarP0 = P0()) == null) {
            return;
        }
        this.f27908L1 = new e(hVarP0);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            hVarP0.b(bundle);
        }
    }

    private void F2(long j10, long j11, s sVar) {
        t2.h hVar = this.f27909M1;
        if (hVar != null) {
            hVar.h(j10, j11, sVar, U0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2() {
        this.f27915i1.A(this.f27926t1);
        this.f27929w1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        M1();
    }

    private void K2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, s sVar) {
        long jG = this.f27919m1.g();
        long jF = this.f27919m1.f();
        if (W2() && jG == this.f27902F1) {
            Z2(hVar, i10, j10);
        } else {
            F2(j10, jG, sVar);
            N2(hVar, i10, j10, jG);
        }
        e3(jF);
        this.f27902F1 = jG;
    }

    private void L2() {
        C4539b c4539b = this.f27927u1;
        if (c4539b != null) {
            c4539b.release();
            this.f27927u1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        N2(hVar, i10, j10, j11);
    }

    private static void O2(androidx.media3.exoplayer.mediacodec.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.b(bundle);
    }

    private void P2(Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f27926t1 == surface) {
            if (surface != null) {
                C2();
                B2();
                return;
            }
            return;
        }
        this.f27926t1 = surface;
        if (this.f27923q1 == null) {
            this.f27918l1.q(surface);
        }
        this.f27929w1 = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.h hVarP0 = P0();
        if (hVarP0 != null && this.f27923q1 == null) {
            androidx.media3.exoplayer.mediacodec.j jVar = (androidx.media3.exoplayer.mediacodec.j) C1804a.e(R0());
            boolean zT2 = t2(jVar);
            if (L.f18626a < 23 || !zT2 || this.f27921o1) {
                E1();
                n1();
            } else {
                Q2(hVarP0, s2(jVar));
            }
        }
        if (surface != null) {
            C2();
            if (state == 2) {
                VideoSink videoSink = this.f27923q1;
                if (videoSink != null) {
                    videoSink.u(true);
                } else {
                    this.f27918l1.e(true);
                }
            }
        } else {
            this.f27904H1 = null;
            VideoSink videoSink2 = this.f27923q1;
            if (videoSink2 != null) {
                videoSink2.n();
            }
        }
        E2();
    }

    private void Q2(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        int i10 = L.f18626a;
        if (i10 >= 23 && surface != null) {
            R2(hVar, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            g2(hVar);
        }
    }

    private boolean Y2(androidx.media3.exoplayer.mediacodec.j jVar) {
        return L.f18626a >= 23 && !this.f27906J1 && !f2(jVar.f27394a) && (!jVar.f27400g || C4539b.b(this.f27913g1));
    }

    private static int a3(Context context, l lVar, s sVar) {
        boolean z10;
        int i10 = 0;
        if (!z.s(sVar.f17162o)) {
            return u0.G(0);
        }
        boolean z11 = sVar.f17166s != null;
        List<androidx.media3.exoplayer.mediacodec.j> listO2 = o2(context, lVar, sVar, z11, false);
        if (z11 && listO2.isEmpty()) {
            listO2 = o2(context, lVar, sVar, false, false);
        }
        if (listO2.isEmpty()) {
            return u0.G(1);
        }
        if (!MediaCodecRenderer.V1(sVar)) {
            return u0.G(2);
        }
        androidx.media3.exoplayer.mediacodec.j jVar = listO2.get(0);
        boolean zN = jVar.n(sVar);
        if (zN) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listO2.size(); i11++) {
                androidx.media3.exoplayer.mediacodec.j jVar2 = listO2.get(i11);
                if (jVar2.n(sVar)) {
                    z10 = false;
                    zN = true;
                    jVar = jVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zN ? 4 : 3;
        int i13 = jVar.q(sVar) ? 16 : 8;
        int i14 = jVar.f27401h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (L.f18626a >= 26 && "video/dolby-vision".equals(sVar.f17162o) && !c.a(context)) {
            i15 = 256;
        }
        if (zN) {
            List<androidx.media3.exoplayer.mediacodec.j> listO22 = o2(context, lVar, sVar, z11, true);
            if (!listO22.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.j jVar3 = MediaCodecUtil.m(listO22, sVar).get(0);
                if (jVar3.n(sVar) && jVar3.q(sVar)) {
                    i10 = 32;
                }
            }
        }
        return u0.w(i12, i13, i10, i14, i15);
    }

    private void b3() {
        androidx.media3.exoplayer.mediacodec.h hVarP0 = P0();
        if (hVarP0 != null && L.f18626a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f27905I1));
            hVarP0.b(bundle);
        }
    }

    private void d3(r.b bVar) {
        G gE0 = e0();
        if (gE0.q()) {
            this.f27911O1 = -9223372036854775807L;
        } else {
            this.f27911O1 = gE0.h(((r.b) C1804a.e(bVar)).f27812a, new G.b()).j();
        }
    }

    private static boolean h2() {
        return "NVIDIA".equals(L.f18628c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean j2() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.b.j2():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int l2(androidx.media3.exoplayer.mediacodec.j r10, U1.s r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.b.l2(androidx.media3.exoplayer.mediacodec.j, U1.s):int");
    }

    private static Point m2(androidx.media3.exoplayer.mediacodec.j jVar, s sVar) {
        int i10 = sVar.f17170w;
        int i11 = sVar.f17169v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f27894Q1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = jVar.c(i15, i13);
            float f11 = sVar.f17171x;
            if (pointC != null && jVar.t(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    private static List<androidx.media3.exoplayer.mediacodec.j> o2(Context context, l lVar, s sVar, boolean z10, boolean z11) {
        String str = sVar.f17162o;
        if (str == null) {
            return AbstractC4009y.G();
        }
        if (L.f18626a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<androidx.media3.exoplayer.mediacodec.j> listF = MediaCodecUtil.f(lVar, sVar, z10, z11);
            if (!listF.isEmpty()) {
                return listF;
            }
        }
        return MediaCodecUtil.l(lVar, sVar, z10, z11);
    }

    protected static int p2(androidx.media3.exoplayer.mediacodec.j jVar, s sVar) {
        if (sVar.f17163p == -1) {
            return l2(jVar, sVar);
        }
        int size = sVar.f17165r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += sVar.f17165r.get(i10).length;
        }
        return sVar.f17163p + length;
    }

    private static int q2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private Surface s2(androidx.media3.exoplayer.mediacodec.j jVar) {
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            return videoSink.a();
        }
        Surface surface = this.f27926t1;
        if (surface != null) {
            return surface;
        }
        if (X2(jVar)) {
            return null;
        }
        C1804a.g(Y2(jVar));
        C4539b c4539b = this.f27927u1;
        if (c4539b != null && c4539b.f49826B != jVar.f27400g) {
            L2();
        }
        if (this.f27927u1 == null) {
            this.f27927u1 = C4539b.c(this.f27913g1, jVar.f27400g);
        }
        return this.f27927u1;
    }

    private boolean t2(androidx.media3.exoplayer.mediacodec.j jVar) {
        Surface surface = this.f27926t1;
        return (surface != null && surface.isValid()) || X2(jVar) || Y2(jVar);
    }

    private boolean u2(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.f26295G < a0();
    }

    private boolean v2(DecoderInputBuffer decoderInputBuffer) {
        if (p() || decoderInputBuffer.z() || this.f27911O1 == -9223372036854775807L) {
            return true;
        }
        return this.f27911O1 - (decoderInputBuffer.f26295G - Z0()) <= 100000;
    }

    private void x2() {
        if (this.f27897A1 > 0) {
            long jC = W().c();
            this.f27915i1.n(this.f27897A1, jC - this.f27932z1);
            this.f27897A1 = 0;
            this.f27932z1 = jC;
        }
    }

    private void y2() {
        if (!this.f27918l1.i() || this.f27926t1 == null) {
            return;
        }
        G2();
    }

    private void z2() {
        int i10 = this.f27901E1;
        if (i10 != 0) {
            this.f27915i1.B(this.f27900D1, i10);
            this.f27900D1 = 0L;
            this.f27901E1 = 0;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(long j10, long j11, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, s sVar) throws ExoPlaybackException {
        C1804a.e(hVar);
        long jZ0 = j12 - Z0();
        if (this.f27923q1 != null) {
            try {
                return this.f27923q1.x(j12 + k2(), z11, j10, j11, new C0383b(hVar, i10, jZ0));
            } catch (VideoSink.VideoSinkException e10) {
                throw U(e10, e10.f27889B, 7001);
            }
        }
        int iC = this.f27918l1.c(j12, j10, j11, a1(), z11, this.f27919m1);
        if (iC == 4) {
            return false;
        }
        if (z10 && !z11) {
            Z2(hVar, i10, jZ0);
            return true;
        }
        if (this.f27926t1 == null) {
            if (this.f27919m1.f() >= Config.MC_STATS_INTERVAL) {
                return false;
            }
            Z2(hVar, i10, jZ0);
            e3(this.f27919m1.f());
            return true;
        }
        if (iC == 0) {
            long jB = W().b();
            F2(jZ0, jB, sVar);
            M2(hVar, i10, jZ0, jB);
            e3(this.f27919m1.f());
            return true;
        }
        if (iC == 1) {
            K2((androidx.media3.exoplayer.mediacodec.h) C1804a.i(hVar), i10, jZ0, sVar);
            return true;
        }
        if (iC == 2) {
            i2(hVar, i10, jZ0);
            e3(this.f27919m1.f());
            return true;
        }
        if (iC != 3) {
            if (iC == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iC));
        }
        Z2(hVar, i10, jZ0);
        e3(this.f27919m1.f());
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public void D(float f10, float f11) throws ExoPlaybackException {
        super.D(f10, f11);
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.k(f10);
        } else {
            this.f27918l1.r(f10);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException D0(Throwable th, androidx.media3.exoplayer.mediacodec.j jVar) {
        return new MediaCodecVideoDecoderException(th, jVar, this.f27926t1);
    }

    @Override // androidx.media3.exoplayer.video.h.b
    public boolean E(long j10, long j11, boolean z10) {
        return U2(j10, j11, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void G1() {
        super.G1();
        this.f27899C1 = 0;
    }

    protected void H2(long j10) {
        Y1(j10);
        A2(this.f27903G1);
        this.f27292a1.f39695e++;
        y2();
        v1(j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.r0.b
    public void J(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            P2(obj);
            return;
        }
        if (i10 == 7) {
            t2.h hVar = (t2.h) C1804a.e(obj);
            this.f27909M1 = hVar;
            VideoSink videoSink = this.f27923q1;
            if (videoSink != null) {
                videoSink.w(hVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) C1804a.e(obj)).intValue();
            if (this.f27907K1 != iIntValue) {
                this.f27907K1 = iIntValue;
                if (this.f27906J1) {
                    E1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.f27905I1 = ((Integer) C1804a.e(obj)).intValue();
            b3();
            return;
        }
        if (i10 == 4) {
            this.f27930x1 = ((Integer) C1804a.e(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.h hVarP0 = P0();
            if (hVarP0 != null) {
                hVarP0.n(this.f27930x1);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) C1804a.e(obj)).intValue();
            this.f27931y1 = iIntValue2;
            VideoSink videoSink2 = this.f27923q1;
            if (videoSink2 != null) {
                videoSink2.h(iIntValue2);
                return;
            } else {
                this.f27918l1.n(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            S2((List) C1804a.e(obj));
            return;
        }
        if (i10 != 14) {
            super.J(i10, obj);
            return;
        }
        A a10 = (A) C1804a.e(obj);
        if (a10.b() == 0 || a10.a() == 0) {
            return;
        }
        this.f27928v1 = a10;
        VideoSink videoSink3 = this.f27923q1;
        if (videoSink3 != null) {
            videoSink3.A((Surface) C1804a.i(this.f27926t1), a10);
        }
    }

    protected void N2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        F.a("releaseOutputBuffer");
        hVar.j(i10, j11);
        F.b();
        this.f27292a1.f39695e++;
        this.f27898B1 = 0;
        if (this.f27923q1 == null) {
            A2(this.f27903G1);
            y2();
        }
    }

    @Override // androidx.media3.exoplayer.video.h.b
    public boolean O(long j10, long j11) {
        return V2(j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int Q0(DecoderInputBuffer decoderInputBuffer) {
        return (L.f18626a >= 34 && this.f27906J1 && u2(decoderInputBuffer)) ? 32 : 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean Q1(androidx.media3.exoplayer.mediacodec.j jVar) {
        return t2(jVar);
    }

    protected void R2(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        hVar.p(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean S0() {
        return this.f27906J1 && L.f18626a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean S1(DecoderInputBuffer decoderInputBuffer) {
        if (!decoderInputBuffer.A() || v2(decoderInputBuffer) || decoderInputBuffer.F()) {
            return false;
        }
        return u2(decoderInputBuffer);
    }

    public void S2(List<Object> list) {
        this.f27925s1 = list;
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.r(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float T0(float f10, s sVar, s[] sVarArr) {
        float fMax = -1.0f;
        for (s sVar2 : sVarArr) {
            float f11 = sVar2.f17171x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected boolean T2(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int U1(l lVar, s sVar) {
        return a3(this.f27913g1, lVar, sVar);
    }

    protected boolean U2(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<androidx.media3.exoplayer.mediacodec.j> V0(l lVar, s sVar, boolean z10) {
        return MediaCodecUtil.m(o2(this.f27913g1, lVar, sVar, z10, this.f27906J1), sVar);
    }

    protected boolean V2(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    protected boolean W2() {
        return true;
    }

    protected boolean X2(androidx.media3.exoplayer.mediacodec.j jVar) {
        return L.f18626a >= 35 && jVar.f27404k;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected h.a Y0(androidx.media3.exoplayer.mediacodec.j jVar, s sVar, MediaCrypto mediaCrypto, float f10) {
        String str = jVar.f27396c;
        d dVarN2 = n2(jVar, sVar, c0());
        this.f27920n1 = dVarN2;
        MediaFormat mediaFormatR2 = r2(sVar, str, dVarN2, f10, this.f27917k1, this.f27906J1 ? this.f27907K1 : 0);
        Surface surfaceS2 = s2(jVar);
        D2(mediaFormatR2);
        return h.a.b(jVar, mediaFormatR2, sVar, surfaceS2, mediaCrypto);
    }

    protected void Z2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        F.a("skipVideoBuffer");
        hVar.m(i10, false);
        F.b();
        this.f27292a1.f39696f++;
    }

    protected void c3(int i10, int i11) {
        C3030b c3030b = this.f27292a1;
        c3030b.f39698h += i10;
        int i12 = i10 + i11;
        c3030b.f39697g += i12;
        this.f27897A1 += i12;
        int i13 = this.f27898B1 + i12;
        this.f27898B1 = i13;
        c3030b.f39699i = Math.max(i13, c3030b.f39699i);
        int i14 = this.f27916j1;
        if (i14 <= 0 || this.f27897A1 < i14) {
            return;
        }
        x2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public boolean d() {
        VideoSink videoSink;
        return super.d() && ((videoSink = this.f27923q1) == null || videoSink.d());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void d1(DecoderInputBuffer decoderInputBuffer) {
        if (this.f27922p1) {
            ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(decoderInputBuffer.f26296H);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        O2((androidx.media3.exoplayer.mediacodec.h) C1804a.e(P0()), bArr);
                    }
                }
            }
        }
    }

    protected void e3(long j10) {
        this.f27292a1.a(j10);
        this.f27900D1 += j10;
        this.f27901E1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public boolean f() {
        boolean zF = super.f();
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            return videoSink.v(zF);
        }
        if (zF && (P0() == null || this.f27926t1 == null || this.f27906J1)) {
            return true;
        }
        return this.f27918l1.d(zF);
    }

    protected boolean f2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (b.class) {
            try {
                if (!f27895R1) {
                    f27896S1 = j2();
                    f27895R1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f27896S1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void g0() {
        this.f27904H1 = null;
        this.f27911O1 = -9223372036854775807L;
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.g();
        } else {
            this.f27918l1.g();
        }
        E2();
        this.f27929w1 = false;
        this.f27908L1 = null;
        try {
            super.g0();
        } finally {
            this.f27915i1.m(this.f27292a1);
            this.f27915i1.D(N.f16982e);
        }
    }

    protected void g2(androidx.media3.exoplayer.mediacodec.h hVar) {
        hVar.i();
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void h0(boolean z10, boolean z11) {
        super.h0(z10, z11);
        boolean z12 = X().f39675b;
        C1804a.g((z12 && this.f27907K1 == 0) ? false : true);
        if (this.f27906J1 != z12) {
            this.f27906J1 = z12;
            E1();
        }
        this.f27915i1.o(this.f27292a1);
        if (!this.f27924r1) {
            if (this.f27925s1 != null && this.f27923q1 == null) {
                this.f27923q1 = new c.b(this.f27913g1, this.f27918l1).g(W()).f().A();
            }
            this.f27924r1 = true;
        }
        VideoSink videoSink = this.f27923q1;
        if (videoSink == null) {
            this.f27918l1.o(W());
            this.f27918l1.h(z11);
            return;
        }
        videoSink.y(new a(), com.google.common.util.concurrent.g.a());
        t2.h hVar = this.f27909M1;
        if (hVar != null) {
            this.f27923q1.w(hVar);
        }
        if (this.f27926t1 != null && !this.f27928v1.equals(A.f18608c)) {
            this.f27923q1.A(this.f27926t1, this.f27928v1);
        }
        this.f27923q1.h(this.f27931y1);
        this.f27923q1.k(b1());
        List<Object> list = this.f27925s1;
        if (list != null) {
            this.f27923q1.r(list);
        }
        this.f27923q1.z(z11);
    }

    @Override // androidx.media3.exoplayer.t0
    public void i() {
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.i();
        } else {
            this.f27918l1.a();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void i0() {
        super.i0();
    }

    protected void i2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        F.a("dropVideoBuffer");
        hVar.m(i10, false);
        F.b();
        c3(0, 1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public void j(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        super.j(j10, j11);
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            try {
                videoSink.j(j10, j11);
            } catch (VideoSink.VideoSinkException e10) {
                throw U(e10, e10.f27889B, 7001);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.p(true);
            this.f27923q1.m(a1(), Z0(), k2(), a0());
            this.f27912P1 = true;
        }
        super.j0(j10, z10);
        if (this.f27923q1 == null) {
            this.f27918l1.m();
        }
        if (z10) {
            VideoSink videoSink2 = this.f27923q1;
            if (videoSink2 != null) {
                videoSink2.u(false);
            } else {
                this.f27918l1.e(false);
            }
        }
        E2();
        this.f27898B1 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void k0() {
        super.k0();
        VideoSink videoSink = this.f27923q1;
        if (videoSink == null || !this.f27914h1) {
            return;
        }
        videoSink.c();
    }

    protected long k2() {
        return -this.f27910N1;
    }

    @Override // androidx.media3.exoplayer.video.h.b
    public boolean m(long j10, long j11, long j12, boolean z10, boolean z11) {
        return T2(j10, j12, z10) && w2(j11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void m0() {
        try {
            super.m0();
        } finally {
            this.f27924r1 = false;
            this.f27910N1 = -9223372036854775807L;
            L2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void n0() {
        super.n0();
        this.f27897A1 = 0;
        this.f27932z1 = W().c();
        this.f27900D1 = 0L;
        this.f27901E1 = 0;
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.f();
        } else {
            this.f27918l1.k();
        }
    }

    protected d n2(androidx.media3.exoplayer.mediacodec.j jVar, s sVar, s[] sVarArr) {
        int iL2;
        int iMax = sVar.f17169v;
        int iMax2 = sVar.f17170w;
        int iP2 = p2(jVar, sVar);
        if (sVarArr.length == 1) {
            if (iP2 != -1 && (iL2 = l2(jVar, sVar)) != -1) {
                iP2 = Math.min((int) (iP2 * 1.5f), iL2);
            }
            return new d(iMax, iMax2, iP2);
        }
        int length = sVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            s sVarM = sVarArr[i10];
            if (sVar.f17136C != null && sVarM.f17136C == null) {
                sVarM = sVarM.b().S(sVar.f17136C).M();
            }
            if (jVar.e(sVar, sVarM).f39706d != 0) {
                int i11 = sVarM.f17169v;
                z10 |= i11 == -1 || sVarM.f17170w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, sVarM.f17170w);
                iP2 = Math.max(iP2, p2(jVar, sVarM));
            }
        }
        if (z10) {
            n.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointM2 = m2(jVar, sVar);
            if (pointM2 != null) {
                iMax = Math.max(iMax, pointM2.x);
                iMax2 = Math.max(iMax2, pointM2.y);
                iP2 = Math.max(iP2, l2(jVar, sVar.b().z0(iMax).c0(iMax2).M()));
                n.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new d(iMax, iMax2, iP2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void o0() {
        x2();
        z2();
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.q();
        } else {
            this.f27918l1.l();
        }
        super.o0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void p0(s[] sVarArr, long j10, long j11, r.b bVar) {
        super.p0(sVarArr, j10, j11, bVar);
        if (this.f27910N1 == -9223372036854775807L) {
            this.f27910N1 = j10;
        }
        d3(bVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(Exception exc) {
        n.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f27915i1.C(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1(String str, h.a aVar, long j10, long j11) {
        this.f27915i1.k(str, j10, j11);
        this.f27921o1 = f2(str);
        this.f27922p1 = ((androidx.media3.exoplayer.mediacodec.j) C1804a.e(R0())).o();
        E2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(String str) {
        this.f27915i1.l(str);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat r2(s sVar, String str, d dVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairH;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", sVar.f17169v);
        mediaFormat.setInteger("height", sVar.f17170w);
        q.e(mediaFormat, sVar.f17165r);
        q.c(mediaFormat, "frame-rate", sVar.f17171x);
        q.d(mediaFormat, "rotation-degrees", sVar.f17172y);
        q.b(mediaFormat, sVar.f17136C);
        if ("video/dolby-vision".equals(sVar.f17162o) && (pairH = MediaCodecUtil.h(sVar)) != null) {
            q.d(mediaFormat, "profile", ((Integer) pairH.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f27938a);
        mediaFormat.setInteger("max-height", dVar.f27939b);
        q.d(mediaFormat, "max-input-size", dVar.f27940c);
        int i11 = L.f18626a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f27905I1));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C3031c s1(C3025C c3025c) throws ExoPlaybackException {
        C3031c c3031cS1 = super.s1(c3025c);
        this.f27915i1.p((s) C1804a.e(c3025c.f39668b), c3031cS1);
        return c3031cS1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(s sVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        androidx.media3.exoplayer.mediacodec.h hVarP0 = P0();
        if (hVarP0 != null) {
            hVarP0.n(this.f27930x1);
        }
        if (this.f27906J1) {
            i10 = sVar.f17169v;
            integer = sVar.f17170w;
        } else {
            C1804a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = sVar.f17173z;
        int i11 = sVar.f17172y;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f27903G1 = new N(i10, integer, f10);
        if (this.f27923q1 == null || !this.f27912P1) {
            this.f27918l1.p(sVar.f17171x);
        } else {
            J2();
            this.f27923q1.o(1, sVar.b().z0(i10).c0(integer).o0(f10).M());
        }
        this.f27912P1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void v1(long j10) {
        super.v1(j10);
        if (this.f27906J1) {
            return;
        }
        this.f27899C1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() {
        super.w1();
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.m(a1(), Z0(), k2(), a0());
        } else {
            this.f27918l1.j();
        }
        this.f27912P1 = true;
        E2();
    }

    protected boolean w2(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        int iT0 = t0(j10);
        if (iT0 == 0) {
            return false;
        }
        if (z10) {
            C3030b c3030b = this.f27292a1;
            c3030b.f39694d += iT0;
            c3030b.f39696f += this.f27899C1;
        } else {
            this.f27292a1.f39700j++;
            c3(iT0, this.f27899C1);
        }
        M0();
        VideoSink videoSink = this.f27923q1;
        if (videoSink != null) {
            videoSink.p(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C3031c x0(androidx.media3.exoplayer.mediacodec.j jVar, s sVar, s sVar2) {
        C3031c c3031cE = jVar.e(sVar, sVar2);
        int i10 = c3031cE.f39707e;
        d dVar = (d) C1804a.e(this.f27920n1);
        if (sVar2.f17169v > dVar.f27938a || sVar2.f17170w > dVar.f27939b) {
            i10 |= 256;
        }
        if (p2(jVar, sVar2) > dVar.f27940c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C3031c(jVar.f27394a, sVar, sVar2, i11 != 0 ? 0 : c3031cE.f39706d, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void x1(DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = this.f27906J1;
        if (!z10) {
            this.f27899C1++;
        }
        if (L.f18626a >= 23 || !z10) {
            return;
        }
        H2(decoderInputBuffer.f26295G);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void y1(s sVar) throws ExoPlaybackException {
        VideoSink videoSink = this.f27923q1;
        if (videoSink == null || videoSink.b()) {
            return;
        }
        try {
            this.f27923q1.e(sVar);
        } catch (VideoSink.VideoSinkException e10) {
            throw U(e10, sVar, 7000);
        }
    }

    public b(Context context, h.b bVar, l lVar, long j10, boolean z10, Handler handler, j jVar, int i10, float f10) {
        this(context, bVar, lVar, j10, z10, handler, jVar, i10, f10, null);
    }

    public b(Context context, h.b bVar, l lVar, long j10, boolean z10, Handler handler, j jVar, int i10, float f10, VideoSink videoSink) {
        super(2, bVar, lVar, z10, f10);
        Context applicationContext = context.getApplicationContext();
        this.f27913g1 = applicationContext;
        this.f27916j1 = i10;
        this.f27923q1 = videoSink;
        this.f27915i1 = new j.a(handler, jVar);
        this.f27914h1 = videoSink == null;
        this.f27918l1 = new h(applicationContext, this, j10);
        this.f27919m1 = new h.a();
        this.f27917k1 = h2();
        this.f27928v1 = A.f18608c;
        this.f27930x1 = 1;
        this.f27931y1 = 0;
        this.f27903G1 = N.f16982e;
        this.f27907K1 = 0;
        this.f27904H1 = null;
        this.f27905I1 = -1000;
        this.f27910N1 = -9223372036854775807L;
        this.f27911O1 = -9223372036854775807L;
    }

    protected void J2() {
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    class a implements VideoSink.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void a(VideoSink videoSink) {
            if (b.this.f27926t1 != null) {
                b.this.G2();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink) {
            if (b.this.f27926t1 != null) {
                b.this.c3(0, 1);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink, N n10) {
        }
    }
}
