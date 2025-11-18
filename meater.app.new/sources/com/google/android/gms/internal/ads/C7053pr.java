package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.pr */
/* loaded from: classes2.dex */
final class C7053pr implements zzdbk<zzdbp> {
    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: a */
    public final zzdcc<zzdbp> mo15077a() {
        return new zzdde();
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: b */
    public final zzdbs<zzdbp> mo15078b(String str, String str2, int i2) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("hybriddecrypt")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", str));
        }
        C6979nr c6979nr = new C6979nr();
        if (i2 <= 0) {
            return c6979nr;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
    }
}
