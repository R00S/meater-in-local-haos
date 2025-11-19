package e2;

import U1.B;
import U1.C1732h;
import U1.C1738n;
import U1.G;
import U1.K;
import U1.v;
import X1.C1804a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.r;
import d2.C3030b;
import e2.InterfaceC3131b;
import e2.u1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import m8.AbstractC4009y;

/* compiled from: MediaMetricsListener.java */
/* loaded from: classes.dex */
public final class t1 implements InterfaceC3131b, u1.a {

    /* renamed from: A, reason: collision with root package name */
    private boolean f40246A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f40247a;

    /* renamed from: b, reason: collision with root package name */
    private final u1 f40248b;

    /* renamed from: c, reason: collision with root package name */
    private final PlaybackSession f40249c;

    /* renamed from: i, reason: collision with root package name */
    private String f40255i;

    /* renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f40256j;

    /* renamed from: k, reason: collision with root package name */
    private int f40257k;

    /* renamed from: n, reason: collision with root package name */
    private PlaybackException f40260n;

    /* renamed from: o, reason: collision with root package name */
    private b f40261o;

    /* renamed from: p, reason: collision with root package name */
    private b f40262p;

    /* renamed from: q, reason: collision with root package name */
    private b f40263q;

    /* renamed from: r, reason: collision with root package name */
    private U1.s f40264r;

    /* renamed from: s, reason: collision with root package name */
    private U1.s f40265s;

    /* renamed from: t, reason: collision with root package name */
    private U1.s f40266t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f40267u;

    /* renamed from: v, reason: collision with root package name */
    private int f40268v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f40269w;

    /* renamed from: x, reason: collision with root package name */
    private int f40270x;

    /* renamed from: y, reason: collision with root package name */
    private int f40271y;

    /* renamed from: z, reason: collision with root package name */
    private int f40272z;

    /* renamed from: e, reason: collision with root package name */
    private final G.c f40251e = new G.c();

    /* renamed from: f, reason: collision with root package name */
    private final G.b f40252f = new G.b();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f40254h = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f40253g = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f40250d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    private int f40258l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f40259m = 0;

    /* compiled from: MediaMetricsListener.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f40273a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40274b;

        public a(int i10, int i11) {
            this.f40273a = i10;
            this.f40274b = i11;
        }
    }

    /* compiled from: MediaMetricsListener.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final U1.s f40275a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40276b;

        /* renamed from: c, reason: collision with root package name */
        public final String f40277c;

