package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.xr */
/* loaded from: classes2.dex */
final class C7349xr implements zzdbk<zzdby> {
    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: a */
    public final zzdcc<zzdby> mo15077a() {
        return new zzddp();
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: b */
    public final zzdbs<zzdby> mo15078b(String str, String str2, int i2) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("mac")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", str));
        }
        C7275vr c7275vr = new C7275vr();
        if (i2 <= 0) {
            return c7275vr;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
    }
}
