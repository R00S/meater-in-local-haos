package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzgn extends zzgr {

    /* renamed from: G */
    private final zzgq f26130G;

    /* renamed from: H */
    private final zzhq f26131H;

    /* renamed from: I */
    private int f26132I;

    /* renamed from: J */
    private long f26133J;

    public zzgn(zzhn zzhnVar, Handler handler, zzgq zzgqVar) {
        this(zzhnVar, null, true, handler, zzgqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: A */
    protected final void mo19980A(zzhj zzhjVar, MediaFormat mediaFormat) throws IllegalStateException {
        if (zzkl.m20138c(zzhjVar.f26191a)) {
            this.f26131H.m20048h(zzhjVar.m20027i(), 0);
        } else {
            this.f26131H.m20048h(mediaFormat, 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: C */
    protected final boolean mo19981C(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2, boolean z) throws IllegalStateException, zzgd {
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f26140b.f26105f++;
            this.f26131H.m20049l();
            return true;
        }
        if (!this.f26131H.m20042a()) {
            try {
                int i3 = this.f26132I;
                if (i3 != 0) {
                    this.f26131H.m20053q(i3);
                } else {
                    this.f26132I = this.f26131H.m20053q(0);
                }
                if (m20031c() == 3) {
                    this.f26131H.m20044c();
                }
            } catch (zzhu e2) {
                Handler handler = this.f26149k;
                if (handler != null && this.f26130G != null) {
                    handler.post(new RunnableC6506az(this, e2));
                }
                throw new zzgd(e2);
            }
        }
        try {
            int iM20047f = this.f26131H.m20047f(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
            if ((iM20047f & 1) != 0) {
                this.f26133J = Long.MIN_VALUE;
            }
            if ((iM20047f & 2) == 0) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.f26140b.f26104e++;
            return true;
        } catch (zzhv e3) {
            Handler handler2 = this.f26149k;
            if (handler2 != null && this.f26130G != null) {
                handler2.post(new RunnableC6543bz(this, e3));
            }
            throw new zzgd(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: E */
    protected final boolean mo19982E(String str) {
        return zzkl.m20137b(str) && super.mo19982E(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: F */
    protected final zzgc mo19983F(String str, boolean z) throws zzgz {
        return zzkl.m20138c(str) ? new zzgc("OMX.google.raw.decoder", true) : super.mo19983F(str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: d */
    protected final boolean mo19984d() {
        if (this.f26131H.m20050m()) {
            return true;
        }
        return super.mo19984d() && m20005M() == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: e */
    protected final void mo19985e() throws IllegalStateException {
        super.mo19985e();
        this.f26131H.m20044c();
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzgf
    /* renamed from: f */
    public final void mo19966f(int i2, Object obj) throws zzgd {
        if (i2 == 1) {
            this.f26131H.m20046e(((Float) obj).floatValue());
        } else {
            super.mo19966f(i2, obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: g */
    protected final void mo19986g() throws IllegalStateException {
        this.f26131H.m20043b();
        super.mo19986g();
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: i */
    protected final void mo19987i(long j2) throws IllegalStateException, zzgd {
        super.mo19987i(j2);
        this.f26131H.m20045d();
        this.f26133J = Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: m */
    protected final void mo19988m(long j2, boolean z) {
        super.mo19988m(j2, z);
        this.f26133J = Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    /* renamed from: r */
    protected final boolean mo19989r() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: s */
    protected final boolean mo19990s() {
        if (super.mo19990s()) {
            return (this.f26131H.m20050m() && this.f26131H.m20051n()) ? false : true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: t */
    protected final long mo19991t() {
        long jM20052p = this.f26131H.m20052p(mo19990s());
        if (jM20052p == Long.MIN_VALUE) {
            this.f26133J = Math.max(this.f26133J, super.mo19991t());
        } else {
            this.f26133J = Math.max(this.f26133J, jM20052p);
        }
        return this.f26133J;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzhp
    /* renamed from: u */
    protected final void mo19992u() {
        this.f26132I = 0;
        try {
            this.f26131H.m20045d();
        } finally {
            super.mo19992u();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    /* renamed from: y */
    protected final void mo19993y(MediaCodec mediaCodec, String str, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        if (!"OMX.google.raw.decoder".equals(str)) {
            mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
            return;
        }
        String string = mediaFormat.getString("mime");
        mediaFormat.setString("mime", "audio/raw");
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
        mediaFormat.setString("mime", string);
    }

    private zzgn(zzhn zzhnVar, zzhz zzhzVar, boolean z, Handler handler, zzgq zzgqVar) {
        super(zzhnVar, null, true, handler, zzgqVar);
        this.f26130G = zzgqVar;
        this.f26132I = 0;
        this.f26131H = new zzhq();
    }
}
