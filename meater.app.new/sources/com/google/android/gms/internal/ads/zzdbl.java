package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdgy;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdbl {
    /* renamed from: a */
    public static zzdgy m19176a(String str, String str2, String str3, int i2, boolean z) {
        zzdgy.zza zzaVarM19449w = zzdgy.m19428F().m19449w(str2);
        String strValueOf = String.valueOf(str3);
        return (zzdgy) ((zzdob) zzaVarM19449w.m19445A(strValueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(strValueOf) : new String("type.googleapis.com/google.crypto.tink.")).m19448v(0).m19447u(true).m19446B(str).mo19736p0());
    }

    /* renamed from: b */
    public static void m19177b(zzdho zzdhoVar) throws GeneralSecurityException {
        for (zzdgy zzdgyVar : zzdhoVar.m19528A()) {
            if (zzdgyVar.m19440A().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            }
            if (zzdgyVar.m19441B().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            }
            if (zzdgyVar.m19444E().isEmpty()) {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
            zzdbk<?> zzdbkVarM19220o = zzdcf.m19220o(zzdgyVar.m19444E());
            zzdcf.m19217l(zzdbkVarM19220o.mo15077a());
            zzdcf.m19216k(zzdbkVarM19220o.mo15078b(zzdgyVar.m19440A(), zzdgyVar.m19441B(), zzdgyVar.m19442C()), zzdgyVar.m19443D());
        }
    }
}
