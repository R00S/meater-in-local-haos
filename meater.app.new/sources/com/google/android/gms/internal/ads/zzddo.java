package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzddo {

    /* renamed from: a */
    @Deprecated
    public static final zzdho f25511a;

    /* renamed from: b */
    @Deprecated
    private static final zzdho f25512b;

    /* renamed from: c */
    public static final zzdho f25513c;

    static {
        zzdho zzdhoVar = (zzdho) ((zzdob) zzdho.m19522B().m19530v("TINK_MAC_1_0_0").m19529u(zzdbl.m19176a("TinkMac", "Mac", "HmacKey", 0, true)).mo19736p0());
        f25511a = zzdhoVar;
        f25512b = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzdhoVar).m19530v("TINK_MAC_1_1_0").mo19736p0());
        f25513c = (zzdho) ((zzdob) zzdho.m19522B().mo19590j(zzdhoVar).m19530v("TINK_MAC").mo19736p0());
        try {
            m19228a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* renamed from: a */
    public static void m19228a() throws GeneralSecurityException {
        zzdcf.m19218m("TinkMac", new C7349xr());
        zzdbl.m19177b(f25513c);
    }
}
