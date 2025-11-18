package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.dr */
/* loaded from: classes2.dex */
final class C6609dr implements zzdbk<zzdbj> {
    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: a */
    public final zzdcc<zzdbj> mo15077a() {
        return new zzdck();
    }

    @Override // com.google.android.gms.internal.ads.zzdbk
    /* renamed from: b */
    public final zzdbs<zzdbj> mo15078b(String str, String str2, int i2) throws GeneralSecurityException {
        zzdbs<zzdbj> c6942mr;
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("aead")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        switch (str) {
            case "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key":
                c6942mr = new C6942mr();
                break;
            case "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key":
                c6942mr = new C6831jr();
                break;
            case "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey":
                c6942mr = new C6683fr();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsAeadKey":
                c6942mr = new C6868kr();
                break;
            case "type.googleapis.com/google.crypto.tink.AesEaxKey":
                c6942mr = new C6757hr();
                break;
            case "type.googleapis.com/google.crypto.tink.AesGcmKey":
                c6942mr = new C6794ir();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey":
                c6942mr = new C6905lr();
                break;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
        }
        if (c6942mr.mo15142H0() >= i2) {
            return c6942mr;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i2)));
    }
}
