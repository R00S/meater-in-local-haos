package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzhd extends zzgr {

    /* renamed from: G */
    private final zzhi f26174G;

    /* renamed from: H */
    private final zzhh f26175H;

    /* renamed from: I */
    private final long f26176I;

    /* renamed from: J */
    private final int f26177J;

    /* renamed from: K */
    private final int f26178K;

    /* renamed from: L */
    private Surface f26179L;

    /* renamed from: M */
    private boolean f26180M;

    /* renamed from: N */
    private boolean f26181N;

    /* renamed from: O */
    private long f26182O;

    /* renamed from: P */
    private long f26183P;

    /* renamed from: Q */
    private int f26184Q;

    /* renamed from: R */
    private int f26185R;

    /* renamed from: S */
    private int f26186S;

    /* renamed from: T */
    private float f26187T;

    /* renamed from: U */
    private int f26188U;

    /* renamed from: V */
    private int f26189V;

    /* renamed from: W */
    private float f26190W;

    public zzhd(zzhn zzhnVar, int i2, long j2, Handler handler, zzhh zzhhVar, int i3) {
        this(zzhnVar, null, true, 1, 0L, null, handler, zzhhVar, -1);
    }

    /* renamed from: O */
    private final void m20015O(MediaCodec mediaCodec, int i2) {
        m20016P();
        zzkp.m20153a("renderVideoBufferImmediate");
        mediaCodec.releaseOutputBuffer(i2, true);
        zzkp.m20154b();
        this.f26140b.f26104e++;
        this.f26181N = true;
        m20017Q();
    }

    /* renamed from: P */
    private final void m20016P() {
        Handler handler = this.f26149k;
        if (handler == null || this.f26175H == null) {
            return;
        }
        int i2 = this.f26188U;
        int i3 = this.f26185R;
        if (i2 == i3 && this.f26189V == this.f26186S && this.f26190W == this.f26187T) {
            return;
        }
        int i4 = this.f26186S;
        float f2 = this.f26187T;
        handler.post(new RunnableC6839jz(this, i3, i4, f2));
        this.f26188U = i3;
        this.f26189V = i4;
        this.f26190W = f2;
    }

    /* renamed from: Q */
    private final void m20017Q() {
        Handler handler = this.f26149k;
        if (handler == null || this.f26175H == null || this.f26180M) {
            return;
        }
        handler.post(new RunnableC6876kz(this, this.f26179L));
        this.f26180M = true;
    }

    /* renamed from: R */
    private final void m20018R() {
        if (this.f26149k == null || this.f26175H == null || this.f26184Q == 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f26149k.post(new RunnableC6913lz(this, this.f26184Q, jElapsedRealtime - this.f26183P));
        this.f26184Q = 0;
        this.f26183P = jElapsedRealtime;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: A */
    protected final void mo19980A(zzhj zzhjVar, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f26185R = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.f26186S = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: B */
    protected final void mo19999B(zzhk zzhkVar) throws zzgd, IOException {
        super.mo19999B(zzhkVar);
        float f2 = zzhkVar.f26204a.f26196f;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.f26187T = f2;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: C */
    protected final boolean mo19981C(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2, boolean z) throws InterruptedException {
        if (z) {
            zzkp.m20153a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i2, false);
            zzkp.m20154b();
            this.f26140b.f26105f++;
            return true;
        }
        long jElapsedRealtime = (bufferInfo.presentationTimeUs - j2) - ((SystemClock.elapsedRealtime() * 1000) - j3);
        long jNanoTime = System.nanoTime() + (jElapsedRealtime * 1000);
        if (jElapsedRealtime < -30000) {
            zzkp.m20153a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i2, false);
            zzkp.m20154b();
            this.f26140b.f26106g++;
            int i3 = this.f26184Q + 1;
            this.f26184Q = i3;
            if (i3 == this.f26178K) {
                m20018R();
            }
            return true;
        }
        if (!this.f26181N) {
            m20015O(mediaCodec, i2);
            return true;
        }
        if (m20031c() != 3) {
            return false;
        }
        if (zzkq.f26428a >= 21) {
            if (jElapsedRealtime < 50000) {
                m20016P();
                zzkp.m20153a("releaseOutputBufferTimed");
                mediaCodec.releaseOutputBuffer(i2, jNanoTime);
                zzkp.m20154b();
                this.f26140b.f26104e++;
                this.f26181N = true;
                m20017Q();
                return true;
            }
        } else if (jElapsedRealtime < 30000) {
            if (jElapsedRealtime > 11000) {
                try {
                    Thread.sleep((jElapsedRealtime - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            m20015O(mediaCodec, i2);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: D */
    protected final boolean mo20000D(MediaCodec mediaCodec, boolean z, zzhj zzhjVar, zzhj zzhjVar2) {
        if (!zzhjVar2.f26191a.equals(zzhjVar.f26191a)) {
            return false;
        }
        if (z) {
            return true;
        }
        return zzhjVar.f26194d == zzhjVar2.f26194d && zzhjVar.f26195e == zzhjVar2.f26195e;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: E */
    protected final boolean mo19982E(String str) {
        return zzkl.m20136a(str).equals("video") && super.mo19982E(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: I */
    protected final boolean mo20002I() {
        Surface surface;
        return super.mo20002I() && (surface = this.f26179L) != null && surface.isValid();
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: d */
    protected final boolean mo19984d() {
        if (super.mo19984d() && (this.f26181N || !m20003J() || m20005M() == 2)) {
            this.f26182O = -1L;
            return true;
        }
        if (this.f26182O == -1) {
            return false;
        }
        if (SystemClock.elapsedRealtime() * 1000 < this.f26182O) {
            return true;
        }
        this.f26182O = -1L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: e */
    protected final void mo19985e() {
        super.mo19985e();
        this.f26184Q = 0;
        this.f26183P = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzgf
    /* renamed from: f */
    public final void mo19966f(int i2, Object obj) throws zzgd, IOException {
        if (i2 != 1) {
            super.mo19966f(i2, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (this.f26179L != surface) {
            this.f26179L = surface;
            this.f26180M = false;
            int iM20031c = m20031c();
            if (iM20031c == 2 || iM20031c == 3) {
                m20004K();
                m20001H();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: g */
    protected final void mo19986g() {
        this.f26182O = -1L;
        m20018R();
        super.mo19986g();
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: i */
    protected final void mo19987i(long j2) throws zzgd {
        super.mo19987i(j2);
        this.f26181N = false;
        this.f26182O = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: m */
    protected final void mo19988m(long j2, boolean z) {
        super.mo19988m(j2, z);
        this.f26181N = false;
        if (!z || this.f26176I <= 0) {
            return;
        }
        this.f26182O = (SystemClock.elapsedRealtime() * 1000) + this.f26176I;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: u */
    public final void mo19992u() {
        this.f26185R = -1;
        this.f26186S = -1;
        this.f26187T = -1.0f;
        this.f26188U = -1;
        this.f26189V = -1;
        this.f26190W = -1.0f;
        super.mo19992u();
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: y */
    protected final void mo19993y(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, this.f26179L, mediaCrypto, 0);
        mediaCodec.setVideoScalingMode(this.f26177J);
    }

    private zzhd(zzhn zzhnVar, zzhz zzhzVar, boolean z, int i2, long j2, zzhi zzhiVar, Handler handler, zzhh zzhhVar, int i3) {
        super(zzhnVar, null, true, handler, zzhhVar);
        this.f26177J = 1;
        this.f26176I = 0L;
        this.f26174G = null;
        this.f26175H = zzhhVar;
        this.f26178K = -1;
        this.f26182O = -1L;
        this.f26185R = -1;
        this.f26186S = -1;
        this.f26187T = -1.0f;
        this.f26188U = -1;
        this.f26189V = -1;
        this.f26190W = -1.0f;
    }
}
