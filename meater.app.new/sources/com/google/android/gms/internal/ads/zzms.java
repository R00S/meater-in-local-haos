package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzms extends zzpe implements zzso {

    /* renamed from: V */
    private final zzma f26586V;

    /* renamed from: W */
    private final zzmh f26587W;

    /* renamed from: X */
    private boolean f26588X;

    /* renamed from: Y */
    private boolean f26589Y;

    /* renamed from: Z */
    private MediaFormat f26590Z;

    /* renamed from: a0 */
    private int f26591a0;

    /* renamed from: b0 */
    private int f26592b0;

    /* renamed from: c0 */
    private long f26593c0;

    /* renamed from: d0 */
    private boolean f26594d0;

    public zzms(zzpg zzpgVar) {
        this(zzpgVar, null, true);
    }

    /* renamed from: b0 */
    static /* synthetic */ boolean m20272b0(zzms zzmsVar, boolean z) {
        zzmsVar.f26594d0 = true;
        return true;
    }

    /* renamed from: c0 */
    protected static void m20273c0(int i2) {
    }

    /* renamed from: d0 */
    private final boolean m20274d0(String str) {
        return this.f26587W.m20263l(str);
    }

    /* renamed from: e0 */
    protected static void m20275e0(int i2, long j2, long j3) {
    }

    /* renamed from: f0 */
    protected static void m20276f0() {
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: A */
    protected final void mo20277A(zzlh zzlhVar) throws zzku {
        super.mo20277A(zzlhVar);
        this.f26586V.m20234c(zzlhVar);
        this.f26591a0 = "audio/raw".equals(zzlhVar.f26470k) ? zzlhVar.f26484y : 2;
        this.f26592b0 = zzlhVar.f26482w;
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzlo
    /* renamed from: B */
    public final boolean mo20212B() {
        return this.f26587W.m20267u() || super.mo20212B();
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzlo
    /* renamed from: C */
    public final boolean mo20213C() {
        return super.mo20213C() && this.f26587W.m20265r();
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzlo
    /* renamed from: H */
    public final zzso mo20167H() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: R */
    protected final void mo20278R(String str, long j2, long j3) {
        this.f26586V.m20236e(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: V */
    protected final void mo20279V() throws zzku {
        try {
            this.f26587W.m20269y();
        } catch (zzmp e2) {
            throw zzku.m20192b(e2, m20178g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzso
    /* renamed from: c */
    public final zzln mo20280c(zzln zzlnVar) {
        return this.f26587W.m20264m(zzlnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzso
    /* renamed from: d */
    public final long mo20281d() {
        long jM20268w = this.f26587W.m20268w(mo20213C());
        if (jM20268w != Long.MIN_VALUE) {
            if (!this.f26594d0) {
                jM20268w = Math.max(this.f26593c0, jM20268w);
            }
            this.f26593c0 = jM20268w;
            this.f26594d0 = false;
        }
        return this.f26593c0;
    }

    @Override // com.google.android.gms.internal.ads.zzso
    /* renamed from: e */
    public final zzln mo20282e() {
        return this.f26587W.m20252A();
    }

    @Override // com.google.android.gms.internal.ads.zzks, com.google.android.gms.internal.ads.zzkx
    /* renamed from: f */
    public final void mo20177f(int i2, Object obj) throws IllegalStateException, zzku {
        if (i2 == 2) {
            this.f26587W.m20259g(((Float) obj).floatValue());
        } else if (i2 != 3) {
            super.mo20177f(i2, obj);
        } else {
            this.f26587W.m20258f(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: h */
    protected final void mo20179h() throws IllegalStateException {
        super.mo20179h();
        this.f26587W.m20255c();
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: i */
    protected final void mo20180i() {
        this.f26587W.m20254b();
        super.mo20180i();
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: l */
    protected final void mo20183l(long j2, boolean z) throws IllegalStateException, zzku {
        super.mo20183l(j2, z);
        this.f26587W.m20257e();
        this.f26593c0 = j2;
        this.f26594d0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: n */
    protected final void mo20185n() {
        try {
            this.f26587W.m20256d();
            try {
                super.mo20185n();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo20185n();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe, com.google.android.gms.internal.ads.zzks
    /* renamed from: o */
    protected final void mo20186o(boolean z) throws IllegalStateException, zzku {
        super.mo20186o(z);
        this.f26586V.m20235d(this.f26786U);
        int i2 = m20187p().f26495b;
        if (i2 != 0) {
            this.f26587W.m20262k(i2);
        } else {
            this.f26587W.m20253B();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: r */
    protected final void mo20283r(MediaCodec mediaCodec, MediaFormat mediaFormat) throws IllegalStateException, zzku {
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.f26590Z;
        boolean z = mediaFormat2 != null;
        String string = z ? mediaFormat2.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.f26590Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f26589Y && integer == 6 && (i2 = this.f26592b0) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.f26592b0; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.f26587W.m20260i(string, integer, integer2, this.f26591a0, 0, iArr);
        } catch (zzml e2) {
            throw zzku.m20192b(e2, m20178g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: s */
    protected final int mo20284s(zzpg zzpgVar, zzlh zzlhVar) throws zzpk {
        int i2;
        int i3;
        String str = zzlhVar.f26470k;
        boolean z = false;
        if (!zzsp.m20495b(str)) {
            return 0;
        }
        int i4 = zzsy.f27024a;
        int i5 = i4 >= 21 ? 16 : 0;
        if (m20274d0(str) && zzpgVar.mo15669a() != null) {
            return i5 | 4 | 3;
        }
        zzpd zzpdVarMo15670b = zzpgVar.mo15670b(str, false);
        if (zzpdVarMo15670b == null) {
            return 1;
        }
        if (i4 < 21 || (((i2 = zzlhVar.f26483x) == -1 || zzpdVarMo15670b.m20365e(i2)) && ((i3 = zzlhVar.f26482w) == -1 || zzpdVarMo15670b.m20366f(i3)))) {
            z = true;
        }
        return i5 | 4 | (z ? 3 : 2);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: t */
    protected final zzpd mo20285t(zzpg zzpgVar, zzlh zzlhVar, boolean z) throws zzpk {
        zzpd zzpdVarMo15669a;
        if (!m20274d0(zzlhVar.f26470k) || (zzpdVarMo15669a = zzpgVar.mo15669a()) == null) {
            this.f26588X = false;
            return super.mo20285t(zzpgVar, zzlhVar, z);
        }
        this.f26588X = true;
        return zzpdVarMo15669a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo20286v(com.google.android.gms.internal.ads.zzpd r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzlh r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f26759a
            int r7 = com.google.android.gms.internal.ads.zzsy.f27024a
            r0 = 0
            r1 = 24
            if (r7 >= r1) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzsy.f27026c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzsy.f27025b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L35
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L35
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
        L35:
            r4 = 1
            goto L38
        L37:
            r4 = 0
        L38:
            r3.f26589Y = r4
            boolean r4 = r3.f26588X
            r7 = 0
            if (r4 == 0) goto L59
            android.media.MediaFormat r4 = r6.m20209m()
            r3.f26590Z = r4
            java.lang.String r1 = "mime"
            java.lang.String r2 = "audio/raw"
            r4.setString(r1, r2)
            android.media.MediaFormat r4 = r3.f26590Z
            r5.configure(r4, r7, r7, r0)
            android.media.MediaFormat r4 = r3.f26590Z
            java.lang.String r5 = r6.f26470k
            r4.setString(r1, r5)
            return
        L59:
            android.media.MediaFormat r4 = r6.m20209m()
            r5.configure(r4, r7, r7, r0)
            r3.f26590Z = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzms.mo20286v(com.google.android.gms.internal.ads.zzpd, android.media.MediaCodec, com.google.android.gms.internal.ads.zzlh, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    /* renamed from: x */
    protected final boolean mo20287x(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws zzku {
        if (this.f26588X && (i3 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i2, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f26786U.f26626e++;
            this.f26587W.m20266t();
            return true;
        }
        try {
            if (!this.f26587W.m20261j(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f26786U.f26625d++;
            return true;
        } catch (zzmm | zzmp e2) {
            throw zzku.m20192b(e2, m20178g());
        }
    }

    private zzms(zzpg zzpgVar, zznj<Object> zznjVar, boolean z) {
        this(zzpgVar, null, true, null, null);
    }

    private zzms(zzpg zzpgVar, zznj<Object> zznjVar, boolean z, Handler handler, zzlz zzlzVar) {
        this(zzpgVar, null, true, null, null, null, new zzlx[0]);
    }

    private zzms(zzpg zzpgVar, zznj<Object> zznjVar, boolean z, Handler handler, zzlz zzlzVar, zzlw zzlwVar, zzlx... zzlxVarArr) {
        super(1, zzpgVar, zznjVar, z);
        this.f26587W = new zzmh(null, zzlxVarArr, new g10(this));
        this.f26586V = new zzma(null, null);
    }
}
