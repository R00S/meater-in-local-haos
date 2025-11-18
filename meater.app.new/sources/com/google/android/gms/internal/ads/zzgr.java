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
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class zzgr extends zzhp {

    /* renamed from: A */
    private int f26134A;

    /* renamed from: B */
    private boolean f26135B;

    /* renamed from: C */
    private boolean f26136C;

    /* renamed from: D */
    private boolean f26137D;

    /* renamed from: E */
    private boolean f26138E;

    /* renamed from: F */
    private long f26139F;

    /* renamed from: b */
    public final zzga f26140b;

    /* renamed from: c */
    private final zzhz f26141c;

    /* renamed from: d */
    private final boolean f26142d;

    /* renamed from: e */
    private final zzhn f26143e;

    /* renamed from: f */
    private final zzhm f26144f;

    /* renamed from: g */
    private final zzhk f26145g;

    /* renamed from: h */
    private final List<Long> f26146h;

    /* renamed from: i */
    private final MediaCodec.BufferInfo f26147i;

    /* renamed from: j */
    private final zzgw f26148j;

    /* renamed from: k */
    protected final Handler f26149k;

    /* renamed from: l */
    private zzhj f26150l;

    /* renamed from: m */
    private zzhw f26151m;

    /* renamed from: n */
    private MediaCodec f26152n;

    /* renamed from: o */
    private boolean f26153o;

    /* renamed from: p */
    private ByteBuffer[] f26154p;

    /* renamed from: q */
    private ByteBuffer[] f26155q;

    /* renamed from: r */
    private long f26156r;

    /* renamed from: s */
    private int f26157s;

    /* renamed from: t */
    private int f26158t;

    /* renamed from: u */
    private boolean f26159u;

    /* renamed from: v */
    private boolean f26160v;

    /* renamed from: w */
    private int f26161w;

    /* renamed from: x */
    private int f26162x;

    /* renamed from: y */
    private boolean f26163y;

    /* renamed from: z */
    private int f26164z;

    public zzgr(zzhn zzhnVar, zzhz zzhzVar, boolean z, Handler handler, zzgw zzgwVar) {
        zzkh.m20129d(zzkq.f26428a >= 16);
        this.f26143e = zzhnVar;
        this.f26141c = null;
        this.f26142d = true;
        this.f26149k = handler;
        this.f26148j = zzgwVar;
        this.f26140b = new zzga();
        this.f26144f = new zzhm(0);
        this.f26145g = new zzhk();
        this.f26146h = new ArrayList();
        this.f26147i = new MediaCodec.BufferInfo();
        this.f26161w = 0;
        this.f26162x = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m19994G(boolean r18) throws com.google.android.gms.internal.ads.zzgd, android.media.MediaCodec.CryptoException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.m19994G(boolean):boolean");
    }

    /* renamed from: L */
    private final void m19995L() throws zzgd, IOException {
        this.f26156r = -1L;
        this.f26157s = -1;
        this.f26158t = -1;
        this.f26138E = true;
        this.f26137D = false;
        this.f26146h.clear();
        if (zzkq.f26428a < 18 || this.f26162x != 0) {
            m20004K();
            m20001H();
        } else {
            this.f26152n.flush();
            this.f26163y = false;
        }
        if (!this.f26160v || this.f26150l == null) {
            return;
        }
        this.f26161w = 1;
    }

    /* renamed from: x */
    private final void m19997x(MediaCodec.CryptoException cryptoException) {
        Handler handler = this.f26149k;
        if (handler == null || this.f26148j == null) {
            return;
        }
        handler.post(new RunnableC6617dz(this, cryptoException));
    }

    /* renamed from: z */
    private final void m19998z(zzgv zzgvVar) throws zzgd {
        Handler handler = this.f26149k;
        if (handler != null && this.f26148j != null) {
            handler.post(new RunnableC6580cz(this, zzgvVar));
        }
        throw new zzgd(zzgvVar);
    }

    /* renamed from: A */
    protected void mo19980A(zzhj zzhjVar, MediaFormat mediaFormat) {
    }

    /* renamed from: B */
    protected void mo19999B(zzhk zzhkVar) throws zzgd, IOException {
        zzhj zzhjVar = this.f26150l;
        zzhj zzhjVar2 = zzhkVar.f26204a;
        this.f26150l = zzhjVar2;
        this.f26151m = zzhkVar.f26205b;
        MediaCodec mediaCodec = this.f26152n;
        if (mediaCodec != null && mo20000D(mediaCodec, this.f26153o, zzhjVar, zzhjVar2)) {
            this.f26160v = true;
            this.f26161w = 1;
        } else if (this.f26163y) {
            this.f26162x = 1;
        } else {
            m20004K();
            m20001H();
        }
    }

    /* renamed from: C */
    protected abstract boolean mo19981C(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2, boolean z) throws zzgd;

    /* renamed from: D */
    protected boolean mo20000D(MediaCodec mediaCodec, boolean z, zzhj zzhjVar, zzhj zzhjVar2) {
        return false;
    }

    /* renamed from: E */
    protected boolean mo19982E(String str) {
        return true;
    }

    /* renamed from: F */
    protected zzgc mo19983F(String str, boolean z) throws zzgz {
        return zzgx.m20012b(str, z);
    }

    /* renamed from: H */
    protected final void m20001H() throws zzgd, IOException {
        MediaCrypto mediaCryptoM20058d;
        zzgc zzgcVarMo19983F;
        if (mo20002I()) {
            String str = this.f26150l.f26191a;
            boolean zM20055a = false;
            zzhw zzhwVar = this.f26151m;
            if (zzhwVar != null) {
                zzhz zzhzVar = this.f26141c;
                if (zzhzVar == null) {
                    throw new zzgd("Media requires a DrmSessionManager");
                }
                if (!this.f26159u) {
                    zzhzVar.m20057c(zzhwVar);
                    this.f26159u = true;
                }
                int state = this.f26141c.getState();
                if (state == 0) {
                    throw new zzgd(this.f26141c.m20056b());
                }
                if (state != 3 && state != 4) {
                    return;
                }
                mediaCryptoM20058d = this.f26141c.m20058d();
                zM20055a = this.f26141c.m20055a(str);
            } else {
                mediaCryptoM20058d = null;
            }
            try {
                zzgcVarMo19983F = mo19983F(str, zM20055a);
            } catch (zzgz e2) {
                m19998z(new zzgv(this.f26150l, e2, -49998));
                zzgcVarMo19983F = null;
            }
            if (zzgcVarMo19983F == null) {
                m19998z(new zzgv(this.f26150l, (Throwable) null, -49999));
            }
            String str2 = zzgcVarMo19983F.f26114a;
            this.f26153o = zzgcVarMo19983F.f26115b;
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                this.f26152n = mediaCodecCreateByCodecName;
                mo19993y(mediaCodecCreateByCodecName, str2, this.f26150l.m20027i(), mediaCryptoM20058d);
                this.f26152n.start();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = jElapsedRealtime2 - jElapsedRealtime;
                Handler handler = this.f26149k;
                if (handler != null && this.f26148j != null) {
                    handler.post(new RunnableC6654ez(this, str2, jElapsedRealtime2, j2));
                }
                this.f26154p = this.f26152n.getInputBuffers();
                this.f26155q = this.f26152n.getOutputBuffers();
            } catch (Exception e3) {
                m19998z(new zzgv(this.f26150l, e3, str2));
            }
            this.f26156r = m20031c() == 3 ? SystemClock.elapsedRealtime() : -1L;
            this.f26157s = -1;
            this.f26158t = -1;
            this.f26138E = true;
            this.f26140b.f26100a++;
        }
    }

    /* renamed from: I */
    protected boolean mo20002I() {
        return this.f26152n == null && this.f26150l != null;
    }

    /* renamed from: J */
    protected final boolean m20003J() {
        return this.f26152n != null;
    }

    /* renamed from: K */
    protected final void m20004K() {
        if (this.f26152n != null) {
            this.f26156r = -1L;
            this.f26157s = -1;
            this.f26158t = -1;
            this.f26137D = false;
            this.f26146h.clear();
            this.f26154p = null;
            this.f26155q = null;
            this.f26160v = false;
            this.f26163y = false;
            this.f26153o = false;
            this.f26161w = 0;
            this.f26162x = 0;
            this.f26140b.f26101b++;
            try {
                this.f26152n.stop();
                try {
                    this.f26152n.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.f26152n.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: M */
    protected final int m20005M() {
        return this.f26134A;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: b */
    protected final long mo20006b() {
        return this.f26143e.mo19975v(this.f26164z).f26213b;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: d */
    protected boolean mo19984d() {
        if (this.f26150l != null && !this.f26137D) {
            if (this.f26134A == 0 && this.f26158t < 0) {
                if (SystemClock.elapsedRealtime() < this.f26156r + 1000) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: e */
    protected void mo19985e() {
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: g */
    protected void mo19986g() {
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: i */
    protected void mo19987i(long j2) throws zzgd {
        this.f26139F = j2;
        this.f26143e.mo19973t(j2);
        this.f26134A = 0;
        this.f26135B = false;
        this.f26136C = false;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: l */
    protected final void mo20007l(long j2, long j3) throws zzgd {
        int i2;
        boolean z;
        int i3;
        try {
            if (this.f26143e.mo19977x(j2)) {
                i2 = this.f26134A;
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            this.f26134A = i2;
            if (this.f26152n != null && this.f26143e.mo19976w(this.f26164z, this.f26139F, this.f26145g, this.f26144f, true) == -5) {
                m19995L();
            }
            if (this.f26150l == null && this.f26143e.mo19976w(this.f26164z, this.f26139F, this.f26145g, this.f26144f, false) == -4) {
                mo19999B(this.f26145g);
            }
            if (this.f26152n == null && mo20002I()) {
                m20001H();
            }
            if (this.f26152n != null) {
                do {
                    if (this.f26136C) {
                        z = false;
                    } else {
                        if (this.f26158t < 0) {
                            this.f26158t = this.f26152n.dequeueOutputBuffer(this.f26147i, 0L);
                        }
                        int i4 = this.f26158t;
                        if (i4 == -2) {
                            mo19980A(this.f26150l, this.f26152n.getOutputFormat());
                            this.f26140b.f26102c++;
                        } else if (i4 == -3) {
                            this.f26155q = this.f26152n.getOutputBuffers();
                            this.f26140b.f26103d++;
                        } else {
                            if (i4 >= 0) {
                                MediaCodec.BufferInfo bufferInfo = this.f26147i;
                                if ((bufferInfo.flags & 4) == 0) {
                                    long j4 = bufferInfo.presentationTimeUs;
                                    int size = this.f26146h.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size) {
                                            i3 = -1;
                                            break;
                                        } else {
                                            if (this.f26146h.get(i5).longValue() == j4) {
                                                i3 = i5;
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                    MediaCodec mediaCodec = this.f26152n;
                                    ByteBuffer[] byteBufferArr = this.f26155q;
                                    int i6 = this.f26158t;
                                    if (mo19981C(j2, j3, mediaCodec, byteBufferArr[i6], this.f26147i, i6, i3 != -1)) {
                                        if (i3 != -1) {
                                            this.f26146h.remove(i3);
                                        } else {
                                            this.f26139F = this.f26147i.presentationTimeUs;
                                        }
                                        this.f26158t = -1;
                                    }
                                } else if (this.f26162x == 2) {
                                    m20004K();
                                    m20001H();
                                } else {
                                    this.f26136C = true;
                                }
                            }
                            z = false;
                        }
                        z = true;
                    }
                } while (z);
                if (m19994G(true)) {
                    while (m19994G(false)) {
                    }
                }
            }
            this.f26140b.m19962a();
        } catch (IOException e2) {
            throw new zzgd(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: m */
    protected void mo19988m(long j2, boolean z) {
        this.f26143e.mo19970q(this.f26164z, j2);
        this.f26134A = 0;
        this.f26135B = false;
        this.f26136C = false;
        this.f26137D = false;
        this.f26139F = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: o */
    protected final int mo20008o(long j2) throws zzgd {
        try {
            if (!this.f26143e.mo19974u(j2)) {
                return 0;
            }
            for (int i2 = 0; i2 < this.f26143e.mo19972s(); i2++) {
                if (mo19982E(this.f26143e.mo19975v(i2).f26212a)) {
                    this.f26164z = i2;
                    return 1;
                }
            }
            return -1;
        } catch (IOException e2) {
            throw new zzgd(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: q */
    protected final long mo20009q() {
        long jMo19971r = this.f26143e.mo19971r();
        return (jMo19971r == -1 || jMo19971r == -3) ? jMo19971r : Math.max(jMo19971r, mo19991t());
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: s */
    protected boolean mo19990s() {
        return this.f26136C;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: t */
    protected long mo19991t() {
        return this.f26139F;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: u */
    protected void mo19992u() {
        this.f26150l = null;
        this.f26151m = null;
        try {
            m20004K();
            try {
                if (this.f26159u) {
                    this.f26141c.close();
                    this.f26159u = false;
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                if (this.f26159u) {
                    this.f26141c.close();
                    this.f26159u = false;
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: v */
    protected final void mo20010v() {
        this.f26143e.mo19969c();
    }

    /* renamed from: y */
    protected void mo19993y(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
    }
}