        public b(U1.s sVar, int i10, String str) {
            this.f40275a = sVar;
            this.f40276b = i10;
            this.f40277c = str;
        }
    }

    private t1(Context context, PlaybackSession playbackSession) {
        this.f40247a = context.getApplicationContext();
        this.f40249c = playbackSession;
        C3163r0 c3163r0 = new C3163r0();
        this.f40248b = c3163r0;
        c3163r0.d(this);
    }

    private static a A0(PlaybackException playbackException, Context context, boolean z10) throws NumberFormatException {
        int i10;
        boolean z11;
        if (playbackException.f26031B == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.f26315K == 1;
            i10 = exoPlaybackException.f26319O;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) C1804a.e(playbackException.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, X1.L.a0(((MediaCodecRenderer.DecoderInitializationException) th).f27325E));
            }
            if (th instanceof MediaCodecDecoderException) {
                return new a(14, ((MediaCodecDecoderException) th).f27255D);
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th).f26613B);
            }
            if (th instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th).f26618B);
            }
            if (!(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(x0(errorCode), errorCode);
        }
        if (th instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th).f26140E);
        }
        if ((th instanceof HttpDataSource$InvalidContentTypeException) || (th instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th instanceof HttpDataSource$HttpDataSourceException;
        if (z12 || (th instanceof UdpDataSource.UdpDataSourceException)) {
            if (X1.s.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z12 && ((HttpDataSource$HttpDataSourceException) th).f26138D == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f26031B == 1002) {
            return new a(21, 0);
        }
        if (th instanceof DrmSession.DrmSessionException) {
            Throwable th2 = (Throwable) C1804a.e(th.getCause());
            if (!(th2 instanceof MediaDrm.MediaDrmStateException)) {
                return (X1.L.f18626a < 23 || !(th2 instanceof MediaDrmResetException)) ? th2 instanceof NotProvisionedException ? new a(24, 0) : th2 instanceof DeniedByServerException ? new a(29, 0) : th2 instanceof UnsupportedDrmException ? new a(23, 0) : th2 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0) : new a(27, 0);
            }
            int iA0 = X1.L.a0(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
            return new a(x0(iA0), iA0);
        }
        if (!(th instanceof FileDataSource.FileDataSourceException) || !(th.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) C1804a.e(th.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    private static Pair<String, String> B0(String str) {
        String[] strArrL1 = X1.L.l1(str, "-");
        return Pair.create(strArrL1[0], strArrL1.length >= 2 ? strArrL1[1] : null);
    }

    private static int D0(Context context) {
        switch (X1.s.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return 7;
        }
    }

    private static int E0(U1.v vVar) {
        v.h hVar = vVar.f17234b;
        if (hVar == null) {
            return 0;
        }
        int iZ0 = X1.L.z0(hVar.f17326a, hVar.f17327b);
        if (iZ0 == 0) {
            return 3;
        }
        if (iZ0 != 1) {
            return iZ0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int F0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void G0(InterfaceC3131b.C0509b c0509b) {
        for (int i10 = 0; i10 < c0509b.d(); i10++) {
            int iB = c0509b.b(i10);
            InterfaceC3131b.a aVarC = c0509b.c(iB);
            if (iB == 0) {
                this.f40248b.b(aVarC);
            } else if (iB == 11) {
                this.f40248b.c(aVarC, this.f40257k);
            } else {
                this.f40248b.e(aVarC);
            }
        }
    }

    private void H0(long j10) {
        int iD0 = D0(this.f40247a);
        if (iD0 != this.f40259m) {
            this.f40259m = iD0;
            this.f40249c.reportNetworkEvent(D0.a().setNetworkType(iD0).setTimeSinceCreatedMillis(j10 - this.f40250d).build());
        }
    }

    private void I0(long j10) throws NumberFormatException {
        PlaybackException playbackException = this.f40260n;
        if (playbackException == null) {
            return;
        }
        a aVarA0 = A0(playbackException, this.f40247a, this.f40268v == 4);
        this.f40249c.reportPlaybackErrorEvent(Z0.a().setTimeSinceCreatedMillis(j10 - this.f40250d).setErrorCode(aVarA0.f40273a).setSubErrorCode(aVarA0.f40274b).setException(playbackException).build());
        this.f40246A = true;
        this.f40260n = null;
    }

    private void J0(U1.B b10, InterfaceC3131b.C0509b c0509b, long j10) {
        if (b10.K() != 2) {
            this.f40267u = false;
        }
        if (b10.E() == null) {
            this.f40269w = false;
        } else if (c0509b.a(10)) {
            this.f40269w = true;
        }
        int iR0 = R0(b10);
        if (this.f40258l != iR0) {
            this.f40258l = iR0;
            this.f40246A = true;
            this.f40249c.reportPlaybackStateEvent(k1.a().setState(this.f40258l).setTimeSinceCreatedMillis(j10 - this.f40250d).build());
        }
    }

    private void K0(U1.B b10, InterfaceC3131b.C0509b c0509b, long j10) {
        if (c0509b.a(2)) {
            U1.K kL = b10.L();
            boolean zC = kL.c(2);
            boolean zC2 = kL.c(1);
            boolean zC3 = kL.c(3);
            if (zC || zC2 || zC3) {
                if (!zC) {
                    P0(j10, null, 0);
                }
                if (!zC2) {
                    L0(j10, null, 0);
                }
                if (!zC3) {
                    N0(j10, null, 0);
                }
            }
        }
        if (u0(this.f40261o)) {
            b bVar = this.f40261o;
            U1.s sVar = bVar.f40275a;
            if (sVar.f17170w != -1) {
                P0(j10, sVar, bVar.f40276b);
                this.f40261o = null;
            }
        }
        if (u0(this.f40262p)) {
            b bVar2 = this.f40262p;
            L0(j10, bVar2.f40275a, bVar2.f40276b);
            this.f40262p = null;
        }
        if (u0(this.f40263q)) {
            b bVar3 = this.f40263q;
            N0(j10, bVar3.f40275a, bVar3.f40276b);
            this.f40263q = null;
        }
    }

    private void L0(long j10, U1.s sVar, int i10) {
        if (X1.L.d(this.f40265s, sVar)) {
            return;
        }
        if (this.f40265s == null && i10 == 0) {
            i10 = 1;
        }
        this.f40265s = sVar;
        Q0(0, j10, sVar, i10);
    }

    private void M0(U1.B b10, InterfaceC3131b.C0509b c0509b) {
        C1738n c1738nY0;
        if (c0509b.a(0)) {
            InterfaceC3131b.a aVarC = c0509b.c(0);
            if (this.f40256j != null) {
                O0(aVarC.f40134b, aVarC.f40136d);
            }
        }
        if (c0509b.a(2) && this.f40256j != null && (c1738nY0 = y0(b10.L().a())) != null) {
            L0.a(X1.L.i(this.f40256j)).setDrmType(z0(c1738nY0));
        }
        if (c0509b.a(1011)) {
            this.f40272z++;
        }
    }

    private void N0(long j10, U1.s sVar, int i10) {
        if (X1.L.d(this.f40266t, sVar)) {
            return;
        }
        if (this.f40266t == null && i10 == 0) {
            i10 = 1;
        }
        this.f40266t = sVar;
        Q0(2, j10, sVar, i10);
    }

    private void O0(U1.G g10, r.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f40256j;
        if (bVar == null || (iB = g10.b(bVar.f27812a)) == -1) {
            return;
        }
        g10.f(iB, this.f40252f);
        g10.n(this.f40252f.f16823c, this.f40251e);
        builder.setStreamType(E0(this.f40251e.f16846c));
        G.c cVar = this.f40251e;
        if (cVar.f16856m != -9223372036854775807L && !cVar.f16854k && !cVar.f16852i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f40251e.d());
        }
        builder.setPlaybackType(this.f40251e.f() ? 2 : 1);
        this.f40246A = true;
    }

    private void P0(long j10, U1.s sVar, int i10) {
        if (X1.L.d(this.f40264r, sVar)) {
            return;
        }
        if (this.f40264r == null && i10 == 0) {
            i10 = 1;
        }
        this.f40264r = sVar;
        Q0(1, j10, sVar, i10);
    }

    private void Q0(int i10, long j10, U1.s sVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = C3165s0.a(i10).setTimeSinceCreatedMillis(j10 - this.f40250d);
        if (sVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(F0(i11));
            String str = sVar.f17161n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = sVar.f17162o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = sVar.f17158k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = sVar.f17157j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = sVar.f17169v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = sVar.f17170w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = sVar.f17137D;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = sVar.f17138E;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = sVar.f17151d;
            if (str4 != null) {
                Pair<String, String> pairB0 = B0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairB0.first);
                Object obj = pairB0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = sVar.f17171x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f40246A = true;
        this.f40249c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int R0(U1.B b10) {
        int iK = b10.K();
        if (this.f40267u) {
            return 5;
        }
        if (this.f40269w) {
            return 13;
        }
        if (iK == 4) {
            return 11;
        }
        if (iK == 2) {
            int i10 = this.f40258l;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (b10.o()) {
                return b10.V() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iK == 3) {
            if (b10.o()) {
                return b10.V() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iK != 1 || this.f40258l == 0) {
            return this.f40258l;
        }
        return 12;
    }

    private boolean u0(b bVar) {
        return bVar != null && bVar.f40277c.equals(this.f40248b.a());
    }

    public static t1 v0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = o1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new t1(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void w0() {
        PlaybackMetrics.Builder builder = this.f40256j;
        if (builder != null && this.f40246A) {
            builder.setAudioUnderrunCount(this.f40272z);
            this.f40256j.setVideoFramesDropped(this.f40270x);
            this.f40256j.setVideoFramesPlayed(this.f40271y);
            Long l10 = this.f40253g.get(this.f40255i);
            this.f40256j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f40254h.get(this.f40255i);
            this.f40256j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f40256j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f40249c.reportPlaybackMetrics(this.f40256j.build());
        }
        this.f40256j = null;
        this.f40255i = null;
        this.f40272z = 0;
        this.f40270x = 0;
        this.f40271y = 0;
        this.f40264r = null;
        this.f40265s = null;
        this.f40266t = null;
        this.f40246A = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int x0(int i10) {
        switch (X1.L.Z(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static C1738n y0(AbstractC4009y<K.a> abstractC4009y) {
        C1738n c1738n;
        m8.j0<K.a> it = abstractC4009y.iterator();
        while (it.hasNext()) {
            K.a next = it.next();
            for (int i10 = 0; i10 < next.f16977a; i10++) {
                if (next.g(i10) && (c1738n = next.b(i10).f17166s) != null) {
                    return c1738n;
                }
            }
        }
        return null;
    }

    private static int z0(C1738n c1738n) {
        for (int i10 = 0; i10 < c1738n.f17090E; i10++) {
            UUID uuid = c1738n.e(i10).f17092C;
            if (uuid.equals(C1732h.f17050d)) {
                return 3;
            }
            if (uuid.equals(C1732h.f17051e)) {
                return 2;
            }
            if (uuid.equals(C1732h.f17049c)) {
                return 6;
            }
        }
        return 1;
    }

    @Override // e2.u1.a
    public void B(InterfaceC3131b.a aVar, String str) {
        r.b bVar = aVar.f40136d;
        if (bVar == null || !bVar.b()) {
            w0();
            this.f40255i = str;
            this.f40256j = O0.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.1");
            O0(aVar.f40134b, aVar.f40136d);
        }
    }

    public LogSessionId C0() {
        return this.f40249c.getSessionId();
    }

    @Override // e2.u1.a
    public void I(InterfaceC3131b.a aVar, String str, boolean z10) {
        r.b bVar = aVar.f40136d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f40255i)) {
            w0();
        }
        this.f40253g.remove(str);
        this.f40254h.remove(str);
    }

    @Override // e2.InterfaceC3131b
    public void K(InterfaceC3131b.a aVar, C3030b c3030b) {
        this.f40270x += c3030b.f39697g;
        this.f40271y += c3030b.f39695e;
    }

    @Override // e2.InterfaceC3131b
    public void V(InterfaceC3131b.a aVar, int i10, long j10, long j11) {
        r.b bVar = aVar.f40136d;
        if (bVar != null) {
            String strF = this.f40248b.f(aVar.f40134b, (r.b) C1804a.e(bVar));
            Long l10 = this.f40254h.get(strF);
            Long l11 = this.f40253g.get(strF);
            this.f40254h.put(strF, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f40253g.put(strF, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // e2.InterfaceC3131b
    public void a(InterfaceC3131b.a aVar, n2.i iVar, n2.j jVar, IOException iOException, boolean z10) {
        this.f40268v = jVar.f45627a;
    }

    @Override // e2.InterfaceC3131b
    public void f(InterfaceC3131b.a aVar, B.e eVar, B.e eVar2, int i10) {
        if (i10 == 1) {
            this.f40267u = true;
        }
        this.f40257k = i10;
    }

    @Override // e2.InterfaceC3131b
    public void g0(U1.B b10, InterfaceC3131b.C0509b c0509b) throws NumberFormatException {
        if (c0509b.d() == 0) {
            return;
        }
        G0(c0509b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        M0(b10, c0509b);
        I0(jElapsedRealtime);
        K0(b10, c0509b, jElapsedRealtime);
        H0(jElapsedRealtime);
        J0(b10, c0509b, jElapsedRealtime);
        if (c0509b.a(1028)) {
            this.f40248b.g(c0509b.c(1028));
        }
    }

    @Override // e2.InterfaceC3131b
    public void h0(InterfaceC3131b.a aVar, U1.N n10) {
        b bVar = this.f40261o;
        if (bVar != null) {
            U1.s sVar = bVar.f40275a;
            if (sVar.f17170w == -1) {
                this.f40261o = new b(sVar.b().z0(n10.f16986a).c0(n10.f16987b).M(), bVar.f40276b, bVar.f40277c);
            }
        }
    }

    @Override // e2.InterfaceC3131b
    public void m0(InterfaceC3131b.a aVar, n2.j jVar) {
        if (aVar.f40136d == null) {
            return;
        }
        b bVar = new b((U1.s) C1804a.e(jVar.f45629c), jVar.f45630d, this.f40248b.f(aVar.f40134b, (r.b) C1804a.e(aVar.f40136d)));
        int i10 = jVar.f45628b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f40262p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f40263q = bVar;
                return;
            }
        }
        this.f40261o = bVar;
    }

    @Override // e2.InterfaceC3131b
    public void t0(InterfaceC3131b.a aVar, PlaybackException playbackException) {
        this.f40260n = playbackException;
    }

    @Override // e2.u1.a
    public void a0(InterfaceC3131b.a aVar, String str) {
    }

    @Override // e2.u1.a
    public void s0(InterfaceC3131b.a aVar, String str, String str2) {
    }
}
