package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qr */
/* loaded from: classes2.dex */
final class C7090qr implements zzdbk<zzdbq> {
    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: a */
    public final zzdcc<zzdbq> mo15077a() {
        return new zzddg();
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: b */
    public final zzdbs<zzdbq> mo15078b(String str, String str2, int i2) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("hybridencrypt")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", str));
        }
        C7016or c7016or = new C7016or();
        if (i2 <= 0) {
            return c7016or;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
    }
}
