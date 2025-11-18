package androidx.media3.exoplayer.audio;

import U1.A;
import U1.C1727c;
import U1.C1730f;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import X1.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.e;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.t0;
import androidx.media3.exoplayer.u0;
import com.squareup.wire.internal.MathMethodsKt;
import d2.C3025C;
import d2.C3031c;
import d2.InterfaceC3027E;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import m8.AbstractC4009y;
import v2.S;

/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes.dex */
public class m extends MediaCodecRenderer implements InterfaceC3027E {

    /* renamed from: g1, reason: collision with root package name */
    private final Context f26839g1;

    /* renamed from: h1, reason: collision with root package name */
    private final e.a f26840h1;

    /* renamed from: i1, reason: collision with root package name */
    private final AudioSink f26841i1;

    /* renamed from: j1, reason: collision with root package name */
    private final k2.h f26842j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f26843k1;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f26844l1;

    /* renamed from: m1, reason: collision with root package name */
    private boolean f26845m1;

    /* renamed from: n1, reason: collision with root package name */
    private s f26846n1;

    /* renamed from: o1, reason: collision with root package name */
    private s f26847o1;

    /* renamed from: p1, reason: collision with root package name */
    private long f26848p1;

    /* renamed from: q1, reason: collision with root package name */
    private boolean f26849q1;

    /* renamed from: r1, reason: collision with root package name */
    private boolean f26850r1;

    /* renamed from: s1, reason: collision with root package name */
    private boolean f26851s1;

    /* renamed from: t1, reason: collision with root package name */
    private int f26852t1;

    /* renamed from: u1, reason: collision with root package name */
    private boolean f26853u1;

    /* renamed from: v1, reason: collision with root package name */
    private long f26854v1;

