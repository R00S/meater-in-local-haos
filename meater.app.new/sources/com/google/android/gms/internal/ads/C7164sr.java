package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.sr */
/* loaded from: classes2.dex */
final class C7164sr {
    /* renamed from: a */
    public static zzdkt m15848a(zzdgf zzdgfVar) throws GeneralSecurityException {
        int i2 = C7201tr.f20581b[zzdgfVar.ordinal()];
        if (i2 == 1) {
            return zzdkt.NIST_P256;
        }
        if (i2 == 2) {
            return zzdkt.NIST_P384;
        }
        if (i2 == 3) {
            return zzdkt.NIST_P521;
        }
        String strValueOf = String.valueOf(zzdgfVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
        sb.append("unknown curve type: ");
        sb.append(strValueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: b */
    public static zzdkv m15849b(zzdfd zzdfdVar) throws GeneralSecurityException {
        int i2 = C7201tr.f20582c[zzdfdVar.ordinal()];
        if (i2 == 1) {
            return zzdkv.UNCOMPRESSED;
        }
        if (i2 == 2) {
            return zzdkv.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i2 == 3) {
            return zzdkv.COMPRESSED;
        }
        String strValueOf = String.valueOf(zzdfdVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("unknown point format: ");
        sb.append(strValueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: c */
    public static String m15850c(zzdgj zzdgjVar) throws NoSuchAlgorithmException {
        int i2 = C7201tr.f20580a[zzdgjVar.ordinal()];
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha256";
        }
        if (i2 == 3) {
            return "HmacSha512";
        }
        String strValueOf = String.valueOf(zzdgjVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(strValueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: d */
    public static void m15851d(zzdft zzdftVar) throws GeneralSecurityException {
        zzdkr.m19562e(m15848a(zzdftVar.m19334x().m19375y()));
        m15850c(zzdftVar.m19334x().m19374x());
        if (zzdftVar.m19336z() == zzdfd.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzdcf.m19209d(zzdftVar.m19335y().m19328x());
    }
}
