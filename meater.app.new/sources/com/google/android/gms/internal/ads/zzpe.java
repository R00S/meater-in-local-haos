package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes2.dex */
public abstract class zzpe extends zzks {

    /* renamed from: i */
    private static final byte[] f26765i = zzsy.m20550n("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private boolean f26766A;

    /* renamed from: B */
    private boolean f26767B;

    /* renamed from: C */
    private boolean f26768C;

    /* renamed from: D */
    private boolean f26769D;

    /* renamed from: E */
    private boolean f26770E;

    /* renamed from: F */
    private ByteBuffer[] f26771F;

    /* renamed from: G */
    private ByteBuffer[] f26772G;

    /* renamed from: H */
    private long f26773H;

    /* renamed from: I */
    private int f26774I;

    /* renamed from: J */
    private int f26775J;

    /* renamed from: K */
    private boolean f26776K;

    /* renamed from: L */
    private boolean f26777L;

    /* renamed from: M */
    private int f26778M;

    /* renamed from: N */
    private int f26779N;

    /* renamed from: O */
    private boolean f26780O;

    /* renamed from: P */
    private boolean f26781P;

    /* renamed from: Q */
    private boolean f26782Q;

    /* renamed from: R */
    private boolean f26783R;

    /* renamed from: S */
    private boolean f26784S;

    /* renamed from: T */
    private boolean f26785T;

    /* renamed from: U */
    protected zznc f26786U;

    /* renamed from: j */
    private final zzpg f26787j;

    /* renamed from: k */
    private final zznj<Object> f26788k;

    /* renamed from: l */
    private final boolean f26789l;

    /* renamed from: m */
    private final zznd f26790m;

    /* renamed from: n */
    private final zznd f26791n;

    /* renamed from: o */
    private final zzlj f26792o;

    /* renamed from: p */
    private final List<Long> f26793p;

    /* renamed from: q */
    private final MediaCodec.BufferInfo f26794q;

    /* renamed from: r */
    private zzlh f26795r;

    /* renamed from: s */
    private zznh<Object> f26796s;

    /* renamed from: t */
    private zznh<Object> f26797t;

    /* renamed from: u */
    private MediaCodec f26798u;

    /* renamed from: v */
    private zzpd f26799v;

    /* renamed from: w */
    private boolean f26800w;

    /* renamed from: x */
    private boolean f26801x;

    /* renamed from: y */
    private boolean f26802y;

    /* renamed from: z */
    private boolean f26803z;

    public zzpe(int i2, zzpg zzpgVar, zznj<Object> zznjVar, boolean z) {
        super(i2);
        zzsk.m20481e(zzsy.f27024a >= 16);
        this.f26787j = (zzpg) zzsk.m20480d(zzpgVar);
        this.f26788k = zznjVar;
        this.f26789l = z;
        this.f26790m = new zznd(0);
        this.f26791n = new zznd(0);
        this.f26792o = new zzlj();
        this.f26793p = new ArrayList();
        this.f26794q = new MediaCodec.BufferInfo();
        this.f26778M = 0;
        this.f26779N = 0;
    }

    /* renamed from: S */
    private final boolean m20369S(long j2, long j3) throws zzku {
        boolean zMo20287x;
        boolean z;
        if (this.f26775J < 0) {
            if (this.f26767B && this.f26781P) {
                try {
                    this.f26775J = this.f26798u.dequeueOutputBuffer(this.f26794q, 0L);
                } catch (IllegalStateException unused) {
                    m20371Z();
                    if (this.f26783R) {
                        mo20374U();
                    }
                    return false;
                }
            } else {
                this.f26775J = this.f26798u.dequeueOutputBuffer(this.f26794q, 0L);
            }
            int i2 = this.f26775J;
            if (i2 < 0) {
                if (i2 != -2) {
                    if (i2 == -3) {
                        this.f26772G = this.f26798u.getOutputBuffers();
                        return true;
                    }
                    if (this.f26803z && (this.f26782Q || this.f26779N == 2)) {
                        m20371Z();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.f26798u.getOutputFormat();
                if (this.f26802y && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f26770E = true;
                } else {
                    if (this.f26768C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    mo20283r(this.f26798u, outputFormat);
                }
                return true;
            }
            if (this.f26770E) {
                this.f26770E = false;
                this.f26798u.releaseOutputBuffer(i2, false);
                this.f26775J = -1;
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f26794q;
            if ((bufferInfo.flags & 4) != 0) {
                m20371Z();
                this.f26775J = -1;
                return false;
            }
            ByteBuffer byteBuffer = this.f26772G[i2];
            if (byteBuffer != null) {
                byteBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.f26794q;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j4 = this.f26794q.presentationTimeUs;
            int size = this.f26793p.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (this.f26793p.get(i3).longValue() == j4) {
                    this.f26793p.remove(i3);
                    z = true;
                    break;
                }
                i3++;
            }
            this.f26776K = z;
        }
        if (this.f26767B && this.f26781P) {
            try {
                MediaCodec mediaCodec = this.f26798u;
                ByteBuffer[] byteBufferArr = this.f26772G;
                int i4 = this.f26775J;
                ByteBuffer byteBuffer2 = byteBufferArr[i4];
                MediaCodec.BufferInfo bufferInfo3 = this.f26794q;
                zMo20287x = mo20287x(j2, j3, mediaCodec, byteBuffer2, i4, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f26776K);
            } catch (IllegalStateException unused2) {
                m20371Z();
                if (this.f26783R) {
                    mo20374U();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.f26798u;
            ByteBuffer[] byteBufferArr2 = this.f26772G;
            int i5 = this.f26775J;
            ByteBuffer byteBuffer3 = byteBufferArr2[i5];
            MediaCodec.BufferInfo bufferInfo4 = this.f26794q;
            zMo20287x = mo20287x(j2, j3, mediaCodec2, byteBuffer3, i5, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f26776K);
        }
        if (!zMo20287x) {
            return false;
        }
        long j5 = this.f26794q.presentationTimeUs;
        this.f26775J = -1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m20370Y() throws android.media.MediaCodec.CryptoException, com.google.android.gms.internal.ads.zzku {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.m20370Y():boolean");
    }

    /* renamed from: Z */
    private final void m20371Z() throws zzku {
        if (this.f26779N == 2) {
            mo20374U();
            m20373T();
        } else {
            this.f26783R = true;
            mo20279V();
        }
    }

    /* renamed from: w */
    private final void m20372w(zzpf zzpfVar) throws zzku {
        throw zzku.m20192b(zzpfVar, m20178g());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo20277A(com.google.android.gms.internal.ads.zzlh r5) throws com.google.android.gms.internal.ads.zzku {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzlh r0 = r4.f26795r
            r4.f26795r = r5
            com.google.android.gms.internal.ads.zzne r5 = r5.f26473n
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.google.android.gms.internal.ads.zzne r2 = r0.f26473n
        Ld:
            boolean r5 = com.google.android.gms.internal.ads.zzsy.m20543g(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L49
            com.google.android.gms.internal.ads.zzlh r5 = r4.f26795r
            com.google.android.gms.internal.ads.zzne r5 = r5.f26473n
            if (r5 == 0) goto L47
            com.google.android.gms.internal.ads.zznj<java.lang.Object> r5 = r4.f26788k
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzlh r3 = r4.f26795r
            com.google.android.gms.internal.ads.zzne r3 = r3.f26473n
            com.google.android.gms.internal.ads.zznh r5 = r5.m20311a(r1, r3)
            r4.f26797t = r5
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r1 = r4.f26796s
            if (r5 != r1) goto L49
            com.google.android.gms.internal.ads.zznj<java.lang.Object> r1 = r4.f26788k
            r1.m20312b(r5)
            goto L49
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.m20178g()
            com.google.android.gms.internal.ads.zzku r5 = com.google.android.gms.internal.ads.zzku.m20192b(r5, r0)
            throw r5
        L47:
            r4.f26797t = r1
        L49:
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r5 = r4.f26797t
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r1 = r4.f26796s
            if (r5 != r1) goto L7a
            android.media.MediaCodec r5 = r4.f26798u
            if (r5 == 0) goto L7a
            com.google.android.gms.internal.ads.zzpd r1 = r4.f26799v
            boolean r1 = r1.f26760b
            com.google.android.gms.internal.ads.zzlh r3 = r4.f26795r
            boolean r5 = r4.mo20378y(r5, r1, r0, r3)
            if (r5 == 0) goto L7a
            r4.f26777L = r2
            r4.f26778M = r2
            boolean r5 = r4.f26802y
            if (r5 == 0) goto L76
            com.google.android.gms.internal.ads.zzlh r5 = r4.f26795r
            int r1 = r5.f26474o
            int r3 = r0.f26474o
            if (r1 != r3) goto L76
            int r5 = r5.f26475p
            int r0 = r0.f26475p
            if (r5 != r0) goto L76
            goto L77
        L76:
            r2 = 0
        L77:
            r4.f26769D = r2
            return
        L7a:
            boolean r5 = r4.f26780O
            if (r5 == 0) goto L81
            r4.f26779N = r2
            return
        L81:
            r4.mo20374U()
            r4.m20373T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.mo20277A(com.google.android.gms.internal.ads.zzlh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: B */
    public boolean mo20212B() {
        if (this.f26795r == null || this.f26784S) {
            return false;
        }
        if (m20188q() || this.f26775J >= 0) {
            return true;
        }
        return this.f26773H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f26773H;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: C */
    public boolean mo20213C() {
        return this.f26783R;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    /* renamed from: O */
    public final void mo20214O(long j2, long j3) throws zzku {
        if (this.f26783R) {
            mo20279V();
            return;
        }
        if (this.f26795r == null) {
            this.f26791n.mo20292a();
            int iM20181j = m20181j(this.f26792o, this.f26791n, true);
            if (iM20181j != -5) {
                if (iM20181j == -4) {
                    zzsk.m20481e(this.f26791n.m20297f());
                    this.f26782Q = true;
                    m20371Z();
                    return;
                }
                return;
            }
            mo20277A(this.f26792o.f26486a);
        }
        m20373T();
        if (this.f26798u != null) {
            zzsx.m20535a("drainAndFeed");
            while (m20369S(j2, j3)) {
            }
            while (m20370Y()) {
            }
            zzsx.m20536b();
        } else {
            m20184m(j2);
            this.f26791n.mo20292a();
            int iM20181j2 = m20181j(this.f26792o, this.f26791n, false);
            if (iM20181j2 == -5) {
                mo20277A(this.f26792o.f26486a);
            } else if (iM20181j2 == -4) {
                zzsk.m20481e(this.f26791n.m20297f());
                this.f26782Q = true;
                m20371Z();
            }
        }
        this.f26786U.m20303a();
    }

    /* renamed from: R */
    protected void mo20278R(String str, long j2, long j3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m20373T() throws com.google.android.gms.internal.ads.zzku {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.m20373T():void");
    }

    /* renamed from: U */
    protected void mo20374U() {
        this.f26773H = -9223372036854775807L;
        this.f26774I = -1;
        this.f26775J = -1;
        this.f26784S = false;
        this.f26776K = false;
        this.f26793p.clear();
        this.f26771F = null;
        this.f26772G = null;
        this.f26799v = null;
        this.f26777L = false;
        this.f26780O = false;
        this.f26800w = false;
        this.f26801x = false;
        this.f26802y = false;
        this.f26803z = false;
        this.f26766A = false;
        this.f26768C = false;
        this.f26769D = false;
        this.f26770E = false;
        this.f26781P = false;
        this.f26778M = 0;
        this.f26779N = 0;
        this.f26790m.f26630c = null;
        MediaCodec mediaCodec = this.f26798u;
        if (mediaCodec != null) {
            this.f26786U.f26623b++;
            try {
                mediaCodec.stop();
                try {
                    this.f26798u.release();
                    this.f26798u = null;
                    zznh<Object> zznhVar = this.f26796s;
                    if (zznhVar == null || this.f26797t == zznhVar) {
                        return;
                    }
                    try {
                        this.f26788k.m20312b(zznhVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f26798u = null;
                    zznh<Object> zznhVar2 = this.f26796s;
                    if (zznhVar2 != null && this.f26797t != zznhVar2) {
                        try {
                            this.f26788k.m20312b(zznhVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f26798u.release();
                    this.f26798u = null;
                    zznh<Object> zznhVar3 = this.f26796s;
                    if (zznhVar3 != null && this.f26797t != zznhVar3) {
                        try {
                            this.f26788k.m20312b(zznhVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.f26798u = null;
                    zznh<Object> zznhVar4 = this.f26796s;
                    if (zznhVar4 != null && this.f26797t != zznhVar4) {
                        try {
                            this.f26788k.m20312b(zznhVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    /* renamed from: V */
    protected void mo20279V() throws zzku {
    }

    /* renamed from: W */
    protected final MediaCodec m20375W() {
        return this.f26798u;
    }

    /* renamed from: X */
    protected final zzpd m20376X() {
        return this.f26799v;
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzlp
    /* renamed from: a */
    public final int mo20176a() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    /* renamed from: b */
    public final int mo20215b(zzlh zzlhVar) throws zzku {
        try {
            return mo20284s(this.f26787j, zzlhVar);
        } catch (zzpk e2) {
            throw zzku.m20192b(e2, m20178g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    /* renamed from: h */
    protected void mo20179h() {
    }

    @Override // com.google.android.gms.internal.ads.zzks
    /* renamed from: i */
    protected void mo20180i() {
    }

    @Override // com.google.android.gms.internal.ads.zzks
    /* renamed from: l */
    protected void mo20183l(long j2, boolean z) throws zzku {
        this.f26782Q = false;
        this.f26783R = false;
        if (this.f26798u != null) {
            this.f26773H = -9223372036854775807L;
            this.f26774I = -1;
            this.f26775J = -1;
            this.f26785T = true;
            this.f26784S = false;
            this.f26776K = false;
            this.f26793p.clear();
            this.f26769D = false;
            this.f26770E = false;
            if (this.f26801x || ((this.f26766A && this.f26781P) || this.f26779N != 0)) {
                mo20374U();
                m20373T();
            } else {
                this.f26798u.flush();
                this.f26780O = false;
            }
            if (!this.f26777L || this.f26795r == null) {
                return;
            }
            this.f26778M = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    /* renamed from: n */
    protected void mo20185n() {
        this.f26795r = null;
        try {
            mo20374U();
            try {
                zznh<Object> zznhVar = this.f26796s;
                if (zznhVar != null) {
                    this.f26788k.m20312b(zznhVar);
                }
                try {
                    zznh<Object> zznhVar2 = this.f26797t;
                    if (zznhVar2 != null && zznhVar2 != this.f26796s) {
                        this.f26788k.m20312b(zznhVar2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    zznh<Object> zznhVar3 = this.f26797t;
                    if (zznhVar3 != null && zznhVar3 != this.f26796s) {
                        this.f26788k.m20312b(zznhVar3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f26796s != null) {
                    this.f26788k.m20312b(this.f26796s);
                }
                try {
                    zznh<Object> zznhVar4 = this.f26797t;
                    if (zznhVar4 != null && zznhVar4 != this.f26796s) {
                        this.f26788k.m20312b(zznhVar4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    zznh<Object> zznhVar5 = this.f26797t;
                    if (zznhVar5 != null && zznhVar5 != this.f26796s) {
                        this.f26788k.m20312b(zznhVar5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    /* renamed from: o */
    protected void mo20186o(boolean z) throws zzku {
        this.f26786U = new zznc();
    }

    /* renamed from: r */
    protected void mo20283r(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzku {
    }

    /* renamed from: s */
    protected abstract int mo20284s(zzpg zzpgVar, zzlh zzlhVar) throws zzpk;

    /* renamed from: t */
    protected zzpd mo20285t(zzpg zzpgVar, zzlh zzlhVar, boolean z) throws zzpk {
        return zzpgVar.mo15670b(zzlhVar.f26470k, z);
    }

    /* renamed from: u */
    protected void mo20377u(zznd zzndVar) {
    }

    /* renamed from: v */
    protected abstract void mo20286v(zzpd zzpdVar, MediaCodec mediaCodec, zzlh zzlhVar, MediaCrypto mediaCrypto) throws zzpk;

    /* renamed from: x */
    protected abstract boolean mo20287x(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws zzku;

    /* renamed from: y */
    protected boolean mo20378y(MediaCodec mediaCodec, boolean z, zzlh zzlhVar, zzlh zzlhVar2) {
        return false;
    }

    /* renamed from: z */
    protected boolean mo20379z(zzpd zzpdVar) {
        return true;
    }
}
