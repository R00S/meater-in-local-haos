package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgr;
import com.google.android.gms.internal.ads.zzdha;
import com.google.android.gms.internal.ads.zzdhc;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cr */
/* loaded from: classes2.dex */
final class C6572cr {

    /* renamed from: a */
    private static final Charset f18465a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static zzdhc m14984a(zzdha zzdhaVar) {
        zzdhc.zza zzaVarM19475v = zzdhc.m19468A().m19475v(zzdhaVar.m19459x());
        for (zzdha.zzb zzbVar : zzdhaVar.m19460y()) {
            zzaVarM19475v.m19474u((zzdhc.zzb) ((zzdob) zzdhc.zzb.m19479D().m19486A(zzbVar.m19467z().m19416B()).m19487u(zzbVar.m19463A()).m19488v(zzbVar.m19465x()).m19489w(zzbVar.m19464B()).mo19736p0()));
        }
        return (zzdhc) ((zzdob) zzaVarM19475v.mo19736p0());
    }

    /* renamed from: b */
    public static void m14985b(zzdha zzdhaVar) throws GeneralSecurityException {
        int iM19459x = zzdhaVar.m19459x();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzdha.zzb zzbVar : zzdhaVar.m19460y()) {
            if (zzbVar.m19463A() != zzdgu.DESTROYED) {
                i2++;
                if (!zzbVar.m19466y()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.m19464B())));
                }
                if (zzbVar.m19465x() == zzdhm.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.m19464B())));
                }
                if (zzbVar.m19463A() == zzdgu.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.m19464B())));
                }
                if (zzbVar.m19463A() == zzdgu.ENABLED && zzbVar.m19464B() == iM19459x) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzbVar.m19467z().m19418D() != zzdgr.zzb.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
