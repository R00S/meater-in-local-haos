package androidx.media3.exoplayer.mediacodec;

import U1.C1732h;
import U1.s;
import X1.C1804a;
import X1.D;
import X1.F;
import X1.L;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC2123e;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.t0;
import d2.C3025C;
import d2.C3030b;
import d2.C3031c;
import e2.v1;
import f2.I;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import v2.H;

/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends AbstractC2123e {

    /* renamed from: f1, reason: collision with root package name */
    private static final byte[] f27256f1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0, reason: collision with root package name */
    private boolean f27257A0;

    /* renamed from: B0, reason: collision with root package name */
    private long f27258B0;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f27259C0;

    /* renamed from: D0, reason: collision with root package name */
    private long f27260D0;

    /* renamed from: E0, reason: collision with root package name */
    private int f27261E0;

    /* renamed from: F0, reason: collision with root package name */
    private int f27262F0;

    /* renamed from: G0, reason: collision with root package name */
    private ByteBuffer f27263G0;

    /* renamed from: H0, reason: collision with root package name */
    private boolean f27264H0;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f27265I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f27266J0;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f27267K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f27268L0;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f27269M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f27270N0;

    /* renamed from: O0, reason: collision with root package name */
    private int f27271O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f27272P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f27273Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f27274R0;

    /* renamed from: S, reason: collision with root package name */
    private final h.b f27275S;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f27276S0;

    /* renamed from: T, reason: collision with root package name */
    private final l f27277T;

    /* renamed from: T0, reason: collision with root package name */
    private long f27278T0;

    /* renamed from: U, reason: collision with root package name */
    private final boolean f27279U;

    /* renamed from: U0, reason: collision with root package name */
    private long f27280U0;

    /* renamed from: V, reason: collision with root package name */
    private final float f27281V;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f27282V0;

    /* renamed from: W, reason: collision with root package name */
    private final DecoderInputBuffer f27283W;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f27284W0;

    /* renamed from: X, reason: collision with root package name */
    private final DecoderInputBuffer f27285X;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f27286X0;

    /* renamed from: Y, reason: collision with root package name */
    private final DecoderInputBuffer f27287Y;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f27288Y0;

    /* renamed from: Z, reason: collision with root package name */
    private final f f27289Z;

    /* renamed from: Z0, reason: collision with root package name */
    private ExoPlaybackException f27290Z0;

    /* renamed from: a0, reason: collision with root package name */
    private final MediaCodec.BufferInfo f27291a0;

    /* renamed from: a1, reason: collision with root package name */
    protected C3030b f27292a1;

    /* renamed from: b0, reason: collision with root package name */
    private final ArrayDeque<d> f27293b0;

    /* renamed from: b1, reason: collision with root package name */
    private d f27294b1;

    /* renamed from: c0, reason: collision with root package name */
    private final I f27295c0;

    /* renamed from: c1, reason: collision with root package name */
    private long f27296c1;

    /* renamed from: d0, reason: collision with root package name */
    private s f27297d0;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f27298d1;

    /* renamed from: e0, reason: collision with root package name */
    private s f27299e0;

    /* renamed from: e1, reason: collision with root package name */
    private boolean f27300e1;

    /* renamed from: f0, reason: collision with root package name */
    private DrmSession f27301f0;

    /* renamed from: g0, reason: collision with root package name */
    private DrmSession f27302g0;

    /* renamed from: h0, reason: collision with root package name */
    private t0.a f27303h0;

    /* renamed from: i0, reason: collision with root package name */
    private MediaCrypto f27304i0;

    /* renamed from: j0, reason: collision with root package name */
    private long f27305j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f27306k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f27307l0;

    /* renamed from: m0, reason: collision with root package name */
    private h f27308m0;

    /* renamed from: n0, reason: collision with root package name */
    private s f27309n0;

    /* renamed from: o0, reason: collision with root package name */
    private MediaFormat f27310o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f27311p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f27312q0;

    /* renamed from: r0, reason: collision with root package name */
    private ArrayDeque<j> f27313r0;

    /* renamed from: s0, reason: collision with root package name */
    private DecoderInitializationException f27314s0;

    /* renamed from: t0, reason: collision with root package name */
    private j f27315t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f27316u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f27317v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f27318w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f27319x0;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f27320y0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f27321z0;

    private static final class b {
        public static void a(h.a aVar, v1 v1Var) {
            LogSessionId logSessionIdA = v1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f27389b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private final class c implements h.c {
        private c() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void a() {
            if (MediaCodecRenderer.this.f27303h0 != null) {
                MediaCodecRenderer.this.f27303h0.b();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void b() {
            if (MediaCodecRenderer.this.f27303h0 != null) {
                MediaCodecRenderer.this.f27303h0.b();
            }
        }
    }

    private static final class d {

        /* renamed from: e, reason: collision with root package name */
        public static final d f27328e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f27329a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27330b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27331c;

        /* renamed from: d, reason: collision with root package name */
        public final D<s> f27332d = new D<>();

        public d(long j10, long j11, long j12) {
            this.f27329a = j10;
            this.f27330b = j11;
            this.f27331c = j12;
        }
    }

    public MediaCodecRenderer(int i10, h.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f27275S = bVar;
        this.f27277T = (l) C1804a.e(lVar);
        this.f27279U = z10;
        this.f27281V = f10;
        this.f27283W = DecoderInputBuffer.G();
        this.f27285X = new DecoderInputBuffer(0);
        this.f27287Y = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f27289Z = fVar;
        this.f27291a0 = new MediaCodec.BufferInfo();
        this.f27306k0 = 1.0f;
        this.f27307l0 = 1.0f;
        this.f27305j0 = -9223372036854775807L;
        this.f27293b0 = new ArrayDeque<>();
        this.f27294b1 = d.f27328e;
        fVar.D(0);
        fVar.f26293E.order(ByteOrder.nativeOrder());
        this.f27295c0 = new I();
        this.f27312q0 = -1.0f;
        this.f27316u0 = 0;
        this.f27270N0 = 0;
        this.f27261E0 = -1;
        this.f27262F0 = -1;
        this.f27260D0 = -9223372036854775807L;
        this.f27278T0 = -9223372036854775807L;
        this.f27280U0 = -9223372036854775807L;
        this.f27296c1 = -9223372036854775807L;
        this.f27258B0 = -9223372036854775807L;
        this.f27271O0 = 0;
        this.f27272P0 = 0;
        this.f27292a1 = new C3030b();
    }

    private static boolean A0(String str) {
        return L.f18626a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean B0(j jVar) {
        String str = jVar.f27394a;
        int i10 = L.f18626a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(L.f18628c) && "AFTS".equals(L.f18629d) && jVar.f27400g);
    }

    private void B1() {
        this.f27276S0 = true;
        MediaFormat mediaFormatH = ((h) C1804a.e(this.f27308m0)).h();
        if (this.f27316u0 != 0 && mediaFormatH.getInteger("width") == 32 && mediaFormatH.getInteger("height") == 32) {
            this.f27321z0 = true;
        } else {
            this.f27310o0 = mediaFormatH;
            this.f27311p0 = true;
        }
    }

    private static boolean C0(String str) {
        return L.f18626a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean C1(int i10) throws MediaCryptoException, ExoPlaybackException {
        C3025C c3025cY = Y();
        this.f27283W.t();
        int iR0 = r0(c3025cY, this.f27283W, i10 | 4);
        if (iR0 == -5) {
            s1(c3025cY);
            return true;
        }
        if (iR0 != -4 || !this.f27283W.w()) {
            return false;
        }
        this.f27282V0 = true;
        z1();
        return false;
    }

    private void D1() throws ExoPlaybackException {
        E1();
        n1();
    }

    private void E0() {
        this.f27268L0 = false;
        this.f27289Z.t();
        this.f27287Y.t();
        this.f27267K0 = false;
        this.f27266J0 = false;
        this.f27295c0.d();
    }

    private boolean F0() {
        if (this.f27273Q0) {
            this.f27271O0 = 1;
            if (this.f27318w0) {
                this.f27272P0 = 3;
                return false;
            }
            this.f27272P0 = 1;
        }
        return true;
    }

    private void G0() throws ExoPlaybackException {
        if (!this.f27273Q0) {
            D1();
        } else {
            this.f27271O0 = 1;
            this.f27272P0 = 3;
        }
    }

    @TargetApi(23)
    private boolean H0() throws MediaCryptoException, ExoPlaybackException {
        if (this.f27273Q0) {
            this.f27271O0 = 1;
            if (this.f27318w0) {
                this.f27272P0 = 3;
                return false;
            }
            this.f27272P0 = 2;
        } else {
            X1();
        }
        return true;
    }

    private boolean I0(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        boolean z10;
        boolean zA1;
        int iL;
        h hVar = (h) C1804a.e(this.f27308m0);
        if (!e1()) {
            if (this.f27319x0 && this.f27274R0) {
                try {
                    iL = hVar.l(this.f27291a0);
                } catch (IllegalStateException unused) {
                    z1();
                    if (this.f27284W0) {
                        E1();
                    }
                    return false;
                }
            } else {
                iL = hVar.l(this.f27291a0);
            }
            if (iL < 0) {
                if (iL == -2) {
                    B1();
                    return true;
                }
                if (this.f27257A0 && (this.f27282V0 || this.f27271O0 == 2)) {
                    z1();
                }
                long j12 = this.f27258B0;
                if (j12 != -9223372036854775807L && j12 + 100 < W().a()) {
                    z1();
                }
                return false;
            }
            if (this.f27321z0) {
                this.f27321z0 = false;
                hVar.m(iL, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f27291a0;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                z1();
                return false;
            }
            this.f27262F0 = iL;
            ByteBuffer byteBufferQ = hVar.q(iL);
            this.f27263G0 = byteBufferQ;
            if (byteBufferQ != null) {
                byteBufferQ.position(this.f27291a0.offset);
                ByteBuffer byteBuffer = this.f27263G0;
                MediaCodec.BufferInfo bufferInfo2 = this.f27291a0;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.f27264H0 = this.f27291a0.presentationTimeUs < a0();
            long j13 = this.f27280U0;
            this.f27265I0 = j13 != -9223372036854775807L && j13 <= this.f27291a0.presentationTimeUs;
            Y1(this.f27291a0.presentationTimeUs);
        }
        if (this.f27319x0 && this.f27274R0) {
            try {
                ByteBuffer byteBuffer2 = this.f27263G0;
                int i10 = this.f27262F0;
                MediaCodec.BufferInfo bufferInfo3 = this.f27291a0;
                z10 = false;
                try {
                    zA1 = A1(j10, j11, hVar, byteBuffer2, i10, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f27264H0, this.f27265I0, (s) C1804a.e(this.f27299e0));
                } catch (IllegalStateException unused2) {
                    z1();
                    if (this.f27284W0) {
                        E1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f27263G0;
            int i11 = this.f27262F0;
            MediaCodec.BufferInfo bufferInfo4 = this.f27291a0;
            zA1 = A1(j10, j11, hVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f27264H0, this.f27265I0, (s) C1804a.e(this.f27299e0));
        }
        if (zA1) {
            v1(this.f27291a0.presentationTimeUs);
            boolean z11 = (this.f27291a0.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f27274R0 && this.f27265I0) {
                this.f27258B0 = W().a();
            }
            J1();
            if (!z11) {
                return true;
            }
            z1();
        }
        return z10;
    }

    private void I1() {
        this.f27261E0 = -1;
        this.f27285X.f26293E = null;
    }

    private boolean J0(j jVar, s sVar, DrmSession drmSession, DrmSession drmSession2) {
        c2.b bVarI;
        c2.b bVarI2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (bVarI = drmSession2.i()) != null && (bVarI2 = drmSession.i()) != null && bVarI.getClass().equals(bVarI2.getClass())) {
            if (!(bVarI instanceof i2.l)) {
                return false;
            }
            if (!drmSession2.b().equals(drmSession.b()) || L.f18626a < 23) {
                return true;
            }
            UUID uuid = C1732h.f17051e;
            if (!uuid.equals(drmSession.b()) && !uuid.equals(drmSession2.b())) {
                if (jVar.f27400g) {
                    return false;
                }
                return drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.g((String) C1804a.e(sVar.f17162o)));
            }
        }
        return true;
    }

    private void J1() {
        this.f27262F0 = -1;
        this.f27263G0 = null;
    }

    private boolean K0() throws MediaCryptoException, ExoPlaybackException {
        int i10;
        if (this.f27308m0 == null || (i10 = this.f27271O0) == 2 || this.f27282V0) {
            return false;
        }
        if (i10 == 0 && R1()) {
            G0();
        }
        h hVar = (h) C1804a.e(this.f27308m0);
        if (this.f27261E0 < 0) {
            int iK = hVar.k();
            this.f27261E0 = iK;
            if (iK < 0) {
                return false;
            }
            this.f27285X.f26293E = hVar.o(iK);
            this.f27285X.t();
        }
        if (this.f27271O0 == 1) {
            if (!this.f27257A0) {
                this.f27274R0 = true;
                hVar.d(this.f27261E0, 0, 0, 0L, 4);
                I1();
            }
            this.f27271O0 = 2;
            return false;
        }
        if (this.f27320y0) {
            this.f27320y0 = false;
            ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(this.f27285X.f26293E);
            byte[] bArr = f27256f1;
            byteBuffer.put(bArr);
            hVar.d(this.f27261E0, 0, bArr.length, 0L, 0);
            I1();
            this.f27273Q0 = true;
            return true;
        }
        if (this.f27270N0 == 1) {
            for (int i11 = 0; i11 < ((s) C1804a.e(this.f27309n0)).f17165r.size(); i11++) {
                ((ByteBuffer) C1804a.e(this.f27285X.f26293E)).put(this.f27309n0.f17165r.get(i11));
            }
            this.f27270N0 = 2;
        }
        int iPosition = ((ByteBuffer) C1804a.e(this.f27285X.f26293E)).position();
        C3025C c3025cY = Y();
        try {
            int iR0 = r0(c3025cY, this.f27285X, 0);
            if (iR0 == -3) {
                if (p()) {
                    this.f27280U0 = this.f27278T0;
                }
                return false;
            }
            if (iR0 == -5) {
                if (this.f27270N0 == 2) {
                    this.f27285X.t();
                    this.f27270N0 = 1;
                }
                s1(c3025cY);
                return true;
            }
            if (this.f27285X.w()) {
                this.f27280U0 = this.f27278T0;
                if (this.f27270N0 == 2) {
                    this.f27285X.t();
                    this.f27270N0 = 1;
                }
                this.f27282V0 = true;
                if (!this.f27273Q0) {
                    z1();
                    return false;
                }
                if (!this.f27257A0) {
                    this.f27274R0 = true;
                    hVar.d(this.f27261E0, 0, 0, 0L, 4);
                    I1();
                }
                return false;
            }
            if (!this.f27273Q0 && !this.f27285X.y()) {
                this.f27285X.t();
                if (this.f27270N0 == 2) {
                    this.f27270N0 = 1;
                }
                return true;
            }
            if (S1(this.f27285X)) {
                this.f27285X.t();
                this.f27292a1.f39694d++;
                return true;
            }
            boolean zF = this.f27285X.F();
            if (zF) {
                this.f27285X.f26292D.b(iPosition);
            }
            long j10 = this.f27285X.f26295G;
            if (this.f27286X0) {
                if (this.f27293b0.isEmpty()) {
                    this.f27294b1.f27332d.a(j10, (s) C1804a.e(this.f27297d0));
                } else {
                    this.f27293b0.peekLast().f27332d.a(j10, (s) C1804a.e(this.f27297d0));
                }
                this.f27286X0 = false;
            }
            this.f27278T0 = Math.max(this.f27278T0, j10);
            if (p() || this.f27285X.z()) {
                this.f27280U0 = this.f27278T0;
            }
            this.f27285X.E();
            if (this.f27285X.v()) {
                d1(this.f27285X);
            }
            x1(this.f27285X);
            int iQ0 = Q0(this.f27285X);
            if (zF) {
                ((h) C1804a.e(hVar)).a(this.f27261E0, 0, this.f27285X.f26292D, j10, iQ0);
            } else {
                ((h) C1804a.e(hVar)).d(this.f27261E0, 0, ((ByteBuffer) C1804a.e(this.f27285X.f26293E)).limit(), j10, iQ0);
            }
            I1();
            this.f27273Q0 = true;
            this.f27270N0 = 0;
            this.f27292a1.f39693c++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e10) {
            p1(e10);
            C1(0);
            L0();
            return true;
        }
    }

    private void K1(DrmSession drmSession) {
        DrmSession.f(this.f27301f0, drmSession);
        this.f27301f0 = drmSession;
    }

    private void L0() {
        try {
            ((h) C1804a.i(this.f27308m0)).flush();
        } finally {
            G1();
        }
    }

    private void L1(d dVar) {
        this.f27294b1 = dVar;
        long j10 = dVar.f27331c;
        if (j10 != -9223372036854775807L) {
            this.f27298d1 = true;
            u1(j10);
        }
    }

    private List<j> O0(boolean z10) {
        s sVar = (s) C1804a.e(this.f27297d0);
        List<j> listV0 = V0(this.f27277T, sVar, z10);
        if (listV0.isEmpty() && z10) {
            listV0 = V0(this.f27277T, sVar, false);
            if (!listV0.isEmpty()) {
                X1.n.h("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.f17162o + ", but no secure decoder available. Trying to proceed with " + listV0 + ".");
            }
        }
        return listV0;
    }

    private void O1(DrmSession drmSession) {
        DrmSession.f(this.f27302g0, drmSession);
        this.f27302g0 = drmSession;
    }

    private boolean P1(long j10) {
        return this.f27305j0 == -9223372036854775807L || W().c() - j10 < this.f27305j0;
    }

    protected static boolean V1(s sVar) {
        int i10 = sVar.f17146M;
        return i10 == 0 || i10 == 2;
    }

    private boolean W1(s sVar) throws ExoPlaybackException {
        if (L.f18626a >= 23 && this.f27308m0 != null && this.f27272P0 != 3 && getState() != 0) {
            float fT0 = T0(this.f27307l0, (s) C1804a.e(sVar), c0());
            float f10 = this.f27312q0;
            if (f10 == fT0) {
                return true;
            }
            if (fT0 == -1.0f) {
                G0();
                return false;
            }
            if (f10 == -1.0f && fT0 <= this.f27281V) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fT0);
            ((h) C1804a.e(this.f27308m0)).b(bundle);
            this.f27312q0 = fT0;
        }
        return true;
    }

    private void X1() throws MediaCryptoException, ExoPlaybackException {
        c2.b bVarI = ((DrmSession) C1804a.e(this.f27302g0)).i();
        if (bVarI instanceof i2.l) {
            try {
                ((MediaCrypto) C1804a.e(this.f27304i0)).setMediaDrmSession(((i2.l) bVarI).f43056b);
            } catch (MediaCryptoException e10) {
                throw U(e10, this.f27297d0, 6006);
            }
        }
        K1(this.f27302g0);
        this.f27271O0 = 0;
        this.f27272P0 = 0;
    }

    private boolean e1() {
        return this.f27262F0 >= 0;
    }

    private boolean f1() {
        if (!this.f27289Z.N()) {
            return true;
        }
        long jA0 = a0();
        return l1(jA0, this.f27289Z.L()) == l1(jA0, this.f27287Y.f26295G);
    }

    private void g1(s sVar) {
        E0();
        String str = sVar.f17162o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f27289Z.O(32);
        } else {
            this.f27289Z.O(1);
        }
        this.f27266J0 = true;
    }

    private void h1(j jVar, MediaCrypto mediaCrypto) {
        s sVar = (s) C1804a.e(this.f27297d0);
        String str = jVar.f27394a;
        int i10 = L.f18626a;
        float fT0 = i10 < 23 ? -1.0f : T0(this.f27307l0, sVar, c0());
        float f10 = fT0 > this.f27281V ? fT0 : -1.0f;
        y1(sVar);
        long jC = W().c();
        h.a aVarY0 = Y0(jVar, sVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(aVarY0, b0());
        }
        try {
            F.a("createCodec:" + str);
            h hVarA = this.f27275S.a(aVarY0);
            this.f27308m0 = hVarA;
            this.f27259C0 = hVarA.e(new c());
            F.b();
            long jC2 = W().c();
            if (!jVar.n(sVar)) {
                X1.n.h("MediaCodecRenderer", L.G("Format exceeds selected codec's capabilities [%s, %s]", s.i(sVar), str));
            }
            this.f27315t0 = jVar;
            this.f27312q0 = f10;
            this.f27309n0 = sVar;
            this.f27316u0 = y0(str);
            this.f27317v0 = C0(str);
            this.f27318w0 = z0(str);
            this.f27319x0 = A0(str);
            this.f27257A0 = B0(jVar) || S0();
            if (((h) C1804a.e(this.f27308m0)).f()) {
                this.f27269M0 = true;
                this.f27270N0 = 1;
                this.f27320y0 = this.f27316u0 != 0;
            }
            if (getState() == 2) {
                this.f27260D0 = W().c() + 1000;
            }
            this.f27292a1.f39691a++;
            q1(str, aVarY0, jC2, jC2 - jC);
        } catch (Throwable th) {
            F.b();
            throw th;
        }
    }

    private boolean i1() throws ExoPlaybackException {
        C1804a.g(this.f27304i0 == null);
        DrmSession drmSession = this.f27301f0;
        c2.b bVarI = drmSession.i();
        if (i2.l.f43054d && (bVarI instanceof i2.l)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) C1804a.e(drmSession.h());
                throw U(drmSessionException, this.f27297d0, drmSessionException.f27106B);
            }
            if (state != 4) {
                return false;
            }
        }
        if (bVarI == null) {
            return drmSession.h() != null;
        }
        if (bVarI instanceof i2.l) {
            i2.l lVar = (i2.l) bVarI;
            try {
                this.f27304i0 = new MediaCrypto(lVar.f43055a, lVar.f43056b);
            } catch (MediaCryptoException e10) {
                throw U(e10, this.f27297d0, 6006);
            }
        }
        return true;
    }

    private boolean l1(long j10, long j11) {
        s sVar;
        return j11 < j10 && !((sVar = this.f27299e0) != null && Objects.equals(sVar.f17162o, "audio/opus") && H.g(j10, j11));
    }

    private static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void o1(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        s sVar = (s) C1804a.e(this.f27297d0);
        if (this.f27313r0 == null) {
            try {
                List<j> listO0 = O0(z10);
                ArrayDeque<j> arrayDeque = new ArrayDeque<>();
                this.f27313r0 = arrayDeque;
                if (this.f27279U) {
                    arrayDeque.addAll(listO0);
                } else if (!listO0.isEmpty()) {
                    this.f27313r0.add(listO0.get(0));
                }
                this.f27314s0 = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(sVar, e10, z10, -49998);
            }
        }
        if (this.f27313r0.isEmpty()) {
            throw new DecoderInitializationException(sVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) C1804a.e(this.f27313r0);
        while (this.f27308m0 == null) {
            j jVar = (j) C1804a.e((j) arrayDeque2.peekFirst());
            if (!Q1(jVar)) {
                return;
            }
            try {
                h1(jVar, mediaCrypto);
            } catch (Exception e11) {
                X1.n.i("MediaCodecRenderer", "Failed to initialize decoder: " + jVar, e11);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(sVar, e11, z10, jVar);
                p1(decoderInitializationException);
                if (this.f27314s0 == null) {
                    this.f27314s0 = decoderInitializationException;
                } else {
                    this.f27314s0 = this.f27314s0.c(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f27314s0;
                }
            }
        }
        this.f27313r0 = null;
    }

    private void v0() throws ExoPlaybackException {
        C1804a.g(!this.f27282V0);
        C3025C c3025cY = Y();
        this.f27287Y.t();
        do {
            this.f27287Y.t();
            int iR0 = r0(c3025cY, this.f27287Y, 0);
            if (iR0 == -5) {
                s1(c3025cY);
                return;
            }
            if (iR0 == -4) {
                if (!this.f27287Y.w()) {
                    this.f27278T0 = Math.max(this.f27278T0, this.f27287Y.f26295G);
                    if (p() || this.f27285X.z()) {
                        this.f27280U0 = this.f27278T0;
                    }
                    if (this.f27286X0) {
                        s sVar = (s) C1804a.e(this.f27297d0);
                        this.f27299e0 = sVar;
                        if (Objects.equals(sVar.f17162o, "audio/opus") && !this.f27299e0.f17165r.isEmpty()) {
                            this.f27299e0 = ((s) C1804a.e(this.f27299e0)).b().Y(H.f(this.f27299e0.f17165r.get(0))).M();
                        }
                        t1(this.f27299e0, null);
                        this.f27286X0 = false;
                    }
                    this.f27287Y.E();
                    s sVar2 = this.f27299e0;
                    if (sVar2 != null && Objects.equals(sVar2.f17162o, "audio/opus")) {
                        if (this.f27287Y.v()) {
                            DecoderInputBuffer decoderInputBuffer = this.f27287Y;
                            decoderInputBuffer.f26291C = this.f27299e0;
                            d1(decoderInputBuffer);
                        }
                        if (H.g(a0(), this.f27287Y.f26295G)) {
                            this.f27295c0.a(this.f27287Y, ((s) C1804a.e(this.f27299e0)).f17165r);
                        }
                    }
                    if (!f1()) {
                        break;
                    }
                } else {
                    this.f27282V0 = true;
                    this.f27280U0 = this.f27278T0;
                    return;
                }
            } else {
                if (iR0 != -3) {
                    throw new IllegalStateException();
                }
                if (p()) {
                    this.f27280U0 = this.f27278T0;
                    return;
                }
                return;
            }
        } while (this.f27289Z.I(this.f27287Y));
        this.f27267K0 = true;
    }

    private boolean w0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        C1804a.g(!this.f27284W0);
        if (this.f27289Z.N()) {
            f fVar = this.f27289Z;
            if (!A1(j10, j11, null, fVar.f26293E, this.f27262F0, 0, fVar.M(), this.f27289Z.K(), l1(a0(), this.f27289Z.L()), this.f27289Z.w(), (s) C1804a.e(this.f27299e0))) {
                return false;
            }
            v1(this.f27289Z.L());
            this.f27289Z.t();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f27282V0) {
            this.f27284W0 = true;
            return z10;
        }
        if (this.f27267K0) {
            C1804a.g(this.f27289Z.I(this.f27287Y));
            this.f27267K0 = z10;
        }
        if (this.f27268L0) {
            if (this.f27289Z.N()) {
                return true;
            }
            E0();
            this.f27268L0 = z10;
            n1();
            if (!this.f27266J0) {
                return z10;
            }
        }
        v0();
        if (this.f27289Z.N()) {
            this.f27289Z.E();
        }
        if (this.f27289Z.N() || this.f27282V0 || this.f27268L0) {
            return true;
        }
        return z10;
    }

    private int y0(String str) {
        int i10 = L.f18626a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = L.f18629d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = L.f18627b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean z0(String str) {
        return L.f18626a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    @TargetApi(23)
    private void z1() throws MediaCryptoException, ExoPlaybackException {
        int i10 = this.f27272P0;
        if (i10 == 1) {
            L0();
            return;
        }
        if (i10 == 2) {
            L0();
            X1();
        } else if (i10 == 3) {
            D1();
        } else {
            this.f27284W0 = true;
            F1();
        }
    }

    protected abstract boolean A1(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, s sVar);

    @Override // androidx.media3.exoplayer.t0
    public void D(float f10, float f11) throws ExoPlaybackException {
        this.f27306k0 = f10;
        this.f27307l0 = f11;
        W1(this.f27309n0);
    }

    protected MediaCodecDecoderException D0(Throwable th, j jVar) {
        return new MediaCodecDecoderException(th, jVar);
    }

    protected void E1() {
        try {
            h hVar = this.f27308m0;
            if (hVar != null) {
                hVar.c();
                this.f27292a1.f39692b++;
                r1(((j) C1804a.e(this.f27315t0)).f27394a);
            }
            this.f27308m0 = null;
            try {
                MediaCrypto mediaCrypto = this.f27304i0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f27308m0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f27304i0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void G1() {
        I1();
        J1();
        this.f27260D0 = -9223372036854775807L;
        this.f27274R0 = false;
        this.f27258B0 = -9223372036854775807L;
        this.f27273Q0 = false;
        this.f27320y0 = false;
        this.f27321z0 = false;
        this.f27264H0 = false;
        this.f27265I0 = false;
        this.f27278T0 = -9223372036854775807L;
        this.f27280U0 = -9223372036854775807L;
        this.f27296c1 = -9223372036854775807L;
        this.f27271O0 = 0;
        this.f27272P0 = 0;
        this.f27270N0 = this.f27269M0 ? 1 : 0;
    }

    protected void H1() {
        G1();
        this.f27290Z0 = null;
        this.f27313r0 = null;
        this.f27315t0 = null;
        this.f27309n0 = null;
        this.f27310o0 = null;
        this.f27311p0 = false;
        this.f27276S0 = false;
        this.f27312q0 = -1.0f;
        this.f27316u0 = 0;
        this.f27317v0 = false;
        this.f27318w0 = false;
        this.f27319x0 = false;
        this.f27257A0 = false;
        this.f27259C0 = false;
        this.f27269M0 = false;
        this.f27270N0 = 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.u0
    public final int I() {
        return 8;
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e, androidx.media3.exoplayer.r0.b
    public void J(int i10, Object obj) {
        if (i10 == 11) {
            this.f27303h0 = (t0.a) obj;
        } else {
            super.J(i10, obj);
        }
    }

    protected final boolean M0() throws MediaCryptoException, ExoPlaybackException {
        boolean zN0 = N0();
        if (zN0) {
            n1();
        }
        return zN0;
    }

    protected final void M1() {
        this.f27288Y0 = true;
    }

    protected boolean N0() throws MediaCryptoException {
        if (this.f27308m0 == null) {
            return false;
        }
        int i10 = this.f27272P0;
        if (i10 == 3 || ((this.f27317v0 && !this.f27276S0) || (this.f27318w0 && this.f27274R0))) {
            E1();
            return true;
        }
        if (i10 == 2) {
            int i11 = L.f18626a;
            C1804a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    X1();
                } catch (ExoPlaybackException e10) {
                    X1.n.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    E1();
                    return true;
                }
            }
        }
        L0();
        return false;
    }

    protected final void N1(ExoPlaybackException exoPlaybackException) {
        this.f27290Z0 = exoPlaybackException;
    }

    protected final h P0() {
        return this.f27308m0;
    }

    protected int Q0(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected boolean Q1(j jVar) {
        return true;
    }

    protected final j R0() {
        return this.f27315t0;
    }

    protected boolean R1() {
        return false;
    }

    protected boolean S0() {
        return false;
    }

    protected boolean S1(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected abstract float T0(float f10, s sVar, s[] sVarArr);

    protected boolean T1(s sVar) {
        return false;
    }

    protected final MediaFormat U0() {
        return this.f27310o0;
    }

    protected abstract int U1(l lVar, s sVar);

    protected abstract List<j> V0(l lVar, s sVar, boolean z10);

    protected long W0(boolean z10, long j10, long j11) {
        return super.r(j10, j11);
    }

    protected long X0() {
        return this.f27280U0;
    }

    protected abstract h.a Y0(j jVar, s sVar, MediaCrypto mediaCrypto, float f10);

    protected final void Y1(long j10) {
        s sVarJ = this.f27294b1.f27332d.j(j10);
        if (sVarJ == null && this.f27298d1 && this.f27310o0 != null) {
            sVarJ = this.f27294b1.f27332d.i();
        }
        if (sVarJ != null) {
            this.f27299e0 = sVarJ;
        } else if (!this.f27311p0 || this.f27299e0 == null) {
            return;
        }
        t1((s) C1804a.e(this.f27299e0), this.f27310o0);
        this.f27311p0 = false;
        this.f27298d1 = false;
    }

    protected final long Z0() {
        return this.f27294b1.f27331c;
    }

    @Override // androidx.media3.exoplayer.u0
    public final int a(s sVar) throws ExoPlaybackException {
        try {
            return U1(this.f27277T, sVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw U(e10, sVar, 4002);
        }
    }

    protected final long a1() {
        return this.f27294b1.f27330b;
    }

    protected float b1() {
        return this.f27306k0;
    }

    protected final t0.a c1() {
        return this.f27303h0;
    }

    @Override // androidx.media3.exoplayer.t0
    public boolean d() {
        return this.f27284W0;
    }

    protected abstract void d1(DecoderInputBuffer decoderInputBuffer);

    @Override // androidx.media3.exoplayer.t0
    public boolean f() {
        return this.f27297d0 != null && (f0() || e1() || (this.f27260D0 != -9223372036854775807L && W().c() < this.f27260D0));
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void g0() throws MediaCryptoException {
        this.f27297d0 = null;
        L1(d.f27328e);
        this.f27293b0.clear();
        N0();
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void h0(boolean z10, boolean z11) {
        this.f27292a1 = new C3030b();
    }

    @Override // androidx.media3.exoplayer.t0
    public void j(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        boolean z10 = false;
        if (this.f27288Y0) {
            this.f27288Y0 = false;
            z1();
        }
        ExoPlaybackException exoPlaybackException = this.f27290Z0;
        if (exoPlaybackException != null) {
            this.f27290Z0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f27284W0) {
                F1();
                return;
            }
            if (this.f27297d0 != null || C1(2)) {
                n1();
                if (this.f27266J0) {
                    F.a("bypassRender");
                    while (w0(j10, j11)) {
                    }
                    F.b();
                } else if (this.f27308m0 != null) {
                    long jC = W().c();
                    F.a("drainAndFeed");
                    while (I0(j10, j11) && P1(jC)) {
                    }
                    while (K0() && P1(jC)) {
                    }
                    F.b();
                } else {
                    this.f27292a1.f39694d += t0(j10);
                    C1(1);
                }
                this.f27292a1.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw U(e10, this.f27297d0, L.Z(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!m1(e11)) {
                throw e11;
            }
            p1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                E1();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionD0 = D0(e11, R0());
            throw V(mediaCodecDecoderExceptionD0, this.f27297d0, z10, mediaCodecDecoderExceptionD0.f27255D == 1101 ? 4006 : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void j0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        this.f27282V0 = false;
        this.f27284W0 = false;
        this.f27288Y0 = false;
        if (this.f27266J0) {
            this.f27289Z.t();
            this.f27287Y.t();
            this.f27267K0 = false;
            this.f27295c0.d();
        } else {
            M0();
        }
        if (this.f27294b1.f27332d.l() > 0) {
            this.f27286X0 = true;
        }
        this.f27294b1.f27332d.c();
        this.f27293b0.clear();
    }

    protected final boolean j1() {
        return this.f27266J0;
    }

    protected final boolean k1(s sVar) {
        return this.f27302g0 == null && T1(sVar);
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void m0() {
        try {
            E0();
            E1();
        } finally {
            O1(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void n1() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r3 = this;
            androidx.media3.exoplayer.mediacodec.h r0 = r3.f27308m0
            if (r0 != 0) goto L6b
            boolean r0 = r3.f27266J0
            if (r0 != 0) goto L6b
            U1.s r0 = r3.f27297d0
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.k1(r0)
            if (r1 == 0) goto L17
            r3.g1(r0)
            return
        L17:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f27302g0
            r3.K1(r1)
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f27301f0
            if (r1 == 0) goto L26
            boolean r1 = r3.i1()
            if (r1 == 0) goto L55
        L26:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f27301f0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f27301f0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            int r1 = r1.getState()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f27301f0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.String r2 = r0.f17162o     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.Object r2 = X1.C1804a.i(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            boolean r1 = r1.g(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.f27304i0     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r3.o1(r2, r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.f27304i0
            if (r0 == 0) goto L63
            androidx.media3.exoplayer.mediacodec.h r1 = r3.f27308m0
            if (r1 != 0) goto L63
            r0.release()
            r0 = 0
            r3.f27304i0 = r0
        L63:
            return
        L64:
            r2 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.ExoPlaybackException r0 = r3.U(r1, r0, r2)
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.n1():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r5 >= r1) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC2123e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void p0(U1.s[] r13, long r14, long r16, androidx.media3.exoplayer.source.r.b r18) {
        /*
            r12 = this;
            r0 = r12
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = r0.f27294b1
            long r1 = r1.f27331c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L27
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            boolean r1 = r0.f27300e1
            if (r1 == 0) goto L6c
            r12.w1()
            goto L6c
        L27:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r1 = r0.f27293b0
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5c
            long r1 = r0.f27278T0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3f
            long r5 = r0.f27296c1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L5c
        L3f:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.L1(r1)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r1 = r0.f27294b1
            long r1 = r1.f27331c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L6c
            r12.w1()
            goto L6c
        L5c:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r1 = r0.f27293b0
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r9 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            long r3 = r0.f27278T0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.p0(U1.s[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    protected abstract void p1(Exception exc);

    protected abstract void q1(String str, h.a aVar, long j10, long j11);

    @Override // androidx.media3.exoplayer.t0
    public final long r(long j10, long j11) {
        return W0(this.f27259C0, j10, j11);
    }

    protected abstract void r1(String str);

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected d2.C3031c s1(d2.C3025C r12) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.s1(d2.C):d2.c");
    }

    protected abstract void t1(s sVar, MediaFormat mediaFormat);

    protected void v1(long j10) {
        this.f27296c1 = j10;
        while (!this.f27293b0.isEmpty() && j10 >= this.f27293b0.peek().f27329a) {
            L1((d) C1804a.e(this.f27293b0.poll()));
            w1();
        }
    }

    protected abstract C3031c x0(j jVar, s sVar, s sVar2);

    public static class DecoderInitializationException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final String f27322B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f27323C;

        /* renamed from: D, reason: collision with root package name */
        public final j f27324D;

        /* renamed from: E, reason: collision with root package name */
        public final String f27325E;

        /* renamed from: F, reason: collision with root package name */
        public final DecoderInitializationException f27326F;

        public DecoderInitializationException(s sVar, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + sVar, th, sVar.f17162o, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f27322B, this.f27323C, this.f27324D, this.f27325E, decoderInitializationException);
        }

        public DecoderInitializationException(s sVar, Throwable th, boolean z10, j jVar) {
            this("Decoder init failed: " + jVar.f27394a + ", " + sVar, th, sVar.f17162o, z10, jVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z10, j jVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.f27322B = str2;
            this.f27323C = z10;
            this.f27324D = jVar;
            this.f27325E = str3;
            this.f27326F = decoderInitializationException;
        }
    }

    protected void F1() {
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void n0() {
    }

    @Override // androidx.media3.exoplayer.AbstractC2123e
    protected void o0() {
    }

    protected void w1() {
    }

    protected void u1(long j10) {
    }

    protected void x1(DecoderInputBuffer decoderInputBuffer) {
    }

    protected void y1(s sVar) {
    }
}
