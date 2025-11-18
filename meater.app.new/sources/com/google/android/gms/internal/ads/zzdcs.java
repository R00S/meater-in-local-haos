package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdcs implements zzdbj {

    /* renamed from: a */
    private static final byte[] f25483a = new byte[0];

    /* renamed from: b */
    private final zzdgw f25484b;

    /* renamed from: c */
    private final zzdbj f25485c;

    public zzdcs(zzdgw zzdgwVar, zzdbj zzdbjVar) {
        this.f25484b = zzdgwVar;
        this.f25485c = zzdbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public final byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrMo19587g = zzdcf.m19219n(this.f25484b).mo19587g();
        byte[] bArrMo15598a = this.f25485c.mo15598a(bArrMo19587g, f25483a);
        byte[] bArrMo15598a2 = ((zzdbj) zzdcf.m19214i(this.f25484b.m19426x(), bArrMo19587g, zzdbj.class)).mo15598a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo15598a.length + 4 + bArrMo15598a2.length).putInt(bArrMo15598a.length).put(bArrMo15598a).put(bArrMo15598a2).array();
    }
}
