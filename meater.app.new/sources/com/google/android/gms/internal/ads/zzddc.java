package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzddc {

    /* renamed from: a */
    @Deprecated
    public static final zzdho f25506a;

    /* renamed from: b */
    @Deprecated
    public static final zzdho f25507b;

    /* renamed from: c */
    public static final zzdho f25508c;

    static {
        zzdho zzdhoVar = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzdcj.f25478a).m19529u(zzdbl.m19176a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).m19529u(zzdbl.m19176a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).m19530v("TINK_HYBRID_1_0_0").mo19736p0());
        f25506a = zzdhoVar;
        f25507b = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzdhoVar).m19530v("TINK_HYBRID_1_1_0").mo19736p0());
        f25508c = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzdcj.f25480c).m19529u(zzdbl.m19176a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).m19529u(zzdbl.m19176a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).m19530v("TINK_HYBRID").mo19736p0());
        try {
            m19227a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* renamed from: a */
    public static void m19227a() throws GeneralSecurityException {
        zzdcj.m19221a();
        zzdcf.m19218m("TinkHybridEncrypt", new C7090qr());
        zzdcf.m19218m("TinkHybridDecrypt", new C7053pr());
        zzdbl.m19177b(f25508c);
    }
}
