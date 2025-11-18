package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdkw implements zzdbj {

    /* renamed from: a */
    private final zzdlk f25626a;

    /* renamed from: b */
    private final zzdby f25627b;

    /* renamed from: c */
    private final int f25628c;

    public zzdkw(zzdlk zzdlkVar, zzdby zzdbyVar, int i2) {
        this.f25626a = zzdlkVar;
        this.f25627b = zzdbyVar;
        this.f25628c = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public final byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrMo15563a = this.f25626a.mo15563a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzdjs.m19553c(bArrMo15563a, this.f25627b.mo19193a(zzdjs.m19553c(bArr2, bArrMo15563a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
