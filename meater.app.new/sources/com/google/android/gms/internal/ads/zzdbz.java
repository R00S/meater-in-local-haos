package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdha;
import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes2.dex */
public final class zzdbz {
    /* renamed from: a */
    private static void m19194a(zzdha zzdhaVar) throws GeneralSecurityException {
        for (zzdha.zzb zzbVar : zzdhaVar.m19460y()) {
            if (zzbVar.m19467z().m19418D() == zzdgr.zzb.UNKNOWN_KEYMATERIAL || zzbVar.m19467z().m19418D() == zzdgr.zzb.SYMMETRIC || zzbVar.m19467z().m19418D() == zzdgr.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("keyset contains secret key material");
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static final zzdbu m19195b(byte[] bArr) throws GeneralSecurityException {
        try {
            zzdha zzdhaVarM19458B = zzdha.m19458B(bArr);
            m19194a(zzdhaVarM19458B);
            return zzdbu.m19188a(zzdhaVarM19458B);
        } catch (zzdok unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
