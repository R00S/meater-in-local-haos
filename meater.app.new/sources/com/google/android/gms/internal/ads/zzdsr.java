package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzdsr implements zzbd {

    /* renamed from: f */
    private static zzdtc f25939f = zzdtc.m19860b(zzdsr.class);

    /* renamed from: g */
    private String f25940g;

    /* renamed from: h */
    private zzbe f25941h;

    /* renamed from: k */
    private ByteBuffer f25944k;

    /* renamed from: l */
    private long f25945l;

    /* renamed from: m */
    private long f25946m;

    /* renamed from: o */
    private zzdsw f25948o;

    /* renamed from: n */
    private long f25947n = -1;

    /* renamed from: p */
    private ByteBuffer f25949p = null;

    /* renamed from: j */
    private boolean f25943j = true;

    /* renamed from: i */
    boolean f25942i = true;

    protected zzdsr(String str) {
        this.f25940g = str;
    }

    /* renamed from: a */
    private final synchronized void m19851a() {
        if (!this.f25943j) {
            try {
                zzdtc zzdtcVar = f25939f;
                String strValueOf = String.valueOf(this.f25940g);
                zzdtcVar.mo19858a(strValueOf.length() != 0 ? "mem mapping ".concat(strValueOf) : new String("mem mapping "));
                this.f25944k = this.f25948o.mo15980r(this.f25945l, this.f25947n);
                this.f25943j = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    /* renamed from: b */
    public final void mo17466b(zzdsw zzdswVar, ByteBuffer byteBuffer, long j2, zzba zzbaVar) throws IOException {
        long jMo15979k0 = zzdswVar.mo15979k0();
        this.f25945l = jMo15979k0;
        this.f25946m = jMo15979k0 - byteBuffer.remaining();
        this.f25947n = j2;
        this.f25948o = zzdswVar;
        zzdswVar.mo15978d1(zzdswVar.mo15979k0() + j2);
        this.f25943j = false;
        this.f25942i = false;
        m19852d();
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    /* renamed from: c */
    public final void mo17467c(zzbe zzbeVar) {
        this.f25941h = zzbeVar;
    }

    /* renamed from: d */
    public final synchronized void m19852d() {
        m19851a();
        zzdtc zzdtcVar = f25939f;
        String strValueOf = String.valueOf(this.f25940g);
        zzdtcVar.mo19858a(strValueOf.length() != 0 ? "parsing details of ".concat(strValueOf) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f25944k;
        if (byteBuffer != null) {
            this.f25942i = true;
            byteBuffer.rewind();
            mo15239e(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f25949p = byteBuffer.slice();
            }
            this.f25944k = null;
        }
    }

    /* renamed from: e */
    protected abstract void mo15239e(ByteBuffer byteBuffer);

    @Override // com.google.android.gms.internal.ads.zzbd
    public final String getType() {
        return this.f25940g;
    }
}
