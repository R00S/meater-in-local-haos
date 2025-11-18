package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzth extends zzpe {

    /* renamed from: V */
    private static final int[] f27050V = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: A0 */
    private long f27051A0;

    /* renamed from: B0 */
    private int f27052B0;

    /* renamed from: W */
    private final Context f27053W;

    /* renamed from: X */
    private final zztl f27054X;

    /* renamed from: Y */
    private final zzto f27055Y;

    /* renamed from: Z */
    private final long f27056Z;

    /* renamed from: a0 */
    private final int f27057a0;

    /* renamed from: b0 */
    private final boolean f27058b0;

    /* renamed from: c0 */
    private final long[] f27059c0;

    /* renamed from: d0 */
    private zzlh[] f27060d0;

    /* renamed from: e0 */
    private zztj f27061e0;

    /* renamed from: f0 */
    private Surface f27062f0;

    /* renamed from: g0 */
    private Surface f27063g0;

    /* renamed from: h0 */
    private int f27064h0;

    /* renamed from: i0 */
    private boolean f27065i0;

    /* renamed from: j0 */
    private long f27066j0;

    /* renamed from: k0 */
    private long f27067k0;

    /* renamed from: l0 */
    private int f27068l0;

    /* renamed from: m0 */
    private int f27069m0;

    /* renamed from: n0 */
    private int f27070n0;

    /* renamed from: o0 */
    private float f27071o0;

    /* renamed from: p0 */
    private int f27072p0;

    /* renamed from: q0 */
    private int f27073q0;

    /* renamed from: r0 */
    private int f27074r0;

    /* renamed from: s0 */
    private float f27075s0;

    /* renamed from: t0 */
    private int f27076t0;

    /* renamed from: u0 */
    private int f27077u0;

    /* renamed from: v0 */
    private int f27078v0;

    /* renamed from: w0 */
    private float f27079w0;

    /* renamed from: x0 */
    private boolean f27080x0;

    /* renamed from: y0 */
    private int f27081y0;

    /* renamed from: z0 */
    t30 f27082z0;

    public zzth(Context context, zzpg zzpgVar, long j2, Handler handler, zztn zztnVar, int i2) {
        this(context, zzpgVar, 0L, null, false, handler, zztnVar, -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m20560a0(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L83
            if (r7 != r0) goto L7
            goto L83
        L7:
            r5.hashCode()
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            switch(r1) {
                case -1664118616: goto L4d;
                case -1662541442: goto L42;
                case 1187890754: goto L37;
                case 1331836730: goto L2c;
                case 1599127256: goto L21;
                case 1599127257: goto L16;
                default: goto L14;
            }
        L14:
            r5 = -1
            goto L57
        L16:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L1f
            goto L14
        L1f:
            r5 = 5
            goto L57
        L21:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L2a
            goto L14
        L2a:
            r5 = 4
            goto L57
        L2c:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L35
            goto L14
        L35:
            r5 = 3
            goto L57
        L37:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L40
            goto L14
        L40:
            r5 = 2
            goto L57
        L42:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L4b
            goto L14
        L4b:
            r5 = 1
            goto L57
        L4d:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L56
            goto L14
        L56:
            r5 = 0
        L57:
            switch(r5) {
                case 0: goto L7a;
                case 1: goto L77;
                case 2: goto L7a;
                case 3: goto L5b;
                case 4: goto L7a;
                case 5: goto L77;
                default: goto L5a;
            }
        L5a:
            return r0
        L5b:
            java.lang.String r5 = com.google.android.gms.internal.ads.zzsy.f27027d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L66
            return r0
        L66:
            r5 = 16
            int r6 = com.google.android.gms.internal.ads.zzsy.m20546j(r6, r5)
            int r5 = com.google.android.gms.internal.ads.zzsy.m20546j(r7, r5)
            int r6 = r6 * r5
            int r5 = r6 << 4
            int r6 = r5 << 4
            goto L7c
        L77:
            int r6 = r6 * r7
            goto L7d
        L7a:
            int r6 = r6 * r7
        L7c:
            r3 = 2
        L7d:
            int r6 = r6 * 3
            int r3 = r3 * 2
            int r6 = r6 / r3
            return r6
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzth.m20560a0(java.lang.String, int, int):int");
    }

    /* renamed from: b0 */
    private final void m20561b0(MediaCodec mediaCodec, int i2, long j2) {
        zzsx.m20535a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        zzsx.m20536b();
        this.f26786U.f26626e++;
    }

    @TargetApi(21)
    /* renamed from: c0 */
    private final void m20562c0(MediaCodec mediaCodec, int i2, long j2, long j3) {
        m20565f0();
        zzsx.m20535a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, j3);
        zzsx.m20536b();
        this.f26786U.f26625d++;
        this.f27069m0 = 0;
        m20575l0();
    }

    /* renamed from: d0 */
    private static boolean m20563d0(boolean z, zzlh zzlhVar, zzlh zzlhVar2) {
        if (!zzlhVar.f26470k.equals(zzlhVar2.f26470k) || m20568i0(zzlhVar) != m20568i0(zzlhVar2)) {
            return false;
        }
        if (z) {
            return true;
        }
        return zzlhVar.f26474o == zzlhVar2.f26474o && zzlhVar.f26475p == zzlhVar2.f26475p;
    }

    /* renamed from: e0 */
    private final void m20564e0(MediaCodec mediaCodec, int i2, long j2) {
        m20565f0();
        zzsx.m20535a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, true);
        zzsx.m20536b();
        this.f26786U.f26625d++;
        this.f27069m0 = 0;
        m20575l0();
    }

    /* renamed from: f0 */
    private final void m20565f0() {
        int i2 = this.f27076t0;
        int i3 = this.f27072p0;
        if (i2 == i3 && this.f27077u0 == this.f27073q0 && this.f27078v0 == this.f27074r0 && this.f27079w0 == this.f27075s0) {
            return;
        }
        this.f27055Y.m20581b(i3, this.f27073q0, this.f27074r0, this.f27075s0);
        this.f27076t0 = this.f27072p0;
        this.f27077u0 = this.f27073q0;
        this.f27078v0 = this.f27074r0;
        this.f27079w0 = this.f27075s0;
    }

    /* renamed from: g0 */
    private static boolean m20566g0(long j2) {
        return j2 < -30000;
    }

    /* renamed from: h0 */
    private static int m20567h0(zzlh zzlhVar) {
        int i2 = zzlhVar.f26471l;
        return i2 != -1 ? i2 : m20560a0(zzlhVar.f26470k, zzlhVar.f26474o, zzlhVar.f26475p);
    }

    /* renamed from: i0 */
    private static int m20568i0(zzlh zzlhVar) {
        int i2 = zzlhVar.f26477r;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    /* renamed from: j0 */
    private final void m20569j0() {
        this.f27066j0 = this.f27056Z > 0 ? SystemClock.elapsedRealtime() + this.f27056Z : -9223372036854775807L;
    }

    /* renamed from: k0 */
    private final void m20570k0() {
        MediaCodec mediaCodecM20375W;
        this.f27065i0 = false;
        if (zzsy.f27024a < 23 || !this.f27080x0 || (mediaCodecM20375W = m20375W()) == null) {
            return;
        }
        this.f27082z0 = new t30(this, mediaCodecM20375W);
    }

    /* renamed from: m0 */
    private final void m20571m0() {
        this.f27076t0 = -1;
        this.f27077u0 = -1;
        this.f27079w0 = -1.0f;
        this.f27078v0 = -1;
    }

    /* renamed from: n0 */
    private final void m20572n0() {
        if (this.f27076t0 == -1 && this.f27077u0 == -1) {
            return;
        }
        this.f27055Y.m20581b(this.f27072p0, this.f27073q0, this.f27074r0, this.f27075s0);
    }

    /* renamed from: o0 */
    private final void m20573o0() {
        if (this.f27068l0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f27055Y.m20587h(this.f27068l0, jElapsedRealtime - this.f27067k0);
            this.f27068l0 = 0;
            this.f27067k0 = jElapsedRealtime;
        }
    }

    /* renamed from: p0 */
    private final boolean m20574p0(boolean z) {
        if (zzsy.f27024a < 23 || this.f27080x0) {
            return false;
        }
        return !z || zztd.m20558b(this.f27053W);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: A */
    protected final void mo20277A(zzlh zzlhVar) throws zzku {
        super.mo20277A(zzlhVar);
        this.f27055Y.m20583d(zzlhVar);
        float f2 = zzlhVar.f26478s;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.f27071o0 = f2;
        this.f27070n0 = m20568i0(zzlhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzlo
    /* renamed from: B */
    public final boolean mo20212B() {
        Surface surface;
        if (super.mo20212B() && (this.f27065i0 || (((surface = this.f27063g0) != null && this.f27062f0 == surface) || m20375W() == null))) {
            this.f27066j0 = -9223372036854775807L;
            return true;
        }
        if (this.f27066j0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f27066j0) {
            return true;
        }
        this.f27066j0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: R */
    protected final void mo20278R(String str, long j2, long j3) {
        this.f27055Y.m20585f(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: U */
    protected final void mo20374U() {
        try {
            super.mo20374U();
            Surface surface = this.f27063g0;
            if (surface != null) {
                if (this.f27062f0 == surface) {
                    this.f27062f0 = null;
                }
                surface.release();
                this.f27063g0 = null;
            }
        } catch (Throwable th) {
            if (this.f27063g0 != null) {
                Surface surface2 = this.f27062f0;
                Surface surface3 = this.f27063g0;
                if (surface2 == surface3) {
                    this.f27062f0 = null;
                }
                surface3.release();
                this.f27063g0 = null;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzkx
    /* renamed from: f */
    public final void mo20177f(int i2, Object obj) throws zzku {
        if (i2 != 1) {
            if (i2 != 4) {
                super.mo20177f(i2, obj);
                return;
            }
            this.f27064h0 = ((Integer) obj).intValue();
            MediaCodec mediaCodecM20375W = m20375W();
            if (mediaCodecM20375W != null) {
                mediaCodecM20375W.setVideoScalingMode(this.f27064h0);
                return;
            }
            return;
        }
        Surface surfaceM20557a = (Surface) obj;
        if (surfaceM20557a == null) {
            Surface surface = this.f27063g0;
            if (surface != null) {
                surfaceM20557a = surface;
            } else {
                zzpd zzpdVarM20376X = m20376X();
                if (zzpdVarM20376X != null && m20574p0(zzpdVarM20376X.f26762d)) {
                    surfaceM20557a = zztd.m20557a(this.f27053W, zzpdVarM20376X.f26762d);
                    this.f27063g0 = surfaceM20557a;
                }
            }
        }
        if (this.f27062f0 == surfaceM20557a) {
            if (surfaceM20557a == null || surfaceM20557a == this.f27063g0) {
                return;
            }
            m20572n0();
            if (this.f27065i0) {
                this.f27055Y.m20582c(this.f27062f0);
                return;
            }
            return;
        }
        this.f27062f0 = surfaceM20557a;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec mediaCodecM20375W2 = m20375W();
            if (zzsy.f27024a < 23 || mediaCodecM20375W2 == null || surfaceM20557a == null) {
                mo20374U();
                m20373T();
            } else {
                mediaCodecM20375W2.setOutputSurface(surfaceM20557a);
            }
        }
        if (surfaceM20557a == null || surfaceM20557a == this.f27063g0) {
            m20571m0();
            m20570k0();
            return;
        }
        m20572n0();
        m20570k0();
        if (state == 2) {
            m20569j0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: h */
    protected final void mo20179h() {
        super.mo20179h();
        this.f27068l0 = 0;
        this.f27067k0 = SystemClock.elapsedRealtime();
        this.f27066j0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: i */
    protected final void mo20180i() {
        m20573o0();
        super.mo20180i();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    /* renamed from: k */
    protected final void mo20182k(zzlh[] zzlhVarArr, long j2) throws zzku {
        this.f27060d0 = zzlhVarArr;
        if (this.f27051A0 == -9223372036854775807L) {
            this.f27051A0 = j2;
        } else {
            int i2 = this.f27052B0;
            long[] jArr = this.f27059c0;
            if (i2 == jArr.length) {
                long j3 = jArr[i2 - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j3);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.f27052B0 = i2 + 1;
            }
            this.f27059c0[this.f27052B0 - 1] = j2;
        }
        super.mo20182k(zzlhVarArr, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: l */
    protected final void mo20183l(long j2, boolean z) throws zzku {
        super.mo20183l(j2, z);
        m20570k0();
        this.f27069m0 = 0;
        int i2 = this.f27052B0;
        if (i2 != 0) {
            this.f27051A0 = this.f27059c0[i2 - 1];
            this.f27052B0 = 0;
        }
        if (z) {
            m20569j0();
        } else {
            this.f27066j0 = -9223372036854775807L;
        }
    }

    /* renamed from: l0 */
    final void m20575l0() {
        if (this.f27065i0) {
            return;
        }
        this.f27065i0 = true;
        this.f27055Y.m20582c(this.f27062f0);
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: n */
    protected final void mo20185n() {
        this.f27072p0 = -1;
        this.f27073q0 = -1;
        this.f27075s0 = -1.0f;
        this.f27071o0 = -1.0f;
        this.f27051A0 = -9223372036854775807L;
        this.f27052B0 = 0;
        m20571m0();
        m20570k0();
        this.f27054X.m20577a();
        this.f27082z0 = null;
        this.f27080x0 = false;
        try {
            super.mo20185n();
        } finally {
            this.f26786U.m20303a();
            this.f27055Y.m20586g(this.f26786U);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: o */
    protected final void mo20186o(boolean z) throws zzku {
        super.mo20186o(z);
        int i2 = m20187p().f26495b;
        this.f27081y0 = i2;
        this.f27080x0 = i2 != 0;
        this.f27055Y.m20584e(this.f26786U);
        this.f27054X.m20578b();
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: r */
    protected final void mo20283r(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f27072p0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f27073q0 = integer;
        float f2 = this.f27071o0;
        this.f27075s0 = f2;
        if (zzsy.f27024a >= 21) {
            int i2 = this.f27070n0;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.f27072p0;
                this.f27072p0 = integer;
                this.f27073q0 = i3;
                this.f27075s0 = 1.0f / f2;
            }
        } else {
            this.f27074r0 = this.f27070n0;
        }
        mediaCodec.setVideoScalingMode(this.f27064h0);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: s */
    protected final int mo20284s(zzpg zzpgVar, zzlh zzlhVar) throws zzpk {
        boolean z;
        int i2;
        int i3;
        String str = zzlhVar.f26470k;
        if (!zzsp.m20496c(str)) {
            return 0;
        }
        zzne zzneVar = zzlhVar.f26473n;
        if (zzneVar != null) {
            z = false;
            for (int i4 = 0; i4 < zzneVar.f26635h; i4++) {
                z |= zzneVar.m20307a(i4).f26640j;
            }
        } else {
            z = false;
        }
        zzpd zzpdVarMo15670b = zzpgVar.mo15670b(str, z);
        if (zzpdVarMo15670b == null) {
            return 1;
        }
        boolean zM20364d = zzpdVarMo15670b.m20364d(zzlhVar.f26467h);
        if (zM20364d && (i2 = zzlhVar.f26474o) > 0 && (i3 = zzlhVar.f26475p) > 0) {
            if (zzsy.f27024a >= 21) {
                zM20364d = zzpdVarMo15670b.m20363b(i2, i3, zzlhVar.f26476q);
            } else {
                boolean z2 = i2 * i3 <= zzpi.m20386g();
                if (!z2) {
                    int i5 = zzlhVar.f26474o;
                    int i6 = zzlhVar.f26475p;
                    String str2 = zzsy.f27028e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                zM20364d = z2;
            }
        }
        return (zM20364d ? 3 : 2) | (zzpdVarMo15670b.f26760b ? 8 : 4) | (zzpdVarMo15670b.f26761c ? 16 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: u */
    protected final void mo20377u(zznd zzndVar) {
        if (zzsy.f27024a >= 23 || !this.f27080x0) {
            return;
        }
        m20575l0();
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: v */
    protected final void mo20286v(zzpd zzpdVar, MediaCodec mediaCodec, zzlh zzlhVar, MediaCrypto mediaCrypto) throws zzpk {
        zztj zztjVar;
        String str;
        Point point;
        zzlh[] zzlhVarArr = this.f27060d0;
        int iMax = zzlhVar.f26474o;
        int iMax2 = zzlhVar.f26475p;
        int iM20567h0 = m20567h0(zzlhVar);
        if (zzlhVarArr.length == 1) {
            zztjVar = new zztj(iMax, iMax2, iM20567h0);
        } else {
            boolean z = false;
            for (zzlh zzlhVar2 : zzlhVarArr) {
                if (m20563d0(zzpdVar.f26760b, zzlhVar, zzlhVar2)) {
                    int i2 = zzlhVar2.f26474o;
                    z |= i2 == -1 || zzlhVar2.f26475p == -1;
                    iMax = Math.max(iMax, i2);
                    iMax2 = Math.max(iMax2, zzlhVar2.f26475p);
                    iM20567h0 = Math.max(iM20567h0, m20567h0(zzlhVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                String str2 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i3 = zzlhVar.f26475p;
                int i4 = zzlhVar.f26474o;
                boolean z2 = i3 > i4;
                int i5 = z2 ? i3 : i4;
                if (z2) {
                    i3 = i4;
                }
                float f2 = i3 / i5;
                int[] iArr = f27050V;
                int length = iArr.length;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = length;
                    int i8 = iArr[i6];
                    int[] iArr2 = iArr;
                    int i9 = (int) (i8 * f2);
                    if (i8 <= i5 || i9 <= i3) {
                        break;
                    }
                    int i10 = i3;
                    float f3 = f2;
                    if (zzsy.f27024a >= 21) {
                        int i11 = z2 ? i9 : i8;
                        if (!z2) {
                            i8 = i9;
                        }
                        point = zzpdVar.m20367i(i11, i8);
                        str = str2;
                        if (zzpdVar.m20363b(point.x, point.y, zzlhVar.f26476q)) {
                            break;
                        }
                        i6++;
                        length = i7;
                        iArr = iArr2;
                        i3 = i10;
                        f2 = f3;
                        str2 = str;
                    } else {
                        str = str2;
                        int iM20546j = zzsy.m20546j(i8, 16) << 4;
                        int iM20546j2 = zzsy.m20546j(i9, 16) << 4;
                        if (iM20546j * iM20546j2 <= zzpi.m20386g()) {
                            int i12 = z2 ? iM20546j2 : iM20546j;
                            if (!z2) {
                                iM20546j = iM20546j2;
                            }
                            point = new Point(i12, iM20546j);
                        } else {
                            i6++;
                            length = i7;
                            iArr = iArr2;
                            i3 = i10;
                            f2 = f3;
                            str2 = str;
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iM20567h0 = Math.max(iM20567h0, m20560a0(zzlhVar.f26470k, iMax, iMax2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax);
                    sb2.append("x");
                    sb2.append(iMax2);
                    Log.w(str, sb2.toString());
                }
            }
            zztjVar = new zztj(iMax, iMax2, iM20567h0);
        }
        this.f27061e0 = zztjVar;
        boolean z3 = this.f27058b0;
        int i13 = this.f27081y0;
        MediaFormat mediaFormatM20209m = zzlhVar.m20209m();
        mediaFormatM20209m.setInteger("max-width", zztjVar.f27083a);
        mediaFormatM20209m.setInteger("max-height", zztjVar.f27084b);
        int i14 = zztjVar.f27085c;
        if (i14 != -1) {
            mediaFormatM20209m.setInteger("max-input-size", i14);
        }
        if (z3) {
            mediaFormatM20209m.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            mediaFormatM20209m.setFeatureEnabled("tunneled-playback", true);
            mediaFormatM20209m.setInteger("audio-session-id", i13);
        }
        if (this.f27062f0 == null) {
            zzsk.m20481e(m20574p0(zzpdVar.f26762d));
            if (this.f27063g0 == null) {
                this.f27063g0 = zztd.m20557a(this.f27053W, zzpdVar.f26762d);
            }
            this.f27062f0 = this.f27063g0;
        }
        mediaCodec.configure(mediaFormatM20209m, this.f27062f0, (MediaCrypto) null, 0);
        if (zzsy.f27024a < 23 || !this.f27080x0) {
            return;
        }
        this.f27082z0 = new t30(this, mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: x */
    protected final boolean mo20287x(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws InterruptedException {
        while (true) {
            int i4 = this.f27052B0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f27059c0;
            if (j4 < jArr[0]) {
                break;
            }
            this.f27051A0 = jArr[0];
            int i5 = i4 - 1;
            this.f27052B0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j5 = j4 - this.f27051A0;
        if (z) {
            m20561b0(mediaCodec, i2, j5);
            return true;
        }
        long j6 = j4 - j2;
        if (this.f27062f0 == this.f27063g0) {
            if (!m20566g0(j6)) {
                return false;
            }
            m20561b0(mediaCodec, i2, j5);
            return true;
        }
        if (!this.f27065i0) {
            if (zzsy.f27024a >= 21) {
                m20562c0(mediaCodec, i2, j5, System.nanoTime());
            } else {
                m20564e0(mediaCodec, i2, j5);
            }
            return true;
        }
        if (getState() != 2) {
            return false;
        }
        long jElapsedRealtime = j6 - ((SystemClock.elapsedRealtime() * 1000) - j3);
        long jNanoTime = System.nanoTime();
        long jM20579c = this.f27054X.m20579c(j4, (jElapsedRealtime * 1000) + jNanoTime);
        long j7 = (jM20579c - jNanoTime) / 1000;
        if (!m20566g0(j7)) {
            if (zzsy.f27024a >= 21) {
                if (j7 < 50000) {
                    m20562c0(mediaCodec, i2, j5, jM20579c);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m20564e0(mediaCodec, i2, j5);
                return true;
            }
            return false;
        }
        zzsx.m20535a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        zzsx.m20536b();
        zznc zzncVar = this.f26786U;
        zzncVar.f26627f++;
        this.f27068l0++;
        int i6 = this.f27069m0 + 1;
        this.f27069m0 = i6;
        zzncVar.f26628g = Math.max(i6, zzncVar.f26628g);
        if (this.f27068l0 == this.f27057a0) {
            m20573o0();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: y */
    protected final boolean mo20378y(MediaCodec mediaCodec, boolean z, zzlh zzlhVar, zzlh zzlhVar2) {
        if (!m20563d0(z, zzlhVar, zzlhVar2)) {
            return false;
        }
        int i2 = zzlhVar2.f26474o;
        zztj zztjVar = this.f27061e0;
        return i2 <= zztjVar.f27083a && zzlhVar2.f26475p <= zztjVar.f27084b && zzlhVar2.f26471l <= zztjVar.f27085c;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: z */
    protected final boolean mo20379z(zzpd zzpdVar) {
        return this.f27062f0 != null || m20574p0(zzpdVar.f26762d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzth(Context context, zzpg zzpgVar, long j2, zznj<Object> zznjVar, boolean z, Handler handler, zztn zztnVar, int i2) {
        super(2, zzpgVar, null, false);
        boolean z2 = false;
        this.f27056Z = 0L;
        this.f27057a0 = -1;
        this.f27053W = context.getApplicationContext();
        this.f27054X = new zztl(context);
        this.f27055Y = new zzto(handler, zztnVar);
        if (zzsy.f27024a <= 22 && "foster".equals(zzsy.f27025b) && "NVIDIA".equals(zzsy.f27026c)) {
            z2 = true;
        }
        this.f27058b0 = z2;
        this.f27059c0 = new long[10];
        this.f27051A0 = -9223372036854775807L;
        this.f27066j0 = -9223372036854775807L;
        this.f27072p0 = -1;
        this.f27073q0 = -1;
        this.f27075s0 = -1.0f;
        this.f27071o0 = -1.0f;
        this.f27064h0 = 1;
        m20571m0();
    }
}
