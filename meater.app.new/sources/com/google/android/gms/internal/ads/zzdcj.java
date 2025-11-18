package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdcj {

    /* renamed from: a */
    @Deprecated
    public static final zzdho f25478a;

    /* renamed from: b */
    @Deprecated
    private static final zzdho f25479b;

    /* renamed from: c */
    public static final zzdho f25480c;

    static {
        zzdho zzdhoVar = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzddo.f25511a).m19529u(zzdbl.m19176a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "AesEaxKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "AesGcmKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "KmsAeadKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).m19530v("TINK_AEAD_1_0_0").mo19736p0());
        f25478a = zzdhoVar;
        f25479b = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzdhoVar).m19530v("TINK_AEAD_1_1_0").mo19736p0());
        f25480c = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzddo.f25513c).m19529u(zzdbl.m19176a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "AesEaxKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "AesGcmKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "KmsAeadKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).m19529u(zzdbl.m19176a("TinkAead", "Aead", "XChaCha20Poly1305Key", 0, true)).m19530v("TINK_AEAD").mo19736p0());
        try {
            m19221a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* renamed from: a */
    public static void m19221a() throws GeneralSecurityException {
        zzddo.m19228a();
        zzdcf.m19218m("TinkAead", new C6609dr());
        zzdbl.m19177b(f25480c);
    }
}