    /* compiled from: MediaCodecAudioRenderer.java */
    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.i((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: MediaCodecAudioRenderer.java */
    private final class c implements AudioSink.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void a(AudioSink.a aVar) {
            m.this.f26840h1.o(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void b(AudioSink.a aVar) {
            m.this.f26840h1.p(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void c(long j10) {
            m.this.f26840h1.H(j10);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void d() {
            m.this.f26851s1 = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void e(boolean z10) {
            m.this.f26840h1.I(z10);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void f(Exception exc) {
            X1.n.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            m.this.f26840h1.n(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void g() {
            t0.a aVarC1 = m.this.c1();
            if (aVarC1 != null) {
                aVarC1.a();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void h(int i10, long j10, long j11) {
            m.this.f26840h1.J(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void i() {
            m.this.l0();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void j() {
            m.this.m2();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void k() {
            t0.a aVarC1 = m.this.c1();
            if (aVarC1 != null) {
                aVarC1.b();
            }
        }
    }

    public m(Context context, h.b bVar, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink) {
        this(context, bVar, lVar, z10, handler, eVar, audioSink, L.f18626a >= 35 ? new k2.h() : null);
    }

    private static boolean e2(String str) {
        if (L.f18626a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(L.f18628c)) {
            String str2 = L.f18627b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean f2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean g2() {
        if (L.f18626a == 23) {
            String str = L.f18629d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int h2(s sVar) {
        d dVarB = this.f26841i1.B(sVar);
        if (!dVarB.f26763a) {
            return 0;
        }
        int i10 = dVarB.f26764b ? 1536 : 512;
        return dVarB.f26765c ? i10 | 2048 : i10;
    }

    private int i2(androidx.media3.exoplayer.mediacodec.j jVar, s sVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(jVar.f27394a) || (i10 = L.f18626a) >= 24 || (i10 == 23 && L.J0(this.f26839g1))) {
            return sVar.f17163p;
        }
        return -1;
    }

    private static List<androidx.media3.exoplayer.mediacodec.j> k2(androidx.media3.exoplayer.mediacodec.l lVar, s sVar, boolean z10, AudioSink audioSink) {
        androidx.media3.exoplayer.mediacodec.j jVarN;
        return sVar.f17162o == null ? AbstractC4009y.G() : (!audioSink.a(sVar) || (jVarN = MediaCodecUtil.n()) == null) ? MediaCodecUtil.l(lVar, sVar, z10, false) : AbstractC4009y.H(jVarN);
    }

    private void n2(int i10) {
        k2.h hVar;
        this.f26841i1.o(i10);
        if (L.f18626a < 35 || (hVar = this.f26842j1) == null) {
            return;
        }
        hVar.e(i10);
    }

    private void o2() {
        androidx.media3.exoplayer.mediacodec.h hVarP0 = P0();
        if (hVarP0 != null && L.f18626a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f26852t1));
            hVarP0.b(bundle);
        }
    }

    private void p2() {
        long jT = this.f26841i1.t(d());
        if (jT != Long.MIN_VALUE) {
            if (!this.f26849q1) {
                jT = Math.max(this.f26848p1, jT);
            }
            this.f26848p1 = jT;
            this.f26849q1 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(long j10, long j11, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, s sVar) throws ExoPlaybackException {
        C1804a.e(byteBuffer);
        this.f26854v1 = -9223372036854775807L;
        if (this.f26847o1 != null && (i11 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.h) C1804a.e(hVar)).m(i10, false);
            return true;
        }
        if (z10) {
            if (hVar != null) {
                hVar.m(i10, false);
            }
            this.f27292a1.f39696f += i12;
            this.f26841i1.x();
            return true;
        }
        try {
            if (!this.f26841i1.C(byteBuffer, j12, i12)) {
                this.f26854v1 = j12;
                return false;
            }
            if (hVar != null) {
                hVar.m(i10, false);
            }
            this.f27292a1.f39695e += i12;
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw V(e10, this.f26846n1, e10.f26614C, (!j1() || X().f39674a == 0) ? 5001 : 5004);
        } catch (AudioSink.WriteException e11) {
            throw V(e11, sVar, e11.f26619C, (!j1() || X().f39674a == 0) ? 5002 : 5003);
        }
    }

    @Override // d2.InterfaceC3027E
    public long C() {
        if (getState() == 2) {
            p2();
        }
        return this.f26848p1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void F1() throws ExoPlaybackException {
        try {
            this.f26841i1.k();
            if (X0() != -9223372036854775807L) {
                this.f26854v1 = X0();
            }
        } catch (AudioSink.WriteException e10) {
            throw V(e10, e10.f26620D, e10.f26619C, j1() ? 5003 : 5002);
        }
    }

    @Override // d2.InterfaceC3027E
    public boolean H() {
        boolean z10 = this.f26851s1;
        this.f26851s1 = false;
        return z10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.r0.b
    public void J(int i10, Object obj) {
        if (i10 == 2) {
            this.f26841i1.y(((Float) C1804a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f26841i1.m((C1727c) C1804a.e((C1727c) obj));
            return;
        }
        if (i10 == 6) {
            this.f26841i1.z((C1730f) C1804a.e((C1730f) obj));
            return;
        }
        if (i10 == 12) {
            if (L.f18626a >= 23) {
                b.a(this.f26841i1, obj);
            }
        } else if (i10 == 16) {
            this.f26852t1 = ((Integer) C1804a.e(obj)).intValue();
            o2();
        } else if (i10 == 9) {
            this.f26841i1.D(((Boolean) C1804a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.J(i10, obj);
        } else {
            n2(((Integer) C1804a.e(obj)).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float T0(float f10, s sVar, s[] sVarArr) {
        int iMax = -1;
        for (s sVar2 : sVarArr) {
            int i10 = sVar2.f17138E;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean T1(s sVar) {
        if (X().f39674a != 0) {
            int iH2 = h2(sVar);
            if ((iH2 & 512) != 0) {
                if (X().f39674a == 2 || (iH2 & 1024) != 0) {
                    return true;
                }
                if (sVar.f17140G == 0 && sVar.f17141H == 0) {
                    return true;
                }
            }
        }
        return this.f26841i1.a(sVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int U1(androidx.media3.exoplayer.mediacodec.l lVar, s sVar) {
        int i10;
        boolean z10;
        if (!z.o(sVar.f17162o)) {
            return u0.G(0);
        }
        boolean z11 = true;
        boolean z12 = sVar.f17146M != 0;
        boolean zV1 = MediaCodecRenderer.V1(sVar);
        int i11 = 8;
        if (!zV1 || (z12 && MediaCodecUtil.n() == null)) {
            i10 = 0;
        } else {
            int iH2 = h2(sVar);
            if (this.f26841i1.a(sVar)) {
                return u0.y(4, 8, 32, iH2);
            }
            i10 = iH2;
        }
        if ("audio/raw".equals(sVar.f17162o) && !this.f26841i1.a(sVar)) {
            return u0.G(1);
        }
        if (!this.f26841i1.a(L.h0(2, sVar.f17137D, sVar.f17138E))) {
            return u0.G(1);
        }
        List<androidx.media3.exoplayer.mediacodec.j> listK2 = k2(lVar, sVar, false, this.f26841i1);
        if (listK2.isEmpty()) {
            return u0.G(1);
        }
        if (!zV1) {
            return u0.G(2);
        }
        androidx.media3.exoplayer.mediacodec.j jVar = listK2.get(0);
        boolean zN = jVar.n(sVar);
        if (zN) {
            z10 = true;
            z11 = zN;
        } else {
            for (int i12 = 1; i12 < listK2.size(); i12++) {
                androidx.media3.exoplayer.mediacodec.j jVar2 = listK2.get(i12);
                if (jVar2.n(sVar)) {
                    z10 = false;
                    jVar = jVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zN;
        }
        int i13 = z11 ? 4 : 3;
        if (z11 && jVar.q(sVar)) {
            i11 = 16;
        }
        return u0.o(i13, i11, 32, jVar.f27401h ? 64 : 0, z10 ? 128 : 0, i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<androidx.media3.exoplayer.mediacodec.j> V0(androidx.media3.exoplayer.mediacodec.l lVar, s sVar, boolean z10) {
        return MediaCodecUtil.m(k2(lVar, sVar, z10, this.f26841i1), sVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long W0(boolean z10, long j10, long j11) {
        if (this.f26854v1 == -9223372036854775807L) {
            return super.W0(z10, j10, j11);
        }
        long jQ0 = (long) (((r0 - j10) / (h() != null ? h().f16775a : 1.0f)) / 2.0f);
        if (this.f26853u1) {
            jQ0 -= L.Q0(W().c()) - j11;
        }
        return Math.max(10000L, jQ0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected h.a Y0(androidx.media3.exoplayer.mediacodec.j jVar, s sVar, MediaCrypto mediaCrypto, float f10) {
        this.f26843k1 = j2(jVar, sVar, c0());
        this.f26844l1 = e2(jVar.f27394a);
        this.f26845m1 = f2(jVar.f27394a);
        MediaFormat mediaFormatL2 = l2(sVar, jVar.f27396c, this.f26843k1, f10);
        this.f26847o1 = (!"audio/raw".equals(jVar.f27395b) || "audio/raw".equals(sVar.f17162o)) ? null : sVar;
        return h.a.a(jVar, mediaFormatL2, sVar, mediaCrypto, this.f26842j1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public boolean d() {
        return super.d() && this.f26841i1.d();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void d1(DecoderInputBuffer decoderInputBuffer) {
        s sVar;
        if (L.f18626a < 29 || (sVar = decoderInputBuffer.f26291C) == null || !Objects.equals(sVar.f17162o, "audio/opus") || !j1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(decoderInputBuffer.f26296H);
        int i10 = ((s) C1804a.e(decoderInputBuffer.f26291C)).f17140G;
        if (byteBuffer.remaining() == 8) {
            this.f26841i1.q(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / MathMethodsKt.NANOS_PER_SECOND));
        }
    }

    @Override // d2.InterfaceC3027E
    public void e(A a10) {
        this.f26841i1.e(a10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public boolean f() {
        return this.f26841i1.l() || super.f();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void g0() {
        this.f26850r1 = true;
        this.f26846n1 = null;
        try {
            this.f26841i1.flush();
            try {
                super.g0();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.g0();
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // d2.InterfaceC3027E
    public A h() {
        return this.f26841i1.h();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void h0(boolean z10, boolean z11) {
        super.h0(z10, z11);
        this.f26840h1.t(this.f27292a1);
        if (X().f39675b) {
            this.f26841i1.A();
        } else {
            this.f26841i1.u();
        }
        this.f26841i1.n(b0());
        this.f26841i1.g(W());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        super.j0(j10, z10);
        this.f26841i1.flush();
        this.f26848p1 = j10;
        this.f26851s1 = false;
        this.f26849q1 = true;
    }

    protected int j2(androidx.media3.exoplayer.mediacodec.j jVar, s sVar, s[] sVarArr) {
        int iI2 = i2(jVar, sVar);
        if (sVarArr.length == 1) {
            return iI2;
        }
        for (s sVar2 : sVarArr) {
            if (jVar.e(sVar, sVar2).f39706d != 0) {
                iI2 = Math.max(iI2, i2(jVar, sVar2));
            }
        }
        return iI2;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void k0() {
        k2.h hVar;
        this.f26841i1.c();
        if (L.f18626a < 35 || (hVar = this.f26842j1) == null) {
            return;
        }
        hVar.c();
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat l2(s sVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", sVar.f17137D);
        mediaFormat.setInteger("sample-rate", sVar.f17138E);
        q.e(mediaFormat, sVar.f17165r);
        q.d(mediaFormat, "max-input-size", i10);
        int i11 = L.f18626a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !g2()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(sVar.f17162o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f26841i1.p(L.h0(4, sVar.f17137D, sVar.f17138E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f26852t1));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void m0() {
        this.f26851s1 = false;
        try {
            super.m0();
        } finally {
            if (this.f26850r1) {
                this.f26850r1 = false;
                this.f26841i1.b();
            }
        }
    }

    protected void m2() {
        this.f26849q1 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void n0() {
        super.n0();
        this.f26841i1.j();
        this.f26853u1 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC2123e
    protected void o0() {
        p2();
        this.f26853u1 = false;
        this.f26841i1.f();
        super.o0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(Exception exc) {
        X1.n.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f26840h1.m(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1(String str, h.a aVar, long j10, long j11) {
        this.f26840h1.q(str, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(String str) {
        this.f26840h1.r(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C3031c s1(C3025C c3025c) throws ExoPlaybackException {
        s sVar = (s) C1804a.e(c3025c.f39668b);
        this.f26846n1 = sVar;
        C3031c c3031cS1 = super.s1(c3025c);
        this.f26840h1.u(sVar, c3031cS1);
        return c3031cS1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(s sVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i10;
        s sVar2 = this.f26847o1;
        int[] iArrA = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (P0() != null) {
            C1804a.e(mediaFormat);
            s sVarM = new s.b().s0("audio/raw").m0("audio/raw".equals(sVar.f17162o) ? sVar.f17139F : (L.f18626a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? L.g0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).Y(sVar.f17140G).Z(sVar.f17141H).l0(sVar.f17159l).W(sVar.f17160m).e0(sVar.f17148a).g0(sVar.f17149b).h0(sVar.f17150c).i0(sVar.f17151d).u0(sVar.f17152e).q0(sVar.f17153f).Q(mediaFormat.getInteger("channel-count")).t0(mediaFormat.getInteger("sample-rate")).M();
            if (this.f26844l1 && sVarM.f17137D == 6 && (i10 = sVar.f17137D) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < sVar.f17137D; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.f26845m1) {
                iArrA = S.a(sVarM.f17137D);
            }
            sVar = sVarM;
        }
        try {
            if (L.f18626a >= 29) {
                if (!j1() || X().f39674a == 0) {
                    this.f26841i1.s(0);
                } else {
                    this.f26841i1.s(X().f39674a);
                }
            }
            this.f26841i1.v(sVar, 0, iArrA);
        } catch (AudioSink.ConfigurationException e10) {
            throw U(e10, e10.f26612B, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u1(long j10) {
        this.f26841i1.w(j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() {
        super.w1();
        this.f26841i1.x();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C3031c x0(androidx.media3.exoplayer.mediacodec.j jVar, s sVar, s sVar2) {
        C3031c c3031cE = jVar.e(sVar, sVar2);
        int i10 = c3031cE.f39707e;
        if (k1(sVar2)) {
            i10 |= 32768;
        }
        if (i2(jVar, sVar2) > this.f26843k1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C3031c(jVar.f27394a, sVar, sVar2, i11 != 0 ? 0 : c3031cE.f39706d, i11);
    }

    public m(Context context, h.b bVar, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink, k2.h hVar) {
        super(1, bVar, lVar, z10, 44100.0f);
        this.f26839g1 = context.getApplicationContext();
        this.f26841i1 = audioSink;
        this.f26842j1 = hVar;
        this.f26852t1 = -1000;
        this.f26840h1 = new e.a(handler, eVar);
        this.f26854v1 = -9223372036854775807L;
        audioSink.r(new c());
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.t0
    public InterfaceC3027E R() {
        return this;
    }
}
