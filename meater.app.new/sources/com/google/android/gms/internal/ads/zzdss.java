package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class zzdss extends zzdsu implements zzbd {

    /* renamed from: o */
    private zzbe f25950o;

    /* renamed from: p */
    private String f25951p;

    /* renamed from: q */
    private boolean f25952q;

    /* renamed from: r */
    private long f25953r;

    public zzdss(String str) {
        this.f25951p = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    /* renamed from: b */
    public final void mo17466b(zzdsw zzdswVar, ByteBuffer byteBuffer, long j2, zzba zzbaVar) throws IOException {
        this.f25953r = zzdswVar.mo15979k0() - byteBuffer.remaining();
        this.f25952q = byteBuffer.remaining() == 16;
        mo19853d(zzdswVar, j2, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    /* renamed from: c */
    public final void mo17467c(zzbe zzbeVar) {
        this.f25950o = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsu
    /* renamed from: d */
    public final void mo19853d(zzdsw zzdswVar, long j2, zzba zzbaVar) throws IOException {
        this.f25959i = zzdswVar;
        long jMo15979k0 = zzdswVar.mo15979k0();
        this.f25961k = jMo15979k0;
        this.f25962l = jMo15979k0 - ((this.f25952q || 8 + j2 >= 4294967296L) ? 16 : 8);
        zzdswVar.mo15978d1(zzdswVar.mo15979k0() + j2);
        this.f25963m = zzdswVar.mo15979k0();
        this.f25958h = zzbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbd
    public final String getType() {
        return this.f25951p;
    }
}
